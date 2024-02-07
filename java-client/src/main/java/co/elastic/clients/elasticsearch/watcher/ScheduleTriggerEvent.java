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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: watcher._types.ScheduleTriggerEvent

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ScheduleTriggerEvent">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScheduleTriggerEvent implements TriggerEventVariant, JsonpSerializable {
	private final DateTime scheduledTime;

	@Nullable
	private final DateTime triggeredTime;

	// ---------------------------------------------------------------------------------------------

	private ScheduleTriggerEvent(Builder builder) {

		this.scheduledTime = ApiTypeHelper.requireNonNull(builder.scheduledTime, this, "scheduledTime");
		this.triggeredTime = builder.triggeredTime;

	}

	public static ScheduleTriggerEvent of(Function<Builder, ObjectBuilder<ScheduleTriggerEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TriggerEvent variant kind.
	 */
	@Override
	public TriggerEvent.Kind _triggerEventKind() {
		return TriggerEvent.Kind.Schedule;
	}

	/**
	 * Required - API name: {@code scheduled_time}
	 */
	public final DateTime scheduledTime() {
		return this.scheduledTime;
	}

	/**
	 * API name: {@code triggered_time}
	 */
	@Nullable
	public final DateTime triggeredTime() {
		return this.triggeredTime;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("scheduled_time");
		this.scheduledTime.serialize(generator, mapper);
		if (this.triggeredTime != null) {
			generator.writeKey("triggered_time");
			this.triggeredTime.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScheduleTriggerEvent}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ScheduleTriggerEvent> {
		private DateTime scheduledTime;

		@Nullable
		private DateTime triggeredTime;

		/**
		 * Required - API name: {@code scheduled_time}
		 */
		public final Builder scheduledTime(DateTime value) {
			this.scheduledTime = value;
			return this;
		}

		/**
		 * API name: {@code triggered_time}
		 */
		public final Builder triggeredTime(@Nullable DateTime value) {
			this.triggeredTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScheduleTriggerEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScheduleTriggerEvent build() {
			_checkSingleUse();

			return new ScheduleTriggerEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScheduleTriggerEvent}
	 */
	public static final JsonpDeserializer<ScheduleTriggerEvent> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScheduleTriggerEvent::setupScheduleTriggerEventDeserializer);

	protected static void setupScheduleTriggerEventDeserializer(ObjectDeserializer<ScheduleTriggerEvent.Builder> op) {

		op.add(Builder::scheduledTime, DateTime._DESERIALIZER, "scheduled_time");
		op.add(Builder::triggeredTime, DateTime._DESERIALIZER, "triggered_time");

	}

}
