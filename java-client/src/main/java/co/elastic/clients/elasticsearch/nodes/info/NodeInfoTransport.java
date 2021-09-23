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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoTransport
public final class NodeInfoTransport implements JsonpSerializable {
	private final List<String> boundAddress;

	private final String publishAddress;

	private final Map<String, String> profiles;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoTransport(Builder builder) {

		this.boundAddress = Objects.requireNonNull(builder.boundAddress, "bound_address");
		this.publishAddress = Objects.requireNonNull(builder.publishAddress, "publish_address");
		this.profiles = Objects.requireNonNull(builder.profiles, "profiles");

	}

	/**
	 * API name: {@code bound_address}
	 */
	public List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * API name: {@code publish_address}
	 */
	public String publishAddress() {
		return this.publishAddress;
	}

	/**
	 * API name: {@code profiles}
	 */
	public Map<String, String> profiles() {
		return this.profiles;
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

		generator.writeKey("bound_address");
		generator.writeStartArray();
		for (String item0 : this.boundAddress) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

		generator.writeKey("profiles");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.profiles.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoTransport}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoTransport> {
		private List<String> boundAddress;

		private String publishAddress;

		private Map<String, String> profiles;

		/**
		 * API name: {@code bound_address}
		 */
		public Builder boundAddress(List<String> value) {
			this.boundAddress = value;
			return this;
		}

		/**
		 * API name: {@code bound_address}
		 */
		public Builder boundAddress(String... value) {
			this.boundAddress = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #boundAddress(List)}, creating the list if needed.
		 */
		public Builder addBoundAddress(String value) {
			if (this.boundAddress == null) {
				this.boundAddress = new ArrayList<>();
			}
			this.boundAddress.add(value);
			return this;
		}

		/**
		 * API name: {@code publish_address}
		 */
		public Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		/**
		 * API name: {@code profiles}
		 */
		public Builder profiles(Map<String, String> value) {
			this.profiles = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #profiles(Map)}, creating the map if needed.
		 */
		public Builder putProfiles(String key, String value) {
			if (this.profiles == null) {
				this.profiles = new HashMap<>();
			}
			this.profiles.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoTransport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoTransport build() {

			return new NodeInfoTransport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoTransport}
	 */
	public static final JsonpDeserializer<NodeInfoTransport> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoTransport::setupNodeInfoTransportDeserializer);

	protected static void setupNodeInfoTransportDeserializer(DelegatingDeserializer<NodeInfoTransport.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");
		op.add(Builder::profiles, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"profiles");

	}

}
