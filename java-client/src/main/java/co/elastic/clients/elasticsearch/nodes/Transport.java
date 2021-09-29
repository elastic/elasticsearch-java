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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Transport
@JsonpDeserializable
public final class Transport implements JsonpSerializable {
	private final long rxCount;

	private final String rxSize;

	private final long rxSizeInBytes;

	private final int serverOpen;

	private final long txCount;

	private final String txSize;

	private final long txSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public Transport(Builder builder) {

		this.rxCount = Objects.requireNonNull(builder.rxCount, "rx_count");
		this.rxSize = Objects.requireNonNull(builder.rxSize, "rx_size");
		this.rxSizeInBytes = Objects.requireNonNull(builder.rxSizeInBytes, "rx_size_in_bytes");
		this.serverOpen = Objects.requireNonNull(builder.serverOpen, "server_open");
		this.txCount = Objects.requireNonNull(builder.txCount, "tx_count");
		this.txSize = Objects.requireNonNull(builder.txSize, "tx_size");
		this.txSizeInBytes = Objects.requireNonNull(builder.txSizeInBytes, "tx_size_in_bytes");

	}

	public Transport(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code rx_count}
	 */
	public long rxCount() {
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
	public long rxSizeInBytes() {
		return this.rxSizeInBytes;
	}

	/**
	 * API name: {@code server_open}
	 */
	public int serverOpen() {
		return this.serverOpen;
	}

	/**
	 * API name: {@code tx_count}
	 */
	public long txCount() {
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
	public long txSizeInBytes() {
		return this.txSizeInBytes;
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

		generator.writeKey("rx_count");
		generator.write(this.rxCount);

		generator.writeKey("rx_size");
		generator.write(this.rxSize);

		generator.writeKey("rx_size_in_bytes");
		generator.write(this.rxSizeInBytes);

		generator.writeKey("server_open");
		generator.write(this.serverOpen);

		generator.writeKey("tx_count");
		generator.write(this.txCount);

		generator.writeKey("tx_size");
		generator.write(this.txSize);

		generator.writeKey("tx_size_in_bytes");
		generator.write(this.txSizeInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Transport}.
	 */
	public static class Builder implements ObjectBuilder<Transport> {
		private Long rxCount;

		private String rxSize;

		private Long rxSizeInBytes;

		private Integer serverOpen;

		private Long txCount;

		private String txSize;

		private Long txSizeInBytes;

		/**
		 * API name: {@code rx_count}
		 */
		public Builder rxCount(long value) {
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
		public Builder rxSizeInBytes(long value) {
			this.rxSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code server_open}
		 */
		public Builder serverOpen(int value) {
			this.serverOpen = value;
			return this;
		}

		/**
		 * API name: {@code tx_count}
		 */
		public Builder txCount(long value) {
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
		public Builder txSizeInBytes(long value) {
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
	 * Json deserializer for {@link Transport}
	 */
	public static final JsonpDeserializer<Transport> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Transport::setupTransportDeserializer, Builder::build);

	protected static void setupTransportDeserializer(DelegatingDeserializer<Transport.Builder> op) {

		op.add(Builder::rxCount, JsonpDeserializer.longDeserializer(), "rx_count");
		op.add(Builder::rxSize, JsonpDeserializer.stringDeserializer(), "rx_size");
		op.add(Builder::rxSizeInBytes, JsonpDeserializer.longDeserializer(), "rx_size_in_bytes");
		op.add(Builder::serverOpen, JsonpDeserializer.integerDeserializer(), "server_open");
		op.add(Builder::txCount, JsonpDeserializer.longDeserializer(), "tx_count");
		op.add(Builder::txSize, JsonpDeserializer.stringDeserializer(), "tx_size");
		op.add(Builder::txSizeInBytes, JsonpDeserializer.longDeserializer(), "tx_size_in_bytes");

	}

}
