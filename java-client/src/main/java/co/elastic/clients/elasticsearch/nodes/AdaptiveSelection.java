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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.AdaptiveSelection
public final class AdaptiveSelection implements ToJsonp {
	private final Number avgQueueSize;

	private final Number avgResponseTime;

	private final Number avgResponseTimeNs;

	private final String avgServiceTime;

	private final Number avgServiceTimeNs;

	private final Number outgoingSearches;

	private final String rank;

	// ---------------------------------------------------------------------------------------------

	protected AdaptiveSelection(Builder builder) {

		this.avgQueueSize = Objects.requireNonNull(builder.avgQueueSize, "avg_queue_size");
		this.avgResponseTime = Objects.requireNonNull(builder.avgResponseTime, "avg_response_time");
		this.avgResponseTimeNs = Objects.requireNonNull(builder.avgResponseTimeNs, "avg_response_time_ns");
		this.avgServiceTime = Objects.requireNonNull(builder.avgServiceTime, "avg_service_time");
		this.avgServiceTimeNs = Objects.requireNonNull(builder.avgServiceTimeNs, "avg_service_time_ns");
		this.outgoingSearches = Objects.requireNonNull(builder.outgoingSearches, "outgoing_searches");
		this.rank = Objects.requireNonNull(builder.rank, "rank");

	}

	/**
	 * API name: {@code avg_queue_size}
	 */
	public Number avgQueueSize() {
		return this.avgQueueSize;
	}

	/**
	 * API name: {@code avg_response_time}
	 */
	public Number avgResponseTime() {
		return this.avgResponseTime;
	}

	/**
	 * API name: {@code avg_response_time_ns}
	 */
	public Number avgResponseTimeNs() {
		return this.avgResponseTimeNs;
	}

	/**
	 * API name: {@code avg_service_time}
	 */
	public String avgServiceTime() {
		return this.avgServiceTime;
	}

	/**
	 * API name: {@code avg_service_time_ns}
	 */
	public Number avgServiceTimeNs() {
		return this.avgServiceTimeNs;
	}

	/**
	 * API name: {@code outgoing_searches}
	 */
	public Number outgoingSearches() {
		return this.outgoingSearches;
	}

	/**
	 * API name: {@code rank}
	 */
	public String rank() {
		return this.rank;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("avg_queue_size");
		generator.write(this.avgQueueSize.doubleValue());

		generator.writeKey("avg_response_time");
		generator.write(this.avgResponseTime.doubleValue());

		generator.writeKey("avg_response_time_ns");
		generator.write(this.avgResponseTimeNs.doubleValue());

		generator.writeKey("avg_service_time");
		generator.write(this.avgServiceTime);

		generator.writeKey("avg_service_time_ns");
		generator.write(this.avgServiceTimeNs.doubleValue());

		generator.writeKey("outgoing_searches");
		generator.write(this.outgoingSearches.doubleValue());

		generator.writeKey("rank");
		generator.write(this.rank);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdaptiveSelection}.
	 */
	public static class Builder implements ObjectBuilder<AdaptiveSelection> {
		private Number avgQueueSize;

		private Number avgResponseTime;

		private Number avgResponseTimeNs;

		private String avgServiceTime;

		private Number avgServiceTimeNs;

		private Number outgoingSearches;

		private String rank;

		/**
		 * API name: {@code avg_queue_size}
		 */
		public Builder avgQueueSize(Number value) {
			this.avgQueueSize = value;
			return this;
		}

		/**
		 * API name: {@code avg_response_time}
		 */
		public Builder avgResponseTime(Number value) {
			this.avgResponseTime = value;
			return this;
		}

		/**
		 * API name: {@code avg_response_time_ns}
		 */
		public Builder avgResponseTimeNs(Number value) {
			this.avgResponseTimeNs = value;
			return this;
		}

		/**
		 * API name: {@code avg_service_time}
		 */
		public Builder avgServiceTime(String value) {
			this.avgServiceTime = value;
			return this;
		}

		/**
		 * API name: {@code avg_service_time_ns}
		 */
		public Builder avgServiceTimeNs(Number value) {
			this.avgServiceTimeNs = value;
			return this;
		}

		/**
		 * API name: {@code outgoing_searches}
		 */
		public Builder outgoingSearches(Number value) {
			this.outgoingSearches = value;
			return this;
		}

		/**
		 * API name: {@code rank}
		 */
		public Builder rank(String value) {
			this.rank = value;
			return this;
		}

		/**
		 * Builds a {@link AdaptiveSelection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdaptiveSelection build() {

			return new AdaptiveSelection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for AdaptiveSelection
	 */
	public static final JsonpDeserializer<AdaptiveSelection> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AdaptiveSelection::setupAdaptiveSelectionDeserializer);

	protected static void setupAdaptiveSelectionDeserializer(DelegatingDeserializer<AdaptiveSelection.Builder> op) {

		op.add(Builder::avgQueueSize, JsonpDeserializer.numberDeserializer(), "avg_queue_size");
		op.add(Builder::avgResponseTime, JsonpDeserializer.numberDeserializer(), "avg_response_time");
		op.add(Builder::avgResponseTimeNs, JsonpDeserializer.numberDeserializer(), "avg_response_time_ns");
		op.add(Builder::avgServiceTime, JsonpDeserializer.stringDeserializer(), "avg_service_time");
		op.add(Builder::avgServiceTimeNs, JsonpDeserializer.numberDeserializer(), "avg_service_time_ns");
		op.add(Builder::outgoingSearches, JsonpDeserializer.numberDeserializer(), "outgoing_searches");
		op.add(Builder::rank, JsonpDeserializer.stringDeserializer(), "rank");

	}

}
