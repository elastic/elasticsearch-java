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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterOperatingSystemArchitecture
@JsonpDeserializable
public final class ClusterOperatingSystemArchitecture implements JsonpSerializable {
	private final Integer count;

	private final String arch;

	// ---------------------------------------------------------------------------------------------

	public ClusterOperatingSystemArchitecture(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.arch = Objects.requireNonNull(builder.arch, "arch");

	}

	/**
	 * API name: {@code count}
	 */
	public Integer count() {
		return this.count;
	}

	/**
	 * API name: {@code arch}
	 */
	public String arch() {
		return this.arch;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("arch");
		generator.write(this.arch);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemArchitecture}.
	 */
	public static class Builder implements ObjectBuilder<ClusterOperatingSystemArchitecture> {
		private Integer count;

		private String arch;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Integer value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code arch}
		 */
		public Builder arch(String value) {
			this.arch = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemArchitecture}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemArchitecture build() {

			return new ClusterOperatingSystemArchitecture(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystemArchitecture}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemArchitecture> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterOperatingSystemArchitecture::setupClusterOperatingSystemArchitectureDeserializer,
					Builder::build);

	protected static void setupClusterOperatingSystemArchitectureDeserializer(
			DelegatingDeserializer<ClusterOperatingSystemArchitecture.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::arch, JsonpDeserializer.stringDeserializer(), "arch");

	}

}
