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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNodeCount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterNodeCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterNodeCount implements JsonpSerializable {
	private final int coordinatingOnly;

	private final int data;

	private final int dataCold;

	private final int dataContent;

	@Nullable
	private final Integer dataFrozen;

	private final int dataHot;

	private final int dataWarm;

	private final int ingest;

	private final int master;

	private final int ml;

	private final int remoteClusterClient;

	private final int total;

	private final int transform;

	private final int votingOnly;

	// ---------------------------------------------------------------------------------------------

	private ClusterNodeCount(Builder builder) {

		this.coordinatingOnly = ApiTypeHelper.requireNonNull(builder.coordinatingOnly, this, "coordinatingOnly");
		this.data = ApiTypeHelper.requireNonNull(builder.data, this, "data");
		this.dataCold = ApiTypeHelper.requireNonNull(builder.dataCold, this, "dataCold");
		this.dataContent = ApiTypeHelper.requireNonNull(builder.dataContent, this, "dataContent");
		this.dataFrozen = builder.dataFrozen;
		this.dataHot = ApiTypeHelper.requireNonNull(builder.dataHot, this, "dataHot");
		this.dataWarm = ApiTypeHelper.requireNonNull(builder.dataWarm, this, "dataWarm");
		this.ingest = ApiTypeHelper.requireNonNull(builder.ingest, this, "ingest");
		this.master = ApiTypeHelper.requireNonNull(builder.master, this, "master");
		this.ml = ApiTypeHelper.requireNonNull(builder.ml, this, "ml");
		this.remoteClusterClient = ApiTypeHelper.requireNonNull(builder.remoteClusterClient, this,
				"remoteClusterClient");
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.transform = ApiTypeHelper.requireNonNull(builder.transform, this, "transform");
		this.votingOnly = ApiTypeHelper.requireNonNull(builder.votingOnly, this, "votingOnly");

	}

	public static ClusterNodeCount of(Function<Builder, ObjectBuilder<ClusterNodeCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code coordinating_only}
	 */
	public final int coordinatingOnly() {
		return this.coordinatingOnly;
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final int data() {
		return this.data;
	}

	/**
	 * Required - API name: {@code data_cold}
	 */
	public final int dataCold() {
		return this.dataCold;
	}

	/**
	 * Required - API name: {@code data_content}
	 */
	public final int dataContent() {
		return this.dataContent;
	}

	/**
	 * API name: {@code data_frozen}
	 */
	@Nullable
	public final Integer dataFrozen() {
		return this.dataFrozen;
	}

	/**
	 * Required - API name: {@code data_hot}
	 */
	public final int dataHot() {
		return this.dataHot;
	}

	/**
	 * Required - API name: {@code data_warm}
	 */
	public final int dataWarm() {
		return this.dataWarm;
	}

	/**
	 * Required - API name: {@code ingest}
	 */
	public final int ingest() {
		return this.ingest;
	}

	/**
	 * Required - API name: {@code master}
	 */
	public final int master() {
		return this.master;
	}

	/**
	 * Required - API name: {@code ml}
	 */
	public final int ml() {
		return this.ml;
	}

	/**
	 * Required - API name: {@code remote_cluster_client}
	 */
	public final int remoteClusterClient() {
		return this.remoteClusterClient;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code transform}
	 */
	public final int transform() {
		return this.transform;
	}

	/**
	 * Required - API name: {@code voting_only}
	 */
	public final int votingOnly() {
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

		generator.writeKey("coordinating_only");
		generator.write(this.coordinatingOnly);

		generator.writeKey("data");
		generator.write(this.data);

		generator.writeKey("data_cold");
		generator.write(this.dataCold);

		generator.writeKey("data_content");
		generator.write(this.dataContent);

		if (this.dataFrozen != null) {
			generator.writeKey("data_frozen");
			generator.write(this.dataFrozen);

		}
		generator.writeKey("data_hot");
		generator.write(this.dataHot);

		generator.writeKey("data_warm");
		generator.write(this.dataWarm);

		generator.writeKey("ingest");
		generator.write(this.ingest);

		generator.writeKey("master");
		generator.write(this.master);

		generator.writeKey("ml");
		generator.write(this.ml);

		generator.writeKey("remote_cluster_client");
		generator.write(this.remoteClusterClient);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("transform");
		generator.write(this.transform);

		generator.writeKey("voting_only");
		generator.write(this.votingOnly);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNodeCount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterNodeCount> {
		private Integer coordinatingOnly;

		private Integer data;

		private Integer dataCold;

		private Integer dataContent;

		@Nullable
		private Integer dataFrozen;

		private Integer dataHot;

		private Integer dataWarm;

		private Integer ingest;

		private Integer master;

		private Integer ml;

		private Integer remoteClusterClient;

		private Integer total;

		private Integer transform;

		private Integer votingOnly;

		/**
		 * Required - API name: {@code coordinating_only}
		 */
		public final Builder coordinatingOnly(int value) {
			this.coordinatingOnly = value;
			return this;
		}

		/**
		 * Required - API name: {@code data}
		 */
		public final Builder data(int value) {
			this.data = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_cold}
		 */
		public final Builder dataCold(int value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_content}
		 */
		public final Builder dataContent(int value) {
			this.dataContent = value;
			return this;
		}

		/**
		 * API name: {@code data_frozen}
		 */
		public final Builder dataFrozen(@Nullable Integer value) {
			this.dataFrozen = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_hot}
		 */
		public final Builder dataHot(int value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_warm}
		 */
		public final Builder dataWarm(int value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * Required - API name: {@code ingest}
		 */
		public final Builder ingest(int value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Required - API name: {@code master}
		 */
		public final Builder master(int value) {
			this.master = value;
			return this;
		}

		/**
		 * Required - API name: {@code ml}
		 */
		public final Builder ml(int value) {
			this.ml = value;
			return this;
		}

		/**
		 * Required - API name: {@code remote_cluster_client}
		 */
		public final Builder remoteClusterClient(int value) {
			this.remoteClusterClient = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code transform}
		 */
		public final Builder transform(int value) {
			this.transform = value;
			return this;
		}

		/**
		 * Required - API name: {@code voting_only}
		 */
		public final Builder votingOnly(int value) {
			this.votingOnly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterNodeCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNodeCount build() {
			_checkSingleUse();

			return new ClusterNodeCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterNodeCount}
	 */
	public static final JsonpDeserializer<ClusterNodeCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterNodeCount::setupClusterNodeCountDeserializer);

	protected static void setupClusterNodeCountDeserializer(ObjectDeserializer<ClusterNodeCount.Builder> op) {

		op.add(Builder::coordinatingOnly, JsonpDeserializer.integerDeserializer(), "coordinating_only");
		op.add(Builder::data, JsonpDeserializer.integerDeserializer(), "data");
		op.add(Builder::dataCold, JsonpDeserializer.integerDeserializer(), "data_cold");
		op.add(Builder::dataContent, JsonpDeserializer.integerDeserializer(), "data_content");
		op.add(Builder::dataFrozen, JsonpDeserializer.integerDeserializer(), "data_frozen");
		op.add(Builder::dataHot, JsonpDeserializer.integerDeserializer(), "data_hot");
		op.add(Builder::dataWarm, JsonpDeserializer.integerDeserializer(), "data_warm");
		op.add(Builder::ingest, JsonpDeserializer.integerDeserializer(), "ingest");
		op.add(Builder::master, JsonpDeserializer.integerDeserializer(), "master");
		op.add(Builder::ml, JsonpDeserializer.integerDeserializer(), "ml");
		op.add(Builder::remoteClusterClient, JsonpDeserializer.integerDeserializer(), "remote_cluster_client");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::transform, JsonpDeserializer.integerDeserializer(), "transform");
		op.add(Builder::votingOnly, JsonpDeserializer.integerDeserializer(), "voting_only");

	}

}
