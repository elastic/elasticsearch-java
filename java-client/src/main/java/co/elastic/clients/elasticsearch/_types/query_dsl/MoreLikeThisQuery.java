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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MoreLikeThisQuery
public final class MoreLikeThisQuery extends QueryBase {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Number boostTerms;

	@Nullable
	private final Boolean failOnUnsupportedField;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean include;

	private final List<JsonValue> like;

	@Nullable
	private final Number maxDocFreq;

	@Nullable
	private final Number maxQueryTerms;

	@Nullable
	private final Number maxWordLength;

	@Nullable
	private final Number minDocFreq;

	@Nullable
	private final JsonValue minimumShouldMatch;

	@Nullable
	private final Number minTermFreq;

	@Nullable
	private final Number minWordLength;

	@Nullable
	private final Map<String, String> perFieldAnalyzer;

	@Nullable
	private final String routing;

	@Nullable
	private final List<String> stopWords;

	@Nullable
	private final List<JsonValue> unlike;

	@Nullable
	private final Number version;

	@Nullable
	private final JsonValue versionType;

	// ---------------------------------------------------------------------------------------------

	protected MoreLikeThisQuery(Builder builder) {
		super(builder);
		this.analyzer = builder.analyzer;
		this.boostTerms = builder.boostTerms;
		this.failOnUnsupportedField = builder.failOnUnsupportedField;
		this.fields = builder.fields;
		this.include = builder.include;
		this.like = Objects.requireNonNull(builder.like, "like");
		this.maxDocFreq = builder.maxDocFreq;
		this.maxQueryTerms = builder.maxQueryTerms;
		this.maxWordLength = builder.maxWordLength;
		this.minDocFreq = builder.minDocFreq;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.minTermFreq = builder.minTermFreq;
		this.minWordLength = builder.minWordLength;
		this.perFieldAnalyzer = builder.perFieldAnalyzer;
		this.routing = builder.routing;
		this.stopWords = builder.stopWords;
		this.unlike = builder.unlike;
		this.version = builder.version;
		this.versionType = builder.versionType;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code boost_terms}
	 */
	@Nullable
	public Number boostTerms() {
		return this.boostTerms;
	}

	/**
	 * API name: {@code fail_on_unsupported_field}
	 */
	@Nullable
	public Boolean failOnUnsupportedField() {
		return this.failOnUnsupportedField;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code include}
	 */
	@Nullable
	public Boolean include() {
		return this.include;
	}

	/**
	 * API name: {@code like}
	 */
	public List<JsonValue> like() {
		return this.like;
	}

	/**
	 * API name: {@code max_doc_freq}
	 */
	@Nullable
	public Number maxDocFreq() {
		return this.maxDocFreq;
	}

	/**
	 * API name: {@code max_query_terms}
	 */
	@Nullable
	public Number maxQueryTerms() {
		return this.maxQueryTerms;
	}

	/**
	 * API name: {@code max_word_length}
	 */
	@Nullable
	public Number maxWordLength() {
		return this.maxWordLength;
	}

	/**
	 * API name: {@code min_doc_freq}
	 */
	@Nullable
	public Number minDocFreq() {
		return this.minDocFreq;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public JsonValue minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code min_term_freq}
	 */
	@Nullable
	public Number minTermFreq() {
		return this.minTermFreq;
	}

	/**
	 * API name: {@code min_word_length}
	 */
	@Nullable
	public Number minWordLength() {
		return this.minWordLength;
	}

	/**
	 * API name: {@code per_field_analyzer}
	 */
	@Nullable
	public Map<String, String> perFieldAnalyzer() {
		return this.perFieldAnalyzer;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code stop_words}
	 */
	@Nullable
	public List<String> stopWords() {
		return this.stopWords;
	}

