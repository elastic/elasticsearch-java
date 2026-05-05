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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.CCSStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cluster.stats.CCSStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CCSStats implements JsonpSerializable {
	private final Map<String, RemoteClusterInfo> clusters;

	private final CCSUsageStats search;

	@Nullable
	private final CCSUsageStats esql;

	// ---------------------------------------------------------------------------------------------

	private CCSStats(Builder builder) {

		this.clusters = ApiTypeHelper.unmodifiable(builder.clusters);
		this.search = ApiTypeHelper.requireNonNull(builder.search, this, "search");
		this.esql = builder.esql;

	}

	public static CCSStats of(Function<Builder, ObjectBuilder<CCSStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Contains remote cluster settings and metrics collected from them. The keys
	 * are cluster names, and the values are per-cluster data. Only present if
	 * <code>include_remotes</code> option is set to true.
	 * <p>
	 * API name: {@code clusters}
	 */
	public final Map<String, RemoteClusterInfo> clusters() {
		return this.clusters;
	}

	/**
	 * Required - Information about cross-cluster search usage.
	 * <p>
	 * API name: {@code _search}
	 */
	public final CCSUsageStats search() {
		return this.search;
	}

	/**
	 * Information about ES|QL cross-cluster query usage.
	 * <p>
	 * API name: {@code _esql}
	 */
	@Nullable
	public final CCSUsageStats esql() {
		return this.esql;
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

		if (ApiTypeHelper.isDefined(this.clusters)) {
			generator.writeKey("clusters");
			generator.writeStartObject();
			for (Map.Entry<String, RemoteClusterInfo> item0 : this.clusters.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("_search");
		this.search.serialize(generator, mapper);

		if (this.esql != null) {
			generator.writeKey("_esql");
			this.esql.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CCSStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CCSStats> {
		@Nullable
		private Map<String, RemoteClusterInfo> clusters;

		private CCSUsageStats search;

		@Nullable
		private CCSUsageStats esql;

		public Builder() {
		}
		private Builder(CCSStats instance) {
			this.clusters = instance.clusters;
			this.search = instance.search;
			this.esql = instance.esql;

		}
		/**
		 * Contains remote cluster settings and metrics collected from them. The keys
		 * are cluster names, and the values are per-cluster data. Only present if
		 * <code>include_remotes</code> option is set to true.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>clusters</code>.
		 */
		public final Builder clusters(Map<String, RemoteClusterInfo> map) {
			this.clusters = _mapPutAll(this.clusters, map);
			return this;
		}

		/**
		 * Contains remote cluster settings and metrics collected from them. The keys
		 * are cluster names, and the values are per-cluster data. Only present if
		 * <code>include_remotes</code> option is set to true.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds an entry to <code>clusters</code>.
		 */
		public final Builder clusters(String key, RemoteClusterInfo value) {
			this.clusters = _mapPut(this.clusters, key, value);
			return this;
		}

		/**
		 * Contains remote cluster settings and metrics collected from them. The keys
		 * are cluster names, and the values are per-cluster data. Only present if
		 * <code>include_remotes</code> option is set to true.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds an entry to <code>clusters</code> using a builder lambda.
		 */
		public final Builder clusters(String key,
				Function<RemoteClusterInfo.Builder, ObjectBuilder<RemoteClusterInfo>> fn) {
			return clusters(key, fn.apply(new RemoteClusterInfo.Builder()).build());
		}

		/**
		 * Required - Information about cross-cluster search usage.
		 * <p>
		 * API name: {@code _search}
		 */
		public final Builder search(CCSUsageStats value) {
			this.search = value;
			return this;
		}

		/**
		 * Required - Information about cross-cluster search usage.
		 * <p>
		 * API name: {@code _search}
		 */
		public final Builder search(Function<CCSUsageStats.Builder, ObjectBuilder<CCSUsageStats>> fn) {
			return this.search(fn.apply(new CCSUsageStats.Builder()).build());
		}

		/**
		 * Information about ES|QL cross-cluster query usage.
		 * <p>
		 * API name: {@code _esql}
		 */
		public final Builder esql(@Nullable CCSUsageStats value) {
			this.esql = value;
			return this;
		}

		/**
		 * Information about ES|QL cross-cluster query usage.
		 * <p>
		 * API name: {@code _esql}
		 */
		public final Builder esql(Function<CCSUsageStats.Builder, ObjectBuilder<CCSUsageStats>> fn) {
			return this.esql(fn.apply(new CCSUsageStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CCSStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CCSStats build() {
			_checkSingleUse();

			return new CCSStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CCSStats}
	 */
	public static final JsonpDeserializer<CCSStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CCSStats::setupCCSStatsDeserializer);

	protected static void setupCCSStatsDeserializer(ObjectDeserializer<CCSStats.Builder> op) {

		op.add(Builder::clusters, JsonpDeserializer.stringMapDeserializer(RemoteClusterInfo._DESERIALIZER), "clusters");
		op.add(Builder::search, CCSUsageStats._DESERIALIZER, "_search");
		op.add(Builder::esql, CCSUsageStats._DESERIALIZER, "_esql");

	}

}
