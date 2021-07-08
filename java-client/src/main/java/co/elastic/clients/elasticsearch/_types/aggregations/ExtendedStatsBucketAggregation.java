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

// typedef: _types.aggregations.ExtendedStatsBucketAggregation
public final class ExtendedStatsBucketAggregation extends PipelineAggregationBase {
	@Nullable
	private final Number sigma;

	// ---------------------------------------------------------------------------------------------

	protected ExtendedStatsBucketAggregation(Builder builder) {
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
	 * Builder for {@link ExtendedStatsBucketAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedStatsBucketAggregation> {
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
		 * Builds a {@link ExtendedStatsBucketAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedStatsBucketAggregation build() {

			return new ExtendedStatsBucketAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ExtendedStatsBucketAggregation
	 */
	public static final JsonpDeserializer<ExtendedStatsBucketAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ExtendedStatsBucketAggregation::setupExtendedStatsBucketAggregationDeserializer);

	protected static void setupExtendedStatsBucketAggregationDeserializer(
			DelegatingDeserializer<ExtendedStatsBucketAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::sigma, JsonpDeserializer.numberDeserializer(), "sigma");

	}

}
