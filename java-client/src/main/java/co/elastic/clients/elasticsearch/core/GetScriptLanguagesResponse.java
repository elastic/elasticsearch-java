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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.get_script_languages.LanguageContext;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script_languages.Response
@JsonpDeserializable
public class GetScriptLanguagesResponse implements JsonpSerializable {
	private final List<LanguageContext> languageContexts;

	private final List<String> typesAllowed;

	// ---------------------------------------------------------------------------------------------

	private GetScriptLanguagesResponse(Builder builder) {

		this.languageContexts = ModelTypeHelper.unmodifiableRequired(builder.languageContexts, this,
				"languageContexts");
		this.typesAllowed = ModelTypeHelper.unmodifiableRequired(builder.typesAllowed, this, "typesAllowed");

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

		if (ModelTypeHelper.isDefined(this.languageContexts)) {
			generator.writeKey("language_contexts");
			generator.writeStartArray();
			for (LanguageContext item0 : this.languageContexts) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.typesAllowed)) {
			generator.writeKey("types_allowed");
			generator.writeStartArray();
			for (String item0 : this.typesAllowed) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetScriptLanguagesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetScriptLanguagesResponse> {
		private List<LanguageContext> languageContexts;

		private List<String> typesAllowed;

		/**
		 * Required - API name: {@code language_contexts}
		 */
		public final Builder languageContexts(List<LanguageContext> value) {
			this.languageContexts = value;
			return this;
		}

		/**
		 * Required - API name: {@code language_contexts}
		 */
		public final Builder languageContexts(LanguageContext... value) {
			this.languageContexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code language_contexts}
		 */
		@SafeVarargs
		public final Builder languageContexts(
				Function<LanguageContext.Builder, ObjectBuilder<LanguageContext>>... fns) {
			this.languageContexts = new ArrayList<>(fns.length);
			for (Function<LanguageContext.Builder, ObjectBuilder<LanguageContext>> fn : fns) {
				this.languageContexts.add(fn.apply(new LanguageContext.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code types_allowed}
		 */
		public final Builder typesAllowed(List<String> value) {
			this.typesAllowed = value;
			return this;
		}

		/**
		 * Required - API name: {@code types_allowed}
		 */
		public final Builder typesAllowed(String... value) {
			this.typesAllowed = Arrays.asList(value);
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
	public static final JsonpDeserializer<GetScriptLanguagesResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetScriptLanguagesResponse::setupGetScriptLanguagesResponseDeserializer, Builder::build);

	protected static void setupGetScriptLanguagesResponseDeserializer(
			DelegatingDeserializer<GetScriptLanguagesResponse.Builder> op) {

		op.add(Builder::languageContexts, JsonpDeserializer.arrayDeserializer(LanguageContext._DESERIALIZER),
				"language_contexts");
		op.add(Builder::typesAllowed, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"types_allowed");

	}

}
