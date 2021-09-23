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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoSearchRemote
public final class NodeInfoSearchRemote implements JsonpSerializable {
	private final String connect;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoSearchRemote(Builder builder) {

		this.connect = Objects.requireNonNull(builder.connect, "connect");

	}

	/**
	 * API name: {@code connect}
	 */
	public String connect() {
		return this.connect;
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

		generator.writeKey("connect");
		generator.write(this.connect);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSearchRemote}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSearchRemote> {
		private String connect;

		/**
		 * API name: {@code connect}
		 */
		public Builder connect(String value) {
			this.connect = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSearchRemote}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSearchRemote build() {

			return new NodeInfoSearchRemote(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoSearchRemote}
	 */
	public static final JsonpDeserializer<NodeInfoSearchRemote> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoSearchRemote::setupNodeInfoSearchRemoteDeserializer);

	protected static void setupNodeInfoSearchRemoteDeserializer(
			DelegatingDeserializer<NodeInfoSearchRemote.Builder> op) {

		op.add(Builder::connect, JsonpDeserializer.stringDeserializer(), "connect");

	}

}
