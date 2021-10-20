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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.ByteNumberProperty
@JsonpDeserializable
public final class ByteNumberProperty extends StandardNumberProperty implements PropertyVariant {
	@Nullable
	private final Number nullValue;

	// ---------------------------------------------------------------------------------------------

	public ByteNumberProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;

	}

	public ByteNumberProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "byte";
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public Number nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "byte");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {

			generator.writeKey("null_value");
			generator.write(this.nullValue.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ByteNumberProperty}.
	 */
	public static class Builder extends StandardNumberProperty.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ByteNumberProperty> {
		@Nullable
		private Number nullValue;

		/**
		 * API name: {@code null_value}
		 */
		public Builder nullValue(@Nullable Number value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ByteNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ByteNumberProperty build() {

			return new ByteNumberProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ByteNumberProperty}
	 */
	public static final JsonpDeserializer<ByteNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ByteNumberProperty::setupByteNumberPropertyDeserializer, Builder::build);

	protected static void setupByteNumberPropertyDeserializer(DelegatingDeserializer<ByteNumberProperty.Builder> op) {
		StandardNumberProperty.setupStandardNumberPropertyDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.numberDeserializer(), "null_value");

		op.ignore("type");
	}

}
