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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.AggregationProfileDelegateDebug

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.AggregationProfileDelegateDebug">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationProfileDelegateDebug implements JsonpSerializable {
	@Nullable
	private final Integer segmentsWithDocCountField;

	@Nullable
	private final Integer segmentsWithDeletedDocs;

	private final List<AggregationProfileDelegateDebugFilter> filters;

	@Nullable
	private final Integer segmentsCounted;

	@Nullable
	private final Integer segmentsCollected;

	@Nullable
	private final String mapReducer;

	// ---------------------------------------------------------------------------------------------

	private AggregationProfileDelegateDebug(Builder builder) {

		this.segmentsWithDocCountField = builder.segmentsWithDocCountField;
		this.segmentsWithDeletedDocs = builder.segmentsWithDeletedDocs;
		this.filters = ApiTypeHelper.unmodifiable(builder.filters);
		this.segmentsCounted = builder.segmentsCounted;
		this.segmentsCollected = builder.segmentsCollected;
		this.mapReducer = builder.mapReducer;

	}

	public static AggregationProfileDelegateDebug of(
			Function<Builder, ObjectBuilder<AggregationProfileDelegateDebug>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code segments_with_doc_count_field}
	 */
	@Nullable
	public final Integer segmentsWithDocCountField() {
		return this.segmentsWithDocCountField;
	}

	/**
	 * API name: {@code segments_with_deleted_docs}
	 */
	@Nullable
	public final Integer segmentsWithDeletedDocs() {
		return this.segmentsWithDeletedDocs;
	}

	/**
	 * API name: {@code filters}
	 */
	public final List<AggregationProfileDelegateDebugFilter> filters() {
		return this.filters;
	}

	/**
	 * API name: {@code segments_counted}
	 */
	@Nullable
	public final Integer segmentsCounted() {
		return this.segmentsCounted;
	}

	/**
	 * API name: {@code segments_collected}
	 */
	@Nullable
	public final Integer segmentsCollected() {
		return this.segmentsCollected;
	}

	/**
	 * API name: {@code map_reducer}
	 */
	@Nullable
	public final String mapReducer() {
		return this.mapReducer;
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
		if (ApiTypeHelper.isDefined(this.filters)) {
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
		if (this.mapReducer != null) {
			generator.writeKey("map_reducer");
			generator.write(this.mapReducer);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfileDelegateDebug}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AggregationProfileDelegateDebug> {
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

		@Nullable
		private String mapReducer;

		/**
		 * API name: {@code segments_with_doc_count_field}
		 */
		public final Builder segmentsWithDocCountField(@Nullable Integer value) {
			this.segmentsWithDocCountField = value;
			return this;
		}

		/**
		 * API name: {@code segments_with_deleted_docs}
		 */
		public final Builder segmentsWithDeletedDocs(@Nullable Integer value) {
			this.segmentsWithDeletedDocs = value;
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filters</code>.
		 */
		public final Builder filters(List<AggregationProfileDelegateDebugFilter> list) {
			this.filters = _listAddAll(this.filters, list);
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds one or more values to <code>filters</code>.
		 */
		public final Builder filters(AggregationProfileDelegateDebugFilter value,
				AggregationProfileDelegateDebugFilter... values) {
			this.filters = _listAdd(this.filters, value, values);
			return this;
		}

		/**
		 * API name: {@code filters}
		 * <p>
		 * Adds a value to <code>filters</code> using a builder lambda.
		 */
		public final Builder filters(
				Function<AggregationProfileDelegateDebugFilter.Builder, ObjectBuilder<AggregationProfileDelegateDebugFilter>> fn) {
			return filters(fn.apply(new AggregationProfileDelegateDebugFilter.Builder()).build());
		}

		/**
		 * API name: {@code segments_counted}
		 */
		public final Builder segmentsCounted(@Nullable Integer value) {
			this.segmentsCounted = value;
			return this;
		}

		/**
		 * API name: {@code segments_collected}
		 */
		public final Builder segmentsCollected(@Nullable Integer value) {
			this.segmentsCollected = value;
			return this;
		}

		/**
		 * API name: {@code map_reducer}
		 */
		public final Builder mapReducer(@Nullable String value) {
			this.mapReducer = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregationProfileDelegateDebug}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfileDelegateDebug build() {
			_checkSingleUse();

			return new AggregationProfileDelegateDebug(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfileDelegateDebug}
	 */
	public static final JsonpDeserializer<AggregationProfileDelegateDebug> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AggregationProfileDelegateDebug::setupAggregationProfileDelegateDebugDeserializer);

	protected static void setupAggregationProfileDelegateDebugDeserializer(
			ObjectDeserializer<AggregationProfileDelegateDebug.Builder> op) {

		op.add(Builder::segmentsWithDocCountField, JsonpDeserializer.integerDeserializer(),
				"segments_with_doc_count_field");
		op.add(Builder::segmentsWithDeletedDocs, JsonpDeserializer.integerDeserializer(), "segments_with_deleted_docs");
		op.add(Builder::filters,
				JsonpDeserializer.arrayDeserializer(AggregationProfileDelegateDebugFilter._DESERIALIZER), "filters");
		op.add(Builder::segmentsCounted, JsonpDeserializer.integerDeserializer(), "segments_counted");
		op.add(Builder::segmentsCollected, JsonpDeserializer.integerDeserializer(), "segments_collected");
		op.add(Builder::mapReducer, JsonpDeserializer.stringDeserializer(), "map_reducer");

	}

}
