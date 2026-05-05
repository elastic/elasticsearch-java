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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
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

// typedef: _types.TransformContainer

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.TransformContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Transform implements TaggedUnion<Transform.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Transform} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#_types.TransformContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Chain("chain"),

		Script("script"),

		Search("search"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

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

	public Transform(TransformVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._transformKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Transform(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Transform of(Function<Builder, ObjectBuilder<Transform>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code chain}?
	 */
	public boolean isChain() {
		return _kind == Kind.Chain;
	}

	/**
	 * Get the {@code chain} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code chain} kind.
	 */
	public List<Transform> chain() {
		return TaggedUnionUtils.get(this, Kind.Chain);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptTransform script() {
		return TaggedUnionUtils.get(this, Kind.Script);
	}

	/**
	 * Is this variant instance of kind {@code search}?
	 */
	public boolean isSearch() {
		return _kind == Kind.Search;
	}

	/**
	 * Get the {@code search} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code search} kind.
	 */
	public SearchTransform search() {
		return TaggedUnionUtils.get(this, Kind.Search);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Chain :
					generator.writeStartArray();
					for (Transform item0 : ((List<Transform>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Transform> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Transform> chain(List<Transform> v) {
			this._kind = Kind.Chain;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Transform> script(ScriptTransform v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Transform> script(Function<ScriptTransform.Builder, ObjectBuilder<ScriptTransform>> fn) {
			return this.script(fn.apply(new ScriptTransform.Builder()).build());
		}

		public ObjectBuilder<Transform> search(SearchTransform v) {
			this._kind = Kind.Search;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Transform> search(Function<SearchTransform.Builder, ObjectBuilder<SearchTransform>> fn) {
			return this.search(fn.apply(new SearchTransform.Builder()).build());
		}

		public Transform build() {
			_checkSingleUse();
			return new Transform(this);
		}

	}

	protected static void setupTransformDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::chain, JsonpDeserializer.arrayDeserializer(Transform._DESERIALIZER), "chain");
		op.add(Builder::script, ScriptTransform._DESERIALIZER, "script");
		op.add(Builder::search, SearchTransform._DESERIALIZER, "search");

	}

	public static final JsonpDeserializer<Transform> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Transform::setupTransformDeserializer, Builder::build);
}
