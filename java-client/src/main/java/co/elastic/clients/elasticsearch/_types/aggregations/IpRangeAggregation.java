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
import java.lang.String;
import java.util.List;
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

// typedef: _types.aggregations.IpRangeAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.IpRangeAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpRangeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	private final List<IpRangeAggregationRange> ranges;

	// ---------------------------------------------------------------------------------------------

	private IpRangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.ranges = ApiTypeHelper.unmodifiable(builder.ranges);

	}

	public static IpRangeAggregation of(Function<Builder, ObjectBuilder<IpRangeAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.IpRange;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code ranges}
	 */
	public final List<IpRangeAggregationRange> ranges() {
		return this.ranges;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (ApiTypeHelper.isDefined(this.ranges)) {
			generator.writeKey("ranges");
			generator.writeStartArray();
			for (IpRangeAggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpRangeAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpRangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private List<IpRangeAggregationRange> ranges;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ranges</code>.
		 */
		public final Builder ranges(List<IpRangeAggregationRange> list) {
			this.ranges = _listAddAll(this.ranges, list);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds one or more values to <code>ranges</code>.
		 */
		public final Builder ranges(IpRangeAggregationRange value, IpRangeAggregationRange... values) {
			this.ranges = _listAdd(this.ranges, value, values);
			return this;
		}

		/**
		 * API name: {@code ranges}
		 * <p>
		 * Adds a value to <code>ranges</code> using a builder lambda.
		 */
		public final Builder ranges(
				Function<IpRangeAggregationRange.Builder, ObjectBuilder<IpRangeAggregationRange>> fn) {
			return ranges(fn.apply(new IpRangeAggregationRange.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpRangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpRangeAggregation build() {
			_checkSingleUse();

			return new IpRangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpRangeAggregation}
	 */
	public static final JsonpDeserializer<IpRangeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IpRangeAggregation::setupIpRangeAggregationDeserializer);

	protected static void setupIpRangeAggregationDeserializer(ObjectDeserializer<IpRangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(IpRangeAggregationRange._DESERIALIZER), "ranges");

	}

}
