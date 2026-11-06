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

// typedef: _types.BulkByPaginatedSearchFailure

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_types.BulkByPaginatedSearchFailure">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkByPaginatedSearchFailure
		implements
			TaggedUnion<BulkByPaginatedSearchFailure.Kind, Object>,
			JsonpSerializable {

	public enum Kind {
		Bulk, Search

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

	private BulkByPaginatedSearchFailure(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private BulkByPaginatedSearchFailure(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static BulkByPaginatedSearchFailure of(Function<Builder, ObjectBuilder<BulkByPaginatedSearchFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code bulk}?
	 */
	public boolean isBulk() {
		return _kind == Kind.Bulk;
	}

	/**
	 * Get the {@code bulk} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bulk} kind.
	 */
	public BulkIndexByScrollFailure bulk() {
		return TaggedUnionUtils.get(this, Kind.Bulk);
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
	public ShardFailure search() {
		return TaggedUnionUtils.get(this, Kind.Search);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<BulkByPaginatedSearchFailure> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<BulkByPaginatedSearchFailure> bulk(BulkIndexByScrollFailure v) {
			this._kind = Kind.Bulk;
			this._value = v;
			return this;
		}

		public ObjectBuilder<BulkByPaginatedSearchFailure> bulk(
				Function<BulkIndexByScrollFailure.Builder, ObjectBuilder<BulkIndexByScrollFailure>> fn) {
			return this.bulk(fn.apply(new BulkIndexByScrollFailure.Builder()).build());
		}

		public ObjectBuilder<BulkByPaginatedSearchFailure> search(ShardFailure v) {
			this._kind = Kind.Search;
			this._value = v;
			return this;
		}

		public ObjectBuilder<BulkByPaginatedSearchFailure> search(
				Function<ShardFailure.Builder, ObjectBuilder<ShardFailure>> fn) {
			return this.search(fn.apply(new ShardFailure.Builder()).build());
		}

		public BulkByPaginatedSearchFailure build() {
			_checkSingleUse();
			return new BulkByPaginatedSearchFailure(this);
		}

	}

	private static JsonpDeserializer<BulkByPaginatedSearchFailure> buildBulkByPaginatedSearchFailureDeserializer() {
		return new UnionDeserializer.Builder<BulkByPaginatedSearchFailure, Kind, Object>(
				BulkByPaginatedSearchFailure::new, false).addMember(Kind.Bulk, BulkIndexByScrollFailure._DESERIALIZER)
						.addMember(Kind.Search, ShardFailure._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<BulkByPaginatedSearchFailure> _DESERIALIZER = JsonpDeserializer
			.lazy(BulkByPaginatedSearchFailure::buildBulkByPaginatedSearchFailureDeserializer);
}
