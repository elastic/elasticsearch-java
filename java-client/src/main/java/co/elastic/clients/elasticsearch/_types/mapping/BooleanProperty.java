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

import co.elastic.clients.elasticsearch.indices.NumericFielddata;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.BooleanProperty
@JsonpDeserializable
public final class BooleanProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final NumericFielddata fielddata;

	@Nullable
	private final Boolean index;

	@Nullable
	private final Boolean nullValue;

	// ---------------------------------------------------------------------------------------------

	public BooleanProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.fielddata = builder.fielddata;
		this.index = builder.index;
		this.nullValue = builder.nullValue;

	}

	public BooleanProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "boolean";
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code fielddata}
	 */
	@Nullable
	public NumericFielddata fielddata() {
		return this.fielddata;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public Boolean nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "boolean");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {

			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.fielddata != null) {

			generator.writeKey("fielddata");
			this.fielddata.serialize(generator, mapper);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.nullValue != null) {

			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BooleanProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BooleanProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private NumericFielddata fielddata;

		@Nullable
		private Boolean index;

		@Nullable
		private Boolean nullValue;

		/**
		 * API name: {@code boost}
		 */
		public Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(@Nullable NumericFielddata value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(Function<NumericFielddata.Builder, ObjectBuilder<NumericFielddata>> fn) {
			return this.fielddata(fn.apply(new NumericFielddata.Builder()).build());
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public Builder nullValue(@Nullable Boolean value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BooleanProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BooleanProperty build() {

			return new BooleanProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BooleanProperty}
	 */
	public static final JsonpDeserializer<BooleanProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BooleanProperty::setupBooleanPropertyDeserializer, Builder::build);

	protected static void setupBooleanPropertyDeserializer(DelegatingDeserializer<BooleanProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::fielddata, NumericFielddata._DESERIALIZER, "fielddata");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::nullValue, JsonpDeserializer.booleanDeserializer(), "null_value");

		op.ignore("type");
	}

}
