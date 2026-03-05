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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.EmbeddingInput

/**
 * Inference input. Either a string, an array of strings, a <code>content</code>
 * object, or an array of <code>content</code> objects.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.EmbeddingInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class EmbeddingInput implements TaggedUnion<EmbeddingInput.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Content, String

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

	private EmbeddingInput(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private EmbeddingInput(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static EmbeddingInput of(Function<Builder, ObjectBuilder<EmbeddingInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code content}?
	 */
	public boolean isContent() {
		return _kind == Kind.Content;
	}

	/**
	 * Get the {@code content} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code content} kind.
	 */
	public List<EmbeddingContentObject> content() {
		return TaggedUnionUtils.get(this, Kind.Content);
	}

	/**
	 * Is this variant instance of kind {@code string}?
	 */
	public boolean isString() {
		return _kind == Kind.String;
	}

	/**
	 * Get the {@code string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string} kind.
	 */
	public String string() {
		return TaggedUnionUtils.get(this, Kind.String);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Content :
					generator.writeStartArray();
					for (EmbeddingContentObject item0 : ((List<EmbeddingContentObject>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case String :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EmbeddingInput> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<EmbeddingInput> content(List<EmbeddingContentObject> v) {
			this._kind = Kind.Content;
			this._value = v;
			return this;
		}

		public ObjectBuilder<EmbeddingInput> string(String v) {
			this._kind = Kind.String;
			this._value = v;
			return this;
		}

		public EmbeddingInput build() {
			_checkSingleUse();
			return new EmbeddingInput(this);
		}

	}

	private static JsonpDeserializer<EmbeddingInput> buildEmbeddingInputDeserializer() {
		return new UnionDeserializer.Builder<EmbeddingInput, Kind, Object>(EmbeddingInput::new, false)
				.addMember(Kind.Content, JsonpDeserializer.arrayDeserializer(EmbeddingContentObject._DESERIALIZER))
				.addMember(Kind.String, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<EmbeddingInput> _DESERIALIZER = JsonpDeserializer
			.lazy(EmbeddingInput::buildEmbeddingInputDeserializer);
}
