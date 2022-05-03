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
import co.elastic.clients.elasticsearch.indices.stats.IndicesStats;
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

// typedef: indices.stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesStatsResponse implements JsonpSerializable {
	private final Map<String, IndicesStats> indices;

	private final ShardStatistics shards;

	private final IndicesStats all;

	// ---------------------------------------------------------------------------------------------

	private IndicesStatsResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.all = ApiTypeHelper.requireNonNull(builder.all, this, "all");

	}

	public static IndicesStatsResponse of(Function<Builder, ObjectBuilder<IndicesStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code indices}
	 */
	public final Map<String, IndicesStats> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code _all}
	 */
	public final IndicesStats all() {
		return this.all;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, IndicesStats> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndicesStatsResponse> {
		@Nullable
		private Map<String, IndicesStats> indices;

		private ShardStatistics shards;

		private IndicesStats all;

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, IndicesStats> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, IndicesStats value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key, Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return indices(key, fn.apply(new IndicesStats.Builder()).build());
		}

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

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(IndicesStats value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return this.all(fn.apply(new IndicesStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesStatsResponse build() {
			_checkSingleUse();

			return new IndicesStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesStatsResponse}
	 */
	public static final JsonpDeserializer<IndicesStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndicesStatsResponse::setupIndicesStatsResponseDeserializer);

	protected static void setupIndicesStatsResponseDeserializer(ObjectDeserializer<IndicesStatsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndicesStats._DESERIALIZER), "indices");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::all, IndicesStats._DESERIALIZER, "_all");

	}

}
