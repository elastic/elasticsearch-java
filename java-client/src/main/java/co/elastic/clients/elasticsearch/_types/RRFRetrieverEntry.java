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

// typedef: _types.RRFRetrieverEntry

/**
 * Either a direct RetrieverContainer (backward compatible) or an
 * RRFRetrieverComponent with weight.
 * 
 * @see <a href="../doc-files/api-spec.html#_types.RRFRetrieverEntry">API
 *      specification</a>
 */
@JsonpDeserializable
public class RRFRetrieverEntry implements TaggedUnion<RRFRetrieverEntry.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Weighted, Retriever

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

	private RRFRetrieverEntry(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private RRFRetrieverEntry(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RRFRetrieverEntry of(Function<Builder, ObjectBuilder<RRFRetrieverEntry>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code weighted}?
	 */
	public boolean isWeighted() {
		return _kind == Kind.Weighted;
	}

	/**
	 * Get the {@code weighted} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weighted} kind.
	 */
	public RRFRetrieverComponent weighted() {
		return TaggedUnionUtils.get(this, Kind.Weighted);
	}

	/**
	 * Is this variant instance of kind {@code retriever}?
	 */
	public boolean isRetriever() {
		return _kind == Kind.Retriever;
	}

	/**
	 * Get the {@code retriever} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code retriever} kind.
	 */
	public Retriever retriever() {
		return TaggedUnionUtils.get(this, Kind.Retriever);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RRFRetrieverEntry> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<RRFRetrieverEntry> weighted(RRFRetrieverComponent v) {
			this._kind = Kind.Weighted;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RRFRetrieverEntry> weighted(
				Function<RRFRetrieverComponent.Builder, ObjectBuilder<RRFRetrieverComponent>> fn) {
			return this.weighted(fn.apply(new RRFRetrieverComponent.Builder()).build());
		}

		public ObjectBuilder<RRFRetrieverEntry> retriever(Retriever v) {
			this._kind = Kind.Retriever;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RRFRetrieverEntry> retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		public RRFRetrieverEntry build() {
			_checkSingleUse();
			return new RRFRetrieverEntry(this);
		}

	}

	private static JsonpDeserializer<RRFRetrieverEntry> buildRRFRetrieverEntryDeserializer() {
		return new UnionDeserializer.Builder<RRFRetrieverEntry, Kind, Object>(RRFRetrieverEntry::new, false)
				.addMember(Kind.Weighted, RRFRetrieverComponent._DESERIALIZER)
				.addMember(Kind.Retriever, Retriever._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<RRFRetrieverEntry> _DESERIALIZER = JsonpDeserializer
			.lazy(RRFRetrieverEntry::buildRRFRetrieverEntryDeserializer);
}
