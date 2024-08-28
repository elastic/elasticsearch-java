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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
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

// typedef: esql._types.TableValuesContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#esql._types.TableValuesContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class TableValues implements TaggedUnion<TableValues.Kind, Object>, JsonpSerializable {

	/**
	 * {@link TableValues} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#esql._types.TableValuesContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Integer("integer"),

		Keyword("keyword"),

		Long("long"),

		Double("double"),

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

	public TableValues(TableValuesVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._tableValuesKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TableValues(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TableValues of(Function<Builder, ObjectBuilder<TableValues>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code integer}?
	 */
	public boolean isInteger() {
		return _kind == Kind.Integer;
	}

	/**
	 * Get the {@code integer} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code integer} kind.
	 */
	public List<List<Integer>> integer() {
		return TaggedUnionUtils.get(this, Kind.Integer);
	}

	/**
	 * Is this variant instance of kind {@code keyword}?
	 */
	public boolean isKeyword() {
		return _kind == Kind.Keyword;
	}

	/**
	 * Get the {@code keyword} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code keyword} kind.
	 */
	public List<List<String>> keyword() {
		return TaggedUnionUtils.get(this, Kind.Keyword);
	}

	/**
	 * Is this variant instance of kind {@code long}?
	 */
	public boolean isLong() {
		return _kind == Kind.Long;
	}

	/**
	 * Get the {@code long} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code long} kind.
	 */
	public List<List<Long>> long_() {
		return TaggedUnionUtils.get(this, Kind.Long);
	}

	/**
	 * Is this variant instance of kind {@code double}?
	 */
	public boolean isDouble() {
		return _kind == Kind.Double;
	}

	/**
	 * Get the {@code double} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code double} kind.
	 */
	public List<List<Double>> double_() {
		return TaggedUnionUtils.get(this, Kind.Double);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Integer :
					generator.writeStartArray();
					for (List<Integer> item0 : ((List<List<Integer>>) this._value)) {
						generator.writeStartArray();
						if (item0 != null) {
							for (Integer item1 : item0) {
								generator.write(item1);

							}
						}
						generator.writeEnd();

					}
					generator.writeEnd();

					break;
				case Keyword :
					generator.writeStartArray();
					for (List<String> item0 : ((List<List<String>>) this._value)) {
						generator.writeStartArray();
						if (item0 != null) {
							for (String item1 : item0) {
								generator.write(item1);

							}
						}
						generator.writeEnd();

					}
					generator.writeEnd();

					break;
				case Long :
					generator.writeStartArray();
					for (List<Long> item0 : ((List<List<Long>>) this._value)) {
						generator.writeStartArray();
						if (item0 != null) {
							for (Long item1 : item0) {
								generator.write(item1);

							}
						}
						generator.writeEnd();

					}
					generator.writeEnd();

					break;
				case Double :
					generator.writeStartArray();
					for (List<Double> item0 : ((List<List<Double>>) this._value)) {
						generator.writeStartArray();
						if (item0 != null) {
							for (Double item1 : item0) {
								generator.write(item1);

							}
						}
						generator.writeEnd();

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TableValues> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<TableValues> integer(List<List<Integer>> v) {
			this._kind = Kind.Integer;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TableValues> keyword(List<List<String>> v) {
			this._kind = Kind.Keyword;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TableValues> long_(List<List<Long>> v) {
			this._kind = Kind.Long;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TableValues> double_(List<List<Double>> v) {
			this._kind = Kind.Double;
			this._value = v;
			return this;
		}

		public TableValues build() {
			_checkSingleUse();
			return new TableValues(this);
		}

	}

	protected static void setupTableValuesDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::integer, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer())), "integer");
		op.add(Builder::keyword, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "keyword");
		op.add(Builder::long_, JsonpDeserializer
				.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonpDeserializer.longDeserializer())), "long");
		op.add(Builder::double_, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer())), "double");

	}

	public static final JsonpDeserializer<TableValues> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TableValues::setupTableValuesDeserializer, Builder::build);
}
