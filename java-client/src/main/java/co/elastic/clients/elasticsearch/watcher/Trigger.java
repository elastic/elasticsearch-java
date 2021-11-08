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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TriggerContainer
@JsonpDeserializable
public class Trigger implements TaggedUnion<Object>, JsonpSerializable {

	public static final String SCHEDULE = "schedule";

	// Tagged union implementation

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

	public Trigger(TriggerVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Trigger(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Trigger of(Function<Builder, ObjectBuilder<Trigger>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code schedule} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code schedule} kind.
	 */
	public Schedule schedule() {
		return TaggedUnionUtils.get(this, SCHEDULE);
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

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Trigger> {
		private String _type;
		private Object _value;

		public Builder schedule(Schedule v) {
			this._type = SCHEDULE;
			this._value = v;
			return this;
		}

		public Builder schedule(Function<Schedule.Builder, ObjectBuilder<Schedule>> f) {
			return this.schedule(f.apply(new Schedule.Builder()).build());
		}

		public Trigger build() {
			_checkSingleUse();
			return new Trigger(this);
		}

	}

	protected static void setupTriggerDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::schedule, Schedule._DESERIALIZER, "schedule");

	}

	public static final JsonpDeserializer<Trigger> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Trigger::setupTriggerDeserializer, Builder::build);
}
