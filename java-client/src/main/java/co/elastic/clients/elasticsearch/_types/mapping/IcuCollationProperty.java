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

import co.elastic.clients.elasticsearch._types.analysis.IcuCollationAlternate;
import co.elastic.clients.elasticsearch._types.analysis.IcuCollationCaseFirst;
import co.elastic.clients.elasticsearch._types.analysis.IcuCollationDecomposition;
import co.elastic.clients.elasticsearch._types.analysis.IcuCollationStrength;
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

// typedef: _types.mapping.IcuCollationProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.IcuCollationProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class IcuCollationProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean norms;

	@Nullable
	private final IndexOptions indexOptions;

	@Nullable
	private final Boolean index;

	@Nullable
	private final String nullValue;

	@Nullable
	private final String rules;

	@Nullable
	private final String language;

	@Nullable
	private final String country;

	@Nullable
	private final String variant;

	@Nullable
	private final IcuCollationStrength strength;

	@Nullable
	private final IcuCollationDecomposition decomposition;

	@Nullable
	private final IcuCollationAlternate alternate;

	@Nullable
	private final Boolean caseLevel;

	@Nullable
	private final IcuCollationCaseFirst caseFirst;

	@Nullable
	private final Boolean numeric;

	@Nullable
	private final String variableTop;

	@Nullable
	private final Boolean hiraganaQuaternaryMode;

	// ---------------------------------------------------------------------------------------------

	private IcuCollationProperty(Builder builder) {
		super(builder);

		this.norms = builder.norms;
		this.indexOptions = builder.indexOptions;
		this.index = builder.index;
		this.nullValue = builder.nullValue;
		this.rules = builder.rules;
		this.language = builder.language;
		this.country = builder.country;
		this.variant = builder.variant;
		this.strength = builder.strength;
		this.decomposition = builder.decomposition;
		this.alternate = builder.alternate;
		this.caseLevel = builder.caseLevel;
		this.caseFirst = builder.caseFirst;
		this.numeric = builder.numeric;
		this.variableTop = builder.variableTop;
		this.hiraganaQuaternaryMode = builder.hiraganaQuaternaryMode;

	}

	public static IcuCollationProperty of(Function<Builder, ObjectBuilder<IcuCollationProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.IcuCollationKeyword;
	}

	/**
	 * API name: {@code norms}
	 */
	@Nullable
	public final Boolean norms() {
		return this.norms;
	}

	/**
	 * API name: {@code index_options}
	 */
	@Nullable
	public final IndexOptions indexOptions() {
		return this.indexOptions;
	}

	/**
	 * Should the field be searchable?
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * Accepts a string value which is substituted for any explicit null values.
	 * Defaults to null, which means the field is treated as missing.
	 * <p>
	 * API name: {@code null_value}
	 */
	@Nullable
	public final String nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code rules}
	 */
	@Nullable
	public final String rules() {
		return this.rules;
	}

	/**
	 * API name: {@code language}
	 */
	@Nullable
	public final String language() {
		return this.language;
	}

	/**
	 * API name: {@code country}
	 */
	@Nullable
	public final String country() {
		return this.country;
	}

	/**
	 * API name: {@code variant}
	 */
	@Nullable
	public final String variant() {
		return this.variant;
	}

	/**
	 * API name: {@code strength}
	 */
	@Nullable
	public final IcuCollationStrength strength() {
		return this.strength;
	}

	/**
	 * API name: {@code decomposition}
	 */
	@Nullable
	public final IcuCollationDecomposition decomposition() {
		return this.decomposition;
	}

	/**
	 * API name: {@code alternate}
	 */
	@Nullable
	public final IcuCollationAlternate alternate() {
		return this.alternate;
	}

	/**
	 * API name: {@code case_level}
	 */
	@Nullable
	public final Boolean caseLevel() {
		return this.caseLevel;
	}

	/**
	 * API name: {@code case_first}
	 */
	@Nullable
	public final IcuCollationCaseFirst caseFirst() {
		return this.caseFirst;
	}

	/**
	 * API name: {@code numeric}
	 */
	@Nullable
	public final Boolean numeric() {
		return this.numeric;
	}

	/**
	 * API name: {@code variable_top}
	 */
	@Nullable
	public final String variableTop() {
		return this.variableTop;
	}

	/**
	 * API name: {@code hiragana_quaternary_mode}
	 */
	@Nullable
	public final Boolean hiraganaQuaternaryMode() {
		return this.hiraganaQuaternaryMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_collation_keyword");
		super.serializeInternal(generator, mapper);
		if (this.norms != null) {
			generator.writeKey("norms");
			generator.write(this.norms);

		}
		if (this.indexOptions != null) {
			generator.writeKey("index_options");
			this.indexOptions.serialize(generator, mapper);
		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.rules != null) {
			generator.writeKey("rules");
			generator.write(this.rules);

		}
		if (this.language != null) {
			generator.writeKey("language");
			generator.write(this.language);

		}
		if (this.country != null) {
			generator.writeKey("country");
			generator.write(this.country);

		}
		if (this.variant != null) {
			generator.writeKey("variant");
			generator.write(this.variant);

		}
		if (this.strength != null) {
			generator.writeKey("strength");
			this.strength.serialize(generator, mapper);
		}
		if (this.decomposition != null) {
			generator.writeKey("decomposition");
			this.decomposition.serialize(generator, mapper);
		}
		if (this.alternate != null) {
			generator.writeKey("alternate");
			this.alternate.serialize(generator, mapper);
		}
		if (this.caseLevel != null) {
			generator.writeKey("case_level");
			generator.write(this.caseLevel);

		}
		if (this.caseFirst != null) {
			generator.writeKey("case_first");
			this.caseFirst.serialize(generator, mapper);
		}
		if (this.numeric != null) {
			generator.writeKey("numeric");
			generator.write(this.numeric);

		}
		if (this.variableTop != null) {
			generator.writeKey("variable_top");
			generator.write(this.variableTop);

		}
		if (this.hiraganaQuaternaryMode != null) {
			generator.writeKey("hiragana_quaternary_mode");
			generator.write(this.hiraganaQuaternaryMode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuCollationProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuCollationProperty> {
		@Nullable
		private Boolean norms;

		@Nullable
		private IndexOptions indexOptions;

		@Nullable
		private Boolean index;

		@Nullable
		private String nullValue;

		@Nullable
		private String rules;

		@Nullable
		private String language;

		@Nullable
		private String country;

		@Nullable
		private String variant;

		@Nullable
		private IcuCollationStrength strength;

		@Nullable
		private IcuCollationDecomposition decomposition;

		@Nullable
		private IcuCollationAlternate alternate;

		@Nullable
		private Boolean caseLevel;

		@Nullable
		private IcuCollationCaseFirst caseFirst;

		@Nullable
		private Boolean numeric;

		@Nullable
		private String variableTop;

		@Nullable
		private Boolean hiraganaQuaternaryMode;

		/**
		 * API name: {@code norms}
		 */
		public final Builder norms(@Nullable Boolean value) {
			this.norms = value;
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
		 * Should the field be searchable?
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * Accepts a string value which is substituted for any explicit null values.
		 * Defaults to null, which means the field is treated as missing.
		 * <p>
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code rules}
		 */
		public final Builder rules(@Nullable String value) {
			this.rules = value;
			return this;
		}

		/**
		 * API name: {@code language}
		 */
		public final Builder language(@Nullable String value) {
			this.language = value;
			return this;
		}

		/**
		 * API name: {@code country}
		 */
		public final Builder country(@Nullable String value) {
			this.country = value;
			return this;
		}

		/**
		 * API name: {@code variant}
		 */
		public final Builder variant(@Nullable String value) {
			this.variant = value;
			return this;
		}

		/**
		 * API name: {@code strength}
		 */
		public final Builder strength(@Nullable IcuCollationStrength value) {
			this.strength = value;
			return this;
		}

		/**
		 * API name: {@code decomposition}
		 */
		public final Builder decomposition(@Nullable IcuCollationDecomposition value) {
			this.decomposition = value;
			return this;
		}

		/**
		 * API name: {@code alternate}
		 */
		public final Builder alternate(@Nullable IcuCollationAlternate value) {
			this.alternate = value;
			return this;
		}

		/**
		 * API name: {@code case_level}
		 */
		public final Builder caseLevel(@Nullable Boolean value) {
			this.caseLevel = value;
			return this;
		}

		/**
		 * API name: {@code case_first}
		 */
		public final Builder caseFirst(@Nullable IcuCollationCaseFirst value) {
			this.caseFirst = value;
			return this;
		}

		/**
		 * API name: {@code numeric}
		 */
		public final Builder numeric(@Nullable Boolean value) {
			this.numeric = value;
			return this;
		}

		/**
		 * API name: {@code variable_top}
		 */
		public final Builder variableTop(@Nullable String value) {
			this.variableTop = value;
			return this;
		}

		/**
		 * API name: {@code hiragana_quaternary_mode}
		 */
		public final Builder hiraganaQuaternaryMode(@Nullable Boolean value) {
			this.hiraganaQuaternaryMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuCollationProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuCollationProperty build() {
			_checkSingleUse();

			return new IcuCollationProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuCollationProperty}
	 */
	public static final JsonpDeserializer<IcuCollationProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuCollationProperty::setupIcuCollationPropertyDeserializer);

	protected static void setupIcuCollationPropertyDeserializer(ObjectDeserializer<IcuCollationProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::norms, JsonpDeserializer.booleanDeserializer(), "norms");
		op.add(Builder::indexOptions, IndexOptions._DESERIALIZER, "index_options");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");
		op.add(Builder::rules, JsonpDeserializer.stringDeserializer(), "rules");
		op.add(Builder::language, JsonpDeserializer.stringDeserializer(), "language");
		op.add(Builder::country, JsonpDeserializer.stringDeserializer(), "country");
		op.add(Builder::variant, JsonpDeserializer.stringDeserializer(), "variant");
		op.add(Builder::strength, IcuCollationStrength._DESERIALIZER, "strength");
		op.add(Builder::decomposition, IcuCollationDecomposition._DESERIALIZER, "decomposition");
		op.add(Builder::alternate, IcuCollationAlternate._DESERIALIZER, "alternate");
		op.add(Builder::caseLevel, JsonpDeserializer.booleanDeserializer(), "case_level");
		op.add(Builder::caseFirst, IcuCollationCaseFirst._DESERIALIZER, "case_first");
		op.add(Builder::numeric, JsonpDeserializer.booleanDeserializer(), "numeric");
		op.add(Builder::variableTop, JsonpDeserializer.stringDeserializer(), "variable_top");
		op.add(Builder::hiraganaQuaternaryMode, JsonpDeserializer.booleanDeserializer(), "hiragana_quaternary_mode");

		op.ignore("type");
	}

}
