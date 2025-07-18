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
import java.lang.Long;
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

// typedef: cluster.stats.DenseVectorStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.DenseVectorStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorStats implements JsonpSerializable {
	private final long valueCount;

	@Nullable
	private final DenseVectorOffHeapStats offHeap;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorStats(Builder builder) {

		this.valueCount = ApiTypeHelper.requireNonNull(builder.valueCount, this, "valueCount", 0);
		this.offHeap = builder.offHeap;

	}

	public static DenseVectorStats of(Function<Builder, ObjectBuilder<DenseVectorStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code value_count}
	 */
	public final long valueCount() {
		return this.valueCount;
	}

	/**
	 * API name: {@code off_heap}
	 */
	@Nullable
	public final DenseVectorOffHeapStats offHeap() {
		return this.offHeap;
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

		generator.writeKey("value_count");
		generator.write(this.valueCount);

		if (this.offHeap != null) {
			generator.writeKey("off_heap");
			this.offHeap.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DenseVectorStats> {
		private Long valueCount;

		@Nullable
		private DenseVectorOffHeapStats offHeap;

		/**
		 * Required - API name: {@code value_count}
		 */
		public final Builder valueCount(long value) {
			this.valueCount = value;
			return this;
		}

		/**
		 * API name: {@code off_heap}
		 */
		public final Builder offHeap(@Nullable DenseVectorOffHeapStats value) {
			this.offHeap = value;
			return this;
		}

		/**
		 * API name: {@code off_heap}
		 */
		public final Builder offHeap(
				Function<DenseVectorOffHeapStats.Builder, ObjectBuilder<DenseVectorOffHeapStats>> fn) {
			return this.offHeap(fn.apply(new DenseVectorOffHeapStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorStats build() {
			_checkSingleUse();

			return new DenseVectorStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorStats}
	 */
	public static final JsonpDeserializer<DenseVectorStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DenseVectorStats::setupDenseVectorStatsDeserializer);

	protected static void setupDenseVectorStatsDeserializer(ObjectDeserializer<DenseVectorStats.Builder> op) {

		op.add(Builder::valueCount, JsonpDeserializer.longDeserializer(), "value_count");
		op.add(Builder::offHeap, DenseVectorOffHeapStats._DESERIALIZER, "off_heap");

	}

}
