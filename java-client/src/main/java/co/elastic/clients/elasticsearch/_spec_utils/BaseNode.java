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

package co.elastic.clients.elasticsearch._spec_utils;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _spec_utils.BaseNode
public abstract class BaseNode implements ToJsonp {
	private final Map<String, String> attributes;

	private final String host;

	private final String ip;

	private final String name;

	@Nullable
	private final List<JsonValue> roles;

	private final String transportAddress;

	// ---------------------------------------------------------------------------------------------

	protected BaseNode(AbstractBuilder<?> builder) {

		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");
		this.host = Objects.requireNonNull(builder.host, "host");
		this.ip = Objects.requireNonNull(builder.ip, "ip");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.roles = builder.roles;
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");

	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code ip}
	 */
	public String ip() {
		return this.ip;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code roles}
	 */
	@Nullable
	public List<JsonValue> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
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

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("ip");
		generator.write(this.ip);

		generator.writeKey("name");
		generator.write(this.name);

		if (this.roles != null) {

			generator.writeKey("roles");
			generator.writeStartArray();
			for (JsonValue item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private Map<String, String> attributes;

		private String host;

		private String ip;

		private String name;

		@Nullable
		private List<JsonValue> roles;

		private String transportAddress;

		/**
		 * API name: {@code attributes}
		 */
		public BuilderT attributes(Map<String, String> value) {
			this.attributes = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public BuilderT putAttributes(String key, String value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return self();
		}

		/**
		 * API name: {@code host}
		 */
		public BuilderT host(String value) {
			this.host = value;
			return self();
		}

		/**
		 * API name: {@code ip}
		 */
		public BuilderT ip(String value) {
			this.ip = value;
			return self();
		}

		/**
		 * API name: {@code name}
		 */
		public BuilderT name(String value) {
			this.name = value;
			return self();
		}

		/**
		 * API name: {@code roles}
		 */
		public BuilderT roles(@Nullable List<JsonValue> value) {
			this.roles = value;
			return self();
		}

		/**
		 * API name: {@code roles}
		 */
		public BuilderT roles(JsonValue... value) {
			this.roles = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public BuilderT addRoles(JsonValue value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return self();
		}

		/**
		 * API name: {@code transport_address}
		 */
		public BuilderT transportAddress(String value) {
			this.transportAddress = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBaseNodeDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::attributes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "attributes");
		op.add(AbstractBuilder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(AbstractBuilder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"roles");
		op.add(AbstractBuilder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");

	}

}
