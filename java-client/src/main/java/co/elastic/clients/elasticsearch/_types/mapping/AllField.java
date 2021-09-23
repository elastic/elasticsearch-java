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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.AllField
public final class AllField implements JsonpSerializable {
	private final String analyzer;

	private final Boolean enabled;

	private final Boolean omitNorms;

	private final String searchAnalyzer;

	private final String similarity;

	private final Boolean store;

	private final Boolean storeTermVectorOffsets;

	private final Boolean storeTermVectorPayloads;

	private final Boolean storeTermVectorPositions;

	private final Boolean storeTermVectors;

	// ---------------------------------------------------------------------------------------------

	public AllField(Builder builder) {

		this.analyzer = Objects.requireNonNull(builder.analyzer, "analyzer");
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.omitNorms = Objects.requireNonNull(builder.omitNorms, "omit_norms");
		this.searchAnalyzer = Objects.requireNonNull(builder.searchAnalyzer, "search_analyzer");
		this.similarity = Objects.requireNonNull(builder.similarity, "similarity");
		this.store = Objects.requireNonNull(builder.store, "store");
		this.storeTermVectorOffsets = Objects.requireNonNull(builder.storeTermVectorOffsets,
				"store_term_vector_offsets");
		this.storeTermVectorPayloads = Objects.requireNonNull(builder.storeTermVectorPayloads,
				"store_term_vector_payloads");
		this.storeTermVectorPositions = Objects.requireNonNull(builder.storeTermVectorPositions,
				"store_term_vector_positions");
		this.storeTermVectors = Objects.requireNonNull(builder.storeTermVectors, "store_term_vectors");

	}

	/**
	 * API name: {@code analyzer}
	 */
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code omit_norms}
	 */
	public Boolean omitNorms() {
		return this.omitNorms;
	}

	/**
	 * API name: {@code search_analyzer}
	 */
	public String searchAnalyzer() {
		return this.searchAnalyzer;
	}

	/**
	 * API name: {@code similarity}
	 */
	public String similarity() {
		return this.similarity;
	}

	/**
	 * API name: {@code store}
	 */
	public Boolean store() {
		return this.store;
	}

	/**
	 * API name: {@code store_term_vector_offsets}
	 */
	public Boolean storeTermVectorOffsets() {
		return this.storeTermVectorOffsets;
	}

	/**
	 * API name: {@code store_term_vector_payloads}
	 */
	public Boolean storeTermVectorPayloads() {
		return this.storeTermVectorPayloads;
	}

	/**
	 * API name: {@code store_term_vector_positions}
	 */
	public Boolean storeTermVectorPositions() {
		return this.storeTermVectorPositions;
	}

	/**
	 * API name: {@code store_term_vectors}
	 */
	public Boolean storeTermVectors() {
		return this.storeTermVectors;
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

		generator.writeKey("analyzer");
		generator.write(this.analyzer);

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("omit_norms");
		generator.write(this.omitNorms);

		generator.writeKey("search_analyzer");
		generator.write(this.searchAnalyzer);

		generator.writeKey("similarity");
		generator.write(this.similarity);

		generator.writeKey("store");
		generator.write(this.store);

		generator.writeKey("store_term_vector_offsets");
		generator.write(this.storeTermVectorOffsets);

		generator.writeKey("store_term_vector_payloads");
		generator.write(this.storeTermVectorPayloads);

		generator.writeKey("store_term_vector_positions");
		generator.write(this.storeTermVectorPositions);

		generator.writeKey("store_term_vectors");
		generator.write(this.storeTermVectors);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllField}.
	 */
	public static class Builder implements ObjectBuilder<AllField> {
		private String analyzer;

		private Boolean enabled;

		private Boolean omitNorms;

		private String searchAnalyzer;

		private String similarity;

		private Boolean store;

		private Boolean storeTermVectorOffsets;

		private Boolean storeTermVectorPayloads;

		private Boolean storeTermVectorPositions;

		private Boolean storeTermVectors;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code omit_norms}
		 */
		public Builder omitNorms(Boolean value) {
			this.omitNorms = value;
			return this;
		}

		/**
		 * API name: {@code search_analyzer}
		 */
		public Builder searchAnalyzer(String value) {
			this.searchAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code similarity}
		 */
		public Builder similarity(String value) {
			this.similarity = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public Builder store(Boolean value) {
			this.store = value;
			return this;
		}

		/**
		 * API name: {@code store_term_vector_offsets}
		 */
		public Builder storeTermVectorOffsets(Boolean value) {
			this.storeTermVectorOffsets = value;
			return this;
		}

		/**
		 * API name: {@code store_term_vector_payloads}
		 */
		public Builder storeTermVectorPayloads(Boolean value) {
			this.storeTermVectorPayloads = value;
			return this;
		}

		/**
		 * API name: {@code store_term_vector_positions}
		 */
		public Builder storeTermVectorPositions(Boolean value) {
			this.storeTermVectorPositions = value;
			return this;
		}

		/**
		 * API name: {@code store_term_vectors}
		 */
		public Builder storeTermVectors(Boolean value) {
			this.storeTermVectors = value;
			return this;
		}

		/**
		 * Builds a {@link AllField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllField build() {

			return new AllField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AllField}
	 */
	public static final JsonpDeserializer<AllField> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AllField::setupAllFieldDeserializer);

	protected static void setupAllFieldDeserializer(DelegatingDeserializer<AllField.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::omitNorms, JsonpDeserializer.booleanDeserializer(), "omit_norms");
		op.add(Builder::searchAnalyzer, JsonpDeserializer.stringDeserializer(), "search_analyzer");
		op.add(Builder::similarity, JsonpDeserializer.stringDeserializer(), "similarity");
		op.add(Builder::store, JsonpDeserializer.booleanDeserializer(), "store");
		op.add(Builder::storeTermVectorOffsets, JsonpDeserializer.booleanDeserializer(), "store_term_vector_offsets");
		op.add(Builder::storeTermVectorPayloads, JsonpDeserializer.booleanDeserializer(), "store_term_vector_payloads");
		op.add(Builder::storeTermVectorPositions, JsonpDeserializer.booleanDeserializer(),
				"store_term_vector_positions");
		op.add(Builder::storeTermVectors, JsonpDeserializer.booleanDeserializer(), "store_term_vectors");

	}

}
