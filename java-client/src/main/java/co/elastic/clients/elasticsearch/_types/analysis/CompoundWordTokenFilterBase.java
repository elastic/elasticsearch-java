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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.CompoundWordTokenFilterBase

public abstract class CompoundWordTokenFilterBase extends TokenFilterBase {
	private final String hyphenationPatternsPath;

	private final int maxSubwordSize;

	private final int minSubwordSize;

	private final int minWordSize;

	private final boolean onlyLongestMatch;

	private final List<String> wordList;

	private final String wordListPath;

	// ---------------------------------------------------------------------------------------------

	public CompoundWordTokenFilterBase(AbstractBuilder<?> builder) {
		super(builder);

		this.hyphenationPatternsPath = Objects.requireNonNull(builder.hyphenationPatternsPath,
				"hyphenation_patterns_path");
		this.maxSubwordSize = Objects.requireNonNull(builder.maxSubwordSize, "max_subword_size");
		this.minSubwordSize = Objects.requireNonNull(builder.minSubwordSize, "min_subword_size");
		this.minWordSize = Objects.requireNonNull(builder.minWordSize, "min_word_size");
		this.onlyLongestMatch = Objects.requireNonNull(builder.onlyLongestMatch, "only_longest_match");
		this.wordList = ModelTypeHelper.unmodifiableNonNull(builder.wordList, "word_list");
		this.wordListPath = Objects.requireNonNull(builder.wordListPath, "word_list_path");

	}

	/**
	 * API name: {@code hyphenation_patterns_path}
	 */
	public String hyphenationPatternsPath() {
		return this.hyphenationPatternsPath;
	}

	/**
	 * API name: {@code max_subword_size}
	 */
	public int maxSubwordSize() {
		return this.maxSubwordSize;
	}

	/**
	 * API name: {@code min_subword_size}
	 */
	public int minSubwordSize() {
		return this.minSubwordSize;
	}

	/**
	 * API name: {@code min_word_size}
	 */
	public int minWordSize() {
		return this.minWordSize;
	}

	/**
	 * API name: {@code only_longest_match}
	 */
	public boolean onlyLongestMatch() {
		return this.onlyLongestMatch;
	}

	/**
	 * API name: {@code word_list}
	 */
	public List<String> wordList() {
		return this.wordList;
	}

	/**
	 * API name: {@code word_list_path}
	 */
	public String wordListPath() {
		return this.wordListPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("hyphenation_patterns_path");
		generator.write(this.hyphenationPatternsPath);

		generator.writeKey("max_subword_size");
		generator.write(this.maxSubwordSize);

		generator.writeKey("min_subword_size");
		generator.write(this.minSubwordSize);

		generator.writeKey("min_word_size");
		generator.write(this.minWordSize);

		generator.writeKey("only_longest_match");
		generator.write(this.onlyLongestMatch);

		generator.writeKey("word_list");
		generator.writeStartArray();
		for (String item0 : this.wordList) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("word_list_path");
		generator.write(this.wordListPath);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				TokenFilterBase.AbstractBuilder<BuilderT> {
		private String hyphenationPatternsPath;

		private Integer maxSubwordSize;

		private Integer minSubwordSize;

		private Integer minWordSize;

		private Boolean onlyLongestMatch;

		private List<String> wordList;

		private String wordListPath;

		/**
		 * API name: {@code hyphenation_patterns_path}
		 */
		public BuilderT hyphenationPatternsPath(String value) {
			this.hyphenationPatternsPath = value;
			return self();
		}

		/**
		 * API name: {@code max_subword_size}
		 */
		public BuilderT maxSubwordSize(int value) {
			this.maxSubwordSize = value;
			return self();
		}

		/**
		 * API name: {@code min_subword_size}
		 */
		public BuilderT minSubwordSize(int value) {
			this.minSubwordSize = value;
			return self();
		}

		/**
		 * API name: {@code min_word_size}
		 */
		public BuilderT minWordSize(int value) {
			this.minWordSize = value;
			return self();
		}

		/**
		 * API name: {@code only_longest_match}
		 */
		public BuilderT onlyLongestMatch(boolean value) {
			this.onlyLongestMatch = value;
			return self();
		}

		/**
		 * API name: {@code word_list}
		 */
		public BuilderT wordList(List<String> value) {
			this.wordList = value;
			return self();
		}

		/**
		 * API name: {@code word_list}
		 */
		public BuilderT wordList(String... value) {
			this.wordList = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #wordList(List)}, creating the list if needed. 4
		 */
		public BuilderT addWordList(String value) {
			if (this.wordList == null) {
				this.wordList = new ArrayList<>();
			}
			this.wordList.add(value);
			return self();
		}

		/**
		 * API name: {@code word_list_path}
		 */
		public BuilderT wordListPath(String value) {
			this.wordListPath = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupCompoundWordTokenFilterBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(AbstractBuilder::hyphenationPatternsPath, JsonpDeserializer.stringDeserializer(),
				"hyphenation_patterns_path");
		op.add(AbstractBuilder::maxSubwordSize, JsonpDeserializer.integerDeserializer(), "max_subword_size");
		op.add(AbstractBuilder::minSubwordSize, JsonpDeserializer.integerDeserializer(), "min_subword_size");
		op.add(AbstractBuilder::minWordSize, JsonpDeserializer.integerDeserializer(), "min_word_size");
		op.add(AbstractBuilder::onlyLongestMatch, JsonpDeserializer.booleanDeserializer(), "only_longest_match");
		op.add(AbstractBuilder::wordList, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"word_list");
		op.add(AbstractBuilder::wordListPath, JsonpDeserializer.stringDeserializer(), "word_list_path");

	}

}
