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

package co.elastic.clients.elasticsearch.indices.rollover;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
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
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.IndexRolloverMapping
// union type: Union[]
@JsonpDeserializable
public class IndexRolloverMapping implements TaggedUnion<Object>, JsonpSerializable {

	public static final String BY_TYPE = "by_type";
	public static final String SINGLE = "single";

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

	public IndexRolloverMapping(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private IndexRolloverMapping(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static IndexRolloverMapping of(Function<Builder, ObjectBuilder<IndexRolloverMapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code by_type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code by_type} kind.
	 */
	public Map<String, TypeMapping> byType() {
		return TaggedUnionUtils.get(this, BY_TYPE);
	}

	/**
	 * Get the {@code single} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code single} kind.
	 */
	public TypeMapping single() {
		return TaggedUnionUtils.get(this, SINGLE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case BY_TYPE :
					generator.writeStartObject();
					for (Map.Entry<String, TypeMapping> item0 : ((Map<String, TypeMapping>) this._value).entrySet()) {
						generator.writeKey(item0.getKey());
						item0.getValue().serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexRolloverMapping> {
		private String _type;
		private Object _value;

		public Builder byType(Map<String, TypeMapping> v) {
			this._type = BY_TYPE;
			this._value = v;
			return this;
		}

		public Builder single(TypeMapping v) {
			this._type = SINGLE;
			this._value = v;
			return this;
		}

		public Builder single(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> f) {
			return this.single(f.apply(new TypeMapping.Builder()).build());
		}

		public IndexRolloverMapping build() {
			_checkSingleUse();
			return new IndexRolloverMapping(this);
		}

	}

	private static JsonpDeserializer<IndexRolloverMapping> buildIndexRolloverMappingDeserializer() {
		return new UnionDeserializer.Builder<>(IndexRolloverMapping::new, false)
				.addMember("by_type", JsonpDeserializer.stringMapDeserializer(TypeMapping._DESERIALIZER))
				.addMember("single", TypeMapping._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<IndexRolloverMapping> _DESERIALIZER = JsonpDeserializer
			.lazy(IndexRolloverMapping::buildIndexRolloverMappingDeserializer);
}
