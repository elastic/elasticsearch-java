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

package co.elastic.clients.elasticsearch.security.get_service_credentials;

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
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.NodesCredentialsFileToken
public final class NodesCredentialsFileToken implements JsonpSerializable {
	private final List<String> nodes;

	// ---------------------------------------------------------------------------------------------

	public NodesCredentialsFileToken(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public List<String> nodes() {
		return this.nodes;
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

		generator.writeKey("nodes");
		generator.writeStartArray();
		for (String item0 : this.nodes) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesCredentialsFileToken}.
	 */
	public static class Builder implements ObjectBuilder<NodesCredentialsFileToken> {
		private List<String> nodes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(List<String> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(String... value) {
			this.nodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodes(List)}, creating the list if needed.
		 */
		public Builder addNodes(String value) {
			if (this.nodes == null) {
				this.nodes = new ArrayList<>();
			}
			this.nodes.add(value);
			return this;
		}

		/**
		 * Builds a {@link NodesCredentialsFileToken}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesCredentialsFileToken build() {

			return new NodesCredentialsFileToken(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesCredentialsFileToken}
	 */
	public static final JsonpDeserializer<NodesCredentialsFileToken> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodesCredentialsFileToken::setupNodesCredentialsFileTokenDeserializer);

	protected static void setupNodesCredentialsFileTokenDeserializer(
			DelegatingDeserializer<NodesCredentialsFileToken.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "nodes");

	}

}
