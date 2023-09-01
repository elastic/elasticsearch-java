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

package co.elastic.clients.elasticsearch.enrich.stats;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.stats.CoordinatorStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#enrich.stats.CoordinatorStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CoordinatorStats implements JsonpSerializable {
	private final long executedSearchesTotal;

	private final String nodeId;

	private final int queueSize;

	private final int remoteRequestsCurrent;

	private final long remoteRequestsTotal;

	// ---------------------------------------------------------------------------------------------

	private CoordinatorStats(Builder builder) {

		this.executedSearchesTotal = ApiTypeHelper.requireNonNull(builder.executedSearchesTotal, this,
				"executedSearchesTotal");
		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.queueSize = ApiTypeHelper.requireNonNull(builder.queueSize, this, "queueSize");
		this.remoteRequestsCurrent = ApiTypeHelper.requireNonNull(builder.remoteRequestsCurrent, this,
				"remoteRequestsCurrent");
		this.remoteRequestsTotal = ApiTypeHelper.requireNonNull(builder.remoteRequestsTotal, this,
				"remoteRequestsTotal");

	}

	public static CoordinatorStats of(Function<Builder, ObjectBuilder<CoordinatorStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code executed_searches_total}
	 */
	public final long executedSearchesTotal() {
		return this.executedSearchesTotal;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code queue_size}
	 */
	public final int queueSize() {
		return this.queueSize;
	}

	/**
	 * Required - API name: {@code remote_requests_current}
	 */
	public final int remoteRequestsCurrent() {
		return this.remoteRequestsCurrent;
	}

	/**
	 * Required - API name: {@code remote_requests_total}
	 */
	public final long remoteRequestsTotal() {
		return this.remoteRequestsTotal;
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

		generator.writeKey("executed_searches_total");
		generator.write(this.executedSearchesTotal);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("queue_size");
		generator.write(this.queueSize);

		generator.writeKey("remote_requests_current");
		generator.write(this.remoteRequestsCurrent);

		generator.writeKey("remote_requests_total");
		generator.write(this.remoteRequestsTotal);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CoordinatorStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CoordinatorStats> {
		private Long executedSearchesTotal;

		private String nodeId;

		private Integer queueSize;

		private Integer remoteRequestsCurrent;

		private Long remoteRequestsTotal;

		/**
		 * Required - API name: {@code executed_searches_total}
		 */
		public final Builder executedSearchesTotal(long value) {
			this.executedSearchesTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code queue_size}
		 */
		public final Builder queueSize(int value) {
			this.queueSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code remote_requests_current}
		 */
		public final Builder remoteRequestsCurrent(int value) {
			this.remoteRequestsCurrent = value;
			return this;
		}

		/**
		 * Required - API name: {@code remote_requests_total}
		 */
		public final Builder remoteRequestsTotal(long value) {
			this.remoteRequestsTotal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CoordinatorStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CoordinatorStats build() {
			_checkSingleUse();

			return new CoordinatorStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CoordinatorStats}
	 */
	public static final JsonpDeserializer<CoordinatorStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CoordinatorStats::setupCoordinatorStatsDeserializer);

	protected static void setupCoordinatorStatsDeserializer(ObjectDeserializer<CoordinatorStats.Builder> op) {

		op.add(Builder::executedSearchesTotal, JsonpDeserializer.longDeserializer(), "executed_searches_total");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::queueSize, JsonpDeserializer.integerDeserializer(), "queue_size");
		op.add(Builder::remoteRequestsCurrent, JsonpDeserializer.integerDeserializer(), "remote_requests_current");
		op.add(Builder::remoteRequestsTotal, JsonpDeserializer.longDeserializer(), "remote_requests_total");

	}

}
