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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.mapping.DenseVectorProperty
@JsonpDeserializable
public final class DenseVectorProperty extends PropertyBase implements PropertyVariant {
	private final int dims;

	// ---------------------------------------------------------------------------------------------

	public DenseVectorProperty(Builder builder) {
		super(builder);

		this.dims = Objects.requireNonNull(builder.dims, "dims");

	}

	public DenseVectorProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "dense_vector";
	}

	/**
	 * API name: {@code dims}
	 */
	public int dims() {
		return this.dims;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "dense_vector");
		super.serializeInternal(generator, mapper);

		generator.writeKey("dims");
		generator.write(this.dims);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DenseVectorProperty> {
		private Integer dims;

		/**
		 * API name: {@code dims}
		 */
		public Builder dims(int value) {
			this.dims = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorProperty build() {

			return new DenseVectorProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorProperty}
	 */
	public static final JsonpDeserializer<DenseVectorProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorProperty::setupDenseVectorPropertyDeserializer, Builder::build);

	protected static void setupDenseVectorPropertyDeserializer(DelegatingDeserializer<DenseVectorProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::dims, JsonpDeserializer.integerDeserializer(), "dims");

		op.ignore("type");
	}

}
