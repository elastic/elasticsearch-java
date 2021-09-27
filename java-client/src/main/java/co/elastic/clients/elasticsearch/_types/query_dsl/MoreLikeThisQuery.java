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

import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MoreLikeThisQuery
@JsonpDeserializable
public final class MoreLikeThisQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Double boostTerms;

	@Nullable
	private final Boolean failOnUnsupportedField;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final Boolean include;

	private final List<LikeDocument> like;

	@Nullable
	private final Integer maxDocFreq;

	@Nullable
	private final Integer maxQueryTerms;

	@Nullable
	private final Integer maxWordLength;

	@Nullable
	private final Integer minDocFreq;

	@Nullable
	private final String minimumShouldMatch;

	@Nullable
	private final Integer minTermFreq;

	@Nullable
	private final Integer minWordLength;

	@Nullable
	private final Map<String, String> perFieldAnalyzer;

	@Nullable
	private final String routing;

	@Nullable
	private final List<String> stopWords;

	@Nullable
	private final List<LikeDocument> unlike;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	// ---------------------------------------------------------------------------------------------

	public MoreLikeThisQuery(Builder builder) {
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
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "more_like_this";
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
	public Double boostTerms() {
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
	public List<LikeDocument> like() {
		return this.like;
	}

	/**
	 * API name: {@code max_doc_freq}
	 */
	@Nullable
	public Integer maxDocFreq() {
		return this.maxDocFreq;
	}

	/**
	 * API name: {@code max_query_terms}
	 */
	@Nullable
	public Integer maxQueryTerms() {
		return this.maxQueryTerms;
	}

	/**
	 * API name: {@code max_word_length}
	 */
	@Nullable
	public Integer maxWordLength() {
		return this.maxWordLength;
	}

	/**
	 * API name: {@code min_doc_freq}
	 */
	@Nullable
	public Integer minDocFreq() {
		return this.minDocFreq;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code min_term_freq}
	 */
	@Nullable
	public Integer minTermFreq() {
		return this.minTermFreq;
	}

	/**
	 * API name: {@code min_word_length}
	 */
	@Nullable
	public Integer minWordLength() {
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
	public List<LikeDocument> unlike() {
		return this.unlike;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code version_type}
	 */
	@Nullable
	public VersionType versionType() {
		return this.versionType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.boostTerms != null) {

			generator.writeKey("boost_terms");
			generator.write(this.boostTerms);

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
		for (LikeDocument item0 : this.like) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.maxDocFreq != null) {

			generator.writeKey("max_doc_freq");
			generator.write(this.maxDocFreq);

		}
		if (this.maxQueryTerms != null) {

			generator.writeKey("max_query_terms");
			generator.write(this.maxQueryTerms);

		}
		if (this.maxWordLength != null) {

			generator.writeKey("max_word_length");
			generator.write(this.maxWordLength);

		}
		if (this.minDocFreq != null) {

			generator.writeKey("min_doc_freq");
			generator.write(this.minDocFreq);

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.minTermFreq != null) {

			generator.writeKey("min_term_freq");
			generator.write(this.minTermFreq);

		}
		if (this.minWordLength != null) {

			generator.writeKey("min_word_length");
			generator.write(this.minWordLength);

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
			for (LikeDocument item0 : this.unlike) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionType != null) {

			generator.writeKey("version_type");
			this.versionType.serialize(generator, mapper);
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
		private Double boostTerms;

		@Nullable
		private Boolean failOnUnsupportedField;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean include;

		private List<LikeDocument> like;

		@Nullable
		private Integer maxDocFreq;

		@Nullable
		private Integer maxQueryTerms;

		@Nullable
		private Integer maxWordLength;

		@Nullable
		private Integer minDocFreq;

		@Nullable
		private String minimumShouldMatch;

		@Nullable
		private Integer minTermFreq;

		@Nullable
		private Integer minWordLength;

		@Nullable
		private Map<String, String> perFieldAnalyzer;

		@Nullable
		private String routing;

		@Nullable
		private List<String> stopWords;

		@Nullable
		private List<LikeDocument> unlike;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

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
		public Builder boostTerms(@Nullable Double value) {
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
		public Builder like(List<LikeDocument> value) {
			this.like = value;
			return this;
		}

		/**
		 * API name: {@code like}
		 */
		public Builder like(LikeDocument... value) {
			this.like = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #like(List)}, creating the list if needed.
		 */
		public Builder addLike(LikeDocument value) {
			if (this.like == null) {
				this.like = new ArrayList<>();
			}
			this.like.add(value);
			return this;
		}

		/**
		 * Set {@link #like(List)} to a singleton list.
		 */
		public Builder like(Function<LikeDocument.Builder, ObjectBuilder<LikeDocument>> fn) {
			return this.like(fn.apply(new LikeDocument.Builder()).build());
		}

		/**
		 * Add a value to {@link #like(List)}, creating the list if needed.
		 */
		public Builder addLike(Function<LikeDocument.Builder, ObjectBuilder<LikeDocument>> fn) {
			return this.addLike(fn.apply(new LikeDocument.Builder()).build());
		}

		/**
		 * API name: {@code max_doc_freq}
		 */
		public Builder maxDocFreq(@Nullable Integer value) {
			this.maxDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code max_query_terms}
		 */
		public Builder maxQueryTerms(@Nullable Integer value) {
			this.maxQueryTerms = value;
			return this;
		}

		/**
		 * API name: {@code max_word_length}
		 */
		public Builder maxWordLength(@Nullable Integer value) {
			this.maxWordLength = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_freq}
		 */
		public Builder minDocFreq(@Nullable Integer value) {
			this.minDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code min_term_freq}
		 */
		public Builder minTermFreq(@Nullable Integer value) {
			this.minTermFreq = value;
			return this;
		}

		/**
		 * API name: {@code min_word_length}
		 */
		public Builder minWordLength(@Nullable Integer value) {
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
		public Builder unlike(@Nullable List<LikeDocument> value) {
			this.unlike = value;
			return this;
		}

		/**
		 * API name: {@code unlike}
		 */
		public Builder unlike(LikeDocument... value) {
			this.unlike = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #unlike(List)}, creating the list if needed.
		 */
		public Builder addUnlike(LikeDocument value) {
			if (this.unlike == null) {
				this.unlike = new ArrayList<>();
			}
			this.unlike.add(value);
			return this;
		}

		/**
		 * Set {@link #unlike(List)} to a singleton list.
		 */
		public Builder unlike(Function<LikeDocument.Builder, ObjectBuilder<LikeDocument>> fn) {
			return this.unlike(fn.apply(new LikeDocument.Builder()).build());
		}

		/**
		 * Add a value to {@link #unlike(List)}, creating the list if needed.
		 */
		public Builder addUnlike(Function<LikeDocument.Builder, ObjectBuilder<LikeDocument>> fn) {
			return this.addUnlike(fn.apply(new LikeDocument.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_type}
		 */
		public Builder versionType(@Nullable VersionType value) {
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
	 * Json deserializer for {@link MoreLikeThisQuery}
	 */
	public static final JsonpDeserializer<MoreLikeThisQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MoreLikeThisQuery::setupMoreLikeThisQueryDeserializer, Builder::build);

	protected static void setupMoreLikeThisQueryDeserializer(DelegatingDeserializer<MoreLikeThisQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::boostTerms, JsonpDeserializer.doubleDeserializer(), "boost_terms");
		op.add(Builder::failOnUnsupportedField, JsonpDeserializer.booleanDeserializer(), "fail_on_unsupported_field");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::include, JsonpDeserializer.booleanDeserializer(), "include");
		op.add(Builder::like, JsonpDeserializer.arrayDeserializer(LikeDocument._DESERIALIZER), "like");
		op.add(Builder::maxDocFreq, JsonpDeserializer.integerDeserializer(), "max_doc_freq");
		op.add(Builder::maxQueryTerms, JsonpDeserializer.integerDeserializer(), "max_query_terms");
		op.add(Builder::maxWordLength, JsonpDeserializer.integerDeserializer(), "max_word_length");
		op.add(Builder::minDocFreq, JsonpDeserializer.integerDeserializer(), "min_doc_freq");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::minTermFreq, JsonpDeserializer.integerDeserializer(), "min_term_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.integerDeserializer(), "min_word_length");
		op.add(Builder::perFieldAnalyzer,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "per_field_analyzer");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::stopWords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stop_words");
		op.add(Builder::unlike, JsonpDeserializer.arrayDeserializer(LikeDocument._DESERIALIZER), "unlike");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::versionType, VersionType._DESERIALIZER, "version_type");

	}

}
