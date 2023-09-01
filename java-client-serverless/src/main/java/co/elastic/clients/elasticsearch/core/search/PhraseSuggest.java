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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggest

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.PhraseSuggest">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhraseSuggest extends SuggestBase implements SuggestionVariant {
	private final List<PhraseSuggestOption> options;

	// ---------------------------------------------------------------------------------------------

	private PhraseSuggest(Builder builder) {
		super(builder);

		this.options = ApiTypeHelper.unmodifiableRequired(builder.options, this, "options");

	}

	public static PhraseSuggest of(Function<Builder, ObjectBuilder<PhraseSuggest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Suggestion variant kind.
	 */
	@Override
	public Suggestion.Kind _suggestionKind() {
		return Suggestion.Kind.Phrase;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final List<PhraseSuggestOption> options() {
		return this.options;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartArray();
			for (PhraseSuggestOption item0 : this.options) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggest}.
	 */

	public static class Builder extends SuggestBase.AbstractBuilder<Builder> implements ObjectBuilder<PhraseSuggest> {
		private List<PhraseSuggestOption> options;

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>options</code>.
		 */
		public final Builder options(List<PhraseSuggestOption> list) {
			this.options = _listAddAll(this.options, list);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds one or more values to <code>options</code>.
		 */
		public final Builder options(PhraseSuggestOption value, PhraseSuggestOption... values) {
			this.options = _listAdd(this.options, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds a value to <code>options</code> using a builder lambda.
		 */
		public final Builder options(Function<PhraseSuggestOption.Builder, ObjectBuilder<PhraseSuggestOption>> fn) {
			return options(fn.apply(new PhraseSuggestOption.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggest build() {
			_checkSingleUse();

			return new PhraseSuggest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggest}
	 */
	public static final JsonpDeserializer<PhraseSuggest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PhraseSuggest::setupPhraseSuggestDeserializer);

	protected static void setupPhraseSuggestDeserializer(ObjectDeserializer<PhraseSuggest.Builder> op) {
		SuggestBase.setupSuggestBaseDeserializer(op);
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(PhraseSuggestOption._DESERIALIZER), "options");

	}

}
