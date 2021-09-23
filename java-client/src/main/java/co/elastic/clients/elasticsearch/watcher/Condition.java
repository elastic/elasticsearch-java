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

// typedef: watcher._types.ConditionContainer
public interface Condition extends JsonpSerializable {

	String ALWAYS = "always";
	String ARRAY_COMPARE = "array_compare";
	String COMPARE = "compare";
	String NEVER = "never";
	String SCRIPT = "script";

	/**
	 * The type of this {@code ConditionContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code always}
		 */
		public ObjectBuilder<Condition> always(AlwaysCondition value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code always}
		 */
		public ObjectBuilder<Condition> always(Function<AlwaysCondition.Builder, ObjectBuilder<AlwaysCondition>> fn) {
			return this.always(fn.apply(new AlwaysCondition.Builder()).build());
		}

		/**
		 * API name: {@code array_compare}
		 */
		public ObjectBuilder<Condition> arrayCompare(ArrayCompareCondition value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code array_compare}
		 */
		public ObjectBuilder<Condition> arrayCompare(
				Function<ArrayCompareCondition.Builder, ObjectBuilder<ArrayCompareCondition>> fn) {
			return this.arrayCompare(fn.apply(new ArrayCompareCondition.Builder()).build());
		}

		/**
		 * API name: {@code compare}
		 */
		public ObjectBuilder<Condition> compare(CompareCondition value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code compare}
		 */
		public ObjectBuilder<Condition> compare(
				Function<CompareCondition.Builder, ObjectBuilder<CompareCondition>> fn) {
			return this.compare(fn.apply(new CompareCondition.Builder()).build());
		}

		/**
		 * API name: {@code never}
		 */
		public ObjectBuilder<Condition> never(NeverCondition value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code never}
		 */
		public ObjectBuilder<Condition> never(Function<NeverCondition.Builder, ObjectBuilder<NeverCondition>> fn) {
			return this.never(fn.apply(new NeverCondition.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Condition> script(ScriptCondition value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Condition> script(Function<ScriptCondition.Builder, ObjectBuilder<ScriptCondition>> fn) {
			return this.script(fn.apply(new ScriptCondition.Builder()).build());
		}

	}

	class $Helper {
		private static Condition deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Condition> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case ALWAYS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = AlwaysCondition.$BUILDER_DESERIALIZER.deserialize(new AlwaysCondition.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case ARRAY_COMPARE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ArrayCompareCondition.$BUILDER_DESERIALIZER
								.deserialize(new ArrayCompareCondition.Builder(), parser, mapper, parser.next());
						break;
					}
					case COMPARE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = CompareCondition.$BUILDER_DESERIALIZER.deserialize(new CompareCondition.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case NEVER : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = NeverCondition.$BUILDER_DESERIALIZER.deserialize(new NeverCondition.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SCRIPT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ScriptCondition.$BUILDER_DESERIALIZER.deserialize(new ScriptCondition.Builder(),
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

	JsonpDeserializer<Condition> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
