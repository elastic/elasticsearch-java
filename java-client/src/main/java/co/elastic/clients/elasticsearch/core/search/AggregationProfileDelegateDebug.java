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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationProfileDelegateDebug
@JsonpDeserializable
public final class AggregationProfileDelegateDebug implements JsonpSerializable {
	@Nullable
	private final Integer segmentsWithDocCountField;

	@Nullable
	private final Integer segmentsWithDeletedDocs;

	@Nullable
	private final List<AggregationProfileDelegateDebugFilter> filters;

	@Nullable
	private final Integer segmentsCounted;

	@Nullable
	private final Integer segmentsCollected;

	// ---------------------------------------------------------------------------------------------

	public AggregationProfileDelegateDebug(Builder builder) {

		this.segmentsWithDocCountField = builder.segmentsWithDocCountField;
		this.segmentsWithDeletedDocs = builder.segmentsWithDeletedDocs;
		this.filters = ModelTypeHelper.unmodifiable(builder.filters);
		this.segmentsCounted = builder.segmentsCounted;
		this.segmentsCollected = builder.segmentsCollected;

	}

	public AggregationProfileDelegateDebug(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code segments_with_doc_count_field}
	 */
	@Nullable
	public Integer segmentsWithDocCountField() {
		return this.segmentsWithDocCountField;
	}

	/**
	 * API name: {@code segments_with_deleted_docs}
	 */
	@Nullable
	public Integer segmentsWithDeletedDocs() {
		return this.segmentsWithDeletedDocs;
	}

	/**
	 * API name: {@code filters}
	 */
	@Nullable
	public List<AggregationProfileDelegateDebugFilter> filters() {
		return this.filters;
	}

	/**
	 * API name: {@code segments_counted}
	 */
	@Nullable
	public Integer segmentsCounted() {
		return this.segmentsCounted;
	}

	/**
	 * API name: {@code segments_collected}
	 */
	@Nullable
	public Integer segmentsCollected() {
		return this.segmentsCollected;
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

		if (this.segmentsWithDocCountField != null) {

			generator.writeKey("segments_with_doc_count_field");
			generator.write(this.segmentsWithDocCountField);

		}
		if (this.segmentsWithDeletedDocs != null) {

			generator.writeKey("segments_with_deleted_docs");
			generator.write(this.segmentsWithDeletedDocs);

		}
		if (this.filters != null) {

			generator.writeKey("filters");
			generator.writeStartArray();
			for (AggregationProfileDelegateDebugFilter item0 : this.filters) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.segmentsCounted != null) {

			generator.writeKey("segments_counted");
			generator.write(this.segmentsCounted);

		}
		if (this.segmentsCollected != null) {

			generator.writeKey("segments_collected");
			generator.write(this.segmentsCollected);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfileDelegateDebug}.
	 */
	public static class Builder implements ObjectBuilder<AggregationProfileDelegateDebug> {
		@Nullable
		private Integer segmentsWithDocCountField;

		@Nullable
		private Integer segmentsWithDeletedDocs;

		@Nullable
		private List<AggregationProfileDelegateDebugFilter> filters;

		@Nullable
		private Integer segmentsCounted;

		@Nullable
		private Integer segmentsCollected;

		/**
		 * API name: {@code segments_with_doc_count_field}
		 */
		public Builder segmentsWithDocCountField(@Nullable Integer value) {
			this.segmentsWithDocCountField = value;
			return this;
		}

		/**
		 * API name: {@code segments_with_deleted_docs}
		 */
		public Builder segmentsWithDeletedDocs(@Nullable Integer value) {
			this.segmentsWithDeletedDocs = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(@Nullable List<AggregationProfileDelegateDebugFilter> value) {
			this.filters = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 */
		public Builder filters(AggregationProfileDelegateDebugFilter... value) {
			this.filters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #filters(List)}, creating the list if needed.
		 */
		public Builder addFilters(AggregationProfileDelegateDebugFilter value) {
			if (this.filters == null) {
				this.filters = new ArrayList<>();
			}
			this.filters.add(value);
			return this;
		}

		/**
		 * Set {@link #filters(List)} to a singleton list.
		 */
		public Builder filters(
				Function<AggregationProfileDelegateDebugFilter.Builder, ObjectBuilder<AggregationProfileDelegateDebugFilter>> fn) {
			return this.filters(fn.apply(new AggregationProfileDelegateDebugFilter.Builder()).build());
		}

		/**
		 * Add a value to {@link #filters(List)}, creating the list if needed.
		 */
		public Builder addFilters(
				Function<AggregationProfileDelegateDebugFilter.Builder, ObjectBuilder<AggregationProfileDelegateDebugFilter>> fn) {
			return this.addFilters(fn.apply(new AggregationProfileDelegateDebugFilter.Builder()).build());
		}

		/**
		 * API name: {@code segments_counted}
		 */
		public Builder segmentsCounted(@Nullable Integer value) {
			this.segmentsCounted = value;
			return this;
		}

		/**
		 * API name: {@code segments_collected}
		 */
		public Builder segmentsCollected(@Nullable Integer value) {
			this.segmentsCollected = value;
			return this;
		}

		/**
		 * Builds a {@link AggregationProfileDelegateDebug}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfileDelegateDebug build() {

			return new AggregationProfileDelegateDebug(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfileDelegateDebug}
	 */
	public static final JsonpDeserializer<AggregationProfileDelegateDebug> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationProfileDelegateDebug::setupAggregationProfileDelegateDebugDeserializer,
					Builder::build);

	protected static void setupAggregationProfileDelegateDebugDeserializer(
			DelegatingDeserializer<AggregationProfileDelegateDebug.Builder> op) {

		op.add(Builder::segmentsWithDocCountField, JsonpDeserializer.integerDeserializer(),
				"segments_with_doc_count_field");
		op.add(Builder::segmentsWithDeletedDocs, JsonpDeserializer.integerDeserializer(), "segments_with_deleted_docs");
		op.add(Builder::filters,
				JsonpDeserializer.arrayDeserializer(AggregationProfileDelegateDebugFilter._DESERIALIZER), "filters");
		op.add(Builder::segmentsCounted, JsonpDeserializer.integerDeserializer(), "segments_counted");
		op.add(Builder::segmentsCollected, JsonpDeserializer.integerDeserializer(), "segments_collected");

	}

}
