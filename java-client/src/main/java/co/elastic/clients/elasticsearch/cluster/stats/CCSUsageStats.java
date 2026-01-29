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
import java.lang.Double;
import java.lang.Integer;
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

// typedef: cluster.stats.CCSUsageStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cluster.stats.CCSUsageStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CCSUsageStats implements JsonpSerializable {
	private final int total;

	private final int success;

	private final int skipped;

	private final CCSUsageTimeValue took;

	@Nullable
	private final CCSUsageTimeValue tookMrtTrue;

	@Nullable
	private final CCSUsageTimeValue tookMrtFalse;

	private final int remotesPerSearchMax;

	private final double remotesPerSearchAvg;

	private final Map<String, Integer> failureReasons;

	private final Map<String, Integer> features;

	private final Map<String, Integer> clients;

	private final Map<String, CCSUsageClusterStats> clusters;

	// ---------------------------------------------------------------------------------------------

	private CCSUsageStats(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total", 0);
		this.success = ApiTypeHelper.requireNonNull(builder.success, this, "success", 0);
		this.skipped = ApiTypeHelper.requireNonNull(builder.skipped, this, "skipped", 0);
		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");
		this.tookMrtTrue = builder.tookMrtTrue;
		this.tookMrtFalse = builder.tookMrtFalse;
		this.remotesPerSearchMax = ApiTypeHelper.requireNonNull(builder.remotesPerSearchMax, this,
				"remotesPerSearchMax", 0);
		this.remotesPerSearchAvg = ApiTypeHelper.requireNonNull(builder.remotesPerSearchAvg, this,
				"remotesPerSearchAvg", 0);
		this.failureReasons = ApiTypeHelper.unmodifiableRequired(builder.failureReasons, this, "failureReasons");
		this.features = ApiTypeHelper.unmodifiableRequired(builder.features, this, "features");
		this.clients = ApiTypeHelper.unmodifiableRequired(builder.clients, this, "clients");
		this.clusters = ApiTypeHelper.unmodifiableRequired(builder.clusters, this, "clusters");

	}

	public static CCSUsageStats of(Function<Builder, ObjectBuilder<CCSUsageStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The total number of cross-cluster search requests that have been
	 * executed by the cluster.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - The total number of cross-cluster search requests that have been
	 * successfully executed by the cluster.
	 * <p>
	 * API name: {@code success}
	 */
	public final int success() {
		return this.success;
	}

	/**
	 * Required - The total number of cross-cluster search requests (successful or
	 * failed) that had at least one remote cluster skipped.
	 * <p>
	 * API name: {@code skipped}
	 */
	public final int skipped() {
		return this.skipped;
	}

	/**
	 * Required - Statistics about the time taken to execute cross-cluster search
	 * requests.
	 * <p>
	 * API name: {@code took}
	 */
	public final CCSUsageTimeValue took() {
		return this.took;
	}

	/**
	 * Statistics about the time taken to execute cross-cluster search requests for
	 * which the <code>ccs_minimize_roundtrips</code> setting was set to
	 * <code>true</code>.
	 * <p>
	 * API name: {@code took_mrt_true}
	 */
	@Nullable
	public final CCSUsageTimeValue tookMrtTrue() {
		return this.tookMrtTrue;
	}

	/**
	 * Statistics about the time taken to execute cross-cluster search requests for
	 * which the <code>ccs_minimize_roundtrips</code> setting was set to
	 * <code>false</code>.
	 * <p>
	 * API name: {@code took_mrt_false}
	 */
	@Nullable
	public final CCSUsageTimeValue tookMrtFalse() {
		return this.tookMrtFalse;
	}

	/**
	 * Required - The maximum number of remote clusters that were queried in a
	 * single cross-cluster search request.
	 * <p>
	 * API name: {@code remotes_per_search_max}
	 */
	public final int remotesPerSearchMax() {
		return this.remotesPerSearchMax;
	}

	/**
	 * Required - The average number of remote clusters that were queried in a
	 * single cross-cluster search request.
	 * <p>
	 * API name: {@code remotes_per_search_avg}
	 */
	public final double remotesPerSearchAvg() {
		return this.remotesPerSearchAvg;
	}

	/**
	 * Required - Statistics about the reasons for cross-cluster search request
	 * failures. The keys are the failure reason names and the values are the number
	 * of requests that failed for that reason.
	 * <p>
	 * API name: {@code failure_reasons}
	 */
	public final Map<String, Integer> failureReasons() {
		return this.failureReasons;
	}

	/**
	 * Required - The keys are the names of the search feature, and the values are
	 * the number of requests that used that feature. Single request can use more
	 * than one feature (e.g. both <code>async</code> and <code>wildcard</code>).
	 * <p>
	 * API name: {@code features}
	 */
	public final Map<String, Integer> features() {
		return this.features;
	}

	/**
	 * Required - Statistics about the clients that executed cross-cluster search
	 * requests. The keys are the names of the clients, and the values are the
	 * number of requests that were executed by that client. Only known clients
	 * (such as <code>kibana</code> or <code>elasticsearch</code>) are counted.
	 * <p>
	 * API name: {@code clients}
	 */
	public final Map<String, Integer> clients() {
		return this.clients;
	}

	/**
	 * Required - Statistics about the clusters that were queried in cross-cluster
	 * search requests. The keys are cluster names, and the values are per-cluster
	 * telemetry data. This also includes the local cluster itself, which uses the
	 * name <code>(local)</code>.
	 * <p>
	 * API name: {@code clusters}
	 */
	public final Map<String, CCSUsageClusterStats> clusters() {
		return this.clusters;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("success");
		generator.write(this.success);

		generator.writeKey("skipped");
		generator.write(this.skipped);

		generator.writeKey("took");
		this.took.serialize(generator, mapper);

		if (this.tookMrtTrue != null) {
			generator.writeKey("took_mrt_true");
			this.tookMrtTrue.serialize(generator, mapper);

		}
		if (this.tookMrtFalse != null) {
			generator.writeKey("took_mrt_false");
			this.tookMrtFalse.serialize(generator, mapper);

		}
		generator.writeKey("remotes_per_search_max");
		generator.write(this.remotesPerSearchMax);

		generator.writeKey("remotes_per_search_avg");
		generator.write(this.remotesPerSearchAvg);

		if (ApiTypeHelper.isDefined(this.failureReasons)) {
			generator.writeKey("failure_reasons");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.failureReasons.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.features)) {
			generator.writeKey("features");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.features.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.clients)) {
			generator.writeKey("clients");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.clients.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.clusters)) {
			generator.writeKey("clusters");
			generator.writeStartObject();
			for (Map.Entry<String, CCSUsageClusterStats> item0 : this.clusters.entrySet()) {
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
	 * Builder for {@link CCSUsageStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CCSUsageStats> {
		private Integer total;

		private Integer success;

		private Integer skipped;

		private CCSUsageTimeValue took;

		@Nullable
		private CCSUsageTimeValue tookMrtTrue;

		@Nullable
		private CCSUsageTimeValue tookMrtFalse;

		private Integer remotesPerSearchMax;

		private Double remotesPerSearchAvg;

		private Map<String, Integer> failureReasons;

		private Map<String, Integer> features;

		private Map<String, Integer> clients;

		private Map<String, CCSUsageClusterStats> clusters;

		public Builder() {
		}
		private Builder(CCSUsageStats instance) {
			this.total = instance.total;
			this.success = instance.success;
			this.skipped = instance.skipped;
			this.took = instance.took;
			this.tookMrtTrue = instance.tookMrtTrue;
			this.tookMrtFalse = instance.tookMrtFalse;
			this.remotesPerSearchMax = instance.remotesPerSearchMax;
			this.remotesPerSearchAvg = instance.remotesPerSearchAvg;
			this.failureReasons = instance.failureReasons;
			this.features = instance.features;
			this.clients = instance.clients;
			this.clusters = instance.clusters;

		}
		/**
		 * Required - The total number of cross-cluster search requests that have been
		 * executed by the cluster.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - The total number of cross-cluster search requests that have been
		 * successfully executed by the cluster.
		 * <p>
		 * API name: {@code success}
		 */
		public final Builder success(int value) {
			this.success = value;
			return this;
		}

		/**
		 * Required - The total number of cross-cluster search requests (successful or
		 * failed) that had at least one remote cluster skipped.
		 * <p>
		 * API name: {@code skipped}
		 */
		public final Builder skipped(int value) {
			this.skipped = value;
			return this;
		}

		/**
		 * Required - Statistics about the time taken to execute cross-cluster search
		 * requests.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder took(CCSUsageTimeValue value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - Statistics about the time taken to execute cross-cluster search
		 * requests.
		 * <p>
		 * API name: {@code took}
		 */
		public final Builder took(Function<CCSUsageTimeValue.Builder, ObjectBuilder<CCSUsageTimeValue>> fn) {
			return this.took(fn.apply(new CCSUsageTimeValue.Builder()).build());
		}

		/**
		 * Statistics about the time taken to execute cross-cluster search requests for
		 * which the <code>ccs_minimize_roundtrips</code> setting was set to
		 * <code>true</code>.
		 * <p>
		 * API name: {@code took_mrt_true}
		 */
		public final Builder tookMrtTrue(@Nullable CCSUsageTimeValue value) {
			this.tookMrtTrue = value;
			return this;
		}

		/**
		 * Statistics about the time taken to execute cross-cluster search requests for
		 * which the <code>ccs_minimize_roundtrips</code> setting was set to
		 * <code>true</code>.
		 * <p>
		 * API name: {@code took_mrt_true}
		 */
		public final Builder tookMrtTrue(Function<CCSUsageTimeValue.Builder, ObjectBuilder<CCSUsageTimeValue>> fn) {
			return this.tookMrtTrue(fn.apply(new CCSUsageTimeValue.Builder()).build());
		}

		/**
		 * Statistics about the time taken to execute cross-cluster search requests for
		 * which the <code>ccs_minimize_roundtrips</code> setting was set to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code took_mrt_false}
		 */
		public final Builder tookMrtFalse(@Nullable CCSUsageTimeValue value) {
			this.tookMrtFalse = value;
			return this;
		}

		/**
		 * Statistics about the time taken to execute cross-cluster search requests for
		 * which the <code>ccs_minimize_roundtrips</code> setting was set to
		 * <code>false</code>.
		 * <p>
		 * API name: {@code took_mrt_false}
		 */
		public final Builder tookMrtFalse(Function<CCSUsageTimeValue.Builder, ObjectBuilder<CCSUsageTimeValue>> fn) {
			return this.tookMrtFalse(fn.apply(new CCSUsageTimeValue.Builder()).build());
		}

		/**
		 * Required - The maximum number of remote clusters that were queried in a
		 * single cross-cluster search request.
		 * <p>
		 * API name: {@code remotes_per_search_max}
		 */
		public final Builder remotesPerSearchMax(int value) {
			this.remotesPerSearchMax = value;
			return this;
		}

		/**
		 * Required - The average number of remote clusters that were queried in a
		 * single cross-cluster search request.
		 * <p>
		 * API name: {@code remotes_per_search_avg}
		 */
		public final Builder remotesPerSearchAvg(double value) {
			this.remotesPerSearchAvg = value;
			return this;
		}

		/**
		 * Required - Statistics about the reasons for cross-cluster search request
		 * failures. The keys are the failure reason names and the values are the number
		 * of requests that failed for that reason.
		 * <p>
		 * API name: {@code failure_reasons}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>failureReasons</code>.
		 */
		public final Builder failureReasons(Map<String, Integer> map) {
			this.failureReasons = _mapPutAll(this.failureReasons, map);
			return this;
		}

		/**
		 * Required - Statistics about the reasons for cross-cluster search request
		 * failures. The keys are the failure reason names and the values are the number
		 * of requests that failed for that reason.
		 * <p>
		 * API name: {@code failure_reasons}
		 * <p>
		 * Adds an entry to <code>failureReasons</code>.
		 */
		public final Builder failureReasons(String key, Integer value) {
			this.failureReasons = _mapPut(this.failureReasons, key, value);
			return this;
		}

		/**
		 * Required - The keys are the names of the search feature, and the values are
		 * the number of requests that used that feature. Single request can use more
		 * than one feature (e.g. both <code>async</code> and <code>wildcard</code>).
		 * <p>
		 * API name: {@code features}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>features</code>.
		 */
		public final Builder features(Map<String, Integer> map) {
			this.features = _mapPutAll(this.features, map);
			return this;
		}

		/**
		 * Required - The keys are the names of the search feature, and the values are
		 * the number of requests that used that feature. Single request can use more
		 * than one feature (e.g. both <code>async</code> and <code>wildcard</code>).
		 * <p>
		 * API name: {@code features}
		 * <p>
		 * Adds an entry to <code>features</code>.
		 */
		public final Builder features(String key, Integer value) {
			this.features = _mapPut(this.features, key, value);
			return this;
		}

		/**
		 * Required - Statistics about the clients that executed cross-cluster search
		 * requests. The keys are the names of the clients, and the values are the
		 * number of requests that were executed by that client. Only known clients
		 * (such as <code>kibana</code> or <code>elasticsearch</code>) are counted.
		 * <p>
		 * API name: {@code clients}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>clients</code>.
		 */
		public final Builder clients(Map<String, Integer> map) {
			this.clients = _mapPutAll(this.clients, map);
			return this;
		}

		/**
		 * Required - Statistics about the clients that executed cross-cluster search
		 * requests. The keys are the names of the clients, and the values are the
		 * number of requests that were executed by that client. Only known clients
		 * (such as <code>kibana</code> or <code>elasticsearch</code>) are counted.
		 * <p>
		 * API name: {@code clients}
		 * <p>
		 * Adds an entry to <code>clients</code>.
		 */
		public final Builder clients(String key, Integer value) {
			this.clients = _mapPut(this.clients, key, value);
			return this;
		}

		/**
		 * Required - Statistics about the clusters that were queried in cross-cluster
		 * search requests. The keys are cluster names, and the values are per-cluster
		 * telemetry data. This also includes the local cluster itself, which uses the
		 * name <code>(local)</code>.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>clusters</code>.
		 */
		public final Builder clusters(Map<String, CCSUsageClusterStats> map) {
			this.clusters = _mapPutAll(this.clusters, map);
			return this;
		}

		/**
		 * Required - Statistics about the clusters that were queried in cross-cluster
		 * search requests. The keys are cluster names, and the values are per-cluster
		 * telemetry data. This also includes the local cluster itself, which uses the
		 * name <code>(local)</code>.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds an entry to <code>clusters</code>.
		 */
		public final Builder clusters(String key, CCSUsageClusterStats value) {
			this.clusters = _mapPut(this.clusters, key, value);
			return this;
		}

		/**
		 * Required - Statistics about the clusters that were queried in cross-cluster
		 * search requests. The keys are cluster names, and the values are per-cluster
		 * telemetry data. This also includes the local cluster itself, which uses the
		 * name <code>(local)</code>.
		 * <p>
		 * API name: {@code clusters}
		 * <p>
		 * Adds an entry to <code>clusters</code> using a builder lambda.
		 */
		public final Builder clusters(String key,
				Function<CCSUsageClusterStats.Builder, ObjectBuilder<CCSUsageClusterStats>> fn) {
			return clusters(key, fn.apply(new CCSUsageClusterStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CCSUsageStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CCSUsageStats build() {
			_checkSingleUse();

			return new CCSUsageStats(this);
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
	 * Json deserializer for {@link CCSUsageStats}
	 */
	public static final JsonpDeserializer<CCSUsageStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CCSUsageStats::setupCCSUsageStatsDeserializer);

	protected static void setupCCSUsageStatsDeserializer(ObjectDeserializer<CCSUsageStats.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::success, JsonpDeserializer.integerDeserializer(), "success");
		op.add(Builder::skipped, JsonpDeserializer.integerDeserializer(), "skipped");
		op.add(Builder::took, CCSUsageTimeValue._DESERIALIZER, "took");
		op.add(Builder::tookMrtTrue, CCSUsageTimeValue._DESERIALIZER, "took_mrt_true");
		op.add(Builder::tookMrtFalse, CCSUsageTimeValue._DESERIALIZER, "took_mrt_false");
		op.add(Builder::remotesPerSearchMax, JsonpDeserializer.integerDeserializer(), "remotes_per_search_max");
		op.add(Builder::remotesPerSearchAvg, JsonpDeserializer.doubleDeserializer(), "remotes_per_search_avg");
		op.add(Builder::failureReasons,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()), "failure_reasons");
		op.add(Builder::features, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"features");
		op.add(Builder::clients, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"clients");
		op.add(Builder::clusters, JsonpDeserializer.stringMapDeserializer(CCSUsageClusterStats._DESERIALIZER),
				"clusters");

	}

}
