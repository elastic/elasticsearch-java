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

package co.elastic.clients.elasticsearch.monitoring;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: monitoring.bulk.Response
@JsonpDeserializable
public final class BulkResponse implements JsonpSerializable {
	@Nullable
	private final ErrorCause error;

	private final Boolean errors;

	private final Boolean ignored;

	private final Long took;

	// ---------------------------------------------------------------------------------------------

	public BulkResponse(Builder builder) {

		this.error = builder.error;
		this.errors = Objects.requireNonNull(builder.errors, "errors");
		this.ignored = Objects.requireNonNull(builder.ignored, "ignored");
		this.took = Objects.requireNonNull(builder.took, "took");

	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public ErrorCause error() {
		return this.error;
	}

	/**
	 * True if there is was an error
	 * <p>
	 * API name: {@code errors}
	 */
	public Boolean errors() {
		return this.errors;
	}

	/**
	 * Was collection disabled?
	 * <p>
	 * API name: {@code ignored}
	 */
	public Boolean ignored() {
		return this.ignored;
	}

	/**
	 * API name: {@code took}
	 */
	public Long took() {
		return this.took;
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

		if (this.error != null) {

			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

		generator.writeKey("errors");
		generator.write(this.errors);

		generator.writeKey("ignored");
		generator.write(this.ignored);

		generator.writeKey("took");
		generator.write(this.took);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkResponse}.
	 */
	public static class Builder implements ObjectBuilder<BulkResponse> {
		@Nullable
		private ErrorCause error;

		private Boolean errors;

		private Boolean ignored;

		private Long took;

		/**
		 * API name: {@code error}
		 */
		public Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * True if there is was an error
		 * <p>
		 * API name: {@code errors}
		 */
		public Builder errors(Boolean value) {
			this.errors = value;
			return this;
		}

		/**
		 * Was collection disabled?
		 * <p>
		 * API name: {@code ignored}
		 */
		public Builder ignored(Boolean value) {
			this.ignored = value;
			return this;
		}

		/**
		 * API name: {@code took}
		 */
		public Builder took(Long value) {
			this.took = value;
			return this;
		}

		/**
		 * Builds a {@link BulkResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkResponse build() {

			return new BulkResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkResponse}
	 */
	public static final JsonpDeserializer<BulkResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkResponse::setupBulkResponseDeserializer, Builder::build);

	protected static void setupBulkResponseDeserializer(DelegatingDeserializer<BulkResponse.Builder> op) {

		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::errors, JsonpDeserializer.booleanDeserializer(), "errors");
		op.add(Builder::ignored, JsonpDeserializer.booleanDeserializer(), "ignored");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");

	}

}
