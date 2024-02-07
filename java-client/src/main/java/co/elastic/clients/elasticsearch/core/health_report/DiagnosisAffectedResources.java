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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.DiagnosisAffectedResources

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.DiagnosisAffectedResources">API
 *      specification</a>
 */
@JsonpDeserializable
public class DiagnosisAffectedResources implements JsonpSerializable {
	private final List<String> indices;

	private final List<IndicatorNode> nodes;

	private final List<String> slmPolicies;

	private final List<String> featureStates;

	private final List<String> snapshotRepositories;

	// ---------------------------------------------------------------------------------------------

	private DiagnosisAffectedResources(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.nodes = ApiTypeHelper.unmodifiable(builder.nodes);
		this.slmPolicies = ApiTypeHelper.unmodifiable(builder.slmPolicies);
		this.featureStates = ApiTypeHelper.unmodifiable(builder.featureStates);
		this.snapshotRepositories = ApiTypeHelper.unmodifiable(builder.snapshotRepositories);

	}

	public static DiagnosisAffectedResources of(Function<Builder, ObjectBuilder<DiagnosisAffectedResources>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code nodes}
	 */
	public final List<IndicatorNode> nodes() {
		return this.nodes;
	}

	/**
	 * API name: {@code slm_policies}
	 */
	public final List<String> slmPolicies() {
		return this.slmPolicies;
	}

	/**
	 * API name: {@code feature_states}
	 */
	public final List<String> featureStates() {
		return this.featureStates;
	}

	/**
	 * API name: {@code snapshot_repositories}
	 */
	public final List<String> snapshotRepositories() {
		return this.snapshotRepositories;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartArray();
			for (IndicatorNode item0 : this.nodes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.slmPolicies)) {
			generator.writeKey("slm_policies");
			generator.writeStartArray();
			for (String item0 : this.slmPolicies) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.featureStates)) {
			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (String item0 : this.featureStates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.snapshotRepositories)) {
			generator.writeKey("snapshot_repositories");
			generator.writeStartArray();
			for (String item0 : this.snapshotRepositories) {
				generator.write(item0);

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
	 * Builder for {@link DiagnosisAffectedResources}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DiagnosisAffectedResources> {
		@Nullable
		private List<String> indices;

		@Nullable
		private List<IndicatorNode> nodes;

		@Nullable
		private List<String> slmPolicies;

		@Nullable
		private List<String> featureStates;

		@Nullable
		private List<String> snapshotRepositories;

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * API name: {@code nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodes</code>.
		 */
		public final Builder nodes(List<IndicatorNode> list) {
			this.nodes = _listAddAll(this.nodes, list);
			return this;
		}

		/**
		 * API name: {@code nodes}
		 * <p>
		 * Adds one or more values to <code>nodes</code>.
		 */
		public final Builder nodes(IndicatorNode value, IndicatorNode... values) {
			this.nodes = _listAdd(this.nodes, value, values);
			return this;
		}

		/**
		 * API name: {@code nodes}
		 * <p>
		 * Adds a value to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(Function<IndicatorNode.Builder, ObjectBuilder<IndicatorNode>> fn) {
			return nodes(fn.apply(new IndicatorNode.Builder()).build());
		}

		/**
		 * API name: {@code slm_policies}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>slmPolicies</code>.
		 */
		public final Builder slmPolicies(List<String> list) {
			this.slmPolicies = _listAddAll(this.slmPolicies, list);
			return this;
		}

		/**
		 * API name: {@code slm_policies}
		 * <p>
		 * Adds one or more values to <code>slmPolicies</code>.
		 */
		public final Builder slmPolicies(String value, String... values) {
			this.slmPolicies = _listAdd(this.slmPolicies, value, values);
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureStates</code>.
		 */
		public final Builder featureStates(List<String> list) {
			this.featureStates = _listAddAll(this.featureStates, list);
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 * <p>
		 * Adds one or more values to <code>featureStates</code>.
		 */
		public final Builder featureStates(String value, String... values) {
			this.featureStates = _listAdd(this.featureStates, value, values);
			return this;
		}

		/**
		 * API name: {@code snapshot_repositories}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>snapshotRepositories</code>.
		 */
		public final Builder snapshotRepositories(List<String> list) {
			this.snapshotRepositories = _listAddAll(this.snapshotRepositories, list);
			return this;
		}

		/**
		 * API name: {@code snapshot_repositories}
		 * <p>
		 * Adds one or more values to <code>snapshotRepositories</code>.
		 */
		public final Builder snapshotRepositories(String value, String... values) {
			this.snapshotRepositories = _listAdd(this.snapshotRepositories, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DiagnosisAffectedResources}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DiagnosisAffectedResources build() {
			_checkSingleUse();

			return new DiagnosisAffectedResources(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DiagnosisAffectedResources}
	 */
	public static final JsonpDeserializer<DiagnosisAffectedResources> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DiagnosisAffectedResources::setupDiagnosisAffectedResourcesDeserializer);

	protected static void setupDiagnosisAffectedResourcesDeserializer(
			ObjectDeserializer<DiagnosisAffectedResources.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(IndicatorNode._DESERIALIZER), "nodes");
		op.add(Builder::slmPolicies, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"slm_policies");
		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_states");
		op.add(Builder::snapshotRepositories,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "snapshot_repositories");

	}

}
