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

package co.elastic.clients.elasticsearch.cat.thread_pool;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.thread_pool.ThreadPoolRecord
public final class ThreadPoolRecord implements ToJsonp {
	@Nullable
	private final String nodeName;

	@Nullable
	private final String nodeId;

	@Nullable
	private final String ephemeralNodeId;

	@Nullable
	private final String pid;

	@Nullable
	private final String host;

	@Nullable
	private final String ip;

	@Nullable
	private final String port;

	@Nullable
	private final String name;

	@Nullable
	private final String type;

	@Nullable
	private final String active;

	@Nullable
	private final String poolSize;

	@Nullable
	private final String queue;

	@Nullable
	private final String queueSize;

	@Nullable
	private final String rejected;

	@Nullable
	private final String largest;

	@Nullable
	private final String completed;

	@Nullable
	private final String core;

	@Nullable
	private final String max;

	@Nullable
	private final String size;

	@Nullable
	private final String keepAlive;

	// ---------------------------------------------------------------------------------------------

	protected ThreadPoolRecord(Builder builder) {

		this.nodeName = builder.nodeName;
		this.nodeId = builder.nodeId;
		this.ephemeralNodeId = builder.ephemeralNodeId;
		this.pid = builder.pid;
		this.host = builder.host;
		this.ip = builder.ip;
		this.port = builder.port;
		this.name = builder.name;
		this.type = builder.type;
		this.active = builder.active;
		this.poolSize = builder.poolSize;
		this.queue = builder.queue;
		this.queueSize = builder.queueSize;
		this.rejected = builder.rejected;
		this.largest = builder.largest;
		this.completed = builder.completed;
		this.core = builder.core;
		this.max = builder.max;
		this.size = builder.size;
		this.keepAlive = builder.keepAlive;

	}

	/**
	 * node name
	 *
	 * API name: {@code node_name}
	 */
	@Nullable
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * persistent node id
	 *
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * ephemeral node id
	 *
	 * API name: {@code ephemeral_node_id}
	 */
	@Nullable
	public String ephemeralNodeId() {
		return this.ephemeralNodeId;
	}

	/**
	 * process id
	 *
	 * API name: {@code pid}
	 */
	@Nullable
	public String pid() {
		return this.pid;
	}

	/**
	 * host name
	 *
	 * API name: {@code host}
	 */
	@Nullable
	public String host() {
		return this.host;
	}

	/**
	 * ip address
	 *
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * bound transport port
	 *
	 * API name: {@code port}
	 */
	@Nullable
	public String port() {
		return this.port;
	}

	/**
	 * thread pool name
	 *
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * thread pool type
	 *
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * number of active threads
	 *
	 * API name: {@code active}
	 */
	@Nullable
	public String active() {
		return this.active;
	}

	/**
	 * number of threads
	 *
	 * API name: {@code pool_size}
	 */
	@Nullable
	public String poolSize() {
		return this.poolSize;
	}

	/**
	 * number of tasks currently in queue
	 *
	 * API name: {@code queue}
	 */
	@Nullable
	public String queue() {
		return this.queue;
	}

	/**
	 * maximum number of tasks permitted in queue
	 *
	 * API name: {@code queue_size}
	 */
	@Nullable
	public String queueSize() {
		return this.queueSize;
	}

	/**
	 * number of rejected tasks
	 *
	 * API name: {@code rejected}
	 */
	@Nullable
	public String rejected() {
		return this.rejected;
	}

	/**
	 * highest number of seen active threads
	 *
	 * API name: {@code largest}
	 */
	@Nullable
	public String largest() {
		return this.largest;
	}

	/**
	 * number of completed tasks
	 *
	 * API name: {@code completed}
	 */
	@Nullable
	public String completed() {
		return this.completed;
	}

	/**
	 * core number of threads in a scaling thread pool
	 *
	 * API name: {@code core}
	 */
	@Nullable
	public String core() {
		return this.core;
	}

	/**
	 * maximum number of threads in a scaling thread pool
	 *
	 * API name: {@code max}
	 */
	@Nullable
	public String max() {
		return this.max;
	}

	/**
	 * number of threads in a fixed thread pool
	 *
	 * API name: {@code size}
	 */
	@Nullable
	public String size() {
		return this.size;
	}

	/**
	 * thread keep alive time
	 *
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
		return this.keepAlive;
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

		if (this.nodeName != null) {

			generator.writeKey("node_name");
			generator.write(this.nodeName);

		}
		if (this.nodeId != null) {

			generator.writeKey("node_id");
			generator.write(this.nodeId);

		}
		if (this.ephemeralNodeId != null) {

			generator.writeKey("ephemeral_node_id");
			generator.write(this.ephemeralNodeId);

		}
		if (this.pid != null) {

			generator.writeKey("pid");
			generator.write(this.pid);

		}
		if (this.host != null) {

			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.port != null) {

			generator.writeKey("port");
			generator.write(this.port);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.active != null) {

			generator.writeKey("active");
			generator.write(this.active);

		}
		if (this.poolSize != null) {

			generator.writeKey("pool_size");
			generator.write(this.poolSize);

		}
		if (this.queue != null) {

			generator.writeKey("queue");
			generator.write(this.queue);

		}
		if (this.queueSize != null) {

			generator.writeKey("queue_size");
			generator.write(this.queueSize);

		}
		if (this.rejected != null) {

			generator.writeKey("rejected");
			generator.write(this.rejected);

		}
		if (this.largest != null) {

			generator.writeKey("largest");
			generator.write(this.largest);

		}
		if (this.completed != null) {

			generator.writeKey("completed");
			generator.write(this.completed);

		}
		if (this.core != null) {

			generator.writeKey("core");
			generator.write(this.core);

		}
		if (this.max != null) {

			generator.writeKey("max");
			generator.write(this.max);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.keepAlive != null) {

			generator.writeKey("keep_alive");
			generator.write(this.keepAlive);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadPoolRecord}.
	 */
	public static class Builder implements ObjectBuilder<ThreadPoolRecord> {
		@Nullable
		private String nodeName;

