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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.NodeReloadResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.NodeReloadResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeReloadResult implements TaggedUnion<NodeReloadResult.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Error, Stats

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

	private NodeReloadResult(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private NodeReloadResult(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static NodeReloadResult of(Function<Builder, ObjectBuilder<NodeReloadResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code error}?
	 */
	public boolean isError() {
		return _kind == Kind.Error;
	}

	/**
	 * Get the {@code error} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code error} kind.
	 */
	public NodeReloadError error() {
		return TaggedUnionUtils.get(this, Kind.Error);
	}

	/**
	 * Is this variant instance of kind {@code stats}?
	 */
	public boolean isStats() {
		return _kind == Kind.Stats;
	}

	/**
	 * Get the {@code stats} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stats} kind.
	 */
	public Stats stats() {
		return TaggedUnionUtils.get(this, Kind.Stats);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeReloadResult> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<NodeReloadResult> error(NodeReloadError v) {
			this._kind = Kind.Error;
			this._value = v;
			return this;
		}

		public ObjectBuilder<NodeReloadResult> error(
				Function<NodeReloadError.Builder, ObjectBuilder<NodeReloadError>> fn) {
			return this.error(fn.apply(new NodeReloadError.Builder()).build());
		}

		public ObjectBuilder<NodeReloadResult> stats(Stats v) {
			this._kind = Kind.Stats;
			this._value = v;
			return this;
		}

		public ObjectBuilder<NodeReloadResult> stats(Function<Stats.Builder, ObjectBuilder<Stats>> fn) {
			return this.stats(fn.apply(new Stats.Builder()).build());
		}

		public NodeReloadResult build() {
			_checkSingleUse();
			return new NodeReloadResult(this);
		}

	}

	private static JsonpDeserializer<NodeReloadResult> buildNodeReloadResultDeserializer() {
		return new UnionDeserializer.Builder<NodeReloadResult, Kind, Object>(NodeReloadResult::new, false)
				.addMember(Kind.Error, NodeReloadError._DESERIALIZER).addMember(Kind.Stats, Stats._DESERIALIZER)
				.build();
	}

	public static final JsonpDeserializer<NodeReloadResult> _DESERIALIZER = JsonpDeserializer
			.lazy(NodeReloadResult::buildNodeReloadResultDeserializer);
}
