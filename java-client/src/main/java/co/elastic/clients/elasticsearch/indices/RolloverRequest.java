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
import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.Request
public final class RolloverRequest extends RequestBase implements ToJsonp {
	private final String alias;

	@Nullable
	private final String newIndex;

	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Boolean includeTypeName;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final JsonValue waitForActiveShards;

	@Nullable
	private final Map<String, Alias> aliases;

	@Nullable
	private final RolloverConditions conditions;

	@Nullable
	private final JsonValue mappings;

	@Nullable
	private final Map<String, JsonValue> settings;

	// ---------------------------------------------------------------------------------------------

	protected RolloverRequest(Builder builder) {

		this.alias = Objects.requireNonNull(builder.alias, "alias");
		this.newIndex = builder.newIndex;
		this.dryRun = builder.dryRun;
		this.includeTypeName = builder.includeTypeName;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.aliases = builder.aliases;
		this.conditions = builder.conditions;
		this.mappings = builder.mappings;
		this.settings = builder.settings;

	}

	/**
	 * The name of the alias to rollover
	 * <p>
	 * API name: {@code alias}
	 */
	public String alias() {
		return this.alias;
	}

	/**
	 * The name of the rollover index
	 * <p>
	 * API name: {@code new_index}
	 */
	@Nullable
	public String newIndex() {
		return this.newIndex;
	}

	/**
	 * If set to true the rollover action will only be validated but not actually
	 * performed even if a condition matches. The default is false
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * Set the number of active shards to wait for on the newly created rollover
	 * index before the operation returns.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code conditions}
	 */
	@Nullable
	public RolloverConditions conditions() {
		return this.conditions;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public JsonValue mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonValue> settings() {
		return this.settings;
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

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.conditions != null) {

			generator.writeKey("conditions");
			this.conditions.toJsonp(generator, mapper);

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			generator.write(this.mappings);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverRequest}.
	 */
	public static class Builder implements ObjectBuilder<RolloverRequest> {
		private String alias;

		@Nullable
		private String newIndex;

		@Nullable
		private Boolean dryRun;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private JsonValue waitForActiveShards;

		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private RolloverConditions conditions;

		@Nullable
		private JsonValue mappings;

		@Nullable
		private Map<String, JsonValue> settings;

		/**
		 * The name of the alias to rollover
		 * <p>
		 * API name: {@code alias}
		 */
		public Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * The name of the rollover index
		 * <p>
		 * API name: {@code new_index}
		 */
		public Builder newIndex(@Nullable String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * If set to true the rollover action will only be validated but not actually
		 * performed even if a condition matches. The default is false
		 * <p>
		 * API name: {@code dry_run}
		 */
		public Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Set the number of active shards to wait for on the newly created rollover
		 * index before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Alias value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.putAliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(@Nullable RolloverConditions value) {
			this.conditions = value;
			return this;
		}

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.conditions(fn.apply(new RolloverConditions.Builder()).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable JsonValue value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonValue> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonValue value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link RolloverRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverRequest build() {

			return new RolloverRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RolloverRequest
	 */
	public static final JsonpDeserializer<RolloverRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RolloverRequest::setupRolloverRequestDeserializer);

	protected static void setupRolloverRequestDeserializer(DelegatingDeserializer<RolloverRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias.DESERIALIZER), "aliases");
		op.add(Builder::conditions, RolloverConditions.DESERIALIZER, "conditions");
		op.add(Builder::mappings, JsonpDeserializer.jsonValueDeserializer(), "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.rollover}".
	 */
	public static final Endpoint<RolloverRequest, RolloverResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _alias = 1 << 0;
				final int _newIndex = 1 << 1;

				int propsSet = 0;

				if (request.alias() != null)
					propsSet |= _alias;
				if (request.newIndex() != null)
					propsSet |= _newIndex;

				if (propsSet == (_alias)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.alias);
					buf.append("/_rollover");
					return buf.toString();
				}
				if (propsSet == (_alias | _newIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.alias);
					buf.append("/_rollover");
					buf.append("/");
					buf.append(request.newIndex);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", request.waitForActiveShards.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, RolloverResponse.DESERIALIZER);
}
