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
import javax.annotation.Nullable;

// typedef: rollup.rollup.Request
@JsonpDeserializable
public final class RollupRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	private final String rollupIndex;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	public RollupRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.rollupIndex = Objects.requireNonNull(builder.rollupIndex, "rollup_index");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * The index to roll up
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * The name of the rollup index to create
	 * <p>
	 * API name: {@code rollup_index}
	 */
	public String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public JsonData value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupRequest}.
	 */
	public static class Builder implements ObjectBuilder<RollupRequest> {
		private String index;

		private String rollupIndex;

		private JsonData value;

		/**
		 * The index to roll up
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The name of the rollup index to create
		 * <p>
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(JsonData value) {
			this.value = value;
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
	 * Json deserializer for {@link RollupRequest}
	 */
	public static final JsonpDeserializer<RollupRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupRequest::setupRollupRequestDeserializer, Builder::build);

	protected static void setupRollupRequestDeserializer(DelegatingDeserializer<RollupRequest.Builder> op) {

		op.add(Builder::value, JsonData._DESERIALIZER, "value");

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
				final int _index = 1 << 0;
				final int _rollupIndex = 1 << 1;

				int propsSet = 0;

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
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, RollupResponse._DESERIALIZER);
}
