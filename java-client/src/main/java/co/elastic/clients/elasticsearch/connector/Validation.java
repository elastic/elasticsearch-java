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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.Validation

/**
 *
 * @see <a href="../doc-files/api-spec.html#connector._types.Validation">API
 *      specification</a>
 */
@JsonpDeserializable
public class Validation implements TaggedUnion<Validation.Kind, ValidationVariant>, JsonpSerializable {

	/**
	 * {@link Validation} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#connector._types.Validation">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		GreaterThan("greater_than"),

		IncludedIn("included_in"),

		LessThan("less_than"),

		ListType("list_type"),

		Regex("regex"),

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
	private final ValidationVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final ValidationVariant _get() {
		return _value;
	}

	public Validation(ValidationVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._validationKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Validation(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Validation of(Function<Builder, ObjectBuilder<Validation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code greater_than}?
	 */
	public boolean isGreaterThan() {
		return _kind == Kind.GreaterThan;
	}

	/**
	 * Get the {@code greater_than} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code greater_than} kind.
	 */
	public GreaterThanValidation greaterThan() {
		return TaggedUnionUtils.get(this, Kind.GreaterThan);
	}

	/**
	 * Is this variant instance of kind {@code included_in}?
	 */
	public boolean isIncludedIn() {
		return _kind == Kind.IncludedIn;
	}

	/**
	 * Get the {@code included_in} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code included_in} kind.
	 */
	public IncludedInValidation includedIn() {
		return TaggedUnionUtils.get(this, Kind.IncludedIn);
	}

	/**
	 * Is this variant instance of kind {@code less_than}?
	 */
	public boolean isLessThan() {
		return _kind == Kind.LessThan;
	}

	/**
	 * Get the {@code less_than} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code less_than} kind.
	 */
	public LessThanValidation lessThan() {
		return TaggedUnionUtils.get(this, Kind.LessThan);
	}

	/**
	 * Is this variant instance of kind {@code list_type}?
	 */
	public boolean isListType() {
		return _kind == Kind.ListType;
	}

	/**
	 * Get the {@code list_type} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code list_type} kind.
	 */
	public ListTypeValidation listType() {
		return TaggedUnionUtils.get(this, Kind.ListType);
	}

	/**
	 * Is this variant instance of kind {@code regex}?
	 */
	public boolean isRegex() {
		return _kind == Kind.Regex;
	}

	/**
	 * Get the {@code regex} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regex} kind.
	 */
	public RegexValidation regex() {
		return TaggedUnionUtils.get(this, Kind.Regex);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Validation> {
		private Kind _kind;
		private ValidationVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Validation> greaterThan(GreaterThanValidation v) {
			this._kind = Kind.GreaterThan;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Validation> greaterThan(
				Function<GreaterThanValidation.Builder, ObjectBuilder<GreaterThanValidation>> fn) {
			return this.greaterThan(fn.apply(new GreaterThanValidation.Builder()).build());
		}

		public ObjectBuilder<Validation> includedIn(IncludedInValidation v) {
			this._kind = Kind.IncludedIn;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Validation> includedIn(
				Function<IncludedInValidation.Builder, ObjectBuilder<IncludedInValidation>> fn) {
			return this.includedIn(fn.apply(new IncludedInValidation.Builder()).build());
		}

		public ObjectBuilder<Validation> lessThan(LessThanValidation v) {
			this._kind = Kind.LessThan;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Validation> lessThan(
				Function<LessThanValidation.Builder, ObjectBuilder<LessThanValidation>> fn) {
			return this.lessThan(fn.apply(new LessThanValidation.Builder()).build());
		}

		public ObjectBuilder<Validation> listType(ListTypeValidation v) {
			this._kind = Kind.ListType;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Validation> listType(
				Function<ListTypeValidation.Builder, ObjectBuilder<ListTypeValidation>> fn) {
			return this.listType(fn.apply(new ListTypeValidation.Builder()).build());
		}

		public ObjectBuilder<Validation> regex(RegexValidation v) {
			this._kind = Kind.Regex;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Validation> regex(Function<RegexValidation.Builder, ObjectBuilder<RegexValidation>> fn) {
			return this.regex(fn.apply(new RegexValidation.Builder()).build());
		}

		public Validation build() {
			_checkSingleUse();
			return new Validation(this);
		}

	}

	protected static void setupValidationDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::greaterThan, GreaterThanValidation._DESERIALIZER, "greater_than");
		op.add(Builder::includedIn, IncludedInValidation._DESERIALIZER, "included_in");
		op.add(Builder::lessThan, LessThanValidation._DESERIALIZER, "less_than");
		op.add(Builder::listType, ListTypeValidation._DESERIALIZER, "list_type");
		op.add(Builder::regex, RegexValidation._DESERIALIZER, "regex");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<Validation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Validation::setupValidationDeserializer, Builder::build);
}
