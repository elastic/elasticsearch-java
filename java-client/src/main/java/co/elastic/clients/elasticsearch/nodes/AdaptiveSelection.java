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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
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

// typedef: nodes._types.AdaptiveSelection

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.AdaptiveSelection">API
 *      specification</a>
 */
@JsonpDeserializable
public class AdaptiveSelection implements JsonpSerializable {
	@Nullable
	private final Long avgQueueSize;

	@Nullable
	private final Time avgResponseTime;

	@Nullable
	private final Long avgResponseTimeNs;

	@Nullable
	private final Time avgServiceTime;

	@Nullable
	private final Long avgServiceTimeNs;

	@Nullable
	private final Long outgoingSearches;

	@Nullable
	private final String rank;

	// ---------------------------------------------------------------------------------------------

	private AdaptiveSelection(Builder builder) {

		this.avgQueueSize = builder.avgQueueSize;
		this.avgResponseTime = builder.avgResponseTime;
		this.avgResponseTimeNs = builder.avgResponseTimeNs;
		this.avgServiceTime = builder.avgServiceTime;
		this.avgServiceTimeNs = builder.avgServiceTimeNs;
		this.outgoingSearches = builder.outgoingSearches;
		this.rank = builder.rank;

	}

	public static AdaptiveSelection of(Function<Builder, ObjectBuilder<AdaptiveSelection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The exponentially weighted moving average queue size of search requests on
	 * the keyed node.
	 * <p>
	 * API name: {@code avg_queue_size}
	 */
	@Nullable
	public final Long avgQueueSize() {
		return this.avgQueueSize;
	}

	/**
	 * The exponentially weighted moving average response time of search requests on
	 * the keyed node.
	 * <p>
	 * API name: {@code avg_response_time}
	 */
	@Nullable
	public final Time avgResponseTime() {
		return this.avgResponseTime;
	}

	/**
	 * The exponentially weighted moving average response time, in nanoseconds, of
	 * search requests on the keyed node.
	 * <p>
	 * API name: {@code avg_response_time_ns}
	 */
	@Nullable
	public final Long avgResponseTimeNs() {
		return this.avgResponseTimeNs;
	}

	/**
	 * The exponentially weighted moving average service time of search requests on
	 * the keyed node.
	 * <p>
	 * API name: {@code avg_service_time}
	 */
	@Nullable
	public final Time avgServiceTime() {
		return this.avgServiceTime;
	}

	/**
	 * The exponentially weighted moving average service time, in nanoseconds, of
	 * search requests on the keyed node.
	 * <p>
	 * API name: {@code avg_service_time_ns}
	 */
	@Nullable
	public final Long avgServiceTimeNs() {
		return this.avgServiceTimeNs;
	}

	/**
	 * The number of outstanding search requests to the keyed node from the node
	 * these stats are for.
	 * <p>
	 * API name: {@code outgoing_searches}
	 */
	@Nullable
	public final Long outgoingSearches() {
		return this.outgoingSearches;
	}

	/**
	 * The rank of this node; used for shard selection when routing search requests.
	 * <p>
	 * API name: {@code rank}
	 */
	@Nullable
	public final String rank() {
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

		if (this.avgQueueSize != null) {
			generator.writeKey("avg_queue_size");
			generator.write(this.avgQueueSize);

		}
		if (this.avgResponseTime != null) {
			generator.writeKey("avg_response_time");
			this.avgResponseTime.serialize(generator, mapper);

		}
		if (this.avgResponseTimeNs != null) {
			generator.writeKey("avg_response_time_ns");
			generator.write(this.avgResponseTimeNs);

		}
		if (this.avgServiceTime != null) {
			generator.writeKey("avg_service_time");
			this.avgServiceTime.serialize(generator, mapper);

		}
		if (this.avgServiceTimeNs != null) {
			generator.writeKey("avg_service_time_ns");
			generator.write(this.avgServiceTimeNs);

		}
		if (this.outgoingSearches != null) {
			generator.writeKey("outgoing_searches");
			generator.write(this.outgoingSearches);

		}
		if (this.rank != null) {
			generator.writeKey("rank");
			generator.write(this.rank);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AdaptiveSelection}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AdaptiveSelection> {
		@Nullable
		private Long avgQueueSize;

		@Nullable
		private Time avgResponseTime;

		@Nullable
		private Long avgResponseTimeNs;

		@Nullable
		private Time avgServiceTime;

		@Nullable
		private Long avgServiceTimeNs;

		@Nullable
		private Long outgoingSearches;

		@Nullable
		private String rank;

		/**
		 * The exponentially weighted moving average queue size of search requests on
		 * the keyed node.
		 * <p>
		 * API name: {@code avg_queue_size}
		 */
		public final Builder avgQueueSize(@Nullable Long value) {
			this.avgQueueSize = value;
			return this;
		}

		/**
		 * The exponentially weighted moving average response time of search requests on
		 * the keyed node.
		 * <p>
		 * API name: {@code avg_response_time}
		 */
		public final Builder avgResponseTime(@Nullable Time value) {
			this.avgResponseTime = value;
			return this;
		}

		/**
		 * The exponentially weighted moving average response time of search requests on
		 * the keyed node.
		 * <p>
		 * API name: {@code avg_response_time}
		 */
		public final Builder avgResponseTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.avgResponseTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The exponentially weighted moving average response time, in nanoseconds, of
		 * search requests on the keyed node.
		 * <p>
		 * API name: {@code avg_response_time_ns}
		 */
		public final Builder avgResponseTimeNs(@Nullable Long value) {
			this.avgResponseTimeNs = value;
			return this;
		}

		/**
		 * The exponentially weighted moving average service time of search requests on
		 * the keyed node.
		 * <p>
		 * API name: {@code avg_service_time}
		 */
		public final Builder avgServiceTime(@Nullable Time value) {
			this.avgServiceTime = value;
			return this;
		}

		/**
		 * The exponentially weighted moving average service time of search requests on
		 * the keyed node.
		 * <p>
		 * API name: {@code avg_service_time}
		 */
		public final Builder avgServiceTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.avgServiceTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The exponentially weighted moving average service time, in nanoseconds, of
		 * search requests on the keyed node.
		 * <p>
		 * API name: {@code avg_service_time_ns}
		 */
		public final Builder avgServiceTimeNs(@Nullable Long value) {
			this.avgServiceTimeNs = value;
			return this;
		}

		/**
		 * The number of outstanding search requests to the keyed node from the node
		 * these stats are for.
		 * <p>
		 * API name: {@code outgoing_searches}
		 */
		public final Builder outgoingSearches(@Nullable Long value) {
			this.outgoingSearches = value;
			return this;
		}

		/**
		 * The rank of this node; used for shard selection when routing search requests.
		 * <p>
		 * API name: {@code rank}
		 */
		public final Builder rank(@Nullable String value) {
			this.rank = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AdaptiveSelection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AdaptiveSelection build() {
			_checkSingleUse();

			return new AdaptiveSelection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AdaptiveSelection}
	 */
	public static final JsonpDeserializer<AdaptiveSelection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AdaptiveSelection::setupAdaptiveSelectionDeserializer);

	protected static void setupAdaptiveSelectionDeserializer(ObjectDeserializer<AdaptiveSelection.Builder> op) {

		op.add(Builder::avgQueueSize, JsonpDeserializer.longDeserializer(), "avg_queue_size");
		op.add(Builder::avgResponseTime, Time._DESERIALIZER, "avg_response_time");
		op.add(Builder::avgResponseTimeNs, JsonpDeserializer.longDeserializer(), "avg_response_time_ns");
		op.add(Builder::avgServiceTime, Time._DESERIALIZER, "avg_service_time");
		op.add(Builder::avgServiceTimeNs, JsonpDeserializer.longDeserializer(), "avg_service_time_ns");
		op.add(Builder::outgoingSearches, JsonpDeserializer.longDeserializer(), "outgoing_searches");
		op.add(Builder::rank, JsonpDeserializer.stringDeserializer(), "rank");

	}

}
