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

package co.elastic.clients.elasticsearch.indices.field_usage_stats;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
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
import java.util.HashMap;
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

// typedef: indices.field_usage_stats.FieldsUsageBody

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.field_usage_stats.FieldsUsageBody">API
 *      specification</a>
 */

public abstract class FieldsUsageBody implements JsonpSerializable {
	private final Map<String, UsageStatsIndex> stats;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	protected FieldsUsageBody(AbstractBuilder<?> builder) {

		this.stats = ApiTypeHelper.unmodifiable(builder.stats);

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	/**
	 * Per index statistics
	 */
	public final Map<String, UsageStatsIndex> stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
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

		for (Map.Entry<String, UsageStatsIndex> item0 : this.stats.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private Map<String, UsageStatsIndex> stats = new HashMap<>();

		/**
		 * Per index statistics
		 * <p>
		 * Adds all entries of <code>map</code> to <code>stats</code>.
		 */
		public final BuilderT stats(Map<String, UsageStatsIndex> map) {
			this.stats = _mapPutAll(this.stats, map);
			return self();
		}

		/**
		 * Per index statistics
		 * <p>
		 * Adds an entry to <code>stats</code>.
		 */
		public final BuilderT stats(String key, UsageStatsIndex value) {
			this.stats = _mapPut(this.stats, key, value);
			return self();
		}

		/**
		 * Per index statistics
		 * <p>
		 * Adds an entry to <code>stats</code> using a builder lambda.
		 */
		public final BuilderT stats(String key, Function<UsageStatsIndex.Builder, ObjectBuilder<UsageStatsIndex>> fn) {
			return stats(key, fn.apply(new UsageStatsIndex.Builder()).build());
		}

		private ShardStatistics shards;

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupFieldsUsageBodyDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.stats(name, UsageStatsIndex._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
