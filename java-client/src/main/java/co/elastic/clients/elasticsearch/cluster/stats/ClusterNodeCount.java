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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNodeCount
@JsonpDeserializable
public final class ClusterNodeCount implements JsonpSerializable {
	private final Integer coordinatingOnly;

	private final Integer data;

	private final Integer ingest;

	private final Integer master;

	private final Integer total;

	private final Integer votingOnly;

	private final Integer dataCold;

	@Nullable
	private final Integer dataFrozen;

	private final Integer dataContent;

	private final Integer dataWarm;

	private final Integer dataHot;

	private final Integer ml;

	private final Integer remoteClusterClient;

	private final Integer transform;

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
	public Integer coordinatingOnly() {
		return this.coordinatingOnly;
	}

	/**
	 * API name: {@code data}
	 */
	public Integer data() {
		return this.data;
	}

	/**
	 * API name: {@code ingest}
	 */
	public Integer ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code master}
	 */
	public Integer master() {
		return this.master;
	}

	/**
	 * API name: {@code total}
	 */
	public Integer total() {
		return this.total;
	}

	/**
	 * API name: {@code voting_only}
	 */
	public Integer votingOnly() {
		return this.votingOnly;
	}

	/**
	 * API name: {@code data_cold}
	 */
	public Integer dataCold() {
		return this.dataCold;
	}

	/**
	 * API name: {@code data_frozen}
	 */
	@Nullable
	public Integer dataFrozen() {
		return this.dataFrozen;
	}

	/**
	 * API name: {@code data_content}
	 */
	public Integer dataContent() {
		return this.dataContent;
	}

	/**
	 * API name: {@code data_warm}
	 */
	public Integer dataWarm() {
		return this.dataWarm;
	}

	/**
	 * API name: {@code data_hot}
	 */
	public Integer dataHot() {
		return this.dataHot;
	}

	/**
	 * API name: {@code ml}
	 */
	public Integer ml() {
		return this.ml;
	}

	/**
	 * API name: {@code remote_cluster_client}
	 */
	public Integer remoteClusterClient() {
		return this.remoteClusterClient;
	}

	/**
	 * API name: {@code transform}
	 */
	public Integer transform() {
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
		generator.write(this.coordinatingOnly);

		generator.writeKey("data");
		generator.write(this.data);

		generator.writeKey("ingest");
		generator.write(this.ingest);

		generator.writeKey("master");
		generator.write(this.master);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("voting_only");
		generator.write(this.votingOnly);

		generator.writeKey("data_cold");
		generator.write(this.dataCold);

		if (this.dataFrozen != null) {

			generator.writeKey("data_frozen");
			generator.write(this.dataFrozen);

		}

		generator.writeKey("data_content");
		generator.write(this.dataContent);

		generator.writeKey("data_warm");
		generator.write(this.dataWarm);

		generator.writeKey("data_hot");
		generator.write(this.dataHot);

		generator.writeKey("ml");
		generator.write(this.ml);

		generator.writeKey("remote_cluster_client");
		generator.write(this.remoteClusterClient);

		generator.writeKey("transform");
		generator.write(this.transform);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNodeCount}.
	 */
	public static class Builder implements ObjectBuilder<ClusterNodeCount> {
		private Integer coordinatingOnly;

		private Integer data;

		private Integer ingest;

		private Integer master;

		private Integer total;

		private Integer votingOnly;

		private Integer dataCold;

		@Nullable
		private Integer dataFrozen;

		private Integer dataContent;

		private Integer dataWarm;

		private Integer dataHot;

		private Integer ml;

		private Integer remoteClusterClient;

		private Integer transform;

		/**
		 * API name: {@code coordinating_only}
		 */
		public Builder coordinatingOnly(Integer value) {
			this.coordinatingOnly = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public Builder data(Integer value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Integer value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code master}
		 */
		public Builder master(Integer value) {
			this.master = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Integer value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code voting_only}
		 */
		public Builder votingOnly(Integer value) {
			this.votingOnly = value;
			return this;
		}

		/**
		 * API name: {@code data_cold}
		 */
		public Builder dataCold(Integer value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public Builder dataFrozen(@Nullable Integer value) {
			this.dataFrozen = value;
			return this;
		}

		/**
		 * API name: {@code data_content}
		 */
		public Builder dataContent(Integer value) {
			this.dataContent = value;
			return this;
		}

		/**
		 * API name: {@code data_warm}
		 */
		public Builder dataWarm(Integer value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * API name: {@code data_hot}
		 */
		public Builder dataHot(Integer value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * API name: {@code ml}
		 */
		public Builder ml(Integer value) {
			this.ml = value;
			return this;
		}

		/**
		 * API name: {@code remote_cluster_client}
		 */
		public Builder remoteClusterClient(Integer value) {
			this.remoteClusterClient = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Integer value) {
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
	public static final JsonpDeserializer<ClusterNodeCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterNodeCount::setupClusterNodeCountDeserializer, Builder::build);

	protected static void setupClusterNodeCountDeserializer(DelegatingDeserializer<ClusterNodeCount.Builder> op) {

		op.add(Builder::coordinatingOnly, JsonpDeserializer.integerDeserializer(), "coordinating_only");
		op.add(Builder::data, JsonpDeserializer.integerDeserializer(), "data");
		op.add(Builder::ingest, JsonpDeserializer.integerDeserializer(), "ingest");
		op.add(Builder::master, JsonpDeserializer.integerDeserializer(), "master");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::votingOnly, JsonpDeserializer.integerDeserializer(), "voting_only");
		op.add(Builder::dataCold, JsonpDeserializer.integerDeserializer(), "data_cold");
		op.add(Builder::dataFrozen, JsonpDeserializer.integerDeserializer(), "data_frozen");
		op.add(Builder::dataContent, JsonpDeserializer.integerDeserializer(), "data_content");
		op.add(Builder::dataWarm, JsonpDeserializer.integerDeserializer(), "data_warm");
		op.add(Builder::dataHot, JsonpDeserializer.integerDeserializer(), "data_hot");
		op.add(Builder::ml, JsonpDeserializer.integerDeserializer(), "ml");
		op.add(Builder::remoteClusterClient, JsonpDeserializer.integerDeserializer(), "remote_cluster_client");
		op.add(Builder::transform, JsonpDeserializer.integerDeserializer(), "transform");

	}

}
