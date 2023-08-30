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
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.WaitForActiveShards;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.Request

/**
 * Creates a new index for a data stream or index alias.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.rollover.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RolloverRequest extends RequestBase implements JsonpSerializable {
	private final String alias;

	private final Map<String, Alias> aliases;

	@Nullable
	private final RolloverConditions conditions;

	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final String newIndex;

	private final Map<String, JsonData> settings;

	@Nullable
	private final Time timeout;

	@Nullable
	private final WaitForActiveShards waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	private RolloverRequest(Builder builder) {

		this.alias = ApiTypeHelper.requireNonNull(builder.alias, this, "alias");
		this.aliases = ApiTypeHelper.unmodifiable(builder.aliases);
		this.conditions = builder.conditions;
		this.dryRun = builder.dryRun;
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.newIndex = builder.newIndex;
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static RolloverRequest of(Function<Builder, ObjectBuilder<RolloverRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the data stream or index alias to roll over.
	 * <p>
	 * API name: {@code alias}
	 */
	public final String alias() {
		return this.alias;
	}

	/**
	 * Aliases for the target index. Data streams do not support this parameter.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * Conditions for the rollover. If specified, Elasticsearch only performs the
	 * rollover if the current index satisfies these conditions. If this parameter
	 * is not specified, Elasticsearch performs the rollover unconditionally. If
	 * conditions are specified, at least one of them must be a <code>max_*</code>
	 * condition. The index will rollover if any <code>max_*</code> condition is
	 * satisfied and all <code>min_*</code> conditions are satisfied.
	 * <p>
	 * API name: {@code conditions}
	 */
	@Nullable
	public final RolloverConditions conditions() {
		return this.conditions;
	}

	/**
	 * If <code>true</code>, checks whether the current index satisfies the
	 * specified conditions but does not perform a rollover.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * Mapping for fields in the index. If specified, this mapping can include field
	 * names, field data types, and mapping paramaters.
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Name of the index to create. Supports date math. Data streams do not support
	 * this parameter.
	 * <p>
	 * API name: {@code new_index}
	 */
	@Nullable
	public final String newIndex() {
		return this.newIndex;
	}

	/**
	 * Configuration options for the index. Data streams do not support this
	 * parameter.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * The number of shard copies that must be active before proceeding with the
	 * operation. Set to all or any positive integer up to the total number of
	 * shards in the index (<code>number_of_replicas+1</code>).
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final WaitForActiveShards waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.aliases)) {
			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.conditions != null) {
			generator.writeKey("conditions");
			this.conditions.serialize(generator, mapper);

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<RolloverRequest> {
		private String alias;

		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private RolloverConditions conditions;

		@Nullable
		private Boolean dryRun;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private String newIndex;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private Time timeout;

		@Nullable
		private WaitForActiveShards waitForActiveShards;

		/**
		 * Required - Name of the data stream or index alias to roll over.
		 * <p>
		 * API name: {@code alias}
		 */
		public final Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * Aliases for the target index. Data streams do not support this parameter.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>aliases</code>.
		 */
		public final Builder aliases(Map<String, Alias> map) {
			this.aliases = _mapPutAll(this.aliases, map);
			return this;
		}

		/**
		 * Aliases for the target index. Data streams do not support this parameter.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code>.
		 */
		public final Builder aliases(String key, Alias value) {
			this.aliases = _mapPut(this.aliases, key, value);
			return this;
		}

		/**
		 * Aliases for the target index. Data streams do not support this parameter.
		 * <p>
		 * API name: {@code aliases}
		 * <p>
		 * Adds an entry to <code>aliases</code> using a builder lambda.
		 */
		public final Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return aliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * Conditions for the rollover. If specified, Elasticsearch only performs the
		 * rollover if the current index satisfies these conditions. If this parameter
		 * is not specified, Elasticsearch performs the rollover unconditionally. If
		 * conditions are specified, at least one of them must be a <code>max_*</code>
		 * condition. The index will rollover if any <code>max_*</code> condition is
		 * satisfied and all <code>min_*</code> conditions are satisfied.
		 * <p>
		 * API name: {@code conditions}
		 */
		public final Builder conditions(@Nullable RolloverConditions value) {
			this.conditions = value;
			return this;
		}

		/**
		 * Conditions for the rollover. If specified, Elasticsearch only performs the
		 * rollover if the current index satisfies these conditions. If this parameter
		 * is not specified, Elasticsearch performs the rollover unconditionally. If
		 * conditions are specified, at least one of them must be a <code>max_*</code>
		 * condition. The index will rollover if any <code>max_*</code> condition is
		 * satisfied and all <code>min_*</code> conditions are satisfied.
		 * <p>
		 * API name: {@code conditions}
		 */
		public final Builder conditions(Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.conditions(fn.apply(new RolloverConditions.Builder()).build());
		}

		/**
		 * If <code>true</code>, checks whether the current index satisfies the
		 * specified conditions but does not perform a rollover.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * Mapping for fields in the index. If specified, this mapping can include field
		 * names, field data types, and mapping paramaters.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Mapping for fields in the index. If specified, this mapping can include field
		 * names, field data types, and mapping paramaters.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Name of the index to create. Supports date math. Data streams do not support
		 * this parameter.
		 * <p>
		 * API name: {@code new_index}
		 */
		public final Builder newIndex(@Nullable String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * Configuration options for the index. Data streams do not support this
		 * parameter.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Configuration options for the index. Data streams do not support this
		 * parameter.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to all or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable WaitForActiveShards value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * The number of shard copies that must be active before proceeding with the
		 * operation. Set to all or any positive integer up to the total number of
		 * shards in the index (<code>number_of_replicas+1</code>).
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(
				Function<WaitForActiveShards.Builder, ObjectBuilder<WaitForActiveShards>> fn) {
			return this.waitForActiveShards(fn.apply(new WaitForActiveShards.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RolloverRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverRequest build() {
			_checkSingleUse();

			return new RolloverRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverRequest}
	 */
	public static final JsonpDeserializer<RolloverRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverRequest::setupRolloverRequestDeserializer);

	protected static void setupRolloverRequestDeserializer(ObjectDeserializer<RolloverRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::conditions, RolloverConditions._DESERIALIZER, "conditions");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.rollover}".
	 */
	public static final Endpoint<RolloverRequest, RolloverResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.rollover",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _newIndex = 1 << 0;
				final int _alias = 1 << 1;

				int propsSet = 0;

				if (request.newIndex() != null)
					propsSet |= _newIndex;
				propsSet |= _alias;

				if (propsSet == (_alias)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					return buf.toString();
				}
				if (propsSet == (_alias | _newIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.newIndex, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _newIndex = 1 << 0;
				final int _alias = 1 << 1;

				int propsSet = 0;

				if (request.newIndex() != null)
					propsSet |= _newIndex;
				propsSet |= _alias;

				if (propsSet == (_alias)) {
					params.put("alias", request.alias);
				}
				if (propsSet == (_alias | _newIndex)) {
					params.put("alias", request.alias);
					params.put("newIndex", request.newIndex);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards._toJsonString());
				}
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RolloverResponse._DESERIALIZER);
}
