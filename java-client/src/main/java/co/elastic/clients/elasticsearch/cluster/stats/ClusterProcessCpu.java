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
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.ClusterProcessCpu

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterProcessCpu">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterProcessCpu implements JsonpSerializable {
	private final int percent;

	// ---------------------------------------------------------------------------------------------

	private ClusterProcessCpu(Builder builder) {

		this.percent = ApiTypeHelper.requireNonNull(builder.percent, this, "percent");

	}

	public static ClusterProcessCpu of(Function<Builder, ObjectBuilder<ClusterProcessCpu>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Percentage of CPU used across all selected nodes. Returns
	 * <code>-1</code> if not supported.
	 * <p>
	 * API name: {@code percent}
	 */
	public final int percent() {
		return this.percent;
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

		generator.writeKey("percent");
		generator.write(this.percent);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcessCpu}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterProcessCpu> {
		private Integer percent;

		/**
		 * Required - Percentage of CPU used across all selected nodes. Returns
		 * <code>-1</code> if not supported.
		 * <p>
		 * API name: {@code percent}
		 */
		public final Builder percent(int value) {
			this.percent = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterProcessCpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcessCpu build() {
			_checkSingleUse();

			return new ClusterProcessCpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterProcessCpu}
	 */
	public static final JsonpDeserializer<ClusterProcessCpu> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterProcessCpu::setupClusterProcessCpuDeserializer);

	protected static void setupClusterProcessCpuDeserializer(ObjectDeserializer<ClusterProcessCpu.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.integerDeserializer(), "percent");

	}

}
