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

package co.elastic.clients.elasticsearch.nodes.hot_threads;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.HotThread
@JsonpDeserializable
public final class HotThread implements JsonpSerializable {
	private final List<String> hosts;

	private final String nodeId;

	private final String nodeName;

	private final List<String> threads;

	// ---------------------------------------------------------------------------------------------

	public HotThread(Builder builder) {

		this.hosts = Objects.requireNonNull(builder.hosts, "hosts");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.threads = Objects.requireNonNull(builder.threads, "threads");

	}

	/**
	 * API name: {@code hosts}
	 */
	public List<String> hosts() {
		return this.hosts;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code threads}
	 */
	public List<String> threads() {
		return this.threads;
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

		generator.writeKey("hosts");
		generator.writeStartArray();
		for (String item0 : this.hosts) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("threads");
		generator.writeStartArray();
		for (String item0 : this.threads) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThread}.
	 */
	public static class Builder implements ObjectBuilder<HotThread> {
		private List<String> hosts;

		private String nodeId;

		private String nodeName;

		private List<String> threads;

		/**
		 * API name: {@code hosts}
		 */
		public Builder hosts(List<String> value) {
			this.hosts = value;
			return this;
		}

		/**
		 * API name: {@code hosts}
		 */
		public Builder hosts(String... value) {
			this.hosts = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hosts(List)}, creating the list if needed.
		 */
		public Builder addHosts(String value) {
			if (this.hosts == null) {
				this.hosts = new ArrayList<>();
			}
			this.hosts.add(value);
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(List<String> value) {
			this.threads = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(String... value) {
			this.threads = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #threads(List)}, creating the list if needed.
		 */
		public Builder addThreads(String value) {
			if (this.threads == null) {
				this.threads = new ArrayList<>();
			}
			this.threads.add(value);
			return this;
		}

		/**
		 * Builds a {@link HotThread}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThread build() {

			return new HotThread(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HotThread}
	 */
	public static final JsonpDeserializer<HotThread> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HotThread::setupHotThreadDeserializer, Builder::build);

	protected static void setupHotThreadDeserializer(DelegatingDeserializer<HotThread.Builder> op) {

		op.add(Builder::hosts, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "hosts");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::threads, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"threads");

	}

}
