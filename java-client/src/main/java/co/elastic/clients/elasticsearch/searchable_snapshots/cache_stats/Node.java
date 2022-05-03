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

package co.elastic.clients.elasticsearch.searchable_snapshots.cache_stats;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.cache_stats.Node

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#searchable_snapshots.cache_stats.Node">API
 *      specification</a>
 */
@JsonpDeserializable
public class Node implements JsonpSerializable {
	private final Shared sharedCache;

	// ---------------------------------------------------------------------------------------------

	private Node(Builder builder) {

		this.sharedCache = ApiTypeHelper.requireNonNull(builder.sharedCache, this, "sharedCache");

	}

	public static Node of(Function<Builder, ObjectBuilder<Node>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shared_cache}
	 */
	public final Shared sharedCache() {
		return this.sharedCache;
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

		generator.writeKey("shared_cache");
		this.sharedCache.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Node}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Node> {
		private Shared sharedCache;

		/**
		 * Required - API name: {@code shared_cache}
		 */
		public final Builder sharedCache(Shared value) {
			this.sharedCache = value;
			return this;
		}

		/**
		 * Required - API name: {@code shared_cache}
		 */
		public final Builder sharedCache(Function<Shared.Builder, ObjectBuilder<Shared>> fn) {
			return this.sharedCache(fn.apply(new Shared.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Node}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Node build() {
			_checkSingleUse();

			return new Node(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Node}
	 */
	public static final JsonpDeserializer<Node> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Node::setupNodeDeserializer);

	protected static void setupNodeDeserializer(ObjectDeserializer<Node.Builder> op) {

		op.add(Builder::sharedCache, Shared._DESERIALIZER, "shared_cache");

	}

}
