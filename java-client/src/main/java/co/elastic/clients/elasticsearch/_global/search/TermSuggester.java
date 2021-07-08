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

package co.elastic.clients.elasticsearch._global.search;

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
import javax.annotation.Nullable;

// typedef: _global.search._types.TermSuggester
public final class TermSuggester extends SuggesterBase {
	@Nullable
	private final Boolean lowercaseTerms;

	@Nullable
	private final Number maxEdits;

	@Nullable
	private final Number maxInspections;

	@Nullable
	private final Number maxTermFreq;

	@Nullable
	private final Number minDocFreq;

	@Nullable
	private final Number minWordLength;

	@Nullable
	private final Number prefixLength;

	@Nullable
	private final Number shardSize;

	@Nullable
	private final JsonValue sort;

	@Nullable
	private final JsonValue stringDistance;

	@Nullable
	private final JsonValue suggestMode;

	@Nullable
	private final String text;

	// ---------------------------------------------------------------------------------------------

	protected TermSuggester(Builder builder) {
		super(builder);
		this.lowercaseTerms = builder.lowercaseTerms;
		this.maxEdits = builder.maxEdits;
		this.maxInspections = builder.maxInspections;
		this.maxTermFreq = builder.maxTermFreq;
		this.minDocFreq = builder.minDocFreq;
		this.minWordLength = builder.minWordLength;
		this.prefixLength = builder.prefixLength;
		this.shardSize = builder.shardSize;
		this.sort = builder.sort;
		this.stringDistance = builder.stringDistance;
		this.suggestMode = builder.suggestMode;
		this.text = builder.text;

	}

	/**
	 * API name: {@code lowercase_terms}
	 */
	@Nullable
	public Boolean lowercaseTerms() {
		return this.lowercaseTerms;
	}

	/**
	 * API name: {@code max_edits}
	 */
	@Nullable
	public Number maxEdits() {
		return this.maxEdits;
	}

	/**
	 * API name: {@code max_inspections}
	 */
	@Nullable
	public Number maxInspections() {
		return this.maxInspections;
	}

	/**
	 * API name: {@code max_term_freq}
	 */
	@Nullable
	public Number maxTermFreq() {
		return this.maxTermFreq;
	}

	/**
	 * API name: {@code min_doc_freq}
	 */
	@Nullable
	public Number minDocFreq() {
		return this.minDocFreq;
	}

	/**
	 * API name: {@code min_word_length}
	 */
	@Nullable
	public Number minWordLength() {
		return this.minWordLength;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public Number prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code shard_size}
	 */
	@Nullable
	public Number shardSize() {
		return this.shardSize;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public JsonValue sort() {
		return this.sort;
	}

	/**
	 * API name: {@code string_distance}
	 */
	@Nullable
	public JsonValue stringDistance() {
		return this.stringDistance;
	}

	/**
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public JsonValue suggestMode() {
		return this.suggestMode;
	}

	/**
	 * API name: {@code text}
	 */
	@Nullable
	public String text() {
		return this.text;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.lowercaseTerms != null) {

			generator.writeKey("lowercase_terms");
			generator.write(this.lowercaseTerms);

		}
		if (this.maxEdits != null) {

			generator.writeKey("max_edits");
			generator.write(this.maxEdits.doubleValue());

		}
		if (this.maxInspections != null) {

			generator.writeKey("max_inspections");
			generator.write(this.maxInspections.doubleValue());

		}
		if (this.maxTermFreq != null) {

			generator.writeKey("max_term_freq");
			generator.write(this.maxTermFreq.doubleValue());

		}
		if (this.minDocFreq != null) {

			generator.writeKey("min_doc_freq");
			generator.write(this.minDocFreq.doubleValue());

		}
		if (this.minWordLength != null) {

			generator.writeKey("min_word_length");
			generator.write(this.minWordLength.doubleValue());

		}
		if (this.prefixLength != null) {

			generator.writeKey("prefix_length");
			generator.write(this.prefixLength.doubleValue());

		}
		if (this.shardSize != null) {

			generator.writeKey("shard_size");
			generator.write(this.shardSize.doubleValue());

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.stringDistance != null) {

			generator.writeKey("string_distance");
			generator.write(this.stringDistance);

		}
		if (this.suggestMode != null) {

			generator.writeKey("suggest_mode");
			generator.write(this.suggestMode);

		}
		if (this.text != null) {

			generator.writeKey("text");
			generator.write(this.text);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermSuggester}.
	 */
	public static class Builder extends SuggesterBase.AbstractBuilder<Builder> implements ObjectBuilder<TermSuggester> {
		@Nullable
		private Boolean lowercaseTerms;

		@Nullable
		private Number maxEdits;

		@Nullable
		private Number maxInspections;

		@Nullable
		private Number maxTermFreq;

		@Nullable
		private Number minDocFreq;

		@Nullable
		private Number minWordLength;

		@Nullable
		private Number prefixLength;

		@Nullable
		private Number shardSize;

		@Nullable
		private JsonValue sort;

		@Nullable
		private JsonValue stringDistance;

		@Nullable
		private JsonValue suggestMode;

		@Nullable
		private String text;

		/**
		 * API name: {@code lowercase_terms}
		 */
		public Builder lowercaseTerms(@Nullable Boolean value) {
			this.lowercaseTerms = value;
			return this;
		}

		/**
		 * API name: {@code max_edits}
		 */
		public Builder maxEdits(@Nullable Number value) {
			this.maxEdits = value;
			return this;
		}

		/**
		 * API name: {@code max_inspections}
		 */
		public Builder maxInspections(@Nullable Number value) {
			this.maxInspections = value;
			return this;
		}

		/**
		 * API name: {@code max_term_freq}
		 */
		public Builder maxTermFreq(@Nullable Number value) {
			this.maxTermFreq = value;
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
		 * API name: {@code min_word_length}
		 */
		public Builder minWordLength(@Nullable Number value) {
			this.minWordLength = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(@Nullable Number value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * API name: {@code shard_size}
		 */
		public Builder shardSize(@Nullable Number value) {
			this.shardSize = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable JsonValue value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code string_distance}
		 */
		public Builder stringDistance(@Nullable JsonValue value) {
			this.stringDistance = value;
			return this;
		}

		/**
		 * API name: {@code suggest_mode}
		 */
		public Builder suggestMode(@Nullable JsonValue value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(@Nullable String value) {
			this.text = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermSuggester build() {

			return new TermSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TermSuggester
	 */
	public static final JsonpDeserializer<TermSuggester> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TermSuggester::setupTermSuggesterDeserializer);

	protected static void setupTermSuggesterDeserializer(DelegatingDeserializer<TermSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::lowercaseTerms, JsonpDeserializer.booleanDeserializer(), "lowercase_terms");
		op.add(Builder::maxEdits, JsonpDeserializer.numberDeserializer(), "max_edits");
		op.add(Builder::maxInspections, JsonpDeserializer.numberDeserializer(), "max_inspections");
		op.add(Builder::maxTermFreq, JsonpDeserializer.numberDeserializer(), "max_term_freq");
		op.add(Builder::minDocFreq, JsonpDeserializer.numberDeserializer(), "min_doc_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.numberDeserializer(), "min_word_length");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::shardSize, JsonpDeserializer.numberDeserializer(), "shard_size");
		op.add(Builder::sort, JsonpDeserializer.jsonValueDeserializer(), "sort");
		op.add(Builder::stringDistance, JsonpDeserializer.jsonValueDeserializer(), "string_distance");
		op.add(Builder::suggestMode, JsonpDeserializer.jsonValueDeserializer(), "suggest_mode");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");

	}

}
