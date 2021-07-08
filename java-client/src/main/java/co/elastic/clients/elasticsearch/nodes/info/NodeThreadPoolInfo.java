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

// typedef: nodes.info.NodeThreadPoolInfo
public final class NodeThreadPoolInfo implements ToJsonp {
	@Nullable
	private final Number core;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Number max;

	private final Number queueSize;

	@Nullable
	private final Number size;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected NodeThreadPoolInfo(Builder builder) {

		this.core = builder.core;
		this.keepAlive = builder.keepAlive;
		this.max = builder.max;
		this.queueSize = Objects.requireNonNull(builder.queueSize, "queue_size");
		this.size = builder.size;
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code core}
	 */
	@Nullable
	public Number core() {
		return this.core;
	}

	/**
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
		return this.keepAlive;
	}

	/**
	 * API name: {@code max}
	 */
	@Nullable
	public Number max() {
		return this.max;
	}

	/**
	 * API name: {@code queue_size}
	 */
	public Number queueSize() {
		return this.queueSize;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		if (this.core != null) {

			generator.writeKey("core");
			generator.write(this.core.doubleValue());

		}
		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}
		if (this.max != null) {

			generator.writeKey("max");
			generator.write(this.max.doubleValue());

		}

		generator.writeKey("queue_size");
		generator.write(this.queueSize.doubleValue());

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeThreadPoolInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeThreadPoolInfo> {
		@Nullable
		private Number core;

		@Nullable
		private String keepAlive;

		@Nullable
		private Number max;

		private Number queueSize;

		@Nullable
		private Number size;

		private String type;

		/**
		 * API name: {@code core}
		 */
		public Builder core(@Nullable Number value) {
			this.core = value;
			return this;
		}

		/**
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * API name: {@code max}
		 */
		public Builder max(@Nullable Number value) {
			this.max = value;
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
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link NodeThreadPoolInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeThreadPoolInfo build() {

			return new NodeThreadPoolInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for NodeThreadPoolInfo
	 */
	public static final JsonpDeserializer<NodeThreadPoolInfo> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeThreadPoolInfo::setupNodeThreadPoolInfoDeserializer);

	protected static void setupNodeThreadPoolInfoDeserializer(DelegatingDeserializer<NodeThreadPoolInfo.Builder> op) {

		op.add(Builder::core, JsonpDeserializer.numberDeserializer(), "core");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive");
		op.add(Builder::max, JsonpDeserializer.numberDeserializer(), "max");
		op.add(Builder::queueSize, JsonpDeserializer.numberDeserializer(), "queue_size");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
