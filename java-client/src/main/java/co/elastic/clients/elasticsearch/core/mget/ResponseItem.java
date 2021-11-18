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

package co.elastic.clients.elasticsearch.core.mget;

import co.elastic.clients.elasticsearch.core.get.GetResult;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
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

// typedef: _global.mget.ResponseItem
// union type: Union[]

public class ResponseItem<TDocument> implements TaggedUnion<Object>, JsonpSerializable {

	public static final String RESULT = "result";
	public static final String FAILURE = "failure";

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

	private final JsonpSerializer<TDocument> tDocumentSerializer = null;

	public ResponseItem(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private ResponseItem(Builder<TDocument> builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static <TDocument> ResponseItem<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<ResponseItem<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Get the {@code result} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code result} kind.
	 */
	public GetResult<TDocument> result() {
		return TaggedUnionUtils.get(this, RESULT);
	}

	/**
	 * Get the {@code failure} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code failure} kind.
	 */
	public MultiGetError failure() {
		return TaggedUnionUtils.get(this, FAILURE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	public static class Builder<TDocument> extends ObjectBuilderBase implements ObjectBuilder<ResponseItem<TDocument>> {
		private String _type;
		private Object _value;

		public Builder<TDocument> result(GetResult<TDocument> v) {
			this._type = RESULT;
			this._value = v;
			return this;
		}

		public Builder<TDocument> result(
				Function<GetResult.Builder<TDocument>, ObjectBuilder<GetResult<TDocument>>> f) {
			return this.result(f.apply(new GetResult.Builder<TDocument>()).build());
		}

		public Builder<TDocument> failure(MultiGetError v) {
			this._type = FAILURE;
			this._value = v;
			return this;
		}

		public Builder<TDocument> failure(Function<MultiGetError.Builder, ObjectBuilder<MultiGetError>> f) {
			return this.failure(f.apply(new MultiGetError.Builder()).build());
		}

		public ResponseItem<TDocument> build() {
			_checkSingleUse();
			return new ResponseItem<>(this);
		}

	}

	public static <TDocument> JsonpDeserializer<ResponseItem<TDocument>> createResponseItemDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return new UnionDeserializer.Builder<>(ResponseItem<TDocument>::new, false)
				.addMember("result", GetResult.createGetResultDeserializer(tDocumentDeserializer))
				.addMember("failure", MultiGetError._DESERIALIZER).build();
	}

}
