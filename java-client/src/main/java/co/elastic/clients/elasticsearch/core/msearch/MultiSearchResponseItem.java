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

package co.elastic.clients.elasticsearch.core.msearch;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch.ResponseItem

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.msearch.ResponseItem">API
 *      specification</a>
 */

public class MultiSearchResponseItem<TDocument>
		implements
			TaggedUnion<MultiSearchResponseItem.Kind, Object>,
			JsonpSerializable {

	public enum Kind {
		Result, Failure

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

	private final JsonpSerializer<TDocument> tDocumentSerializer = null;

	private MultiSearchResponseItem(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private MultiSearchResponseItem(Builder<TDocument> builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static <TDocument> MultiSearchResponseItem<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MultiSearchResponseItem<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Is this variant instance of kind {@code result}?
	 */
	public boolean isResult() {
		return _kind == Kind.Result;
	}

	/**
	 * Get the {@code result} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code result} kind.
	 */
	public MultiSearchItem<TDocument> result() {
		return TaggedUnionUtils.get(this, Kind.Result);
	}

	/**
	 * Is this variant instance of kind {@code failure}?
	 */
	public boolean isFailure() {
		return _kind == Kind.Failure;
	}

	/**
	 * Get the {@code failure} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code failure} kind.
	 */
	public ErrorResponse failure() {
		return TaggedUnionUtils.get(this, Kind.Failure);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder<TDocument> extends ObjectBuilderBase
			implements
				ObjectBuilder<MultiSearchResponseItem<TDocument>> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<MultiSearchResponseItem<TDocument>> result(MultiSearchItem<TDocument> v) {
			this._kind = Kind.Result;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MultiSearchResponseItem<TDocument>> result(
				Function<MultiSearchItem.Builder<TDocument>, ObjectBuilder<MultiSearchItem<TDocument>>> fn) {
			return this.result(fn.apply(new MultiSearchItem.Builder<TDocument>()).build());
		}

		public ObjectBuilder<MultiSearchResponseItem<TDocument>> failure(ErrorResponse v) {
			this._kind = Kind.Failure;
			this._value = v;
			return this;
		}

		public ObjectBuilder<MultiSearchResponseItem<TDocument>> failure(
				Function<ErrorResponse.Builder, ObjectBuilder<ErrorResponse>> fn) {
			return this.failure(fn.apply(new ErrorResponse.Builder()).build());
		}

		public MultiSearchResponseItem<TDocument> build() {
			_checkSingleUse();
			return new MultiSearchResponseItem<>(this);
		}

	}

	public static <TDocument> JsonpDeserializer<MultiSearchResponseItem<TDocument>> createMultiSearchResponseItemDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return new UnionDeserializer.Builder<MultiSearchResponseItem<TDocument>, Kind, Object>(
				MultiSearchResponseItem<TDocument>::new, false)
						.addMember(Kind.Result,
								MultiSearchItem.createMultiSearchItemDeserializer(tDocumentDeserializer))
						.addMember(Kind.Failure, ErrorResponse._DESERIALIZER).build();
	}

}
