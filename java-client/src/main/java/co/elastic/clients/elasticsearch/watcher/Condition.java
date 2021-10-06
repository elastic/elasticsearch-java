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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ConditionContainer
@JsonpDeserializable
public class Condition implements TaggedUnion<Object>, JsonpSerializable {

	public static final String ALWAYS = "always";
	public static final String ARRAY_COMPARE = "array_compare";
	public static final String COMPARE = "compare";
	public static final String NEVER = "never";
	public static final String SCRIPT = "script";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public Condition(ConditionVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	public <T extends ConditionVariant> Condition(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private Condition(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public Condition(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code always} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code always} kind.
	 */
	public AlwaysCondition always() {
		return TaggedUnionUtils.get(this, ALWAYS);
	}

	/**
	 * Get the {@code array_compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code array_compare} kind.
	 */
	public ArrayCompareCondition arrayCompare() {
		return TaggedUnionUtils.get(this, ARRAY_COMPARE);
	}

	/**
	 * Get the {@code compare} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code compare} kind.
	 */
	public CompareCondition compare() {
		return TaggedUnionUtils.get(this, COMPARE);
	}

	/**
	 * Get the {@code never} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code never} kind.
	 */
	public NeverCondition never() {
		return TaggedUnionUtils.get(this, NEVER);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public ScriptCondition script() {
		return TaggedUnionUtils.get(this, SCRIPT);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<Condition> {
		private String _type;
		private Object _value;

		public Builder always(AlwaysCondition v) {
			this._type = ALWAYS;
			this._value = v;
			return this;
		}

		public Builder always(Function<AlwaysCondition.Builder, ObjectBuilder<AlwaysCondition>> f) {
			return this.always(f.apply(new AlwaysCondition.Builder()).build());
		}

		public Builder arrayCompare(ArrayCompareCondition v) {
			this._type = ARRAY_COMPARE;
			this._value = v;
			return this;
		}

		public Builder arrayCompare(Function<ArrayCompareCondition.Builder, ObjectBuilder<ArrayCompareCondition>> f) {
			return this.arrayCompare(f.apply(new ArrayCompareCondition.Builder()).build());
		}

		public Builder compare(CompareCondition v) {
			this._type = COMPARE;
			this._value = v;
			return this;
		}

		public Builder compare(Function<CompareCondition.Builder, ObjectBuilder<CompareCondition>> f) {
			return this.compare(f.apply(new CompareCondition.Builder()).build());
		}

		public Builder never(NeverCondition v) {
			this._type = NEVER;
			this._value = v;
			return this;
		}

		public Builder never(Function<NeverCondition.Builder, ObjectBuilder<NeverCondition>> f) {
			return this.never(f.apply(new NeverCondition.Builder()).build());
		}

		public Builder script(ScriptCondition v) {
			this._type = SCRIPT;
			this._value = v;
			return this;
		}

		public Builder script(Function<ScriptCondition.Builder, ObjectBuilder<ScriptCondition>> f) {
			return this.script(f.apply(new ScriptCondition.Builder()).build());
		}

		public Condition build() {
			return new Condition(this);
		}

	}

	protected static void setupConditionDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::always, AlwaysCondition._DESERIALIZER, "always");
		op.add(Builder::arrayCompare, ArrayCompareCondition._DESERIALIZER, "array_compare");
		op.add(Builder::compare, CompareCondition._DESERIALIZER, "compare");
		op.add(Builder::never, NeverCondition._DESERIALIZER, "never");
		op.add(Builder::script, ScriptCondition._DESERIALIZER, "script");

	}

	public static final JsonpDeserializer<Condition> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Condition::setupConditionDeserializer, Builder::build);
}
