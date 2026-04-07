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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.List;
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

// typedef: esql._types.ESQLParams

/**
 *
 * @see <a href="../doc-files/api-spec.html#esql._types.ESQLParams">API
 *      specification</a>
 */
@JsonpDeserializable
public class ESQLParams implements TaggedUnion<ESQLParams.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Named, Value

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

	private ESQLParams(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private ESQLParams(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ESQLParams of(Function<Builder, ObjectBuilder<ESQLParams>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code named}?
	 */
	public boolean isNamed() {
		return _kind == Kind.Named;
	}

	/**
	 * Get the {@code named} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code named} kind.
	 */
	public List<NamedValue<List<FieldValue>>> named() {
		return TaggedUnionUtils.get(this, Kind.Named);
	}

	/**
	 * Is this variant instance of kind {@code value}?
	 */
	public boolean isValue() {
		return _kind == Kind.Value;
	}

	/**
	 * Get the {@code value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value} kind.
	 */
	public List<List<FieldValue>> value() {
		return TaggedUnionUtils.get(this, Kind.Value);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Named :
					generator.writeStartArray();
					for (NamedValue<List<FieldValue>> item0 : ((List<NamedValue<List<FieldValue>>>) this._value)) {
						generator.writeStartObject();
						generator.writeKey(item0.name());
						generator.writeStartArray();
						if (item0.value() != null) {
							for (FieldValue item2 : item0.value()) {
								item2.serialize(generator, mapper);

							}
						}
						generator.writeEnd();

						generator.writeEnd();

					}
					generator.writeEnd();

					break;
				case Value :
					generator.writeStartArray();
					for (List<FieldValue> item0 : ((List<List<FieldValue>>) this._value)) {
						generator.writeStartArray();
						if (item0 != null) {
							for (FieldValue item1 : item0) {
								item1.serialize(generator, mapper);

							}
						}
						generator.writeEnd();

					}
					generator.writeEnd();

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ESQLParams> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<ESQLParams> named(List<NamedValue<List<FieldValue>>> v) {
			this._kind = Kind.Named;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ESQLParams> value(List<List<FieldValue>> v) {
			this._kind = Kind.Value;
			this._value = v;
			return this;
		}

		public ESQLParams build() {
			_checkSingleUse();
			return new ESQLParams(this);
		}

	}

	private static JsonpDeserializer<ESQLParams> buildESQLParamsDeserializer() {
		return new UnionDeserializer.Builder<ESQLParams, Kind, Object>(ESQLParams::new, false)
				.addMember(Kind.Named,
						JsonpDeserializer.arrayDeserializer(NamedValue
								.deserializer(() -> JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER))))
				.addMember(Kind.Value,
						JsonpDeserializer
								.arrayDeserializer(JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER)))
				.build();
	}

	public static final JsonpDeserializer<ESQLParams> _DESERIALIZER = JsonpDeserializer
			.lazy(ESQLParams::buildESQLParamsDeserializer);
}
