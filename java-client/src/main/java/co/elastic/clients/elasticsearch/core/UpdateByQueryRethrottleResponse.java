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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.update_by_query_rethrottle.UpdateByQueryRethrottleNode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.update_by_query_rethrottle.Response
@JsonpDeserializable
public class UpdateByQueryRethrottleResponse implements JsonpSerializable {
	private final Map<String, UpdateByQueryRethrottleNode> nodes;

	// ---------------------------------------------------------------------------------------------

	private UpdateByQueryRethrottleResponse(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static UpdateByQueryRethrottleResponse of(
			Function<Builder, ObjectBuilder<UpdateByQueryRethrottleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, UpdateByQueryRethrottleNode> nodes() {
		return this.nodes;
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

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, UpdateByQueryRethrottleNode> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRethrottleResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UpdateByQueryRethrottleResponse> {
		private Map<String, UpdateByQueryRethrottleNode> nodes;

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, UpdateByQueryRethrottleNode> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key,
				Function<UpdateByQueryRethrottleNode.Builder, ObjectBuilder<UpdateByQueryRethrottleNode>> fn) {
			return this
					.nodes(Collections.singletonMap(key, fn.apply(new UpdateByQueryRethrottleNode.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, UpdateByQueryRethrottleNode, UpdateByQueryRethrottleNode.Builder>, ObjectBuilder<Map<String, UpdateByQueryRethrottleNode>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(UpdateByQueryRethrottleNode.Builder::new)).build());
		}

		/**
		 * Builds a {@link UpdateByQueryRethrottleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryRethrottleResponse build() {
			_checkSingleUse();

			return new UpdateByQueryRethrottleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateByQueryRethrottleResponse}
	 */
	public static final JsonpDeserializer<UpdateByQueryRethrottleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateByQueryRethrottleResponse::setupUpdateByQueryRethrottleResponseDeserializer,
					Builder::build);

	protected static void setupUpdateByQueryRethrottleResponseDeserializer(
			DelegatingDeserializer<UpdateByQueryRethrottleResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(UpdateByQueryRethrottleNode._DESERIALIZER),
				"nodes");

	}

}
