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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch.migration.deprecations.Deprecation;
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
import java.util.List;
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

// typedef: migration.deprecations.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#migration.deprecations.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeprecationsResponse implements JsonpSerializable {
	private final List<Deprecation> clusterSettings;

	private final Map<String, List<Deprecation>> indexSettings;

	private final Map<String, List<Deprecation>> dataStreams;

	private final List<Deprecation> nodeSettings;

	private final List<Deprecation> mlSettings;

	private final Map<String, List<Deprecation>> templates;

	private final Map<String, List<Deprecation>> ilmPolicies;

	// ---------------------------------------------------------------------------------------------

	private DeprecationsResponse(Builder builder) {

		this.clusterSettings = ApiTypeHelper.unmodifiableRequired(builder.clusterSettings, this, "clusterSettings");
		this.indexSettings = ApiTypeHelper.unmodifiableRequired(builder.indexSettings, this, "indexSettings");
		this.dataStreams = ApiTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");
		this.nodeSettings = ApiTypeHelper.unmodifiableRequired(builder.nodeSettings, this, "nodeSettings");
		this.mlSettings = ApiTypeHelper.unmodifiableRequired(builder.mlSettings, this, "mlSettings");
		this.templates = ApiTypeHelper.unmodifiableRequired(builder.templates, this, "templates");
		this.ilmPolicies = ApiTypeHelper.unmodifiableRequired(builder.ilmPolicies, this, "ilmPolicies");

	}

	public static DeprecationsResponse of(Function<Builder, ObjectBuilder<DeprecationsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Cluster-level deprecation warnings.
	 * <p>
	 * API name: {@code cluster_settings}
	 */
	public final List<Deprecation> clusterSettings() {
		return this.clusterSettings;
	}

	/**
	 * Required - Index warnings are sectioned off per index and can be filtered
	 * using an index-pattern in the query. This section includes warnings for the
	 * backing indices of data streams specified in the request path.
	 * <p>
	 * API name: {@code index_settings}
	 */
	public final Map<String, List<Deprecation>> indexSettings() {
		return this.indexSettings;
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public final Map<String, List<Deprecation>> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Required - Node-level deprecation warnings. Since only a subset of your nodes
	 * might incorporate these settings, it is important to read the details section
	 * for more information about which nodes are affected.
	 * <p>
	 * API name: {@code node_settings}
	 */
	public final List<Deprecation> nodeSettings() {
		return this.nodeSettings;
	}

	/**
	 * Required - Machine learning-related deprecation warnings.
	 * <p>
	 * API name: {@code ml_settings}
	 */
	public final List<Deprecation> mlSettings() {
		return this.mlSettings;
	}

	/**
	 * Required - Template warnings are sectioned off per template and include
	 * deprecations for both component templates and index templates.
	 * <p>
	 * API name: {@code templates}
	 */
	public final Map<String, List<Deprecation>> templates() {
		return this.templates;
	}

	/**
	 * Required - ILM policy warnings are sectioned off per policy.
	 * <p>
	 * API name: {@code ilm_policies}
	 */
	public final Map<String, List<Deprecation>> ilmPolicies() {
		return this.ilmPolicies;
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

		if (ApiTypeHelper.isDefined(this.clusterSettings)) {
			generator.writeKey("cluster_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.clusterSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indexSettings)) {
			generator.writeKey("index_settings");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.indexSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.dataStreams.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nodeSettings)) {
			generator.writeKey("node_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.nodeSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.mlSettings)) {
			generator.writeKey("ml_settings");
			generator.writeStartArray();
			for (Deprecation item0 : this.mlSettings) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.templates)) {
			generator.writeKey("templates");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.templates.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ilmPolicies)) {
			generator.writeKey("ilm_policies");
			generator.writeStartObject();
			for (Map.Entry<String, List<Deprecation>> item0 : this.ilmPolicies.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (Deprecation item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

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
	 * Builder for {@link DeprecationsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DeprecationsResponse> {
		private List<Deprecation> clusterSettings;

		private Map<String, List<Deprecation>> indexSettings;

		private Map<String, List<Deprecation>> dataStreams;

		private List<Deprecation> nodeSettings;

		private List<Deprecation> mlSettings;

		private Map<String, List<Deprecation>> templates;

		private Map<String, List<Deprecation>> ilmPolicies;

		/**
		 * Required - Cluster-level deprecation warnings.
		 * <p>
		 * API name: {@code cluster_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clusterSettings</code>.
		 */
		public final Builder clusterSettings(List<Deprecation> list) {
			this.clusterSettings = _listAddAll(this.clusterSettings, list);
			return this;
		}

		/**
		 * Required - Cluster-level deprecation warnings.
		 * <p>
		 * API name: {@code cluster_settings}
		 * <p>
		 * Adds one or more values to <code>clusterSettings</code>.
		 */
		public final Builder clusterSettings(Deprecation value, Deprecation... values) {
			this.clusterSettings = _listAdd(this.clusterSettings, value, values);
			return this;
		}

		/**
		 * Required - Cluster-level deprecation warnings.
		 * <p>
		 * API name: {@code cluster_settings}
		 * <p>
		 * Adds a value to <code>clusterSettings</code> using a builder lambda.
		 */
		public final Builder clusterSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return clusterSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Required - Index warnings are sectioned off per index and can be filtered
		 * using an index-pattern in the query. This section includes warnings for the
		 * backing indices of data streams specified in the request path.
		 * <p>
		 * API name: {@code index_settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(Map<String, List<Deprecation>> map) {
			this.indexSettings = _mapPutAll(this.indexSettings, map);
			return this;
		}

		/**
		 * Required - Index warnings are sectioned off per index and can be filtered
		 * using an index-pattern in the query. This section includes warnings for the
		 * backing indices of data streams specified in the request path.
		 * <p>
		 * API name: {@code index_settings}
		 * <p>
		 * Adds an entry to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(String key, List<Deprecation> value) {
			this.indexSettings = _mapPut(this.indexSettings, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(Map<String, List<Deprecation>> map) {
			this.dataStreams = _mapPutAll(this.dataStreams, map);
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 * <p>
		 * Adds an entry to <code>dataStreams</code>.
		 */
		public final Builder dataStreams(String key, List<Deprecation> value) {
			this.dataStreams = _mapPut(this.dataStreams, key, value);
			return this;
		}

		/**
		 * Required - Node-level deprecation warnings. Since only a subset of your nodes
		 * might incorporate these settings, it is important to read the details section
		 * for more information about which nodes are affected.
		 * <p>
		 * API name: {@code node_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeSettings</code>.
		 */
		public final Builder nodeSettings(List<Deprecation> list) {
			this.nodeSettings = _listAddAll(this.nodeSettings, list);
			return this;
		}

		/**
		 * Required - Node-level deprecation warnings. Since only a subset of your nodes
		 * might incorporate these settings, it is important to read the details section
		 * for more information about which nodes are affected.
		 * <p>
		 * API name: {@code node_settings}
		 * <p>
		 * Adds one or more values to <code>nodeSettings</code>.
		 */
		public final Builder nodeSettings(Deprecation value, Deprecation... values) {
			this.nodeSettings = _listAdd(this.nodeSettings, value, values);
			return this;
		}

		/**
		 * Required - Node-level deprecation warnings. Since only a subset of your nodes
		 * might incorporate these settings, it is important to read the details section
		 * for more information about which nodes are affected.
		 * <p>
		 * API name: {@code node_settings}
		 * <p>
		 * Adds a value to <code>nodeSettings</code> using a builder lambda.
		 */
		public final Builder nodeSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return nodeSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Required - Machine learning-related deprecation warnings.
		 * <p>
		 * API name: {@code ml_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>mlSettings</code>.
		 */
		public final Builder mlSettings(List<Deprecation> list) {
			this.mlSettings = _listAddAll(this.mlSettings, list);
			return this;
		}

		/**
		 * Required - Machine learning-related deprecation warnings.
		 * <p>
		 * API name: {@code ml_settings}
		 * <p>
		 * Adds one or more values to <code>mlSettings</code>.
		 */
		public final Builder mlSettings(Deprecation value, Deprecation... values) {
			this.mlSettings = _listAdd(this.mlSettings, value, values);
			return this;
		}

		/**
		 * Required - Machine learning-related deprecation warnings.
		 * <p>
		 * API name: {@code ml_settings}
		 * <p>
		 * Adds a value to <code>mlSettings</code> using a builder lambda.
		 */
		public final Builder mlSettings(Function<Deprecation.Builder, ObjectBuilder<Deprecation>> fn) {
			return mlSettings(fn.apply(new Deprecation.Builder()).build());
		}

		/**
		 * Required - Template warnings are sectioned off per template and include
		 * deprecations for both component templates and index templates.
		 * <p>
		 * API name: {@code templates}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>templates</code>.
		 */
		public final Builder templates(Map<String, List<Deprecation>> map) {
			this.templates = _mapPutAll(this.templates, map);
			return this;
		}

		/**
		 * Required - Template warnings are sectioned off per template and include
		 * deprecations for both component templates and index templates.
		 * <p>
		 * API name: {@code templates}
		 * <p>
		 * Adds an entry to <code>templates</code>.
		 */
		public final Builder templates(String key, List<Deprecation> value) {
			this.templates = _mapPut(this.templates, key, value);
			return this;
		}

		/**
		 * Required - ILM policy warnings are sectioned off per policy.
		 * <p>
		 * API name: {@code ilm_policies}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ilmPolicies</code>.
		 */
		public final Builder ilmPolicies(Map<String, List<Deprecation>> map) {
			this.ilmPolicies = _mapPutAll(this.ilmPolicies, map);
			return this;
		}

		/**
		 * Required - ILM policy warnings are sectioned off per policy.
		 * <p>
		 * API name: {@code ilm_policies}
		 * <p>
		 * Adds an entry to <code>ilmPolicies</code>.
		 */
		public final Builder ilmPolicies(String key, List<Deprecation> value) {
			this.ilmPolicies = _mapPut(this.ilmPolicies, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeprecationsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeprecationsResponse build() {
			_checkSingleUse();

			return new DeprecationsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeprecationsResponse}
	 */
	public static final JsonpDeserializer<DeprecationsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeprecationsResponse::setupDeprecationsResponseDeserializer);

	protected static void setupDeprecationsResponseDeserializer(ObjectDeserializer<DeprecationsResponse.Builder> op) {

		op.add(Builder::clusterSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER),
				"cluster_settings");
		op.add(Builder::indexSettings,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"index_settings");
		op.add(Builder::dataStreams,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"data_streams");
		op.add(Builder::nodeSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "node_settings");
		op.add(Builder::mlSettings, JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER), "ml_settings");
		op.add(Builder::templates,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"templates");
		op.add(Builder::ilmPolicies,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(Deprecation._DESERIALIZER)),
				"ilm_policies");

	}

}
