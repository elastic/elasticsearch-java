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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.IpProperty
@JsonpDeserializable
public final class IpProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean index;

	@Nullable
	private final String nullValue;

	// ---------------------------------------------------------------------------------------------

	public IpProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.index = builder.index;
		this.nullValue = builder.nullValue;

	}

	public IpProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "ip";
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public Double boost() {
		return this.boost;
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
	public String nullValue() {
		return this.nullValue;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "ip");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {

			generator.writeKey("boost");
			generator.write(this.boost);

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
	 * Builder for {@link IpProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private Boolean index;

		@Nullable
		private String nullValue;

		/**
		 * API name: {@code boost}
		 */
		public Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
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
		public Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpProperty build() {

			return new IpProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpProperty}
	 */
	public static final JsonpDeserializer<IpProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpProperty::setupIpPropertyDeserializer, Builder::build);

	protected static void setupIpPropertyDeserializer(DelegatingDeserializer<IpProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");

		op.ignore("type");
	}

}
