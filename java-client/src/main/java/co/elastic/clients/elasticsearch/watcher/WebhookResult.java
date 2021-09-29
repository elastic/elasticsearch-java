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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.WebhookResult
@JsonpDeserializable
public final class WebhookResult implements JsonpSerializable {
	private final HttpInputRequestResult request;

	@Nullable
	private final HttpInputResponseResult response;

	// ---------------------------------------------------------------------------------------------

	public WebhookResult(Builder builder) {

		this.request = Objects.requireNonNull(builder.request, "request");
		this.response = builder.response;

	}

	public WebhookResult(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code request}
	 */
	public HttpInputRequestResult request() {
		return this.request;
	}

	/**
	 * API name: {@code response}
	 */
	@Nullable
	public HttpInputResponseResult response() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WebhookResult}.
	 */
	public static class Builder implements ObjectBuilder<WebhookResult> {
		private HttpInputRequestResult request;

		@Nullable
		private HttpInputResponseResult response;

		/**
		 * API name: {@code request}
		 */
		public Builder request(HttpInputRequestResult value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(Function<HttpInputRequestResult.Builder, ObjectBuilder<HttpInputRequestResult>> fn) {
			return this.request(fn.apply(new HttpInputRequestResult.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(@Nullable HttpInputResponseResult value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(Function<HttpInputResponseResult.Builder, ObjectBuilder<HttpInputResponseResult>> fn) {
			return this.response(fn.apply(new HttpInputResponseResult.Builder()).build());
		}

		/**
		 * Builds a {@link WebhookResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WebhookResult build() {

			return new WebhookResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WebhookResult}
	 */
	public static final JsonpDeserializer<WebhookResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WebhookResult::setupWebhookResultDeserializer, Builder::build);

	protected static void setupWebhookResultDeserializer(DelegatingDeserializer<WebhookResult.Builder> op) {

		op.add(Builder::request, HttpInputRequestResult._DESERIALIZER, "request");
		op.add(Builder::response, HttpInputResponseResult._DESERIALIZER, "response");

	}

}
