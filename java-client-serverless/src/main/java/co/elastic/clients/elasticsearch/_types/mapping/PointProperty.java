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

// typedef: _types.mapping.PointProperty

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.PointProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class PointProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Boolean ignoreZValue;

	@Nullable
	private final String nullValue;

	// ---------------------------------------------------------------------------------------------

	private PointProperty(Builder builder) {
		super(builder);

		this.ignoreMalformed = builder.ignoreMalformed;
		this.ignoreZValue = builder.ignoreZValue;
		this.nullValue = builder.nullValue;

	}

	public static PointProperty of(Function<Builder, ObjectBuilder<PointProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Point;
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
	public final String nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "point");
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
			generator.write(this.nullValue);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PointProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PointProperty> {
		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Boolean ignoreZValue;

		@Nullable
		private String nullValue;

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
		public final Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PointProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PointProperty build() {
			_checkSingleUse();

			return new PointProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PointProperty}
	 */
	public static final JsonpDeserializer<PointProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PointProperty::setupPointPropertyDeserializer);

	protected static void setupPointPropertyDeserializer(ObjectDeserializer<PointProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::ignoreZValue, JsonpDeserializer.booleanDeserializer(), "ignore_z_value");
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");

		op.ignore("type");
	}

}
