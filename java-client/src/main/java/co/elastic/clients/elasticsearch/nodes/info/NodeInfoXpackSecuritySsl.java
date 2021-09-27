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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackSecuritySsl
@JsonpDeserializable
public final class NodeInfoXpackSecuritySsl implements JsonpSerializable {
	private final Map<String, String> ssl;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoXpackSecuritySsl(Builder builder) {

		this.ssl = Objects.requireNonNull(builder.ssl, "ssl");

	}

	/**
	 * API name: {@code ssl}
	 */
	public Map<String, String> ssl() {
		return this.ssl;
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

		generator.writeKey("ssl");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.ssl.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackSecuritySsl}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackSecuritySsl> {
		private Map<String, String> ssl;

		/**
		 * API name: {@code ssl}
		 */
		public Builder ssl(Map<String, String> value) {
			this.ssl = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #ssl(Map)}, creating the map if needed.
		 */
		public Builder putSsl(String key, String value) {
			if (this.ssl == null) {
				this.ssl = new HashMap<>();
			}
			this.ssl.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackSecuritySsl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackSecuritySsl build() {

			return new NodeInfoXpackSecuritySsl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackSecuritySsl}
	 */
	public static final JsonpDeserializer<NodeInfoXpackSecuritySsl> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackSecuritySsl::setupNodeInfoXpackSecuritySslDeserializer, Builder::build);

	protected static void setupNodeInfoXpackSecuritySslDeserializer(
			DelegatingDeserializer<NodeInfoXpackSecuritySsl.Builder> op) {

		op.add(Builder::ssl, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "ssl");

	}

}
