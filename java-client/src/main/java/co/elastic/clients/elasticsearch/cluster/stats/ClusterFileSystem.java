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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterFileSystem
@JsonpDeserializable
public class ClusterFileSystem implements JsonpSerializable {
	private final long availableInBytes;

	private final long freeInBytes;

	private final long totalInBytes;

	// ---------------------------------------------------------------------------------------------

	private ClusterFileSystem(Builder builder) {

		this.availableInBytes = ModelTypeHelper.requireNonNull(builder.availableInBytes, this, "availableInBytes");
		this.freeInBytes = ModelTypeHelper.requireNonNull(builder.freeInBytes, this, "freeInBytes");
		this.totalInBytes = ModelTypeHelper.requireNonNull(builder.totalInBytes, this, "totalInBytes");

	}

	public static ClusterFileSystem of(Function<Builder, ObjectBuilder<ClusterFileSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code available_in_bytes}
	 */
	public final long availableInBytes() {
		return this.availableInBytes;
	}

	/**
	 * Required - API name: {@code free_in_bytes}
	 */
	public final long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Required - API name: {@code total_in_bytes}
	 */
	public final long totalInBytes() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterFileSystem> {
		private Long availableInBytes;

		private Long freeInBytes;

		private Long totalInBytes;

		/**
		 * Required - API name: {@code available_in_bytes}
		 */
		public final Builder availableInBytes(long value) {
			this.availableInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code free_in_bytes}
		 */
		public final Builder freeInBytes(long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_in_bytes}
		 */
		public final Builder totalInBytes(long value) {
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
			_checkSingleUse();

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
