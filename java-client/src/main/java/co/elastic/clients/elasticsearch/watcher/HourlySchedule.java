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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.HourlySchedule
public final class HourlySchedule implements JsonpSerializable {
	private final List<Number> minute;

	// ---------------------------------------------------------------------------------------------

	public HourlySchedule(Builder builder) {

		this.minute = Objects.requireNonNull(builder.minute, "minute");

	}

	/**
	 * API name: {@code minute}
	 */
	public List<Number> minute() {
		return this.minute;
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

		generator.writeKey("minute");
		generator.writeStartArray();
		for (Number item0 : this.minute) {
			generator.write(item0.doubleValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HourlySchedule}.
	 */
	public static class Builder implements ObjectBuilder<HourlySchedule> {
		private List<Number> minute;

		/**
		 * API name: {@code minute}
		 */
		public Builder minute(List<Number> value) {
			this.minute = value;
			return this;
		}

		/**
		 * API name: {@code minute}
		 */
		public Builder minute(Number... value) {
			this.minute = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #minute(List)}, creating the list if needed.
		 */
		public Builder addMinute(Number value) {
			if (this.minute == null) {
				this.minute = new ArrayList<>();
			}
			this.minute.add(value);
			return this;
		}

		/**
		 * Builds a {@link HourlySchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HourlySchedule build() {

			return new HourlySchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HourlySchedule}
	 */
	public static final JsonpDeserializer<HourlySchedule> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HourlySchedule::setupHourlyScheduleDeserializer);

	protected static void setupHourlyScheduleDeserializer(DelegatingDeserializer<HourlySchedule.Builder> op) {

		op.add(Builder::minute, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "minute");

	}

}
