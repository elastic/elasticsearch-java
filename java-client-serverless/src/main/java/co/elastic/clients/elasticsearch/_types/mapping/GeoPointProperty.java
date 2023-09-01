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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.elasticsearch._types.GeoLocation;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.GeoPointProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.GeoPointProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoPointProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Boolean ignoreZValue;

	@Nullable
	private final GeoLocation nullValue;

	// ---------------------------------------------------------------------------------------------

	private GeoPointProperty(Builder builder) {
		super(builder);

		this.ignoreMalformed = builder.ignoreMalformed;
		this.ignoreZValue = builder.ignoreZValue;
		this.nullValue = builder.nullValue;

	}

	public static GeoPointProperty of(Function<Builder, ObjectBuilder<GeoPointProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.GeoPoint;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code ignore_z_value}
	 */
	@Nullable
	public final Boolean ignoreZValue() {
		return this.ignoreZValue;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final GeoLocation nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "geo_point");
		super.serializeInternal(generator, mapper);
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.ignoreZValue != null) {
			generator.writeKey("ignore_z_value");
			generator.write(this.ignoreZValue);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			this.nullValue.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoPointProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoPointProperty> {
		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Boolean ignoreZValue;

		@Nullable
		private GeoLocation nullValue;

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		/**
		 * API name: {@code ignore_z_value}
		 */
		public final Builder ignoreZValue(@Nullable Boolean value) {
			this.ignoreZValue = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable GeoLocation value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(Function<GeoLocation.Builder, ObjectBuilder<GeoLocation>> fn) {
			return this.nullValue(fn.apply(new GeoLocation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoPointProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoPointProperty build() {
			_checkSingleUse();

			return new GeoPointProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoPointProperty}
	 */
	public static final JsonpDeserializer<GeoPointProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoPointProperty::setupGeoPointPropertyDeserializer);

	protected static void setupGeoPointPropertyDeserializer(ObjectDeserializer<GeoPointProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::ignoreZValue, JsonpDeserializer.booleanDeserializer(), "ignore_z_value");
		op.add(Builder::nullValue, GeoLocation._DESERIALIZER, "null_value");

		op.ignore("type");
	}

}
