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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterShardMetrics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterShardMetrics">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterShardMetrics implements JsonpSerializable {
	private final double avg;

	private final double max;

	private final double min;

	// ---------------------------------------------------------------------------------------------

	private ClusterShardMetrics(Builder builder) {

		this.avg = ApiTypeHelper.requireNonNull(builder.avg, this, "avg");
		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");
		this.min = ApiTypeHelper.requireNonNull(builder.min, this, "min");

	}

	public static ClusterShardMetrics of(Function<Builder, ObjectBuilder<ClusterShardMetrics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Mean number of shards in an index, counting only shards assigned
	 * to selected nodes.
	 * <p>
	 * API name: {@code avg}
	 */
	public final double avg() {
		return this.avg;
	}

	/**
	 * Required - Maximum number of shards in an index, counting only shards
	 * assigned to selected nodes.
	 * <p>
	 * API name: {@code max}
	 */
	public final double max() {
		return this.max;
	}

	/**
	 * Required - Minimum number of shards in an index, counting only shards
	 * assigned to selected nodes.
	 * <p>
	 * API name: {@code min}
	 */
	public final double min() {
		return this.min;
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

		generator.writeKey("avg");
		generator.write(this.avg);

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterShardMetrics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterShardMetrics> {
		private Double avg;

		private Double max;

		private Double min;

		/**
		 * Required - Mean number of shards in an index, counting only shards assigned
		 * to selected nodes.
		 * <p>
		 * API name: {@code avg}
		 */
		public final Builder avg(double value) {
			this.avg = value;
			return this;
		}

		/**
		 * Required - Maximum number of shards in an index, counting only shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(double value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - Minimum number of shards in an index, counting only shards
		 * assigned to selected nodes.
		 * <p>
		 * API name: {@code min}
		 */
		public final Builder min(double value) {
			this.min = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterShardMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterShardMetrics build() {
			_checkSingleUse();

			return new ClusterShardMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterShardMetrics}
	 */
	public static final JsonpDeserializer<ClusterShardMetrics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterShardMetrics::setupClusterShardMetricsDeserializer);

	protected static void setupClusterShardMetricsDeserializer(ObjectDeserializer<ClusterShardMetrics.Builder> op) {

		op.add(Builder::avg, JsonpDeserializer.doubleDeserializer(), "avg");
		op.add(Builder::max, JsonpDeserializer.doubleDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.doubleDeserializer(), "min");

	}

}
