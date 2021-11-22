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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.analysis.CharFilter;
import co.elastic.clients.elasticsearch._types.analysis.TokenFilter;
import co.elastic.clients.elasticsearch._types.analysis.Tokenizer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.CategorizationAnalyzerDefinition
@JsonpDeserializable
public class CategorizationAnalyzerDefinition implements JsonpSerializable {
	private final List<CharFilter> charFilter;

	private final List<TokenFilter> filter;

	@Nullable
	private final Tokenizer tokenizer;

	// ---------------------------------------------------------------------------------------------

	private CategorizationAnalyzerDefinition(Builder builder) {

		this.charFilter = ModelTypeHelper.unmodifiable(builder.charFilter);
		this.filter = ModelTypeHelper.unmodifiable(builder.filter);
		this.tokenizer = builder.tokenizer;

	}

	public static CategorizationAnalyzerDefinition of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * One or more character filters. In addition to the built-in character filters,
	 * other plugins can provide more character filters. If this property is not
	 * specified, no character filters are applied prior to categorization. If you
	 * are customizing some other aspect of the analyzer and you need to achieve the
	 * equivalent of <code>categorization_filters</code> (which are not permitted
	 * when some other aspect of the analyzer is customized), add them here as
	 * pattern replace character filters.
	 * <p>
	 * API name: {@code char_filter}
	 */
	public final List<CharFilter> charFilter() {
		return this.charFilter;
	}

	/**
	 * One or more token filters. In addition to the built-in token filters, other
	 * plugins can provide more token filters. If this property is not specified, no
	 * token filters are applied prior to categorization.
	 * <p>
	 * API name: {@code filter}
	 */
	public final List<TokenFilter> filter() {
		return this.filter;
	}

