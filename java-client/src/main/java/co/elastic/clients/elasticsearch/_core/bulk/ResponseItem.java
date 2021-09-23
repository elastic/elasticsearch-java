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

package co.elastic.clients.elasticsearch._core.bulk;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.ResponseItemContainer
public interface ResponseItem extends JsonpSerializable {

	String INDEX = "index";
	String CREATE = "create";
	String UPDATE = "update";
	String DELETE = "delete";

	/**
	 * The type of this {@code ResponseItemContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code index}
		 */
		public ObjectBuilder<ResponseItem> index(IndexResponseItem value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code index}
		 */
		public ObjectBuilder<ResponseItem> index(
				Function<IndexResponseItem.Builder, ObjectBuilder<IndexResponseItem>> fn) {
			return this.index(fn.apply(new IndexResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code create}
		 */
		public ObjectBuilder<ResponseItem> create(CreateResponseItem value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code create}
		 */
		public ObjectBuilder<ResponseItem> create(
				Function<CreateResponseItem.Builder, ObjectBuilder<CreateResponseItem>> fn) {
			return this.create(fn.apply(new CreateResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code update}
		 */
		public ObjectBuilder<ResponseItem> update(UpdateResponseItem value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code update}
		 */
		public ObjectBuilder<ResponseItem> update(
				Function<UpdateResponseItem.Builder, ObjectBuilder<UpdateResponseItem>> fn) {
			return this.update(fn.apply(new UpdateResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code delete}
		 */
		public ObjectBuilder<ResponseItem> delete(DeleteResponseItem value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code delete}
		 */
		public ObjectBuilder<ResponseItem> delete(
				Function<DeleteResponseItem.Builder, ObjectBuilder<DeleteResponseItem>> fn) {
			return this.delete(fn.apply(new DeleteResponseItem.Builder()).build());
		}

	}

	class $Helper {
		private static ResponseItem deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends ResponseItem> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case INDEX : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = IndexResponseItem.$BUILDER_DESERIALIZER.deserialize(new IndexResponseItem.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case CREATE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = CreateResponseItem.$BUILDER_DESERIALIZER.deserialize(new CreateResponseItem.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case UPDATE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = UpdateResponseItem.$BUILDER_DESERIALIZER.deserialize(new UpdateResponseItem.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case DELETE : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DeleteResponseItem.$BUILDER_DESERIALIZER.deserialize(new DeleteResponseItem.Builder(),
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

	JsonpDeserializer<ResponseItem> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
