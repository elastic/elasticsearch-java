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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TriggerEventContainer
public class TriggerEvent extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String SCHEDULE = "schedule";

	private TriggerEvent(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code schedule} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code schedule} kind.
	 */
	public ScheduleTriggerEvent schedule() {
		return _get(SCHEDULE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<TriggerEvent> schedule(ScheduleTriggerEvent v) {
			this.$variant = v;
			this.$tag = SCHEDULE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<TriggerEvent> schedule(
				Function<ScheduleTriggerEvent.Builder, ObjectBuilder<ScheduleTriggerEvent>> f) {
			return this.schedule(f.apply(new ScheduleTriggerEvent.Builder()).build());
		}

		protected TriggerEvent build() {
			return new TriggerEvent(this);
		}

	}

	protected static void setupTriggerEventDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::schedule, ScheduleTriggerEvent.DESERIALIZER, "schedule");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<TriggerEvent> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			TriggerEvent::setupTriggerEventDeserializer, Builder::build);
}
