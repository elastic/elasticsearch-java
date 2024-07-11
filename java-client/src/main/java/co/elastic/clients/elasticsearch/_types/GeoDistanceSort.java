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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Boolean;
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

// typedef: _types.GeoDistanceSort

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.GeoDistanceSort">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoDistanceSort implements SortOptionsVariant, JsonpSerializable {
	private final String field;

	private final List<GeoLocation> location;

	@Nullable
	private final SortMode mode;

	@Nullable
	private final GeoDistanceType distanceType;

	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final SortOrder order;

	@Nullable
	private final DistanceUnit unit;

	@Nullable
	private final NestedSortValue nested;

	// ---------------------------------------------------------------------------------------------

	private GeoDistanceSort(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.location = ApiTypeHelper.unmodifiableRequired(builder.location, this, "location");

		this.mode = builder.mode;
		this.distanceType = builder.distanceType;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.order = builder.order;
		this.unit = builder.unit;
		this.nested = builder.nested;

	}

	public static GeoDistanceSort of(Function<Builder, ObjectBuilder<GeoDistanceSort>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SortOptions variant kind.
	 */
	@Override
	public SortOptions.Kind _sortOptionsKind() {
		return SortOptions.Kind.GeoDistance;
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final List<GeoLocation> location() {
		return this.location;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final SortMode mode() {
		return this.mode;
	}

	/**
	 * API name: {@code distance_type}
	 */
	@Nullable
	public final GeoDistanceType distanceType() {
		return this.distanceType;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public final SortOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code unit}
	 */
	@Nullable
	public final DistanceUnit unit() {
		return this.unit;
	}

	/**
	 * API name: {@code nested}
	 */
	@Nullable
	public final NestedSortValue nested() {
		return this.nested;
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
		generator.writeKey(this.field);
		generator.writeStartArray();
		for (GeoLocation item0 : this.location) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.mode != null) {
			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}
		if (this.distanceType != null) {
			generator.writeKey("distance_type");
			this.distanceType.serialize(generator, mapper);
		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.order != null) {
			generator.writeKey("order");
			this.order.serialize(generator, mapper);
		}
		if (this.unit != null) {
			generator.writeKey("unit");
			this.unit.serialize(generator, mapper);
		}
		if (this.nested != null) {
			generator.writeKey("nested");
			this.nested.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoDistanceSort}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GeoDistanceSort> {
		private String field;

		private List<GeoLocation> location;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - Adds all elements of <code>list</code> to <code>location</code>.
		 */
		public final Builder location(List<GeoLocation> list) {
			this.location = _listAddAll(this.location, list);
			return this;
		}

		/**
		 * Required - Adds one or more values to <code>location</code>.
		 */
		public final Builder location(GeoLocation value, GeoLocation... values) {
			this.location = _listAdd(this.location, value, values);
			return this;
		}

		/**
		 * Required - Adds a value to <code>location</code> using a builder lambda.
		 */
		public final Builder location(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return location(fn.apply(new GeoLocation.Builder()).build());
		}

		@Nullable
		private SortMode mode;

		@Nullable
		private GeoDistanceType distanceType;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private SortOrder order;

		@Nullable
		private DistanceUnit unit;

		@Nullable
		private NestedSortValue nested;

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable SortMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * API name: {@code distance_type}
		 */
		public final Builder distanceType(@Nullable GeoDistanceType value) {
			this.distanceType = value;
			return this;
		}

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable SortOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code unit}
		 */
		public final Builder unit(@Nullable DistanceUnit value) {
			this.unit = value;
			return this;
		}

		/**
		 * API name: {@code nested}
		 */
		public final Builder nested(@Nullable NestedSortValue value) {
			this.nested = value;
			return this;
		}

		/**
		 * API name: {@code nested}
		 */
		public final Builder nested(Function<NestedSortValue.Builder, ObjectBuilder<NestedSortValue>> fn) {
			return this.nested(fn.apply(new NestedSortValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoDistanceSort}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoDistanceSort build() {
			_checkSingleUse();

			return new GeoDistanceSort(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoDistanceSort}
	 */
	public static final JsonpDeserializer<GeoDistanceSort> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoDistanceSort::setupGeoDistanceSortDeserializer);

	protected static void setupGeoDistanceSortDeserializer(ObjectDeserializer<GeoDistanceSort.Builder> op) {

		op.add(Builder::mode, SortMode._DESERIALIZER, "mode");
		op.add(Builder::distanceType, GeoDistanceType._DESERIALIZER, "distance_type");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::order, SortOrder._DESERIALIZER, "order");
		op.add(Builder::unit, DistanceUnit._DESERIALIZER, "unit");
		op.add(Builder::nested, NestedSortValue._DESERIALIZER, "nested");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.location(
					JsonpDeserializer.arrayDeserializer(GeoLocation._DESERIALIZER).deserialize(parser, mapper));
		});

	}

}
