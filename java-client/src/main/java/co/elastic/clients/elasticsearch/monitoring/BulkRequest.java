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

package co.elastic.clients.elasticsearch.monitoring;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

// typedef: monitoring.bulk.Request

/**
 * Used by the monitoring features to send monitoring data.
 * 
 * @see <a href="../doc-files/api-spec.html#monitoring.bulk.Request">API
 *      specification</a>
 */

public class BulkRequest extends RequestBase implements NdJsonpSerializable, JsonpSerializable {
	private final Time interval;

	private final String systemApiVersion;

	private final String systemId;

	@Nullable
	private final String type;

	private final List<BulkOperation> operations;

	// ---------------------------------------------------------------------------------------------

	private BulkRequest(Builder builder) {

		this.interval = ApiTypeHelper.requireNonNull(builder.interval, this, "interval");
		this.systemApiVersion = ApiTypeHelper.requireNonNull(builder.systemApiVersion, this, "systemApiVersion");
		this.systemId = ApiTypeHelper.requireNonNull(builder.systemId, this, "systemId");
		this.type = builder.type;
		this.operations = ApiTypeHelper.unmodifiableRequired(builder.operations, this, "operations");

	}

	public static BulkRequest of(Function<Builder, ObjectBuilder<BulkRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	@Override
	public Iterator<?> _serializables() {
		return this.operations.iterator();
	}
	/**
	 * Required - Collection interval (e.g., '10s' or '10000ms') of the payload
	 * <p>
	 * API name: {@code interval}
	 */
	public final Time interval() {
		return this.interval;
	}

	/**
	 * Required -
	 * <p>
	 * API name: {@code system_api_version}
	 */
	public final String systemApiVersion() {
		return this.systemApiVersion;
	}

	/**
	 * Required - Identifier of the monitored system
	 * <p>
	 * API name: {@code system_id}
	 */
	public final String systemId() {
		return this.systemId;
	}

	/**
	 * Default document type for items which don't provide one
	 * <p>
	 * API name: {@code type}
	 * 
	 * @deprecated 7.0.0
	 */
	@Deprecated
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * Required - Request body.
	 */
	public final List<BulkOperation> operations() {
		return this.operations;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (BulkOperation item0 : this.operations) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<BulkRequest> {
		private Time interval;

		private String systemApiVersion;

		private String systemId;

		@Nullable
		private String type;

		private List<BulkOperation> operations;

		/**
		 * Required - Collection interval (e.g., '10s' or '10000ms') of the payload
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(Time value) {
			this.interval = value;
			return this;
		}

		/**
		 * Required - Collection interval (e.g., '10s' or '10000ms') of the payload
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required -
		 * <p>
		 * API name: {@code system_api_version}
		 */
		public final Builder systemApiVersion(String value) {
			this.systemApiVersion = value;
			return this;
		}

		/**
		 * Required - Identifier of the monitored system
		 * <p>
		 * API name: {@code system_id}
		 */
		public final Builder systemId(String value) {
			this.systemId = value;
			return this;
		}

		/**
		 * Default document type for items which don't provide one
		 * <p>
		 * API name: {@code type}
		 * 
		 * @deprecated 7.0.0
		 */
		@Deprecated
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>operations</code>.
		 */
		public final Builder operations(List<BulkOperation> list) {
			this.operations = _listAddAll(this.operations, list);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds one or more values to <code>operations</code>.
		 */
		public final Builder operations(BulkOperation value, BulkOperation... values) {
			this.operations = _listAdd(this.operations, value, values);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds a value to <code>operations</code> using a builder lambda.
		 */
		public final Builder operations(Function<BulkOperation.Builder, ObjectBuilder<BulkOperation>> fn) {
			return operations(fn.apply(new BulkOperation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkRequest build() {
			_checkSingleUse();

			return new BulkRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code monitoring.bulk}".
	 */
	public static final Endpoint<BulkRequest, BulkResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/monitoring.bulk",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _type = 1 << 0;

				int propsSet = 0;

				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_monitoring");
					buf.append("/bulk");
					return buf.toString();
				}
				if (propsSet == (_type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_monitoring");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.type, buf);
					buf.append("/bulk");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _type = 1 << 0;

				int propsSet = 0;

				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == 0) {
				}
				if (propsSet == (_type)) {
					params.put("type", request.type);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("system_id", request.systemId);
				params.put("system_api_version", request.systemApiVersion);
				params.put("interval", request.interval._toJsonString());
				return params;

			}, SimpleEndpoint.emptyMap(), true, BulkResponse._DESERIALIZER);
}
