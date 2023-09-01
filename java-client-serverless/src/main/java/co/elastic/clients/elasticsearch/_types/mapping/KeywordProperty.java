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

// typedef: _types.mapping.KeywordProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.KeywordProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class KeywordProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean eagerGlobalOrdinals;

	@Nullable
	private final Boolean index;

	@Nullable
	private final IndexOptions indexOptions;

	@Nullable
	private final String normalizer;

	@Nullable
	private final Boolean norms;

	@Nullable
	private final String nullValue;

	@Nullable
	private final Boolean splitQueriesOnWhitespace;

	@Nullable
	private final Boolean timeSeriesDimension;

	// ---------------------------------------------------------------------------------------------

	private KeywordProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.eagerGlobalOrdinals = builder.eagerGlobalOrdinals;
		this.index = builder.index;
		this.indexOptions = builder.indexOptions;
		this.normalizer = builder.normalizer;
		this.norms = builder.norms;
		this.nullValue = builder.nullValue;
		this.splitQueriesOnWhitespace = builder.splitQueriesOnWhitespace;
		this.timeSeriesDimension = builder.timeSeriesDimension;

	}

	public static KeywordProperty of(Function<Builder, ObjectBuilder<KeywordProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Keyword;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code eager_global_ordinals}
	 */
	@Nullable
	public final Boolean eagerGlobalOrdinals() {
		return this.eagerGlobalOrdinals;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code index_options}
	 */
	@Nullable
	public final IndexOptions indexOptions() {
		return this.indexOptions;
	}

	/**
	 * API name: {@code normalizer}
	 */
	@Nullable
	public final String normalizer() {
		return this.normalizer;
	}

	/**
	 * API name: {@code norms}
	 */
	@Nullable
	public final Boolean norms() {
		return this.norms;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final String nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code split_queries_on_whitespace}
	 */
	@Nullable
	public final Boolean splitQueriesOnWhitespace() {
		return this.splitQueriesOnWhitespace;
	}

	/**
	 * For internal use by Elastic only. Marks the field as a time series dimension.
	 * Defaults to false.
	 * <p>
	 * API name: {@code time_series_dimension}
	 */
	@Nullable
	public final Boolean timeSeriesDimension() {
		return this.timeSeriesDimension;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "keyword");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.eagerGlobalOrdinals != null) {
			generator.writeKey("eager_global_ordinals");
			generator.write(this.eagerGlobalOrdinals);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indexOptions != null) {
			generator.writeKey("index_options");
			this.indexOptions.serialize(generator, mapper);
		}
		if (this.normalizer != null) {
			generator.writeKey("normalizer");
			generator.write(this.normalizer);

		}
		if (this.norms != null) {
			generator.writeKey("norms");
			generator.write(this.norms);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.splitQueriesOnWhitespace != null) {
			generator.writeKey("split_queries_on_whitespace");
			generator.write(this.splitQueriesOnWhitespace);

		}
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeywordProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<KeywordProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private Boolean eagerGlobalOrdinals;

		@Nullable
		private Boolean index;

		@Nullable
		private IndexOptions indexOptions;

		@Nullable
		private String normalizer;

		@Nullable
		private Boolean norms;

		@Nullable
		private String nullValue;

		@Nullable
		private Boolean splitQueriesOnWhitespace;

		@Nullable
		private Boolean timeSeriesDimension;

		/**
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code eager_global_ordinals}
		 */
		public final Builder eagerGlobalOrdinals(@Nullable Boolean value) {
			this.eagerGlobalOrdinals = value;
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
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(@Nullable IndexOptions value) {
			this.indexOptions = value;
			return this;
		}

		/**
		 * API name: {@code normalizer}
		 */
		public final Builder normalizer(@Nullable String value) {
			this.normalizer = value;
			return this;
		}

		/**
		 * API name: {@code norms}
		 */
		public final Builder norms(@Nullable Boolean value) {
			this.norms = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code split_queries_on_whitespace}
		 */
		public final Builder splitQueriesOnWhitespace(@Nullable Boolean value) {
			this.splitQueriesOnWhitespace = value;
			return this;
		}

		/**
		 * For internal use by Elastic only. Marks the field as a time series dimension.
		 * Defaults to false.
		 * <p>
		 * API name: {@code time_series_dimension}
		 */
		public final Builder timeSeriesDimension(@Nullable Boolean value) {
			this.timeSeriesDimension = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KeywordProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeywordProperty build() {
			_checkSingleUse();

			return new KeywordProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeywordProperty}
	 */
	public static final JsonpDeserializer<KeywordProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KeywordProperty::setupKeywordPropertyDeserializer);

	protected static void setupKeywordPropertyDeserializer(ObjectDeserializer<KeywordProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::eagerGlobalOrdinals, JsonpDeserializer.booleanDeserializer(), "eager_global_ordinals");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::indexOptions, IndexOptions._DESERIALIZER, "index_options");
		op.add(Builder::normalizer, JsonpDeserializer.stringDeserializer(), "normalizer");
		op.add(Builder::norms, JsonpDeserializer.booleanDeserializer(), "norms");
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");
		op.add(Builder::splitQueriesOnWhitespace, JsonpDeserializer.booleanDeserializer(),
				"split_queries_on_whitespace");
		op.add(Builder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");

		op.ignore("type");
	}

}
