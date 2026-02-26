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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: xpack.usage.GpuVectorIndexing

/**
 * GPU vector indexing usage statistics.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.GpuVectorIndexing">API
 *      specification</a>
 */
@JsonpDeserializable
public class GpuVectorIndexing extends Base {
	private final long indexBuildCount;

	private final int nodesWithGpu;

	private final List<GpuNodeStats> nodes;

	// ---------------------------------------------------------------------------------------------

	private GpuVectorIndexing(Builder builder) {
		super(builder);

		this.indexBuildCount = ApiTypeHelper.requireNonNull(builder.indexBuildCount, this, "indexBuildCount", 0);
		this.nodesWithGpu = ApiTypeHelper.requireNonNull(builder.nodesWithGpu, this, "nodesWithGpu", 0);
		this.nodes = ApiTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static GpuVectorIndexing of(Function<Builder, ObjectBuilder<GpuVectorIndexing>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Total GPU index builds across the cluster.
	 * <p>
	 * API name: {@code index_build_count}
	 */
	public final long indexBuildCount() {
		return this.indexBuildCount;
	}

	/**
	 * Required - Count of data nodes with GPU support.
	 * <p>
	 * API name: {@code nodes_with_gpu}
	 */
	public final int nodesWithGpu() {
		return this.nodesWithGpu;
	}

	/**
	 * Required - Per-node GPU details including type, memory, enabled status, and
	 * build count.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final List<GpuNodeStats> nodes() {
		return this.nodes;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("index_build_count");
		generator.write(this.indexBuildCount);

		generator.writeKey("nodes_with_gpu");
		generator.write(this.nodesWithGpu);

		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartArray();
			for (GpuNodeStats item0 : this.nodes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GpuVectorIndexing}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<GpuVectorIndexing> {
		private Long indexBuildCount;

		private Integer nodesWithGpu;

		private List<GpuNodeStats> nodes;

		public Builder() {
		}
		private Builder(GpuVectorIndexing instance) {
			this.indexBuildCount = instance.indexBuildCount;
			this.nodesWithGpu = instance.nodesWithGpu;
			this.nodes = instance.nodes;

		}
		/**
		 * Required - Total GPU index builds across the cluster.
		 * <p>
		 * API name: {@code index_build_count}
		 */
		public final Builder indexBuildCount(long value) {
			this.indexBuildCount = value;
			return this;
		}

		/**
		 * Required - Count of data nodes with GPU support.
		 * <p>
		 * API name: {@code nodes_with_gpu}
		 */
		public final Builder nodesWithGpu(int value) {
			this.nodesWithGpu = value;
			return this;
		}

		/**
		 * Required - Per-node GPU details including type, memory, enabled status, and
		 * build count.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodes</code>.
		 */
		public final Builder nodes(List<GpuNodeStats> list) {
			this.nodes = _listAddAll(this.nodes, list);
			return this;
		}

		/**
		 * Required - Per-node GPU details including type, memory, enabled status, and
		 * build count.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds one or more values to <code>nodes</code>.
		 */
		public final Builder nodes(GpuNodeStats value, GpuNodeStats... values) {
			this.nodes = _listAdd(this.nodes, value, values);
			return this;
		}

		/**
		 * Required - Per-node GPU details including type, memory, enabled status, and
		 * build count.
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds a value to <code>nodes</code> using a builder lambda.
		 */
		public final Builder nodes(Function<GpuNodeStats.Builder, ObjectBuilder<GpuNodeStats>> fn) {
			return nodes(fn.apply(new GpuNodeStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GpuVectorIndexing}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GpuVectorIndexing build() {
			_checkSingleUse();

			return new GpuVectorIndexing(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GpuVectorIndexing}
	 */
	public static final JsonpDeserializer<GpuVectorIndexing> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GpuVectorIndexing::setupGpuVectorIndexingDeserializer);

	protected static void setupGpuVectorIndexingDeserializer(ObjectDeserializer<GpuVectorIndexing.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indexBuildCount, JsonpDeserializer.longDeserializer(), "index_build_count");
		op.add(Builder::nodesWithGpu, JsonpDeserializer.integerDeserializer(), "nodes_with_gpu");
		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(GpuNodeStats._DESERIALIZER), "nodes");

	}

}
