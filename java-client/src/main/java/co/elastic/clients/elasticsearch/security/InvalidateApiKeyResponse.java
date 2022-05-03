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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.invalidate_api_key.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.invalidate_api_key.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class InvalidateApiKeyResponse implements JsonpSerializable {
	private final int errorCount;

	private final List<ErrorCause> errorDetails;

	private final List<String> invalidatedApiKeys;

	private final List<String> previouslyInvalidatedApiKeys;

	// ---------------------------------------------------------------------------------------------

	private InvalidateApiKeyResponse(Builder builder) {

		this.errorCount = ApiTypeHelper.requireNonNull(builder.errorCount, this, "errorCount");
		this.errorDetails = ApiTypeHelper.unmodifiable(builder.errorDetails);
		this.invalidatedApiKeys = ApiTypeHelper.unmodifiableRequired(builder.invalidatedApiKeys, this,
				"invalidatedApiKeys");
		this.previouslyInvalidatedApiKeys = ApiTypeHelper.unmodifiableRequired(builder.previouslyInvalidatedApiKeys,
				this, "previouslyInvalidatedApiKeys");

	}

	public static InvalidateApiKeyResponse of(Function<Builder, ObjectBuilder<InvalidateApiKeyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code error_count}
	 */
	public final int errorCount() {
		return this.errorCount;
	}

	/**
	 * API name: {@code error_details}
	 */
	public final List<ErrorCause> errorDetails() {
		return this.errorDetails;
	}

	/**
	 * Required - API name: {@code invalidated_api_keys}
	 */
	public final List<String> invalidatedApiKeys() {
		return this.invalidatedApiKeys;
	}

	/**
	 * Required - API name: {@code previously_invalidated_api_keys}
	 */
	public final List<String> previouslyInvalidatedApiKeys() {
		return this.previouslyInvalidatedApiKeys;
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
		generator.write(this.errorCount);

		if (ApiTypeHelper.isDefined(this.errorDetails)) {
			generator.writeKey("error_details");
			generator.writeStartArray();
			for (ErrorCause item0 : this.errorDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.invalidatedApiKeys)) {
			generator.writeKey("invalidated_api_keys");
			generator.writeStartArray();
			for (String item0 : this.invalidatedApiKeys) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.previouslyInvalidatedApiKeys)) {
			generator.writeKey("previously_invalidated_api_keys");
			generator.writeStartArray();
			for (String item0 : this.previouslyInvalidatedApiKeys) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateApiKeyResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InvalidateApiKeyResponse> {
		private Integer errorCount;

		@Nullable
		private List<ErrorCause> errorDetails;

		private List<String> invalidatedApiKeys;

		private List<String> previouslyInvalidatedApiKeys;

		/**
		 * Required - API name: {@code error_count}
		 */
		public final Builder errorCount(int value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>errorDetails</code>.
		 */
		public final Builder errorDetails(List<ErrorCause> list) {
			this.errorDetails = _listAddAll(this.errorDetails, list);
			return this;
		}

		/**
		 * API name: {@code error_details}
		 * <p>
		 * Adds one or more values to <code>errorDetails</code>.
		 */
		public final Builder errorDetails(ErrorCause value, ErrorCause... values) {
			this.errorDetails = _listAdd(this.errorDetails, value, values);
			return this;
		}

		/**
		 * API name: {@code error_details}
		 * <p>
		 * Adds a value to <code>errorDetails</code> using a builder lambda.
		 */
		public final Builder errorDetails(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return errorDetails(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code invalidated_api_keys}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>invalidatedApiKeys</code>.
		 */
		public final Builder invalidatedApiKeys(List<String> list) {
			this.invalidatedApiKeys = _listAddAll(this.invalidatedApiKeys, list);
			return this;
		}

		/**
		 * Required - API name: {@code invalidated_api_keys}
		 * <p>
		 * Adds one or more values to <code>invalidatedApiKeys</code>.
		 */
		public final Builder invalidatedApiKeys(String value, String... values) {
			this.invalidatedApiKeys = _listAdd(this.invalidatedApiKeys, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code previously_invalidated_api_keys}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>previouslyInvalidatedApiKeys</code>.
		 */
		public final Builder previouslyInvalidatedApiKeys(List<String> list) {
			this.previouslyInvalidatedApiKeys = _listAddAll(this.previouslyInvalidatedApiKeys, list);
			return this;
		}

		/**
		 * Required - API name: {@code previously_invalidated_api_keys}
		 * <p>
		 * Adds one or more values to <code>previouslyInvalidatedApiKeys</code>.
		 */
		public final Builder previouslyInvalidatedApiKeys(String value, String... values) {
			this.previouslyInvalidatedApiKeys = _listAdd(this.previouslyInvalidatedApiKeys, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InvalidateApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateApiKeyResponse build() {
			_checkSingleUse();

			return new InvalidateApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateApiKeyResponse}
	 */
	public static final JsonpDeserializer<InvalidateApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InvalidateApiKeyResponse::setupInvalidateApiKeyResponseDeserializer);

	protected static void setupInvalidateApiKeyResponseDeserializer(
			ObjectDeserializer<InvalidateApiKeyResponse.Builder> op) {

		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::errorDetails, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "error_details");
		op.add(Builder::invalidatedApiKeys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"invalidated_api_keys");
		op.add(Builder::previouslyInvalidatedApiKeys,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"previously_invalidated_api_keys");

	}

}