	/**
	 * API name: {@code unlike}
	 */
	@Nullable
	public List<JsonValue> unlike() {
		return this.unlike;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public JsonValue versionType() {
		return this.versionType;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.boostTerms != null) {

			generator.writeKey("boost_terms");
			generator.write(this.boostTerms.doubleValue());

		}
		if (this.failOnUnsupportedField != null) {

			generator.writeKey("fail_on_unsupported_field");
			generator.write(this.failOnUnsupportedField);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.include != null) {

			generator.writeKey("include");
			generator.write(this.include);

		}

		generator.writeKey("like");
		generator.writeStartArray();
		for (JsonValue item0 : this.like) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.maxDocFreq != null) {

			generator.writeKey("max_doc_freq");
			generator.write(this.maxDocFreq.doubleValue());

		}
		if (this.maxQueryTerms != null) {

			generator.writeKey("max_query_terms");
			generator.write(this.maxQueryTerms.doubleValue());

		}
		if (this.maxWordLength != null) {

			generator.writeKey("max_word_length");
			generator.write(this.maxWordLength.doubleValue());

		}
		if (this.minDocFreq != null) {

			generator.writeKey("min_doc_freq");
			generator.write(this.minDocFreq.doubleValue());

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.minTermFreq != null) {

			generator.writeKey("min_term_freq");
			generator.write(this.minTermFreq.doubleValue());

		}
		if (this.minWordLength != null) {

			generator.writeKey("min_word_length");
			generator.write(this.minWordLength.doubleValue());

		}
		if (this.perFieldAnalyzer != null) {

			generator.writeKey("per_field_analyzer");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.perFieldAnalyzer.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.stopWords != null) {

			generator.writeKey("stop_words");
			generator.writeStartArray();
			for (String item0 : this.stopWords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.unlike != null) {

			generator.writeKey("unlike");
			generator.writeStartArray();
			for (JsonValue item0 : this.unlike) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this.versionType != null) {

			generator.writeKey("version_type");
			generator.write(this.versionType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MoreLikeThisQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MoreLikeThisQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private Number boostTerms;

		@Nullable
		private Boolean failOnUnsupportedField;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean include;

		private List<JsonValue> like;

		@Nullable
		private Number maxDocFreq;

		@Nullable
		private Number maxQueryTerms;

		@Nullable
		private Number maxWordLength;

		@Nullable
		private Number minDocFreq;

		@Nullable
		private JsonValue minimumShouldMatch;

		@Nullable
		private Number minTermFreq;

		@Nullable
		private Number minWordLength;

		@Nullable
		private Map<String, String> perFieldAnalyzer;

		@Nullable
		private String routing;

		@Nullable
		private List<String> stopWords;

		@Nullable
		private List<JsonValue> unlike;

		@Nullable
		private Number version;

		@Nullable
		private JsonValue versionType;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code boost_terms}
		 */
		public Builder boostTerms(@Nullable Number value) {
			this.boostTerms = value;
			return this;
		}

		/**
		 * API name: {@code fail_on_unsupported_field}
		 */
		public Builder failOnUnsupportedField(@Nullable Boolean value) {
			this.failOnUnsupportedField = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(@Nullable Boolean value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code like}
		 */
		public Builder like(List<JsonValue> value) {
			this.like = value;
			return this;
		}

		/**
		 * API name: {@code like}
		 */
		public Builder like(JsonValue... value) {
			this.like = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #like(List)}, creating the list if needed.
		 */
		public Builder addLike(JsonValue value) {
			if (this.like == null) {
				this.like = new ArrayList<>();
			}
			this.like.add(value);
			return this;
		}

		/**
		 * API name: {@code max_doc_freq}
		 */
		public Builder maxDocFreq(@Nullable Number value) {
			this.maxDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code max_query_terms}
		 */
		public Builder maxQueryTerms(@Nullable Number value) {
			this.maxQueryTerms = value;
			return this;
		}

		/**
		 * API name: {@code max_word_length}
		 */
		public Builder maxWordLength(@Nullable Number value) {
			this.maxWordLength = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_freq}
		 */
		public Builder minDocFreq(@Nullable Number value) {
			this.minDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable JsonValue value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code min_term_freq}
		 */
		public Builder minTermFreq(@Nullable Number value) {
			this.minTermFreq = value;
			return this;
		}

		/**
		 * API name: {@code min_word_length}
		 */
		public Builder minWordLength(@Nullable Number value) {
			this.minWordLength = value;
			return this;
		}

		/**
		 * API name: {@code per_field_analyzer}
		 */
		public Builder perFieldAnalyzer(@Nullable Map<String, String> value) {
			this.perFieldAnalyzer = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #perFieldAnalyzer(Map)}, creating the map if
		 * needed.
		 */
		public Builder putPerFieldAnalyzer(String key, String value) {
			if (this.perFieldAnalyzer == null) {
				this.perFieldAnalyzer = new HashMap<>();
			}
			this.perFieldAnalyzer.put(key, value);
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code stop_words}
		 */
		public Builder stopWords(@Nullable List<String> value) {
			this.stopWords = value;
			return this;
		}

		/**
		 * API name: {@code stop_words}
		 */
		public Builder stopWords(String... value) {
			this.stopWords = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stopWords(List)}, creating the list if needed.
		 */
		public Builder addStopWords(String value) {
			if (this.stopWords == null) {
				this.stopWords = new ArrayList<>();
			}
			this.stopWords.add(value);
			return this;
		}

		/**
		 * API name: {@code unlike}
		 */
		public Builder unlike(@Nullable List<JsonValue> value) {
			this.unlike = value;
			return this;
		}

		/**
		 * API name: {@code unlike}
		 */
		public Builder unlike(JsonValue... value) {
			this.unlike = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #unlike(List)}, creating the list if needed.
		 */
		public Builder addUnlike(JsonValue value) {
			if (this.unlike == null) {
				this.unlike = new ArrayList<>();
			}
			this.unlike.add(value);
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(@Nullable JsonValue value) {
			this.versionType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MoreLikeThisQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MoreLikeThisQuery build() {

			return new MoreLikeThisQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MoreLikeThisQuery
	 */
	public static final JsonpDeserializer<MoreLikeThisQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MoreLikeThisQuery::setupMoreLikeThisQueryDeserializer);

	protected static void setupMoreLikeThisQueryDeserializer(DelegatingDeserializer<MoreLikeThisQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::boostTerms, JsonpDeserializer.numberDeserializer(), "boost_terms");
		op.add(Builder::failOnUnsupportedField, JsonpDeserializer.booleanDeserializer(), "fail_on_unsupported_field");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::include, JsonpDeserializer.booleanDeserializer(), "include");
		op.add(Builder::like, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "like");
		op.add(Builder::maxDocFreq, JsonpDeserializer.numberDeserializer(), "max_doc_freq");
		op.add(Builder::maxQueryTerms, JsonpDeserializer.numberDeserializer(), "max_query_terms");
		op.add(Builder::maxWordLength, JsonpDeserializer.numberDeserializer(), "max_word_length");
		op.add(Builder::minDocFreq, JsonpDeserializer.numberDeserializer(), "min_doc_freq");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.jsonValueDeserializer(), "minimum_should_match");
		op.add(Builder::minTermFreq, JsonpDeserializer.numberDeserializer(), "min_term_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.numberDeserializer(), "min_word_length");
		op.add(Builder::perFieldAnalyzer,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "per_field_analyzer");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::stopWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stop_words");
		op.add(Builder::unlike, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"unlike");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::versionType, JsonpDeserializer.jsonValueDeserializer(), "version_type");

	}

}
