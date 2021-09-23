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

package co.elastic.clients.elasticsearch.xpack;

import co.elastic.clients.elasticsearch.xpack.usage.Analytics;
import co.elastic.clients.elasticsearch.xpack.usage.Base;
import co.elastic.clients.elasticsearch.xpack.usage.Ccr;
import co.elastic.clients.elasticsearch.xpack.usage.DataStreams;
import co.elastic.clients.elasticsearch.xpack.usage.DataTiers;
import co.elastic.clients.elasticsearch.xpack.usage.Eql;
import co.elastic.clients.elasticsearch.xpack.usage.Flattened;
import co.elastic.clients.elasticsearch.xpack.usage.FrozenIndices;
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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Response
public final class UsageResponse implements JsonpSerializable {
	private final Base aggregateMetric;

	private final Analytics analytics;

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

	private final Vector vectors;

	private final Base votingOnly;

	// ---------------------------------------------------------------------------------------------

	public UsageResponse(Builder builder) {

		this.aggregateMetric = Objects.requireNonNull(builder.aggregateMetric, "aggregate_metric");
		this.analytics = Objects.requireNonNull(builder.analytics, "analytics");
		this.watcher = Objects.requireNonNull(builder.watcher, "watcher");
		this.ccr = Objects.requireNonNull(builder.ccr, "ccr");
		this.dataFrame = builder.dataFrame;
		this.dataScience = builder.dataScience;
		this.dataStreams = builder.dataStreams;
		this.dataTiers = Objects.requireNonNull(builder.dataTiers, "data_tiers");
		this.enrich = builder.enrich;
		this.eql = Objects.requireNonNull(builder.eql, "eql");
		this.flattened = builder.flattened;
		this.frozenIndices = Objects.requireNonNull(builder.frozenIndices, "frozen_indices");
		this.graph = Objects.requireNonNull(builder.graph, "graph");
		this.ilm = Objects.requireNonNull(builder.ilm, "ilm");
		this.logstash = Objects.requireNonNull(builder.logstash, "logstash");
		this.ml = Objects.requireNonNull(builder.ml, "ml");
		this.monitoring = Objects.requireNonNull(builder.monitoring, "monitoring");
		this.rollup = Objects.requireNonNull(builder.rollup, "rollup");
		this.runtimeFields = builder.runtimeFields;
		this.spatial = Objects.requireNonNull(builder.spatial, "spatial");
		this.searchableSnapshots = Objects.requireNonNull(builder.searchableSnapshots, "searchable_snapshots");
		this.security = Objects.requireNonNull(builder.security, "security");
		this.slm = Objects.requireNonNull(builder.slm, "slm");
		this.sql = Objects.requireNonNull(builder.sql, "sql");
		this.transform = Objects.requireNonNull(builder.transform, "transform");
		this.vectors = Objects.requireNonNull(builder.vectors, "vectors");
		this.votingOnly = Objects.requireNonNull(builder.votingOnly, "voting_only");

	}

	/**
	 * API name: {@code aggregate_metric}
	 */
	public Base aggregateMetric() {
		return this.aggregateMetric;
	}

	/**
	 * API name: {@code analytics}
	 */
	public Analytics analytics() {
		return this.analytics;
	}

	/**
	 * API name: {@code watcher}
	 */
	public Watcher watcher() {
		return this.watcher;
	}

	/**
	 * API name: {@code ccr}
	 */
	public Ccr ccr() {
		return this.ccr;
	}

	/**
	 * API name: {@code data_frame}
	 */
	@Nullable
	public Base dataFrame() {
		return this.dataFrame;
	}

	/**
	 * API name: {@code data_science}
	 */
	@Nullable
	public Base dataScience() {
		return this.dataScience;
	}

	/**
	 * API name: {@code data_streams}
	 */
	@Nullable
	public DataStreams dataStreams() {
		return this.dataStreams;
	}

	/**
	 * API name: {@code data_tiers}
	 */
	public DataTiers dataTiers() {
		return this.dataTiers;
	}

	/**
	 * API name: {@code enrich}
	 */
	@Nullable
	public Base enrich() {
		return this.enrich;
	}

	/**
	 * API name: {@code eql}
	 */
	public Eql eql() {
		return this.eql;
	}

	/**
	 * API name: {@code flattened}
	 */
	@Nullable
	public Flattened flattened() {
		return this.flattened;
	}

