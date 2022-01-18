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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RateAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RateAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RateAggregation extends FormatMetricAggregationBase implements AggregationVariant {
	@Nullable
	private final CalendarInterval unit;

	@Nullable
	private final RateMode mode;

	// ---------------------------------------------------------------------------------------------

	private RateAggregation(Builder builder) {
		super(builder);

		this.unit = builder.unit;
		this.mode = builder.mode;

	}

	public static RateAggregation of(Function<Builder, ObjectBuilder<RateAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Rate;
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public final CalendarInterval unit() {
		return this.unit;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final RateMode mode() {
		return this.mode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.unit != null) {
			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}
		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RateAggregation}.
	 */

	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RateAggregation> {
		@Nullable
		private CalendarInterval unit;

		@Nullable
		private RateMode mode;

		/**
		 * API name: {@code unit}
		 */
		public final Builder unit(@Nullable CalendarInterval value) {
			this.unit = value;
			return this;
		}

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable RateMode value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RateAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RateAggregation build() {
			_checkSingleUse();

			return new RateAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RateAggregation}
	 */
	public static final JsonpDeserializer<RateAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RateAggregation::setupRateAggregationDeserializer);

	protected static void setupRateAggregationDeserializer(ObjectDeserializer<RateAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::unit, CalendarInterval._DESERIALIZER, "unit");
		op.add(Builder::mode, RateMode._DESERIALIZER, "mode");

	}

}
