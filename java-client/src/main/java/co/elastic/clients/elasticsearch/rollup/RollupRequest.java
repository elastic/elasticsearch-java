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

package co.elastic.clients.elasticsearch.rollup;

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

// typedef: rollup.rollup.Request
public final class RollupRequest extends RequestBase implements ToJsonp {
	private final Number stubb;

	@Nullable
	private final String index;

	@Nullable
	private final String rollupIndex;

	private final Number stuba;

	private final Number stub;

	// ---------------------------------------------------------------------------------------------

	protected RollupRequest(Builder builder) {

		this.stubb = Objects.requireNonNull(builder.stubb, "stubb");
		this.index = builder.index;
		this.rollupIndex = builder.rollupIndex;
		this.stuba = Objects.requireNonNull(builder.stuba, "stuba");
		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * API name: {@code stubb}
	 */
	public Number stubb() {
		return this.stubb;
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
	 * Auto generated - missing in the input spec
	 * <p>
	 * API name: {@code rollup_index}
	 */
	@Nullable
	public String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * API name: {@code stuba}
	 */
	public Number stuba() {
		return this.stuba;
	}

	/**
	 * API name: {@code stub}
	 */
	public Number stub() {
		return this.stub;
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

		generator.writeKey("stub");
		generator.write(this.stub.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupRequest}.
	 */
	public static class Builder implements ObjectBuilder<RollupRequest> {
		private Number stubb;

		@Nullable
		private String index;

		@Nullable
		private String rollupIndex;

		private Number stuba;

		private Number stub;

		/**
		 * API name: {@code stubb}
		 */
		public Builder stubb(Number value) {
			this.stubb = value;
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
		 * Auto generated - missing in the input spec
		 * <p>
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(@Nullable String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * API name: {@code stuba}
		 */
		public Builder stuba(Number value) {
			this.stuba = value;
			return this;
		}

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(Number value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link RollupRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupRequest build() {

			return new RollupRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupRequest
	 */
	public static final JsonpDeserializer<RollupRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupRequest::setupRollupRequestDeserializer);

	protected static void setupRollupRequestDeserializer(DelegatingDeserializer<RollupRequest.Builder> op) {

		op.add(Builder::stub, JsonpDeserializer.numberDeserializer(), "stub");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.rollup}".
	 */
	public static final Endpoint<RollupRequest, RollupResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _stubb = 1 << 0;
				final int _index = 1 << 1;
				final int _rollupIndex = 1 << 2;

				int propsSet = 0;

				if (request.stubb() != null)
					propsSet |= _stubb;
				if (request.index() != null)
					propsSet |= _index;
				if (request.rollupIndex() != null)
					propsSet |= _rollupIndex;

				if (propsSet == (_index | _rollupIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_rollup");
					buf.append("/");
					buf.append(request.rollupIndex);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("stuba", request.stuba.toString());
				return params;

			}, Endpoint.Simple.emptyMap(), true, RollupResponse.DESERIALIZER);
}
