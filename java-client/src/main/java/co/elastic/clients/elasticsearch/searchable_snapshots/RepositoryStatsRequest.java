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

package co.elastic.clients.elasticsearch.searchable_snapshots;

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
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.repository_stats.Request
public final class RepositoryStatsRequest extends RequestBase implements ToJsonp {
	private final Number stubA;

	@Nullable
	private final String repository;

	private final Number stubB;

	private final Number stubC;

	// ---------------------------------------------------------------------------------------------

	protected RepositoryStatsRequest(Builder builder) {

		this.stubA = Objects.requireNonNull(builder.stubA, "stub_a");
		this.repository = builder.repository;
		this.stubB = Objects.requireNonNull(builder.stubB, "stub_b");
		this.stubC = Objects.requireNonNull(builder.stubC, "stub_c");

	}

	/**
	 * API name: {@code stub_a}
	 */
	public Number stubA() {
		return this.stubA;
	}

	/**
	 * Auto generated - missing in the input spec
	 * <p>
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code stub_b}
	 */
	public Number stubB() {
		return this.stubB;
	}

	/**
	 * API name: {@code stub_c}
	 */
	public Number stubC() {
		return this.stubC;
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

		generator.writeKey("stub_c");
		generator.write(this.stubC.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<RepositoryStatsRequest> {
		private Number stubA;

		@Nullable
		private String repository;

		private Number stubB;

		private Number stubC;

		/**
		 * API name: {@code stub_a}
		 */
		public Builder stubA(Number value) {
			this.stubA = value;
			return this;
		}

		/**
		 * Auto generated - missing in the input spec
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code stub_b}
		 */
		public Builder stubB(Number value) {
			this.stubB = value;
			return this;
		}

		/**
		 * API name: {@code stub_c}
		 */
		public Builder stubC(Number value) {
			this.stubC = value;
			return this;
		}

		/**
		 * Builds a {@link RepositoryStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryStatsRequest build() {

			return new RepositoryStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RepositoryStatsRequest
	 */
	public static final JsonpDeserializer<RepositoryStatsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RepositoryStatsRequest::setupRepositoryStatsRequestDeserializer);

	protected static void setupRepositoryStatsRequestDeserializer(
			DelegatingDeserializer<RepositoryStatsRequest.Builder> op) {

		op.add(Builder::stubC, JsonpDeserializer.numberDeserializer(), "stub_c");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code searchable_snapshots.repository_stats}".
	 */
	public static final Endpoint<RepositoryStatsRequest, RepositoryStatsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _stubA = 1 << 0;
				final int _repository = 1 << 1;

				int propsSet = 0;

				if (request.stubA() != null)
					propsSet |= _stubA;
				if (request.repository() != null)
					propsSet |= _repository;

				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/_stats");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stub_b", request.stubB.toString());
				return params;

			}, Endpoint.Simple.emptyMap(), true, RepositoryStatsResponse.DESERIALIZER);
}
