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

package co.elastic.clients.elasticsearch.xpack.info;

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

// typedef: xpack.info.Features

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.info.Features">API
 *      specification</a>
 */
@JsonpDeserializable
public class Features implements JsonpSerializable {
	private final Feature aggregateMetric;

	private final Feature analytics;

	private final Feature ccr;

	@Nullable
	private final Feature dataFrame;

	@Nullable
	private final Feature dataScience;

	private final Feature dataStreams;

	private final Feature dataTiers;

	private final Feature enrich;

	private final Feature eql;

	@Nullable
	private final Feature flattened;

	private final Feature frozenIndices;

	private final Feature graph;

	private final Feature ilm;

	private final Feature logstash;

	private final Feature ml;

	private final Feature monitoring;

	private final Feature rollup;

	@Nullable
	private final Feature runtimeFields;

	private final Feature searchableSnapshots;

	private final Feature security;

	private final Feature slm;

	private final Feature spatial;

	private final Feature sql;

	private final Feature transform;

	@Nullable
	private final Feature vectors;

	private final Feature votingOnly;

	private final Feature watcher;

	private final Feature archive;

	// ---------------------------------------------------------------------------------------------

	private Features(Builder builder) {

		this.aggregateMetric = ApiTypeHelper.requireNonNull(builder.aggregateMetric, this, "aggregateMetric");
		this.analytics = ApiTypeHelper.requireNonNull(builder.analytics, this, "analytics");
		this.ccr = ApiTypeHelper.requireNonNull(builder.ccr, this, "ccr");
		this.dataFrame = builder.dataFrame;
		this.dataScience = builder.dataScience;
		this.dataStreams = ApiTypeHelper.requireNonNull(builder.dataStreams, this, "dataStreams");
		this.dataTiers = ApiTypeHelper.requireNonNull(builder.dataTiers, this, "dataTiers");
		this.enrich = ApiTypeHelper.requireNonNull(builder.enrich, this, "enrich");
		this.eql = ApiTypeHelper.requireNonNull(builder.eql, this, "eql");
		this.flattened = builder.flattened;
		this.frozenIndices = ApiTypeHelper.requireNonNull(builder.frozenIndices, this, "frozenIndices");
		this.graph = ApiTypeHelper.requireNonNull(builder.graph, this, "graph");
		this.ilm = ApiTypeHelper.requireNonNull(builder.ilm, this, "ilm");
		this.logstash = ApiTypeHelper.requireNonNull(builder.logstash, this, "logstash");
		this.ml = ApiTypeHelper.requireNonNull(builder.ml, this, "ml");
		this.monitoring = ApiTypeHelper.requireNonNull(builder.monitoring, this, "monitoring");
		this.rollup = ApiTypeHelper.requireNonNull(builder.rollup, this, "rollup");
		this.runtimeFields = builder.runtimeFields;
		this.searchableSnapshots = ApiTypeHelper.requireNonNull(builder.searchableSnapshots, this,
				"searchableSnapshots");
		this.security = ApiTypeHelper.requireNonNull(builder.security, this, "security");
		this.slm = ApiTypeHelper.requireNonNull(builder.slm, this, "slm");
		this.spatial = ApiTypeHelper.requireNonNull(builder.spatial, this, "spatial");
		this.sql = ApiTypeHelper.requireNonNull(builder.sql, this, "sql");
		this.transform = ApiTypeHelper.requireNonNull(builder.transform, this, "transform");
		this.vectors = builder.vectors;
		this.votingOnly = ApiTypeHelper.requireNonNull(builder.votingOnly, this, "votingOnly");
		this.watcher = ApiTypeHelper.requireNonNull(builder.watcher, this, "watcher");
		this.archive = ApiTypeHelper.requireNonNull(builder.archive, this, "archive");

	}

	public static Features of(Function<Builder, ObjectBuilder<Features>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aggregate_metric}
	 */
	public final Feature aggregateMetric() {
		return this.aggregateMetric;
	}

	/**
	 * Required - API name: {@code analytics}
	 */
	public final Feature analytics() {
		return this.analytics;
	}

	/**
	 * Required - API name: {@code ccr}
	 */
	public final Feature ccr() {
		return this.ccr;
	}

	/**
	 * API name: {@code data_frame}
	 */
	@Nullable
	public final Feature dataFrame() {
		return this.dataFrame;
	}

