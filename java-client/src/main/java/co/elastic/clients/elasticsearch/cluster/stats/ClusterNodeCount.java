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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNodeCount
public final class ClusterNodeCount implements JsonpSerializable {
	private final Number coordinatingOnly;

	private final Number data;

	private final Number ingest;

	private final Number master;

	private final Number total;

	private final Number votingOnly;

	private final Number dataCold;

	@Nullable
	private final Number dataFrozen;

	private final Number dataContent;

	private final Number dataWarm;

	private final Number dataHot;

	private final Number ml;

	private final Number remoteClusterClient;

	private final Number transform;

	// ---------------------------------------------------------------------------------------------

	public ClusterNodeCount(Builder builder) {

		this.coordinatingOnly = Objects.requireNonNull(builder.coordinatingOnly, "coordinating_only");
		this.data = Objects.requireNonNull(builder.data, "data");
		this.ingest = Objects.requireNonNull(builder.ingest, "ingest");
		this.master = Objects.requireNonNull(builder.master, "master");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.votingOnly = Objects.requireNonNull(builder.votingOnly, "voting_only");
		this.dataCold = Objects.requireNonNull(builder.dataCold, "data_cold");
		this.dataFrozen = builder.dataFrozen;
		this.dataContent = Objects.requireNonNull(builder.dataContent, "data_content");
		this.dataWarm = Objects.requireNonNull(builder.dataWarm, "data_warm");
		this.dataHot = Objects.requireNonNull(builder.dataHot, "data_hot");
		this.ml = Objects.requireNonNull(builder.ml, "ml");
		this.remoteClusterClient = Objects.requireNonNull(builder.remoteClusterClient, "remote_cluster_client");
		this.transform = Objects.requireNonNull(builder.transform, "transform");

	}

	/**
	 * API name: {@code coordinating_only}
	 */
	public Number coordinatingOnly() {
		return this.coordinatingOnly;
	}

	/**
	 * API name: {@code data}
	 */
	public Number data() {
		return this.data;
	}

	/**
	 * API name: {@code ingest}
	 */
	public Number ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code master}
	 */
	public Number master() {
		return this.master;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * API name: {@code voting_only}
	 */
	public Number votingOnly() {
		return this.votingOnly;
	}

	/**
	 * API name: {@code data_cold}
	 */
	public Number dataCold() {
		return this.dataCold;
	}

	/**
	 * API name: {@code data_frozen}
	 */
	@Nullable
	public Number dataFrozen() {
		return this.dataFrozen;
	}

	/**
	 * API name: {@code data_content}
	 */
	public Number dataContent() {
		return this.dataContent;
	}

	/**
	 * API name: {@code data_warm}
	 */
	public Number dataWarm() {
		return this.dataWarm;
	}

	/**
	 * API name: {@code data_hot}
	 */
	public Number dataHot() {
		return this.dataHot;
	}

	/**
	 * API name: {@code ml}
	 */
	public Number ml() {
		return this.ml;
	}

	/**
	 * API name: {@code remote_cluster_client}
	 */
	public Number remoteClusterClient() {
		return this.remoteClusterClient;
	}

	/**
	 * API name: {@code transform}
	 */
	public Number transform() {
		return this.transform;
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

		generator.writeKey("coordinating_only");
		generator.write(this.coordinatingOnly.doubleValue());

		generator.writeKey("data");
		generator.write(this.data.doubleValue());

		generator.writeKey("ingest");
		generator.write(this.ingest.doubleValue());

		generator.writeKey("master");
		generator.write(this.master.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

		generator.writeKey("voting_only");
		generator.write(this.votingOnly.doubleValue());

		generator.writeKey("data_cold");
		generator.write(this.dataCold.doubleValue());

		if (this.dataFrozen != null) {

			generator.writeKey("data_frozen");
			generator.write(this.dataFrozen.doubleValue());

		}

		generator.writeKey("data_content");
		generator.write(this.dataContent.doubleValue());

		generator.writeKey("data_warm");
		generator.write(this.dataWarm.doubleValue());

		generator.writeKey("data_hot");
		generator.write(this.dataHot.doubleValue());

		generator.writeKey("ml");
		generator.write(this.ml.doubleValue());

		generator.writeKey("remote_cluster_client");
		generator.write(this.remoteClusterClient.doubleValue());

		generator.writeKey("transform");
		generator.write(this.transform.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNodeCount}.
	 */
	public static class Builder implements ObjectBuilder<ClusterNodeCount> {
		private Number coordinatingOnly;

		private Number data;

		private Number ingest;

		private Number master;

		private Number total;

		private Number votingOnly;

		private Number dataCold;

		@Nullable
		private Number dataFrozen;

		private Number dataContent;

		private Number dataWarm;

		private Number dataHot;

		private Number ml;

		private Number remoteClusterClient;

		private Number transform;

		/**
		 * API name: {@code coordinating_only}
		 */
		public Builder coordinatingOnly(Number value) {
			this.coordinatingOnly = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(Number value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Number value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code master}
		 */
		public Builder master(Number value) {
			this.master = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Number value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * API name: {@code data_cold}
		 */
		public Builder dataCold(Number value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public Builder dataFrozen(@Nullable Number value) {
			this.dataFrozen = value;
			return this;
		}

		/**
		 * API name: {@code data_content}
		 */
		public Builder dataContent(Number value) {
			this.dataContent = value;
			return this;
		}

		/**
		 * API name: {@code data_warm}
		 */
		public Builder dataWarm(Number value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * API name: {@code data_hot}
		 */
		public Builder dataHot(Number value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(Number value) {
			this.ml = value;
			return this;
		}

		/**
		 * API name: {@code remote_cluster_client}
		 */
		public Builder remoteClusterClient(Number value) {
			this.remoteClusterClient = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Number value) {
			this.transform = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterNodeCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNodeCount build() {

			return new ClusterNodeCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterNodeCount}
	 */
	public static final JsonpDeserializer<ClusterNodeCount> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterNodeCount::setupClusterNodeCountDeserializer);

	protected static void setupClusterNodeCountDeserializer(DelegatingDeserializer<ClusterNodeCount.Builder> op) {

		op.add(Builder::coordinatingOnly, JsonpDeserializer.numberDeserializer(), "coordinating_only");
		op.add(Builder::data, JsonpDeserializer.numberDeserializer(), "data");
		op.add(Builder::ingest, JsonpDeserializer.numberDeserializer(), "ingest");
		op.add(Builder::master, JsonpDeserializer.numberDeserializer(), "master");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");
		op.add(Builder::votingOnly, JsonpDeserializer.numberDeserializer(), "voting_only");
		op.add(Builder::dataCold, JsonpDeserializer.numberDeserializer(), "data_cold");
		op.add(Builder::dataFrozen, JsonpDeserializer.numberDeserializer(), "data_frozen");
		op.add(Builder::dataContent, JsonpDeserializer.numberDeserializer(), "data_content");
		op.add(Builder::dataWarm, JsonpDeserializer.numberDeserializer(), "data_warm");
		op.add(Builder::dataHot, JsonpDeserializer.numberDeserializer(), "data_hot");
		op.add(Builder::ml, JsonpDeserializer.numberDeserializer(), "ml");
		op.add(Builder::remoteClusterClient, JsonpDeserializer.numberDeserializer(), "remote_cluster_client");
		op.add(Builder::transform, JsonpDeserializer.numberDeserializer(), "transform");

	}

}
