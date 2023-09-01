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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.AggregationProfileDelegateDebugFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.AggregationProfileDelegateDebugFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationProfileDelegateDebugFilter implements JsonpSerializable {
	@Nullable
	private final Integer resultsFromMetadata;

	@Nullable
	private final String query;

	@Nullable
	private final String specializedFor;

	@Nullable
	private final Integer segmentsCountedInConstantTime;

	// ---------------------------------------------------------------------------------------------

	private AggregationProfileDelegateDebugFilter(Builder builder) {

		this.resultsFromMetadata = builder.resultsFromMetadata;
		this.query = builder.query;
		this.specializedFor = builder.specializedFor;
		this.segmentsCountedInConstantTime = builder.segmentsCountedInConstantTime;

	}

	public static AggregationProfileDelegateDebugFilter of(
			Function<Builder, ObjectBuilder<AggregationProfileDelegateDebugFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code results_from_metadata}
	 */
	@Nullable
	public final Integer resultsFromMetadata() {
		return this.resultsFromMetadata;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code specialized_for}
	 */
	@Nullable
	public final String specializedFor() {
		return this.specializedFor;
	}

	/**
	 * API name: {@code segments_counted_in_constant_time}
	 */
	@Nullable
	public final Integer segmentsCountedInConstantTime() {
		return this.segmentsCountedInConstantTime;
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

		if (this.resultsFromMetadata != null) {
			generator.writeKey("results_from_metadata");
			generator.write(this.resultsFromMetadata);

		}
		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.specializedFor != null) {
			generator.writeKey("specialized_for");
			generator.write(this.specializedFor);

		}
		if (this.segmentsCountedInConstantTime != null) {
			generator.writeKey("segments_counted_in_constant_time");
			generator.write(this.segmentsCountedInConstantTime);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationProfileDelegateDebugFilter}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AggregationProfileDelegateDebugFilter> {
		@Nullable
		private Integer resultsFromMetadata;

		@Nullable
		private String query;

		@Nullable
		private String specializedFor;

		@Nullable
		private Integer segmentsCountedInConstantTime;

		/**
		 * API name: {@code results_from_metadata}
		 */
		public final Builder resultsFromMetadata(@Nullable Integer value) {
			this.resultsFromMetadata = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code specialized_for}
		 */
		public final Builder specializedFor(@Nullable String value) {
			this.specializedFor = value;
			return this;
		}

		/**
		 * API name: {@code segments_counted_in_constant_time}
		 */
		public final Builder segmentsCountedInConstantTime(@Nullable Integer value) {
			this.segmentsCountedInConstantTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregationProfileDelegateDebugFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationProfileDelegateDebugFilter build() {
			_checkSingleUse();

			return new AggregationProfileDelegateDebugFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationProfileDelegateDebugFilter}
	 */
	public static final JsonpDeserializer<AggregationProfileDelegateDebugFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					AggregationProfileDelegateDebugFilter::setupAggregationProfileDelegateDebugFilterDeserializer);

	protected static void setupAggregationProfileDelegateDebugFilterDeserializer(
			ObjectDeserializer<AggregationProfileDelegateDebugFilter.Builder> op) {

		op.add(Builder::resultsFromMetadata, JsonpDeserializer.integerDeserializer(), "results_from_metadata");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::specializedFor, JsonpDeserializer.stringDeserializer(), "specialized_for");
		op.add(Builder::segmentsCountedInConstantTime, JsonpDeserializer.integerDeserializer(),
				"segments_counted_in_constant_time");

	}

}
