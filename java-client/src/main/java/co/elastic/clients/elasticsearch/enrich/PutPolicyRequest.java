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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.put_policy.Request
public final class PutPolicyRequest extends RequestBase implements ToJsonp {
	private final String name;

	@Nullable
	private final Policy geoMatch;

	@Nullable
	private final Policy match;

	// ---------------------------------------------------------------------------------------------

	protected PutPolicyRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.geoMatch = builder.geoMatch;
		this.match = builder.match;

	}

	/**
	 * The name of the enrich policy
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code geo_match}
	 */
	@Nullable
	public Policy geoMatch() {
		return this.geoMatch;
	}

	/**
	 * API name: {@code match}
	 */
	@Nullable
	public Policy match() {
		return this.match;
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

		if (this.geoMatch != null) {

			generator.writeKey("geo_match");
			this.geoMatch.toJsonp(generator, mapper);

		}
		if (this.match != null) {

			generator.writeKey("match");
			this.match.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPolicyRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPolicyRequest> {
		private String name;

		@Nullable
		private Policy geoMatch;

		@Nullable
		private Policy match;

		/**
		 * The name of the enrich policy
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(@Nullable Policy value) {
			this.geoMatch = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.geoMatch(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(@Nullable Policy value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.match(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * Builds a {@link PutPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPolicyRequest build() {

			return new PutPolicyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutPolicyRequest
	 */
	public static final JsonpDeserializer<PutPolicyRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutPolicyRequest::setupPutPolicyRequestDeserializer);

	protected static void setupPutPolicyRequestDeserializer(DelegatingDeserializer<PutPolicyRequest.Builder> op) {

		op.add(Builder::geoMatch, Policy.DESERIALIZER, "geo_match");
		op.add(Builder::match, Policy.DESERIALIZER, "match");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code enrich.put_policy}".
	 */
	public static final Endpoint<PutPolicyRequest, PutPolicyResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_enrich");
					buf.append("/policy");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutPolicyResponse.DESERIALIZER);
}
