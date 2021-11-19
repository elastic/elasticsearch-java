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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SourceConfig
// union type: Union[]
@JsonpDeserializable
public class SourceConfig implements TaggedUnion<Object>, JsonpSerializable {

	public static final String FILTER = "filter";
	public static final String FETCH = "fetch";

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

	public SourceConfig(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private SourceConfig(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SourceConfig of(Function<Builder, ObjectBuilder<SourceConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code filter}?
	 */
	public boolean _isFilter() {
		return FILTER.equals(_type());
	}

	/**
	 * Get the {@code filter} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code filter} kind.
	 */
	public SourceFilter filter() {
		return TaggedUnionUtils.get(this, FILTER);
	}

	/**
	 * Is this variant instance of kind {@code fetch}?
	 */
	public boolean _isFetch() {
		return FETCH.equals(_type());
	}

	/**
	 * Get the {@code fetch} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fetch} kind.
	 */
	public Boolean fetch() {
		return TaggedUnionUtils.get(this, FETCH);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case FETCH :
					generator.write(((Boolean) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SourceConfig> {
		private String _type;
		private Object _value;

		public Builder filter(SourceFilter v) {
			this._type = FILTER;
			this._value = v;
			return this;
		}

		public Builder filter(Function<SourceFilter.Builder, ObjectBuilder<SourceFilter>> f) {
			return this.filter(f.apply(new SourceFilter.Builder()).build());
		}

		public Builder fetch(Boolean v) {
			this._type = FETCH;
			this._value = v;
			return this;
		}

		public SourceConfig build() {
			_checkSingleUse();
			return new SourceConfig(this);
		}

	}

	private static JsonpDeserializer<SourceConfig> buildSourceConfigDeserializer() {
		return new UnionDeserializer.Builder<>(SourceConfig::new, false).addMember("filter", SourceFilter._DESERIALIZER)
				.addMember("fetch", JsonpDeserializer.booleanDeserializer()).build();
	}

	public static final JsonpDeserializer<SourceConfig> _DESERIALIZER = JsonpDeserializer
			.lazy(SourceConfig::buildSourceConfigDeserializer);
}
