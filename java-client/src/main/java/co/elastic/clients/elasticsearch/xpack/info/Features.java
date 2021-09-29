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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
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

// typedef: xpack.info.Features
@JsonpDeserializable
public final class Features implements JsonpSerializable {
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

	private final Feature vectors;

	private final Feature votingOnly;

	private final Feature watcher;

	// ---------------------------------------------------------------------------------------------

	public Features(Builder builder) {

		this.aggregateMetric = Objects.requireNonNull(builder.aggregateMetric, "aggregate_metric");
		this.analytics = Objects.requireNonNull(builder.analytics, "analytics");
		this.ccr = Objects.requireNonNull(builder.ccr, "ccr");
		this.dataFrame = builder.dataFrame;
		this.dataScience = builder.dataScience;
		this.dataStreams = Objects.requireNonNull(builder.dataStreams, "data_streams");
		this.dataTiers = Objects.requireNonNull(builder.dataTiers, "data_tiers");
		this.enrich = Objects.requireNonNull(builder.enrich, "enrich");
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
		this.searchableSnapshots = Objects.requireNonNull(builder.searchableSnapshots, "searchable_snapshots");
		this.security = Objects.requireNonNull(builder.security, "security");
		this.slm = Objects.requireNonNull(builder.slm, "slm");
		this.spatial = Objects.requireNonNull(builder.spatial, "spatial");
		this.sql = Objects.requireNonNull(builder.sql, "sql");
		this.transform = Objects.requireNonNull(builder.transform, "transform");
		this.vectors = Objects.requireNonNull(builder.vectors, "vectors");
		this.votingOnly = Objects.requireNonNull(builder.votingOnly, "voting_only");
		this.watcher = Objects.requireNonNull(builder.watcher, "watcher");

	}

	public Features(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code aggregate_metric}
	 */
	public Feature aggregateMetric() {
		return this.aggregateMetric;
	}

	/**
	 * API name: {@code analytics}
	 */
	public Feature analytics() {
		return this.analytics;
	}

	/**
	 * API name: {@code ccr}
	 */
	public Feature ccr() {
		return this.ccr;
	}

	/**
	 * API name: {@code data_frame}
	 */
	@Nullable
	public Feature dataFrame() {
		return this.dataFrame;
	}

	/**
	 * API name: {@code data_science}
	 */
	@Nullable
	public Feature dataScience() {
		return this.dataScience;
	}

	/**
	 * API name: {@code data_streams}
	 */
	public Feature dataStreams() {
		return this.dataStreams;
	}

	/**
	 * API name: {@code data_tiers}
	 */
	public Feature dataTiers() {
		return this.dataTiers;
	}

	/**
	 * API name: {@code enrich}
	 */
	public Feature enrich() {
		return this.enrich;
	}

	/**
	 * API name: {@code eql}
	 */
	public Feature eql() {
		return this.eql;
	}

	/**
	 * API name: {@code flattened}
	 */
	@Nullable
	public Feature flattened() {
		return this.flattened;
	}

	/**
	 * API name: {@code frozen_indices}
	 */
	public Feature frozenIndices() {
		return this.frozenIndices;
	}

	/**
	 * API name: {@code graph}
	 */
	public Feature graph() {
		return this.graph;
	}

	/**
	 * API name: {@code ilm}
	 */
	public Feature ilm() {
		return this.ilm;
	}

	/**
	 * API name: {@code logstash}
	 */
	public Feature logstash() {
		return this.logstash;
	}

	/**
	 * API name: {@code ml}
	 */
	public Feature ml() {
		return this.ml;
	}

	/**
	 * API name: {@code monitoring}
	 */
	public Feature monitoring() {
		return this.monitoring;
	}

	/**
	 * API name: {@code rollup}
	 */
	public Feature rollup() {
		return this.rollup;
	}

	/**
	 * API name: {@code runtime_fields}
	 */
	@Nullable
	public Feature runtimeFields() {
		return this.runtimeFields;
	}

	/**
	 * API name: {@code searchable_snapshots}
	 */
	public Feature searchableSnapshots() {
		return this.searchableSnapshots;
	}

	/**
	 * API name: {@code security}
	 */
	public Feature security() {
		return this.security;
	}

	/**
	 * API name: {@code slm}
	 */
	public Feature slm() {
		return this.slm;
	}

	/**
	 * API name: {@code spatial}
	 */
	public Feature spatial() {
		return this.spatial;
	}

	/**
	 * API name: {@code sql}
	 */
	public Feature sql() {
		return this.sql;
	}

	/**
	 * API name: {@code transform}
	 */
	public Feature transform() {
		return this.transform;
	}

	/**
	 * API name: {@code vectors}
	 */
	public Feature vectors() {
		return this.vectors;
	}

	/**
	 * API name: {@code voting_only}
	 */
	public Feature votingOnly() {
		return this.votingOnly;
	}

	/**
	 * API name: {@code watcher}
	 */
	public Feature watcher() {
		return this.watcher;
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

		generator.writeKey("vectors");
		this.vectors.serialize(generator, mapper);

		generator.writeKey("voting_only");
		this.votingOnly.serialize(generator, mapper);

		generator.writeKey("watcher");
		this.watcher.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Features}.
	 */
	public static class Builder implements ObjectBuilder<Features> {
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

		private Feature vectors;

		private Feature votingOnly;

		private Feature watcher;

