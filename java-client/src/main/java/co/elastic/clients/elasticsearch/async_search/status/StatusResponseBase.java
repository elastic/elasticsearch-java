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

package co.elastic.clients.elasticsearch.async_search.status;

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
	private final Integer completionStatus;

	// ---------------------------------------------------------------------------------------------

	protected StatusResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");
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
		op.add(AbstractBuilder::completionStatus, JsonpDeserializer.integerDeserializer(), "completion_status");

	}

}