	/**
	 * API name: {@code frozen_indices}
	 */
	public FrozenIndices frozenIndices() {
		return this.frozenIndices;
	}

	/**
	 * API name: {@code graph}
	 */
	public Base graph() {
		return this.graph;
	}

	/**
	 * API name: {@code ilm}
	 */
	public Ilm ilm() {
		return this.ilm;
	}

	/**
	 * API name: {@code logstash}
	 */
	public Base logstash() {
		return this.logstash;
	}

	/**
	 * API name: {@code ml}
	 */
	public MachineLearning ml() {
		return this.ml;
	}

	/**
	 * API name: {@code monitoring}
	 */
	public Monitoring monitoring() {
		return this.monitoring;
	}

	/**
	 * API name: {@code rollup}
	 */
	public Base rollup() {
		return this.rollup;
	}

	/**
	 * API name: {@code runtime_fields}
	 */
	@Nullable
	public RuntimeFieldTypes runtimeFields() {
		return this.runtimeFields;
	}

	/**
	 * API name: {@code spatial}
	 */
	public Base spatial() {
		return this.spatial;
	}

	/**
	 * API name: {@code searchable_snapshots}
	 */
	public SearchableSnapshots searchableSnapshots() {
		return this.searchableSnapshots;
	}

	/**
	 * API name: {@code security}
	 */
	public Security security() {
		return this.security;
	}

	/**
	 * API name: {@code slm}
	 */
	public Slm slm() {
		return this.slm;
	}

	/**
	 * API name: {@code sql}
	 */
	public Sql sql() {
		return this.sql;
	}

	/**
	 * API name: {@code transform}
	 */
	public Base transform() {
		return this.transform;
	}

	/**
	 * API name: {@code vectors}
	 */
	public Vector vectors() {
		return this.vectors;
	}

	/**
	 * API name: {@code voting_only}
	 */
	public Base votingOnly() {
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

		generator.writeKey("vectors");
		this.vectors.serialize(generator, mapper);

		generator.writeKey("voting_only");
		this.votingOnly.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UsageResponse}.
	 */
	public static class Builder implements ObjectBuilder<UsageResponse> {
		private Base aggregateMetric;

		private Analytics analytics;

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

		private Vector vectors;

		private Base votingOnly;

		/**
		 * API name: {@code aggregate_metric}
		 */
		public Builder aggregateMetric(Base value) {
			this.aggregateMetric = value;
			return this;
		}

