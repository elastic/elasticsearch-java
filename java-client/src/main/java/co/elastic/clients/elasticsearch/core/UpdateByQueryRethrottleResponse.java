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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch.core.update_by_query_rethrottle.UpdateByQueryRethrottleNode;
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
import java.lang.String;
import java.util.Map;
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

// typedef: _global.update_by_query_rethrottle.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.update_by_query_rethrottle.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateByQueryRethrottleResponse implements JsonpSerializable {
	private final Map<String, UpdateByQueryRethrottleNode> nodes;

	// ---------------------------------------------------------------------------------------------

	private UpdateByQueryRethrottleResponse(Builder builder) {

		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

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

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, UpdateByQueryRethrottleNode> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link UpdateByQueryRethrottleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdateByQueryRethrottleResponse> {
		private Map<String, UpdateByQueryRethrottleNode> nodes;

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final Builder nodes(Map<String, UpdateByQueryRethrottleNode> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final Builder nodes(String key, UpdateByQueryRethrottleNode value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(String key,
				Function<UpdateByQueryRethrottleNode.Builder, ObjectBuilder<UpdateByQueryRethrottleNode>> fn) {
			return nodes(key, fn.apply(new UpdateByQueryRethrottleNode.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
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
			.lazy(Builder::new, UpdateByQueryRethrottleResponse::setupUpdateByQueryRethrottleResponseDeserializer);

	protected static void setupUpdateByQueryRethrottleResponseDeserializer(
			ObjectDeserializer<UpdateByQueryRethrottleResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(UpdateByQueryRethrottleNode._DESERIALIZER),
				"nodes");

	}

}
