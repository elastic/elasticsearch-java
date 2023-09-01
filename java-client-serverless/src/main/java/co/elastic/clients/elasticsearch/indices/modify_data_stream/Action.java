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

package co.elastic.clients.elasticsearch.indices.modify_data_stream;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.modify_data_stream.Action

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.modify_data_stream.Action">API
 *      specification</a>
 */
@JsonpDeserializable
public class Action implements TaggedUnion<Action.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Action} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#indices.modify_data_stream.Action">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		AddBackingIndex("add_backing_index"),

		RemoveBackingIndex("remove_backing_index"),

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

	public Action(ActionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._actionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Action(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Action of(Function<Builder, ObjectBuilder<Action>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code add_backing_index}?
	 */
	public boolean isAddBackingIndex() {
		return _kind == Kind.AddBackingIndex;
	}

	/**
	 * Get the {@code add_backing_index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code add_backing_index}
	 *             kind.
	 */
	public IndexAndDataStreamAction addBackingIndex() {
		return TaggedUnionUtils.get(this, Kind.AddBackingIndex);
	}

	/**
	 * Is this variant instance of kind {@code remove_backing_index}?
	 */
	public boolean isRemoveBackingIndex() {
		return _kind == Kind.RemoveBackingIndex;
	}

	/**
	 * Get the {@code remove_backing_index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove_backing_index}
	 *             kind.
	 */
	public IndexAndDataStreamAction removeBackingIndex() {
		return TaggedUnionUtils.get(this, Kind.RemoveBackingIndex);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Action> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Action> addBackingIndex(IndexAndDataStreamAction v) {
			this._kind = Kind.AddBackingIndex;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Action> addBackingIndex(
				Function<IndexAndDataStreamAction.Builder, ObjectBuilder<IndexAndDataStreamAction>> fn) {
			return this.addBackingIndex(fn.apply(new IndexAndDataStreamAction.Builder()).build());
		}

		public ObjectBuilder<Action> removeBackingIndex(IndexAndDataStreamAction v) {
			this._kind = Kind.RemoveBackingIndex;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Action> removeBackingIndex(
				Function<IndexAndDataStreamAction.Builder, ObjectBuilder<IndexAndDataStreamAction>> fn) {
			return this.removeBackingIndex(fn.apply(new IndexAndDataStreamAction.Builder()).build());
		}

		public Action build() {
			_checkSingleUse();
			return new Action(this);
		}

	}

	protected static void setupActionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::addBackingIndex, IndexAndDataStreamAction._DESERIALIZER, "add_backing_index");
		op.add(Builder::removeBackingIndex, IndexAndDataStreamAction._DESERIALIZER, "remove_backing_index");

	}

	public static final JsonpDeserializer<Action> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Action::setupActionDeserializer, Builder::build);
}