	/**
	 * The name or definition of the tokenizer to use after character filters are
	 * applied. This property is compulsory if <code>categorization_analyzer</code>
	 * is specified as an object. Machine learning provides a tokenizer called
	 * <code>ml_standard</code> that tokenizes in a way that has been determined to
	 * produce good categorization results on a variety of log file formats for logs
	 * in English. If you want to use that tokenizer but change the character or
	 * token filters, specify &quot;tokenizer&quot;: &quot;ml_standard&quot; in your
	 * <code>categorization_analyzer</code>. Additionally, the
	 * <code>ml_classic</code> tokenizer is available, which tokenizes in the same
	 * way as the non-customizable tokenizer in old versions of the product (before
	 * 6.2). <code>ml_classic</code> was the default categorization tokenizer in
	 * versions 6.2 to 7.13, so if you need categorization identical to the default
	 * for jobs created in these versions, specify &quot;tokenizer&quot;:
	 * &quot;ml_classic&quot; in your <code>categorization_analyzer</code>.
	 * <p>
	 * API name: {@code tokenizer}
	 */
	@Nullable
	public final Tokenizer tokenizer() {
		return this.tokenizer;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.charFilter)) {
			generator.writeKey("char_filter");
			generator.writeStartArray();
			for (CharFilter item0 : this.charFilter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.filter)) {
			generator.writeKey("filter");
			generator.writeStartArray();
			for (TokenFilter item0 : this.filter) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tokenizer != null) {
			generator.writeKey("tokenizer");
			this.tokenizer.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CategorizationAnalyzerDefinition}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CategorizationAnalyzerDefinition> {
		@Nullable
		private List<CharFilter> charFilter;

		@Nullable
		private List<TokenFilter> filter;

		@Nullable
		private Tokenizer tokenizer;

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(@Nullable List<CharFilter> value) {
			this.charFilter = value;
			return this;
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(CharFilter... value) {
			this.charFilter = Arrays.asList(value);
			return this;
		}

		/**
		 * One or more character filters. In addition to the built-in character filters,
		 * other plugins can provide more character filters. If this property is not
		 * specified, no character filters are applied prior to categorization. If you
		 * are customizing some other aspect of the analyzer and you need to achieve the
		 * equivalent of <code>categorization_filters</code> (which are not permitted
		 * when some other aspect of the analyzer is customized), add them here as
		 * pattern replace character filters.
		 * <p>
		 * API name: {@code char_filter}
		 */
		public final Builder charFilter(
				Function<ListBuilder<CharFilter, CharFilter.Builder>, ObjectBuilder<List<CharFilter>>> fn) {
			return charFilter(fn.apply(new ListBuilder<>(CharFilter.Builder::new)).build());
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable List<TokenFilter> value) {
			this.filter = value;
			return this;
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(TokenFilter... value) {
			this.filter = Arrays.asList(value);
			return this;
		}

		/**
		 * One or more token filters. In addition to the built-in token filters, other
		 * plugins can provide more token filters. If this property is not specified, no
		 * token filters are applied prior to categorization.
		 * <p>
		 * API name: {@code filter}
		 */
		public final Builder filter(
				Function<ListBuilder<TokenFilter, TokenFilter.Builder>, ObjectBuilder<List<TokenFilter>>> fn) {
			return filter(fn.apply(new ListBuilder<>(TokenFilter.Builder::new)).build());
		}

		/**
		 * The name or definition of the tokenizer to use after character filters are
		 * applied. This property is compulsory if <code>categorization_analyzer</code>
		 * is specified as an object. Machine learning provides a tokenizer called
		 * <code>ml_standard</code> that tokenizes in a way that has been determined to
		 * produce good categorization results on a variety of log file formats for logs
		 * in English. If you want to use that tokenizer but change the character or
		 * token filters, specify &quot;tokenizer&quot;: &quot;ml_standard&quot; in your
		 * <code>categorization_analyzer</code>. Additionally, the
		 * <code>ml_classic</code> tokenizer is available, which tokenizes in the same
		 * way as the non-customizable tokenizer in old versions of the product (before
		 * 6.2). <code>ml_classic</code> was the default categorization tokenizer in
		 * versions 6.2 to 7.13, so if you need categorization identical to the default
		 * for jobs created in these versions, specify &quot;tokenizer&quot;:
		 * &quot;ml_classic&quot; in your <code>categorization_analyzer</code>.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(@Nullable Tokenizer value) {
			this.tokenizer = value;
			return this;
		}

		/**
		 * The name or definition of the tokenizer to use after character filters are
		 * applied. This property is compulsory if <code>categorization_analyzer</code>
		 * is specified as an object. Machine learning provides a tokenizer called
		 * <code>ml_standard</code> that tokenizes in a way that has been determined to
		 * produce good categorization results on a variety of log file formats for logs
		 * in English. If you want to use that tokenizer but change the character or
		 * token filters, specify &quot;tokenizer&quot;: &quot;ml_standard&quot; in your
		 * <code>categorization_analyzer</code>. Additionally, the
		 * <code>ml_classic</code> tokenizer is available, which tokenizes in the same
		 * way as the non-customizable tokenizer in old versions of the product (before
		 * 6.2). <code>ml_classic</code> was the default categorization tokenizer in
		 * versions 6.2 to 7.13, so if you need categorization identical to the default
		 * for jobs created in these versions, specify &quot;tokenizer&quot;:
		 * &quot;ml_classic&quot; in your <code>categorization_analyzer</code>.
		 * <p>
		 * API name: {@code tokenizer}
		 */
		public final Builder tokenizer(Consumer<Tokenizer.Builder> fn) {
			Tokenizer.Builder builder = new Tokenizer.Builder();
			fn.accept(builder);
			return this.tokenizer(builder.build());
		}

		/**
		 * Builds a {@link CategorizationAnalyzerDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CategorizationAnalyzerDefinition build() {
			_checkSingleUse();

			return new CategorizationAnalyzerDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CategorizationAnalyzerDefinition}
	 */
	public static final JsonpDeserializer<CategorizationAnalyzerDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CategorizationAnalyzerDefinition::setupCategorizationAnalyzerDefinitionDeserializer);

	protected static void setupCategorizationAnalyzerDefinitionDeserializer(
			ObjectDeserializer<CategorizationAnalyzerDefinition.Builder> op) {

		op.add(Builder::charFilter, JsonpDeserializer.arrayDeserializer(CharFilter._DESERIALIZER), "char_filter");
		op.add(Builder::filter, JsonpDeserializer.arrayDeserializer(TokenFilter._DESERIALIZER), "filter");
		op.add(Builder::tokenizer, Tokenizer._DESERIALIZER, "tokenizer");

	}

}
