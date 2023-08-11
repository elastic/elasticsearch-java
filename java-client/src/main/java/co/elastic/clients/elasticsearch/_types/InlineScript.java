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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.InlineScript

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.InlineScript">API
 *      specification</a>
 */
@JsonpDeserializable
public class InlineScript extends ScriptBase {
	@Nullable
	private final String lang;

	private final Map<String, String> options;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	private InlineScript(Builder builder) {
		super(builder);

		this.lang = builder.lang;
		this.options = ApiTypeHelper.unmodifiable(builder.options);
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static InlineScript of(Function<Builder, ObjectBuilder<InlineScript>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the language the script is written in.
	 * <p>
	 * API name: {@code lang}
	 */
	@Nullable
	public final String lang() {
		return this.lang;
	}

	/**
	 * API name: {@code options}
	 */
	public final Map<String, String> options() {
		return this.options;
	}

	/**
	 * Required - The script source.
	 * <p>
	 * API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.lang != null) {
			generator.writeKey("lang");
			generator.write(this.lang);

		}
		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.options.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InlineScript}.
	 */

	public static class Builder extends ScriptBase.AbstractBuilder<Builder> implements ObjectBuilder<InlineScript> {
		@Nullable
		private String lang;

		@Nullable
		private Map<String, String> options;

		private String source;

		/**
		 * Specifies the language the script is written in.
		 * <p>
		 * API name: {@code lang}
		 */
		public final Builder lang(@Nullable String value) {
			this.lang = value;
			return this;
		}

		/**
		 * Specifies the language the script is written in.
		 * <p>
		 * API name: {@code lang}
		 */
		public final Builder lang(@Nullable ScriptLanguage value) {
			this.lang = value == null ? null : value.jsonValue();
			return this;
		}

		/**
		 * API name: {@code options}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>options</code>.
		 */
		public final Builder options(Map<String, String> map) {
			this.options = _mapPutAll(this.options, map);
			return this;
		}

		/**
		 * API name: {@code options}
		 * <p>
		 * Adds an entry to <code>options</code>.
		 */
		public final Builder options(String key, String value) {
			this.options = _mapPut(this.options, key, value);
			return this;
		}

		/**
		 * Required - The script source.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InlineScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InlineScript build() {
			_checkSingleUse();

			return new InlineScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InlineScript}
	 */
	public static final JsonpDeserializer<InlineScript> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			InlineScript::setupInlineScriptDeserializer);

	protected static void setupInlineScriptDeserializer(ObjectDeserializer<InlineScript.Builder> op) {
		ScriptBase.setupScriptBaseDeserializer(op);
		op.add(Builder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(Builder::options, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"options");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

		op.shortcutProperty("source");

	}

}
