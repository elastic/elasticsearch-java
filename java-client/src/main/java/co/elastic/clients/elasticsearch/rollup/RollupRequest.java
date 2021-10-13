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
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.rollup.Request
@JsonpDeserializable
public final class RollupRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	private final String rollupIndex;

	private final JsonData config;

	// ---------------------------------------------------------------------------------------------

	public RollupRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.rollupIndex = Objects.requireNonNull(builder.rollupIndex, "rollup_index");
		this.config = Objects.requireNonNull(builder.config, "_value_body");

	}

	public RollupRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The index to roll up
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - The name of the rollup index to create
	 * <p>
	 * API name: {@code rollup_index}
	 */
	public String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public JsonData config() {
		return this.config;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.config.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupRequest}.
	 */
	public static class Builder implements ObjectBuilder<RollupRequest> {
		private String index;

		private String rollupIndex;

		private JsonData config;

		/**
		 * Required - The index to roll up
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - The name of the rollup index to create
		 * <p>
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder config(JsonData value) {
			this.config = value;
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

	public static final JsonpDeserializer<RollupRequest> _DESERIALIZER = createRollupRequestDeserializer();
	protected static JsonpDeserializer<RollupRequest> createRollupRequestDeserializer() {

		JsonpDeserializer<JsonData> valueDeserializer = JsonData._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.config(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.rollup}".
	 */
	public static final Endpoint<RollupRequest, RollupResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _rollupIndex = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _rollupIndex;

				if (propsSet == (_index | _rollupIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_rollup");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rollupIndex, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, RollupResponse._DESERIALIZER);
}
