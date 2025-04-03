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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.HttpRoute

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.HttpRoute">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpRoute implements JsonpSerializable {
	private final HttpRouteRequests requests;

	private final HttpRouteResponses responses;

	// ---------------------------------------------------------------------------------------------

	private HttpRoute(Builder builder) {

		this.requests = ApiTypeHelper.requireNonNull(builder.requests, this, "requests");
		this.responses = ApiTypeHelper.requireNonNull(builder.responses, this, "responses");

	}

	public static HttpRoute of(Function<Builder, ObjectBuilder<HttpRoute>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code requests}
	 */
	public final HttpRouteRequests requests() {
		return this.requests;
	}

	/**
	 * Required - API name: {@code responses}
	 */
	public final HttpRouteResponses responses() {
		return this.responses;
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

		generator.writeKey("requests");
		this.requests.serialize(generator, mapper);

		generator.writeKey("responses");
		this.responses.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpRoute}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HttpRoute> {
		private HttpRouteRequests requests;

		private HttpRouteResponses responses;

		/**
		 * Required - API name: {@code requests}
		 */
		public final Builder requests(HttpRouteRequests value) {
			this.requests = value;
			return this;
		}

		/**
		 * Required - API name: {@code requests}
		 */
		public final Builder requests(Function<HttpRouteRequests.Builder, ObjectBuilder<HttpRouteRequests>> fn) {
			return this.requests(fn.apply(new HttpRouteRequests.Builder()).build());
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final Builder responses(HttpRouteResponses value) {
			this.responses = value;
			return this;
		}

		/**
		 * Required - API name: {@code responses}
		 */
		public final Builder responses(Function<HttpRouteResponses.Builder, ObjectBuilder<HttpRouteResponses>> fn) {
			return this.responses(fn.apply(new HttpRouteResponses.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HttpRoute}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpRoute build() {
			_checkSingleUse();

			return new HttpRoute(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpRoute}
	 */
	public static final JsonpDeserializer<HttpRoute> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HttpRoute::setupHttpRouteDeserializer);

	protected static void setupHttpRouteDeserializer(ObjectDeserializer<HttpRoute.Builder> op) {

		op.add(Builder::requests, HttpRouteRequests._DESERIALIZER, "requests");
		op.add(Builder::responses, HttpRouteResponses._DESERIALIZER, "responses");

	}

}
