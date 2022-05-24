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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.DynamicProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DynamicProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class DynamicProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final FieldValue nullValue;

	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean coerce;

	@Nullable
	private final Script script;

	@Nullable
	private final OnScriptError onScriptError;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean eagerGlobalOrdinals;

	@Nullable
	private final Boolean index;

	@Nullable
	private final IndexOptions indexOptions;

	@Nullable
	private final Boolean indexPhrases;

	@Nullable
	private final TextIndexPrefixes indexPrefixes;

	@Nullable
	private final Boolean norms;

	@Nullable
	private final Integer positionIncrementGap;

	@Nullable
	private final String searchAnalyzer;

	@Nullable
	private final String searchQuoteAnalyzer;

	@Nullable
	private final TermVectorOption termVector;

	@Nullable
	private final String format;

	@Nullable
	private final Integer precisionStep;

	@Nullable
	private final String locale;

	// ---------------------------------------------------------------------------------------------

	private DynamicProperty(Builder builder) {
		super(builder);

		this.enabled = builder.enabled;
		this.nullValue = builder.nullValue;
		this.boost = builder.boost;
		this.coerce = builder.coerce;
		this.script = builder.script;
		this.onScriptError = builder.onScriptError;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.timeSeriesMetric = builder.timeSeriesMetric;
		this.analyzer = builder.analyzer;
		this.eagerGlobalOrdinals = builder.eagerGlobalOrdinals;
		this.index = builder.index;
		this.indexOptions = builder.indexOptions;
		this.indexPhrases = builder.indexPhrases;
		this.indexPrefixes = builder.indexPrefixes;
		this.norms = builder.norms;
		this.positionIncrementGap = builder.positionIncrementGap;
		this.searchAnalyzer = builder.searchAnalyzer;
		this.searchQuoteAnalyzer = builder.searchQuoteAnalyzer;
		this.termVector = builder.termVector;
		this.format = builder.format;
		this.precisionStep = builder.precisionStep;
		this.locale = builder.locale;

	}

	public static DynamicProperty of(Function<Builder, ObjectBuilder<DynamicProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.DynamicProperty;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final FieldValue nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
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
	 * API name: {@code index_phrases}
	 */
	@Nullable
	public final Boolean indexPhrases() {
		return this.indexPhrases;
	}

	/**
	 * API name: {@code index_prefixes}
	 */
	@Nullable
	public final TextIndexPrefixes indexPrefixes() {
		return this.indexPrefixes;
	}

	/**
	 * API name: {@code norms}
	 */
	@Nullable
	public final Boolean norms() {
		return this.norms;
	}

	/**
	 * API name: {@code position_increment_gap}
	 */
	@Nullable
	public final Integer positionIncrementGap() {
		return this.positionIncrementGap;
	}

	/**
	 * API name: {@code search_analyzer}
	 */
	@Nullable
	public final String searchAnalyzer() {
		return this.searchAnalyzer;
	}

	/**
	 * API name: {@code search_quote_analyzer}
	 */
	@Nullable
	public final String searchQuoteAnalyzer() {
		return this.searchQuoteAnalyzer;
	}

	/**
	 * API name: {@code term_vector}
	 */
	@Nullable
	public final TermVectorOption termVector() {
		return this.termVector;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code precision_step}
	 */
	@Nullable
	public final Integer precisionStep() {
		return this.precisionStep;
	}

	/**
	 * API name: {@code locale}
	 */
	@Nullable
	public final String locale() {
		return this.locale;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "{dynamic_property}");
		super.serializeInternal(generator, mapper);
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			this.nullValue.serialize(generator, mapper);

		}
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}
		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

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
		if (this.indexPhrases != null) {
			generator.writeKey("index_phrases");
			generator.write(this.indexPhrases);

		}
		if (this.indexPrefixes != null) {
			generator.writeKey("index_prefixes");
			this.indexPrefixes.serialize(generator, mapper);

		}
		if (this.norms != null) {
			generator.writeKey("norms");
			generator.write(this.norms);

		}
		if (this.positionIncrementGap != null) {
			generator.writeKey("position_increment_gap");
			generator.write(this.positionIncrementGap);

		}
		if (this.searchAnalyzer != null) {
			generator.writeKey("search_analyzer");
			generator.write(this.searchAnalyzer);

		}
		if (this.searchQuoteAnalyzer != null) {
			generator.writeKey("search_quote_analyzer");
			generator.write(this.searchQuoteAnalyzer);

		}
		if (this.termVector != null) {
			generator.writeKey("term_vector");
			this.termVector.serialize(generator, mapper);
		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.precisionStep != null) {
			generator.writeKey("precision_step");
			generator.write(this.precisionStep);

		}
		if (this.locale != null) {
			generator.writeKey("locale");
			generator.write(this.locale);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DynamicProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DynamicProperty> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private FieldValue nullValue;

		@Nullable
		private Double boost;

		@Nullable
		private Boolean coerce;

		@Nullable
		private Script script;

		@Nullable
		private OnScriptError onScriptError;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean eagerGlobalOrdinals;

		@Nullable
		private Boolean index;

		@Nullable
		private IndexOptions indexOptions;

		@Nullable
		private Boolean indexPhrases;

		@Nullable
		private TextIndexPrefixes indexPrefixes;

		@Nullable
		private Boolean norms;

		@Nullable
		private Integer positionIncrementGap;

		@Nullable
		private String searchAnalyzer;

		@Nullable
		private String searchQuoteAnalyzer;

		@Nullable
		private TermVectorOption termVector;

		@Nullable
		private String format;

		@Nullable
		private Integer precisionStep;

		@Nullable
		private String locale;

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable FieldValue value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.nullValue(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(String value) {
			this.nullValue = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(long value) {
			this.nullValue = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(double value) {
			this.nullValue = FieldValue.of(value);
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(boolean value) {
			this.nullValue = FieldValue.of(value);
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
		 * API name: {@code coerce}
		 */
		public final Builder coerce(@Nullable Boolean value) {
			this.coerce = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final Builder onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
			return this;
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		/**
		 * API name: {@code time_series_metric}
		 */
		public final Builder timeSeriesMetric(@Nullable TimeSeriesMetricType value) {
			this.timeSeriesMetric = value;
			return this;
		}

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
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
		 * API name: {@code index_phrases}
		 */
		public final Builder indexPhrases(@Nullable Boolean value) {
			this.indexPhrases = value;
			return this;
		}

		/**
		 * API name: {@code index_prefixes}
		 */
		public final Builder indexPrefixes(@Nullable TextIndexPrefixes value) {
			this.indexPrefixes = value;
			return this;
		}

		/**
		 * API name: {@code index_prefixes}
		 */
		public final Builder indexPrefixes(Function<TextIndexPrefixes.Builder, ObjectBuilder<TextIndexPrefixes>> fn) {
			return this.indexPrefixes(fn.apply(new TextIndexPrefixes.Builder()).build());
		}

		/**
		 * API name: {@code norms}
		 */
		public final Builder norms(@Nullable Boolean value) {
			this.norms = value;
			return this;
		}

		/**
		 * API name: {@code position_increment_gap}
		 */
		public final Builder positionIncrementGap(@Nullable Integer value) {
			this.positionIncrementGap = value;
			return this;
		}

		/**
		 * API name: {@code search_analyzer}
		 */
		public final Builder searchAnalyzer(@Nullable String value) {
			this.searchAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code search_quote_analyzer}
		 */
		public final Builder searchQuoteAnalyzer(@Nullable String value) {
			this.searchQuoteAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code term_vector}
		 */
		public final Builder termVector(@Nullable TermVectorOption value) {
			this.termVector = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code precision_step}
		 */
		public final Builder precisionStep(@Nullable Integer value) {
			this.precisionStep = value;
			return this;
		}

		/**
		 * API name: {@code locale}
		 */
		public final Builder locale(@Nullable String value) {
			this.locale = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DynamicProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DynamicProperty build() {
			_checkSingleUse();

			return new DynamicProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DynamicProperty}
	 */
	public static final JsonpDeserializer<DynamicProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DynamicProperty::setupDynamicPropertyDeserializer);

	protected static void setupDynamicPropertyDeserializer(ObjectDeserializer<DynamicProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::nullValue, FieldValue._DESERIALIZER, "null_value");
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::eagerGlobalOrdinals, JsonpDeserializer.booleanDeserializer(), "eager_global_ordinals");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::indexOptions, IndexOptions._DESERIALIZER, "index_options");
		op.add(Builder::indexPhrases, JsonpDeserializer.booleanDeserializer(), "index_phrases");
		op.add(Builder::indexPrefixes, TextIndexPrefixes._DESERIALIZER, "index_prefixes");
		op.add(Builder::norms, JsonpDeserializer.booleanDeserializer(), "norms");
		op.add(Builder::positionIncrementGap, JsonpDeserializer.integerDeserializer(), "position_increment_gap");
		op.add(Builder::searchAnalyzer, JsonpDeserializer.stringDeserializer(), "search_analyzer");
		op.add(Builder::searchQuoteAnalyzer, JsonpDeserializer.stringDeserializer(), "search_quote_analyzer");
		op.add(Builder::termVector, TermVectorOption._DESERIALIZER, "term_vector");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::precisionStep, JsonpDeserializer.integerDeserializer(), "precision_step");
		op.add(Builder::locale, JsonpDeserializer.stringDeserializer(), "locale");

		op.ignore("type");
	}

}
