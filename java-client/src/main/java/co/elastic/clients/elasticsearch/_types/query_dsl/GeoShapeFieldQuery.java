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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch._types.GeoShapeRelation;
import co.elastic.clients.json.JsonData;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoShapeFieldQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoShapeFieldQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoShapeFieldQuery implements JsonpSerializable {
	@Nullable
	private final JsonData shape;

	@Nullable
	private final FieldLookup indexedShape;

	@Nullable
	private final GeoShapeRelation relation;

	// ---------------------------------------------------------------------------------------------

	private GeoShapeFieldQuery(Builder builder) {

		this.shape = builder.shape;
		this.indexedShape = builder.indexedShape;
		this.relation = builder.relation;

	}

	public static GeoShapeFieldQuery of(Function<Builder, ObjectBuilder<GeoShapeFieldQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code shape}
	 */
	@Nullable
	public final JsonData shape() {
		return this.shape;
	}

	/**
	 * API name: {@code indexed_shape}
	 */
	@Nullable
	public final FieldLookup indexedShape() {
		return this.indexedShape;
	}

	/**
	 * API name: {@code relation}
	 */
	@Nullable
	public final GeoShapeRelation relation() {
		return this.relation;
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

		if (this.shape != null) {
			generator.writeKey("shape");
			this.shape.serialize(generator, mapper);

		}
		if (this.indexedShape != null) {
			generator.writeKey("indexed_shape");
			this.indexedShape.serialize(generator, mapper);

		}
		if (this.relation != null) {
			generator.writeKey("relation");
			this.relation.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoShapeFieldQuery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GeoShapeFieldQuery> {
		@Nullable
		private JsonData shape;

		@Nullable
		private FieldLookup indexedShape;

		@Nullable
		private GeoShapeRelation relation;

		/**
		 * API name: {@code shape}
		 */
		public final Builder shape(@Nullable JsonData value) {
			this.shape = value;
			return this;
		}

		/**
		 * API name: {@code indexed_shape}
		 */
		public final Builder indexedShape(@Nullable FieldLookup value) {
			this.indexedShape = value;
			return this;
		}

		/**
		 * API name: {@code indexed_shape}
		 */
		public final Builder indexedShape(Function<FieldLookup.Builder, ObjectBuilder<FieldLookup>> fn) {
			return this.indexedShape(fn.apply(new FieldLookup.Builder()).build());
		}

		/**
		 * API name: {@code relation}
		 */
		public final Builder relation(@Nullable GeoShapeRelation value) {
			this.relation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoShapeFieldQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoShapeFieldQuery build() {
			_checkSingleUse();

			return new GeoShapeFieldQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoShapeFieldQuery}
	 */
	public static final JsonpDeserializer<GeoShapeFieldQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoShapeFieldQuery::setupGeoShapeFieldQueryDeserializer);

	protected static void setupGeoShapeFieldQueryDeserializer(ObjectDeserializer<GeoShapeFieldQuery.Builder> op) {

		op.add(Builder::shape, JsonData._DESERIALIZER, "shape");
		op.add(Builder::indexedShape, FieldLookup._DESERIALIZER, "indexed_shape");
		op.add(Builder::relation, GeoShapeRelation._DESERIALIZER, "relation");

	}

}
