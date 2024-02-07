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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.NamedValue;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.Pair;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: watcher._types.ConditionContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ConditionContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Condition implements TaggedUnion<Condition.Kind, Object>, JsonpSerializable {

	/**
	 * {@link Condition} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#watcher._types.ConditionContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Always("always"),

		ArrayCompare("array_compare"),

		Compare("compare"),

		Never("never"),

		Script("script"),

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

	public Condition(ConditionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._conditionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Condition(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Condition of(Function<Builder, ObjectBuilder<Condition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code always}?
	 */
	public boolean isAlways() {
		return _kind == Kind.Always;
	}

	/**
	 * Get the {@code always} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code always} kind.
	 */
	public AlwaysCondition always() {
		return TaggedUnionUtils.get(this, Kind.Always);
	}

	/**
	 * Is this variant instance of kind {@code array_compare}?
	 */
	public boolean isArrayCompare() {
		return _kind == Kind.ArrayCompare;
	}

	/**
	 * Get the {@code array_compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code array_compare} kind.
	 */
	public NamedValue<ArrayCompareCondition> arrayCompare() {
		return TaggedUnionUtils.get(this, Kind.ArrayCompare);
	}

	/**
	 * Is this variant instance of kind {@code compare}?
	 */
	public boolean isCompare() {
		return _kind == Kind.Compare;
	}

	/**
	 * Get the {@code compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code compare} kind.
	 */
	public NamedValue<Pair<ConditionOp, FieldValue>> compare() {
		return TaggedUnionUtils.get(this, Kind.Compare);
	}

	/**
	 * Is this variant instance of kind {@code never}?
	 */
	public boolean isNever() {
		return _kind == Kind.Never;
	}

	/**
	 * Get the {@code never} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code never} kind.
	 */
	public NeverCondition never() {
		return TaggedUnionUtils.get(this, Kind.Never);
	}

	/**
	 * Is this variant instance of kind {@code script}?
	 */
	public boolean isScript() {
		return _kind == Kind.Script;
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptCondition script() {
		return TaggedUnionUtils.get(this, Kind.Script);
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
				case ArrayCompare :
					generator.writeStartObject();
					generator.writeKey(((NamedValue<ArrayCompareCondition>) this._value).name());
					((NamedValue<ArrayCompareCondition>) this._value).value().serialize(generator, mapper);

					generator.writeEnd();

					break;
				case Compare :
					generator.writeStartObject();
					generator.writeKey(((NamedValue<Pair<ConditionOp, FieldValue>>) this._value).name());
					generator.writeStartObject();
					generator.writeKey(
							((NamedValue<Pair<ConditionOp, FieldValue>>) this._value).value().key().jsonValue());
					((NamedValue<Pair<ConditionOp, FieldValue>>) this._value).value().value().serialize(generator,
							mapper);

					generator.writeEnd();

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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Condition> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Condition> always(AlwaysCondition v) {
			this._kind = Kind.Always;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> always(Function<AlwaysCondition.Builder, ObjectBuilder<AlwaysCondition>> fn) {
			return this.always(fn.apply(new AlwaysCondition.Builder()).build());
		}

		public ObjectBuilder<Condition> arrayCompare(NamedValue<ArrayCompareCondition> v) {
			this._kind = Kind.ArrayCompare;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> compare(NamedValue<Pair<ConditionOp, FieldValue>> v) {
			this._kind = Kind.Compare;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> never(NeverCondition v) {
			this._kind = Kind.Never;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> never(Function<NeverCondition.Builder, ObjectBuilder<NeverCondition>> fn) {
			return this.never(fn.apply(new NeverCondition.Builder()).build());
		}

		public ObjectBuilder<Condition> script(ScriptCondition v) {
			this._kind = Kind.Script;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Condition> script(Function<ScriptCondition.Builder, ObjectBuilder<ScriptCondition>> fn) {
			return this.script(fn.apply(new ScriptCondition.Builder()).build());
		}

		public Condition build() {
			_checkSingleUse();
			return new Condition(this);
		}

	}

	protected static void setupConditionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::always, AlwaysCondition._DESERIALIZER, "always");
		op.add(Builder::arrayCompare, NamedValue.deserializer(() -> ArrayCompareCondition._DESERIALIZER),
				"array_compare");
		op.add(Builder::compare,
				NamedValue.deserializer(
						() -> Pair.deserializer((k) -> ConditionOp._DESERIALIZER.parse(k), FieldValue._DESERIALIZER)),
				"compare");
		op.add(Builder::never, NeverCondition._DESERIALIZER, "never");
		op.add(Builder::script, ScriptCondition._DESERIALIZER, "script");

	}

	public static final JsonpDeserializer<Condition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Condition::setupConditionDeserializer, Builder::build);
}
