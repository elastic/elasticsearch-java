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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PercentileRanksAggregation
public final class PercentileRanksAggregation extends FormatMetricAggregationBase {
	@Nullable
	private final Boolean keyed;

	@Nullable
	private final List<Number> values;

	@Nullable
	private final HdrMethod hdr;

	@Nullable
	private final TDigest tdigest;

	// ---------------------------------------------------------------------------------------------

	public PercentileRanksAggregation(Builder builder) {
		super(builder);

		this.keyed = builder.keyed;
		this.values = builder.values;
		this.hdr = builder.hdr;
		this.tdigest = builder.tdigest;

	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public Boolean keyed() {
		return this.keyed;
	}

	/**
	 * API name: {@code values}
	 */
	@Nullable
	public List<Number> values() {
		return this.values;
	}

	/**
	 * API name: {@code hdr}
	 */
	@Nullable
	public HdrMethod hdr() {
		return this.hdr;
	}

	/**
	 * API name: {@code tdigest}
	 */
	@Nullable
	public TDigest tdigest() {
		return this.tdigest;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.keyed != null) {

			generator.writeKey("keyed");
			generator.write(this.keyed);

		}
		if (this.values != null) {

			generator.writeKey("values");
			generator.writeStartArray();
			for (Number item0 : this.values) {
				generator.write(item0.doubleValue());

			}
			generator.writeEnd();

		}
		if (this.hdr != null) {

			generator.writeKey("hdr");
			this.hdr.serialize(generator, mapper);

		}
		if (this.tdigest != null) {

			generator.writeKey("tdigest");
			this.tdigest.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercentileRanksAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercentileRanksAggregation> {
		@Nullable
		private Boolean keyed;

		@Nullable
		private List<Number> values;

		@Nullable
		private HdrMethod hdr;

		@Nullable
		private TDigest tdigest;

		/**
		 * API name: {@code keyed}
		 */
		public Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 */
		public Builder values(@Nullable List<Number> value) {
			this.values = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 */
		public Builder values(Number... value) {
			this.values = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #values(List)}, creating the list if needed.
		 */
		public Builder addValues(Number value) {
			if (this.values == null) {
				this.values = new ArrayList<>();
			}
			this.values.add(value);
			return this;
		}

		/**
		 * API name: {@code hdr}
		 */
		public Builder hdr(@Nullable HdrMethod value) {
			this.hdr = value;
			return this;
		}

		/**
		 * API name: {@code hdr}
		 */
		public Builder hdr(Function<HdrMethod.Builder, ObjectBuilder<HdrMethod>> fn) {
			return this.hdr(fn.apply(new HdrMethod.Builder()).build());
		}

		/**
		 * API name: {@code tdigest}
		 */
		public Builder tdigest(@Nullable TDigest value) {
			this.tdigest = value;
			return this;
		}

		/**
		 * API name: {@code tdigest}
		 */
		public Builder tdigest(Function<TDigest.Builder, ObjectBuilder<TDigest>> fn) {
			return this.tdigest(fn.apply(new TDigest.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercentileRanksAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercentileRanksAggregation build() {

			return new PercentileRanksAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercentileRanksAggregation}
	 */
	public static final JsonpDeserializer<PercentileRanksAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PercentileRanksAggregation::setupPercentileRanksAggregationDeserializer);

	protected static void setupPercentileRanksAggregationDeserializer(
			DelegatingDeserializer<PercentileRanksAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "values");
		op.add(Builder::hdr, HdrMethod.DESERIALIZER, "hdr");
		op.add(Builder::tdigest, TDigest.DESERIALIZER, "tdigest");

	}

}
