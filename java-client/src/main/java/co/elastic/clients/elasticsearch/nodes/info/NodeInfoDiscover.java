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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoDiscover
public final class NodeInfoDiscover implements ToJsonp {
	private final String seedHosts;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoDiscover(Builder builder) {

		this.seedHosts = Objects.requireNonNull(builder.seedHosts, "seed_hosts");

	}

	/**
	 * API name: {@code seed_hosts}
	 */
	public String seedHosts() {
		return this.seedHosts;
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

		generator.writeKey("seed_hosts");
		generator.write(this.seedHosts);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoDiscover}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoDiscover> {
		private String seedHosts;

		/**
		 * API name: {@code seed_hosts}
		 */
		public Builder seedHosts(String value) {
			this.seedHosts = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoDiscover}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoDiscover build() {

			return new NodeInfoDiscover(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoDiscover
	 */
	public static final JsonpDeserializer<NodeInfoDiscover> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoDiscover::setupNodeInfoDiscoverDeserializer);

	protected static void setupNodeInfoDiscoverDeserializer(DelegatingDeserializer<NodeInfoDiscover.Builder> op) {

		op.add(Builder::seedHosts, JsonpDeserializer.stringDeserializer(), "seed_hosts");

	}

}
