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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuFoldingTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.IcuFoldingTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class IcuFoldingTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final String unicodeSetFilter;

	// ---------------------------------------------------------------------------------------------

	private IcuFoldingTokenFilter(Builder builder) {
		super(builder);

		this.unicodeSetFilter = ApiTypeHelper.requireNonNull(builder.unicodeSetFilter, this, "unicodeSetFilter");

	}

	public static IcuFoldingTokenFilter of(Function<Builder, ObjectBuilder<IcuFoldingTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.IcuFolding;
	}

	/**
	 * Required - API name: {@code unicode_set_filter}
	 */
	public final String unicodeSetFilter() {
		return this.unicodeSetFilter;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "icu_folding");
		super.serializeInternal(generator, mapper);
		generator.writeKey("unicode_set_filter");
		generator.write(this.unicodeSetFilter);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuFoldingTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IcuFoldingTokenFilter> {
		private String unicodeSetFilter;

		/**
		 * Required - API name: {@code unicode_set_filter}
		 */
		public final Builder unicodeSetFilter(String value) {
			this.unicodeSetFilter = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IcuFoldingTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuFoldingTokenFilter build() {
			_checkSingleUse();

			return new IcuFoldingTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuFoldingTokenFilter}
	 */
	public static final JsonpDeserializer<IcuFoldingTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IcuFoldingTokenFilter::setupIcuFoldingTokenFilterDeserializer);

	protected static void setupIcuFoldingTokenFilterDeserializer(ObjectDeserializer<IcuFoldingTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::unicodeSetFilter, JsonpDeserializer.stringDeserializer(), "unicode_set_filter");

		op.ignore("type");
	}

}
