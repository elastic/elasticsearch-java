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

// typedef: nodes.info.NodeInfoSettingsClusterElection
public final class NodeInfoSettingsClusterElection implements ToJsonp {
	private final String strategy;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoSettingsClusterElection(Builder builder) {

		this.strategy = Objects.requireNonNull(builder.strategy, "strategy");

	}

	/**
	 * API name: {@code strategy}
	 */
	public String strategy() {
		return this.strategy;
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

		generator.writeKey("strategy");
		generator.write(this.strategy);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoSettingsClusterElection}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoSettingsClusterElection> {
		private String strategy;

		/**
		 * API name: {@code strategy}
		 */
		public Builder strategy(String value) {
			this.strategy = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoSettingsClusterElection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoSettingsClusterElection build() {

			return new NodeInfoSettingsClusterElection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeInfoSettingsClusterElection
	 */
	public static final JsonpValueParser<NodeInfoSettingsClusterElection> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeInfoSettingsClusterElection::setupNodeInfoSettingsClusterElectionParser);

	protected static void setupNodeInfoSettingsClusterElectionParser(
			DelegatingJsonpValueParser<NodeInfoSettingsClusterElection.Builder> op) {

		op.add(Builder::strategy, JsonpValueParser.stringParser(), "strategy");

	}

}
