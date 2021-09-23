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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TriggerContainer
public interface Trigger extends JsonpSerializable {

	String SCHEDULE = "schedule";

	/**
	 * The type of this {@code TriggerContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code schedule}
		 */
		public ObjectBuilder<Trigger> schedule(Schedule value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code schedule}
		 */
		public ObjectBuilder<Trigger> schedule(Function<Schedule.Builder, ObjectBuilder<Schedule>> fn) {
			return this.schedule(fn.apply(new Schedule.Builder()).build());
		}

	}

	class $Helper {
		private static Trigger deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Trigger> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case SCHEDULE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = Schedule.$BUILDER_DESERIALIZER.deserialize(new Schedule.Builder(), parser, mapper,
								parser.next());
						break;
					}
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<Trigger> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
