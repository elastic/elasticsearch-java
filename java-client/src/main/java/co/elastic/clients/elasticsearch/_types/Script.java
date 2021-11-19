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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.Script
// union type: Union[]
@JsonpDeserializable
public class Script implements TaggedUnion<Object>, JsonpSerializable {

	public static final String INLINE = "inline";
	public static final String STORED = "stored";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Script(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private Script(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Script of(Function<Builder, ObjectBuilder<Script>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code inline}?
	 */
	public boolean _isInline() {
		return INLINE.equals(_type());
	}

	/**
	 * Get the {@code inline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inline} kind.
	 */
	public InlineScript inline() {
		return TaggedUnionUtils.get(this, INLINE);
	}

	/**
	 * Is this variant instance of kind {@code stored}?
	 */
	public boolean _isStored() {
		return STORED.equals(_type());
	}

	/**
	 * Get the {@code stored} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stored} kind.
	 */
	public StoredScriptId stored() {
		return TaggedUnionUtils.get(this, STORED);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Script> {
		private String _type;
		private Object _value;

		public Builder inline(InlineScript v) {
			this._type = INLINE;
			this._value = v;
			return this;
		}

		public Builder inline(Function<InlineScript.Builder, ObjectBuilder<InlineScript>> f) {
			return this.inline(f.apply(new InlineScript.Builder()).build());
		}

		public Builder stored(StoredScriptId v) {
			this._type = STORED;
			this._value = v;
			return this;
		}

		public Builder stored(Function<StoredScriptId.Builder, ObjectBuilder<StoredScriptId>> f) {
			return this.stored(f.apply(new StoredScriptId.Builder()).build());
		}

		public Script build() {
			_checkSingleUse();
			return new Script(this);
		}

	}

	private static JsonpDeserializer<Script> buildScriptDeserializer() {
		return new UnionDeserializer.Builder<>(Script::new, false).addMember("inline", InlineScript._DESERIALIZER)
				.addMember("stored", StoredScriptId._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<Script> _DESERIALIZER = JsonpDeserializer
			.lazy(Script::buildScriptDeserializer);
}
