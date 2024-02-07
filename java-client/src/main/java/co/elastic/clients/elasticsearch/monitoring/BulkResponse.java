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

package co.elastic.clients.elasticsearch.monitoring;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: monitoring.bulk.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#monitoring.bulk.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkResponse implements JsonpSerializable {
	@Nullable
	private final ErrorCause error;

	private final boolean errors;

	private final boolean ignored;

	private final long took;

	// ---------------------------------------------------------------------------------------------

	private BulkResponse(Builder builder) {

		this.error = builder.error;
		this.errors = ApiTypeHelper.requireNonNull(builder.errors, this, "errors");
		this.ignored = ApiTypeHelper.requireNonNull(builder.ignored, this, "ignored");
		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");

	}

	public static BulkResponse of(Function<Builder, ObjectBuilder<BulkResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * Required - True if there is was an error
	 * <p>
	 * API name: {@code errors}
	 */
	public final boolean errors() {
		return this.errors;
	}

	/**
	 * Required - Was collection disabled?
	 * <p>
	 * API name: {@code ignored}
	 */
	public final boolean ignored() {
		return this.ignored;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BulkResponse> {
		@Nullable
		private ErrorCause error;

		private Boolean errors;

		private Boolean ignored;

		private Long took;

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - True if there is was an error
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(boolean value) {
			this.errors = value;
			return this;
		}

		/**
		 * Required - Was collection disabled?
		 * <p>
		 * API name: {@code ignored}
		 */
		public final Builder ignored(boolean value) {
			this.ignored = value;
			return this;
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder took(long value) {
			this.took = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkResponse build() {
			_checkSingleUse();

			return new BulkResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkResponse}
	 */
	public static final JsonpDeserializer<BulkResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkResponse::setupBulkResponseDeserializer);

	protected static void setupBulkResponseDeserializer(ObjectDeserializer<BulkResponse.Builder> op) {

		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::errors, JsonpDeserializer.booleanDeserializer(), "errors");
		op.add(Builder::ignored, JsonpDeserializer.booleanDeserializer(), "ignored");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");

	}

}
