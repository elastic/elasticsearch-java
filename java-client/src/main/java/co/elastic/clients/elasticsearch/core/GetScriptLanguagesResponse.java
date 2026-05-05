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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.get_script_languages.LanguageContext;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _global.get_script_languages.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.get_script_languages.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetScriptLanguagesResponse implements JsonpSerializable {
	private final List<LanguageContext> languageContexts;

	private final List<String> typesAllowed;

	// ---------------------------------------------------------------------------------------------

	private GetScriptLanguagesResponse(Builder builder) {

		this.languageContexts = ApiTypeHelper.unmodifiableRequired(builder.languageContexts, this, "languageContexts");
		this.typesAllowed = ApiTypeHelper.unmodifiableRequired(builder.typesAllowed, this, "typesAllowed");

	}

	public static GetScriptLanguagesResponse of(Function<Builder, ObjectBuilder<GetScriptLanguagesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code language_contexts}
	 */
	public final List<LanguageContext> languageContexts() {
		return this.languageContexts;
	}

	/**
	 * Required - API name: {@code types_allowed}
	 */
	public final List<String> typesAllowed() {
		return this.typesAllowed;
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

		if (ApiTypeHelper.isDefined(this.languageContexts)) {
			generator.writeKey("language_contexts");
			generator.writeStartArray();
			for (LanguageContext item0 : this.languageContexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.typesAllowed)) {
			generator.writeKey("types_allowed");
			generator.writeStartArray();
			for (String item0 : this.typesAllowed) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetScriptLanguagesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetScriptLanguagesResponse> {
		private List<LanguageContext> languageContexts;

		private List<String> typesAllowed;

		/**
		 * Required - API name: {@code language_contexts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>languageContexts</code>.
		 */
		public final Builder languageContexts(List<LanguageContext> list) {
			this.languageContexts = _listAddAll(this.languageContexts, list);
			return this;
		}

		/**
		 * Required - API name: {@code language_contexts}
		 * <p>
		 * Adds one or more values to <code>languageContexts</code>.
		 */
		public final Builder languageContexts(LanguageContext value, LanguageContext... values) {
			this.languageContexts = _listAdd(this.languageContexts, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code language_contexts}
		 * <p>
		 * Adds a value to <code>languageContexts</code> using a builder lambda.
		 */
		public final Builder languageContexts(Function<LanguageContext.Builder, ObjectBuilder<LanguageContext>> fn) {
			return languageContexts(fn.apply(new LanguageContext.Builder()).build());
		}

		/**
		 * Required - API name: {@code types_allowed}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>typesAllowed</code>.
		 */
		public final Builder typesAllowed(List<String> list) {
			this.typesAllowed = _listAddAll(this.typesAllowed, list);
			return this;
		}

		/**
		 * Required - API name: {@code types_allowed}
		 * <p>
		 * Adds one or more values to <code>typesAllowed</code>.
		 */
		public final Builder typesAllowed(String value, String... values) {
			this.typesAllowed = _listAdd(this.typesAllowed, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetScriptLanguagesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetScriptLanguagesResponse build() {
			_checkSingleUse();

			return new GetScriptLanguagesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetScriptLanguagesResponse}
	 */
	public static final JsonpDeserializer<GetScriptLanguagesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetScriptLanguagesResponse::setupGetScriptLanguagesResponseDeserializer);

	protected static void setupGetScriptLanguagesResponseDeserializer(
			ObjectDeserializer<GetScriptLanguagesResponse.Builder> op) {

		op.add(Builder::languageContexts, JsonpDeserializer.arrayDeserializer(LanguageContext._DESERIALIZER),
				"language_contexts");
		op.add(Builder::typesAllowed, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"types_allowed");

	}

}
