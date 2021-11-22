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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: xpack.usage.Response
@JsonpDeserializable
public class XpackUsageResponse implements JsonpSerializable {
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

	@Nullable
	private final Vector vectors;

	private final Base votingOnly;

	// ---------------------------------------------------------------------------------------------

	private XpackUsageResponse(Builder builder) {

		this.aggregateMetric = ModelTypeHelper.requireNonNull(builder.aggregateMetric, this, "aggregateMetric");
		this.analytics = ModelTypeHelper.requireNonNull(builder.analytics, this, "analytics");
		this.watcher = ModelTypeHelper.requireNonNull(builder.watcher, this, "watcher");
		this.ccr = ModelTypeHelper.requireNonNull(builder.ccr, this, "ccr");
		this.dataFrame = builder.dataFrame;
		this.dataScience = builder.dataScience;
		this.dataStreams = builder.dataStreams;
		this.dataTiers = ModelTypeHelper.requireNonNull(builder.dataTiers, this, "dataTiers");
		this.enrich = builder.enrich;
		this.eql = ModelTypeHelper.requireNonNull(builder.eql, this, "eql");
		this.flattened = builder.flattened;
		this.frozenIndices = ModelTypeHelper.requireNonNull(builder.frozenIndices, this, "frozenIndices");
		this.graph = ModelTypeHelper.requireNonNull(builder.graph, this, "graph");
		this.ilm = ModelTypeHelper.requireNonNull(builder.ilm, this, "ilm");
		this.logstash = ModelTypeHelper.requireNonNull(builder.logstash, this, "logstash");
		this.ml = ModelTypeHelper.requireNonNull(builder.ml, this, "ml");
		this.monitoring = ModelTypeHelper.requireNonNull(builder.monitoring, this, "monitoring");
		this.rollup = ModelTypeHelper.requireNonNull(builder.rollup, this, "rollup");
		this.runtimeFields = builder.runtimeFields;
		this.spatial = ModelTypeHelper.requireNonNull(builder.spatial, this, "spatial");
		this.searchableSnapshots = ModelTypeHelper.requireNonNull(builder.searchableSnapshots, this,
				"searchableSnapshots");
		this.security = ModelTypeHelper.requireNonNull(builder.security, this, "security");
		this.slm = ModelTypeHelper.requireNonNull(builder.slm, this, "slm");
		this.sql = ModelTypeHelper.requireNonNull(builder.sql, this, "sql");
		this.transform = ModelTypeHelper.requireNonNull(builder.transform, this, "transform");
		this.vectors = builder.vectors;
		this.votingOnly = ModelTypeHelper.requireNonNull(builder.votingOnly, this, "votingOnly");

	}

	public static XpackUsageResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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

		if (this.vectors != null) {
			generator.writeKey("vectors");
			this.vectors.serialize(generator, mapper);

		}
		generator.writeKey("voting_only");
		this.votingOnly.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackUsageResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<XpackUsageResponse> {
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
		public final Builder aggregateMetric(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.aggregateMetric(builder.build());
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
		public final Builder analytics(Consumer<Analytics.Builder> fn) {
			Analytics.Builder builder = new Analytics.Builder();
			fn.accept(builder);
			return this.analytics(builder.build());
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
		public final Builder watcher(Consumer<Watcher.Builder> fn) {
			Watcher.Builder builder = new Watcher.Builder();
			fn.accept(builder);
			return this.watcher(builder.build());
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
		public final Builder ccr(Consumer<Ccr.Builder> fn) {
			Ccr.Builder builder = new Ccr.Builder();
			fn.accept(builder);
			return this.ccr(builder.build());
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
		public final Builder dataFrame(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.dataFrame(builder.build());
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
		public final Builder dataScience(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.dataScience(builder.build());
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
		public final Builder dataStreams(Consumer<DataStreams.Builder> fn) {
			DataStreams.Builder builder = new DataStreams.Builder();
			fn.accept(builder);
			return this.dataStreams(builder.build());
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
		public final Builder dataTiers(Consumer<DataTiers.Builder> fn) {
			DataTiers.Builder builder = new DataTiers.Builder();
			fn.accept(builder);
			return this.dataTiers(builder.build());
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
		public final Builder enrich(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.enrich(builder.build());
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
		public final Builder eql(Consumer<Eql.Builder> fn) {
			Eql.Builder builder = new Eql.Builder();
			fn.accept(builder);
			return this.eql(builder.build());
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
		public final Builder flattened(Consumer<Flattened.Builder> fn) {
			Flattened.Builder builder = new Flattened.Builder();
			fn.accept(builder);
			return this.flattened(builder.build());
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
		public final Builder frozenIndices(Consumer<FrozenIndices.Builder> fn) {
			FrozenIndices.Builder builder = new FrozenIndices.Builder();
			fn.accept(builder);
			return this.frozenIndices(builder.build());
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
		public final Builder graph(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.graph(builder.build());
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
		public final Builder ilm(Consumer<Ilm.Builder> fn) {
			Ilm.Builder builder = new Ilm.Builder();
			fn.accept(builder);
			return this.ilm(builder.build());
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
		public final Builder logstash(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.logstash(builder.build());
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
		public final Builder ml(Consumer<MachineLearning.Builder> fn) {
			MachineLearning.Builder builder = new MachineLearning.Builder();
			fn.accept(builder);
			return this.ml(builder.build());
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
		public final Builder monitoring(Consumer<Monitoring.Builder> fn) {
			Monitoring.Builder builder = new Monitoring.Builder();
			fn.accept(builder);
			return this.monitoring(builder.build());
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
		public final Builder rollup(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.rollup(builder.build());
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
		public final Builder runtimeFields(Consumer<RuntimeFieldTypes.Builder> fn) {
			RuntimeFieldTypes.Builder builder = new RuntimeFieldTypes.Builder();
			fn.accept(builder);
			return this.runtimeFields(builder.build());
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
		public final Builder spatial(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.spatial(builder.build());
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
		public final Builder searchableSnapshots(Consumer<SearchableSnapshots.Builder> fn) {
			SearchableSnapshots.Builder builder = new SearchableSnapshots.Builder();
			fn.accept(builder);
			return this.searchableSnapshots(builder.build());
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
		public final Builder security(Consumer<Security.Builder> fn) {
			Security.Builder builder = new Security.Builder();
			fn.accept(builder);
			return this.security(builder.build());
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
		public final Builder slm(Consumer<Slm.Builder> fn) {
			Slm.Builder builder = new Slm.Builder();
			fn.accept(builder);
			return this.slm(builder.build());
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
		public final Builder sql(Consumer<Sql.Builder> fn) {
			Sql.Builder builder = new Sql.Builder();
			fn.accept(builder);
			return this.sql(builder.build());
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
		public final Builder transform(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.transform(builder.build());
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
		public final Builder vectors(Consumer<Vector.Builder> fn) {
			Vector.Builder builder = new Vector.Builder();
			fn.accept(builder);
			return this.vectors(builder.build());
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
		public final Builder votingOnly(Consumer<Base.Builder> fn) {
			Base.Builder builder = new Base.Builder();
			fn.accept(builder);
			return this.votingOnly(builder.build());
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
