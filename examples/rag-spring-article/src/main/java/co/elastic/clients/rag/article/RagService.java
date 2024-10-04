/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package co.elastic.clients.rag.article;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.pdf.PDFParserConfig;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.ElasticsearchVectorStore;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RagService {

    private ElasticsearchVectorStore vectorStore;
    private ChatModel chatModel;

    @Autowired
    public RagService(ElasticsearchVectorStore vectorStore, ChatModel model) {
        this.vectorStore = vectorStore;
        this.chatModel = model;
    }

    public void ingestPDF(String path) throws IOException, TikaException, SAXException {
        // Initializing the PDF parser
        // Keep in mind that AutoDetectParser is not thread safe
        Parser parser = new AutoDetectParser();
        // Using our custom single page handler class
        PageContentHandler handler = new PageContentHandler();

        // No need for any other specific PDF configuration
        ParseContext parseContext = new ParseContext();
        parseContext.set(PDFParserConfig.class, new PDFParserConfig());

        // The metadata contain information such as creation date, creation tool used, etc... which we
        // don't need
        Metadata metadata = new Metadata();

        // Reading the file
        try (FileInputStream stream = new FileInputStream(path)) {
            parser.parse(stream, handler, metadata, parseContext);
        }

        // Getting the result as a list of Strings with the content of the pages
        List<String> allPages = handler.getPages();
        List<Document> docbatch = new ArrayList<>();

        // Converting pages to Documents
        for (int i = 0; i < allPages.size(); i++) {
            Map<String, Object> docMetadata = new HashMap<>();
            // The page number will be used in the response
            docMetadata.put("page", i + 1);

            Document doc = new Document(allPages.get(i), docMetadata);
            docbatch.add(doc);
        }

        // Sending batch of documents to vector store
        // applying tokenizer
        docbatch = new TokenTextSplitter().apply(docbatch);
        vectorStore.doAdd(docbatch);
    }

    public String queryLLM(String question) {

        // Querying the vector store for documents related to the question
        List<Document> vectorStoreResult =
            vectorStore.doSimilaritySearch(SearchRequest.query(question).withTopK(5).withSimilarityThreshold(0.0));

        // Merging the documents into a single string
        String documents = vectorStoreResult.stream()
            .map(Document::getContent)
            .collect(Collectors.joining(System.lineSeparator()));

        // Setting the prompt
        String basePrompt = """
            You're assisting with providing the rules of the tabletop game Runewars.
            Use the information from the DOCUMENTS section to provide accurate answers.
            If unsure, simply state that you don't know.
            
            DOCUMENTS:
            {documents}
            """;

        // Preparing the question for the LLM
        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(basePrompt);
        Message systemMessage = systemPromptTemplate.createMessage(Map.of("documents", documents));

        UserMessage userMessage = new UserMessage(question);

        Prompt prompt = new Prompt(List.of(systemMessage, userMessage));
        // Calling the chat model with the question
        ChatResponse response = chatModel.call(prompt);

        return response.getResult().getOutput().getContent() +
            System.lineSeparator() +
            "Found at page: " +
            // Retrieving the first ranked page number from the document metadata
            vectorStoreResult.get(0).getMetadata().get("page") +
            " of the manual";
    }
}
