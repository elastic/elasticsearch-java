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
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class CreateIndexRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final Boolean includeTypeName;

	private final String index;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	private CreateIndexRequest(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.includeTypeName = builder.includeTypeName;
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.settings = builder.settings;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public static CreateIndexRequest of(Function<Builder, ObjectBuilder<CreateIndexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public final Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Required - The name of the index
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
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
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public final IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Set the number of active shards to wait for before the operation returns.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
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

		if (ModelTypeHelper.isDefined(this.aliases)) {
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
			this.mappings.serialize(generator, mapper);

		}
		if (this.settings != null) {
			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateIndexRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateIndexRequest> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private Boolean includeTypeName;

		private String index;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private String masterTimeout;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		/**
		 * API name: {@code aliases}
		 */
		public final Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		public final Builder aliases(
				Function<MapBuilder<String, Alias, Alias.Builder>, ObjectBuilder<Map<String, Alias>>> fn) {
			return aliases(fn.apply(new MapBuilder<>(Alias.Builder::new)).build());
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public final Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Required - The name of the index
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
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
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
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
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Set the number of active shards to wait for before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
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
			_checkSingleUse();

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
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");

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
