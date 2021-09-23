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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.SyncContainer
public interface Sync extends JsonpSerializable {

	String TIME = "time";

	/**
	 * The type of this {@code SyncContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * Specifies that the transform uses a time field to synchronize the source and
		 * destination indices.
		 * <p>
		 * API name: {@code time}
		 */
		public ObjectBuilder<Sync> time(TimeSync value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * Specifies that the transform uses a time field to synchronize the source and
		 * destination indices.
		 * <p>
		 * API name: {@code time}
		 */
		public ObjectBuilder<Sync> time(Function<TimeSync.Builder, ObjectBuilder<TimeSync>> fn) {
			return this.time(fn.apply(new TimeSync.Builder()).build());
		}

	}

	class $Helper {
		private static Sync deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Sync> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case TIME : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TimeSync.$BUILDER_DESERIALIZER.deserialize(new TimeSync.Builder(), parser, mapper,
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

	JsonpDeserializer<Sync> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
