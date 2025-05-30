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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.analysis.PredicateTokenFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.analysis.PredicateTokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class PredicateTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private PredicateTokenFilter(Builder builder) {
		super(builder);

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static PredicateTokenFilter of(Function<Builder, ObjectBuilder<PredicateTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.PredicateTokenFilter;
	}

	/**
	 * Required - Script containing a condition used to filter incoming tokens. Only
	 * tokens that match this script are included in the output.
	 * <p>
	 * API name: {@code script}
	 */
	public final Script script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "predicate_token_filter");
		super.serializeInternal(generator, mapper);
		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PredicateTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PredicateTokenFilter> {
		private Script script;

		/**
		 * Required - Script containing a condition used to filter incoming tokens. Only
		 * tokens that match this script are included in the output.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - Script containing a condition used to filter incoming tokens. Only
		 * tokens that match this script are included in the output.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PredicateTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PredicateTokenFilter build() {
			_checkSingleUse();

			return new PredicateTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PredicateTokenFilter}
	 */
	public static final JsonpDeserializer<PredicateTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PredicateTokenFilter::setupPredicateTokenFilterDeserializer);

	protected static void setupPredicateTokenFilterDeserializer(ObjectDeserializer<PredicateTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::script, Script._DESERIALIZER, "script");

		op.ignore("type");
	}

}
