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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.VersionType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.create.Request

public final class CreateRequest<TDocument> extends RequestBase implements JsonpSerializable {
	private final String id;

	private final String index;

	@Nullable
	private final String type;

	@Nullable
	private final String pipeline;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final String routing;

	@Nullable
	private final String timeout;

	@Nullable
	private final Long version;

	@Nullable
	private final VersionType versionType;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	private final TDocument value;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public CreateRequest(Builder<TDocument> builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.type = builder.type;
		this.pipeline = builder.pipeline;
		this.refresh = builder.refresh;
		this.routing = builder.routing;
		this.timeout = builder.timeout;
		this.version = builder.version;
		this.versionType = builder.versionType;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	/**
	 * Document ID
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * The type of the document
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * The pipeline id to preprocess incoming documents with
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * If <code>true</code> then refresh the affected shards to make this operation
	 * visible to search, if <code>wait_for</code> then wait for a refresh to make
	 * this operation visible to search, if <code>false</code> (the default) then do
	 * nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Explicit version number for concurrency control
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * Specific version type
	 * <p>
	 * API name: {@code version_type}
	 */
	@Nullable
	public VersionType versionType() {
		return this.versionType;
	}

	/**
	 * Sets the number of shard copies that must be active before proceeding with
	 * the index operation. Defaults to 1, meaning the primary shard only. Set to
	 * <code>all</code> for all shard copies, otherwise set to any non-negative
	 * value less than or equal to the total number of copies for the shard (number
	 * of replicas + 1)
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public TDocument value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		JsonpUtils.serialize(this.value, generator, tDocumentSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRequest}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<CreateRequest<TDocument>> {
		private String id;

		private String index;

		@Nullable
		private String type;

		@Nullable
		private String pipeline;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private String routing;

		@Nullable
		private String timeout;

		@Nullable
		private Long version;

		@Nullable
		private VersionType versionType;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		private TDocument value;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Document ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder<TDocument> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder<TDocument> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * The type of the document
		 * <p>
		 * API name: {@code type}
		 */
		public Builder<TDocument> type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The pipeline id to preprocess incoming documents with
		 * <p>
		 * API name: {@code pipeline}
		 */
		public Builder<TDocument> pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * If <code>true</code> then refresh the affected shards to make this operation
		 * visible to search, if <code>wait_for</code> then wait for a refresh to make
		 * this operation visible to search, if <code>false</code> (the default) then do
		 * nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder<TDocument> refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder<TDocument> routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder<TDocument> timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit version number for concurrency control
		 * <p>
		 * API name: {@code version}
		 */
		public Builder<TDocument> version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Specific version type
		 * <p>
		 * API name: {@code version_type}
		 */
		public Builder<TDocument> versionType(@Nullable VersionType value) {
			this.versionType = value;
			return this;
		}

		/**
		 * Sets the number of shard copies that must be active before proceeding with
		 * the index operation. Defaults to 1, meaning the primary shard only. Set to
		 * <code>all</code> for all shard copies, otherwise set to any non-negative
		 * value less than or equal to the total number of copies for the shard (number
		 * of replicas + 1)
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder<TDocument> waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder<TDocument> value(TDocument value) {
			this.value = value;
			return this;
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link CreateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateRequest<TDocument> build() {

			return new CreateRequest<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for CreateRequest
	 */
	public static <TDocument> JsonpDeserializer<CreateRequest<TDocument>> createCreateRequestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForValue((Supplier<Builder<TDocument>>) Builder::new,
				op -> CreateRequest.setupCreateRequestDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupCreateRequestDeserializer(
			DelegatingDeserializer<CreateRequest.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::value, tDocumentDeserializer, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code create}".
	 */
	public static final Endpoint<CreateRequest<?>, CreateResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;
				final int _index = 1 << 1;
				final int _type = 1 << 2;

				int propsSet = 0;

				propsSet |= _id;
				propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == (_index | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/_create");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				if (propsSet == (_index | _type | _id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index);
					buf.append("/");
					buf.append(request.type);
					buf.append("/");
					buf.append(request.id);
					buf.append("/_create");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.pipeline != null) {
					params.put("pipeline", request.pipeline);
				}
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				if (request.version != null) {
					params.put("version", String.valueOf(request.version));
				}
				if (request.versionType != null) {
					params.put("version_type", request.versionType.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, CreateResponse._DESERIALIZER);
}
