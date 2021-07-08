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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterProcess
public final class ClusterProcess implements ToJsonp {
	private final ClusterProcessCpu cpu;

	private final ClusterProcessOpenFileDescriptors openFileDescriptors;

	// ---------------------------------------------------------------------------------------------

	protected ClusterProcess(Builder builder) {

		this.cpu = Objects.requireNonNull(builder.cpu, "cpu");
		this.openFileDescriptors = Objects.requireNonNull(builder.openFileDescriptors, "open_file_descriptors");

	}

	/**
	 * API name: {@code cpu}
	 */
	public ClusterProcessCpu cpu() {
		return this.cpu;
	}

	/**
	 * API name: {@code open_file_descriptors}
	 */
	public ClusterProcessOpenFileDescriptors openFileDescriptors() {
		return this.openFileDescriptors;
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

		generator.writeKey("cpu");
		this.cpu.toJsonp(generator, mapper);

		generator.writeKey("open_file_descriptors");
		this.openFileDescriptors.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcess}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcess> {
		private ClusterProcessCpu cpu;

		private ClusterProcessOpenFileDescriptors openFileDescriptors;

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(ClusterProcessCpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(Function<ClusterProcessCpu.Builder, ObjectBuilder<ClusterProcessCpu>> fn) {
			return this.cpu(fn.apply(new ClusterProcessCpu.Builder()).build());
		}

		/**
		 * API name: {@code open_file_descriptors}
		 */
		public Builder openFileDescriptors(ClusterProcessOpenFileDescriptors value) {
			this.openFileDescriptors = value;
			return this;
		}

		/**
		 * API name: {@code open_file_descriptors}
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
	 * Json deserializer for ClusterProcess
	 */
	public static final JsonpDeserializer<ClusterProcess> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterProcess::setupClusterProcessDeserializer);

	protected static void setupClusterProcessDeserializer(DelegatingDeserializer<ClusterProcess.Builder> op) {

		op.add(Builder::cpu, ClusterProcessCpu.DESERIALIZER, "cpu");
		op.add(Builder::openFileDescriptors, ClusterProcessOpenFileDescriptors.DESERIALIZER, "open_file_descriptors");

	}

}
