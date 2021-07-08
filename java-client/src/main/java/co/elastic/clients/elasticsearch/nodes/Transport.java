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

// typedef: nodes._types.Transport
public final class Transport implements ToJsonp {
	private final Number rxCount;

	private final String rxSize;

	private final Number rxSizeInBytes;

	private final Number serverOpen;

	private final Number txCount;

	private final String txSize;

	private final Number txSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected Transport(Builder builder) {

		this.rxCount = Objects.requireNonNull(builder.rxCount, "rx_count");
		this.rxSize = Objects.requireNonNull(builder.rxSize, "rx_size");
		this.rxSizeInBytes = Objects.requireNonNull(builder.rxSizeInBytes, "rx_size_in_bytes");
		this.serverOpen = Objects.requireNonNull(builder.serverOpen, "server_open");
		this.txCount = Objects.requireNonNull(builder.txCount, "tx_count");
		this.txSize = Objects.requireNonNull(builder.txSize, "tx_size");
		this.txSizeInBytes = Objects.requireNonNull(builder.txSizeInBytes, "tx_size_in_bytes");

	}

	/**
	 * API name: {@code rx_count}
	 */
	public Number rxCount() {
		return this.rxCount;
	}

	/**
	 * API name: {@code rx_size}
	 */
	public String rxSize() {
		return this.rxSize;
	}

	/**
	 * API name: {@code rx_size_in_bytes}
	 */
	public Number rxSizeInBytes() {
		return this.rxSizeInBytes;
	}

	/**
	 * API name: {@code server_open}
	 */
	public Number serverOpen() {
		return this.serverOpen;
	}

	/**
	 * API name: {@code tx_count}
	 */
	public Number txCount() {
		return this.txCount;
	}

	/**
	 * API name: {@code tx_size}
	 */
	public String txSize() {
		return this.txSize;
	}

	/**
	 * API name: {@code tx_size_in_bytes}
	 */
	public Number txSizeInBytes() {
		return this.txSizeInBytes;
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

		generator.writeKey("rx_count");
		generator.write(this.rxCount.doubleValue());

		generator.writeKey("rx_size");
		generator.write(this.rxSize);

		generator.writeKey("rx_size_in_bytes");
		generator.write(this.rxSizeInBytes.doubleValue());

		generator.writeKey("server_open");
		generator.write(this.serverOpen.doubleValue());

		generator.writeKey("tx_count");
		generator.write(this.txCount.doubleValue());

		generator.writeKey("tx_size");
		generator.write(this.txSize);

		generator.writeKey("tx_size_in_bytes");
		generator.write(this.txSizeInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Transport}.
	 */
	public static class Builder implements ObjectBuilder<Transport> {
		private Number rxCount;

		private String rxSize;

		private Number rxSizeInBytes;

		private Number serverOpen;

		private Number txCount;

		private String txSize;

		private Number txSizeInBytes;

		/**
		 * API name: {@code rx_count}
		 */
		public Builder rxCount(Number value) {
			this.rxCount = value;
			return this;
		}

		/**
		 * API name: {@code rx_size}
		 */
		public Builder rxSize(String value) {
			this.rxSize = value;
			return this;
		}

		/**
		 * API name: {@code rx_size_in_bytes}
		 */
		public Builder rxSizeInBytes(Number value) {
			this.rxSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code server_open}
		 */
		public Builder serverOpen(Number value) {
			this.serverOpen = value;
			return this;
		}

		/**
		 * API name: {@code tx_count}
		 */
		public Builder txCount(Number value) {
			this.txCount = value;
			return this;
		}

		/**
		 * API name: {@code tx_size}
		 */
		public Builder txSize(String value) {
			this.txSize = value;
			return this;
		}

		/**
		 * API name: {@code tx_size_in_bytes}
		 */
		public Builder txSizeInBytes(Number value) {
			this.txSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link Transport}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Transport build() {

			return new Transport(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Transport
	 */
	public static final JsonpDeserializer<Transport> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Transport::setupTransportDeserializer);

	protected static void setupTransportDeserializer(DelegatingDeserializer<Transport.Builder> op) {

		op.add(Builder::rxCount, JsonpDeserializer.numberDeserializer(), "rx_count");
		op.add(Builder::rxSize, JsonpDeserializer.stringDeserializer(), "rx_size");
		op.add(Builder::rxSizeInBytes, JsonpDeserializer.numberDeserializer(), "rx_size_in_bytes");
		op.add(Builder::serverOpen, JsonpDeserializer.numberDeserializer(), "server_open");
		op.add(Builder::txCount, JsonpDeserializer.numberDeserializer(), "tx_count");
		op.add(Builder::txSize, JsonpDeserializer.stringDeserializer(), "tx_size");
		op.add(Builder::txSizeInBytes, JsonpDeserializer.numberDeserializer(), "tx_size_in_bytes");

	}

}
