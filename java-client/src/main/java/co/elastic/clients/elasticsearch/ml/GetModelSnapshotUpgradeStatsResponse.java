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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshot_upgrade_stats.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.get_model_snapshot_upgrade_stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetModelSnapshotUpgradeStatsResponse implements JsonpSerializable {
	private final long count;

	private final List<ModelSnapshotUpgrade> modelSnapshotUpgrades;

	// ---------------------------------------------------------------------------------------------

	private GetModelSnapshotUpgradeStatsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.modelSnapshotUpgrades = ApiTypeHelper.unmodifiableRequired(builder.modelSnapshotUpgrades, this,
				"modelSnapshotUpgrades");

	}

	public static GetModelSnapshotUpgradeStatsResponse of(
			Function<Builder, ObjectBuilder<GetModelSnapshotUpgradeStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code model_snapshot_upgrades}
	 */
	public final List<ModelSnapshotUpgrade> modelSnapshotUpgrades() {
		return this.modelSnapshotUpgrades;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.modelSnapshotUpgrades)) {
			generator.writeKey("model_snapshot_upgrades");
			generator.writeStartArray();
			for (ModelSnapshotUpgrade item0 : this.modelSnapshotUpgrades) {
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
	 * Builder for {@link GetModelSnapshotUpgradeStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetModelSnapshotUpgradeStatsResponse> {
		private Long count;

		private List<ModelSnapshotUpgrade> modelSnapshotUpgrades;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshot_upgrades}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>modelSnapshotUpgrades</code>.
		 */
		public final Builder modelSnapshotUpgrades(List<ModelSnapshotUpgrade> list) {
			this.modelSnapshotUpgrades = _listAddAll(this.modelSnapshotUpgrades, list);
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshot_upgrades}
		 * <p>
		 * Adds one or more values to <code>modelSnapshotUpgrades</code>.
		 */
		public final Builder modelSnapshotUpgrades(ModelSnapshotUpgrade value, ModelSnapshotUpgrade... values) {
			this.modelSnapshotUpgrades = _listAdd(this.modelSnapshotUpgrades, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshot_upgrades}
		 * <p>
		 * Adds a value to <code>modelSnapshotUpgrades</code> using a builder lambda.
		 */
		public final Builder modelSnapshotUpgrades(
				Function<ModelSnapshotUpgrade.Builder, ObjectBuilder<ModelSnapshotUpgrade>> fn) {
			return modelSnapshotUpgrades(fn.apply(new ModelSnapshotUpgrade.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetModelSnapshotUpgradeStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotUpgradeStatsResponse build() {
			_checkSingleUse();

			return new GetModelSnapshotUpgradeStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotUpgradeStatsResponse}
	 */
	public static final JsonpDeserializer<GetModelSnapshotUpgradeStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					GetModelSnapshotUpgradeStatsResponse::setupGetModelSnapshotUpgradeStatsResponseDeserializer);

	protected static void setupGetModelSnapshotUpgradeStatsResponseDeserializer(
			ObjectDeserializer<GetModelSnapshotUpgradeStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::modelSnapshotUpgrades, JsonpDeserializer.arrayDeserializer(ModelSnapshotUpgrade._DESERIALIZER),
				"model_snapshot_upgrades");

	}

}
