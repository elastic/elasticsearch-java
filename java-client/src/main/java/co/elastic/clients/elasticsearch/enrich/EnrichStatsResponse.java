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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.Response
@JsonpDeserializable
public class EnrichStatsResponse implements JsonpSerializable {
	private final List<CoordinatorStats> coordinatorStats;

	private final List<ExecutingPolicy> executingPolicies;

	private final List<CacheStats> cacheStats;

	// ---------------------------------------------------------------------------------------------

	private EnrichStatsResponse(Builder builder) {

		this.coordinatorStats = ModelTypeHelper.unmodifiableRequired(builder.coordinatorStats, this,
				"coordinatorStats");
		this.executingPolicies = ModelTypeHelper.unmodifiableRequired(builder.executingPolicies, this,
				"executingPolicies");
		this.cacheStats = ModelTypeHelper.unmodifiable(builder.cacheStats);

	}

	public static EnrichStatsResponse of(Function<Builder, ObjectBuilder<EnrichStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code coordinator_stats}
	 */
	public final List<CoordinatorStats> coordinatorStats() {
		return this.coordinatorStats;
	}

	/**
	 * Required - API name: {@code executing_policies}
	 */
	public final List<ExecutingPolicy> executingPolicies() {
		return this.executingPolicies;
	}

	/**
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

		if (ModelTypeHelper.isDefined(this.coordinatorStats)) {
			generator.writeKey("coordinator_stats");
			generator.writeStartArray();
			for (CoordinatorStats item0 : this.coordinatorStats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.executingPolicies)) {
			generator.writeKey("executing_policies");
			generator.writeStartArray();
			for (ExecutingPolicy item0 : this.executingPolicies) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cacheStats)) {
			generator.writeKey("cache_stats");
			generator.writeStartArray();
			for (CacheStats item0 : this.cacheStats) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichStatsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EnrichStatsResponse> {
		private List<CoordinatorStats> coordinatorStats;

		private List<ExecutingPolicy> executingPolicies;

		@Nullable
		private List<CacheStats> cacheStats;

		/**
		 * Required - API name: {@code coordinator_stats}
		 */
		public final Builder coordinatorStats(List<CoordinatorStats> value) {
			this.coordinatorStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code coordinator_stats}
		 */
		public final Builder coordinatorStats(CoordinatorStats... value) {
			this.coordinatorStats = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code coordinator_stats}
		 */
		@SafeVarargs
		public final Builder coordinatorStats(
				Function<CoordinatorStats.Builder, ObjectBuilder<CoordinatorStats>>... fns) {
			this.coordinatorStats = new ArrayList<>(fns.length);
			for (Function<CoordinatorStats.Builder, ObjectBuilder<CoordinatorStats>> fn : fns) {
				this.coordinatorStats.add(fn.apply(new CoordinatorStats.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code executing_policies}
		 */
		public final Builder executingPolicies(List<ExecutingPolicy> value) {
			this.executingPolicies = value;
			return this;
		}

		/**
		 * Required - API name: {@code executing_policies}
		 */
		public final Builder executingPolicies(ExecutingPolicy... value) {
			this.executingPolicies = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code executing_policies}
		 */
		@SafeVarargs
		public final Builder executingPolicies(
				Function<ExecutingPolicy.Builder, ObjectBuilder<ExecutingPolicy>>... fns) {
			this.executingPolicies = new ArrayList<>(fns.length);
			for (Function<ExecutingPolicy.Builder, ObjectBuilder<ExecutingPolicy>> fn : fns) {
				this.executingPolicies.add(fn.apply(new ExecutingPolicy.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code cache_stats}
		 */
		public final Builder cacheStats(@Nullable List<CacheStats> value) {
			this.cacheStats = value;
			return this;
		}

		/**
		 * API name: {@code cache_stats}
		 */
		public final Builder cacheStats(CacheStats... value) {
			this.cacheStats = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code cache_stats}
		 */
		@SafeVarargs
		public final Builder cacheStats(Function<CacheStats.Builder, ObjectBuilder<CacheStats>>... fns) {
			this.cacheStats = new ArrayList<>(fns.length);
			for (Function<CacheStats.Builder, ObjectBuilder<CacheStats>> fn : fns) {
				this.cacheStats.add(fn.apply(new CacheStats.Builder()).build());
			}
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
			.lazy(Builder::new, EnrichStatsResponse::setupEnrichStatsResponseDeserializer, Builder::build);

	protected static void setupEnrichStatsResponseDeserializer(DelegatingDeserializer<EnrichStatsResponse.Builder> op) {

		op.add(Builder::coordinatorStats, JsonpDeserializer.arrayDeserializer(CoordinatorStats._DESERIALIZER),
				"coordinator_stats");
		op.add(Builder::executingPolicies, JsonpDeserializer.arrayDeserializer(ExecutingPolicy._DESERIALIZER),
				"executing_policies");
		op.add(Builder::cacheStats, JsonpDeserializer.arrayDeserializer(CacheStats._DESERIALIZER), "cache_stats");

	}

}
