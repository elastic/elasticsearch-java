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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.mapping.LongNumberProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.LongNumberProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class LongNumberProperty extends NumberPropertyBase implements PropertyVariant {
	@Nullable
	private final Long nullValue;

	@Nullable
	private final Boolean indexTerms;

	// ---------------------------------------------------------------------------------------------

	private LongNumberProperty(Builder builder) {
		super(builder);

		this.nullValue = builder.nullValue;
		this.indexTerms = builder.indexTerms;

	}

	public static LongNumberProperty of(Function<Builder, ObjectBuilder<LongNumberProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Long;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Long nullValue() {
		return this.nullValue;
	}

	/**
	 * If <code>true</code>, the field's values are indexed in an inverted index
	 * instead of a BKD tree. This speeds up queries that match a field against many
	 * values, such as <code>terms</code> queries, but wide range queries are
	 * typically slower than on a BKD tree. Requires <code>index</code> to be
	 * <code>true</code>.
	 * <p>
	 * API name: {@code index_terms}
	 */
	@Nullable
	public final Boolean indexTerms() {
		return this.indexTerms;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "long");
		super.serializeInternal(generator, mapper);
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.indexTerms != null) {
			generator.writeKey("index_terms");
			generator.write(this.indexTerms);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LongNumberProperty}.
	 */

	public static class Builder extends NumberPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<LongNumberProperty> {
		@Nullable
		private Long nullValue;

		@Nullable
		private Boolean indexTerms;

		public Builder() {
		}
		private Builder(LongNumberProperty instance) {
			super(instance);
			this.nullValue = instance.nullValue;
			this.indexTerms = instance.indexTerms;

		}
		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Long value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * If <code>true</code>, the field's values are indexed in an inverted index
		 * instead of a BKD tree. This speeds up queries that match a field against many
		 * values, such as <code>terms</code> queries, but wide range queries are
		 * typically slower than on a BKD tree. Requires <code>index</code> to be
		 * <code>true</code>.
		 * <p>
		 * API name: {@code index_terms}
		 */
		public final Builder indexTerms(@Nullable Boolean value) {
			this.indexTerms = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LongNumberProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LongNumberProperty build() {
			_checkSingleUse();

			return new LongNumberProperty(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LongNumberProperty}
	 */
	public static final JsonpDeserializer<LongNumberProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LongNumberProperty::setupLongNumberPropertyDeserializer);

	protected static void setupLongNumberPropertyDeserializer(ObjectDeserializer<LongNumberProperty.Builder> op) {
		NumberPropertyBase.setupNumberPropertyBaseDeserializer(op);
		op.add(Builder::nullValue, JsonpDeserializer.longDeserializer(), "null_value");
		op.add(Builder::indexTerms, JsonpDeserializer.booleanDeserializer(), "index_terms");

		op.ignore("type");
	}

}
