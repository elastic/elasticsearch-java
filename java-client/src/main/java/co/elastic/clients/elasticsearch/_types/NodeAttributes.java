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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeAttributes
@JsonpDeserializable
public final class NodeAttributes implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final String ephemeralId;

	@Nullable
	private final String id;

	private final String name;

	private final String transportAddress;

	@Nullable
	private final List<NodeRole> roles;

	// ---------------------------------------------------------------------------------------------

	public NodeAttributes(Builder builder) {

		this.attributes = ModelTypeHelper.unmodifiableNonNull(builder.attributes, "attributes");
		this.ephemeralId = Objects.requireNonNull(builder.ephemeralId, "ephemeral_id");
		this.id = builder.id;
		this.name = Objects.requireNonNull(builder.name, "name");
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");
		this.roles = ModelTypeHelper.unmodifiable(builder.roles);

	}

	public NodeAttributes(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Lists node attributes.
	 * <p>
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - The ephemeral ID of the node.
	 * <p>
	 * API name: {@code ephemeral_id}
	 */
	public String ephemeralId() {
		return this.ephemeralId;
	}

	/**
	 * The unique identifier of the node.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * Required - The unique identifier of the node.
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - The host and port where transport HTTP connections are accepted.
	 * <p>
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * API name: {@code roles}
	 */
	@Nullable
	public List<NodeRole> roles() {
		return this.roles;
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

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("ephemeral_id");
		generator.write(this.ephemeralId);

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		if (this.roles != null) {

			generator.writeKey("roles");
			generator.writeStartArray();
			for (NodeRole item0 : this.roles) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeAttributes}.
	 */
	public static class Builder implements ObjectBuilder<NodeAttributes> {
		private Map<String, String> attributes;

		private String ephemeralId;

		@Nullable
		private String id;

		private String name;

		private String transportAddress;

		@Nullable
		private List<NodeRole> roles;

		/**
		 * Required - Lists node attributes.
		 * <p>
		 * API name: {@code attributes}
		 */
		public Builder attributes(Map<String, String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public Builder putAttributes(String key, String value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return this;
		}

		/**
		 * Required - The ephemeral ID of the node.
		 * <p>
		 * API name: {@code ephemeral_id}
		 */
		public Builder ephemeralId(String value) {
			this.ephemeralId = value;
			return this;
		}

		/**
		 * The unique identifier of the node.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the node.
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The host and port where transport HTTP connections are accepted.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(@Nullable List<NodeRole> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(NodeRole... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(NodeRole value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * Builds a {@link NodeAttributes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeAttributes build() {

			return new NodeAttributes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeAttributes}
	 */
	public static final JsonpDeserializer<NodeAttributes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeAttributes::setupNodeAttributesDeserializer, Builder::build);

	protected static void setupNodeAttributesDeserializer(DelegatingDeserializer<NodeAttributes.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::ephemeralId, JsonpDeserializer.stringDeserializer(), "ephemeral_id");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(NodeRole._DESERIALIZER), "roles");

	}

}
