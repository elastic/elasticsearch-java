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

package co.elastic.clients.elasticsearch._global.termvectors;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _global.termvectors.Filter
public final class Filter implements ToJsonp {
	@Nullable
	private final Number maxDocFreq;

	@Nullable
	private final Number maxNumTerms;

	@Nullable
	private final Number maxTermFreq;

	@Nullable
	private final Number maxWordLength;

	@Nullable
	private final Number minDocFreq;

	@Nullable
	private final Number minTermFreq;

	@Nullable
	private final Number minWordLength;

	// ---------------------------------------------------------------------------------------------

	protected Filter(Builder builder) {

		this.maxDocFreq = builder.maxDocFreq;
		this.maxNumTerms = builder.maxNumTerms;
		this.maxTermFreq = builder.maxTermFreq;
		this.maxWordLength = builder.maxWordLength;
		this.minDocFreq = builder.minDocFreq;
		this.minTermFreq = builder.minTermFreq;
		this.minWordLength = builder.minWordLength;

	}

	/**
	 * API name: {@code max_doc_freq}
	 */
	@Nullable
	public Number maxDocFreq() {
		return this.maxDocFreq;
	}

	/**
	 * API name: {@code max_num_terms}
	 */
	@Nullable
	public Number maxNumTerms() {
		return this.maxNumTerms;
	}

	/**
	 * API name: {@code max_term_freq}
	 */
	@Nullable
	public Number maxTermFreq() {
		return this.maxTermFreq;
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
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.maxDocFreq != null) {

			generator.writeKey("max_doc_freq");
			generator.write(this.maxDocFreq.doubleValue());

		}
		if (this.maxNumTerms != null) {

			generator.writeKey("max_num_terms");
			generator.write(this.maxNumTerms.doubleValue());

		}
		if (this.maxTermFreq != null) {

			generator.writeKey("max_term_freq");
			generator.write(this.maxTermFreq.doubleValue());

		}
		if (this.maxWordLength != null) {

			generator.writeKey("max_word_length");
			generator.write(this.maxWordLength.doubleValue());

		}
		if (this.minDocFreq != null) {

			generator.writeKey("min_doc_freq");
			generator.write(this.minDocFreq.doubleValue());

		}
		if (this.minTermFreq != null) {

			generator.writeKey("min_term_freq");
			generator.write(this.minTermFreq.doubleValue());

		}
		if (this.minWordLength != null) {

			generator.writeKey("min_word_length");
			generator.write(this.minWordLength.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Filter}.
	 */
	public static class Builder implements ObjectBuilder<Filter> {
		@Nullable
		private Number maxDocFreq;

		@Nullable
		private Number maxNumTerms;

		@Nullable
		private Number maxTermFreq;

		@Nullable
		private Number maxWordLength;

		@Nullable
		private Number minDocFreq;

		@Nullable
		private Number minTermFreq;

		@Nullable
		private Number minWordLength;

		/**
		 * API name: {@code max_doc_freq}
		 */
		public Builder maxDocFreq(@Nullable Number value) {
			this.maxDocFreq = value;
			return this;
		}

		/**
		 * API name: {@code max_num_terms}
		 */
		public Builder maxNumTerms(@Nullable Number value) {
			this.maxNumTerms = value;
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
		 * Builds a {@link Filter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Filter build() {

			return new Filter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Filter
	 */
	public static final JsonpDeserializer<Filter> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Filter::setupFilterDeserializer);

	protected static void setupFilterDeserializer(DelegatingDeserializer<Filter.Builder> op) {

		op.add(Builder::maxDocFreq, JsonpDeserializer.numberDeserializer(), "max_doc_freq");
		op.add(Builder::maxNumTerms, JsonpDeserializer.numberDeserializer(), "max_num_terms");
		op.add(Builder::maxTermFreq, JsonpDeserializer.numberDeserializer(), "max_term_freq");
		op.add(Builder::maxWordLength, JsonpDeserializer.numberDeserializer(), "max_word_length");
		op.add(Builder::minDocFreq, JsonpDeserializer.numberDeserializer(), "min_doc_freq");
		op.add(Builder::minTermFreq, JsonpDeserializer.numberDeserializer(), "min_term_freq");
		op.add(Builder::minWordLength, JsonpDeserializer.numberDeserializer(), "min_word_length");

	}

}
