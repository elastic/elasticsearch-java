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
import java.lang.Integer;
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

// typedef: _global.health_report.ShardsCapacityIndicatorTierDetail

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.ShardsCapacityIndicatorTierDetail">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsCapacityIndicatorTierDetail implements JsonpSerializable {
	private final int maxShardsInCluster;

	@Nullable
	private final Integer currentUsedShards;

	// ---------------------------------------------------------------------------------------------

	private ShardsCapacityIndicatorTierDetail(Builder builder) {

		this.maxShardsInCluster = ApiTypeHelper.requireNonNull(builder.maxShardsInCluster, this, "maxShardsInCluster");
		this.currentUsedShards = builder.currentUsedShards;

	}

	public static ShardsCapacityIndicatorTierDetail of(
			Function<Builder, ObjectBuilder<ShardsCapacityIndicatorTierDetail>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max_shards_in_cluster}
	 */
	public final int maxShardsInCluster() {
		return this.maxShardsInCluster;
	}

	/**
	 * API name: {@code current_used_shards}
	 */
	@Nullable
	public final Integer currentUsedShards() {
		return this.currentUsedShards;
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

		generator.writeKey("max_shards_in_cluster");
		generator.write(this.maxShardsInCluster);

		if (this.currentUsedShards != null) {
			generator.writeKey("current_used_shards");
			generator.write(this.currentUsedShards);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsCapacityIndicatorTierDetail}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ShardsCapacityIndicatorTierDetail> {
		private Integer maxShardsInCluster;

		@Nullable
		private Integer currentUsedShards;

		/**
		 * Required - API name: {@code max_shards_in_cluster}
		 */
		public final Builder maxShardsInCluster(int value) {
			this.maxShardsInCluster = value;
			return this;
		}

		/**
		 * API name: {@code current_used_shards}
		 */
		public final Builder currentUsedShards(@Nullable Integer value) {
			this.currentUsedShards = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsCapacityIndicatorTierDetail}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsCapacityIndicatorTierDetail build() {
			_checkSingleUse();

			return new ShardsCapacityIndicatorTierDetail(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsCapacityIndicatorTierDetail}
	 */
	public static final JsonpDeserializer<ShardsCapacityIndicatorTierDetail> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardsCapacityIndicatorTierDetail::setupShardsCapacityIndicatorTierDetailDeserializer);

	protected static void setupShardsCapacityIndicatorTierDetailDeserializer(
			ObjectDeserializer<ShardsCapacityIndicatorTierDetail.Builder> op) {

		op.add(Builder::maxShardsInCluster, JsonpDeserializer.integerDeserializer(), "max_shards_in_cluster");
		op.add(Builder::currentUsedShards, JsonpDeserializer.integerDeserializer(), "current_used_shards");

	}

}
