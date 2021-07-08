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

package co.elastic.clients.elasticsearch.nodes.info;

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

// typedef: nodes.info.NodeInfoOSCPU
public final class NodeInfoOSCPU implements ToJsonp {
	private final String cacheSize;

	private final Number cacheSizeInBytes;

	private final Number coresPerSocket;

	private final Number mhz;

	private final String model;

	private final Number totalCores;

	private final Number totalSockets;

	private final String vendor;

	// ---------------------------------------------------------------------------------------------

	protected NodeInfoOSCPU(Builder builder) {

		this.cacheSize = Objects.requireNonNull(builder.cacheSize, "cache_size");
		this.cacheSizeInBytes = Objects.requireNonNull(builder.cacheSizeInBytes, "cache_size_in_bytes");
		this.coresPerSocket = Objects.requireNonNull(builder.coresPerSocket, "cores_per_socket");
		this.mhz = Objects.requireNonNull(builder.mhz, "mhz");
		this.model = Objects.requireNonNull(builder.model, "model");
		this.totalCores = Objects.requireNonNull(builder.totalCores, "total_cores");
		this.totalSockets = Objects.requireNonNull(builder.totalSockets, "total_sockets");
		this.vendor = Objects.requireNonNull(builder.vendor, "vendor");

	}

	/**
	 * API name: {@code cache_size}
	 */
	public String cacheSize() {
		return this.cacheSize;
	}

	/**
	 * API name: {@code cache_size_in_bytes}
	 */
	public Number cacheSizeInBytes() {
		return this.cacheSizeInBytes;
	}

	/**
	 * API name: {@code cores_per_socket}
	 */
	public Number coresPerSocket() {
		return this.coresPerSocket;
	}

	/**
	 * API name: {@code mhz}
	 */
	public Number mhz() {
		return this.mhz;
	}

	/**
	 * API name: {@code model}
	 */
	public String model() {
		return this.model;
	}

	/**
	 * API name: {@code total_cores}
	 */
	public Number totalCores() {
		return this.totalCores;
	}

	/**
	 * API name: {@code total_sockets}
	 */
	public Number totalSockets() {
		return this.totalSockets;
	}

	/**
	 * API name: {@code vendor}
	 */
	public String vendor() {
		return this.vendor;
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

		generator.writeKey("cache_size");
		generator.write(this.cacheSize);

		generator.writeKey("cache_size_in_bytes");
		generator.write(this.cacheSizeInBytes.doubleValue());

		generator.writeKey("cores_per_socket");
		generator.write(this.coresPerSocket.doubleValue());

		generator.writeKey("mhz");
		generator.write(this.mhz.doubleValue());

		generator.writeKey("model");
		generator.write(this.model);

		generator.writeKey("total_cores");
		generator.write(this.totalCores.doubleValue());

		generator.writeKey("total_sockets");
		generator.write(this.totalSockets.doubleValue());

		generator.writeKey("vendor");
		generator.write(this.vendor);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoOSCPU}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoOSCPU> {
		private String cacheSize;

		private Number cacheSizeInBytes;

		private Number coresPerSocket;

		private Number mhz;

		private String model;

		private Number totalCores;

		private Number totalSockets;

		private String vendor;

		/**
		 * API name: {@code cache_size}
		 */
		public Builder cacheSize(String value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * API name: {@code cache_size_in_bytes}
		 */
		public Builder cacheSizeInBytes(Number value) {
			this.cacheSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code cores_per_socket}
		 */
		public Builder coresPerSocket(Number value) {
			this.coresPerSocket = value;
			return this;
		}

		/**
		 * API name: {@code mhz}
		 */
		public Builder mhz(Number value) {
			this.mhz = value;
			return this;
		}

		/**
		 * API name: {@code model}
		 */
		public Builder model(String value) {
			this.model = value;
			return this;
		}

		/**
		 * API name: {@code total_cores}
		 */
		public Builder totalCores(Number value) {
			this.totalCores = value;
			return this;
		}

		/**
		 * API name: {@code total_sockets}
		 */
		public Builder totalSockets(Number value) {
			this.totalSockets = value;
			return this;
		}

		/**
		 * API name: {@code vendor}
		 */
		public Builder vendor(String value) {
			this.vendor = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoOSCPU}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoOSCPU build() {

			return new NodeInfoOSCPU(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeInfoOSCPU
	 */
	public static final JsonpDeserializer<NodeInfoOSCPU> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoOSCPU::setupNodeInfoOSCPUDeserializer);

	protected static void setupNodeInfoOSCPUDeserializer(DelegatingDeserializer<NodeInfoOSCPU.Builder> op) {

		op.add(Builder::cacheSize, JsonpDeserializer.stringDeserializer(), "cache_size");
		op.add(Builder::cacheSizeInBytes, JsonpDeserializer.numberDeserializer(), "cache_size_in_bytes");
		op.add(Builder::coresPerSocket, JsonpDeserializer.numberDeserializer(), "cores_per_socket");
		op.add(Builder::mhz, JsonpDeserializer.numberDeserializer(), "mhz");
		op.add(Builder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(Builder::totalCores, JsonpDeserializer.numberDeserializer(), "total_cores");
		op.add(Builder::totalSockets, JsonpDeserializer.numberDeserializer(), "total_sockets");
		op.add(Builder::vendor, JsonpDeserializer.stringDeserializer(), "vendor");

	}

}
