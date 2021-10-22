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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.split.Request
@JsonpDeserializable
public final class SplitRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Map<String, Alias> aliases;

	private final String index;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final Map<String, JsonData> settings;

	private final String target;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	public SplitRequest(Builder builder) {

		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.index = Objects.requireNonNull(builder.index, "index");
		this.masterTimeout = builder.masterTimeout;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);
		this.target = Objects.requireNonNull(builder.target, "target");
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public SplitRequest(Function<Builder, Builder> fn) {
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
	 * Required - The name of the source index to split
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
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
	 * Required - The name of the target index to split into
	 * <p>
	 * API name: {@code target}
	 */
	public String target() {
		return this.target;
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
	 * Set the number of active shards to wait for on the shrunken index before the
	 * operation returns.
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
	 * Builder for {@link SplitRequest}.
	 */
	public static class Builder implements ObjectBuilder<SplitRequest> {
		@Nullable
		private Map<String, Alias> aliases;

		private String index;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Map<String, JsonData> settings;

		private String target;

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
		 * Required - The name of the source index to split
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
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
		 * Required - The name of the target index to split into
		 * <p>
		 * API name: {@code target}
		 */
		public Builder target(String value) {
			this.target = value;
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
		 * Set the number of active shards to wait for on the shrunken index before the
		 * operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Builds a {@link SplitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SplitRequest build() {

			return new SplitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SplitRequest}
	 */
	public static final JsonpDeserializer<SplitRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SplitRequest::setupSplitRequestDeserializer, Builder::build);

	protected static void setupSplitRequestDeserializer(DelegatingDeserializer<SplitRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.split}".
	 */
	public static final Endpoint<SplitRequest, SplitResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _target = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _target;

				if (propsSet == (_index | _target)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_split");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.target, buf);
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
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SplitResponse._DESERIALIZER);
}
