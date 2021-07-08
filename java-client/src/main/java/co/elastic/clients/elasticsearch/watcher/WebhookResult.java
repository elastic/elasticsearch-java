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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.WebhookResult
public final class WebhookResult implements ToJsonp {
	private final JsonValue request;

	@Nullable
	private final HttpInputResponseResult response;

	// ---------------------------------------------------------------------------------------------

	protected WebhookResult(Builder builder) {

		this.request = Objects.requireNonNull(builder.request, "request");
		this.response = builder.response;

	}

	/**
	 * API name: {@code request}
	 */
	public JsonValue request() {
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("request");
		generator.write(this.request);

		if (this.response != null) {

			generator.writeKey("response");
			this.response.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WebhookResult}.
	 */
	public static class Builder implements ObjectBuilder<WebhookResult> {
		private JsonValue request;

		@Nullable
		private HttpInputResponseResult response;

		/**
		 * API name: {@code request}
		 */
		public Builder request(JsonValue value) {
			this.request = value;
			return this;
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
	 * Json deserializer for WebhookResult
	 */
	public static final JsonpDeserializer<WebhookResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WebhookResult::setupWebhookResultDeserializer);

	protected static void setupWebhookResultDeserializer(DelegatingDeserializer<WebhookResult.Builder> op) {

		op.add(Builder::request, JsonpDeserializer.jsonValueDeserializer(), "request");
		op.add(Builder::response, HttpInputResponseResult.DESERIALIZER, "response");

	}

}
