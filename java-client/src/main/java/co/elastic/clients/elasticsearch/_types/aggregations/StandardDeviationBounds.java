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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.StandardDeviationBounds
@JsonpDeserializable
public class StandardDeviationBounds implements JsonpSerializable {
	private final double upper;

	private final double lower;

	private final double upperPopulation;

	private final double lowerPopulation;

	private final double upperSampling;

	private final double lowerSampling;

	// ---------------------------------------------------------------------------------------------

	private StandardDeviationBounds(Builder builder) {

		this.upper = ModelTypeHelper.requireNonNull(builder.upper, this, "upper");
		this.lower = ModelTypeHelper.requireNonNull(builder.lower, this, "lower");
		this.upperPopulation = ModelTypeHelper.requireNonNull(builder.upperPopulation, this, "upperPopulation");
		this.lowerPopulation = ModelTypeHelper.requireNonNull(builder.lowerPopulation, this, "lowerPopulation");
		this.upperSampling = ModelTypeHelper.requireNonNull(builder.upperSampling, this, "upperSampling");
		this.lowerSampling = ModelTypeHelper.requireNonNull(builder.lowerSampling, this, "lowerSampling");

	}

	public static StandardDeviationBounds of(Function<Builder, ObjectBuilder<StandardDeviationBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code upper}
	 */
	public final double upper() {
		return this.upper;
	}

	/**
	 * Required - API name: {@code lower}
	 */
	public final double lower() {
		return this.lower;
	}

	/**
	 * Required - API name: {@code upper_population}
	 */
	public final double upperPopulation() {
		return this.upperPopulation;
	}

	/**
	 * Required - API name: {@code lower_population}
	 */
	public final double lowerPopulation() {
		return this.lowerPopulation;
	}

	/**
	 * Required - API name: {@code upper_sampling}
	 */
	public final double upperSampling() {
		return this.upperSampling;
	}

	/**
	 * Required - API name: {@code lower_sampling}
	 */
	public final double lowerSampling() {
		return this.lowerSampling;
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

		generator.writeKey("upper");
		generator.write(this.upper);

		generator.writeKey("lower");
		generator.write(this.lower);

		generator.writeKey("upper_population");
		generator.write(this.upperPopulation);

		generator.writeKey("lower_population");
		generator.write(this.lowerPopulation);

		generator.writeKey("upper_sampling");
		generator.write(this.upperSampling);

		generator.writeKey("lower_sampling");
		generator.write(this.lowerSampling);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StandardDeviationBounds}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StandardDeviationBounds> {
		private Double upper;

		private Double lower;

		private Double upperPopulation;

		private Double lowerPopulation;

		private Double upperSampling;

		private Double lowerSampling;

		/**
		 * Required - API name: {@code upper}
		 */
		public final Builder upper(double value) {
			this.upper = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower}
		 */
		public final Builder lower(double value) {
			this.lower = value;
			return this;
		}

		/**
		 * Required - API name: {@code upper_population}
		 */
		public final Builder upperPopulation(double value) {
			this.upperPopulation = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower_population}
		 */
		public final Builder lowerPopulation(double value) {
			this.lowerPopulation = value;
			return this;
		}

		/**
		 * Required - API name: {@code upper_sampling}
		 */
		public final Builder upperSampling(double value) {
			this.upperSampling = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower_sampling}
		 */
		public final Builder lowerSampling(double value) {
			this.lowerSampling = value;
			return this;
		}

		/**
		 * Builds a {@link StandardDeviationBounds}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StandardDeviationBounds build() {
			_checkSingleUse();

			return new StandardDeviationBounds(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StandardDeviationBounds}
	 */
	public static final JsonpDeserializer<StandardDeviationBounds> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StandardDeviationBounds::setupStandardDeviationBoundsDeserializer, Builder::build);

	protected static void setupStandardDeviationBoundsDeserializer(
			DelegatingDeserializer<StandardDeviationBounds.Builder> op) {

		op.add(Builder::upper, JsonpDeserializer.doubleDeserializer(), "upper");
		op.add(Builder::lower, JsonpDeserializer.doubleDeserializer(), "lower");
		op.add(Builder::upperPopulation, JsonpDeserializer.doubleDeserializer(), "upper_population");
		op.add(Builder::lowerPopulation, JsonpDeserializer.doubleDeserializer(), "lower_population");
		op.add(Builder::upperSampling, JsonpDeserializer.doubleDeserializer(), "upper_sampling");
		op.add(Builder::lowerSampling, JsonpDeserializer.doubleDeserializer(), "lower_sampling");

	}

}
