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

import co.elastic.clients.elasticsearch.core.search.SearchRequestBody;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
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

// typedef: _types.ScriptSource

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.ScriptSource">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScriptSource implements TaggedUnion<ScriptSource.Kind, Object>, JsonpSerializable {

	public enum Kind {
		ScriptTemplate, ScriptString

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private ScriptSource(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private ScriptSource(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ScriptSource of(Function<Builder, ObjectBuilder<ScriptSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code script_template}?
	 */
	public boolean isScriptTemplate() {
		return _kind == Kind.ScriptTemplate;
	}

	/**
	 * Get the {@code script_template} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_template}
	 *             kind.
	 */
	public SearchRequestBody scriptTemplate() {
		return TaggedUnionUtils.get(this, Kind.ScriptTemplate);
	}

	/**
	 * Is this variant instance of kind {@code script_string}?
	 */
	public boolean isScriptString() {
		return _kind == Kind.ScriptString;
	}

	/**
	 * Get the {@code script_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_string} kind.
	 */
	public String scriptString() {
		return TaggedUnionUtils.get(this, Kind.ScriptString);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case ScriptString :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScriptSource> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<ScriptSource> scriptTemplate(SearchRequestBody v) {
			this._kind = Kind.ScriptTemplate;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ScriptSource> scriptTemplate(
				Function<SearchRequestBody.Builder, ObjectBuilder<SearchRequestBody>> fn) {
			return this.scriptTemplate(fn.apply(new SearchRequestBody.Builder()).build());
		}

		public ObjectBuilder<ScriptSource> scriptString(String v) {
			this._kind = Kind.ScriptString;
			this._value = v;
			return this;
		}

		public ScriptSource build() {
			_checkSingleUse();
			return new ScriptSource(this);
		}

	}

	private static JsonpDeserializer<ScriptSource> buildScriptSourceDeserializer() {
		return new UnionDeserializer.Builder<ScriptSource, Kind, Object>(ScriptSource::new, false)
				.addMember(Kind.ScriptTemplate, SearchRequestBody._DESERIALIZER)
				.addMember(Kind.ScriptString, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<ScriptSource> _DESERIALIZER = JsonpDeserializer
			.lazy(ScriptSource::buildScriptSourceDeserializer);
}
