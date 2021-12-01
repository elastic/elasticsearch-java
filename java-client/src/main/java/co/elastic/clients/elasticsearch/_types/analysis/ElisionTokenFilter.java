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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.ElisionTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/token_filters.ts#L186-L190">API
 *      specification</a>
 */
@JsonpDeserializable
public class ElisionTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final List<String> articles;

	private final boolean articlesCase;

	// ---------------------------------------------------------------------------------------------

	private ElisionTokenFilter(Builder builder) {
		super(builder);

		this.articles = ApiTypeHelper.unmodifiableRequired(builder.articles, this, "articles");
		this.articlesCase = ApiTypeHelper.requireNonNull(builder.articlesCase, this, "articlesCase");

	}

	public static ElisionTokenFilter of(Function<Builder, ObjectBuilder<ElisionTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.Elision;
	}

	/**
	 * Required - API name: {@code articles}
	 */
	public final List<String> articles() {
		return this.articles;
	}

	/**
	 * Required - API name: {@code articles_case}
	 */
	public final boolean articlesCase() {
		return this.articlesCase;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "elision");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.articles)) {
			generator.writeKey("articles");
			generator.writeStartArray();
			for (String item0 : this.articles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("articles_case");
		generator.write(this.articlesCase);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ElisionTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ElisionTokenFilter> {
		private List<String> articles;

		private Boolean articlesCase;

		/**
		 * Required - API name: {@code articles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>articles</code>.
		 */
		public final Builder articles(List<String> list) {
			this.articles = _listAddAll(this.articles, list);
			return this;
		}

		/**
		 * Required - API name: {@code articles}
		 * <p>
		 * Adds one or more values to <code>articles</code>.
		 */
		public final Builder articles(String value, String... values) {
			this.articles = _listAdd(this.articles, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code articles_case}
		 */
		public final Builder articlesCase(boolean value) {
			this.articlesCase = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ElisionTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ElisionTokenFilter build() {
			_checkSingleUse();

			return new ElisionTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ElisionTokenFilter}
	 */
	public static final JsonpDeserializer<ElisionTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ElisionTokenFilter::setupElisionTokenFilterDeserializer);

	protected static void setupElisionTokenFilterDeserializer(ObjectDeserializer<ElisionTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::articles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"articles");
		op.add(Builder::articlesCase, JsonpDeserializer.booleanDeserializer(), "articles_case");

		op.ignore("type");
	}

}
