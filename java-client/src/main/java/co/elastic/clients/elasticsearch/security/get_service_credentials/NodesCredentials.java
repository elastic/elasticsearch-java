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

import co.elastic.clients.elasticsearch._types.NodeStatistics;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.NodesCredentials

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_credentials.NodesCredentials">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodesCredentials implements JsonpSerializable {
	private final NodeStatistics nodeStats;

	private final Map<String, NodesCredentialsFileToken> fileTokens;

	// ---------------------------------------------------------------------------------------------

	private NodesCredentials(Builder builder) {

		this.nodeStats = ApiTypeHelper.requireNonNull(builder.nodeStats, this, "nodeStats");
		this.fileTokens = ApiTypeHelper.unmodifiableRequired(builder.fileTokens, this, "fileTokens");

	}

	public static NodesCredentials of(Function<Builder, ObjectBuilder<NodesCredentials>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - General status showing how nodes respond to the above collection
	 * request
	 * <p>
	 * API name: {@code _nodes}
	 */
	public final NodeStatistics nodeStats() {
		return this.nodeStats;
	}

	/**
	 * Required - File-backed tokens collected from all nodes
	 * <p>
	 * API name: {@code file_tokens}
	 */
	public final Map<String, NodesCredentialsFileToken> fileTokens() {
		return this.fileTokens;
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

		generator.writeKey("_nodes");
		this.nodeStats.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.fileTokens)) {
			generator.writeKey("file_tokens");
			generator.writeStartObject();
			for (Map.Entry<String, NodesCredentialsFileToken> item0 : this.fileTokens.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesCredentials}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodesCredentials> {
		private NodeStatistics nodeStats;

		private Map<String, NodesCredentialsFileToken> fileTokens;

		/**
		 * Required - General status showing how nodes respond to the above collection
		 * request
		 * <p>
		 * API name: {@code _nodes}
		 */
		public final Builder nodeStats(NodeStatistics value) {
			this.nodeStats = value;
			return this;
		}

		/**
		 * Required - General status showing how nodes respond to the above collection
		 * request
		 * <p>
		 * API name: {@code _nodes}
		 */
		public final Builder nodeStats(Function<NodeStatistics.Builder, ObjectBuilder<NodeStatistics>> fn) {
			return this.nodeStats(fn.apply(new NodeStatistics.Builder()).build());
		}

		/**
		 * Required - File-backed tokens collected from all nodes
		 * <p>
		 * API name: {@code file_tokens}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fileTokens</code>.
		 */
		public final Builder fileTokens(Map<String, NodesCredentialsFileToken> map) {
			this.fileTokens = _mapPutAll(this.fileTokens, map);
			return this;
		}

		/**
		 * Required - File-backed tokens collected from all nodes
		 * <p>
		 * API name: {@code file_tokens}
		 * <p>
		 * Adds an entry to <code>fileTokens</code>.
		 */
		public final Builder fileTokens(String key, NodesCredentialsFileToken value) {
			this.fileTokens = _mapPut(this.fileTokens, key, value);
			return this;
		}

		/**
		 * Required - File-backed tokens collected from all nodes
		 * <p>
		 * API name: {@code file_tokens}
		 * <p>
		 * Adds an entry to <code>fileTokens</code> using a builder lambda.
		 */
		public final Builder fileTokens(String key,
				Function<NodesCredentialsFileToken.Builder, ObjectBuilder<NodesCredentialsFileToken>> fn) {
			return fileTokens(key, fn.apply(new NodesCredentialsFileToken.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodesCredentials}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesCredentials build() {
			_checkSingleUse();

			return new NodesCredentials(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesCredentials}
	 */
	public static final JsonpDeserializer<NodesCredentials> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodesCredentials::setupNodesCredentialsDeserializer);

	protected static void setupNodesCredentialsDeserializer(ObjectDeserializer<NodesCredentials.Builder> op) {

		op.add(Builder::nodeStats, NodeStatistics._DESERIALIZER, "_nodes");
		op.add(Builder::fileTokens, JsonpDeserializer.stringMapDeserializer(NodesCredentialsFileToken._DESERIALIZER),
				"file_tokens");

	}

}
