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

// typedef: _global.health_report.MasterIsStableIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.MasterIsStableIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class MasterIsStableIndicatorDetails implements JsonpSerializable {
	private final IndicatorNode currentMaster;

	private final List<IndicatorNode> recentMasters;

	@Nullable
	private final MasterIsStableIndicatorExceptionFetchingHistory exceptionFetchingHistory;

	private final List<MasterIsStableIndicatorClusterFormationNode> clusterFormation;

	// ---------------------------------------------------------------------------------------------

	private MasterIsStableIndicatorDetails(Builder builder) {

		this.currentMaster = ApiTypeHelper.requireNonNull(builder.currentMaster, this, "currentMaster");
		this.recentMasters = ApiTypeHelper.unmodifiableRequired(builder.recentMasters, this, "recentMasters");
		this.exceptionFetchingHistory = builder.exceptionFetchingHistory;
		this.clusterFormation = ApiTypeHelper.unmodifiable(builder.clusterFormation);

	}

	public static MasterIsStableIndicatorDetails of(
			Function<Builder, ObjectBuilder<MasterIsStableIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code current_master}
	 */
	public final IndicatorNode currentMaster() {
		return this.currentMaster;
	}

	/**
	 * Required - API name: {@code recent_masters}
	 */
	public final List<IndicatorNode> recentMasters() {
		return this.recentMasters;
	}

	/**
	 * API name: {@code exception_fetching_history}
	 */
	@Nullable
	public final MasterIsStableIndicatorExceptionFetchingHistory exceptionFetchingHistory() {
		return this.exceptionFetchingHistory;
	}

	/**
	 * API name: {@code cluster_formation}
	 */
	public final List<MasterIsStableIndicatorClusterFormationNode> clusterFormation() {
		return this.clusterFormation;
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

		generator.writeKey("current_master");
		this.currentMaster.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.recentMasters)) {
			generator.writeKey("recent_masters");
			generator.writeStartArray();
			for (IndicatorNode item0 : this.recentMasters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exceptionFetchingHistory != null) {
			generator.writeKey("exception_fetching_history");
			this.exceptionFetchingHistory.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.clusterFormation)) {
			generator.writeKey("cluster_formation");
			generator.writeStartArray();
			for (MasterIsStableIndicatorClusterFormationNode item0 : this.clusterFormation) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link MasterIsStableIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MasterIsStableIndicatorDetails> {
		private IndicatorNode currentMaster;

		private List<IndicatorNode> recentMasters;

		@Nullable
		private MasterIsStableIndicatorExceptionFetchingHistory exceptionFetchingHistory;

		@Nullable
		private List<MasterIsStableIndicatorClusterFormationNode> clusterFormation;

		/**
		 * Required - API name: {@code current_master}
		 */
		public final Builder currentMaster(IndicatorNode value) {
			this.currentMaster = value;
			return this;
		}

		/**
		 * Required - API name: {@code current_master}
		 */
		public final Builder currentMaster(Function<IndicatorNode.Builder, ObjectBuilder<IndicatorNode>> fn) {
			return this.currentMaster(fn.apply(new IndicatorNode.Builder()).build());
		}

		/**
		 * Required - API name: {@code recent_masters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>recentMasters</code>.
		 */
		public final Builder recentMasters(List<IndicatorNode> list) {
			this.recentMasters = _listAddAll(this.recentMasters, list);
			return this;
		}

		/**
		 * Required - API name: {@code recent_masters}
		 * <p>
		 * Adds one or more values to <code>recentMasters</code>.
		 */
		public final Builder recentMasters(IndicatorNode value, IndicatorNode... values) {
			this.recentMasters = _listAdd(this.recentMasters, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code recent_masters}
		 * <p>
		 * Adds a value to <code>recentMasters</code> using a builder lambda.
		 */
		public final Builder recentMasters(Function<IndicatorNode.Builder, ObjectBuilder<IndicatorNode>> fn) {
			return recentMasters(fn.apply(new IndicatorNode.Builder()).build());
		}

		/**
		 * API name: {@code exception_fetching_history}
		 */
		public final Builder exceptionFetchingHistory(@Nullable MasterIsStableIndicatorExceptionFetchingHistory value) {
			this.exceptionFetchingHistory = value;
			return this;
		}

		/**
		 * API name: {@code exception_fetching_history}
		 */
		public final Builder exceptionFetchingHistory(
				Function<MasterIsStableIndicatorExceptionFetchingHistory.Builder, ObjectBuilder<MasterIsStableIndicatorExceptionFetchingHistory>> fn) {
			return this.exceptionFetchingHistory(
					fn.apply(new MasterIsStableIndicatorExceptionFetchingHistory.Builder()).build());
		}

		/**
		 * API name: {@code cluster_formation}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clusterFormation</code>.
		 */
		public final Builder clusterFormation(List<MasterIsStableIndicatorClusterFormationNode> list) {
			this.clusterFormation = _listAddAll(this.clusterFormation, list);
			return this;
		}

		/**
		 * API name: {@code cluster_formation}
		 * <p>
		 * Adds one or more values to <code>clusterFormation</code>.
		 */
		public final Builder clusterFormation(MasterIsStableIndicatorClusterFormationNode value,
				MasterIsStableIndicatorClusterFormationNode... values) {
			this.clusterFormation = _listAdd(this.clusterFormation, value, values);
			return this;
		}

		/**
		 * API name: {@code cluster_formation}
		 * <p>
		 * Adds a value to <code>clusterFormation</code> using a builder lambda.
		 */
		public final Builder clusterFormation(
				Function<MasterIsStableIndicatorClusterFormationNode.Builder, ObjectBuilder<MasterIsStableIndicatorClusterFormationNode>> fn) {
			return clusterFormation(fn.apply(new MasterIsStableIndicatorClusterFormationNode.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MasterIsStableIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MasterIsStableIndicatorDetails build() {
			_checkSingleUse();

			return new MasterIsStableIndicatorDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MasterIsStableIndicatorDetails}
	 */
	public static final JsonpDeserializer<MasterIsStableIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MasterIsStableIndicatorDetails::setupMasterIsStableIndicatorDetailsDeserializer);

	protected static void setupMasterIsStableIndicatorDetailsDeserializer(
			ObjectDeserializer<MasterIsStableIndicatorDetails.Builder> op) {

		op.add(Builder::currentMaster, IndicatorNode._DESERIALIZER, "current_master");
		op.add(Builder::recentMasters, JsonpDeserializer.arrayDeserializer(IndicatorNode._DESERIALIZER),
				"recent_masters");
		op.add(Builder::exceptionFetchingHistory, MasterIsStableIndicatorExceptionFetchingHistory._DESERIALIZER,
				"exception_fetching_history");
		op.add(Builder::clusterFormation,
				JsonpDeserializer.arrayDeserializer(MasterIsStableIndicatorClusterFormationNode._DESERIALIZER),
				"cluster_formation");

	}

}
