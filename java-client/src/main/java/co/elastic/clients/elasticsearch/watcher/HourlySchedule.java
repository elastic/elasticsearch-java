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
import java.lang.Integer;
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

// typedef: watcher._types.HourlySchedule

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.HourlySchedule">API
 *      specification</a>
 */
@JsonpDeserializable
public class HourlySchedule implements ScheduleVariant, JsonpSerializable {
	private final List<Integer> minute;

	// ---------------------------------------------------------------------------------------------

	private HourlySchedule(Builder builder) {

		this.minute = ApiTypeHelper.unmodifiableRequired(builder.minute, this, "minute");

	}

	public static HourlySchedule of(Function<Builder, ObjectBuilder<HourlySchedule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Schedule variant kind.
	 */
	@Override
	public Schedule.Kind _scheduleKind() {
		return Schedule.Kind.Hourly;
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

		if (ApiTypeHelper.isDefined(this.minute)) {
			generator.writeKey("minute");
			generator.writeStartArray();
			for (Integer item0 : this.minute) {
				generator.write(item0);

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
	 * Builder for {@link HourlySchedule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HourlySchedule> {
		private List<Integer> minute;

		/**
		 * Required - API name: {@code minute}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>minute</code>.
		 */
		public final Builder minute(List<Integer> list) {
			this.minute = _listAddAll(this.minute, list);
			return this;
		}

		/**
		 * Required - API name: {@code minute}
		 * <p>
		 * Adds one or more values to <code>minute</code>.
		 */
		public final Builder minute(Integer value, Integer... values) {
			this.minute = _listAdd(this.minute, value, values);
			return this;
		}

		@Override
		protected Builder self() {
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
			HourlySchedule::setupHourlyScheduleDeserializer);

	protected static void setupHourlyScheduleDeserializer(ObjectDeserializer<HourlySchedule.Builder> op) {

		op.add(Builder::minute, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()), "minute");

	}

}
