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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationBreakdown
public final class AggregationBreakdown implements ToJsonp {
	private final Number buildAggregation;

	private final Number buildAggregationCount;

	private final Number buildLeafCollector;

	private final Number buildLeafCollectorCount;

	private final Number collect;

	private final Number collectCount;

	private final Number initialize;

	private final Number initializeCount;

	@Nullable
	private final Number postCollection;

	@Nullable
	private final Number postCollectionCount;

	private final Number reduce;

	private final Number reduceCount;

	// ---------------------------------------------------------------------------------------------

	protected AggregationBreakdown(Builder builder) {

		this.buildAggregation = Objects.requireNonNull(builder.buildAggregation, "build_aggregation");
		this.buildAggregationCount = Objects.requireNonNull(builder.buildAggregationCount, "build_aggregation_count");
		this.buildLeafCollector = Objects.requireNonNull(builder.buildLeafCollector, "build_leaf_collector");
		this.buildLeafCollectorCount = Objects.requireNonNull(builder.buildLeafCollectorCount,
				"build_leaf_collector_count");
		this.collect = Objects.requireNonNull(builder.collect, "collect");
		this.collectCount = Objects.requireNonNull(builder.collectCount, "collect_count");
		this.initialize = Objects.requireNonNull(builder.initialize, "initialize");
		this.initializeCount = Objects.requireNonNull(builder.initializeCount, "initialize_count");
		this.postCollection = builder.postCollection;
		this.postCollectionCount = builder.postCollectionCount;
		this.reduce = Objects.requireNonNull(builder.reduce, "reduce");
		this.reduceCount = Objects.requireNonNull(builder.reduceCount, "reduce_count");

	}

	/**
	 * API name: {@code build_aggregation}
	 */
	public Number buildAggregation() {
		return this.buildAggregation;
	}

	/**
	 * API name: {@code build_aggregation_count}
	 */
	public Number buildAggregationCount() {
		return this.buildAggregationCount;
	}

	/**
	 * API name: {@code build_leaf_collector}
	 */
	public Number buildLeafCollector() {
		return this.buildLeafCollector;
	}

	/**
	 * API name: {@code build_leaf_collector_count}
	 */
	public Number buildLeafCollectorCount() {
		return this.buildLeafCollectorCount;
	}

	/**
	 * API name: {@code collect}
	 */
	public Number collect() {
		return this.collect;
	}

	/**
	 * API name: {@code collect_count}
	 */
	public Number collectCount() {
		return this.collectCount;
	}

	/**
	 * API name: {@code initialize}
	 */
	public Number initialize() {
		return this.initialize;
	}

	/**
	 * API name: {@code initialize_count}
	 */
	public Number initializeCount() {
		return this.initializeCount;
	}

	/**
	 * API name: {@code post_collection}
	 */
	@Nullable
	public Number postCollection() {
		return this.postCollection;
	}

	/**
	 * API name: {@code post_collection_count}
	 */
	@Nullable
	public Number postCollectionCount() {
		return this.postCollectionCount;
	}

	/**
	 * API name: {@code reduce}
	 */
	public Number reduce() {
		return this.reduce;
	}

