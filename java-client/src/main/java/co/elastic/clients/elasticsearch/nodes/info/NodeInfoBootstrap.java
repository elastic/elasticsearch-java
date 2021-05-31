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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoBootstrap
public final class NodeInfoBootstrap implements ToJsonp {
	private final String memoryLock;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoBootstrap(Builder builder) {

		this.memoryLock = Objects.requireNonNull(builder.memoryLock, "memory_lock");

	}

	/**
	 * API name: {@code memory_lock}
	 */
	public String memoryLock() {
		return this.memoryLock;
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

		generator.writeKey("memory_lock");
		generator.write(this.memoryLock);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoBootstrap}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoBootstrap> {
		private String memoryLock;

		/**
		 * API name: {@code memory_lock}
		 */
		public Builder memoryLock(String value) {
			this.memoryLock = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoBootstrap}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoBootstrap build() {

			return new NodeInfoBootstrap(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeInfoBootstrap
	 */
	public static final JsonpValueParser<NodeInfoBootstrap> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoBootstrap::setupNodeInfoBootstrapParser);

	protected static void setupNodeInfoBootstrapParser(DelegatingJsonpValueParser<NodeInfoBootstrap.Builder> op) {

		op.add(Builder::memoryLock, JsonpValueParser.stringParser(), "memory_lock");

	}

}
