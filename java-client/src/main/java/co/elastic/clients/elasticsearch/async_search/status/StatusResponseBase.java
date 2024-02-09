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

package co.elastic.clients.elasticsearch.async_search.status;

import co.elastic.clients.elasticsearch._types.ClusterStatistics;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.async_search.AsyncSearchResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
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

// typedef: async_search.status.StatusResponseBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#async_search.status.StatusResponseBase">API
 *      specification</a>
 */

public abstract class StatusResponseBase extends AsyncSearchResponseBase {
	private final ShardStatistics shards;

	@Nullable
	private final ClusterStatistics clusters;

	@Nullable
	private final Integer completionStatus;

	// ---------------------------------------------------------------------------------------------

	protected StatusResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
		this.clusters = builder.clusters;
		this.completionStatus = builder.completionStatus;

	}

	/**
	 * Required - Indicates how many shards have run the query so far.
	 * <p>
	 * API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Metadata about clusters involved in the cross-cluster search. Not shown for
	 * local-only searches.
	 * <p>
	 * API name: {@code _clusters}
	 */
	@Nullable
	public final ClusterStatistics clusters() {
		return this.clusters;
	}

	/**
	 * If the async search completed, this field shows the status code of the
	 * search. For example, 200 indicates that the async search was successfully
	 * completed. 503 indicates that the async search was completed with an error.
	 * <p>
	 * API name: {@code completion_status}
	 */
	@Nullable
	public final Integer completionStatus() {
		return this.completionStatus;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		if (this.clusters != null) {
			generator.writeKey("_clusters");
			this.clusters.serialize(generator, mapper);

		}
		if (this.completionStatus != null) {
			generator.writeKey("completion_status");
			generator.write(this.completionStatus);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AsyncSearchResponseBase.AbstractBuilder<BuilderT> {
		private ShardStatistics shards;

		@Nullable
		private ClusterStatistics clusters;

		@Nullable
		private Integer completionStatus;

		/**
		 * Required - Indicates how many shards have run the query so far.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - Indicates how many shards have run the query so far.
		 * <p>
		 * API name: {@code _shards}
		 */
		public final BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Metadata about clusters involved in the cross-cluster search. Not shown for
		 * local-only searches.
		 * <p>
		 * API name: {@code _clusters}
		 */
		public final BuilderT clusters(@Nullable ClusterStatistics value) {
			this.clusters = value;
			return self();
		}

		/**
		 * Metadata about clusters involved in the cross-cluster search. Not shown for
		 * local-only searches.
		 * <p>
		 * API name: {@code _clusters}
		 */
		public final BuilderT clusters(Function<ClusterStatistics.Builder, ObjectBuilder<ClusterStatistics>> fn) {
			return this.clusters(fn.apply(new ClusterStatistics.Builder()).build());
		}

		/**
		 * If the async search completed, this field shows the status code of the
		 * search. For example, 200 indicates that the async search was successfully
		 * completed. 503 indicates that the async search was completed with an error.
		 * <p>
		 * API name: {@code completion_status}
		 */
		public final BuilderT completionStatus(@Nullable Integer value) {
			this.completionStatus = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupStatusResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AsyncSearchResponseBase.setupAsyncSearchResponseBaseDeserializer(op);
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(AbstractBuilder::clusters, ClusterStatistics._DESERIALIZER, "_clusters");
		op.add(AbstractBuilder::completionStatus, JsonpDeserializer.integerDeserializer(), "completion_status");

	}

}
