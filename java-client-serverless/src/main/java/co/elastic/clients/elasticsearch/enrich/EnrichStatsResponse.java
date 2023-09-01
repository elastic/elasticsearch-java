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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.elasticsearch.enrich.stats.CacheStats;
import co.elastic.clients.elasticsearch.enrich.stats.CoordinatorStats;
import co.elastic.clients.elasticsearch.enrich.stats.ExecutingPolicy;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#enrich.stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrichStatsResponse implements JsonpSerializable {
	private final List<CoordinatorStats> coordinatorStats;

	private final List<ExecutingPolicy> executingPolicies;

	private final List<CacheStats> cacheStats;

	// ---------------------------------------------------------------------------------------------

	private EnrichStatsResponse(Builder builder) {

		this.coordinatorStats = ApiTypeHelper.unmodifiableRequired(builder.coordinatorStats, this, "coordinatorStats");
		this.executingPolicies = ApiTypeHelper.unmodifiableRequired(builder.executingPolicies, this,
				"executingPolicies");
		this.cacheStats = ApiTypeHelper.unmodifiable(builder.cacheStats);

	}

	public static EnrichStatsResponse of(Function<Builder, ObjectBuilder<EnrichStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Objects containing information about each coordinating ingest node
	 * for configured enrich processors.
	 * <p>
	 * API name: {@code coordinator_stats}
	 */
	public final List<CoordinatorStats> coordinatorStats() {
		return this.coordinatorStats;
	}

	/**
	 * Required - Objects containing information about each enrich policy that is
	 * currently executing.
	 * <p>
	 * API name: {@code executing_policies}
	 */
	public final List<ExecutingPolicy> executingPolicies() {
		return this.executingPolicies;
	}

	/**
	 * Objects containing information about the enrich cache stats on each ingest
	 * node.
	 * <p>
	 * API name: {@code cache_stats}
	 */
	public final List<CacheStats> cacheStats() {
		return this.cacheStats;
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

		if (ApiTypeHelper.isDefined(this.coordinatorStats)) {
			generator.writeKey("coordinator_stats");
			generator.writeStartArray();
			for (CoordinatorStats item0 : this.coordinatorStats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.executingPolicies)) {
			generator.writeKey("executing_policies");
			generator.writeStartArray();
			for (ExecutingPolicy item0 : this.executingPolicies) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.cacheStats)) {
			generator.writeKey("cache_stats");
			generator.writeStartArray();
			for (CacheStats item0 : this.cacheStats) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link EnrichStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EnrichStatsResponse> {
		private List<CoordinatorStats> coordinatorStats;

		private List<ExecutingPolicy> executingPolicies;

		@Nullable
		private List<CacheStats> cacheStats;

		/**
		 * Required - Objects containing information about each coordinating ingest node
		 * for configured enrich processors.
		 * <p>
		 * API name: {@code coordinator_stats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>coordinatorStats</code>.
		 */
		public final Builder coordinatorStats(List<CoordinatorStats> list) {
			this.coordinatorStats = _listAddAll(this.coordinatorStats, list);
			return this;
		}

		/**
		 * Required - Objects containing information about each coordinating ingest node
		 * for configured enrich processors.
		 * <p>
		 * API name: {@code coordinator_stats}
		 * <p>
		 * Adds one or more values to <code>coordinatorStats</code>.
		 */
		public final Builder coordinatorStats(CoordinatorStats value, CoordinatorStats... values) {
			this.coordinatorStats = _listAdd(this.coordinatorStats, value, values);
			return this;
		}

		/**
		 * Required - Objects containing information about each coordinating ingest node
		 * for configured enrich processors.
		 * <p>
		 * API name: {@code coordinator_stats}
		 * <p>
		 * Adds a value to <code>coordinatorStats</code> using a builder lambda.
		 */
		public final Builder coordinatorStats(Function<CoordinatorStats.Builder, ObjectBuilder<CoordinatorStats>> fn) {
			return coordinatorStats(fn.apply(new CoordinatorStats.Builder()).build());
		}

		/**
		 * Required - Objects containing information about each enrich policy that is
		 * currently executing.
		 * <p>
		 * API name: {@code executing_policies}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>executingPolicies</code>.
		 */
		public final Builder executingPolicies(List<ExecutingPolicy> list) {
			this.executingPolicies = _listAddAll(this.executingPolicies, list);
			return this;
		}

		/**
		 * Required - Objects containing information about each enrich policy that is
		 * currently executing.
		 * <p>
		 * API name: {@code executing_policies}
		 * <p>
		 * Adds one or more values to <code>executingPolicies</code>.
		 */
		public final Builder executingPolicies(ExecutingPolicy value, ExecutingPolicy... values) {
			this.executingPolicies = _listAdd(this.executingPolicies, value, values);
			return this;
		}

		/**
		 * Required - Objects containing information about each enrich policy that is
		 * currently executing.
		 * <p>
		 * API name: {@code executing_policies}
		 * <p>
		 * Adds a value to <code>executingPolicies</code> using a builder lambda.
		 */
		public final Builder executingPolicies(Function<ExecutingPolicy.Builder, ObjectBuilder<ExecutingPolicy>> fn) {
			return executingPolicies(fn.apply(new ExecutingPolicy.Builder()).build());
		}

		/**
		 * Objects containing information about the enrich cache stats on each ingest
		 * node.
		 * <p>
		 * API name: {@code cache_stats}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cacheStats</code>.
		 */
		public final Builder cacheStats(List<CacheStats> list) {
			this.cacheStats = _listAddAll(this.cacheStats, list);
			return this;
		}

		/**
		 * Objects containing information about the enrich cache stats on each ingest
		 * node.
		 * <p>
		 * API name: {@code cache_stats}
		 * <p>
		 * Adds one or more values to <code>cacheStats</code>.
		 */
		public final Builder cacheStats(CacheStats value, CacheStats... values) {
			this.cacheStats = _listAdd(this.cacheStats, value, values);
			return this;
		}

		/**
		 * Objects containing information about the enrich cache stats on each ingest
		 * node.
		 * <p>
		 * API name: {@code cache_stats}
		 * <p>
		 * Adds a value to <code>cacheStats</code> using a builder lambda.
		 */
		public final Builder cacheStats(Function<CacheStats.Builder, ObjectBuilder<CacheStats>> fn) {
			return cacheStats(fn.apply(new CacheStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrichStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichStatsResponse build() {
			_checkSingleUse();

			return new EnrichStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichStatsResponse}
	 */
	public static final JsonpDeserializer<EnrichStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EnrichStatsResponse::setupEnrichStatsResponseDeserializer);

	protected static void setupEnrichStatsResponseDeserializer(ObjectDeserializer<EnrichStatsResponse.Builder> op) {

		op.add(Builder::coordinatorStats, JsonpDeserializer.arrayDeserializer(CoordinatorStats._DESERIALIZER),
				"coordinator_stats");
		op.add(Builder::executingPolicies, JsonpDeserializer.arrayDeserializer(ExecutingPolicy._DESERIALIZER),
				"executing_policies");
		op.add(Builder::cacheStats, JsonpDeserializer.arrayDeserializer(CacheStats._DESERIALIZER), "cache_stats");

	}

}
