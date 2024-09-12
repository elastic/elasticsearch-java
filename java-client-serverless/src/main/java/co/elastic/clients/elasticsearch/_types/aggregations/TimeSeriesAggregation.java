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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.aggregations.TimeSeriesAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TimeSeriesAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TimeSeriesAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final Integer size;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private TimeSeriesAggregation(Builder builder) {

		this.size = builder.size;
		this.keyed = builder.keyed;

	}

	public static TimeSeriesAggregation of(Function<Builder, ObjectBuilder<TimeSeriesAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.TimeSeries;
	}

	/**
	 * The maximum number of results to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Set to <code>true</code> to associate a unique string key with each bucket
	 * and returns the ranges as a hash rather than an array.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
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

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeSeriesAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TimeSeriesAggregation> {
		@Nullable
		private Integer size;

		@Nullable
		private Boolean keyed;

		/**
		 * The maximum number of results to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Set to <code>true</code> to associate a unique string key with each bucket
		 * and returns the ranges as a hash rather than an array.
		 * <p>
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TimeSeriesAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeSeriesAggregation build() {
			_checkSingleUse();

			return new TimeSeriesAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeSeriesAggregation}
	 */
	public static final JsonpDeserializer<TimeSeriesAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TimeSeriesAggregation::setupTimeSeriesAggregationDeserializer);

	protected static void setupTimeSeriesAggregationDeserializer(ObjectDeserializer<TimeSeriesAggregation.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
