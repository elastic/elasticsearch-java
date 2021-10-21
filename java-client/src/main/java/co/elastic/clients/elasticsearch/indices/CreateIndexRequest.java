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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
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

// typedef: indices.create.Request
@JsonpDeserializable
public final class CreateIndexRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Map<String, Alias> aliases;

	@Nullable
	private final Boolean includeTypeName;

	private final String index;

	@Nullable
	private final JsonValue /*
							 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
							 * false) | _types.mapping.TypeMapping)
							 */ mappings;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final Map<String, JsonData> settings;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	public CreateIndexRequest(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.includeTypeName = builder.includeTypeName;
		this.index = Objects.requireNonNull(builder.index, "index");
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public CreateIndexRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Required - The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Mapping for fields in the index. If specified, this mapping can include:
	 * <ul>
	 * <li>Field names</li>
	 * <li>Field data types</li>
	 * <li>Mapping parameters</li>
	 * </ul>
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public JsonValue /*
						 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
						 * false) | _types.mapping.TypeMapping)
						 */ mappings() {
		return this.mappings;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonData> settings() {
		return this.settings;
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
	 * Set the number of active shards to wait for before the operation returns.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
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

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			generator.write(this.mappings);

		}
		if (this.settings != null) {

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
	 * Builder for {@link CreateIndexRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateIndexRequest> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private Boolean includeTypeName;

		private String index;

		@Nullable
		private JsonValue /*
							 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
							 * false) | _types.mapping.TypeMapping)
							 */ mappings;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

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
		 * API name: {@code include_type_name}
		 */
		public Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Required - The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Mapping for fields in the index. If specified, this mapping can include:
		 * <ul>
		 * <li>Field names</li>
		 * <li>Field data types</li>
		 * <li>Mapping parameters</li>
		 * </ul>
		 * <p>
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable JsonValue /*
													 * Union(Dictionary<internal.string, _types.mapping.TypeMapping>
													 * (singleKey = false) | _types.mapping.TypeMapping)
													 */ value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonData value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Set the number of active shards to wait for before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Builds a {@link CreateIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateIndexRequest build() {

			return new CreateIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateIndexRequest}
	 */
	public static final JsonpDeserializer<CreateIndexRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateIndexRequest::setupCreateIndexRequestDeserializer, Builder::build);

	protected static void setupCreateIndexRequestDeserializer(DelegatingDeserializer<CreateIndexRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::mappings, JsonpDeserializer.jsonValueDeserializer(), "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.create}".
	 */
	public static final Endpoint<CreateIndexRequest, CreateIndexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CreateIndexResponse._DESERIALIZER);
}
