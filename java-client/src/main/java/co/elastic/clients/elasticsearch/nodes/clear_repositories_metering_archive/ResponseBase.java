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

package co.elastic.clients.elasticsearch.nodes.clear_repositories_metering_archive;

import co.elastic.clients.elasticsearch.nodes.NodesResponseBase;
import co.elastic.clients.elasticsearch.nodes.RepositoryMeteringInformation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes.clear_repositories_metering_archive.ResponseBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#nodes.clear_repositories_metering_archive.ResponseBase">API
 *      specification</a>
 */

public abstract class ResponseBase extends NodesResponseBase {
	private final String clusterName;

	private final Map<String, RepositoryMeteringInformation> nodes;

	// ---------------------------------------------------------------------------------------------

	protected ResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	/**
	 * Required - Name of the cluster. Based on the <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/important-settings.html#cluster-name">Cluster
	 * name setting</a>.
	 * <p>
	 * API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - Contains repositories metering information for the nodes selected
	 * by the request.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final Map<String, RepositoryMeteringInformation> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, RepositoryMeteringInformation> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NodesResponseBase.AbstractBuilder<BuilderT> {
		private String clusterName;

		private Map<String, RepositoryMeteringInformation> nodes;

		/**
		 * Required - Name of the cluster. Based on the <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/important-settings.html#cluster-name">Cluster
		 * name setting</a>.
		 * <p>
		 * API name: {@code cluster_name}
		 */
		public final BuilderT clusterName(String value) {
			this.clusterName = value;
			return self();
		}

		/**
		 * Required - Contains repositories metering information for the nodes selected
		 * by the request.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final BuilderT nodes(Map<String, RepositoryMeteringInformation> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return self();
		}

		/**
		 * Required - Contains repositories metering information for the nodes selected
		 * by the request.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final BuilderT nodes(String key, RepositoryMeteringInformation value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return self();
		}

		/**
		 * Required - Contains repositories metering information for the nodes selected
		 * by the request.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final BuilderT nodes(String key,
				Function<RepositoryMeteringInformation.Builder, ObjectBuilder<RepositoryMeteringInformation>> fn) {
			return nodes(key, fn.apply(new RepositoryMeteringInformation.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(AbstractBuilder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(AbstractBuilder::nodes,
				JsonpDeserializer.stringMapDeserializer(RepositoryMeteringInformation._DESERIALIZER), "nodes");

	}

}
