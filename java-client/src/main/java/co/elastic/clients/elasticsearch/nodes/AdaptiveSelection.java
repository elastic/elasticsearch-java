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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.AdaptiveSelection
@JsonpDeserializable
public class AdaptiveSelection implements JsonpSerializable {
	private final long avgQueueSize;

	private final long avgResponseTime;

	private final long avgResponseTimeNs;

	private final String avgServiceTime;

	private final long avgServiceTimeNs;

	private final long outgoingSearches;

	private final String rank;

	// ---------------------------------------------------------------------------------------------

	private AdaptiveSelection(Builder builder) {

		this.avgQueueSize = ModelTypeHelper.requireNonNull(builder.avgQueueSize, this, "avgQueueSize");
		this.avgResponseTime = ModelTypeHelper.requireNonNull(builder.avgResponseTime, this, "avgResponseTime");
		this.avgResponseTimeNs = ModelTypeHelper.requireNonNull(builder.avgResponseTimeNs, this, "avgResponseTimeNs");
		this.avgServiceTime = ModelTypeHelper.requireNonNull(builder.avgServiceTime, this, "avgServiceTime");
		this.avgServiceTimeNs = ModelTypeHelper.requireNonNull(builder.avgServiceTimeNs, this, "avgServiceTimeNs");
		this.outgoingSearches = ModelTypeHelper.requireNonNull(builder.outgoingSearches, this, "outgoingSearches");
		this.rank = ModelTypeHelper.requireNonNull(builder.rank, this, "rank");

	}

	public static AdaptiveSelection of(Function<Builder, ObjectBuilder<AdaptiveSelection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code avg_queue_size}
	 */
	public final long avgQueueSize() {
		return this.avgQueueSize;
	}

	/**
	 * Required - API name: {@code avg_response_time}
	 */
	public final long avgResponseTime() {
		return this.avgResponseTime;
	}

	/**
	 * Required - API name: {@code avg_response_time_ns}
	 */
	public final long avgResponseTimeNs() {
		return this.avgResponseTimeNs;
	}

	/**
	 * Required - API name: {@code avg_service_time}
	 */
	public final String avgServiceTime() {
		return this.avgServiceTime;
	}

	/**
	 * Required - API name: {@code avg_service_time_ns}
	 */
	public final long avgServiceTimeNs() {
		return this.avgServiceTimeNs;
	}

	/**
	 * Required - API name: {@code outgoing_searches}
	 */
	public final long outgoingSearches() {
		return this.outgoingSearches;
	}

	/**
	 * Required - API name: {@code rank}
	 */
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AdaptiveSelection> {
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
		public final Builder avgQueueSize(long value) {
			this.avgQueueSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_response_time}
		 */
		public final Builder avgResponseTime(long value) {
			this.avgResponseTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_response_time_ns}
		 */
		public final Builder avgResponseTimeNs(long value) {
			this.avgResponseTimeNs = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_service_time}
		 */
		public final Builder avgServiceTime(String value) {
			this.avgServiceTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_service_time_ns}
		 */
		public final Builder avgServiceTimeNs(long value) {
			this.avgServiceTimeNs = value;
			return this;
		}

		/**
		 * Required - API name: {@code outgoing_searches}
		 */
		public final Builder outgoingSearches(long value) {
			this.outgoingSearches = value;
			return this;
		}

		/**
		 * Required - API name: {@code rank}
		 */
		public final Builder rank(String value) {
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
			_checkSingleUse();

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
