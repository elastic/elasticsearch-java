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

package co.elastic.clients.elasticsearch.nodes.info;

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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSettingsNode
public final class NodeInfoSettingsNode implements ToJsonp {
	private final String name;

	private final Map<String, JsonValue> attr;

	@Nullable
	private final String maxLocalStorageNodes;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsNode(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.attr = Objects.requireNonNull(builder.attr, "attr");
		this.maxLocalStorageNodes = builder.maxLocalStorageNodes;

	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code attr}
	 */
	public Map<String, JsonValue> attr() {
		return this.attr;
	}

	/**
	 * API name: {@code max_local_storage_nodes}
	 */
	@Nullable
	public String maxLocalStorageNodes() {
		return this.maxLocalStorageNodes;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("attr");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.attr.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		if (this.maxLocalStorageNodes != null) {

			generator.writeKey("max_local_storage_nodes");
			generator.write(this.maxLocalStorageNodes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsNode}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsNode> {
		private String name;

		private Map<String, JsonValue> attr;

		@Nullable
		private String maxLocalStorageNodes;

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code attr}
		 */
		public Builder attr(Map<String, JsonValue> value) {
			this.attr = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attr(Map)}, creating the map if needed.
		 */
		public Builder putAttr(String key, JsonValue value) {
			if (this.attr == null) {
				this.attr = new HashMap<>();
			}
			this.attr.put(key, value);
			return this;
		}

		/**
		 * API name: {@code max_local_storage_nodes}
		 */
		public Builder maxLocalStorageNodes(@Nullable String value) {
			this.maxLocalStorageNodes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsNode build() {

			return new NodeInfoSettingsNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoSettingsNode
	 */
	public static final JsonpDeserializer<NodeInfoSettingsNode> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSettingsNode::setupNodeInfoSettingsNodeDeserializer);

	protected static void setupNodeInfoSettingsNodeDeserializer(
			DelegatingDeserializer<NodeInfoSettingsNode.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::attr, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"attr");
		op.add(Builder::maxLocalStorageNodes, JsonpDeserializer.stringDeserializer(), "max_local_storage_nodes");

	}

}
