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

package co.elastic.clients.elasticsearch._global.get_script_languages;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.get_script_languages.LanguageContext
public final class LanguageContext implements ToJsonp {
	private final List<String> contexts;

	private final JsonValue language;

	// ---------------------------------------------------------------------------------------------

	protected LanguageContext(Builder builder) {

		this.contexts = Objects.requireNonNull(builder.contexts, "contexts");
		this.language = Objects.requireNonNull(builder.language, "language");

	}

	/**
	 * API name: {@code contexts}
	 */
	public List<String> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code language}
	 */
	public JsonValue language() {
		return this.language;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("contexts");
		generator.writeStartArray();
		for (String item0 : this.contexts) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("language");
		generator.write(this.language);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LanguageContext}.
	 */
	public static class Builder implements ObjectBuilder<LanguageContext> {
		private List<String> contexts;

		private JsonValue language;

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(List<String> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(String... value) {
			this.contexts = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #contexts(List)}, creating the list if needed.
		 */
		public Builder addContexts(String value) {
			if (this.contexts == null) {
				this.contexts = new ArrayList<>();
			}
			this.contexts.add(value);
			return this;
		}

		/**
		 * API name: {@code language}
		 */
		public Builder language(JsonValue value) {
			this.language = value;
			return this;
		}

		/**
		 * Builds a {@link LanguageContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LanguageContext build() {

			return new LanguageContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for LanguageContext
	 */
	public static final JsonpValueParser<LanguageContext> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, LanguageContext::setupLanguageContextParser);

	protected static void setupLanguageContextParser(DelegatingJsonpValueParser<LanguageContext.Builder> op) {

		op.add(Builder::contexts, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "contexts");
		op.add(Builder::language, JsonpValueParser.jsonValueParser(), "language");

	}

}
