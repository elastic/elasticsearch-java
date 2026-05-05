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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.List;
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

// typedef: _types.analysis.CjkBigramTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.CjkBigramTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class CjkBigramTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final List<CjkBigramIgnoredScript> ignoredScripts;

	@Nullable
	private final Boolean outputUnigrams;

	// ---------------------------------------------------------------------------------------------

	private CjkBigramTokenFilter(Builder builder) {
		super(builder);

		this.ignoredScripts = ApiTypeHelper.unmodifiable(builder.ignoredScripts);
		this.outputUnigrams = builder.outputUnigrams;

	}

	public static CjkBigramTokenFilter of(Function<Builder, ObjectBuilder<CjkBigramTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.CjkBigram;
	}

	/**
	 * Array of character scripts for which to disable bigrams.
	 * <p>
	 * API name: {@code ignored_scripts}
	 */
	public final List<CjkBigramIgnoredScript> ignoredScripts() {
		return this.ignoredScripts;
	}

	/**
	 * If <code>true</code>, emit tokens in both bigram and unigram form. If
	 * <code>false</code>, a CJK character is output in unigram form when it has no
	 * adjacent characters. Defaults to <code>false</code>.
	 * <p>
	 * API name: {@code output_unigrams}
	 */
	@Nullable
	public final Boolean outputUnigrams() {
		return this.outputUnigrams;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "cjk_bigram");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.ignoredScripts)) {
			generator.writeKey("ignored_scripts");
			generator.writeStartArray();
			for (CjkBigramIgnoredScript item0 : this.ignoredScripts) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.outputUnigrams != null) {
			generator.writeKey("output_unigrams");
			generator.write(this.outputUnigrams);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CjkBigramTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CjkBigramTokenFilter> {
		@Nullable
		private List<CjkBigramIgnoredScript> ignoredScripts;

		@Nullable
		private Boolean outputUnigrams;

		public Builder() {
		}
		private Builder(CjkBigramTokenFilter instance) {
			this.ignoredScripts = instance.ignoredScripts;
			this.outputUnigrams = instance.outputUnigrams;

		}
		/**
		 * Array of character scripts for which to disable bigrams.
		 * <p>
		 * API name: {@code ignored_scripts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ignoredScripts</code>.
		 */
		public final Builder ignoredScripts(List<CjkBigramIgnoredScript> list) {
			this.ignoredScripts = _listAddAll(this.ignoredScripts, list);
			return this;
		}

		/**
		 * Array of character scripts for which to disable bigrams.
		 * <p>
		 * API name: {@code ignored_scripts}
		 * <p>
		 * Adds one or more values to <code>ignoredScripts</code>.
		 */
		public final Builder ignoredScripts(CjkBigramIgnoredScript value, CjkBigramIgnoredScript... values) {
			this.ignoredScripts = _listAdd(this.ignoredScripts, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, emit tokens in both bigram and unigram form. If
		 * <code>false</code>, a CJK character is output in unigram form when it has no
		 * adjacent characters. Defaults to <code>false</code>.
		 * <p>
		 * API name: {@code output_unigrams}
		 */
		public final Builder outputUnigrams(@Nullable Boolean value) {
			this.outputUnigrams = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CjkBigramTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CjkBigramTokenFilter build() {
			_checkSingleUse();

			return new CjkBigramTokenFilter(this);
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
	 * Json deserializer for {@link CjkBigramTokenFilter}
	 */
	public static final JsonpDeserializer<CjkBigramTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CjkBigramTokenFilter::setupCjkBigramTokenFilterDeserializer);

	protected static void setupCjkBigramTokenFilterDeserializer(ObjectDeserializer<CjkBigramTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::ignoredScripts, JsonpDeserializer.arrayDeserializer(CjkBigramIgnoredScript._DESERIALIZER),
				"ignored_scripts");
		op.add(Builder::outputUnigrams, JsonpDeserializer.booleanDeserializer(), "output_unigrams");

		op.ignore("type");
	}

}
