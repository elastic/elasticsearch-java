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

package co.elastic.clients.elasticsearch.ml.get_memory_stats;

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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_memory_stats.Memory

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.get_memory_stats.Memory">API
 *      specification</a>
 */
@JsonpDeserializable
public class Memory implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final JvmStats jvm;

	private final MemStats mem;

	private final String name;

	private final List<String> roles;

	private final String transportAddress;

	private final String ephemeralId;

	// ---------------------------------------------------------------------------------------------

	private Memory(Builder builder) {

		this.attributes = ApiTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");
		this.jvm = ApiTypeHelper.requireNonNull(builder.jvm, this, "jvm");
		this.mem = ApiTypeHelper.requireNonNull(builder.mem, this, "mem");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.transportAddress = ApiTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");
		this.ephemeralId = ApiTypeHelper.requireNonNull(builder.ephemeralId, this, "ephemeralId");

	}

	public static Memory of(Function<Builder, ObjectBuilder<Memory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Required - Contains Java Virtual Machine (JVM) statistics for the node.
	 * <p>
	 * API name: {@code jvm}
	 */
	public final JvmStats jvm() {
		return this.jvm;
	}

	/**
	 * Required - Contains statistics about memory usage for the node.
	 * <p>
	 * API name: {@code mem}
	 */
	public final MemStats mem() {
		return this.mem;
	}

	/**
	 * Required - Human-readable identifier for the node. Based on the Node name
	 * setting setting.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Roles assigned to the node.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - The host and port where transport HTTP connections are accepted.
	 * <p>
	 * API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Required - API name: {@code ephemeral_id}
	 */
	public final String ephemeralId() {
		return this.ephemeralId;
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

		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("jvm");
		this.jvm.serialize(generator, mapper);

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("name");
		generator.write(this.name);

		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("ephemeral_id");
		generator.write(this.ephemeralId);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Memory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Memory> {
		private Map<String, String> attributes;

		private JvmStats jvm;

		private MemStats mem;

		private String name;

		private List<String> roles;

		private String transportAddress;

		private String ephemeralId;

		/**
		 * Required - API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Required - Contains Java Virtual Machine (JVM) statistics for the node.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(JvmStats value) {
			this.jvm = value;
			return this;
		}

		/**
		 * Required - Contains Java Virtual Machine (JVM) statistics for the node.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(Function<JvmStats.Builder, ObjectBuilder<JvmStats>> fn) {
			return this.jvm(fn.apply(new JvmStats.Builder()).build());
		}

		/**
		 * Required - Contains statistics about memory usage for the node.
		 * <p>
		 * API name: {@code mem}
		 */
		public final Builder mem(MemStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * Required - Contains statistics about memory usage for the node.
		 * <p>
		 * API name: {@code mem}
		 */
		public final Builder mem(Function<MemStats.Builder, ObjectBuilder<MemStats>> fn) {
			return this.mem(fn.apply(new MemStats.Builder()).build());
		}

		/**
		 * Required - Human-readable identifier for the node. Based on the Node name
		 * setting setting.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Roles assigned to the node.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - Roles assigned to the node.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Required - The host and port where transport HTTP connections are accepted.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code ephemeral_id}
		 */
		public final Builder ephemeralId(String value) {
			this.ephemeralId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Memory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Memory build() {
			_checkSingleUse();

			return new Memory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Memory}
	 */
	public static final JsonpDeserializer<Memory> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Memory::setupMemoryDeserializer);

	protected static void setupMemoryDeserializer(ObjectDeserializer<Memory.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::jvm, JvmStats._DESERIALIZER, "jvm");
		op.add(Builder::mem, MemStats._DESERIALIZER, "mem");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::ephemeralId, JsonpDeserializer.stringDeserializer(), "ephemeral_id");

	}

}
