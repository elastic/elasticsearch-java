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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoCentroidAggregation
public final class GeoCentroidAggregation extends MetricAggregationBase {
	@Nullable
	private final Number count;

	@Nullable
	private final JsonValue location;

	// ---------------------------------------------------------------------------------------------

	protected GeoCentroidAggregation(Builder builder) {
		super(builder);
		this.count = builder.count;
		this.location = builder.location;

	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code location}
	 */
	@Nullable
	public JsonValue location() {
		return this.location;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.count != null) {

			generator.writeKey("count");
			generator.write(this.count.doubleValue());

		}
		if (this.location != null) {

			generator.writeKey("location");
			generator.write(this.location);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoCentroidAggregation}.
	 */
	public static class Builder extends MetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoCentroidAggregation> {
		@Nullable
		private Number count;

		@Nullable
		private JsonValue location;

		/**
		 * API name: {@code count}
		 */
		public Builder count(@Nullable Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code location}
		 */
		public Builder location(@Nullable JsonValue value) {
			this.location = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoCentroidAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoCentroidAggregation build() {

			return new GeoCentroidAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GeoCentroidAggregation
	 */
	public static final JsonpDeserializer<GeoCentroidAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GeoCentroidAggregation::setupGeoCentroidAggregationDeserializer);

	protected static void setupGeoCentroidAggregationDeserializer(
			DelegatingDeserializer<GeoCentroidAggregation.Builder> op) {
		MetricAggregationBase.setupMetricAggregationBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::location, JsonpDeserializer.jsonValueDeserializer(), "location");

	}

}
