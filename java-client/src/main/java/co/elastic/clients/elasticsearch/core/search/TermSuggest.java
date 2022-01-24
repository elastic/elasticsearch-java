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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.TermSuggest

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.TermSuggest">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermSuggest extends SuggestBase implements SuggestionVariant {
	private final TermSuggestOption options;

	// ---------------------------------------------------------------------------------------------

	private TermSuggest(Builder builder) {
		super(builder);

		this.options = ApiTypeHelper.requireNonNull(builder.options, this, "options");

	}

	public static TermSuggest of(Function<Builder, ObjectBuilder<TermSuggest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Suggestion variant kind.
	 */
	@Override
	public Suggestion.Kind _suggestionKind() {
		return Suggestion.Kind.Term;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final TermSuggestOption options() {
		return this.options;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("options");
		this.options.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermSuggest}.
	 */

	public static class Builder extends SuggestBase.AbstractBuilder<Builder> implements ObjectBuilder<TermSuggest> {
		private TermSuggestOption options;

		/**
		 * Required - API name: {@code options}
		 */
		public final Builder options(TermSuggestOption value) {
			this.options = value;
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 */
		public final Builder options(Function<TermSuggestOption.Builder, ObjectBuilder<TermSuggestOption>> fn) {
			return this.options(fn.apply(new TermSuggestOption.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermSuggest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermSuggest build() {
			_checkSingleUse();

			return new TermSuggest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermSuggest}
	 */
	public static final JsonpDeserializer<TermSuggest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermSuggest::setupTermSuggestDeserializer);

	protected static void setupTermSuggestDeserializer(ObjectDeserializer<TermSuggest.Builder> op) {
		SuggestBase.setupSuggestBaseDeserializer(op);
		op.add(Builder::options, TermSuggestOption._DESERIALIZER, "options");

	}

}
