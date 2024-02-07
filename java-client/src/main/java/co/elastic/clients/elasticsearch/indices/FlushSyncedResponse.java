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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: indices.flush_synced.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.flush_synced.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FlushSyncedResponse extends DictionaryResponse<String, ShardStatistics> {
	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	private FlushSyncedResponse(Builder builder) {
		super(builder);

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static FlushSyncedResponse of(Function<Builder, ObjectBuilder<FlushSyncedResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
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
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
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
			_checkSingleUse();
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
			.lazy(Builder::new, FlushSyncedResponse::setupFlushSyncedResponseDeserializer);

	protected static void setupFlushSyncedResponseDeserializer(ObjectDeserializer<FlushSyncedResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				ShardStatistics._DESERIALIZER);
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
