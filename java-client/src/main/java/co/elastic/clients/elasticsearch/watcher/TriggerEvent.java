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

// typedef: watcher._types.TriggerEventContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.TriggerEventContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class TriggerEvent implements TaggedUnion<TriggerEvent.Kind, Object>, JsonpSerializable {

	/**
	 * {@link TriggerEvent} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#watcher._types.TriggerEventContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Schedule("schedule"),

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

	public TriggerEvent(TriggerEventVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._triggerEventKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private TriggerEvent(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TriggerEvent of(Function<Builder, ObjectBuilder<TriggerEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code schedule}?
	 */
	public boolean isSchedule() {
		return _kind == Kind.Schedule;
	}

	/**
	 * Get the {@code schedule} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code schedule} kind.
	 */
	public ScheduleTriggerEvent schedule() {
		return TaggedUnionUtils.get(this, Kind.Schedule);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TriggerEvent> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<TriggerEvent> schedule(ScheduleTriggerEvent v) {
			this._kind = Kind.Schedule;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TriggerEvent> schedule(
				Function<ScheduleTriggerEvent.Builder, ObjectBuilder<ScheduleTriggerEvent>> fn) {
			return this.schedule(fn.apply(new ScheduleTriggerEvent.Builder()).build());
		}

		public TriggerEvent build() {
			_checkSingleUse();
			return new TriggerEvent(this);
		}

	}

	protected static void setupTriggerEventDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::schedule, ScheduleTriggerEvent._DESERIALIZER, "schedule");

	}

	public static final JsonpDeserializer<TriggerEvent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TriggerEvent::setupTriggerEventDeserializer, Builder::build);
}
