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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch._types.query_dsl.IntervalsFilter;
import co.elastic.clients.elasticsearch._types.query_dsl.IntervalsFilterVariant;
import co.elastic.clients.json.JsonData;
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
import java.util.Map;
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

// typedef: _types.Script

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.Script">API specification</a>
 */
@JsonpDeserializable
public class Script implements IntervalsFilterVariant, JsonpSerializable {
	@Nullable
	private final String source;

	@Nullable
	private final String id;

	private final Map<String, JsonData> params;

	@Nullable
	private final String lang;

	private final Map<String, String> options;

	// ---------------------------------------------------------------------------------------------

	private Script(Builder builder) {

		this.source = builder.source;
		this.id = builder.id;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.lang = builder.lang;
		this.options = ApiTypeHelper.unmodifiable(builder.options);

	}

	public static Script of(Function<Builder, ObjectBuilder<Script>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * IntervalsFilter variant kind.
	 */
	@Override
	public IntervalsFilter.Kind _intervalsFilterKind() {
		return IntervalsFilter.Kind.Script;
	}

	/**
	 * The script source.
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
		return this.source;
	}

	/**
	 * The <code>id</code> for a stored script.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Specifies any named parameters that are passed into the script as variables.
	 * Use parameters instead of hard-coded values to decrease compile time.
	 * <p>
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Script}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Script> {
		@Nullable
		private String source;

		@Nullable
		private String id;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private String lang;

		@Nullable
		private Map<String, String> options;

		/**
		 * The script source.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * The <code>id</code> for a stored script.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specifies any named parameters that are passed into the script as variables.
		 * Use parameters instead of hard-coded values to decrease compile time.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * Specifies any named parameters that are passed into the script as variables.
		 * Use parameters instead of hard-coded values to decrease compile time.
		 * <p>
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Script}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Script build() {
			_checkSingleUse();

			return new Script(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Script}
	 */
	public static final JsonpDeserializer<Script> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Script::setupScriptDeserializer);

	protected static void setupScriptDeserializer(ObjectDeserializer<Script.Builder> op) {

		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::lang, JsonpDeserializer.stringDeserializer(), "lang");
		op.add(Builder::options, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"options");

		op.shortcutProperty("source");

	}

}
