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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
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

// typedef: _types.aggregations.RoaringBitmapAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RoaringBitmapAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoaringBitmapAggregation implements AggregationVariant, JsonpSerializable {
	private final String field;

	@Nullable
	private final Long missing;

	// ---------------------------------------------------------------------------------------------

	private RoaringBitmapAggregation(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.missing = builder.missing;

	}

	public static RoaringBitmapAggregation of(Function<Builder, ObjectBuilder<RoaringBitmapAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.RoaringBitmap;
	}

	/**
	 * Required - The <code>integer</code> or <code>long</code> field from which to
	 * collect the distinct values. Scripts are not supported, so the field must be
	 * mapped.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The value to use for documents that do not have a value for the field. It
	 * must be non-negative and fit the <code>integer</code> or <code>long</code>
	 * type of the field. By default, documents without a value are ignored.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final Long missing() {
		return this.missing;
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

		generator.writeKey("field");
		generator.write(this.field);

		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoaringBitmapAggregation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RoaringBitmapAggregation> {
		private String field;

		@Nullable
		private Long missing;

		public Builder() {
		}
		private Builder(RoaringBitmapAggregation instance) {
			this.field = instance.field;
			this.missing = instance.missing;

		}
		/**
		 * Required - The <code>integer</code> or <code>long</code> field from which to
		 * collect the distinct values. Scripts are not supported, so the field must be
		 * mapped.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The value to use for documents that do not have a value for the field. It
		 * must be non-negative and fit the <code>integer</code> or <code>long</code>
		 * type of the field. By default, documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable Long value) {
			this.missing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoaringBitmapAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoaringBitmapAggregation build() {
			_checkSingleUse();

			return new RoaringBitmapAggregation(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoaringBitmapAggregation}
	 */
	public static final JsonpDeserializer<RoaringBitmapAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoaringBitmapAggregation::setupRoaringBitmapAggregationDeserializer);

	protected static void setupRoaringBitmapAggregationDeserializer(
			ObjectDeserializer<RoaringBitmapAggregation.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::missing, JsonpDeserializer.longDeserializer(), "missing");

	}

}
