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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.elasticsearch._types.SuggestMode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.DirectGenerator
public final class DirectGenerator implements JsonpSerializable {
	private final String field;

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
	private final String postFilter;

	@Nullable
	private final String preFilter;

	@Nullable
	private final Number prefixLength;

	@Nullable
	private final Number size;

	@Nullable
	private final SuggestMode suggestMode;

	// ---------------------------------------------------------------------------------------------

	public DirectGenerator(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.maxEdits = builder.maxEdits;
		this.maxInspections = builder.maxInspections;
		this.maxTermFreq = builder.maxTermFreq;
		this.minDocFreq = builder.minDocFreq;
		this.minWordLength = builder.minWordLength;
		this.postFilter = builder.postFilter;
		this.preFilter = builder.preFilter;
		this.prefixLength = builder.prefixLength;
		this.size = builder.size;
		this.suggestMode = builder.suggestMode;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
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
	 * API name: {@code post_filter}
	 */
	@Nullable
	public String postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code pre_filter}
	 */
	@Nullable
	public String preFilter() {
		return this.preFilter;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public Number prefixLength() {
		return this.prefixLength;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public SuggestMode suggestMode() {
		return this.suggestMode;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("field");
		generator.write(this.field);

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
		if (this.postFilter != null) {

			generator.writeKey("post_filter");
			generator.write(this.postFilter);

		}
		if (this.preFilter != null) {

			generator.writeKey("pre_filter");
			generator.write(this.preFilter);

		}
		if (this.prefixLength != null) {

			generator.writeKey("prefix_length");
			generator.write(this.prefixLength.doubleValue());

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.suggestMode != null) {

			generator.writeKey("suggest_mode");
			this.suggestMode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DirectGenerator}.
	 */
	public static class Builder implements ObjectBuilder<DirectGenerator> {
		private String field;

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
		private String postFilter;

		@Nullable
		private String preFilter;

		@Nullable
		private Number prefixLength;

		@Nullable
		private Number size;

		@Nullable
		private SuggestMode suggestMode;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
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
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(@Nullable String value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code pre_filter}
		 */
		public Builder preFilter(@Nullable String value) {
			this.preFilter = value;
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
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code suggest_mode}
		 */
		public Builder suggestMode(@Nullable SuggestMode value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * Builds a {@link DirectGenerator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DirectGenerator build() {

			return new DirectGenerator(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DirectGenerator}
	 */
	public static final JsonpDeserializer<DirectGenerator> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DirectGenerator::setupDirectGeneratorDeserializer);

	protected static void setupDirectGeneratorDeserializer(DelegatingDeserializer<DirectGenerator.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxEdits, JsonpDeserializer.numberDeserializer(), "max_edits");
		op.add(Builder::maxInspections, JsonpDeserializer.numberDeserializer(), "max_inspections");
		op.add(Builder::maxTermFreq, JsonpDeserializer.numberDeserializer(), "max_term_freq");
		op.add(Builder::minDocFreq, JsonpDeserializer.numberDeserializer(), "min_doc_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.numberDeserializer(), "min_word_length");
		op.add(Builder::postFilter, JsonpDeserializer.stringDeserializer(), "post_filter");
		op.add(Builder::preFilter, JsonpDeserializer.stringDeserializer(), "pre_filter");
		op.add(Builder::prefixLength, JsonpDeserializer.numberDeserializer(), "prefix_length");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::suggestMode, SuggestMode.DESERIALIZER, "suggest_mode");

	}

}
