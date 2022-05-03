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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Transport

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Transport">API
 *      specification</a>
 */
@JsonpDeserializable
public class Transport implements JsonpSerializable {
	private final List<TransportHistogram> inboundHandlingTimeHistogram;

	private final List<TransportHistogram> outboundHandlingTimeHistogram;

	@Nullable
	private final Long rxCount;

	@Nullable
	private final String rxSize;

	@Nullable
	private final Long rxSizeInBytes;

	@Nullable
	private final Integer serverOpen;

	@Nullable
	private final Long txCount;

	@Nullable
	private final String txSize;

	@Nullable
	private final Long txSizeInBytes;

	@Nullable
	private final Long totalOutboundConnections;

	// ---------------------------------------------------------------------------------------------

	private Transport(Builder builder) {

		this.inboundHandlingTimeHistogram = ApiTypeHelper.unmodifiable(builder.inboundHandlingTimeHistogram);
		this.outboundHandlingTimeHistogram = ApiTypeHelper.unmodifiable(builder.outboundHandlingTimeHistogram);
		this.rxCount = builder.rxCount;
		this.rxSize = builder.rxSize;
		this.rxSizeInBytes = builder.rxSizeInBytes;
		this.serverOpen = builder.serverOpen;
		this.txCount = builder.txCount;
		this.txSize = builder.txSize;
		this.txSizeInBytes = builder.txSizeInBytes;
		this.totalOutboundConnections = builder.totalOutboundConnections;

	}

	public static Transport of(Function<Builder, ObjectBuilder<Transport>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code inbound_handling_time_histogram}
	 */
	public final List<TransportHistogram> inboundHandlingTimeHistogram() {
		return this.inboundHandlingTimeHistogram;
	}

	/**
	 * API name: {@code outbound_handling_time_histogram}
	 */
	public final List<TransportHistogram> outboundHandlingTimeHistogram() {
		return this.outboundHandlingTimeHistogram;
	}

	/**
	 * API name: {@code rx_count}
	 */
	@Nullable
	public final Long rxCount() {
		return this.rxCount;
	}

	/**
	 * API name: {@code rx_size}
	 */
	@Nullable
	public final String rxSize() {
		return this.rxSize;
	}

	/**
	 * API name: {@code rx_size_in_bytes}
	 */
	@Nullable
	public final Long rxSizeInBytes() {
		return this.rxSizeInBytes;
	}

	/**
	 * API name: {@code server_open}
	 */
	@Nullable
	public final Integer serverOpen() {
		return this.serverOpen;
	}

	/**
	 * API name: {@code tx_count}
	 */
	@Nullable
	public final Long txCount() {
		return this.txCount;
	}

	/**
	 * API name: {@code tx_size}
	 */
	@Nullable
	public final String txSize() {
		return this.txSize;
	}

	/**
	 * API name: {@code tx_size_in_bytes}
	 */
	@Nullable
	public final Long txSizeInBytes() {
		return this.txSizeInBytes;
	}

