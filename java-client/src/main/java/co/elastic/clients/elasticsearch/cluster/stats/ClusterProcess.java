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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterProcess
@JsonpDeserializable
public final class ClusterProcess implements JsonpSerializable {
	private final ClusterProcessCpu cpu;

	private final ClusterProcessOpenFileDescriptors openFileDescriptors;

	// ---------------------------------------------------------------------------------------------

	public ClusterProcess(Builder builder) {

		this.cpu = Objects.requireNonNull(builder.cpu, "cpu");
		this.openFileDescriptors = Objects.requireNonNull(builder.openFileDescriptors, "open_file_descriptors");

	}

	public ClusterProcess(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code cpu}
	 */
	public ClusterProcessCpu cpu() {
		return this.cpu;
	}

	/**
	 * Required - API name: {@code open_file_descriptors}
	 */
	public ClusterProcessOpenFileDescriptors openFileDescriptors() {
		return this.openFileDescriptors;
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

		generator.writeKey("cpu");
		this.cpu.serialize(generator, mapper);

		generator.writeKey("open_file_descriptors");
		this.openFileDescriptors.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcess}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcess> {
		private ClusterProcessCpu cpu;

		private ClusterProcessOpenFileDescriptors openFileDescriptors;

		/**
		 * Required - API name: {@code cpu}
		 */
		public Builder cpu(ClusterProcessCpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * Required - API name: {@code cpu}
		 */
		public Builder cpu(Function<ClusterProcessCpu.Builder, ObjectBuilder<ClusterProcessCpu>> fn) {
			return this.cpu(fn.apply(new ClusterProcessCpu.Builder()).build());
		}

		/**
		 * Required - API name: {@code open_file_descriptors}
		 */
		public Builder openFileDescriptors(ClusterProcessOpenFileDescriptors value) {
			this.openFileDescriptors = value;
			return this;
		}

		/**
		 * Required - API name: {@code open_file_descriptors}
		 */
		public Builder openFileDescriptors(
				Function<ClusterProcessOpenFileDescriptors.Builder, ObjectBuilder<ClusterProcessOpenFileDescriptors>> fn) {
			return this.openFileDescriptors(fn.apply(new ClusterProcessOpenFileDescriptors.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterProcess}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcess build() {

			return new ClusterProcess(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcess}
	 */
	public static final JsonpDeserializer<ClusterProcess> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterProcess::setupClusterProcessDeserializer, Builder::build);

	protected static void setupClusterProcessDeserializer(DelegatingDeserializer<ClusterProcess.Builder> op) {

		op.add(Builder::cpu, ClusterProcessCpu._DESERIALIZER, "cpu");
		op.add(Builder::openFileDescriptors, ClusterProcessOpenFileDescriptors._DESERIALIZER, "open_file_descriptors");

	}

}
