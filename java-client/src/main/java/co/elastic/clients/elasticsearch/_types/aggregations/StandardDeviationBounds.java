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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
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

// typedef: _types.aggregations.StandardDeviationBounds

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.StandardDeviationBounds">API
 *      specification</a>
 */
@JsonpDeserializable
public class StandardDeviationBounds implements JsonpSerializable {
	@Nullable
	private final Double upper;

	@Nullable
	private final Double lower;

	@Nullable
	private final Double upperPopulation;

	@Nullable
	private final Double lowerPopulation;

	@Nullable
	private final Double upperSampling;

	@Nullable
	private final Double lowerSampling;

	// ---------------------------------------------------------------------------------------------

	private StandardDeviationBounds(Builder builder) {

		this.upper = builder.upper;
		this.lower = builder.lower;
		this.upperPopulation = builder.upperPopulation;
		this.lowerPopulation = builder.lowerPopulation;
		this.upperSampling = builder.upperSampling;
		this.lowerSampling = builder.lowerSampling;

	}

	public static StandardDeviationBounds of(Function<Builder, ObjectBuilder<StandardDeviationBounds>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code upper}
	 */
	@Nullable
	public final Double upper() {
		return this.upper;
	}

	/**
	 * API name: {@code lower}
	 */
	@Nullable
	public final Double lower() {
		return this.lower;
	}

	/**
	 * API name: {@code upper_population}
	 */
	@Nullable
	public final Double upperPopulation() {
		return this.upperPopulation;
	}

	/**
	 * API name: {@code lower_population}
	 */
	@Nullable
	public final Double lowerPopulation() {
		return this.lowerPopulation;
	}

	/**
	 * API name: {@code upper_sampling}
	 */
	@Nullable
	public final Double upperSampling() {
		return this.upperSampling;
	}

	/**
	 * API name: {@code lower_sampling}
	 */
	@Nullable
	public final Double lowerSampling() {
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

		if (this.upper != null) {
			generator.writeKey("upper");
			generator.write(this.upper);

		}
		if (this.lower != null) {
			generator.writeKey("lower");
			generator.write(this.lower);

		}
		if (this.upperPopulation != null) {
			generator.writeKey("upper_population");
			generator.write(this.upperPopulation);

		}
		if (this.lowerPopulation != null) {
			generator.writeKey("lower_population");
			generator.write(this.lowerPopulation);

		}
		if (this.upperSampling != null) {
			generator.writeKey("upper_sampling");
			generator.write(this.upperSampling);

		}
		if (this.lowerSampling != null) {
			generator.writeKey("lower_sampling");
			generator.write(this.lowerSampling);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StandardDeviationBounds}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StandardDeviationBounds> {
		@Nullable
		private Double upper;

		@Nullable
		private Double lower;

		@Nullable
		private Double upperPopulation;

		@Nullable
		private Double lowerPopulation;

		@Nullable
		private Double upperSampling;

		@Nullable
		private Double lowerSampling;

		/**
		 * API name: {@code upper}
		 */
		public final Builder upper(@Nullable Double value) {
			this.upper = value;
			return this;
		}

		/**
		 * API name: {@code lower}
		 */
		public final Builder lower(@Nullable Double value) {
			this.lower = value;
			return this;
		}

		/**
		 * API name: {@code upper_population}
		 */
		public final Builder upperPopulation(@Nullable Double value) {
			this.upperPopulation = value;
			return this;
		}

		/**
		 * API name: {@code lower_population}
		 */
		public final Builder lowerPopulation(@Nullable Double value) {
			this.lowerPopulation = value;
			return this;
		}

		/**
		 * API name: {@code upper_sampling}
		 */
		public final Builder upperSampling(@Nullable Double value) {
			this.upperSampling = value;
			return this;
		}

		/**
		 * API name: {@code lower_sampling}
		 */
		public final Builder lowerSampling(@Nullable Double value) {
			this.lowerSampling = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			.lazy(Builder::new, StandardDeviationBounds::setupStandardDeviationBoundsDeserializer);

	protected static void setupStandardDeviationBoundsDeserializer(
			ObjectDeserializer<StandardDeviationBounds.Builder> op) {

		op.add(Builder::upper, JsonpDeserializer.doubleDeserializer(), "upper");
		op.add(Builder::lower, JsonpDeserializer.doubleDeserializer(), "lower");
		op.add(Builder::upperPopulation, JsonpDeserializer.doubleDeserializer(), "upper_population");
		op.add(Builder::lowerPopulation, JsonpDeserializer.doubleDeserializer(), "lower_population");
		op.add(Builder::upperSampling, JsonpDeserializer.doubleDeserializer(), "upper_sampling");
		op.add(Builder::lowerSampling, JsonpDeserializer.doubleDeserializer(), "lower_sampling");

	}

}