		@Nullable
		private String nodeId;

		@Nullable
		private String ephemeralNodeId;

		@Nullable
		private String pid;

		@Nullable
		private String host;

		@Nullable
		private String ip;

		@Nullable
		private String port;

		@Nullable
		private String name;

		@Nullable
		private String type;

		@Nullable
		private String active;

		@Nullable
		private String poolSize;

		@Nullable
		private String queue;

		@Nullable
		private String queueSize;

		@Nullable
		private String rejected;

		@Nullable
		private String largest;

		@Nullable
		private String completed;

		@Nullable
		private String core;

		@Nullable
		private String max;

		@Nullable
		private String size;

		@Nullable
		private String keepAlive;

		/**
		 * node name
		 *
		 * API name: {@code node_name}
		 */
		public Builder nodeName(@Nullable String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * persistent node id
		 *
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * ephemeral node id
		 *
		 * API name: {@code ephemeral_node_id}
		 */
		public Builder ephemeralNodeId(@Nullable String value) {
			this.ephemeralNodeId = value;
			return this;
		}

		/**
		 * process id
		 *
		 * API name: {@code pid}
		 */
		public Builder pid(@Nullable String value) {
			this.pid = value;
			return this;
		}

		/**
		 * host name
		 *
		 * API name: {@code host}
		 */
		public Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * ip address
		 *
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * bound transport port
		 *
		 * API name: {@code port}
		 */
		public Builder port(@Nullable String value) {
			this.port = value;
			return this;
		}

		/**
		 * thread pool name
		 *
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * thread pool type
		 *
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * number of active threads
		 *
		 * API name: {@code active}
		 */
		public Builder active(@Nullable String value) {
			this.active = value;
			return this;
		}

		/**
		 * number of threads
		 *
		 * API name: {@code pool_size}
		 */
		public Builder poolSize(@Nullable String value) {
			this.poolSize = value;
			return this;
		}

		/**
		 * number of tasks currently in queue
		 *
		 * API name: {@code queue}
		 */
		public Builder queue(@Nullable String value) {
			this.queue = value;
			return this;
		}

		/**
		 * maximum number of tasks permitted in queue
		 *
		 * API name: {@code queue_size}
		 */
		public Builder queueSize(@Nullable String value) {
			this.queueSize = value;
			return this;
		}

		/**
		 * number of rejected tasks
		 *
		 * API name: {@code rejected}
		 */
		public Builder rejected(@Nullable String value) {
			this.rejected = value;
			return this;
		}

		/**
		 * highest number of seen active threads
		 *
		 * API name: {@code largest}
		 */
		public Builder largest(@Nullable String value) {
			this.largest = value;
			return this;
		}

		/**
		 * number of completed tasks
		 *
		 * API name: {@code completed}
		 */
		public Builder completed(@Nullable String value) {
			this.completed = value;
			return this;
		}

		/**
		 * core number of threads in a scaling thread pool
		 *
		 * API name: {@code core}
		 */
		public Builder core(@Nullable String value) {
			this.core = value;
			return this;
		}

		/**
		 * maximum number of threads in a scaling thread pool
		 *
		 * API name: {@code max}
		 */
		public Builder max(@Nullable String value) {
			this.max = value;
			return this;
		}

		/**
		 * number of threads in a fixed thread pool
		 *
		 * API name: {@code size}
		 */
		public Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * thread keep alive time
		 *
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Builds a {@link ThreadPoolRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolRecord build() {

			return new ThreadPoolRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ThreadPoolRecord
	 */
	public static final JsonpDeserializer<ThreadPoolRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ThreadPoolRecord::setupThreadPoolRecordDeserializer);

	protected static void setupThreadPoolRecordDeserializer(DelegatingDeserializer<ThreadPoolRecord.Builder> op) {

		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name", "nn");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id", "id");
		op.add(Builder::ephemeralNodeId, JsonpDeserializer.stringDeserializer(), "ephemeral_node_id", "eid");
		op.add(Builder::pid, JsonpDeserializer.stringDeserializer(), "pid", "p");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host", "h");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip", "i");
		op.add(Builder::port, JsonpDeserializer.stringDeserializer(), "port", "po");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name", "n");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "t");
		op.add(Builder::active, JsonpDeserializer.stringDeserializer(), "active", "a");
		op.add(Builder::poolSize, JsonpDeserializer.stringDeserializer(), "pool_size", "psz");
		op.add(Builder::queue, JsonpDeserializer.stringDeserializer(), "queue", "q");
		op.add(Builder::queueSize, JsonpDeserializer.stringDeserializer(), "queue_size", "qs");
		op.add(Builder::rejected, JsonpDeserializer.stringDeserializer(), "rejected", "r");
		op.add(Builder::largest, JsonpDeserializer.stringDeserializer(), "largest", "l");
		op.add(Builder::completed, JsonpDeserializer.stringDeserializer(), "completed", "c");
		op.add(Builder::core, JsonpDeserializer.stringDeserializer(), "core", "cr");
		op.add(Builder::max, JsonpDeserializer.stringDeserializer(), "max", "mx");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size", "sz");
		op.add(Builder::keepAlive, JsonpDeserializer.stringDeserializer(), "keep_alive", "ka");

	}

}
