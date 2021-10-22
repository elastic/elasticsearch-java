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

package co.elastic.clients.elasticsearch.security;

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
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_role_mapping.Request
@JsonpDeserializable
public final class PutRoleMappingRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Map<String, JsonData> metadata;

	private final String name;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final List<String> roles;

	@Nullable
	private final RoleMappingRule rules;

	@Nullable
	private final List<String> runAs;

	// ---------------------------------------------------------------------------------------------

	public PutRoleMappingRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.name = Objects.requireNonNull(builder.name, "name");
		this.refresh = builder.refresh;
		this.roles = ModelTypeHelper.unmodifiable(builder.roles);
		this.rules = builder.rules;
		this.runAs = ModelTypeHelper.unmodifiable(builder.runAs);

	}

	public PutRoleMappingRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - Role-mapping name
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code roles}
	 */
	@Nullable
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code rules}
	 */
	@Nullable
	public RoleMappingRule rules() {
		return this.rules;
	}

	/**
	 * API name: {@code run_as}
	 */
	@Nullable
	public List<String> runAs() {
		return this.runAs;
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

		if (this.enabled != null) {

			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.roles != null) {

			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.rules != null) {

			generator.writeKey("rules");
			this.rules.serialize(generator, mapper);

		}
		if (this.runAs != null) {

			generator.writeKey("run_as");
			generator.writeStartArray();
			for (String item0 : this.runAs) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleMappingRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutRoleMappingRequest> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private List<String> roles;

		@Nullable
		private RoleMappingRule rules;

		@Nullable
		private List<String> runAs;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * Required - Role-mapping name
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(@Nullable List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public Builder rules(@Nullable RoleMappingRule value) {
			this.rules = value;
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public Builder rules(Function<RoleMappingRule.Builder, ObjectBuilder<RoleMappingRule>> fn) {
			return this.rules(fn.apply(new RoleMappingRule.Builder()).build());
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(@Nullable List<String> value) {
			this.runAs = value;
			return this;
		}

		/**
		 * API name: {@code run_as}
		 */
		public Builder runAs(String... value) {
			this.runAs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #runAs(List)}, creating the list if needed.
		 */
		public Builder addRunAs(String value) {
			if (this.runAs == null) {
				this.runAs = new ArrayList<>();
			}
			this.runAs.add(value);
			return this;
		}

		/**
		 * Builds a {@link PutRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleMappingRequest build() {

			return new PutRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRoleMappingRequest}
	 */
	public static final JsonpDeserializer<PutRoleMappingRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRoleMappingRequest::setupPutRoleMappingRequestDeserializer, Builder::build);

	protected static void setupPutRoleMappingRequestDeserializer(
			DelegatingDeserializer<PutRoleMappingRequest.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::rules, RoleMappingRule._DESERIALIZER, "rules");
		op.add(Builder::runAs, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "run_as");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_role_mapping}".
	 */
	public static final Endpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRoleMappingResponse._DESERIALIZER);
}
