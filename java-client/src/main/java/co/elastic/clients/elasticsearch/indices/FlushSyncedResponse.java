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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.flush_synced.Response
@JsonpDeserializable
public final class FlushSyncedResponse extends DictionaryResponse<String, ShardStatistics> {
	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	public FlushSyncedResponse(Builder builder) {
		super(builder);

		this.shards = Objects.requireNonNull(builder.shards, "_shards");

	}

	public FlushSyncedResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushSyncedResponse}.
	 */
	public static class Builder extends DictionaryResponse.AbstractBuilder<String, ShardStatistics, Builder>
			implements
				ObjectBuilder<FlushSyncedResponse> {
		private ShardStatistics shards;

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FlushSyncedResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushSyncedResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new FlushSyncedResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FlushSyncedResponse}
	 */
	public static final JsonpDeserializer<FlushSyncedResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FlushSyncedResponse::setupFlushSyncedResponseDeserializer, Builder::build);

	protected static void setupFlushSyncedResponseDeserializer(DelegatingDeserializer<FlushSyncedResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				ShardStatistics._DESERIALIZER);
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
