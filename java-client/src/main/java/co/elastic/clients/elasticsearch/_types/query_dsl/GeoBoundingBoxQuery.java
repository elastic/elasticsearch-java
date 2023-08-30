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

import co.elastic.clients.elasticsearch._types.GeoBounds;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.GeoBoundingBoxQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.GeoBoundingBoxQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoBoundingBoxQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final GeoBounds boundingBox;

	@Nullable
	private final GeoExecution type;

	@Nullable
	private final GeoValidationMethod validationMethod;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	private GeoBoundingBoxQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.boundingBox = ApiTypeHelper.requireNonNull(builder.boundingBox, this, "boundingBox");

		this.type = builder.type;
		this.validationMethod = builder.validationMethod;
		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	public static GeoBoundingBoxQuery of(Function<Builder, ObjectBuilder<GeoBoundingBoxQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.GeoBoundingBox;
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
	public final GeoBounds boundingBox() {
		return this.boundingBox;
	}

	/**
	 * API name: {@code type}
	 * 
	 * @deprecated 7.14.0
	 */
	@Deprecated
	@Nullable
	public final GeoExecution type() {
		return this.type;
	}

	/**
	 * Set to <code>IGNORE_MALFORMED</code> to accept geo points with invalid
	 * latitude or longitude. Set to <code>COERCE</code> to also try to infer
	 * correct latitude or longitude.
	 * <p>
	 * API name: {@code validation_method}
	 */
	@Nullable
	public final GeoValidationMethod validationMethod() {
		return this.validationMethod;
	}

	/**
	 * Set to <code>true</code> to ignore an unmapped field and not match any
	 * documents for this query. Set to <code>false</code> to throw an exception if
	 * the field is not mapped.
	 * <p>
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.boundingBox.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);
		if (this.type != null) {
			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (this.validationMethod != null) {
			generator.writeKey("validation_method");
			this.validationMethod.serialize(generator, mapper);
		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoBoundingBoxQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundingBoxQuery> {
		private String field;

		private GeoBounds boundingBox;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder boundingBox(GeoBounds value) {
			this.boundingBox = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder boundingBox(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.boundingBox(fn.apply(new GeoBounds.Builder()).build());
		}

		@Nullable
		private GeoExecution type;

		@Nullable
		private GeoValidationMethod validationMethod;

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * API name: {@code type}
		 * 
		 * @deprecated 7.14.0
		 */
		@Deprecated
		public final Builder type(@Nullable GeoExecution value) {
			this.type = value;
			return this;
		}

		/**
		 * Set to <code>IGNORE_MALFORMED</code> to accept geo points with invalid
		 * latitude or longitude. Set to <code>COERCE</code> to also try to infer
		 * correct latitude or longitude.
		 * <p>
		 * API name: {@code validation_method}
		 */
		public final Builder validationMethod(@Nullable GeoValidationMethod value) {
			this.validationMethod = value;
			return this;
		}

		/**
		 * Set to <code>true</code> to ignore an unmapped field and not match any
		 * documents for this query. Set to <code>false</code> to throw an exception if
		 * the field is not mapped.
		 * <p>
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundingBoxQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundingBoxQuery build() {
			_checkSingleUse();

			return new GeoBoundingBoxQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoBoundingBoxQuery}
	 */
	public static final JsonpDeserializer<GeoBoundingBoxQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoBoundingBoxQuery::setupGeoBoundingBoxQueryDeserializer);

	protected static void setupGeoBoundingBoxQueryDeserializer(ObjectDeserializer<GeoBoundingBoxQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::type, GeoExecution._DESERIALIZER, "type");
		op.add(Builder::validationMethod, GeoValidationMethod._DESERIALIZER, "validation_method");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.boundingBox(GeoBounds._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