	/**
	 * API name: {@code reduce_count}
	 */
	public Number reduceCount() {
		return this.reduceCount;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("build_aggregation");
		generator.write(this.buildAggregation.doubleValue());

		generator.writeKey("build_aggregation_count");
		generator.write(this.buildAggregationCount.doubleValue());

		generator.writeKey("build_leaf_collector");
		generator.write(this.buildLeafCollector.doubleValue());

		generator.writeKey("build_leaf_collector_count");
		generator.write(this.buildLeafCollectorCount.doubleValue());

		generator.writeKey("collect");
		generator.write(this.collect.doubleValue());

		generator.writeKey("collect_count");
		generator.write(this.collectCount.doubleValue());

		generator.writeKey("initialize");
		generator.write(this.initialize.doubleValue());

		generator.writeKey("initialize_count");
		generator.write(this.initializeCount.doubleValue());

		if (this.postCollection != null) {

			generator.writeKey("post_collection");
			generator.write(this.postCollection.doubleValue());

		}
		if (this.postCollectionCount != null) {

			generator.writeKey("post_collection_count");
			generator.write(this.postCollectionCount.doubleValue());

		}

		generator.writeKey("reduce");
		generator.write(this.reduce.doubleValue());

		generator.writeKey("reduce_count");
		generator.write(this.reduceCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationBreakdown}.
	 */
	public static class Builder implements ObjectBuilder<AggregationBreakdown> {
		private Number buildAggregation;

		private Number buildAggregationCount;

		private Number buildLeafCollector;

		private Number buildLeafCollectorCount;

		private Number collect;

		private Number collectCount;

		private Number initialize;

		private Number initializeCount;

		@Nullable
		private Number postCollection;

		@Nullable
		private Number postCollectionCount;

		private Number reduce;

		private Number reduceCount;

		/**
		 * API name: {@code build_aggregation}
		 */
		public Builder buildAggregation(Number value) {
			this.buildAggregation = value;
			return this;
		}

		/**
		 * API name: {@code build_aggregation_count}
		 */
		public Builder buildAggregationCount(Number value) {
			this.buildAggregationCount = value;
			return this;
		}

		/**
		 * API name: {@code build_leaf_collector}
		 */
		public Builder buildLeafCollector(Number value) {
			this.buildLeafCollector = value;
			return this;
		}

		/**
		 * API name: {@code build_leaf_collector_count}
		 */
		public Builder buildLeafCollectorCount(Number value) {
			this.buildLeafCollectorCount = value;
			return this;
		}

		/**
		 * API name: {@code collect}
		 */
		public Builder collect(Number value) {
			this.collect = value;
			return this;
		}

		/**
		 * API name: {@code collect_count}
		 */
		public Builder collectCount(Number value) {
			this.collectCount = value;
			return this;
		}

		/**
		 * API name: {@code initialize}
		 */
		public Builder initialize(Number value) {
			this.initialize = value;
			return this;
		}

		/**
		 * API name: {@code initialize_count}
		 */
		public Builder initializeCount(Number value) {
			this.initializeCount = value;
			return this;
		}

		/**
		 * API name: {@code post_collection}
		 */
		public Builder postCollection(@Nullable Number value) {
			this.postCollection = value;
			return this;
		}

		/**
		 * API name: {@code post_collection_count}
		 */
		public Builder postCollectionCount(@Nullable Number value) {
			this.postCollectionCount = value;
			return this;
		}

		/**
		 * API name: {@code reduce}
		 */
		public Builder reduce(Number value) {
			this.reduce = value;
			return this;
		}

		/**
		 * API name: {@code reduce_count}
		 */
		public Builder reduceCount(Number value) {
			this.reduceCount = value;
			return this;
		}

		/**
		 * Builds a {@link AggregationBreakdown}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationBreakdown build() {

			return new AggregationBreakdown(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AggregationBreakdown
	 */
	public static final JsonpDeserializer<AggregationBreakdown> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AggregationBreakdown::setupAggregationBreakdownDeserializer);

	protected static void setupAggregationBreakdownDeserializer(
			DelegatingDeserializer<AggregationBreakdown.Builder> op) {

		op.add(Builder::buildAggregation, JsonpDeserializer.numberDeserializer(), "build_aggregation");
		op.add(Builder::buildAggregationCount, JsonpDeserializer.numberDeserializer(), "build_aggregation_count");
		op.add(Builder::buildLeafCollector, JsonpDeserializer.numberDeserializer(), "build_leaf_collector");
		op.add(Builder::buildLeafCollectorCount, JsonpDeserializer.numberDeserializer(), "build_leaf_collector_count");
		op.add(Builder::collect, JsonpDeserializer.numberDeserializer(), "collect");
		op.add(Builder::collectCount, JsonpDeserializer.numberDeserializer(), "collect_count");
		op.add(Builder::initialize, JsonpDeserializer.numberDeserializer(), "initialize");
		op.add(Builder::initializeCount, JsonpDeserializer.numberDeserializer(), "initialize_count");
		op.add(Builder::postCollection, JsonpDeserializer.numberDeserializer(), "post_collection");
		op.add(Builder::postCollectionCount, JsonpDeserializer.numberDeserializer(), "post_collection_count");
		op.add(Builder::reduce, JsonpDeserializer.numberDeserializer(), "reduce");
		op.add(Builder::reduceCount, JsonpDeserializer.numberDeserializer(), "reduce_count");

	}

}
