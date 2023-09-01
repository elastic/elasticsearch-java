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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.OperationContainer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.bulk.OperationContainer">API
 *      specification</a>
 */

public class BulkOperation implements TaggedUnion<BulkOperation.Kind, Object>, NdJsonpSerializable, JsonpSerializable {

	/**
	 * {@link BulkOperation} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_global.bulk.OperationContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Index("index"),

		Create("create"),

		Update("update"),

		Delete("delete"),

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

	public BulkOperation(BulkOperationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._bulkOperationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private BulkOperation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static BulkOperation of(Function<Builder, ObjectBuilder<BulkOperation>> fn) {
		return fn.apply(new Builder()).build();
	}

	@Override
	public Iterator<?> _serializables() {
		return TaggedUnionUtils.ndJsonIterator(this);
	}

	/**
	 * Is this variant instance of kind {@code index}?
	 */
	public boolean isIndex() {
		return _kind == Kind.Index;
	}

	/**
	 * Get the {@code index} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code index} kind.
	 */
	public <TDocument> IndexOperation<TDocument> index() {
		return TaggedUnionUtils.get(this, Kind.Index);
	}

	/**
	 * Is this variant instance of kind {@code create}?
	 */
	public boolean isCreate() {
		return _kind == Kind.Create;
	}

	/**
	 * Get the {@code create} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code create} kind.
	 */
	public <TDocument> CreateOperation<TDocument> create() {
		return TaggedUnionUtils.get(this, Kind.Create);
	}

	/**
	 * Is this variant instance of kind {@code update}?
	 */
	public boolean isUpdate() {
		return _kind == Kind.Update;
	}

	/**
	 * Get the {@code update} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code update} kind.
	 */
	public <TDocument, TPartialDocument> UpdateOperation<TDocument, TPartialDocument> update() {
		return TaggedUnionUtils.get(this, Kind.Update);
	}

	/**
	 * Is this variant instance of kind {@code delete}?
	 */
	public boolean isDelete() {
		return _kind == Kind.Delete;
	}

	/**
	 * Get the {@code delete} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code delete} kind.
	 */
	public DeleteOperation delete() {
		return TaggedUnionUtils.get(this, Kind.Delete);
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BulkOperation> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public <TDocument> ObjectBuilder<BulkOperation> index(IndexOperation<TDocument> v) {
			this._kind = Kind.Index;
			this._value = v;
			return this;
		}

		public <TDocument> ObjectBuilder<BulkOperation> index(
				Function<IndexOperation.Builder<TDocument>, ObjectBuilder<IndexOperation<TDocument>>> fn) {
			return this.index(fn.apply(new IndexOperation.Builder<TDocument>()).build());
		}

		public <TDocument> ObjectBuilder<BulkOperation> create(CreateOperation<TDocument> v) {
			this._kind = Kind.Create;
			this._value = v;
			return this;
		}

		public <TDocument> ObjectBuilder<BulkOperation> create(
				Function<CreateOperation.Builder<TDocument>, ObjectBuilder<CreateOperation<TDocument>>> fn) {
			return this.create(fn.apply(new CreateOperation.Builder<TDocument>()).build());
		}

		public <TDocument, TPartialDocument> ObjectBuilder<BulkOperation> update(
				UpdateOperation<TDocument, TPartialDocument> v) {
			this._kind = Kind.Update;
			this._value = v;
			return this;
		}

		public <TDocument, TPartialDocument> ObjectBuilder<BulkOperation> update(
				Function<UpdateOperation.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateOperation<TDocument, TPartialDocument>>> fn) {
			return this.update(fn.apply(new UpdateOperation.Builder<TDocument, TPartialDocument>()).build());
		}

		public ObjectBuilder<BulkOperation> delete(DeleteOperation v) {
			this._kind = Kind.Delete;
			this._value = v;
			return this;
		}

		public ObjectBuilder<BulkOperation> delete(
				Function<DeleteOperation.Builder, ObjectBuilder<DeleteOperation>> fn) {
			return this.delete(fn.apply(new DeleteOperation.Builder()).build());
		}

		public BulkOperation build() {
			_checkSingleUse();
			return new BulkOperation(this);
		}

	}

}
