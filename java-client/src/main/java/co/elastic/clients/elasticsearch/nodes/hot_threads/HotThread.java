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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.HotThread

/**
 *
 * @see <a href="../../doc-files/api-spec.html#nodes.hot_threads.HotThread">API
 *      specification</a>
 */
@JsonpDeserializable
public class HotThread implements JsonpSerializable {
	private final List<String> hosts;

	private final String nodeId;

	private final String nodeName;

	private final List<String> threads;

	// ---------------------------------------------------------------------------------------------

	private HotThread(Builder builder) {

		this.hosts = ApiTypeHelper.unmodifiableRequired(builder.hosts, this, "hosts");
		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.nodeName = ApiTypeHelper.requireNonNull(builder.nodeName, this, "nodeName");
		this.threads = ApiTypeHelper.unmodifiableRequired(builder.threads, this, "threads");

	}

	public static HotThread of(Function<Builder, ObjectBuilder<HotThread>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code hosts}
	 */
	public final List<String> hosts() {
		return this.hosts;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code node_name}
	 */
	public final String nodeName() {
		return this.nodeName;
	}

	/**
	 * Required - API name: {@code threads}
	 */
	public final List<String> threads() {
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

		if (ApiTypeHelper.isDefined(this.hosts)) {
			generator.writeKey("hosts");
			generator.writeStartArray();
			for (String item0 : this.hosts) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		if (ApiTypeHelper.isDefined(this.threads)) {
			generator.writeKey("threads");
			generator.writeStartArray();
			for (String item0 : this.threads) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThread}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HotThread> {
		private List<String> hosts;

		private String nodeId;

		private String nodeName;

		private List<String> threads;

		/**
		 * Required - API name: {@code hosts}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>hosts</code>.
		 */
		public final Builder hosts(List<String> list) {
			this.hosts = _listAddAll(this.hosts, list);
			return this;
		}

		/**
		 * Required - API name: {@code hosts}
		 * <p>
		 * Adds one or more values to <code>hosts</code>.
		 */
		public final Builder hosts(String value, String... values) {
			this.hosts = _listAdd(this.hosts, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_name}
		 */
		public final Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * Required - API name: {@code threads}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>threads</code>.
		 */
		public final Builder threads(List<String> list) {
			this.threads = _listAddAll(this.threads, list);
			return this;
		}

		/**
		 * Required - API name: {@code threads}
		 * <p>
		 * Adds one or more values to <code>threads</code>.
		 */
		public final Builder threads(String value, String... values) {
			this.threads = _listAdd(this.threads, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HotThread}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThread build() {
			_checkSingleUse();

			return new HotThread(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HotThread}
	 */
	public static final JsonpDeserializer<HotThread> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HotThread::setupHotThreadDeserializer);

	protected static void setupHotThreadDeserializer(ObjectDeserializer<HotThread.Builder> op) {

		op.add(Builder::hosts, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "hosts");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::threads, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"threads");

	}

}
