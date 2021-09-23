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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.TransformContainer
public interface Transform extends JsonpSerializable {

	String CHAIN = "chain";
	String SCRIPT = "script";
	String SEARCH = "search";

	/**
	 * The type of this {@code TransformContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code chain}
		 */
		public ObjectBuilder<Transform> chain(ChainTransform value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code chain}
		 */
		public ObjectBuilder<Transform> chain(Function<ChainTransform.Builder, ObjectBuilder<ChainTransform>> fn) {
			return this.chain(fn.apply(new ChainTransform.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Transform> script(ScriptTransform value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code script}
		 */
		public ObjectBuilder<Transform> script(Function<ScriptTransform.Builder, ObjectBuilder<ScriptTransform>> fn) {
			return this.script(fn.apply(new ScriptTransform.Builder()).build());
		}

		/**
		 * API name: {@code search}
		 */
		public ObjectBuilder<Transform> search(SearchTransform value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code search}
		 */
		public ObjectBuilder<Transform> search(Function<SearchTransform.Builder, ObjectBuilder<SearchTransform>> fn) {
			return this.search(fn.apply(new SearchTransform.Builder()).build());
		}

	}

	class $Helper {
		private static Transform deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends Transform> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case CHAIN : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ChainTransform.$BUILDER_DESERIALIZER.deserialize(new ChainTransform.Builder(), parser,
								mapper, parser.next());
						break;
					}
					case SCRIPT : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = ScriptTransform.$BUILDER_DESERIALIZER.deserialize(new ScriptTransform.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case SEARCH : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = SearchTransform.$BUILDER_DESERIALIZER.deserialize(new SearchTransform.Builder(),
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

	JsonpDeserializer<Transform> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
