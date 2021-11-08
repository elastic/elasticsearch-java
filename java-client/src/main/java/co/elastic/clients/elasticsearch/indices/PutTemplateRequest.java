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
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.put_template.Request
@JsonpDeserializable
public class PutTemplateRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, Alias> aliases;

	@Nullable
	private final Boolean create;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean includeTypeName;

	private final List<String> indexPatterns;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final String masterTimeout;

	private final String name;

	@Nullable
	private final Integer order;

	private final Map<String, JsonData> settings;

	@Nullable
	private final String timeout;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutTemplateRequest(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.create = builder.create;
		this.flatSettings = builder.flatSettings;
		this.includeTypeName = builder.includeTypeName;
		this.indexPatterns = ModelTypeHelper.unmodifiable(builder.indexPatterns);
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.order = builder.order;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;
		this.version = builder.version;

	}

	public static PutTemplateRequest of(Function<Builder, ObjectBuilder<PutTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aliases for the index.
	 * <p>
	 * API name: {@code aliases}
	 */
	public final Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * If true, this request cannot replace or update existing index templates.
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public final Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public final Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Array of wildcard expressions used to match the names of indices during
	 * creation.
	 * <p>
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Mapping for fields in the index.
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
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The name of the template
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Order in which Elasticsearch applies this template if index matches multiple
	 * templates.
	 * <p>
	 * Templates with lower 'order' values are merged first. Templates with higher
	 * 'order' values are merged later, overriding templates with lower values.
	 * <p>
	 * API name: {@code order}
	 */
	@Nullable
	public final Integer order() {
		return this.order;
	}

	/**
	 * Configuration options for the index.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * Version number used to manage index templates externally. This number is not
	 * automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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
		if (ModelTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (this.order != null) {
			generator.writeKey("order");
			generator.write(this.order);

		}
		if (ModelTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTemplateRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutTemplateRequest> {
		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private Boolean create;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private List<String> indexPatterns;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private String masterTimeout;

		private String name;

		@Nullable
		private Integer order;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private String timeout;

		@Nullable
		private Long version;

		/**
		 * Aliases for the index.
		 * <p>
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
		 * If true, this request cannot replace or update existing index templates.
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * API name: {@code flat_settings}
		 */
		public final Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public final Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Array of wildcard expressions used to match the names of indices during
		 * creation.
		 * <p>
		 * API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(@Nullable List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * Array of wildcard expressions used to match the names of indices during
		 * creation.
		 * <p>
		 * API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Mapping for fields in the index.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Mapping for fields in the index.
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
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - The name of the template
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Order in which Elasticsearch applies this template if index matches multiple
		 * templates.
		 * <p>
		 * Templates with lower 'order' values are merged first. Templates with higher
		 * 'order' values are merged later, overriding templates with lower values.
		 * <p>
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable Integer value) {
			this.order = value;
			return this;
		}

		/**
		 * Configuration options for the index.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Version number used to manage index templates externally. This number is not
		 * automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTemplateRequest build() {
			_checkSingleUse();

			return new PutTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTemplateRequest}
	 */
	public static final JsonpDeserializer<PutTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutTemplateRequest::setupPutTemplateRequestDeserializer, Builder::build);

	protected static void setupPutTemplateRequestDeserializer(DelegatingDeserializer<PutTemplateRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::order, JsonpDeserializer.integerDeserializer(), "order");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_template}".
	 */
	public static final Endpoint<PutTemplateRequest, PutTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
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
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutTemplateResponse._DESERIALIZER);
}
