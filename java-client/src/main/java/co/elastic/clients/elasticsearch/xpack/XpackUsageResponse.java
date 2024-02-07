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

package co.elastic.clients.elasticsearch.xpack;

import co.elastic.clients.elasticsearch.xpack.usage.Analytics;
import co.elastic.clients.elasticsearch.xpack.usage.Archive;
import co.elastic.clients.elasticsearch.xpack.usage.Base;
import co.elastic.clients.elasticsearch.xpack.usage.Ccr;
import co.elastic.clients.elasticsearch.xpack.usage.DataStreams;
import co.elastic.clients.elasticsearch.xpack.usage.DataTiers;
import co.elastic.clients.elasticsearch.xpack.usage.Eql;
import co.elastic.clients.elasticsearch.xpack.usage.Flattened;
import co.elastic.clients.elasticsearch.xpack.usage.FrozenIndices;
import co.elastic.clients.elasticsearch.xpack.usage.HealthStatistics;
import co.elastic.clients.elasticsearch.xpack.usage.Ilm;
import co.elastic.clients.elasticsearch.xpack.usage.MachineLearning;
import co.elastic.clients.elasticsearch.xpack.usage.Monitoring;
import co.elastic.clients.elasticsearch.xpack.usage.RuntimeFieldTypes;
import co.elastic.clients.elasticsearch.xpack.usage.SearchableSnapshots;
import co.elastic.clients.elasticsearch.xpack.usage.Security;
import co.elastic.clients.elasticsearch.xpack.usage.Slm;
import co.elastic.clients.elasticsearch.xpack.usage.Sql;
import co.elastic.clients.elasticsearch.xpack.usage.Vector;
import co.elastic.clients.elasticsearch.xpack.usage.Watcher;
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

