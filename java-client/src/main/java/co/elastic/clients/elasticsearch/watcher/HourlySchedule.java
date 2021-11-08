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
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.HourlySchedule
@JsonpDeserializable
public class HourlySchedule implements ScheduleVariant, JsonpSerializable {
	private final List<Integer> minute;

	// ---------------------------------------------------------------------------------------------

	private HourlySchedule(Builder builder) {

		this.minute = ModelTypeHelper.unmodifiableRequired(builder.minute, this, "minute");

	}

	public static HourlySchedule of(Function<Builder, ObjectBuilder<HourlySchedule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Schedule} variant type
	 */
	@Override
	public String _variantType() {
		return "hourly";
	}

	/**
	 * Required - API name: {@code minute}
	 */
	public final List<Integer> minute() {
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

		if (ModelTypeHelper.isDefined(this.minute)) {
			generator.writeKey("minute");
			generator.writeStartArray();
			for (Integer item0 : this.minute) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HourlySchedule}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HourlySchedule> {
		private List<Integer> minute;

		/**
		 * Required - API name: {@code minute}
		 */
		public final Builder minute(List<Integer> value) {
			this.minute = value;
			return this;
		}

		/**
		 * Required - API name: {@code minute}
		 */
		public final Builder minute(Integer... value) {
			this.minute = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link HourlySchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HourlySchedule build() {
			_checkSingleUse();

			return new HourlySchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HourlySchedule}
	 */
	public static final JsonpDeserializer<HourlySchedule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HourlySchedule::setupHourlyScheduleDeserializer, Builder::build);

	protected static void setupHourlyScheduleDeserializer(DelegatingDeserializer<HourlySchedule.Builder> op) {

		op.add(Builder::minute, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()), "minute");

	}

}
