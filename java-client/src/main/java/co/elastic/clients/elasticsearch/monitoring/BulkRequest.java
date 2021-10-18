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

package co.elastic.clients.elasticsearch.monitoring;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: monitoring.bulk.Request

public final class BulkRequest<TSource> extends RequestBase implements NdJsonpSerializable, JsonpSerializable {
	@Nullable
	private final String type;

	private final String systemId;

	private final String systemApiVersion;

	private final String interval;

	private final List<JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */> operations;

	@Nullable
	private final JsonpSerializer<TSource> tSourceSerializer;

	// ---------------------------------------------------------------------------------------------

	public BulkRequest(Builder<TSource> builder) {

		this.type = builder.type;
		this.systemId = Objects.requireNonNull(builder.systemId, "system_id");
		this.systemApiVersion = Objects.requireNonNull(builder.systemApiVersion, "system_api_version");
		this.interval = Objects.requireNonNull(builder.interval, "interval");
		this.operations = ModelTypeHelper.unmodifiableNonNull(builder.operations, "_value_body");
		this.tSourceSerializer = builder.tSourceSerializer;

	}

	public BulkRequest(Function<Builder<TSource>, Builder<TSource>> fn) {
		this(fn.apply(new Builder<>()));
	}

	@Override
	public Iterator<?> _serializables() {
		return this.operations.iterator();
	}
	/**
	 * Default document type for items which don't provide one
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Required - Identifier of the monitored system
	 * <p>
	 * API name: {@code system_id}
	 */
	public String systemId() {
		return this.systemId;
	}

	/**
	 * Required -
	 * <p>
	 * API name: {@code system_api_version}
	 */
	public String systemApiVersion() {
		return this.systemApiVersion;
	}

	/**
	 * Required - Collection interval (e.g., '10s' or '10000ms') of the payload
	 * <p>
	 * API name: {@code interval}
	 */
	public String interval() {
		return this.interval;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */> operations() {
		return this.operations;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */ item0 : this.operations) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkRequest}.
	 */
	public static class Builder<TSource> implements ObjectBuilder<BulkRequest<TSource>> {
		@Nullable
		private String type;

		private String systemId;

		private String systemApiVersion;

		private String interval;

		private List<JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */> operations;

		@Nullable
		private JsonpSerializer<TSource> tSourceSerializer;

		/**
		 * Default document type for items which don't provide one
		 * <p>
		 * API name: {@code type}
		 */
		public Builder<TSource> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - Identifier of the monitored system
		 * <p>
		 * API name: {@code system_id}
		 */
		public Builder<TSource> systemId(String value) {
			this.systemId = value;
			return this;
		}

		/**
		 * Required -
		 * <p>
		 * API name: {@code system_api_version}
		 */
		public Builder<TSource> systemApiVersion(String value) {
			this.systemApiVersion = value;
			return this;
		}

		/**
		 * Required - Collection interval (e.g., '10s' or '10000ms') of the payload
		 * <p>
		 * API name: {@code interval}
		 */
		public Builder<TSource> interval(String value) {
			this.interval = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder<TSource> operations(
				List<JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */> value) {
			this.operations = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder<TSource> operations(
				JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */... value) {
			this.operations = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #operations(List)}, creating the list if needed.
		 */
		public Builder<TSource> addOperations(
				JsonValue /* Union(_global.bulk.OperationContainer | monitoring.bulk.TSource) */ value) {
			if (this.operations == null) {
				this.operations = new ArrayList<>();
			}
			this.operations.add(value);
			return this;
		}

		/**
		 * Serializer for TSource. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TSource> tSourceSerializer(@Nullable JsonpSerializer<TSource> value) {
			this.tSourceSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link BulkRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkRequest<TSource> build() {

			return new BulkRequest<TSource>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code monitoring.bulk}".
	 */
	public static final Endpoint<BulkRequest<?>, BulkResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("system_id", request.systemId);
				params.put("system_api_version", request.systemApiVersion);
				params.put("interval", request.interval);
				return params;

			}, SimpleEndpoint.emptyMap(), true, BulkResponse._DESERIALIZER);
}
