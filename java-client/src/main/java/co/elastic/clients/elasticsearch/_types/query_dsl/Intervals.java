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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsContainer
public interface Intervals extends JsonpSerializable {

	String ALL_OF = "all_of";
	String ANY_OF = "any_of";
	String FUZZY = "fuzzy";
	String MATCH = "match";
	String PREFIX = "prefix";
	String WILDCARD = "wildcard";

	/**
	 * The type of this {@code IntervalsContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code all_of}
		 */
		public ObjectBuilder<Intervals> allOf(IntervalsAllOf value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code all_of}
		 */
		public ObjectBuilder<Intervals> allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> fn) {
			return this.allOf(fn.apply(new IntervalsAllOf.Builder()).build());
		}

		/**
		 * API name: {@code any_of}
		 */
		public ObjectBuilder<Intervals> anyOf(IntervalsAnyOf value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code any_of}
		 */
		public ObjectBuilder<Intervals> anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> fn) {
			return this.anyOf(fn.apply(new IntervalsAnyOf.Builder()).build());
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public ObjectBuilder<Intervals> fuzzy(IntervalsFuzzy value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code fuzzy}
		 */
		public ObjectBuilder<Intervals> fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> fn) {
			return this.fuzzy(fn.apply(new IntervalsFuzzy.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public ObjectBuilder<Intervals> match(IntervalsMatch value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code match}
		 */
		public ObjectBuilder<Intervals> match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> fn) {
			return this.match(fn.apply(new IntervalsMatch.Builder()).build());
		}

		/**
		 * API name: {@code prefix}
		 */
		public ObjectBuilder<Intervals> prefix(IntervalsPrefix value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code prefix}
		 */
		public ObjectBuilder<Intervals> prefix(Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> fn) {
			return this.prefix(fn.apply(new IntervalsPrefix.Builder()).build());
		}

		/**
		 * API name: {@code wildcard}
		 */
		public ObjectBuilder<Intervals> wildcard(IntervalsWildcard value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code wildcard}
		 */
		public ObjectBuilder<Intervals> wildcard(
				Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> fn) {
			return this.wildcard(fn.apply(new IntervalsWildcard.Builder()).build());
		}

	}

	class $Helper {
		private static Intervals deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Intervals> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case ALL_OF : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsAllOf.$BUILDER_DESERIALIZER.deserialize(new IntervalsAllOf.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case ANY_OF : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsAnyOf.$BUILDER_DESERIALIZER.deserialize(new IntervalsAnyOf.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case FUZZY : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsFuzzy.$BUILDER_DESERIALIZER.deserialize(new IntervalsFuzzy.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case MATCH : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsMatch.$BUILDER_DESERIALIZER.deserialize(new IntervalsMatch.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case PREFIX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsPrefix.$BUILDER_DESERIALIZER.deserialize(new IntervalsPrefix.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case WILDCARD : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IntervalsWildcard.$BUILDER_DESERIALIZER.deserialize(new IntervalsWildcard.Builder(),
								parser, mapper, parser.next());
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

	JsonpDeserializer<Intervals> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
