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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.CompletionSuggester
public final class CompletionSuggester extends SuggesterBase {
	@Nullable
	private final Map<String, JsonValue> contexts;

	@Nullable
	private final SuggestFuzziness fuzzy;

	@Nullable
	private final String prefix;

	@Nullable
	private final String regex;

	@Nullable
	private final Boolean skipDuplicates;

	// ---------------------------------------------------------------------------------------------

	public CompletionSuggester(Builder builder) {
		super(builder);

		this.contexts = builder.contexts;
		this.fuzzy = builder.fuzzy;
		this.prefix = builder.prefix;
		this.regex = builder.regex;
		this.skipDuplicates = builder.skipDuplicates;

	}

	/**
	 * API name: {@code contexts}
	 */
	@Nullable
	public Map<String, JsonValue> contexts() {
		return this.contexts;
	}

	/**
	 * API name: {@code fuzzy}
	 */
	@Nullable
	public SuggestFuzziness fuzzy() {
		return this.fuzzy;
	}

	/**
	 * API name: {@code prefix}
	 */
	@Nullable
	public String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code regex}
	 */
	@Nullable
	public String regex() {
		return this.regex;
	}

	/**
	 * API name: {@code skip_duplicates}
	 */
	@Nullable
	public Boolean skipDuplicates() {
		return this.skipDuplicates;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.contexts != null) {

			generator.writeKey("contexts");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.contexts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.fuzzy != null) {

			generator.writeKey("fuzzy");
			this.fuzzy.serialize(generator, mapper);

		}
		if (this.prefix != null) {

			generator.writeKey("prefix");
			generator.write(this.prefix);

		}
		if (this.regex != null) {

			generator.writeKey("regex");
			generator.write(this.regex);

		}
		if (this.skipDuplicates != null) {

			generator.writeKey("skip_duplicates");
			generator.write(this.skipDuplicates);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompletionSuggester}.
	 */
	public static class Builder extends SuggesterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CompletionSuggester> {
		@Nullable
		private Map<String, JsonValue> contexts;

		@Nullable
		private SuggestFuzziness fuzzy;

		@Nullable
		private String prefix;

		@Nullable
		private String regex;

		@Nullable
		private Boolean skipDuplicates;

		/**
		 * API name: {@code contexts}
		 */
		public Builder contexts(@Nullable Map<String, JsonValue> value) {
			this.contexts = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #contexts(Map)}, creating the map if needed.
		 */
		public Builder putContexts(String key, JsonValue value) {
			if (this.contexts == null) {
				this.contexts = new HashMap<>();
			}
			this.contexts.put(key, value);
			return this;
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public Builder fuzzy(@Nullable SuggestFuzziness value) {
			this.fuzzy = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public Builder fuzzy(Function<SuggestFuzziness.Builder, ObjectBuilder<SuggestFuzziness>> fn) {
			return this.fuzzy(fn.apply(new SuggestFuzziness.Builder()).build());
		}

		/**
		 * API name: {@code prefix}
		 */
		public Builder prefix(@Nullable String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code regex}
		 */
		public Builder regex(@Nullable String value) {
			this.regex = value;
			return this;
		}

		/**
		 * API name: {@code skip_duplicates}
		 */
		public Builder skipDuplicates(@Nullable Boolean value) {
			this.skipDuplicates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompletionSuggester}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompletionSuggester build() {

			return new CompletionSuggester(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompletionSuggester}
	 */
	public static final JsonpDeserializer<CompletionSuggester> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CompletionSuggester::setupCompletionSuggesterDeserializer);

	protected static void setupCompletionSuggesterDeserializer(DelegatingDeserializer<CompletionSuggester.Builder> op) {
		SuggesterBase.setupSuggesterBaseDeserializer(op);
		op.add(Builder::contexts, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"contexts");
		op.add(Builder::fuzzy, SuggestFuzziness.DESERIALIZER, "fuzzy");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::skipDuplicates, JsonpDeserializer.booleanDeserializer(), "skip_duplicates");

	}

}
