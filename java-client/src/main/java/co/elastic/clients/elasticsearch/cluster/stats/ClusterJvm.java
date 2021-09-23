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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterJvm
public final class ClusterJvm implements JsonpSerializable {
	private final Number maxUptimeInMillis;

	private final ClusterJvmMemory mem;

	private final Number threads;

	private final List<ClusterJvmVersion> versions;

	// ---------------------------------------------------------------------------------------------

	public ClusterJvm(Builder builder) {

		this.maxUptimeInMillis = Objects.requireNonNull(builder.maxUptimeInMillis, "max_uptime_in_millis");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.threads = Objects.requireNonNull(builder.threads, "threads");
		this.versions = Objects.requireNonNull(builder.versions, "versions");

	}

	/**
	 * API name: {@code max_uptime_in_millis}
	 */
	public Number maxUptimeInMillis() {
		return this.maxUptimeInMillis;
	}

	/**
	 * API name: {@code mem}
	 */
	public ClusterJvmMemory mem() {
		return this.mem;
	}

	/**
	 * API name: {@code threads}
	 */
	public Number threads() {
		return this.threads;
	}

	/**
	 * API name: {@code versions}
	 */
	public List<ClusterJvmVersion> versions() {
		return this.versions;
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

		generator.writeKey("max_uptime_in_millis");
		generator.write(this.maxUptimeInMillis.doubleValue());

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("threads");
		generator.write(this.threads.doubleValue());

		generator.writeKey("versions");
		generator.writeStartArray();
		for (ClusterJvmVersion item0 : this.versions) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterJvm}.
	 */
	public static class Builder implements ObjectBuilder<ClusterJvm> {
		private Number maxUptimeInMillis;

		private ClusterJvmMemory mem;

		private Number threads;

		private List<ClusterJvmVersion> versions;

		/**
		 * API name: {@code max_uptime_in_millis}
		 */
		public Builder maxUptimeInMillis(Number value) {
			this.maxUptimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(ClusterJvmMemory value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<ClusterJvmMemory.Builder, ObjectBuilder<ClusterJvmMemory>> fn) {
			return this.mem(fn.apply(new ClusterJvmMemory.Builder()).build());
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(Number value) {
			this.threads = value;
			return this;
		}

		/**
		 * API name: {@code versions}
		 */
		public Builder versions(List<ClusterJvmVersion> value) {
			this.versions = value;
			return this;
		}

		/**
		 * API name: {@code versions}
		 */
		public Builder versions(ClusterJvmVersion... value) {
			this.versions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #versions(List)}, creating the list if needed.
		 */
		public Builder addVersions(ClusterJvmVersion value) {
			if (this.versions == null) {
				this.versions = new ArrayList<>();
			}
			this.versions.add(value);
			return this;
		}

		/**
		 * Set {@link #versions(List)} to a singleton list.
		 */
		public Builder versions(Function<ClusterJvmVersion.Builder, ObjectBuilder<ClusterJvmVersion>> fn) {
			return this.versions(fn.apply(new ClusterJvmVersion.Builder()).build());
		}

		/**
		 * Add a value to {@link #versions(List)}, creating the list if needed.
		 */
		public Builder addVersions(Function<ClusterJvmVersion.Builder, ObjectBuilder<ClusterJvmVersion>> fn) {
			return this.addVersions(fn.apply(new ClusterJvmVersion.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterJvm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterJvm build() {

			return new ClusterJvm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterJvm}
	 */
	public static final JsonpDeserializer<ClusterJvm> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterJvm::setupClusterJvmDeserializer);

	protected static void setupClusterJvmDeserializer(DelegatingDeserializer<ClusterJvm.Builder> op) {

		op.add(Builder::maxUptimeInMillis, JsonpDeserializer.numberDeserializer(), "max_uptime_in_millis");
		op.add(Builder::mem, ClusterJvmMemory.DESERIALIZER, "mem");
		op.add(Builder::threads, JsonpDeserializer.numberDeserializer(), "threads");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(ClusterJvmVersion.DESERIALIZER), "versions");

	}

}
