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
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.CompletionSuggest

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.CompletionSuggest">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompletionSuggest<TDocument> extends SuggestBase implements SuggestionVariant {
	private final List<CompletionSuggestOption<TDocument>> options;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	private CompletionSuggest(Builder<TDocument> builder) {
		super(builder);

		this.options = ApiTypeHelper.unmodifiableRequired(builder.options, this, "options");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public static <TDocument> CompletionSuggest<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<CompletionSuggest<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Suggestion variant kind.
	 */
	@Override
	public Suggestion.Kind _suggestionKind() {
		return Suggestion.Kind.Completion;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final List<CompletionSuggestOption<TDocument>> options() {
		return this.options;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartArray();
			for (CompletionSuggestOption<TDocument> item0 : this.options) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionSuggest}.
	 */

	public static class Builder<TDocument> extends SuggestBase.AbstractBuilder<Builder<TDocument>>
			implements
				ObjectBuilder<CompletionSuggest<TDocument>> {
		private List<CompletionSuggestOption<TDocument>> options;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>options</code>.
		 */
		public final Builder<TDocument> options(List<CompletionSuggestOption<TDocument>> list) {
			this.options = _listAddAll(this.options, list);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds one or more values to <code>options</code>.
		 */
		public final Builder<TDocument> options(CompletionSuggestOption<TDocument> value,
				CompletionSuggestOption<TDocument>... values) {
			this.options = _listAdd(this.options, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds a value to <code>options</code> using a builder lambda.
		 */
		public final Builder<TDocument> options(
				Function<CompletionSuggestOption.Builder<TDocument>, ObjectBuilder<CompletionSuggestOption<TDocument>>> fn) {
			return options(fn.apply(new CompletionSuggestOption.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionSuggest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionSuggest<TDocument> build() {
			_checkSingleUse();

			return new CompletionSuggest<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for CompletionSuggest
	 */
	public static <TDocument> JsonpDeserializer<CompletionSuggest<TDocument>> createCompletionSuggestDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> CompletionSuggest.setupCompletionSuggestDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link CompletionSuggest} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<CompletionSuggest<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createCompletionSuggestDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.search._types.TDocument")));

	protected static <TDocument> void setupCompletionSuggestDeserializer(
			ObjectDeserializer<CompletionSuggest.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		SuggestBase.setupSuggestBaseDeserializer(op);
		op.add(Builder::options,
				JsonpDeserializer.arrayDeserializer(
						CompletionSuggestOption.createCompletionSuggestOptionDeserializer(tDocumentDeserializer)),
				"options");

	}

}
