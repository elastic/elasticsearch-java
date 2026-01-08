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
import java.lang.String;
import java.util.Map;
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

// typedef: cluster.stats.DenseVectorOffHeapStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.DenseVectorOffHeapStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorOffHeapStats implements JsonpSerializable {
	private final long totalSizeBytes;

	@Nullable
	private final String totalSize;

	private final long totalVebSizeBytes;

	@Nullable
	private final String totalVebSize;

	private final long totalVecSizeBytes;

	@Nullable
	private final String totalVecSize;

	private final long totalVeqSizeBytes;

	@Nullable
	private final String totalVeqSize;

	private final long totalVexSizeBytes;

	@Nullable
	private final String totalVexSize;

	private final long totalCenifSizeBytes;

	@Nullable
	private final String totalCenifSize;

	private final long totalClivfSizeBytes;

	@Nullable
	private final String totalClivfSize;

	private final Map<String, Map<String, Long>> fielddata;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorOffHeapStats(Builder builder) {

		this.totalSizeBytes = ApiTypeHelper.requireNonNull(builder.totalSizeBytes, this, "totalSizeBytes", 0);
		this.totalSize = builder.totalSize;
		this.totalVebSizeBytes = ApiTypeHelper.requireNonNull(builder.totalVebSizeBytes, this, "totalVebSizeBytes", 0);
		this.totalVebSize = builder.totalVebSize;
		this.totalVecSizeBytes = ApiTypeHelper.requireNonNull(builder.totalVecSizeBytes, this, "totalVecSizeBytes", 0);
		this.totalVecSize = builder.totalVecSize;
		this.totalVeqSizeBytes = ApiTypeHelper.requireNonNull(builder.totalVeqSizeBytes, this, "totalVeqSizeBytes", 0);
		this.totalVeqSize = builder.totalVeqSize;
		this.totalVexSizeBytes = ApiTypeHelper.requireNonNull(builder.totalVexSizeBytes, this, "totalVexSizeBytes", 0);
		this.totalVexSize = builder.totalVexSize;
		this.totalCenifSizeBytes = ApiTypeHelper.requireNonNull(builder.totalCenifSizeBytes, this,
				"totalCenifSizeBytes", 0);
		this.totalCenifSize = builder.totalCenifSize;
		this.totalClivfSizeBytes = ApiTypeHelper.requireNonNull(builder.totalClivfSizeBytes, this,
				"totalClivfSizeBytes", 0);
		this.totalClivfSize = builder.totalClivfSize;
		this.fielddata = ApiTypeHelper.unmodifiable(builder.fielddata);

	}

	public static DenseVectorOffHeapStats of(Function<Builder, ObjectBuilder<DenseVectorOffHeapStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total_size_bytes}
	 */
	public final long totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * API name: {@code total_size}
	 */
	@Nullable
	public final String totalSize() {
		return this.totalSize;
	}

	/**
	 * Required - API name: {@code total_veb_size_bytes}
	 */
	public final long totalVebSizeBytes() {
		return this.totalVebSizeBytes;
	}

	/**
	 * API name: {@code total_veb_size}
	 */
	@Nullable
	public final String totalVebSize() {
		return this.totalVebSize;
	}

	/**
	 * Required - API name: {@code total_vec_size_bytes}
	 */
	public final long totalVecSizeBytes() {
		return this.totalVecSizeBytes;
	}

	/**
	 * API name: {@code total_vec_size}
	 */
	@Nullable
	public final String totalVecSize() {
		return this.totalVecSize;
	}

	/**
	 * Required - API name: {@code total_veq_size_bytes}
	 */
	public final long totalVeqSizeBytes() {
		return this.totalVeqSizeBytes;
	}

	/**
	 * API name: {@code total_veq_size}
	 */
	@Nullable
	public final String totalVeqSize() {
		return this.totalVeqSize;
	}

	/**
	 * Required - API name: {@code total_vex_size_bytes}
	 */
	public final long totalVexSizeBytes() {
		return this.totalVexSizeBytes;
	}

	/**
	 * API name: {@code total_vex_size}
	 */
	@Nullable
	public final String totalVexSize() {
		return this.totalVexSize;
	}

	/**
	 * Required - API name: {@code total_cenif_size_bytes}
	 */
	public final long totalCenifSizeBytes() {
		return this.totalCenifSizeBytes;
	}

	/**
	 * API name: {@code total_cenif_size}
	 */
	@Nullable
	public final String totalCenifSize() {
		return this.totalCenifSize;
	}

	/**
	 * Required - API name: {@code total_clivf_size_bytes}
	 */
	public final long totalClivfSizeBytes() {
		return this.totalClivfSizeBytes;
	}

	/**
	 * API name: {@code total_clivf_size}
	 */
	@Nullable
	public final String totalClivfSize() {
		return this.totalClivfSize;
	}

	/**
	 * API name: {@code fielddata}
	 */
	public final Map<String, Map<String, Long>> fielddata() {
		return this.fielddata;
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

		generator.writeKey("total_size_bytes");
		generator.write(this.totalSizeBytes);

		if (this.totalSize != null) {
			generator.writeKey("total_size");
			generator.write(this.totalSize);

		}
		generator.writeKey("total_veb_size_bytes");
		generator.write(this.totalVebSizeBytes);

		if (this.totalVebSize != null) {
			generator.writeKey("total_veb_size");
			generator.write(this.totalVebSize);

		}
		generator.writeKey("total_vec_size_bytes");
		generator.write(this.totalVecSizeBytes);

		if (this.totalVecSize != null) {
			generator.writeKey("total_vec_size");
			generator.write(this.totalVecSize);

		}
		generator.writeKey("total_veq_size_bytes");
		generator.write(this.totalVeqSizeBytes);

		if (this.totalVeqSize != null) {
			generator.writeKey("total_veq_size");
			generator.write(this.totalVeqSize);

		}
		generator.writeKey("total_vex_size_bytes");
		generator.write(this.totalVexSizeBytes);

		if (this.totalVexSize != null) {
			generator.writeKey("total_vex_size");
			generator.write(this.totalVexSize);

		}
		generator.writeKey("total_cenif_size_bytes");
		generator.write(this.totalCenifSizeBytes);

		if (this.totalCenifSize != null) {
			generator.writeKey("total_cenif_size");
			generator.write(this.totalCenifSize);

		}
		generator.writeKey("total_clivf_size_bytes");
		generator.write(this.totalClivfSizeBytes);

		if (this.totalClivfSize != null) {
			generator.writeKey("total_clivf_size");
			generator.write(this.totalClivfSize);

		}
		if (ApiTypeHelper.isDefined(this.fielddata)) {
			generator.writeKey("fielddata");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, Long>> item0 : this.fielddata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, Long> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorOffHeapStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorOffHeapStats> {
		private Long totalSizeBytes;

		@Nullable
		private String totalSize;

		private Long totalVebSizeBytes;

		@Nullable
		private String totalVebSize;

		private Long totalVecSizeBytes;

		@Nullable
		private String totalVecSize;

		private Long totalVeqSizeBytes;

		@Nullable
		private String totalVeqSize;

		private Long totalVexSizeBytes;

		@Nullable
		private String totalVexSize;

		private Long totalCenifSizeBytes;

		@Nullable
		private String totalCenifSize;

		private Long totalClivfSizeBytes;

		@Nullable
		private String totalClivfSize;

		@Nullable
		private Map<String, Map<String, Long>> fielddata;

		/**
		 * Required - API name: {@code total_size_bytes}
		 */
		public final Builder totalSizeBytes(long value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_size}
		 */
		public final Builder totalSize(@Nullable String value) {
			this.totalSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_veb_size_bytes}
		 */
		public final Builder totalVebSizeBytes(long value) {
			this.totalVebSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_veb_size}
		 */
		public final Builder totalVebSize(@Nullable String value) {
			this.totalVebSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_vec_size_bytes}
		 */
		public final Builder totalVecSizeBytes(long value) {
			this.totalVecSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_vec_size}
		 */
		public final Builder totalVecSize(@Nullable String value) {
			this.totalVecSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_veq_size_bytes}
		 */
		public final Builder totalVeqSizeBytes(long value) {
			this.totalVeqSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_veq_size}
		 */
		public final Builder totalVeqSize(@Nullable String value) {
			this.totalVeqSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_vex_size_bytes}
		 */
		public final Builder totalVexSizeBytes(long value) {
			this.totalVexSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_vex_size}
		 */
		public final Builder totalVexSize(@Nullable String value) {
			this.totalVexSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_cenif_size_bytes}
		 */
		public final Builder totalCenifSizeBytes(long value) {
			this.totalCenifSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_cenif_size}
		 */
		public final Builder totalCenifSize(@Nullable String value) {
			this.totalCenifSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_clivf_size_bytes}
		 */
		public final Builder totalClivfSizeBytes(long value) {
			this.totalClivfSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code total_clivf_size}
		 */
		public final Builder totalClivfSize(@Nullable String value) {
			this.totalClivfSize = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fielddata</code>.
		 */
		public final Builder fielddata(Map<String, Map<String, Long>> map) {
			this.fielddata = _mapPutAll(this.fielddata, map);
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 * <p>
		 * Adds an entry to <code>fielddata</code>.
		 */
		public final Builder fielddata(String key, Map<String, Long> value) {
			this.fielddata = _mapPut(this.fielddata, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorOffHeapStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorOffHeapStats build() {
			_checkSingleUse();

			return new DenseVectorOffHeapStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorOffHeapStats}
	 */
	public static final JsonpDeserializer<DenseVectorOffHeapStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorOffHeapStats::setupDenseVectorOffHeapStatsDeserializer);

	protected static void setupDenseVectorOffHeapStatsDeserializer(
			ObjectDeserializer<DenseVectorOffHeapStats.Builder> op) {

		op.add(Builder::totalSizeBytes, JsonpDeserializer.longDeserializer(), "total_size_bytes");
		op.add(Builder::totalSize, JsonpDeserializer.stringDeserializer(), "total_size");
		op.add(Builder::totalVebSizeBytes, JsonpDeserializer.longDeserializer(), "total_veb_size_bytes");
		op.add(Builder::totalVebSize, JsonpDeserializer.stringDeserializer(), "total_veb_size");
		op.add(Builder::totalVecSizeBytes, JsonpDeserializer.longDeserializer(), "total_vec_size_bytes");
		op.add(Builder::totalVecSize, JsonpDeserializer.stringDeserializer(), "total_vec_size");
		op.add(Builder::totalVeqSizeBytes, JsonpDeserializer.longDeserializer(), "total_veq_size_bytes");
		op.add(Builder::totalVeqSize, JsonpDeserializer.stringDeserializer(), "total_veq_size");
		op.add(Builder::totalVexSizeBytes, JsonpDeserializer.longDeserializer(), "total_vex_size_bytes");
		op.add(Builder::totalVexSize, JsonpDeserializer.stringDeserializer(), "total_vex_size");
		op.add(Builder::totalCenifSizeBytes, JsonpDeserializer.longDeserializer(), "total_cenif_size_bytes");
		op.add(Builder::totalCenifSize, JsonpDeserializer.stringDeserializer(), "total_cenif_size");
		op.add(Builder::totalClivfSizeBytes, JsonpDeserializer.longDeserializer(), "total_clivf_size_bytes");
		op.add(Builder::totalClivfSize, JsonpDeserializer.stringDeserializer(), "total_clivf_size");
		op.add(Builder::fielddata, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer())), "fielddata");

	}

}