	/**
	 * API name: {@code data_science}
	 */
	@Nullable
	public final Feature dataScience() {
		return this.dataScience;
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public final Feature dataStreams() {
		return this.dataStreams;
	}

	/**
	 * Required - API name: {@code data_tiers}
	 */
	public final Feature dataTiers() {
		return this.dataTiers;
	}

	/**
	 * Required - API name: {@code enrich}
	 */
	public final Feature enrich() {
		return this.enrich;
	}

	/**
	 * Required - API name: {@code eql}
	 */
	public final Feature eql() {
		return this.eql;
	}

	/**
	 * API name: {@code flattened}
	 */
	@Nullable
	public final Feature flattened() {
		return this.flattened;
	}

	/**
	 * Required - API name: {@code frozen_indices}
	 */
	public final Feature frozenIndices() {
		return this.frozenIndices;
	}

	/**
	 * Required - API name: {@code graph}
	 */
	public final Feature graph() {
		return this.graph;
	}

	/**
	 * Required - API name: {@code ilm}
	 */
	public final Feature ilm() {
		return this.ilm;
	}

	/**
	 * Required - API name: {@code logstash}
	 */
	public final Feature logstash() {
		return this.logstash;
	}

	/**
	 * Required - API name: {@code ml}
	 */
	public final Feature ml() {
		return this.ml;
	}

	/**
	 * Required - API name: {@code monitoring}
	 */
	public final Feature monitoring() {
		return this.monitoring;
	}

	/**
	 * Required - API name: {@code rollup}
	 */
	public final Feature rollup() {
		return this.rollup;
	}

	/**
	 * API name: {@code runtime_fields}
	 */
	@Nullable
	public final Feature runtimeFields() {
		return this.runtimeFields;
	}

	/**
	 * Required - API name: {@code searchable_snapshots}
	 */
	public final Feature searchableSnapshots() {
		return this.searchableSnapshots;
	}

	/**
	 * Required - API name: {@code security}
	 */
	public final Feature security() {
		return this.security;
	}

	/**
	 * Required - API name: {@code slm}
	 */
	public final Feature slm() {
		return this.slm;
	}

	/**
	 * Required - API name: {@code spatial}
	 */
	public final Feature spatial() {
		return this.spatial;
	}

	/**
	 * Required - API name: {@code sql}
	 */
	public final Feature sql() {
		return this.sql;
	}

	/**
	 * Required - API name: {@code transform}
	 */
	public final Feature transform() {
		return this.transform;
	}

	/**
	 * API name: {@code vectors}
	 */
	@Nullable
	public final Feature vectors() {
		return this.vectors;
	}

	/**
	 * Required - API name: {@code voting_only}
	 */
	public final Feature votingOnly() {
		return this.votingOnly;
	}

	/**
	 * Required - API name: {@code watcher}
	 */
	public final Feature watcher() {
		return this.watcher;
	}

	/**
	 * Required - API name: {@code archive}
	 */
	public final Feature archive() {
		return this.archive;
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
		generator.writeKey("data_streams");
		this.dataStreams.serialize(generator, mapper);

		generator.writeKey("data_tiers");
		this.dataTiers.serialize(generator, mapper);

		generator.writeKey("enrich");
		this.enrich.serialize(generator, mapper);

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
		generator.writeKey("searchable_snapshots");
		this.searchableSnapshots.serialize(generator, mapper);

		generator.writeKey("security");
		this.security.serialize(generator, mapper);

		generator.writeKey("slm");
		this.slm.serialize(generator, mapper);

		generator.writeKey("spatial");
		this.spatial.serialize(generator, mapper);

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

		generator.writeKey("watcher");
		this.watcher.serialize(generator, mapper);

		generator.writeKey("archive");
		this.archive.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Features}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Features> {
		private Feature aggregateMetric;

		private Feature analytics;

		private Feature ccr;

		@Nullable
		private Feature dataFrame;

		@Nullable
		private Feature dataScience;

		private Feature dataStreams;

		private Feature dataTiers;

		private Feature enrich;

		private Feature eql;

		@Nullable
		private Feature flattened;

		private Feature frozenIndices;

		private Feature graph;

		private Feature ilm;

		private Feature logstash;

		private Feature ml;

		private Feature monitoring;

		private Feature rollup;

		@Nullable
		private Feature runtimeFields;

		private Feature searchableSnapshots;

		private Feature security;

		private Feature slm;

		private Feature spatial;

		private Feature sql;

		private Feature transform;

		@Nullable
		private Feature vectors;

		private Feature votingOnly;

		private Feature watcher;

		private Feature archive;

		/**
		 * Required - API name: {@code aggregate_metric}
		 */
		public final Builder aggregateMetric(Feature value) {
			this.aggregateMetric = value;
			return this;
		}

		/**
		 * Required - API name: {@code aggregate_metric}
		 */
		public final Builder aggregateMetric(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.aggregateMetric(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code analytics}
		 */
		public final Builder analytics(Feature value) {
			this.analytics = value;
			return this;
		}

		/**
		 * Required - API name: {@code analytics}
		 */
		public final Builder analytics(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.analytics(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code ccr}
		 */
		public final Builder ccr(Feature value) {
			this.ccr = value;
			return this;
		}

		/**
		 * Required - API name: {@code ccr}
		 */
		public final Builder ccr(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ccr(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_frame}
		 */
		public final Builder dataFrame(@Nullable Feature value) {
			this.dataFrame = value;
			return this;
		}

		/**
		 * API name: {@code data_frame}
		 */
		public final Builder dataFrame(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataFrame(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_science}
		 */
		public final Builder dataScience(@Nullable Feature value) {
			this.dataScience = value;
			return this;
		}

		/**
		 * API name: {@code data_science}
		 */
		public final Builder dataScience(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataScience(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public final Builder dataStreams(Feature value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public final Builder dataStreams(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataStreams(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code data_tiers}
		 */
		public final Builder dataTiers(Feature value) {
			this.dataTiers = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_tiers}
		 */
		public final Builder dataTiers(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataTiers(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code enrich}
		 */
		public final Builder enrich(Feature value) {
			this.enrich = value;
			return this;
		}

		/**
		 * Required - API name: {@code enrich}
		 */
		public final Builder enrich(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.enrich(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code eql}
		 */
		public final Builder eql(Feature value) {
			this.eql = value;
			return this;
		}

		/**
		 * Required - API name: {@code eql}
		 */
		public final Builder eql(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.eql(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code flattened}
		 */
		public final Builder flattened(@Nullable Feature value) {
			this.flattened = value;
			return this;
		}

		/**
		 * API name: {@code flattened}
		 */
		public final Builder flattened(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.flattened(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code frozen_indices}
		 */
		public final Builder frozenIndices(Feature value) {
			this.frozenIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code frozen_indices}
		 */
		public final Builder frozenIndices(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.frozenIndices(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code graph}
		 */
		public final Builder graph(Feature value) {
			this.graph = value;
			return this;
		}

		/**
		 * Required - API name: {@code graph}
		 */
		public final Builder graph(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.graph(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code ilm}
		 */
		public final Builder ilm(Feature value) {
			this.ilm = value;
			return this;
		}

		/**
		 * Required - API name: {@code ilm}
		 */
		public final Builder ilm(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ilm(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code logstash}
		 */
		public final Builder logstash(Feature value) {
			this.logstash = value;
			return this;
		}

		/**
		 * Required - API name: {@code logstash}
		 */
		public final Builder logstash(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.logstash(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code ml}
		 */
		public final Builder ml(Feature value) {
			this.ml = value;
			return this;
		}

		/**
		 * Required - API name: {@code ml}
		 */
		public final Builder ml(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ml(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code monitoring}
		 */
		public final Builder monitoring(Feature value) {
			this.monitoring = value;
			return this;
		}

		/**
		 * Required - API name: {@code monitoring}
		 */
		public final Builder monitoring(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.monitoring(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code rollup}
		 */
		public final Builder rollup(Feature value) {
			this.rollup = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup}
		 */
		public final Builder rollup(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.rollup(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public final Builder runtimeFields(@Nullable Feature value) {
			this.runtimeFields = value;
			return this;
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public final Builder runtimeFields(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.runtimeFields(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code searchable_snapshots}
		 */
		public final Builder searchableSnapshots(Feature value) {
			this.searchableSnapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code searchable_snapshots}
		 */
		public final Builder searchableSnapshots(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.searchableSnapshots(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(Feature value) {
			this.security = value;
			return this;
		}

		/**
		 * Required - API name: {@code security}
		 */
		public final Builder security(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.security(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code slm}
		 */
		public final Builder slm(Feature value) {
			this.slm = value;
			return this;
		}

		/**
		 * Required - API name: {@code slm}
		 */
		public final Builder slm(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.slm(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code spatial}
		 */
		public final Builder spatial(Feature value) {
			this.spatial = value;
			return this;
		}

		/**
		 * Required - API name: {@code spatial}
		 */
		public final Builder spatial(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.spatial(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code sql}
		 */
		public final Builder sql(Feature value) {
			this.sql = value;
			return this;
		}

		/**
		 * Required - API name: {@code sql}
		 */
		public final Builder sql(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.sql(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code transform}
		 */
		public final Builder transform(Feature value) {
			this.transform = value;
			return this;
		}

		/**
		 * Required - API name: {@code transform}
		 */
		public final Builder transform(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.transform(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code vectors}
		 */
		public final Builder vectors(@Nullable Feature value) {
			this.vectors = value;
			return this;
		}

		/**
		 * API name: {@code vectors}
		 */
		public final Builder vectors(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.vectors(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code voting_only}
		 */
		public final Builder votingOnly(Feature value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * Required - API name: {@code voting_only}
		 */
		public final Builder votingOnly(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.votingOnly(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code watcher}
		 */
		public final Builder watcher(Feature value) {
			this.watcher = value;
			return this;
		}

		/**
		 * Required - API name: {@code watcher}
		 */
		public final Builder watcher(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.watcher(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Required - API name: {@code archive}
		 */
		public final Builder archive(Feature value) {
			this.archive = value;
			return this;
		}

		/**
		 * Required - API name: {@code archive}
		 */
		public final Builder archive(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.archive(fn.apply(new Feature.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Features}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Features build() {
			_checkSingleUse();

			return new Features(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Features}
	 */
	public static final JsonpDeserializer<Features> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Features::setupFeaturesDeserializer);

	protected static void setupFeaturesDeserializer(ObjectDeserializer<Features.Builder> op) {

		op.add(Builder::aggregateMetric, Feature._DESERIALIZER, "aggregate_metric");
		op.add(Builder::analytics, Feature._DESERIALIZER, "analytics");
		op.add(Builder::ccr, Feature._DESERIALIZER, "ccr");
		op.add(Builder::dataFrame, Feature._DESERIALIZER, "data_frame");
		op.add(Builder::dataScience, Feature._DESERIALIZER, "data_science");
		op.add(Builder::dataStreams, Feature._DESERIALIZER, "data_streams");
		op.add(Builder::dataTiers, Feature._DESERIALIZER, "data_tiers");
		op.add(Builder::enrich, Feature._DESERIALIZER, "enrich");
		op.add(Builder::eql, Feature._DESERIALIZER, "eql");
		op.add(Builder::flattened, Feature._DESERIALIZER, "flattened");
		op.add(Builder::frozenIndices, Feature._DESERIALIZER, "frozen_indices");
		op.add(Builder::graph, Feature._DESERIALIZER, "graph");
		op.add(Builder::ilm, Feature._DESERIALIZER, "ilm");
		op.add(Builder::logstash, Feature._DESERIALIZER, "logstash");
		op.add(Builder::ml, Feature._DESERIALIZER, "ml");
		op.add(Builder::monitoring, Feature._DESERIALIZER, "monitoring");
		op.add(Builder::rollup, Feature._DESERIALIZER, "rollup");
		op.add(Builder::runtimeFields, Feature._DESERIALIZER, "runtime_fields");
		op.add(Builder::searchableSnapshots, Feature._DESERIALIZER, "searchable_snapshots");
		op.add(Builder::security, Feature._DESERIALIZER, "security");
		op.add(Builder::slm, Feature._DESERIALIZER, "slm");
		op.add(Builder::spatial, Feature._DESERIALIZER, "spatial");
		op.add(Builder::sql, Feature._DESERIALIZER, "sql");
		op.add(Builder::transform, Feature._DESERIALIZER, "transform");
		op.add(Builder::vectors, Feature._DESERIALIZER, "vectors");
		op.add(Builder::votingOnly, Feature._DESERIALIZER, "voting_only");
		op.add(Builder::watcher, Feature._DESERIALIZER, "watcher");
		op.add(Builder::archive, Feature._DESERIALIZER, "archive");

	}

}
