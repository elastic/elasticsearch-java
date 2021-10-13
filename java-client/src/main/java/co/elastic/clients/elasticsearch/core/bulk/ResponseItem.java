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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.ResponseItemContainer
@JsonpDeserializable
public class ResponseItem implements TaggedUnion<Object>, JsonpSerializable {

	public static final String INDEX = "index";
	public static final String CREATE = "create";
	public static final String UPDATE = "update";
	public static final String DELETE = "delete";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public ResponseItem(ResponseItemVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends ResponseItemVariant> ResponseItem(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private ResponseItem(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public ResponseItem(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code index} kind.
	 */
	public IndexResponseItem index() {
		return TaggedUnionUtils.get(this, INDEX);
	}

	/**
	 * Get the {@code create} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code create} kind.
	 */
	public CreateResponseItem create() {
		return TaggedUnionUtils.get(this, CREATE);
	}

	/**
	 * Get the {@code update} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code update} kind.
	 */
	public UpdateResponseItem update() {
		return TaggedUnionUtils.get(this, UPDATE);
	}

	/**
	 * Get the {@code delete} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delete} kind.
	 */
	public DeleteResponseItem delete() {
		return TaggedUnionUtils.get(this, DELETE);
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

	public static class Builder implements ObjectBuilder<ResponseItem> {
		private String _type;
		private Object _value;

		public Builder index(IndexResponseItem v) {
			this._type = INDEX;
			this._value = v;
			return this;
		}

		public Builder index(Function<IndexResponseItem.Builder, ObjectBuilder<IndexResponseItem>> f) {
			return this.index(f.apply(new IndexResponseItem.Builder()).build());
		}

		public Builder create(CreateResponseItem v) {
			this._type = CREATE;
			this._value = v;
			return this;
		}

		public Builder create(Function<CreateResponseItem.Builder, ObjectBuilder<CreateResponseItem>> f) {
			return this.create(f.apply(new CreateResponseItem.Builder()).build());
		}

		public Builder update(UpdateResponseItem v) {
			this._type = UPDATE;
			this._value = v;
			return this;
		}

		public Builder update(Function<UpdateResponseItem.Builder, ObjectBuilder<UpdateResponseItem>> f) {
			return this.update(f.apply(new UpdateResponseItem.Builder()).build());
		}

		public Builder delete(DeleteResponseItem v) {
			this._type = DELETE;
			this._value = v;
			return this;
		}

		public Builder delete(Function<DeleteResponseItem.Builder, ObjectBuilder<DeleteResponseItem>> f) {
			return this.delete(f.apply(new DeleteResponseItem.Builder()).build());
		}

		public ResponseItem build() {
			return new ResponseItem(this);
		}

	}

	protected static void setupResponseItemDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::index, IndexResponseItem._DESERIALIZER, "index");
		op.add(Builder::create, CreateResponseItem._DESERIALIZER, "create");
		op.add(Builder::update, UpdateResponseItem._DESERIALIZER, "update");
		op.add(Builder::delete, DeleteResponseItem._DESERIALIZER, "delete");

	}

	public static final JsonpDeserializer<ResponseItem> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			ResponseItem::setupResponseItemDeserializer, Builder::build);
}
