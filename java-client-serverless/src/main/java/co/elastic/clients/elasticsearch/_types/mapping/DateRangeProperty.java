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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.DateRangeProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DateRangeProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateRangeProperty extends RangePropertyBase implements PropertyVariant {
	@Nullable
	private final String format;

	// ---------------------------------------------------------------------------------------------

	private DateRangeProperty(Builder builder) {
		super(builder);

		this.format = builder.format;

	}

	public static DateRangeProperty of(Function<Builder, ObjectBuilder<DateRangeProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.DateRange;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "date_range");
		super.serializeInternal(generator, mapper);
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateRangeProperty}.
	 */

	public static class Builder extends RangePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateRangeProperty> {
		@Nullable
		private String format;

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateRangeProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeProperty build() {
			_checkSingleUse();

			return new DateRangeProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeProperty}
	 */
	public static final JsonpDeserializer<DateRangeProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateRangeProperty::setupDateRangePropertyDeserializer);

	protected static void setupDateRangePropertyDeserializer(ObjectDeserializer<DateRangeProperty.Builder> op) {
		RangePropertyBase.setupRangePropertyBaseDeserializer(op);
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");

		op.ignore("type");
	}

}
