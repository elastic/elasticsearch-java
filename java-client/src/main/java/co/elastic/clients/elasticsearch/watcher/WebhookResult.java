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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher._types.WebhookResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.WebhookResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class WebhookResult implements JsonpSerializable {
	private final HttpInputRequestResult request;

	@Nullable
	private final HttpInputResponseResult response;

	// ---------------------------------------------------------------------------------------------

	private WebhookResult(Builder builder) {

		this.request = ApiTypeHelper.requireNonNull(builder.request, this, "request");
		this.response = builder.response;

	}

	public static WebhookResult of(Function<Builder, ObjectBuilder<WebhookResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code request}
	 */
	public final HttpInputRequestResult request() {
		return this.request;
	}

	/**
	 * API name: {@code response}
	 */
	@Nullable
	public final HttpInputResponseResult response() {
		return this.response;
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

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		if (this.response != null) {
			generator.writeKey("response");
			this.response.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WebhookResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WebhookResult> {
		private HttpInputRequestResult request;

		@Nullable
		private HttpInputResponseResult response;

		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(HttpInputRequestResult value) {
			this.request = value;
			return this;
		}

		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestResult.Builder, ObjectBuilder<HttpInputRequestResult>> fn) {
			return this.request(fn.apply(new HttpInputRequestResult.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public final Builder response(@Nullable HttpInputResponseResult value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public final Builder response(
				Function<HttpInputResponseResult.Builder, ObjectBuilder<HttpInputResponseResult>> fn) {
			return this.response(fn.apply(new HttpInputResponseResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WebhookResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WebhookResult build() {
			_checkSingleUse();

			return new WebhookResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WebhookResult}
	 */
	public static final JsonpDeserializer<WebhookResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WebhookResult::setupWebhookResultDeserializer);

	protected static void setupWebhookResultDeserializer(ObjectDeserializer<WebhookResult.Builder> op) {

		op.add(Builder::request, HttpInputRequestResult._DESERIALIZER, "request");
		op.add(Builder::response, HttpInputResponseResult._DESERIALIZER, "response");

	}

}
