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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.DailySchedule
@JsonpDeserializable
public class DailySchedule implements ScheduleVariant, JsonpSerializable {
	private final List<TimeOfDay> at;

	// ---------------------------------------------------------------------------------------------

	private DailySchedule(Builder builder) {

		this.at = ModelTypeHelper.unmodifiableRequired(builder.at, this, "at");

	}

	public static DailySchedule of(Function<Builder, ObjectBuilder<DailySchedule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Schedule} variant type
	 */
	@Override
	public String _variantType() {
		return "daily";
	}

	/**
	 * Required - API name: {@code at}
	 */
	public final List<TimeOfDay> at() {
		return this.at;
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

		if (ModelTypeHelper.isDefined(this.at)) {
			generator.writeKey("at");
			generator.writeStartArray();
			for (TimeOfDay item0 : this.at) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DailySchedule}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DailySchedule> {
		private List<TimeOfDay> at;

		/**
		 * Required - API name: {@code at}
		 */
		public final Builder at(List<TimeOfDay> value) {
			this.at = value;
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 */
		public final Builder at(TimeOfDay... value) {
			this.at = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 */
		@SafeVarargs
		public final Builder at(Function<TimeOfDay.Builder, ObjectBuilder<TimeOfDay>>... fns) {
			this.at = new ArrayList<>(fns.length);
			for (Function<TimeOfDay.Builder, ObjectBuilder<TimeOfDay>> fn : fns) {
				this.at.add(fn.apply(new TimeOfDay.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link DailySchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DailySchedule build() {
			_checkSingleUse();

			return new DailySchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DailySchedule}
	 */
	public static final JsonpDeserializer<DailySchedule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DailySchedule::setupDailyScheduleDeserializer);

	protected static void setupDailyScheduleDeserializer(ObjectDeserializer<DailySchedule.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(TimeOfDay._DESERIALIZER), "at");

	}

}
