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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices.upgrade.Request
public final class UpgradeRequest extends RequestBase implements ToJsonp {
	private final Number stubB;

	@Nullable
	private final String index;

	private final Number stubA;

	private final Number stubC;

	// ---------------------------------------------------------------------------------------------

	protected UpgradeRequest(Builder builder) {

		this.stubB = Objects.requireNonNull(builder.stubB, "stub_b");
		this.index = builder.index;
		this.stubA = Objects.requireNonNull(builder.stubA, "stub_a");
		this.stubC = Objects.requireNonNull(builder.stubC, "stub_c");

	}

	/**
	 * API name: {@code stub_b}
	 */
	public Number stubB() {
		return this.stubB;
	}

	/**
	 * Auto generated - missing in the input spec
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code stub_a}
	 */
	public Number stubA() {
		return this.stubA;
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
	 * Builder for {@link UpgradeRequest}.
	 */
	public static class Builder implements ObjectBuilder<UpgradeRequest> {
		private Number stubB;

		@Nullable
		private String index;

		private Number stubA;

		private Number stubC;

		/**
		 * API name: {@code stub_b}
		 */
		public Builder stubB(Number value) {
			this.stubB = value;
			return this;
		}

		/**
		 * Auto generated - missing in the input spec
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code stub_a}
		 */
		public Builder stubA(Number value) {
			this.stubA = value;
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
		 * Builds a {@link UpgradeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpgradeRequest build() {

			return new UpgradeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UpgradeRequest
	 */
	public static final JsonpDeserializer<UpgradeRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpgradeRequest::setupUpgradeRequestDeserializer);

	protected static void setupUpgradeRequestDeserializer(DelegatingDeserializer<UpgradeRequest.Builder> op) {

		op.add(Builder::stubC, JsonpDeserializer.numberDeserializer(), "stub_c");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.upgrade}".
	 */
	public static final Endpoint<UpgradeRequest, UpgradeResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _stubB = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (request.stubB() != null)
					propsSet |= _stubB;
				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_upgrade");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_upgrade");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stub_a", request.stubA.toString());
				return params;

			}, Endpoint.Simple.emptyMap(), true, UpgradeResponse.DESERIALIZER);
}
