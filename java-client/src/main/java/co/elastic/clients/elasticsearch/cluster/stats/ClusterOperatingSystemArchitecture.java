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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterOperatingSystemArchitecture

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterOperatingSystemArchitecture">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterOperatingSystemArchitecture implements JsonpSerializable {
	private final String arch;

	private final int count;

	// ---------------------------------------------------------------------------------------------

	private ClusterOperatingSystemArchitecture(Builder builder) {

		this.arch = ApiTypeHelper.requireNonNull(builder.arch, this, "arch");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static ClusterOperatingSystemArchitecture of(
			Function<Builder, ObjectBuilder<ClusterOperatingSystemArchitecture>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of an architecture used by one or more selected nodes.
	 * <p>
	 * API name: {@code arch}
	 */
	public final String arch() {
		return this.arch;
	}

	/**
	 * Required - Number of selected nodes using the architecture.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
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

		generator.writeKey("arch");
		generator.write(this.arch);

		generator.writeKey("count");
		generator.write(this.count);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemArchitecture}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterOperatingSystemArchitecture> {
		private String arch;

		private Integer count;

		/**
		 * Required - Name of an architecture used by one or more selected nodes.
		 * <p>
		 * API name: {@code arch}
		 */
		public final Builder arch(String value) {
			this.arch = value;
			return this;
		}

		/**
		 * Required - Number of selected nodes using the architecture.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemArchitecture}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemArchitecture build() {
			_checkSingleUse();

			return new ClusterOperatingSystemArchitecture(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystemArchitecture}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemArchitecture> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ClusterOperatingSystemArchitecture::setupClusterOperatingSystemArchitectureDeserializer);

	protected static void setupClusterOperatingSystemArchitectureDeserializer(
			ObjectDeserializer<ClusterOperatingSystemArchitecture.Builder> op) {

		op.add(Builder::arch, JsonpDeserializer.stringDeserializer(), "arch");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");

	}

}
