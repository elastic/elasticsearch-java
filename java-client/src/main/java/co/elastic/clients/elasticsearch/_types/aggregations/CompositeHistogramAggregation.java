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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.aggregations.CompositeHistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeHistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeHistogramAggregation extends CompositeAggregationBase {
	private final double interval;

	// ---------------------------------------------------------------------------------------------

	private CompositeHistogramAggregation(Builder builder) {
		super(builder);

		this.interval = ApiTypeHelper.requireNonNull(builder.interval, this, "interval");

	}

	public static CompositeHistogramAggregation of(Function<Builder, ObjectBuilder<CompositeHistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code interval}
	 */
	public final double interval() {
		return this.interval;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("interval");
		generator.write(this.interval);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeHistogramAggregation}.
	 */

	public static class Builder extends CompositeAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompositeHistogramAggregation> {
		private Double interval;

		/**
		 * Required - API name: {@code interval}
		 */
		public final Builder interval(double value) {
			this.interval = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeHistogramAggregation build() {
			_checkSingleUse();

			return new CompositeHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeHistogramAggregation}
	 */
	public static final JsonpDeserializer<CompositeHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeHistogramAggregation::setupCompositeHistogramAggregationDeserializer);

	protected static void setupCompositeHistogramAggregationDeserializer(
			ObjectDeserializer<CompositeHistogramAggregation.Builder> op) {
		CompositeAggregationBase.setupCompositeAggregationBaseDeserializer(op);
		op.add(Builder::interval, JsonpDeserializer.doubleDeserializer(), "interval");

	}

}
