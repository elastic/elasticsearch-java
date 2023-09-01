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
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.TokenCountProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.TokenCountProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenCountProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean index;

	@Nullable
	private final Double nullValue;

	@Nullable
	private final Boolean enablePositionIncrements;

	// ---------------------------------------------------------------------------------------------

	private TokenCountProperty(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.boost = builder.boost;
		this.index = builder.index;
		this.nullValue = builder.nullValue;
		this.enablePositionIncrements = builder.enablePositionIncrements;

	}

	public static TokenCountProperty of(Function<Builder, ObjectBuilder<TokenCountProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.TokenCount;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Double nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code enable_position_increments}
	 */
	@Nullable
	public final Boolean enablePositionIncrements() {
		return this.enablePositionIncrements;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "token_count");
		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
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
		if (this.enablePositionIncrements != null) {
			generator.writeKey("enable_position_increments");
			generator.write(this.enablePositionIncrements);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TokenCountProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TokenCountProperty> {
		@Nullable
		private String analyzer;

		@Nullable
		private Double boost;

		@Nullable
		private Boolean index;

		@Nullable
		private Double nullValue;

		@Nullable
		private Boolean enablePositionIncrements;

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Double value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code enable_position_increments}
		 */
		public final Builder enablePositionIncrements(@Nullable Boolean value) {
			this.enablePositionIncrements = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TokenCountProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TokenCountProperty build() {
			_checkSingleUse();

			return new TokenCountProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TokenCountProperty}
	 */
	public static final JsonpDeserializer<TokenCountProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TokenCountProperty::setupTokenCountPropertyDeserializer);

	protected static void setupTokenCountPropertyDeserializer(ObjectDeserializer<TokenCountProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::nullValue, JsonpDeserializer.doubleDeserializer(), "null_value");
		op.add(Builder::enablePositionIncrements, JsonpDeserializer.booleanDeserializer(),
				"enable_position_increments");

		op.ignore("type");
	}

}
