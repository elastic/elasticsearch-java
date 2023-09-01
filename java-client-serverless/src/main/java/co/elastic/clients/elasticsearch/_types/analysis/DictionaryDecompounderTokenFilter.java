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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.DictionaryDecompounderTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.DictionaryDecompounderTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class DictionaryDecompounderTokenFilter extends CompoundWordTokenFilterBase
		implements
			TokenFilterDefinitionVariant {
	// ---------------------------------------------------------------------------------------------

	private DictionaryDecompounderTokenFilter(Builder builder) {
		super(builder);

	}

	public static DictionaryDecompounderTokenFilter of(
			Function<Builder, ObjectBuilder<DictionaryDecompounderTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.DictionaryDecompounder;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "dictionary_decompounder");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DictionaryDecompounderTokenFilter}.
	 */

	public static class Builder extends CompoundWordTokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DictionaryDecompounderTokenFilter> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DictionaryDecompounderTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DictionaryDecompounderTokenFilter build() {
			_checkSingleUse();

			return new DictionaryDecompounderTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DictionaryDecompounderTokenFilter}
	 */
	public static final JsonpDeserializer<DictionaryDecompounderTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DictionaryDecompounderTokenFilter::setupDictionaryDecompounderTokenFilterDeserializer);

	protected static void setupDictionaryDecompounderTokenFilterDeserializer(
			ObjectDeserializer<DictionaryDecompounderTokenFilter.Builder> op) {
		CompoundWordTokenFilterBase.setupCompoundWordTokenFilterBaseDeserializer(op);

		op.ignore("type");
	}

}
