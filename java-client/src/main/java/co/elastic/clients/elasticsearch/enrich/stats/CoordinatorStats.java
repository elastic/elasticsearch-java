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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: enrich.stats.CoordinatorStats
public final class CoordinatorStats implements JsonpSerializable {
	private final Number executedSearchesTotal;

	private final String nodeId;

	private final Number queueSize;

	private final Number remoteRequestsCurrent;

	private final Number remoteRequestsTotal;

	// ---------------------------------------------------------------------------------------------

	public CoordinatorStats(Builder builder) {

		this.executedSearchesTotal = Objects.requireNonNull(builder.executedSearchesTotal, "executed_searches_total");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.queueSize = Objects.requireNonNull(builder.queueSize, "queue_size");
		this.remoteRequestsCurrent = Objects.requireNonNull(builder.remoteRequestsCurrent, "remote_requests_current");
		this.remoteRequestsTotal = Objects.requireNonNull(builder.remoteRequestsTotal, "remote_requests_total");

	}

	/**
	 * API name: {@code executed_searches_total}
	 */
	public Number executedSearchesTotal() {
		return this.executedSearchesTotal;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code queue_size}
	 */
	public Number queueSize() {
		return this.queueSize;
	}

	/**
	 * API name: {@code remote_requests_current}
	 */
	public Number remoteRequestsCurrent() {
		return this.remoteRequestsCurrent;
	}

	/**
	 * API name: {@code remote_requests_total}
	 */
	public Number remoteRequestsTotal() {
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
		generator.write(this.executedSearchesTotal.doubleValue());

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("queue_size");
		generator.write(this.queueSize.doubleValue());

		generator.writeKey("remote_requests_current");
		generator.write(this.remoteRequestsCurrent.doubleValue());

		generator.writeKey("remote_requests_total");
		generator.write(this.remoteRequestsTotal.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CoordinatorStats}.
	 */
	public static class Builder implements ObjectBuilder<CoordinatorStats> {
		private Number executedSearchesTotal;

		private String nodeId;

		private Number queueSize;

		private Number remoteRequestsCurrent;

		private Number remoteRequestsTotal;

		/**
		 * API name: {@code executed_searches_total}
		 */
		public Builder executedSearchesTotal(Number value) {
			this.executedSearchesTotal = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code queue_size}
		 */
		public Builder queueSize(Number value) {
			this.queueSize = value;
			return this;
		}

		/**
		 * API name: {@code remote_requests_current}
		 */
		public Builder remoteRequestsCurrent(Number value) {
			this.remoteRequestsCurrent = value;
			return this;
		}

		/**
		 * API name: {@code remote_requests_total}
		 */
		public Builder remoteRequestsTotal(Number value) {
			this.remoteRequestsTotal = value;
			return this;
		}

		/**
		 * Builds a {@link CoordinatorStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CoordinatorStats build() {

			return new CoordinatorStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CoordinatorStats}
	 */
	public static final JsonpDeserializer<CoordinatorStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CoordinatorStats::setupCoordinatorStatsDeserializer);

	protected static void setupCoordinatorStatsDeserializer(DelegatingDeserializer<CoordinatorStats.Builder> op) {

		op.add(Builder::executedSearchesTotal, JsonpDeserializer.numberDeserializer(), "executed_searches_total");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::queueSize, JsonpDeserializer.numberDeserializer(), "queue_size");
		op.add(Builder::remoteRequestsCurrent, JsonpDeserializer.numberDeserializer(), "remote_requests_current");
		op.add(Builder::remoteRequestsTotal, JsonpDeserializer.numberDeserializer(), "remote_requests_total");

	}

}
