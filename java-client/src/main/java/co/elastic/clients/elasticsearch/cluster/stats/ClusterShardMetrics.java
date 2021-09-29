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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterShardMetrics
@JsonpDeserializable
public final class ClusterShardMetrics implements JsonpSerializable {
	private final double avg;

	private final double max;

	private final double min;

	// ---------------------------------------------------------------------------------------------

	public ClusterShardMetrics(Builder builder) {

		this.avg = Objects.requireNonNull(builder.avg, "avg");
		this.max = Objects.requireNonNull(builder.max, "max");
		this.min = Objects.requireNonNull(builder.min, "min");

	}

	public ClusterShardMetrics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code avg}
	 */
	public double avg() {
		return this.avg;
	}

	/**
	 * API name: {@code max}
	 */
	public double max() {
		return this.max;
	}

	/**
	 * API name: {@code min}
	 */
	public double min() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterShardMetrics}.
	 */
	public static class Builder implements ObjectBuilder<ClusterShardMetrics> {
		private Double avg;

		private Double max;

		private Double min;

		/**
		 * API name: {@code avg}
		 */
		public Builder avg(double value) {
			this.avg = value;
			return this;
		}

		/**
		 * API name: {@code max}
		 */
		public Builder max(double value) {
			this.max = value;
			return this;
		}

		/**
		 * API name: {@code min}
		 */
		public Builder min(double value) {
			this.min = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterShardMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterShardMetrics build() {

			return new ClusterShardMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterShardMetrics}
	 */
	public static final JsonpDeserializer<ClusterShardMetrics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterShardMetrics::setupClusterShardMetricsDeserializer, Builder::build);

	protected static void setupClusterShardMetricsDeserializer(DelegatingDeserializer<ClusterShardMetrics.Builder> op) {

		op.add(Builder::avg, JsonpDeserializer.doubleDeserializer(), "avg");
		op.add(Builder::max, JsonpDeserializer.doubleDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.doubleDeserializer(), "min");

	}

}
