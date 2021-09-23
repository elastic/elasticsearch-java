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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.NodeDiskUsage
public final class NodeDiskUsage implements JsonpSerializable {
	private final String nodeName;

	private final DiskUsage leastAvailable;

	private final DiskUsage mostAvailable;

	// ---------------------------------------------------------------------------------------------

	public NodeDiskUsage(Builder builder) {

		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.leastAvailable = Objects.requireNonNull(builder.leastAvailable, "least_available");
		this.mostAvailable = Objects.requireNonNull(builder.mostAvailable, "most_available");

	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code least_available}
	 */
	public DiskUsage leastAvailable() {
		return this.leastAvailable;
	}

	/**
	 * API name: {@code most_available}
	 */
	public DiskUsage mostAvailable() {
		return this.mostAvailable;
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

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("least_available");
		this.leastAvailable.serialize(generator, mapper);

		generator.writeKey("most_available");
		this.mostAvailable.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeDiskUsage}.
	 */
	public static class Builder implements ObjectBuilder<NodeDiskUsage> {
		private String nodeName;

		private DiskUsage leastAvailable;

		private DiskUsage mostAvailable;

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code least_available}
		 */
		public Builder leastAvailable(DiskUsage value) {
			this.leastAvailable = value;
			return this;
		}

		/**
		 * API name: {@code least_available}
		 */
		public Builder leastAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.leastAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * API name: {@code most_available}
		 */
		public Builder mostAvailable(DiskUsage value) {
			this.mostAvailable = value;
			return this;
		}

		/**
		 * API name: {@code most_available}
		 */
		public Builder mostAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.mostAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * Builds a {@link NodeDiskUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeDiskUsage build() {

			return new NodeDiskUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeDiskUsage}
	 */
	public static final JsonpDeserializer<NodeDiskUsage> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeDiskUsage::setupNodeDiskUsageDeserializer);

	protected static void setupNodeDiskUsageDeserializer(DelegatingDeserializer<NodeDiskUsage.Builder> op) {

		op.add(Builder::nodeName, JsonpDeserializer.stringDeserializer(), "node_name");
		op.add(Builder::leastAvailable, DiskUsage.DESERIALIZER, "least_available");
		op.add(Builder::mostAvailable, DiskUsage.DESERIALIZER, "most_available");

	}

}
