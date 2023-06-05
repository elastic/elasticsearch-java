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

// typedef: _types.RankContainer

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RankContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Rank implements TaggedUnion<Rank.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Rank} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#_types.RankContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Rrf("rrf"),

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

	public Rank(RankVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._rankKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Rank(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Rank of(Function<Builder, ObjectBuilder<Rank>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code rrf}?
	 */
	public boolean isRrf() {
		return _kind == Kind.Rrf;
	}

	/**
	 * Get the {@code rrf} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rrf} kind.
	 */
	public RrfRank rrf() {
		return TaggedUnionUtils.get(this, Kind.Rrf);
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Rank> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Rank> rrf(RrfRank v) {
			this._kind = Kind.Rrf;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Rank> rrf(Function<RrfRank.Builder, ObjectBuilder<RrfRank>> fn) {
			return this.rrf(fn.apply(new RrfRank.Builder()).build());
		}

		public Rank build() {
			_checkSingleUse();
			return new Rank(this);
		}

	}

	protected static void setupRankDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::rrf, RrfRank._DESERIALIZER, "rrf");

	}

	public static final JsonpDeserializer<Rank> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Rank::setupRankDeserializer, Builder::build);
}