	/**
	 * API name: {@code total_outbound_connections}
	 */
	@Nullable
	public final Long totalOutboundConnections() {
		return this.totalOutboundConnections;
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

		if (ApiTypeHelper.isDefined(this.inboundHandlingTimeHistogram)) {
			generator.writeKey("inbound_handling_time_histogram");
			generator.writeStartArray();
			for (TransportHistogram item0 : this.inboundHandlingTimeHistogram) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.outboundHandlingTimeHistogram)) {
			generator.writeKey("outbound_handling_time_histogram");
			generator.writeStartArray();
			for (TransportHistogram item0 : this.outboundHandlingTimeHistogram) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.rxCount != null) {
			generator.writeKey("rx_count");
			generator.write(this.rxCount);

		}
		if (this.rxSize != null) {
			generator.writeKey("rx_size");
			generator.write(this.rxSize);

		}
		if (this.rxSizeInBytes != null) {
			generator.writeKey("rx_size_in_bytes");
			generator.write(this.rxSizeInBytes);

		}
		if (this.serverOpen != null) {
			generator.writeKey("server_open");
			generator.write(this.serverOpen);

		}
		if (this.txCount != null) {
			generator.writeKey("tx_count");
			generator.write(this.txCount);

		}
		if (this.txSize != null) {
			generator.writeKey("tx_size");
			generator.write(this.txSize);

		}
		if (this.txSizeInBytes != null) {
			generator.writeKey("tx_size_in_bytes");
			generator.write(this.txSizeInBytes);

		}
		if (this.totalOutboundConnections != null) {
			generator.writeKey("total_outbound_connections");
			generator.write(this.totalOutboundConnections);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Transport}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Transport> {
		@Nullable
		private List<TransportHistogram> inboundHandlingTimeHistogram;

		@Nullable
		private List<TransportHistogram> outboundHandlingTimeHistogram;

		@Nullable
		private Long rxCount;

		@Nullable
		private String rxSize;

		@Nullable
		private Long rxSizeInBytes;

		@Nullable
		private Integer serverOpen;

		@Nullable
		private Long txCount;

		@Nullable
		private String txSize;

		@Nullable
		private Long txSizeInBytes;

		@Nullable
		private Long totalOutboundConnections;

		/**
		 * API name: {@code inbound_handling_time_histogram}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>inboundHandlingTimeHistogram</code>.
		 */
		public final Builder inboundHandlingTimeHistogram(List<TransportHistogram> list) {
			this.inboundHandlingTimeHistogram = _listAddAll(this.inboundHandlingTimeHistogram, list);
			return this;
		}

		/**
		 * API name: {@code inbound_handling_time_histogram}
		 * <p>
		 * Adds one or more values to <code>inboundHandlingTimeHistogram</code>.
		 */
		public final Builder inboundHandlingTimeHistogram(TransportHistogram value, TransportHistogram... values) {
			this.inboundHandlingTimeHistogram = _listAdd(this.inboundHandlingTimeHistogram, value, values);
			return this;
		}

		/**
		 * API name: {@code inbound_handling_time_histogram}
		 * <p>
		 * Adds a value to <code>inboundHandlingTimeHistogram</code> using a builder
		 * lambda.
		 */
		public final Builder inboundHandlingTimeHistogram(
				Function<TransportHistogram.Builder, ObjectBuilder<TransportHistogram>> fn) {
			return inboundHandlingTimeHistogram(fn.apply(new TransportHistogram.Builder()).build());
		}

		/**
		 * API name: {@code outbound_handling_time_histogram}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>outboundHandlingTimeHistogram</code>.
		 */
		public final Builder outboundHandlingTimeHistogram(List<TransportHistogram> list) {
			this.outboundHandlingTimeHistogram = _listAddAll(this.outboundHandlingTimeHistogram, list);
			return this;
		}

		/**
		 * API name: {@code outbound_handling_time_histogram}
		 * <p>
		 * Adds one or more values to <code>outboundHandlingTimeHistogram</code>.
		 */
		public final Builder outboundHandlingTimeHistogram(TransportHistogram value, TransportHistogram... values) {
			this.outboundHandlingTimeHistogram = _listAdd(this.outboundHandlingTimeHistogram, value, values);
			return this;
		}

		/**
		 * API name: {@code outbound_handling_time_histogram}
		 * <p>
		 * Adds a value to <code>outboundHandlingTimeHistogram</code> using a builder
		 * lambda.
		 */
		public final Builder outboundHandlingTimeHistogram(
				Function<TransportHistogram.Builder, ObjectBuilder<TransportHistogram>> fn) {
			return outboundHandlingTimeHistogram(fn.apply(new TransportHistogram.Builder()).build());
		}

		/**
		 * API name: {@code rx_count}
		 */
		public final Builder rxCount(@Nullable Long value) {
			this.rxCount = value;
			return this;
		}

		/**
		 * API name: {@code rx_size}
		 */
		public final Builder rxSize(@Nullable String value) {
			this.rxSize = value;
			return this;
		}

		/**
		 * API name: {@code rx_size_in_bytes}
		 */
		public final Builder rxSizeInBytes(@Nullable Long value) {
			this.rxSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code server_open}
		 */
		public final Builder serverOpen(@Nullable Integer value) {
			this.serverOpen = value;
			return this;
		}

		/**
		 * API name: {@code tx_count}
		 */
		public final Builder txCount(@Nullable Long value) {
			this.txCount = value;
			return this;
		}

		/**
		 * API name: {@code tx_size}
		 */
		public final Builder txSize(@Nullable String value) {
			this.txSize = value;
			return this;
		}

		/**
		 * API name: {@code tx_size_in_bytes}
		 */
		public final Builder txSizeInBytes(@Nullable Long value) {
			this.txSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_outbound_connections}
		 */
		public final Builder totalOutboundConnections(@Nullable Long value) {
			this.totalOutboundConnections = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Transport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Transport build() {
			_checkSingleUse();

			return new Transport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Transport}
	 */
	public static final JsonpDeserializer<Transport> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Transport::setupTransportDeserializer);

	protected static void setupTransportDeserializer(ObjectDeserializer<Transport.Builder> op) {

		op.add(Builder::inboundHandlingTimeHistogram,
				JsonpDeserializer.arrayDeserializer(TransportHistogram._DESERIALIZER),
				"inbound_handling_time_histogram");
		op.add(Builder::outboundHandlingTimeHistogram,
				JsonpDeserializer.arrayDeserializer(TransportHistogram._DESERIALIZER),
				"outbound_handling_time_histogram");
		op.add(Builder::rxCount, JsonpDeserializer.longDeserializer(), "rx_count");
		op.add(Builder::rxSize, JsonpDeserializer.stringDeserializer(), "rx_size");
		op.add(Builder::rxSizeInBytes, JsonpDeserializer.longDeserializer(), "rx_size_in_bytes");
		op.add(Builder::serverOpen, JsonpDeserializer.integerDeserializer(), "server_open");
		op.add(Builder::txCount, JsonpDeserializer.longDeserializer(), "tx_count");
		op.add(Builder::txSize, JsonpDeserializer.stringDeserializer(), "tx_size");
		op.add(Builder::txSizeInBytes, JsonpDeserializer.longDeserializer(), "tx_size_in_bytes");
		op.add(Builder::totalOutboundConnections, JsonpDeserializer.longDeserializer(), "total_outbound_connections");

	}

}
