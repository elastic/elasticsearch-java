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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.put_policy.Request

/**
 * Creates an enrich policy.
 * 
 * @see <a href="../doc-files/api-spec.html#enrich.put_policy.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutPolicyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final EnrichPolicy geoMatch;

	@Nullable
	private final EnrichPolicy match;

	private final String name;

	@Nullable
	private final EnrichPolicy range;

	// ---------------------------------------------------------------------------------------------

	private PutPolicyRequest(Builder builder) {

		this.geoMatch = builder.geoMatch;
		this.match = builder.match;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.range = builder.range;

	}

	public static PutPolicyRequest of(Function<Builder, ObjectBuilder<PutPolicyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Matches enrich data to incoming documents based on a <code>geo_shape</code>
	 * query.
	 * <p>
	 * API name: {@code geo_match}
	 */
	@Nullable
	public final EnrichPolicy geoMatch() {
		return this.geoMatch;
	}

	/**
	 * Matches enrich data to incoming documents based on a <code>term</code> query.
	 * <p>
	 * API name: {@code match}
	 */
	@Nullable
	public final EnrichPolicy match() {
		return this.match;
	}

	/**
	 * Required - Name of the enrich policy to create or update.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Matches a number, date, or IP address in incoming documents to a range in the
	 * enrich index based on a <code>term</code> query.
	 * <p>
	 * API name: {@code range}
	 */
	@Nullable
	public final EnrichPolicy range() {
		return this.range;
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

		if (this.geoMatch != null) {
			generator.writeKey("geo_match");
			this.geoMatch.serialize(generator, mapper);

		}
		if (this.match != null) {
			generator.writeKey("match");
			this.match.serialize(generator, mapper);

		}
		if (this.range != null) {
			generator.writeKey("range");
			this.range.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPolicyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutPolicyRequest> {
		@Nullable
		private EnrichPolicy geoMatch;

		@Nullable
		private EnrichPolicy match;

		private String name;

		@Nullable
		private EnrichPolicy range;

		/**
		 * Matches enrich data to incoming documents based on a <code>geo_shape</code>
		 * query.
		 * <p>
		 * API name: {@code geo_match}
		 */
		public final Builder geoMatch(@Nullable EnrichPolicy value) {
			this.geoMatch = value;
			return this;
		}

		/**
		 * Matches enrich data to incoming documents based on a <code>geo_shape</code>
		 * query.
		 * <p>
		 * API name: {@code geo_match}
		 */
		public final Builder geoMatch(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.geoMatch(fn.apply(new EnrichPolicy.Builder()).build());
		}

		/**
		 * Matches enrich data to incoming documents based on a <code>term</code> query.
		 * <p>
		 * API name: {@code match}
		 */
		public final Builder match(@Nullable EnrichPolicy value) {
			this.match = value;
			return this;
		}

		/**
		 * Matches enrich data to incoming documents based on a <code>term</code> query.
		 * <p>
		 * API name: {@code match}
		 */
		public final Builder match(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.match(fn.apply(new EnrichPolicy.Builder()).build());
		}

		/**
		 * Required - Name of the enrich policy to create or update.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Matches a number, date, or IP address in incoming documents to a range in the
		 * enrich index based on a <code>term</code> query.
		 * <p>
		 * API name: {@code range}
		 */
		public final Builder range(@Nullable EnrichPolicy value) {
			this.range = value;
			return this;
		}

		/**
		 * Matches a number, date, or IP address in incoming documents to a range in the
		 * enrich index based on a <code>term</code> query.
		 * <p>
		 * API name: {@code range}
		 */
		public final Builder range(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.range(fn.apply(new EnrichPolicy.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPolicyRequest build() {
			_checkSingleUse();

			return new PutPolicyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPolicyRequest}
	 */
	public static final JsonpDeserializer<PutPolicyRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutPolicyRequest::setupPutPolicyRequestDeserializer);

	protected static void setupPutPolicyRequestDeserializer(ObjectDeserializer<PutPolicyRequest.Builder> op) {

		op.add(Builder::geoMatch, EnrichPolicy._DESERIALIZER, "geo_match");
		op.add(Builder::match, EnrichPolicy._DESERIALIZER, "match");
		op.add(Builder::range, EnrichPolicy._DESERIALIZER, "range");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code enrich.put_policy}".
	 */
	public static final Endpoint<PutPolicyRequest, PutPolicyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/enrich.put_policy",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_enrich");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutPolicyResponse._DESERIALIZER);
}
