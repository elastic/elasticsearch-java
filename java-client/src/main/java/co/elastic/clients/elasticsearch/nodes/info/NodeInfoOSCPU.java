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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoOSCPU

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.info.NodeInfoOSCPU">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeInfoOSCPU implements JsonpSerializable {
	private final String cacheSize;

	private final int cacheSizeInBytes;

	private final int coresPerSocket;

	private final int mhz;

	private final String model;

	private final int totalCores;

	private final int totalSockets;

	private final String vendor;

	// ---------------------------------------------------------------------------------------------

	private NodeInfoOSCPU(Builder builder) {

		this.cacheSize = ApiTypeHelper.requireNonNull(builder.cacheSize, this, "cacheSize");
		this.cacheSizeInBytes = ApiTypeHelper.requireNonNull(builder.cacheSizeInBytes, this, "cacheSizeInBytes");
		this.coresPerSocket = ApiTypeHelper.requireNonNull(builder.coresPerSocket, this, "coresPerSocket");
		this.mhz = ApiTypeHelper.requireNonNull(builder.mhz, this, "mhz");
		this.model = ApiTypeHelper.requireNonNull(builder.model, this, "model");
		this.totalCores = ApiTypeHelper.requireNonNull(builder.totalCores, this, "totalCores");
		this.totalSockets = ApiTypeHelper.requireNonNull(builder.totalSockets, this, "totalSockets");
		this.vendor = ApiTypeHelper.requireNonNull(builder.vendor, this, "vendor");

	}

	public static NodeInfoOSCPU of(Function<Builder, ObjectBuilder<NodeInfoOSCPU>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cache_size}
	 */
	public final String cacheSize() {
		return this.cacheSize;
	}

	/**
	 * Required - API name: {@code cache_size_in_bytes}
	 */
	public final int cacheSizeInBytes() {
		return this.cacheSizeInBytes;
	}

	/**
	 * Required - API name: {@code cores_per_socket}
	 */
	public final int coresPerSocket() {
		return this.coresPerSocket;
	}

	/**
	 * Required - API name: {@code mhz}
	 */
	public final int mhz() {
		return this.mhz;
	}

	/**
	 * Required - API name: {@code model}
	 */
	public final String model() {
		return this.model;
	}

	/**
	 * Required - API name: {@code total_cores}
	 */
	public final int totalCores() {
		return this.totalCores;
	}

	/**
	 * Required - API name: {@code total_sockets}
	 */
	public final int totalSockets() {
		return this.totalSockets;
	}

	/**
	 * Required - API name: {@code vendor}
	 */
	public final String vendor() {
		return this.vendor;
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

		generator.writeKey("cache_size");
		generator.write(this.cacheSize);

		generator.writeKey("cache_size_in_bytes");
		generator.write(this.cacheSizeInBytes);

		generator.writeKey("cores_per_socket");
		generator.write(this.coresPerSocket);

		generator.writeKey("mhz");
		generator.write(this.mhz);

		generator.writeKey("model");
		generator.write(this.model);

		generator.writeKey("total_cores");
		generator.write(this.totalCores);

		generator.writeKey("total_sockets");
		generator.write(this.totalSockets);

		generator.writeKey("vendor");
		generator.write(this.vendor);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoOSCPU}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeInfoOSCPU> {
		private String cacheSize;

		private Integer cacheSizeInBytes;

		private Integer coresPerSocket;

		private Integer mhz;

		private String model;

		private Integer totalCores;

		private Integer totalSockets;

		private String vendor;

		/**
		 * Required - API name: {@code cache_size}
		 */
		public final Builder cacheSize(String value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code cache_size_in_bytes}
		 */
		public final Builder cacheSizeInBytes(int value) {
			this.cacheSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code cores_per_socket}
		 */
		public final Builder coresPerSocket(int value) {
			this.coresPerSocket = value;
			return this;
		}

		/**
		 * Required - API name: {@code mhz}
		 */
		public final Builder mhz(int value) {
			this.mhz = value;
			return this;
		}

		/**
		 * Required - API name: {@code model}
		 */
		public final Builder model(String value) {
			this.model = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_cores}
		 */
		public final Builder totalCores(int value) {
			this.totalCores = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_sockets}
		 */
		public final Builder totalSockets(int value) {
			this.totalSockets = value;
			return this;
		}

		/**
		 * Required - API name: {@code vendor}
		 */
		public final Builder vendor(String value) {
			this.vendor = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeInfoOSCPU}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoOSCPU build() {
			_checkSingleUse();

			return new NodeInfoOSCPU(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoOSCPU}
	 */
	public static final JsonpDeserializer<NodeInfoOSCPU> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoOSCPU::setupNodeInfoOSCPUDeserializer);

	protected static void setupNodeInfoOSCPUDeserializer(ObjectDeserializer<NodeInfoOSCPU.Builder> op) {

		op.add(Builder::cacheSize, JsonpDeserializer.stringDeserializer(), "cache_size");
		op.add(Builder::cacheSizeInBytes, JsonpDeserializer.integerDeserializer(), "cache_size_in_bytes");
		op.add(Builder::coresPerSocket, JsonpDeserializer.integerDeserializer(), "cores_per_socket");
		op.add(Builder::mhz, JsonpDeserializer.integerDeserializer(), "mhz");
		op.add(Builder::model, JsonpDeserializer.stringDeserializer(), "model");
		op.add(Builder::totalCores, JsonpDeserializer.integerDeserializer(), "total_cores");
		op.add(Builder::totalSockets, JsonpDeserializer.integerDeserializer(), "total_sockets");
		op.add(Builder::vendor, JsonpDeserializer.stringDeserializer(), "vendor");

	}

}
