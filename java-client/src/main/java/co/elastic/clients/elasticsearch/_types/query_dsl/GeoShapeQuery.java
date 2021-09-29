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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoShapeQuery
@JsonpDeserializable
public final class GeoShapeQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final GeoShapeFieldQuery shape;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	public GeoShapeQuery(Builder builder) {
		super(builder);

		this.field = Objects.requireNonNull(builder.field, "field");
		this.shape = Objects.requireNonNull(builder.shape, "shape");

		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	public GeoShapeQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_shape";
	}

	/**
	 */
	public String field() {
		return this.field;
	}

	/**
	 */
	public GeoShapeFieldQuery shape() {
		return this.shape;
	}

	/**
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		// >> AdditionalProperty start
		generator.writeKey(this.field);
		this.shape.serialize(generator, mapper);

		// << AdditionalProperty start

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {

			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoShapeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<GeoShapeQuery> {
		private String field;

		private GeoShapeFieldQuery shape;

		/**
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 */
		public Builder shape(GeoShapeFieldQuery value) {
			this.shape = value;
			return this;
		}

		/**
		 */
		public Builder shape(Function<GeoShapeFieldQuery.Builder, ObjectBuilder<GeoShapeFieldQuery>> fn) {
			return this.shape(fn.apply(new GeoShapeFieldQuery.Builder()).build());
		}

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * API name: {@code ignore_unmapped}
		 */
		public Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoShapeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoShapeQuery build() {

			return new GeoShapeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoShapeQuery}
	 */
	public static final JsonpDeserializer<GeoShapeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoShapeQuery::setupGeoShapeQueryDeserializer, Builder::build);

	protected static void setupGeoShapeQueryDeserializer(DelegatingDeserializer<GeoShapeQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.shape(GeoShapeFieldQuery._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
