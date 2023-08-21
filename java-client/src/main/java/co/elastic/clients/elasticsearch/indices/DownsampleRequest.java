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
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.downsample.Request

/**
 * Aggregates a time series (TSDS) index and stores pre-computed statistical
 * summaries (<code>min</code>, <code>max</code>, <code>sum</code>,
 * <code>value_count</code> and <code>avg</code>) for each metric field grouped
 * by a configured time interval.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.downsample.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class DownsampleRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	private final String targetIndex;

	private final DownsampleConfig config;

	// ---------------------------------------------------------------------------------------------

	private DownsampleRequest(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.targetIndex = ApiTypeHelper.requireNonNull(builder.targetIndex, this, "targetIndex");
		this.config = ApiTypeHelper.requireNonNull(builder.config, this, "config");

	}

	public static DownsampleRequest of(Function<Builder, ObjectBuilder<DownsampleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the time series index to downsample.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - Name of the index to create.
	 * <p>
	 * API name: {@code target_index}
	 */
	public final String targetIndex() {
		return this.targetIndex;
	}

	/**
	 * Required - Request body.
	 */
	public final DownsampleConfig config() {
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
	 * Builder for {@link DownsampleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DownsampleRequest> {
		private String index;

		private String targetIndex;

		private DownsampleConfig config;

		/**
		 * Required - Name of the time series index to downsample.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Name of the index to create.
		 * <p>
		 * API name: {@code target_index}
		 */
		public final Builder targetIndex(String value) {
			this.targetIndex = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder config(DownsampleConfig value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder config(Function<DownsampleConfig.Builder, ObjectBuilder<DownsampleConfig>> fn) {
			return this.config(fn.apply(new DownsampleConfig.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			DownsampleConfig value = (DownsampleConfig) DownsampleConfig._DESERIALIZER.deserialize(parser, mapper);
			return this.config(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DownsampleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DownsampleRequest build() {
			_checkSingleUse();

			return new DownsampleRequest(this);
		}
	}

	public static final JsonpDeserializer<DownsampleRequest> _DESERIALIZER = createDownsampleRequestDeserializer();
	protected static JsonpDeserializer<DownsampleRequest> createDownsampleRequestDeserializer() {

		JsonpDeserializer<DownsampleConfig> valueDeserializer = DownsampleConfig._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.config(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.downsample}".
	 */
	public static final Endpoint<DownsampleRequest, DownsampleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.downsample",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _targetIndex = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _targetIndex;
				propsSet |= _index;

				if (propsSet == (_index | _targetIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_downsample");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.targetIndex, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _targetIndex = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _targetIndex;
				propsSet |= _index;

				if (propsSet == (_index | _targetIndex)) {
					params.put("index", request.index);
					params.put("targetIndex", request.targetIndex);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, DownsampleResponse._DESERIALIZER);
}
