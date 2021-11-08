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
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.TransformContainer
@JsonpDeserializable
public class Transform implements TaggedUnion<Object>, JsonpSerializable {

	public static final String CHAIN = "chain";
	public static final String SCRIPT = "script";
	public static final String SEARCH = "search";

	// Tagged union implementation

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

	public Transform(TransformVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Transform(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Transform of(Function<Builder, ObjectBuilder<Transform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public ChainTransform chain() {
		return TaggedUnionUtils.get(this, CHAIN);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptTransform script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchTransform search() {
		return TaggedUnionUtils.get(this, SEARCH);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Transform> {
		private String _type;
		private Object _value;

		public Builder chain(ChainTransform v) {
			this._type = CHAIN;
			this._value = v;
			return this;
		}

		public Builder chain(Function<ChainTransform.Builder, ObjectBuilder<ChainTransform>> f) {
			return this.chain(f.apply(new ChainTransform.Builder()).build());
		}

		public Builder script(ScriptTransform v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public Builder script(Function<ScriptTransform.Builder, ObjectBuilder<ScriptTransform>> f) {
			return this.script(f.apply(new ScriptTransform.Builder()).build());
		}

		public Builder search(SearchTransform v) {
			this._type = SEARCH;
			this._value = v;
			return this;
		}

		public Builder search(Function<SearchTransform.Builder, ObjectBuilder<SearchTransform>> f) {
			return this.search(f.apply(new SearchTransform.Builder()).build());
		}

		public Transform build() {
			_checkSingleUse();
			return new Transform(this);
		}

	}

	protected static void setupTransformDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::chain, ChainTransform._DESERIALIZER, "chain");
		op.add(Builder::script, ScriptTransform._DESERIALIZER, "script");
		op.add(Builder::search, SearchTransform._DESERIALIZER, "search");

	}

	public static final JsonpDeserializer<Transform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Transform::setupTransformDeserializer, Builder::build);
}
