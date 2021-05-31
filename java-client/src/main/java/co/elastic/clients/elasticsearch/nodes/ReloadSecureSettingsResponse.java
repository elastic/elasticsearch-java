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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.reload_secure_settings.Response
public final class ReloadSecureSettingsResponse extends NodesResponseBase {
	private final String clusterName;

	private final Map<String, JsonValue> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ReloadSecureSettingsResponse(Builder builder) {
		super(builder);
		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, JsonValue> nodes() {
		return this.nodes;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, JsonValue> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReloadSecureSettingsResponse}.
	 */
	public static class Builder extends NodesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ReloadSecureSettingsResponse> {
		private String clusterName;

		private Map<String, JsonValue> nodes;

		/**
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, JsonValue> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, JsonValue value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReloadSecureSettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReloadSecureSettingsResponse build() {

			return new ReloadSecureSettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ReloadSecureSettingsResponse
	 */
	public static final JsonpValueParser<ReloadSecureSettingsResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ReloadSecureSettingsResponse::setupReloadSecureSettingsResponseParser);

	protected static void setupReloadSecureSettingsResponseParser(
			DelegatingJsonpValueParser<ReloadSecureSettingsResponse.Builder> op) {
		NodesResponseBase.setupNodesResponseBaseParser(op);
		op.add(Builder::clusterName, JsonpValueParser.stringParser(), "cluster_name");
		op.add(Builder::nodes, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "nodes");

	}

}
