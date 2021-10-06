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

package co.elastic.clients.elasticsearch._core.bulk;

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

// typedef: _global.bulk.OperationContainer
@JsonpDeserializable
public class Operation implements TaggedUnion<Object>, JsonpSerializable {

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

	public Operation(OperationVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends OperationVariant> Operation(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private Operation(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public Operation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code index} kind.
	 */
	public IndexOperation index() {
		return TaggedUnionUtils.get(this, INDEX);
	}

	/**
	 * Get the {@code create} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code create} kind.
	 */
	public CreateOperation create() {
		return TaggedUnionUtils.get(this, CREATE);
	}

	/**
	 * Get the {@code update} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code update} kind.
	 */
	public UpdateOperation update() {
		return TaggedUnionUtils.get(this, UPDATE);
	}

	/**
	 * Get the {@code delete} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delete} kind.
	 */
	public DeleteOperation delete() {
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

	public static class Builder implements ObjectBuilder<Operation> {
		private String _type;
		private Object _value;

		public Builder index(IndexOperation v) {
			this._type = INDEX;
			this._value = v;
			return this;
		}

		public Builder index(Function<IndexOperation.Builder, ObjectBuilder<IndexOperation>> f) {
			return this.index(f.apply(new IndexOperation.Builder()).build());
		}

		public Builder create(CreateOperation v) {
			this._type = CREATE;
			this._value = v;
			return this;
		}

		public Builder create(Function<CreateOperation.Builder, ObjectBuilder<CreateOperation>> f) {
			return this.create(f.apply(new CreateOperation.Builder()).build());
		}

		public Builder update(UpdateOperation v) {
			this._type = UPDATE;
			this._value = v;
			return this;
		}

		public Builder update(Function<UpdateOperation.Builder, ObjectBuilder<UpdateOperation>> f) {
			return this.update(f.apply(new UpdateOperation.Builder()).build());
		}

		public Builder delete(DeleteOperation v) {
			this._type = DELETE;
			this._value = v;
			return this;
		}

		public Builder delete(Function<DeleteOperation.Builder, ObjectBuilder<DeleteOperation>> f) {
			return this.delete(f.apply(new DeleteOperation.Builder()).build());
		}

		public Operation build() {
			return new Operation(this);
		}

	}

	protected static void setupOperationDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::index, IndexOperation._DESERIALIZER, "index");
		op.add(Builder::create, CreateOperation._DESERIALIZER, "create");
		op.add(Builder::update, UpdateOperation._DESERIALIZER, "update");
		op.add(Builder::delete, DeleteOperation._DESERIALIZER, "delete");

	}

	public static final JsonpDeserializer<Operation> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Operation::setupOperationDeserializer, Builder::build);
}