// typedef: xpack.usage.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#xpack.usage.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class XpackUsageResponse implements JsonpSerializable {
	private final Base aggregateMetric;

	private final Analytics analytics;

	private final Archive archive;

	private final Watcher watcher;

	private final Ccr ccr;

	@Nullable
	private final Base dataFrame;

	@Nullable
	private final Base dataScience;

	@Nullable
	private final DataStreams dataStreams;

	private final DataTiers dataTiers;

	@Nullable
	private final Base enrich;

	private final Eql eql;

	@Nullable
	private final Flattened flattened;

	private final FrozenIndices frozenIndices;

	private final Base graph;

	@Nullable
	private final HealthStatistics healthApi;

	private final Ilm ilm;

	private final Base logstash;

	private final MachineLearning ml;

	private final Monitoring monitoring;

	private final Base rollup;

	@Nullable
	private final RuntimeFieldTypes runtimeFields;

	private final Base spatial;

	private final SearchableSnapshots searchableSnapshots;

	private final Security security;

	private final Slm slm;

	private final Sql sql;

	private final Base transform;

	@Nullable
	private final Vector vectors;

	private final Base votingOnly;

	// ---------------------------------------------------------------------------------------------

	private XpackUsageResponse(Builder builder) {

		this.aggregateMetric = ApiTypeHelper.requireNonNull(builder.aggregateMetric, this, "aggregateMetric");
		this.analytics = ApiTypeHelper.requireNonNull(builder.analytics, this, "analytics");
		this.archive = ApiTypeHelper.requireNonNull(builder.archive, this, "archive");
		this.watcher = ApiTypeHelper.requireNonNull(builder.watcher, this, "watcher");
		this.ccr = ApiTypeHelper.requireNonNull(builder.ccr, this, "ccr");
		this.dataFrame = builder.dataFrame;
		this.dataScience = builder.dataScience;
		this.dataStreams = builder.dataStreams;
		this.dataTiers = ApiTypeHelper.requireNonNull(builder.dataTiers, this, "dataTiers");
		this.enrich = builder.enrich;
		this.eql = ApiTypeHelper.requireNonNull(builder.eql, this, "eql");
		this.flattened = builder.flattened;
		this.frozenIndices = ApiTypeHelper.requireNonNull(builder.frozenIndices, this, "frozenIndices");
		this.graph = ApiTypeHelper.requireNonNull(builder.graph, this, "graph");
		this.healthApi = builder.healthApi;
		this.ilm = ApiTypeHelper.requireNonNull(builder.ilm, this, "ilm");
		this.logstash = ApiTypeHelper.requireNonNull(builder.logstash, this, "logstash");
		this.ml = ApiTypeHelper.requireNonNull(builder.ml, this, "ml");
		this.monitoring = ApiTypeHelper.requireNonNull(builder.monitoring, this, "monitoring");
		this.rollup = ApiTypeHelper.requireNonNull(builder.rollup, this, "rollup");
		this.runtimeFields = builder.runtimeFields;
		this.spatial = ApiTypeHelper.requireNonNull(builder.spatial, this, "spatial");
		this.searchableSnapshots = ApiTypeHelper.requireNonNull(builder.searchableSnapshots, this,
				"searchableSnapshots");
		this.security = ApiTypeHelper.requireNonNull(builder.security, this, "security");
		this.slm = ApiTypeHelper.requireNonNull(builder.slm, this, "slm");
		this.sql = ApiTypeHelper.requireNonNull(builder.sql, this, "sql");
		this.transform = ApiTypeHelper.requireNonNull(builder.transform, this, "transform");
		this.vectors = builder.vectors;
		this.votingOnly = ApiTypeHelper.requireNonNull(builder.votingOnly, this, "votingOnly");

	}

	public static XpackUsageResponse of(Function<Builder, ObjectBuilder<XpackUsageResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aggregate_metric}
	 */
	public final Base aggregateMetric() {
		return this.aggregateMetric;
	}

	/**
	 * Required - API name: {@code analytics}
	 */
	public final Analytics analytics() {
		return this.analytics;
	}

	/**
	 * Required - API name: {@code archive}
	 */
	public final Archive archive() {
		return this.archive;
	}

	/**
	 * Required - API name: {@code watcher}
	 */
	public final Watcher watcher() {
		return this.watcher;
	}

	/**
	 * Required - API name: {@code ccr}
	 */
	public final Ccr ccr() {
		return this.ccr;
	}

	/**
	 * API name: {@code data_frame}
	 */
	@Nullable
	public final Base dataFrame() {
		return this.dataFrame;
	}

	/**
	 * API name: {@code data_science}
	 */
	@Nullable
	public final Base dataScience() {
		return this.dataScience;
	}

	/**
	 * API name: {@code data_streams}
	 */
	@Nullable
	public final DataStreams dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Required - API name: {@code data_tiers}
	 */
	public final DataTiers dataTiers() {
		return this.dataTiers;
	}

	/**
	 * API name: {@code enrich}
	 */
	@Nullable
	public final Base enrich() {
		return this.enrich;
	}

	/**
	 * Required - API name: {@code eql}
	 */
	public final Eql eql() {
		return this.eql;
	}

	/**
	 * API name: {@code flattened}
	 */
	@Nullable
	public final Flattened flattened() {
		return this.flattened;
	}

	/**
	 * Required - API name: {@code frozen_indices}
	 */
	public final FrozenIndices frozenIndices() {
		return this.frozenIndices;
	}

	/**
	 * Required - API name: {@code graph}
	 */
	public final Base graph() {
		return this.graph;
	}

	/**
	 * API name: {@code health_api}
	 */
	@Nullable
	public final HealthStatistics healthApi() {
		return this.healthApi;
	}

	/**
	 * Required - API name: {@code ilm}
	 */
	public final Ilm ilm() {
		return this.ilm;
	}

	/**
	 * Required - API name: {@code logstash}
	 */
	public final Base logstash() {
		return this.logstash;
	}

	/**
	 * Required - API name: {@code ml}
	 */
	public final MachineLearning ml() {
		return this.ml;
	}

	/**
	 * Required - API name: {@code monitoring}
	 */
	public final Monitoring monitoring() {
		return this.monitoring;
	}

	/**
	 * Required - API name: {@code rollup}
	 */
	public final Base rollup() {
		return this.rollup;
	}

	/**
	 * API name: {@code runtime_fields}
	 */
	@Nullable
	public final RuntimeFieldTypes runtimeFields() {
		return this.runtimeFields;
	}

	/**
	 * Required - API name: {@code spatial}
	 */
	public final Base spatial() {
		return this.spatial;
	}

	/**
	 * Required - API name: {@code searchable_snapshots}
	 */
	public final SearchableSnapshots searchableSnapshots() {
		return this.searchableSnapshots;
	}

	/**
	 * Required - API name: {@code security}
	 */
	public final Security security() {
		return this.security;
	}

	/**
	 * Required - API name: {@code slm}
	 */
	public final Slm slm() {
		return this.slm;
	}

	/**
	 * Required - API name: {@code sql}
	 */
	public final Sql sql() {
		return this.sql;
	}

	/**
	 * Required - API name: {@code transform}
	 */
	public final Base transform() {
		return this.transform;
	}

	/**
	 * API name: {@code vectors}
	 */
	@Nullable
	public final Vector vectors() {
		return this.vectors;
	}

	/**
	 * Required - API name: {@code voting_only}
	 */
	public final Base votingOnly() {
		return this.votingOnly;
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

		generator.writeKey("aggregate_metric");
		this.aggregateMetric.serialize(generator, mapper);

		generator.writeKey("analytics");
		this.analytics.serialize(generator, mapper);

		generator.writeKey("archive");
		this.archive.serialize(generator, mapper);

		generator.writeKey("watcher");
		this.watcher.serialize(generator, mapper);

		generator.writeKey("ccr");
		this.ccr.serialize(generator, mapper);

		if (this.dataFrame != null) {
			generator.writeKey("data_frame");
			this.dataFrame.serialize(generator, mapper);

		}
		if (this.dataScience != null) {
			generator.writeKey("data_science");
			this.dataScience.serialize(generator, mapper);

		}
		if (this.dataStreams != null) {
			generator.writeKey("data_streams");
			this.dataStreams.serialize(generator, mapper);

		}
		generator.writeKey("data_tiers");
		this.dataTiers.serialize(generator, mapper);

		if (this.enrich != null) {
			generator.writeKey("enrich");
			this.enrich.serialize(generator, mapper);

		}
		generator.writeKey("eql");
		this.eql.serialize(generator, mapper);

		if (this.flattened != null) {
			generator.writeKey("flattened");
			this.flattened.serialize(generator, mapper);

		}
		generator.writeKey("frozen_indices");
		this.frozenIndices.serialize(generator, mapper);

		generator.writeKey("graph");
		this.graph.serialize(generator, mapper);

		if (this.healthApi != null) {
			generator.writeKey("health_api");
			this.healthApi.serialize(generator, mapper);

		}
		generator.writeKey("ilm");
		this.ilm.serialize(generator, mapper);

		generator.writeKey("logstash");
		this.logstash.serialize(generator, mapper);

		generator.writeKey("ml");
		this.ml.serialize(generator, mapper);

		generator.writeKey("monitoring");
		this.monitoring.serialize(generator, mapper);

		generator.writeKey("rollup");
		this.rollup.serialize(generator, mapper);

		if (this.runtimeFields != null) {
			generator.writeKey("runtime_fields");
			this.runtimeFields.serialize(generator, mapper);

		}
		generator.writeKey("spatial");
		this.spatial.serialize(generator, mapper);

		generator.writeKey("searchable_snapshots");
		this.searchableSnapshots.serialize(generator, mapper);

		generator.writeKey("security");
		this.security.serialize(generator, mapper);

		generator.writeKey("slm");
		this.slm.serialize(generator, mapper);

		generator.writeKey("sql");
		this.sql.serialize(generator, mapper);

		generator.writeKey("transform");
		this.transform.serialize(generator, mapper);

		if (this.vectors != null) {
			generator.writeKey("vectors");
			this.vectors.serialize(generator, mapper);

		}
		generator.writeKey("voting_only");
		this.votingOnly.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackUsageResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<XpackUsageResponse> {
		private Base aggregateMetric;

		private Analytics analytics;

		private Archive archive;

		private Watcher watcher;

		private Ccr ccr;

		@Nullable
		private Base dataFrame;

		@Nullable
		private Base dataScience;

		@Nullable
		private DataStreams dataStreams;

		private DataTiers dataTiers;

		@Nullable
		private Base enrich;

		private Eql eql;

		@Nullable
		private Flattened flattened;

		private FrozenIndices frozenIndices;

		private Base graph;

		@Nullable
		private HealthStatistics healthApi;

		private Ilm ilm;

		private Base logstash;

		private MachineLearning ml;

		private Monitoring monitoring;

		private Base rollup;

		@Nullable
		private RuntimeFieldTypes runtimeFields;

		private Base spatial;

		private SearchableSnapshots searchableSnapshots;

		private Security security;

		private Slm slm;

		private Sql sql;

		private Base transform;

		@Nullable
		private Vector vectors;

		private Base votingOnly;

		/**
		 * Required - API name: {@code aggregate_metric}
		 */
		public final Builder aggregateMetric(Base value) {
			this.aggregateMetric = value;
			return this;
		}

		/**
		 * Required - API name: {@code aggregate_metric}
		 */
		public final Builder aggregateMetric(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.aggregateMetric(fn.apply(new Base.Builder()).build());
		}

		/**
		 * Required - API name: {@code analytics}
		 */
		public final Builder analytics(Analytics value) {
			this.analytics = value;
			return this;
		}

		/**
		 * Required - API name: {@code analytics}
		 */
		public final Builder analytics(Function<Analytics.Builder, ObjectBuilder<Analytics>> fn) {
			return this.analytics(fn.apply(new Analytics.Builder()).build());
		}

		/**
		 * Required - API name: {@code archive}
		 */
		public final Builder archive(Archive value) {
			this.archive = value;
			return this;
		}

		/**
		 * Required - API name: {@code archive}
		 */
		public final Builder archive(Function<Archive.Builder, ObjectBuilder<Archive>> fn) {
			return this.archive(fn.apply(new Archive.Builder()).build());
		}

		/**
		 * Required - API name: {@code watcher}
		 */
		public final Builder watcher(Watcher value) {
			this.watcher = value;
			return this;
		}

		/**
		 * Required - API name: {@code watcher}
		 */
		public final Builder watcher(Function<Watcher.Builder, ObjectBuilder<Watcher>> fn) {
			return this.watcher(fn.apply(new Watcher.Builder()).build());
		}

		/**
		 * Required - API name: {@code ccr}
		 */
		public final Builder ccr(Ccr value) {
			this.ccr = value;
			return this;
		}

		/**
		 * Required - API name: {@code ccr}
		 */
		public final Builder ccr(Function<Ccr.Builder, ObjectBuilder<Ccr>> fn) {
			return this.ccr(fn.apply(new Ccr.Builder()).build());
		}

		/**
		 * API name: {@code data_frame}
		 */
		public final Builder dataFrame(@Nullable Base value) {
			this.dataFrame = value;
			return this;
		}

		/**
		 * API name: {@code data_frame}
		 */
		public final Builder dataFrame(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.dataFrame(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code data_science}
		 */
		public final Builder dataScience(@Nullable Base value) {
			this.dataScience = value;
			return this;
		}

		/**
		 * API name: {@code data_science}
		 */
		public final Builder dataScience(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.dataScience(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code data_streams}
		 */
		public final Builder dataStreams(@Nullable DataStreams value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public final Builder dataStreams(Function<DataStreams.Builder, ObjectBuilder<DataStreams>> fn) {
			return this.dataStreams(fn.apply(new DataStreams.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_tiers}
		 */
		public final Builder dataTiers(DataTiers value) {
			this.dataTiers = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_tiers}
		 */
		public final Builder dataTiers(Function<DataTiers.Builder, ObjectBuilder<DataTiers>> fn) {
			return this.dataTiers(fn.apply(new DataTiers.Builder()).build());
		}

		/**
		 * API name: {@code enrich}
		 */
		public final Builder enrich(@Nullable Base value) {
			this.enrich = value;
			return this;
		}

		/**
		 * API name: {@code enrich}
		 */
		public final Builder enrich(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.enrich(fn.apply(new Base.Builder()).build());
		}

		/**
		 * Required - API name: {@code eql}
		 */
		public final Builder eql(Eql value) {
			this.eql = value;
			return this;
		}

		/**
		 * Required - API name: {@code eql}
		 */
		public final Builder eql(Function<Eql.Builder, ObjectBuilder<Eql>> fn) {
			return this.eql(fn.apply(new Eql.Builder()).build());
		}

		/**
		 * API name: {@code flattened}
		 */
		public final Builder flattened(@Nullable Flattened value) {
			this.flattened = value;
			return this;
		}

		/**
		 * API name: {@code flattened}
		 */
		public final Builder flattened(Function<Flattened.Builder, ObjectBuilder<Flattened>> fn) {
			return this.flattened(fn.apply(new Flattened.Builder()).build());
		}

		/**
		 * Required - API name: {@code frozen_indices}
		 */
		public final Builder frozenIndices(FrozenIndices value) {
			this.frozenIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code frozen_indices}
		 */
		public final Builder frozenIndices(Function<FrozenIndices.Builder, ObjectBuilder<FrozenIndices>> fn) {
			return this.frozenIndices(fn.apply(new FrozenIndices.Builder()).build());
		}

		/**
		 * Required - API name: {@code graph}
		 */
		public final Builder graph(Base value) {
			this.graph = value;
			return this;
		}

		/**
		 * Required - API name: {@code graph}
		 */
		public final Builder graph(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.graph(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code health_api}
		 */
		public final Builder healthApi(@Nullable HealthStatistics value) {
			this.healthApi = value;
			return this;
		}

		/**
		 * API name: {@code health_api}
		 */
		public final Builder healthApi(Function<HealthStatistics.Builder, ObjectBuilder<HealthStatistics>> fn) {
			return this.healthApi(fn.apply(new HealthStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code ilm}
		 */
		public final Builder ilm(Ilm value) {
			this.ilm = value;
			return this;
		}

		/**
		 * Required - API name: {@code ilm}
		 */
		public final Builder ilm(Function<Ilm.Builder, ObjectBuilder<Ilm>> fn) {
			return this.ilm(fn.apply(new Ilm.Builder()).build());
		}

		/**
		 * Required - API name: {@code logstash}
		 */
		public final Builder logstash(Base value) {
			this.logstash = value;
			return this;
		}

		/**
		 * Required - API name: {@code logstash}
		 */
		public final Builder logstash(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.logstash(fn.apply(new Base.Builder()).build());
		}

		/**
		 * Required - API name: {@code ml}
		 */
		public final Builder ml(MachineLearning value) {
			this.ml = value;
			return this;
		}

		/**
		 * Required - API name: {@code ml}
		 */
		public final Builder ml(Function<MachineLearning.Builder, ObjectBuilder<MachineLearning>> fn) {
			return this.ml(fn.apply(new MachineLearning.Builder()).build());
		}

		/**
		 * Required - API name: {@code monitoring}
		 */
		public final Builder monitoring(Monitoring value) {
			this.monitoring = value;
			return this;
		}

		/**
		 * Required - API name: {@code monitoring}
		 */
		public final Builder monitoring(Function<Monitoring.Builder, ObjectBuilder<Monitoring>> fn) {
			return this.monitoring(fn.apply(new Monitoring.Builder()).build());
		}

		/**
		 * Required - API name: {@code rollup}
		 */
		public final Builder rollup(Base value) {
			this.rollup = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup}
		 */
		public final Builder rollup(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.rollup(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public final Builder runtimeFields(@Nullable RuntimeFieldTypes value) {
			this.runtimeFields = value;
			return this;
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public final Builder runtimeFields(Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return this.runtimeFields(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		/**
		 * Required - API name: {@code spatial}
		 */
		public final Builder spatial(Base value) {
			this.spatial = value;
			return this;
		}

		/**
		 * Required - API name: {@code spatial}
		 */
		public final Builder spatial(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.spatial(fn.apply(new Base.Builder()).build());
		}

		/**
		 * Required - API name: {@code searchable_snapshots}
		 */
		public final Builder searchableSnapshots(SearchableSnapshots value) {
			this.searchableSnapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code searchable_snapshots}
		 */
		public final Builder searchableSnapshots(
				Function<SearchableSnapshots.Builder, ObjectBuilder<SearchableSnapshots>> fn) {
			return this.searchableSnapshots(fn.apply(new SearchableSnapshots.Builder()).build());
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(Security value) {
			this.security = value;
			return this;
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(Function<Security.Builder, ObjectBuilder<Security>> fn) {
			return this.security(fn.apply(new Security.Builder()).build());
		}

		/**
		 * Required - API name: {@code slm}
		 */
		public final Builder slm(Slm value) {
			this.slm = value;
			return this;
		}

		/**
		 * Required - API name: {@code slm}
		 */
		public final Builder slm(Function<Slm.Builder, ObjectBuilder<Slm>> fn) {
			return this.slm(fn.apply(new Slm.Builder()).build());
		}

		/**
		 * Required - API name: {@code sql}
		 */
		public final Builder sql(Sql value) {
			this.sql = value;
			return this;
		}

		/**
		 * Required - API name: {@code sql}
		 */
		public final Builder sql(Function<Sql.Builder, ObjectBuilder<Sql>> fn) {
			return this.sql(fn.apply(new Sql.Builder()).build());
		}

		/**
		 * Required - API name: {@code transform}
		 */
		public final Builder transform(Base value) {
			this.transform = value;
			return this;
		}

		/**
		 * Required - API name: {@code transform}
		 */
		public final Builder transform(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.transform(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code vectors}
		 */
		public final Builder vectors(@Nullable Vector value) {
			this.vectors = value;
			return this;
		}

		/**
		 * API name: {@code vectors}
		 */
		public final Builder vectors(Function<Vector.Builder, ObjectBuilder<Vector>> fn) {
			return this.vectors(fn.apply(new Vector.Builder()).build());
		}

		/**
		 * Required - API name: {@code voting_only}
		 */
		public final Builder votingOnly(Base value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * Required - API name: {@code voting_only}
		 */
		public final Builder votingOnly(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.votingOnly(fn.apply(new Base.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link XpackUsageResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackUsageResponse build() {
			_checkSingleUse();

			return new XpackUsageResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link XpackUsageResponse}
	 */
	public static final JsonpDeserializer<XpackUsageResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, XpackUsageResponse::setupXpackUsageResponseDeserializer);

	protected static void setupXpackUsageResponseDeserializer(ObjectDeserializer<XpackUsageResponse.Builder> op) {

		op.add(Builder::aggregateMetric, Base._DESERIALIZER, "aggregate_metric");
		op.add(Builder::analytics, Analytics._DESERIALIZER, "analytics");
		op.add(Builder::archive, Archive._DESERIALIZER, "archive");
		op.add(Builder::watcher, Watcher._DESERIALIZER, "watcher");
		op.add(Builder::ccr, Ccr._DESERIALIZER, "ccr");
		op.add(Builder::dataFrame, Base._DESERIALIZER, "data_frame");
		op.add(Builder::dataScience, Base._DESERIALIZER, "data_science");
		op.add(Builder::dataStreams, DataStreams._DESERIALIZER, "data_streams");
		op.add(Builder::dataTiers, DataTiers._DESERIALIZER, "data_tiers");
		op.add(Builder::enrich, Base._DESERIALIZER, "enrich");
		op.add(Builder::eql, Eql._DESERIALIZER, "eql");
		op.add(Builder::flattened, Flattened._DESERIALIZER, "flattened");
		op.add(Builder::frozenIndices, FrozenIndices._DESERIALIZER, "frozen_indices");
		op.add(Builder::graph, Base._DESERIALIZER, "graph");
		op.add(Builder::healthApi, HealthStatistics._DESERIALIZER, "health_api");
		op.add(Builder::ilm, Ilm._DESERIALIZER, "ilm");
		op.add(Builder::logstash, Base._DESERIALIZER, "logstash");
		op.add(Builder::ml, MachineLearning._DESERIALIZER, "ml");
		op.add(Builder::monitoring, Monitoring._DESERIALIZER, "monitoring");
		op.add(Builder::rollup, Base._DESERIALIZER, "rollup");
		op.add(Builder::runtimeFields, RuntimeFieldTypes._DESERIALIZER, "runtime_fields");
		op.add(Builder::spatial, Base._DESERIALIZER, "spatial");
		op.add(Builder::searchableSnapshots, SearchableSnapshots._DESERIALIZER, "searchable_snapshots");
		op.add(Builder::security, Security._DESERIALIZER, "security");
		op.add(Builder::slm, Slm._DESERIALIZER, "slm");
		op.add(Builder::sql, Sql._DESERIALIZER, "sql");
		op.add(Builder::transform, Base._DESERIALIZER, "transform");
		op.add(Builder::vectors, Vector._DESERIALIZER, "vectors");
		op.add(Builder::votingOnly, Base._DESERIALIZER, "voting_only");

	}

}
