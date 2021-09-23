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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.invalidate_token.Response
public final class InvalidateTokenResponse implements JsonpSerializable {
	private final Number errorCount;

	@Nullable
	private final List<ErrorCause> errorDetails;

	private final Number invalidatedTokens;

	private final Number previouslyInvalidatedTokens;

	// ---------------------------------------------------------------------------------------------

	public InvalidateTokenResponse(Builder builder) {

		this.errorCount = Objects.requireNonNull(builder.errorCount, "error_count");
		this.errorDetails = builder.errorDetails;
		this.invalidatedTokens = Objects.requireNonNull(builder.invalidatedTokens, "invalidated_tokens");
		this.previouslyInvalidatedTokens = Objects.requireNonNull(builder.previouslyInvalidatedTokens,
				"previously_invalidated_tokens");

	}

	/**
	 * API name: {@code error_count}
	 */
	public Number errorCount() {
		return this.errorCount;
	}

	/**
	 * API name: {@code error_details}
	 */
	@Nullable
	public List<ErrorCause> errorDetails() {
		return this.errorDetails;
	}

	/**
	 * API name: {@code invalidated_tokens}
	 */
	public Number invalidatedTokens() {
		return this.invalidatedTokens;
	}

	/**
	 * API name: {@code previously_invalidated_tokens}
	 */
	public Number previouslyInvalidatedTokens() {
		return this.previouslyInvalidatedTokens;
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

		generator.writeKey("error_count");
		generator.write(this.errorCount.doubleValue());

		if (this.errorDetails != null) {

			generator.writeKey("error_details");
			generator.writeStartArray();
			for (ErrorCause item0 : this.errorDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("invalidated_tokens");
		generator.write(this.invalidatedTokens.doubleValue());

		generator.writeKey("previously_invalidated_tokens");
		generator.write(this.previouslyInvalidatedTokens.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateTokenResponse}.
	 */
	public static class Builder implements ObjectBuilder<InvalidateTokenResponse> {
		private Number errorCount;

		@Nullable
		private List<ErrorCause> errorDetails;

		private Number invalidatedTokens;

		private Number previouslyInvalidatedTokens;

		/**
		 * API name: {@code error_count}
		 */
		public Builder errorCount(Number value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public Builder errorDetails(@Nullable List<ErrorCause> value) {
			this.errorDetails = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public Builder errorDetails(ErrorCause... value) {
			this.errorDetails = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #errorDetails(List)}, creating the list if needed.
		 */
		public Builder addErrorDetails(ErrorCause value) {
			if (this.errorDetails == null) {
				this.errorDetails = new ArrayList<>();
			}
			this.errorDetails.add(value);
			return this;
		}

		/**
		 * Set {@link #errorDetails(List)} to a singleton list.
		 */
		public Builder errorDetails(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.errorDetails(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #errorDetails(List)}, creating the list if needed.
		 */
		public Builder addErrorDetails(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addErrorDetails(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code invalidated_tokens}
		 */
		public Builder invalidatedTokens(Number value) {
			this.invalidatedTokens = value;
			return this;
		}

		/**
		 * API name: {@code previously_invalidated_tokens}
		 */
		public Builder previouslyInvalidatedTokens(Number value) {
			this.previouslyInvalidatedTokens = value;
			return this;
		}

		/**
		 * Builds a {@link InvalidateTokenResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateTokenResponse build() {

			return new InvalidateTokenResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateTokenResponse}
	 */
	public static final JsonpDeserializer<InvalidateTokenResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InvalidateTokenResponse::setupInvalidateTokenResponseDeserializer);

	protected static void setupInvalidateTokenResponseDeserializer(
			DelegatingDeserializer<InvalidateTokenResponse.Builder> op) {

		op.add(Builder::errorCount, JsonpDeserializer.numberDeserializer(), "error_count");
		op.add(Builder::errorDetails, JsonpDeserializer.arrayDeserializer(ErrorCause.DESERIALIZER), "error_details");
		op.add(Builder::invalidatedTokens, JsonpDeserializer.numberDeserializer(), "invalidated_tokens");
		op.add(Builder::previouslyInvalidatedTokens, JsonpDeserializer.numberDeserializer(),
				"previously_invalidated_tokens");

	}

}
