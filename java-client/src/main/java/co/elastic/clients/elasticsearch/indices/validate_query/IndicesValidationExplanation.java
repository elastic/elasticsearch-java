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

package co.elastic.clients.elasticsearch.indices.validate_query;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.validate_query.IndicesValidationExplanation
public final class IndicesValidationExplanation implements ToJsonp {
	@Nullable
	private final String error;

	@Nullable
	private final String explanation;

	private final String index;

	private final Boolean valid;

	// ---------------------------------------------------------------------------------------------

	protected IndicesValidationExplanation(Builder builder) {

		this.error = builder.error;
		this.explanation = builder.explanation;
		this.index = Objects.requireNonNull(builder.index, "index");
		this.valid = Objects.requireNonNull(builder.valid, "valid");

	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public String error() {
		return this.error;
	}

	/**
	 * API name: {@code explanation}
	 */
	@Nullable
	public String explanation() {
		return this.explanation;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code valid}
	 */
	public Boolean valid() {
		return this.valid;
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

		if (this.error != null) {

			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.explanation != null) {

			generator.writeKey("explanation");
			generator.write(this.explanation);

		}

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("valid");
		generator.write(this.valid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesValidationExplanation}.
	 */
	public static class Builder implements ObjectBuilder<IndicesValidationExplanation> {
		@Nullable
		private String error;

		@Nullable
		private String explanation;

		private String index;

		private Boolean valid;

		/**
		 * API name: {@code error}
		 */
		public Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code explanation}
		 */
		public Builder explanation(@Nullable String value) {
			this.explanation = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code valid}
		 */
		public Builder valid(Boolean value) {
			this.valid = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesValidationExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesValidationExplanation build() {

			return new IndicesValidationExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesValidationExplanation
	 */
	public static final JsonpDeserializer<IndicesValidationExplanation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesValidationExplanation::setupIndicesValidationExplanationDeserializer);

	protected static void setupIndicesValidationExplanationDeserializer(
			DelegatingDeserializer<IndicesValidationExplanation.Builder> op) {

		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::explanation, JsonpDeserializer.stringDeserializer(), "explanation");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::valid, JsonpDeserializer.booleanDeserializer(), "valid");

	}

}