		/**
		 * API name: {@code aggregate_metric}
		 */
		public Builder aggregateMetric(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.aggregateMetric(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code analytics}
		 */
		public Builder analytics(Analytics value) {
			this.analytics = value;
			return this;
		}

		/**
		 * API name: {@code analytics}
		 */
		public Builder analytics(Function<Analytics.Builder, ObjectBuilder<Analytics>> fn) {
			return this.analytics(fn.apply(new Analytics.Builder()).build());
		}

		/**
		 * API name: {@code watcher}
		 */
		public Builder watcher(Watcher value) {
			this.watcher = value;
			return this;
		}

		/**
		 * API name: {@code watcher}
		 */
		public Builder watcher(Function<Watcher.Builder, ObjectBuilder<Watcher>> fn) {
			return this.watcher(fn.apply(new Watcher.Builder()).build());
		}

		/**
		 * API name: {@code ccr}
		 */
		public Builder ccr(Ccr value) {
			this.ccr = value;
			return this;
		}

		/**
		 * API name: {@code ccr}
		 */
		public Builder ccr(Function<Ccr.Builder, ObjectBuilder<Ccr>> fn) {
			return this.ccr(fn.apply(new Ccr.Builder()).build());
		}

		/**
		 * API name: {@code data_frame}
		 */
		public Builder dataFrame(@Nullable Base value) {
			this.dataFrame = value;
			return this;
		}

		/**
		 * API name: {@code data_frame}
		 */
		public Builder dataFrame(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.dataFrame(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code data_science}
		 */
		public Builder dataScience(@Nullable Base value) {
			this.dataScience = value;
			return this;
		}

		/**
		 * API name: {@code data_science}
		 */
		public Builder dataScience(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.dataScience(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(@Nullable DataStreams value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(Function<DataStreams.Builder, ObjectBuilder<DataStreams>> fn) {
			return this.dataStreams(fn.apply(new DataStreams.Builder()).build());
		}

		/**
		 * API name: {@code data_tiers}
		 */
		public Builder dataTiers(DataTiers value) {
			this.dataTiers = value;
			return this;
		}

		/**
		 * API name: {@code data_tiers}
		 */
		public Builder dataTiers(Function<DataTiers.Builder, ObjectBuilder<DataTiers>> fn) {
			return this.dataTiers(fn.apply(new DataTiers.Builder()).build());
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(@Nullable Base value) {
			this.enrich = value;
			return this;
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.enrich(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code eql}
		 */
		public Builder eql(Eql value) {
			this.eql = value;
			return this;
		}

		/**
		 * API name: {@code eql}
		 */
		public Builder eql(Function<Eql.Builder, ObjectBuilder<Eql>> fn) {
			return this.eql(fn.apply(new Eql.Builder()).build());
		}

		/**
		 * API name: {@code flattened}
		 */
		public Builder flattened(@Nullable Flattened value) {
			this.flattened = value;
			return this;
		}

		/**
		 * API name: {@code flattened}
		 */
		public Builder flattened(Function<Flattened.Builder, ObjectBuilder<Flattened>> fn) {
			return this.flattened(fn.apply(new Flattened.Builder()).build());
		}

		/**
		 * API name: {@code frozen_indices}
		 */
		public Builder frozenIndices(FrozenIndices value) {
			this.frozenIndices = value;
			return this;
		}

		/**
		 * API name: {@code frozen_indices}
		 */
		public Builder frozenIndices(Function<FrozenIndices.Builder, ObjectBuilder<FrozenIndices>> fn) {
			return this.frozenIndices(fn.apply(new FrozenIndices.Builder()).build());
		}

		/**
		 * API name: {@code graph}
		 */
		public Builder graph(Base value) {
			this.graph = value;
			return this;
		}

		/**
		 * API name: {@code graph}
		 */
		public Builder graph(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.graph(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code ilm}
		 */
		public Builder ilm(Ilm value) {
			this.ilm = value;
			return this;
		}

		/**
		 * API name: {@code ilm}
		 */
		public Builder ilm(Function<Ilm.Builder, ObjectBuilder<Ilm>> fn) {
			return this.ilm(fn.apply(new Ilm.Builder()).build());
		}

		/**
		 * API name: {@code logstash}
		 */
		public Builder logstash(Base value) {
			this.logstash = value;
			return this;
		}

		/**
		 * API name: {@code logstash}
		 */
		public Builder logstash(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.logstash(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(MachineLearning value) {
			this.ml = value;
			return this;
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(Function<MachineLearning.Builder, ObjectBuilder<MachineLearning>> fn) {
			return this.ml(fn.apply(new MachineLearning.Builder()).build());
		}

		/**
		 * API name: {@code monitoring}
		 */
		public Builder monitoring(Monitoring value) {
			this.monitoring = value;
			return this;
		}

		/**
		 * API name: {@code monitoring}
		 */
		public Builder monitoring(Function<Monitoring.Builder, ObjectBuilder<Monitoring>> fn) {
			return this.monitoring(fn.apply(new Monitoring.Builder()).build());
		}

		/**
		 * API name: {@code rollup}
		 */
		public Builder rollup(Base value) {
			this.rollup = value;
			return this;
		}

		/**
		 * API name: {@code rollup}
		 */
		public Builder rollup(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.rollup(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public Builder runtimeFields(@Nullable RuntimeFieldTypes value) {
			this.runtimeFields = value;
			return this;
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public Builder runtimeFields(Function<RuntimeFieldTypes.Builder, ObjectBuilder<RuntimeFieldTypes>> fn) {
			return this.runtimeFields(fn.apply(new RuntimeFieldTypes.Builder()).build());
		}

		/**
		 * API name: {@code spatial}
		 */
		public Builder spatial(Base value) {
			this.spatial = value;
			return this;
		}

		/**
		 * API name: {@code spatial}
		 */
		public Builder spatial(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.spatial(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code searchable_snapshots}
		 */
		public Builder searchableSnapshots(SearchableSnapshots value) {
			this.searchableSnapshots = value;
			return this;
		}

		/**
		 * API name: {@code searchable_snapshots}
		 */
		public Builder searchableSnapshots(
				Function<SearchableSnapshots.Builder, ObjectBuilder<SearchableSnapshots>> fn) {
			return this.searchableSnapshots(fn.apply(new SearchableSnapshots.Builder()).build());
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(Security value) {
			this.security = value;
			return this;
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(Function<Security.Builder, ObjectBuilder<Security>> fn) {
			return this.security(fn.apply(new Security.Builder()).build());
		}

		/**
		 * API name: {@code slm}
		 */
		public Builder slm(Slm value) {
			this.slm = value;
			return this;
		}

		/**
		 * API name: {@code slm}
		 */
		public Builder slm(Function<Slm.Builder, ObjectBuilder<Slm>> fn) {
			return this.slm(fn.apply(new Slm.Builder()).build());
		}

		/**
		 * API name: {@code sql}
		 */
		public Builder sql(Sql value) {
			this.sql = value;
			return this;
		}

		/**
		 * API name: {@code sql}
		 */
		public Builder sql(Function<Sql.Builder, ObjectBuilder<Sql>> fn) {
			return this.sql(fn.apply(new Sql.Builder()).build());
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Base value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.transform(fn.apply(new Base.Builder()).build());
		}

		/**
		 * API name: {@code vectors}
		 */
		public Builder vectors(Vector value) {
			this.vectors = value;
			return this;
		}

		/**
		 * API name: {@code vectors}
		 */
		public Builder vectors(Function<Vector.Builder, ObjectBuilder<Vector>> fn) {
			return this.vectors(fn.apply(new Vector.Builder()).build());
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Base value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.votingOnly(fn.apply(new Base.Builder()).build());
		}

		/**
		 * Builds a {@link UsageResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UsageResponse build() {

			return new UsageResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UsageResponse}
	 */
	public static final JsonpDeserializer<UsageResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UsageResponse::setupUsageResponseDeserializer);

	protected static void setupUsageResponseDeserializer(DelegatingDeserializer<UsageResponse.Builder> op) {

		op.add(Builder::aggregateMetric, Base.DESERIALIZER, "aggregate_metric");
		op.add(Builder::analytics, Analytics.DESERIALIZER, "analytics");
		op.add(Builder::watcher, Watcher.DESERIALIZER, "watcher");
		op.add(Builder::ccr, Ccr.DESERIALIZER, "ccr");
		op.add(Builder::dataFrame, Base.DESERIALIZER, "data_frame");
		op.add(Builder::dataScience, Base.DESERIALIZER, "data_science");
		op.add(Builder::dataStreams, DataStreams.DESERIALIZER, "data_streams");
		op.add(Builder::dataTiers, DataTiers.DESERIALIZER, "data_tiers");
		op.add(Builder::enrich, Base.DESERIALIZER, "enrich");
		op.add(Builder::eql, Eql.DESERIALIZER, "eql");
		op.add(Builder::flattened, Flattened.DESERIALIZER, "flattened");
		op.add(Builder::frozenIndices, FrozenIndices.DESERIALIZER, "frozen_indices");
		op.add(Builder::graph, Base.DESERIALIZER, "graph");
		op.add(Builder::ilm, Ilm.DESERIALIZER, "ilm");
		op.add(Builder::logstash, Base.DESERIALIZER, "logstash");
		op.add(Builder::ml, MachineLearning.DESERIALIZER, "ml");
		op.add(Builder::monitoring, Monitoring.DESERIALIZER, "monitoring");
		op.add(Builder::rollup, Base.DESERIALIZER, "rollup");
		op.add(Builder::runtimeFields, RuntimeFieldTypes.DESERIALIZER, "runtime_fields");
		op.add(Builder::spatial, Base.DESERIALIZER, "spatial");
		op.add(Builder::searchableSnapshots, SearchableSnapshots.DESERIALIZER, "searchable_snapshots");
		op.add(Builder::security, Security.DESERIALIZER, "security");
		op.add(Builder::slm, Slm.DESERIALIZER, "slm");
		op.add(Builder::sql, Sql.DESERIALIZER, "sql");
		op.add(Builder::transform, Base.DESERIALIZER, "transform");
		op.add(Builder::vectors, Vector.DESERIALIZER, "vectors");
		op.add(Builder::votingOnly, Base.DESERIALIZER, "voting_only");

	}

}
