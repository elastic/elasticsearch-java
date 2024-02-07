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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
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

// typedef: watcher._types.DailySchedule

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.DailySchedule">API
 *      specification</a>
 */
@JsonpDeserializable
public class DailySchedule implements ScheduleVariant, JsonpSerializable {
	private final List<ScheduleTimeOfDay> at;

	// ---------------------------------------------------------------------------------------------

	private DailySchedule(Builder builder) {

		this.at = ApiTypeHelper.unmodifiableRequired(builder.at, this, "at");

	}

	public static DailySchedule of(Function<Builder, ObjectBuilder<DailySchedule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Schedule variant kind.
	 */
	@Override
	public Schedule.Kind _scheduleKind() {
		return Schedule.Kind.Daily;
	}

	/**
	 * Required - API name: {@code at}
	 */
	public final List<ScheduleTimeOfDay> at() {
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

		if (ApiTypeHelper.isDefined(this.at)) {
			generator.writeKey("at");
			generator.writeStartArray();
			for (ScheduleTimeOfDay item0 : this.at) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DailySchedule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DailySchedule> {
		private List<ScheduleTimeOfDay> at;

		/**
		 * Required - API name: {@code at}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>at</code>.
		 */
		public final Builder at(List<ScheduleTimeOfDay> list) {
			this.at = _listAddAll(this.at, list);
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 * <p>
		 * Adds one or more values to <code>at</code>.
		 */
		public final Builder at(ScheduleTimeOfDay value, ScheduleTimeOfDay... values) {
			this.at = _listAdd(this.at, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code at}
		 * <p>
		 * Adds a value to <code>at</code> using a builder lambda.
		 */
		public final Builder at(Function<ScheduleTimeOfDay.Builder, ObjectBuilder<ScheduleTimeOfDay>> fn) {
			return at(fn.apply(new ScheduleTimeOfDay.Builder()).build());
		}

		@Override
		protected Builder self() {
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

		op.add(Builder::at, JsonpDeserializer.arrayDeserializer(ScheduleTimeOfDay._DESERIALIZER), "at");

	}

}