		/**
		 * API name: {@code aggregate_metric}
		 */
		public Builder aggregateMetric(Feature value) {
			this.aggregateMetric = value;
			return this;
		}

		/**
		 * API name: {@code aggregate_metric}
		 */
		public Builder aggregateMetric(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.aggregateMetric(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code analytics}
		 */
		public Builder analytics(Feature value) {
			this.analytics = value;
			return this;
		}

		/**
		 * API name: {@code analytics}
		 */
		public Builder analytics(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.analytics(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code ccr}
		 */
		public Builder ccr(Feature value) {
			this.ccr = value;
			return this;
		}

		/**
		 * API name: {@code ccr}
		 */
		public Builder ccr(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ccr(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_frame}
		 */
		public Builder dataFrame(@Nullable Feature value) {
			this.dataFrame = value;
			return this;
		}

		/**
		 * API name: {@code data_frame}
		 */
		public Builder dataFrame(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataFrame(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_science}
		 */
		public Builder dataScience(@Nullable Feature value) {
			this.dataScience = value;
			return this;
		}

		/**
		 * API name: {@code data_science}
		 */
		public Builder dataScience(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataScience(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(Feature value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataStreams(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code data_tiers}
		 */
		public Builder dataTiers(Feature value) {
			this.dataTiers = value;
			return this;
		}

		/**
		 * API name: {@code data_tiers}
		 */
		public Builder dataTiers(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.dataTiers(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(Feature value) {
			this.enrich = value;
			return this;
		}

		/**
		 * API name: {@code enrich}
		 */
		public Builder enrich(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.enrich(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code eql}
		 */
		public Builder eql(Feature value) {
			this.eql = value;
			return this;
		}

		/**
		 * API name: {@code eql}
		 */
		public Builder eql(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.eql(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code flattened}
		 */
		public Builder flattened(@Nullable Feature value) {
			this.flattened = value;
			return this;
		}

		/**
		 * API name: {@code flattened}
		 */
		public Builder flattened(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.flattened(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code frozen_indices}
		 */
		public Builder frozenIndices(Feature value) {
			this.frozenIndices = value;
			return this;
		}

		/**
		 * API name: {@code frozen_indices}
		 */
		public Builder frozenIndices(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.frozenIndices(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code graph}
		 */
		public Builder graph(Feature value) {
			this.graph = value;
			return this;
		}

		/**
		 * API name: {@code graph}
		 */
		public Builder graph(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.graph(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code ilm}
		 */
		public Builder ilm(Feature value) {
			this.ilm = value;
			return this;
		}

		/**
		 * API name: {@code ilm}
		 */
		public Builder ilm(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ilm(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code logstash}
		 */
		public Builder logstash(Feature value) {
			this.logstash = value;
			return this;
		}

		/**
		 * API name: {@code logstash}
		 */
		public Builder logstash(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.logstash(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(Feature value) {
			this.ml = value;
			return this;
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.ml(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code monitoring}
		 */
		public Builder monitoring(Feature value) {
			this.monitoring = value;
			return this;
		}

		/**
		 * API name: {@code monitoring}
		 */
		public Builder monitoring(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.monitoring(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code rollup}
		 */
		public Builder rollup(Feature value) {
			this.rollup = value;
			return this;
		}

		/**
		 * API name: {@code rollup}
		 */
		public Builder rollup(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.rollup(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public Builder runtimeFields(@Nullable Feature value) {
			this.runtimeFields = value;
			return this;
		}

		/**
		 * API name: {@code runtime_fields}
		 */
		public Builder runtimeFields(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.runtimeFields(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code searchable_snapshots}
		 */
		public Builder searchableSnapshots(Feature value) {
			this.searchableSnapshots = value;
			return this;
		}

		/**
		 * API name: {@code searchable_snapshots}
		 */
		public Builder searchableSnapshots(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.searchableSnapshots(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(Feature value) {
			this.security = value;
			return this;
		}

		/**
		 * API name: {@code security}
		 */
		public Builder security(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.security(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code slm}
		 */
		public Builder slm(Feature value) {
			this.slm = value;
			return this;
		}

		/**
		 * API name: {@code slm}
		 */
		public Builder slm(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.slm(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code spatial}
		 */
		public Builder spatial(Feature value) {
			this.spatial = value;
			return this;
		}

		/**
		 * API name: {@code spatial}
		 */
		public Builder spatial(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.spatial(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code sql}
		 */
		public Builder sql(Feature value) {
			this.sql = value;
			return this;
		}

		/**
		 * API name: {@code sql}
		 */
		public Builder sql(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.sql(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Feature value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.transform(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code vectors}
		 */
		public Builder vectors(Feature value) {
			this.vectors = value;
			return this;
		}

		/**
		 * API name: {@code vectors}
		 */
		public Builder vectors(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.vectors(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Feature value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.votingOnly(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * API name: {@code watcher}
		 */
		public Builder watcher(Feature value) {
			this.watcher = value;
			return this;
		}

		/**
		 * API name: {@code watcher}
		 */
		public Builder watcher(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.watcher(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Builds a {@link Features}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Features build() {

			return new Features(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Features}
	 */
	public static final JsonpDeserializer<Features> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Features::setupFeaturesDeserializer, Builder::build);

	protected static void setupFeaturesDeserializer(DelegatingDeserializer<Features.Builder> op) {

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

	}

}
