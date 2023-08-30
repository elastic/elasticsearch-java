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

// typedef: cluster.stats.ClusterOperatingSystemName

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterOperatingSystemName">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterOperatingSystemName implements JsonpSerializable {
	private final int count;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private ClusterOperatingSystemName(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static ClusterOperatingSystemName of(Function<Builder, ObjectBuilder<ClusterOperatingSystemName>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Number of selected nodes using the operating system.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - Name of an operating system used by one or more selected nodes.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemName}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterOperatingSystemName> {
		private Integer count;

		private String name;

		/**
		 * Required - Number of selected nodes using the operating system.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Name of an operating system used by one or more selected nodes.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemName}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemName build() {
			_checkSingleUse();

			return new ClusterOperatingSystemName(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystemName}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemName> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterOperatingSystemName::setupClusterOperatingSystemNameDeserializer);

	protected static void setupClusterOperatingSystemNameDeserializer(
			ObjectDeserializer<ClusterOperatingSystemName.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
