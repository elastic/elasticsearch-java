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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.TrackHits

/**
 * Number of hits matching the query to count accurately. If true, the exact
 * number of hits is returned at the cost of some performance. If false, the
 * response does not include the total number of hits matching the query.
 * Defaults to 10,000 hits.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.TrackHits">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrackHits implements TaggedUnion<TrackHits.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Count, Enabled

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

	private TrackHits(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Count :
				return String.valueOf(this.count());
			case Enabled :
				return String.valueOf(this.enabled());

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private TrackHits(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TrackHits of(Function<Builder, ObjectBuilder<TrackHits>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code count}?
	 */
	public boolean isCount() {
		return _kind == Kind.Count;
	}

	/**
	 * Get the {@code count} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code count} kind.
	 */
	public Integer count() {
		return TaggedUnionUtils.get(this, Kind.Count);
	}

	/**
	 * Is this variant instance of kind {@code enabled}?
	 */
	public boolean isEnabled() {
		return _kind == Kind.Enabled;
	}

	/**
	 * Get the {@code enabled} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code enabled} kind.
	 */
	public Boolean enabled() {
		return TaggedUnionUtils.get(this, Kind.Enabled);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Count :
					generator.write(((Integer) this._value));

					break;
				case Enabled :
					generator.write(((Boolean) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrackHits> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<TrackHits> count(Integer v) {
			this._kind = Kind.Count;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TrackHits> enabled(Boolean v) {
			this._kind = Kind.Enabled;
			this._value = v;
			return this;
		}

		public TrackHits build() {
			_checkSingleUse();
			return new TrackHits(this);
		}

	}

	private static JsonpDeserializer<TrackHits> buildTrackHitsDeserializer() {
		return new UnionDeserializer.Builder<TrackHits, Kind, Object>(TrackHits::new, false)
				.addMember(Kind.Count, JsonpDeserializer.integerDeserializer())
				.addMember(Kind.Enabled, JsonpDeserializer.booleanDeserializer()).build();
	}

	public static final JsonpDeserializer<TrackHits> _DESERIALIZER = JsonpDeserializer
			.lazy(TrackHits::buildTrackHitsDeserializer);
}
