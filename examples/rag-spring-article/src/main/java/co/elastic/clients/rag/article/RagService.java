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

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.document.Document;
import org.springframework.ai.reader.pdf.PagePdfDocumentReader;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.ElasticsearchVectorStore;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RagService {

    // Both beans autowired from default configuration
    private ElasticsearchVectorStore vectorStore;
    private ChatClient chatClient;

    public RagService(ElasticsearchVectorStore vectorStore, ChatClient.Builder clientBuilder) {
        this.vectorStore = vectorStore;
        this.chatClient = clientBuilder.build();
    }

    public void ingestPDF(String path) {

        // Spring AI utility class to read a PDF file page by page
        PagePdfDocumentReader pdfReader = new PagePdfDocumentReader(path);
        List<Document> docbatch = pdfReader.read();

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

        // Setting the prompt with the context
        String prompt = """
            You're assisting with providing the rules of the tabletop game Runewars.
            Use the information from the DOCUMENTS section to provide accurate answers to the
            question in the QUESTION section. 
            If unsure, simply state that you don't know.
            
            DOCUMENTS:
            """ + documents
            + """
            QUESTION:
            """ + question;


        // Calling the chat model with the question
        String response = chatClient.prompt()
            .user(prompt)
            .call()
            .content();

        return response +
            System.lineSeparator() +
            "Found at page: " +
            // Retrieving the first ranked page number from the document metadata
            vectorStoreResult.get(0).getMetadata().get(PagePdfDocumentReader.METADATA_START_PAGE_NUMBER) +
            " of the manual";
    }
}
