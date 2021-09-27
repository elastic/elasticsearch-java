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

package co.elastic.clients.elasticsearch.cluster.stats;

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
import java.util.Objects;

// typedef: cluster.stats.ClusterFileSystem
@JsonpDeserializable
public final class ClusterFileSystem implements JsonpSerializable {
	private final long availableInBytes;

	private final long freeInBytes;

	private final long totalInBytes;

	// ---------------------------------------------------------------------------------------------

	public ClusterFileSystem(Builder builder) {

		this.availableInBytes = Objects.requireNonNull(builder.availableInBytes, "available_in_bytes");
		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");

	}

	/**
	 * API name: {@code available_in_bytes}
	 */
	public long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * API name: {@code free_in_bytes}
	 */
	public long freeInBytes() {
		return this.freeInBytes;
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

		generator.writeKey("available_in_bytes");
		generator.write(this.availableInBytes);

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterFileSystem}.
	 */
	public static class Builder implements ObjectBuilder<ClusterFileSystem> {
		private Long availableInBytes;

		private Long freeInBytes;

		private Long totalInBytes;

		/**
		 * API name: {@code available_in_bytes}
		 */
		public Builder availableInBytes(long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * API name: {@code free_in_bytes}
		 */
		public Builder freeInBytes(long value) {
			this.freeInBytes = value;
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
		 * Builds a {@link ClusterFileSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterFileSystem build() {

			return new ClusterFileSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterFileSystem}
	 */
	public static final JsonpDeserializer<ClusterFileSystem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterFileSystem::setupClusterFileSystemDeserializer, Builder::build);

	protected static void setupClusterFileSystemDeserializer(DelegatingDeserializer<ClusterFileSystem.Builder> op) {

		op.add(Builder::availableInBytes, JsonpDeserializer.longDeserializer(), "available_in_bytes");
		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");

	}

}
