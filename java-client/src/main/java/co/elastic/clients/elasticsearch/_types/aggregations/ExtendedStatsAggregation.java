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
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ExtendedStatsAggregation
public final class ExtendedStatsAggregation extends FormatMetricAggregationBase {
	@Nullable
	private final Number sigma;

	// ---------------------------------------------------------------------------------------------

	protected ExtendedStatsAggregation(Builder builder) {
		super(builder);
		this.sigma = builder.sigma;

	}

	/**
	 * API name: {@code sigma}
	 */
	@Nullable
	public Number sigma() {
		return this.sigma;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.sigma != null) {

			generator.writeKey("sigma");
			generator.write(this.sigma.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedStatsAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedStatsAggregation> {
		@Nullable
		private Number sigma;

		/**
		 * API name: {@code sigma}
		 */
		public Builder sigma(@Nullable Number value) {
			this.sigma = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedStatsAggregation build() {

			return new ExtendedStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExtendedStatsAggregation
	 */
	public static final JsonpDeserializer<ExtendedStatsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExtendedStatsAggregation::setupExtendedStatsAggregationDeserializer);

	protected static void setupExtendedStatsAggregationDeserializer(
			DelegatingDeserializer<ExtendedStatsAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);
		op.add(Builder::sigma, JsonpDeserializer.numberDeserializer(), "sigma");

	}

}
