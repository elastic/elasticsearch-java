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

// typedef: _types.aggregations.BoxplotAggregation
public final class BoxplotAggregation extends MetricAggregationBase {
	@Nullable
	private final Number compression;

	// ---------------------------------------------------------------------------------------------

	protected BoxplotAggregation(Builder builder) {
		super(builder);
		this.compression = builder.compression;

	}

	/**
	 * API name: {@code compression}
	 */
	@Nullable
	public Number compression() {
		return this.compression;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.compression != null) {

			generator.writeKey("compression");
			generator.write(this.compression.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BoxplotAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BoxplotAggregation> {
		@Nullable
		private Number compression;

		/**
		 * API name: {@code compression}
		 */
		public Builder compression(@Nullable Number value) {
			this.compression = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BoxplotAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BoxplotAggregation build() {

			return new BoxplotAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for BoxplotAggregation
	 */
	public static final JsonpDeserializer<BoxplotAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, BoxplotAggregation::setupBoxplotAggregationDeserializer);

	protected static void setupBoxplotAggregationDeserializer(DelegatingDeserializer<BoxplotAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::compression, JsonpDeserializer.numberDeserializer(), "compression");

	}

}
