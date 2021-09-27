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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationBreakdown
@JsonpDeserializable
public final class AggregationBreakdown implements JsonpSerializable {
	private final long buildAggregation;

	private final long buildAggregationCount;

	private final long buildLeafCollector;

	private final long buildLeafCollectorCount;

	private final long collect;

	private final long collectCount;

	private final long initialize;

	private final long initializeCount;

	@Nullable
	private final Long postCollection;

	@Nullable
	private final Long postCollectionCount;

	private final long reduce;

	private final long reduceCount;

	// ---------------------------------------------------------------------------------------------

	public AggregationBreakdown(Builder builder) {

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
	public long buildAggregation() {
		return this.buildAggregation;
	}

	/**
	 * API name: {@code build_aggregation_count}
	 */
	public long buildAggregationCount() {
		return this.buildAggregationCount;
	}

	/**
	 * API name: {@code build_leaf_collector}
	 */
	public long buildLeafCollector() {
		return this.buildLeafCollector;
	}

	/**
	 * API name: {@code build_leaf_collector_count}
	 */
	public long buildLeafCollectorCount() {
		return this.buildLeafCollectorCount;
	}

	/**
	 * API name: {@code collect}
	 */
	public long collect() {
		return this.collect;
	}

	/**
	 * API name: {@code collect_count}
	 */
	public long collectCount() {
		return this.collectCount;
	}

	/**
	 * API name: {@code initialize}
	 */
	public long initialize() {
		return this.initialize;
	}

	/**
	 * API name: {@code initialize_count}
	 */
	public long initializeCount() {
		return this.initializeCount;
	}

	/**
	 * API name: {@code post_collection}
	 */
	@Nullable
	public Long postCollection() {
		return this.postCollection;
	}

	/**
	 * API name: {@code post_collection_count}
	 */
	@Nullable
	public Long postCollectionCount() {
		return this.postCollectionCount;
	}

	/**
	 * API name: {@code reduce}
	 */
	public long reduce() {
		return this.reduce;
	}

	/**
	 * API name: {@code reduce_count}
	 */
	public long reduceCount() {
		return this.reduceCount;
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

		generator.writeKey("build_aggregation");
		generator.write(this.buildAggregation);

		generator.writeKey("build_aggregation_count");
		generator.write(this.buildAggregationCount);

		generator.writeKey("build_leaf_collector");
		generator.write(this.buildLeafCollector);

		generator.writeKey("build_leaf_collector_count");
		generator.write(this.buildLeafCollectorCount);

		generator.writeKey("collect");
		generator.write(this.collect);

		generator.writeKey("collect_count");
		generator.write(this.collectCount);

		generator.writeKey("initialize");
		generator.write(this.initialize);

		generator.writeKey("initialize_count");
		generator.write(this.initializeCount);

		if (this.postCollection != null) {

			generator.writeKey("post_collection");
			generator.write(this.postCollection);

		}
		if (this.postCollectionCount != null) {

			generator.writeKey("post_collection_count");
			generator.write(this.postCollectionCount);

		}

		generator.writeKey("reduce");
		generator.write(this.reduce);

		generator.writeKey("reduce_count");
		generator.write(this.reduceCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationBreakdown}.
	 */
	public static class Builder implements ObjectBuilder<AggregationBreakdown> {
		private Long buildAggregation;

		private Long buildAggregationCount;

		private Long buildLeafCollector;

		private Long buildLeafCollectorCount;

		private Long collect;

		private Long collectCount;

		private Long initialize;

		private Long initializeCount;

		@Nullable
		private Long postCollection;

		@Nullable
		private Long postCollectionCount;

		private Long reduce;

		private Long reduceCount;

		/**
		 * API name: {@code build_aggregation}
		 */
		public Builder buildAggregation(long value) {
			this.buildAggregation = value;
			return this;
		}

		/**
		 * API name: {@code build_aggregation_count}
		 */
		public Builder buildAggregationCount(long value) {
			this.buildAggregationCount = value;
			return this;
		}

		/**
		 * API name: {@code build_leaf_collector}
		 */
		public Builder buildLeafCollector(long value) {
			this.buildLeafCollector = value;
			return this;
		}

		/**
		 * API name: {@code build_leaf_collector_count}
		 */
		public Builder buildLeafCollectorCount(long value) {
			this.buildLeafCollectorCount = value;
			return this;
		}

		/**
		 * API name: {@code collect}
		 */
		public Builder collect(long value) {
			this.collect = value;
			return this;
		}

		/**
		 * API name: {@code collect_count}
		 */
		public Builder collectCount(long value) {
			this.collectCount = value;
			return this;
		}

		/**
		 * API name: {@code initialize}
		 */
		public Builder initialize(long value) {
			this.initialize = value;
			return this;
		}

		/**
		 * API name: {@code initialize_count}
		 */
		public Builder initializeCount(long value) {
			this.initializeCount = value;
			return this;
		}

		/**
		 * API name: {@code post_collection}
		 */
		public Builder postCollection(@Nullable Long value) {
			this.postCollection = value;
			return this;
		}

		/**
		 * API name: {@code post_collection_count}
		 */
		public Builder postCollectionCount(@Nullable Long value) {
			this.postCollectionCount = value;
			return this;
		}

		/**
		 * API name: {@code reduce}
		 */
		public Builder reduce(long value) {
			this.reduce = value;
			return this;
		}

		/**
		 * API name: {@code reduce_count}
		 */
		public Builder reduceCount(long value) {
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
	 * Json deserializer for {@link AggregationBreakdown}
	 */
	public static final JsonpDeserializer<AggregationBreakdown> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationBreakdown::setupAggregationBreakdownDeserializer, Builder::build);

	protected static void setupAggregationBreakdownDeserializer(
			DelegatingDeserializer<AggregationBreakdown.Builder> op) {

		op.add(Builder::buildAggregation, JsonpDeserializer.longDeserializer(), "build_aggregation");
		op.add(Builder::buildAggregationCount, JsonpDeserializer.longDeserializer(), "build_aggregation_count");
		op.add(Builder::buildLeafCollector, JsonpDeserializer.longDeserializer(), "build_leaf_collector");
		op.add(Builder::buildLeafCollectorCount, JsonpDeserializer.longDeserializer(), "build_leaf_collector_count");
		op.add(Builder::collect, JsonpDeserializer.longDeserializer(), "collect");
		op.add(Builder::collectCount, JsonpDeserializer.longDeserializer(), "collect_count");
		op.add(Builder::initialize, JsonpDeserializer.longDeserializer(), "initialize");
		op.add(Builder::initializeCount, JsonpDeserializer.longDeserializer(), "initialize_count");
		op.add(Builder::postCollection, JsonpDeserializer.longDeserializer(), "post_collection");
		op.add(Builder::postCollectionCount, JsonpDeserializer.longDeserializer(), "post_collection_count");
		op.add(Builder::reduce, JsonpDeserializer.longDeserializer(), "reduce");
		op.add(Builder::reduceCount, JsonpDeserializer.longDeserializer(), "reduce_count");

	}

}
