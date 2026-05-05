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
import java.lang.Integer;
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

// typedef: cluster.stats.ClusterNodeCount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterNodeCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterNodeCount implements JsonpSerializable {
	private final int total;

	@Nullable
	private final Integer coordinatingOnly;

	@Nullable
	private final Integer data;

	@Nullable
	private final Integer dataCold;

	@Nullable
	private final Integer dataContent;

	@Nullable
	private final Integer dataFrozen;

	@Nullable
	private final Integer dataHot;

	@Nullable
	private final Integer dataWarm;

	@Nullable
	private final Integer index;

	@Nullable
	private final Integer ingest;

	@Nullable
	private final Integer master;

	@Nullable
	private final Integer ml;

	@Nullable
	private final Integer remoteClusterClient;

	@Nullable
	private final Integer search;

	@Nullable
	private final Integer transform;

	@Nullable
	private final Integer votingOnly;

	// ---------------------------------------------------------------------------------------------

	private ClusterNodeCount(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total", 0);
		this.coordinatingOnly = builder.coordinatingOnly;
		this.data = builder.data;
		this.dataCold = builder.dataCold;
		this.dataContent = builder.dataContent;
		this.dataFrozen = builder.dataFrozen;
		this.dataHot = builder.dataHot;
		this.dataWarm = builder.dataWarm;
		this.index = builder.index;
		this.ingest = builder.ingest;
		this.master = builder.master;
		this.ml = builder.ml;
		this.remoteClusterClient = builder.remoteClusterClient;
		this.search = builder.search;
		this.transform = builder.transform;
		this.votingOnly = builder.votingOnly;

	}

	public static ClusterNodeCount of(Function<Builder, ObjectBuilder<ClusterNodeCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * API name: {@code coordinating_only}
	 */
	@Nullable
	public final Integer coordinatingOnly() {
		return this.coordinatingOnly;
	}

	/**
	 * API name: {@code data}
	 */
	@Nullable
	public final Integer data() {
		return this.data;
	}

	/**
	 * API name: {@code data_cold}
	 */
	@Nullable
	public final Integer dataCold() {
		return this.dataCold;
	}

	/**
	 * API name: {@code data_content}
	 */
	@Nullable
	public final Integer dataContent() {
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
	 * API name: {@code data_hot}
	 */
	@Nullable
	public final Integer dataHot() {
		return this.dataHot;
	}

	/**
	 * API name: {@code data_warm}
	 */
	@Nullable
	public final Integer dataWarm() {
		return this.dataWarm;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Integer index() {
		return this.index;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public final Integer ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code master}
	 */
	@Nullable
	public final Integer master() {
		return this.master;
	}

	/**
	 * API name: {@code ml}
	 */
	@Nullable
	public final Integer ml() {
		return this.ml;
	}

	/**
	 * API name: {@code remote_cluster_client}
	 */
	@Nullable
	public final Integer remoteClusterClient() {
		return this.remoteClusterClient;
	}

	/**
	 * API name: {@code search}
	 */
	@Nullable
	public final Integer search() {
		return this.search;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public final Integer transform() {
		return this.transform;
	}

	/**
	 * API name: {@code voting_only}
	 */
	@Nullable
	public final Integer votingOnly() {
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

		generator.writeKey("total");
		generator.write(this.total);

		if (this.coordinatingOnly != null) {
			generator.writeKey("coordinating_only");
			generator.write(this.coordinatingOnly);

		}
		if (this.data != null) {
			generator.writeKey("data");
			generator.write(this.data);

		}
		if (this.dataCold != null) {
			generator.writeKey("data_cold");
			generator.write(this.dataCold);

		}
		if (this.dataContent != null) {
			generator.writeKey("data_content");
			generator.write(this.dataContent);

		}
		if (this.dataFrozen != null) {
			generator.writeKey("data_frozen");
			generator.write(this.dataFrozen);

		}
		if (this.dataHot != null) {
			generator.writeKey("data_hot");
			generator.write(this.dataHot);

		}
		if (this.dataWarm != null) {
			generator.writeKey("data_warm");
			generator.write(this.dataWarm);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.ingest != null) {
			generator.writeKey("ingest");
			generator.write(this.ingest);

		}
		if (this.master != null) {
			generator.writeKey("master");
			generator.write(this.master);

		}
		if (this.ml != null) {
			generator.writeKey("ml");
			generator.write(this.ml);

		}
		if (this.remoteClusterClient != null) {
			generator.writeKey("remote_cluster_client");
			generator.write(this.remoteClusterClient);

		}
		if (this.search != null) {
			generator.writeKey("search");
			generator.write(this.search);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			generator.write(this.transform);

		}
		if (this.votingOnly != null) {
			generator.writeKey("voting_only");
			generator.write(this.votingOnly);

		}

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
		private Integer total;

		@Nullable
		private Integer coordinatingOnly;

		@Nullable
		private Integer data;

		@Nullable
		private Integer dataCold;

		@Nullable
		private Integer dataContent;

		@Nullable
		private Integer dataFrozen;

		@Nullable
		private Integer dataHot;

		@Nullable
		private Integer dataWarm;

		@Nullable
		private Integer index;

		@Nullable
		private Integer ingest;

		@Nullable
		private Integer master;

		@Nullable
		private Integer ml;

		@Nullable
		private Integer remoteClusterClient;

		@Nullable
		private Integer search;

		@Nullable
		private Integer transform;

		@Nullable
		private Integer votingOnly;

		public Builder() {
		}
		private Builder(ClusterNodeCount instance) {
			this.total = instance.total;
			this.coordinatingOnly = instance.coordinatingOnly;
			this.data = instance.data;
			this.dataCold = instance.dataCold;
			this.dataContent = instance.dataContent;
			this.dataFrozen = instance.dataFrozen;
			this.dataHot = instance.dataHot;
			this.dataWarm = instance.dataWarm;
			this.index = instance.index;
			this.ingest = instance.ingest;
			this.master = instance.master;
			this.ml = instance.ml;
			this.remoteClusterClient = instance.remoteClusterClient;
			this.search = instance.search;
			this.transform = instance.transform;
			this.votingOnly = instance.votingOnly;

		}
		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code coordinating_only}
		 */
		public final Builder coordinatingOnly(@Nullable Integer value) {
			this.coordinatingOnly = value;
			return this;
		}

		/**
		 * API name: {@code data}
		 */
		public final Builder data(@Nullable Integer value) {
			this.data = value;
			return this;
		}

		/**
		 * API name: {@code data_cold}
		 */
		public final Builder dataCold(@Nullable Integer value) {
			this.dataCold = value;
			return this;
		}

		/**
		 * API name: {@code data_content}
		 */
		public final Builder dataContent(@Nullable Integer value) {
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
		 * API name: {@code data_hot}
		 */
		public final Builder dataHot(@Nullable Integer value) {
			this.dataHot = value;
			return this;
		}

		/**
		 * API name: {@code data_warm}
		 */
		public final Builder dataWarm(@Nullable Integer value) {
			this.dataWarm = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Integer value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable Integer value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code master}
		 */
		public final Builder master(@Nullable Integer value) {
			this.master = value;
			return this;
		}

		/**
		 * API name: {@code ml}
		 */
		public final Builder ml(@Nullable Integer value) {
			this.ml = value;
			return this;
		}

		/**
		 * API name: {@code remote_cluster_client}
		 */
		public final Builder remoteClusterClient(@Nullable Integer value) {
			this.remoteClusterClient = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable Integer value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(@Nullable Integer value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code voting_only}
		 */
		public final Builder votingOnly(@Nullable Integer value) {
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterNodeCount}
	 */
	public static final JsonpDeserializer<ClusterNodeCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterNodeCount::setupClusterNodeCountDeserializer);

	protected static void setupClusterNodeCountDeserializer(ObjectDeserializer<ClusterNodeCount.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::coordinatingOnly, JsonpDeserializer.integerDeserializer(), "coordinating_only");
		op.add(Builder::data, JsonpDeserializer.integerDeserializer(), "data");
		op.add(Builder::dataCold, JsonpDeserializer.integerDeserializer(), "data_cold");
		op.add(Builder::dataContent, JsonpDeserializer.integerDeserializer(), "data_content");
		op.add(Builder::dataFrozen, JsonpDeserializer.integerDeserializer(), "data_frozen");
		op.add(Builder::dataHot, JsonpDeserializer.integerDeserializer(), "data_hot");
		op.add(Builder::dataWarm, JsonpDeserializer.integerDeserializer(), "data_warm");
		op.add(Builder::index, JsonpDeserializer.integerDeserializer(), "index");
		op.add(Builder::ingest, JsonpDeserializer.integerDeserializer(), "ingest");
		op.add(Builder::master, JsonpDeserializer.integerDeserializer(), "master");
		op.add(Builder::ml, JsonpDeserializer.integerDeserializer(), "ml");
		op.add(Builder::remoteClusterClient, JsonpDeserializer.integerDeserializer(), "remote_cluster_client");
		op.add(Builder::search, JsonpDeserializer.integerDeserializer(), "search");
		op.add(Builder::transform, JsonpDeserializer.integerDeserializer(), "transform");
		op.add(Builder::votingOnly, JsonpDeserializer.integerDeserializer(), "voting_only");

	}

}
