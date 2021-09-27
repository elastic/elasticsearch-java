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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoMemory
@JsonpDeserializable
public final class NodeInfoMemory implements JsonpSerializable {
	private final String total;

	private final long totalInBytes;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoMemory(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");

	}

	/**
	 * API name: {@code total}
	 */
	public String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_bytes}
	 */
	public long totalInBytes() {
		return this.totalInBytes;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoMemory}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoMemory> {
		private String total;

		private Long totalInBytes;

		/**
		 * API name: {@code total}
		 */
		public Builder total(String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoMemory build() {

			return new NodeInfoMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoMemory}
	 */
	public static final JsonpDeserializer<NodeInfoMemory> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoMemory::setupNodeInfoMemoryDeserializer, Builder::build);

	protected static void setupNodeInfoMemoryDeserializer(DelegatingDeserializer<NodeInfoMemory.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");

	}

}
