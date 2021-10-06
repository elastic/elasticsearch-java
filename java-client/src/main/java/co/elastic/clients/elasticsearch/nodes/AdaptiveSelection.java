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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.AdaptiveSelection
@JsonpDeserializable
public final class AdaptiveSelection implements JsonpSerializable {
	private final long avgQueueSize;

	private final long avgResponseTime;

	private final long avgResponseTimeNs;

	private final String avgServiceTime;

	private final long avgServiceTimeNs;

	private final long outgoingSearches;

	private final String rank;

	// ---------------------------------------------------------------------------------------------

	public AdaptiveSelection(Builder builder) {

		this.avgQueueSize = Objects.requireNonNull(builder.avgQueueSize, "avg_queue_size");
		this.avgResponseTime = Objects.requireNonNull(builder.avgResponseTime, "avg_response_time");
		this.avgResponseTimeNs = Objects.requireNonNull(builder.avgResponseTimeNs, "avg_response_time_ns");
		this.avgServiceTime = Objects.requireNonNull(builder.avgServiceTime, "avg_service_time");
		this.avgServiceTimeNs = Objects.requireNonNull(builder.avgServiceTimeNs, "avg_service_time_ns");
		this.outgoingSearches = Objects.requireNonNull(builder.outgoingSearches, "outgoing_searches");
		this.rank = Objects.requireNonNull(builder.rank, "rank");

	}

	public AdaptiveSelection(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code avg_queue_size}
	 */
	public long avgQueueSize() {
		return this.avgQueueSize;
	}

	/**
	 * Required - API name: {@code avg_response_time}
	 */
	public long avgResponseTime() {
		return this.avgResponseTime;
	}

	/**
	 * Required - API name: {@code avg_response_time_ns}
	 */
	public long avgResponseTimeNs() {
		return this.avgResponseTimeNs;
	}

	/**
	 * Required - API name: {@code avg_service_time}
	 */
	public String avgServiceTime() {
		return this.avgServiceTime;
	}

	/**
	 * Required - API name: {@code avg_service_time_ns}
	 */
	public long avgServiceTimeNs() {
		return this.avgServiceTimeNs;
	}

	/**
	 * Required - API name: {@code outgoing_searches}
	 */
	public long outgoingSearches() {
		return this.outgoingSearches;
	}

	/**
	 * Required - API name: {@code rank}
	 */
	public String rank() {
		return this.rank;
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

		generator.writeKey("avg_queue_size");
		generator.write(this.avgQueueSize);

		generator.writeKey("avg_response_time");
		generator.write(this.avgResponseTime);

		generator.writeKey("avg_response_time_ns");
		generator.write(this.avgResponseTimeNs);

		generator.writeKey("avg_service_time");
		generator.write(this.avgServiceTime);

		generator.writeKey("avg_service_time_ns");
		generator.write(this.avgServiceTimeNs);

		generator.writeKey("outgoing_searches");
		generator.write(this.outgoingSearches);

		generator.writeKey("rank");
		generator.write(this.rank);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdaptiveSelection}.
	 */
	public static class Builder implements ObjectBuilder<AdaptiveSelection> {
		private Long avgQueueSize;

		private Long avgResponseTime;

		private Long avgResponseTimeNs;

		private String avgServiceTime;

		private Long avgServiceTimeNs;

		private Long outgoingSearches;

		private String rank;

		/**
		 * Required - API name: {@code avg_queue_size}
		 */
		public Builder avgQueueSize(long value) {
			this.avgQueueSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_response_time}
		 */
		public Builder avgResponseTime(long value) {
			this.avgResponseTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_response_time_ns}
		 */
		public Builder avgResponseTimeNs(long value) {
			this.avgResponseTimeNs = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_service_time}
		 */
		public Builder avgServiceTime(String value) {
			this.avgServiceTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_service_time_ns}
		 */
		public Builder avgServiceTimeNs(long value) {
			this.avgServiceTimeNs = value;
			return this;
		}

		/**
		 * Required - API name: {@code outgoing_searches}
		 */
		public Builder outgoingSearches(long value) {
			this.outgoingSearches = value;
			return this;
		}

		/**
		 * Required - API name: {@code rank}
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
	 * Json deserializer for {@link AdaptiveSelection}
	 */
	public static final JsonpDeserializer<AdaptiveSelection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AdaptiveSelection::setupAdaptiveSelectionDeserializer, Builder::build);

	protected static void setupAdaptiveSelectionDeserializer(DelegatingDeserializer<AdaptiveSelection.Builder> op) {

		op.add(Builder::avgQueueSize, JsonpDeserializer.longDeserializer(), "avg_queue_size");
		op.add(Builder::avgResponseTime, JsonpDeserializer.longDeserializer(), "avg_response_time");
		op.add(Builder::avgResponseTimeNs, JsonpDeserializer.longDeserializer(), "avg_response_time_ns");
		op.add(Builder::avgServiceTime, JsonpDeserializer.stringDeserializer(), "avg_service_time");
		op.add(Builder::avgServiceTimeNs, JsonpDeserializer.longDeserializer(), "avg_service_time_ns");
		op.add(Builder::outgoingSearches, JsonpDeserializer.longDeserializer(), "outgoing_searches");
		op.add(Builder::rank, JsonpDeserializer.stringDeserializer(), "rank");

	}

}
