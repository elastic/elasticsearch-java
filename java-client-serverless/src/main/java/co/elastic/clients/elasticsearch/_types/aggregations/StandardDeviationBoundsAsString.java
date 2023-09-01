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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StandardDeviationBoundsAsString

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.StandardDeviationBoundsAsString">API
 *      specification</a>
 */
@JsonpDeserializable
public class StandardDeviationBoundsAsString implements JsonpSerializable {
	private final String upper;

	private final String lower;

	private final String upperPopulation;

	private final String lowerPopulation;

	private final String upperSampling;

	private final String lowerSampling;

	// ---------------------------------------------------------------------------------------------

	private StandardDeviationBoundsAsString(Builder builder) {

		this.upper = ApiTypeHelper.requireNonNull(builder.upper, this, "upper");
		this.lower = ApiTypeHelper.requireNonNull(builder.lower, this, "lower");
		this.upperPopulation = ApiTypeHelper.requireNonNull(builder.upperPopulation, this, "upperPopulation");
		this.lowerPopulation = ApiTypeHelper.requireNonNull(builder.lowerPopulation, this, "lowerPopulation");
		this.upperSampling = ApiTypeHelper.requireNonNull(builder.upperSampling, this, "upperSampling");
		this.lowerSampling = ApiTypeHelper.requireNonNull(builder.lowerSampling, this, "lowerSampling");

	}

	public static StandardDeviationBoundsAsString of(
			Function<Builder, ObjectBuilder<StandardDeviationBoundsAsString>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code upper}
	 */
	public final String upper() {
		return this.upper;
	}

	/**
	 * Required - API name: {@code lower}
	 */
	public final String lower() {
		return this.lower;
	}

	/**
	 * Required - API name: {@code upper_population}
	 */
	public final String upperPopulation() {
		return this.upperPopulation;
	}

	/**
	 * Required - API name: {@code lower_population}
	 */
	public final String lowerPopulation() {
		return this.lowerPopulation;
	}

	/**
	 * Required - API name: {@code upper_sampling}
	 */
	public final String upperSampling() {
		return this.upperSampling;
	}

	/**
	 * Required - API name: {@code lower_sampling}
	 */
	public final String lowerSampling() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StandardDeviationBoundsAsString}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StandardDeviationBoundsAsString> {
		private String upper;

		private String lower;

		private String upperPopulation;

		private String lowerPopulation;

		private String upperSampling;

		private String lowerSampling;

		/**
		 * Required - API name: {@code upper}
		 */
		public final Builder upper(String value) {
			this.upper = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower}
		 */
		public final Builder lower(String value) {
			this.lower = value;
			return this;
		}

		/**
		 * Required - API name: {@code upper_population}
		 */
		public final Builder upperPopulation(String value) {
			this.upperPopulation = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower_population}
		 */
		public final Builder lowerPopulation(String value) {
			this.lowerPopulation = value;
			return this;
		}

		/**
		 * Required - API name: {@code upper_sampling}
		 */
		public final Builder upperSampling(String value) {
			this.upperSampling = value;
			return this;
		}

		/**
		 * Required - API name: {@code lower_sampling}
		 */
		public final Builder lowerSampling(String value) {
			this.lowerSampling = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StandardDeviationBoundsAsString}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StandardDeviationBoundsAsString build() {
			_checkSingleUse();

			return new StandardDeviationBoundsAsString(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StandardDeviationBoundsAsString}
	 */
	public static final JsonpDeserializer<StandardDeviationBoundsAsString> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StandardDeviationBoundsAsString::setupStandardDeviationBoundsAsStringDeserializer);

	protected static void setupStandardDeviationBoundsAsStringDeserializer(
			ObjectDeserializer<StandardDeviationBoundsAsString.Builder> op) {

		op.add(Builder::upper, JsonpDeserializer.stringDeserializer(), "upper");
		op.add(Builder::lower, JsonpDeserializer.stringDeserializer(), "lower");
		op.add(Builder::upperPopulation, JsonpDeserializer.stringDeserializer(), "upper_population");
		op.add(Builder::lowerPopulation, JsonpDeserializer.stringDeserializer(), "lower_population");
		op.add(Builder::upperSampling, JsonpDeserializer.stringDeserializer(), "upper_sampling");
		op.add(Builder::lowerSampling, JsonpDeserializer.stringDeserializer(), "lower_sampling");

	}

}
