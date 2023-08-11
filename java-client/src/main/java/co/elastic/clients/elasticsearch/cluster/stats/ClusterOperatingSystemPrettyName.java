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

// typedef: cluster.stats.ClusterOperatingSystemPrettyName

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterOperatingSystemPrettyName">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterOperatingSystemPrettyName implements JsonpSerializable {
	private final int count;

	private final String prettyName;

	// ---------------------------------------------------------------------------------------------

	private ClusterOperatingSystemPrettyName(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.prettyName = ApiTypeHelper.requireNonNull(builder.prettyName, this, "prettyName");

	}

	public static ClusterOperatingSystemPrettyName of(
			Function<Builder, ObjectBuilder<ClusterOperatingSystemPrettyName>> fn) {
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
	 * Required - Human-readable name of an operating system used by one or more
	 * selected nodes.
	 * <p>
	 * API name: {@code pretty_name}
	 */
	public final String prettyName() {
		return this.prettyName;
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

		generator.writeKey("pretty_name");
		generator.write(this.prettyName);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterOperatingSystemPrettyName}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterOperatingSystemPrettyName> {
		private Integer count;

		private String prettyName;

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
		 * Required - Human-readable name of an operating system used by one or more
		 * selected nodes.
		 * <p>
		 * API name: {@code pretty_name}
		 */
		public final Builder prettyName(String value) {
			this.prettyName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterOperatingSystemPrettyName}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterOperatingSystemPrettyName build() {
			_checkSingleUse();

			return new ClusterOperatingSystemPrettyName(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterOperatingSystemPrettyName}
	 */
	public static final JsonpDeserializer<ClusterOperatingSystemPrettyName> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterOperatingSystemPrettyName::setupClusterOperatingSystemPrettyNameDeserializer);

	protected static void setupClusterOperatingSystemPrettyNameDeserializer(
			ObjectDeserializer<ClusterOperatingSystemPrettyName.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::prettyName, JsonpDeserializer.stringDeserializer(), "pretty_name");

	}

}
