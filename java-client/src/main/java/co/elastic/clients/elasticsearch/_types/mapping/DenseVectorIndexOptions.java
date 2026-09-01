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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
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

// typedef: _types.mapping.DenseVectorIndexOptions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorIndexOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorIndexOptions implements JsonpSerializable {
	@Nullable
	private final Float confidenceInterval;

	@Nullable
	private final Integer efConstruction;

	@Nullable
	private final Integer m;

	private final DenseVectorIndexOptionsType type;

	@Nullable
	private final DenseVectorIndexOptionsRescoreVector rescoreVector;

	@Nullable
	private final Boolean onDiskRescore;

	@Nullable
	private final Integer flatIndexThreshold;

	@Nullable
	private final Integer clusterSize;

	@Nullable
	private final Float defaultVisitPercentage;

	@Nullable
	private final Integer bits;

	@Nullable
	private final Boolean precondition;

	@Nullable
	private final Boolean autoCalibrate;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorIndexOptions(Builder builder) {

		this.confidenceInterval = builder.confidenceInterval;
		this.efConstruction = builder.efConstruction;
		this.m = builder.m;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.rescoreVector = builder.rescoreVector;
		this.onDiskRescore = builder.onDiskRescore;
		this.flatIndexThreshold = builder.flatIndexThreshold;
		this.clusterSize = builder.clusterSize;
		this.defaultVisitPercentage = builder.defaultVisitPercentage;
		this.bits = builder.bits;
		this.precondition = builder.precondition;
		this.autoCalibrate = builder.autoCalibrate;

	}

	public static DenseVectorIndexOptions of(Function<Builder, ObjectBuilder<DenseVectorIndexOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The confidence interval to use when quantizing the vectors. Can be any value
	 * between and including <code>0.90</code> and <code>1.0</code> or exactly
	 * <code>0</code>. When the value is <code>0</code>, this indicates that dynamic
	 * quantiles should be calculated for optimized quantization. When between
	 * <code>0.90</code> and <code>1.0</code>, this value restricts the values used
	 * when calculating the quantization thresholds.
	 * <p>
	 * For example, a value of <code>0.95</code> will only use the middle
	 * <code>95%</code> of the values when calculating the quantization thresholds
	 * (e.g. the highest and lowest <code>2.5%</code> of values will be ignored).
	 * <p>
	 * Defaults to <code>1/(dims + 1)</code> for <code>int8</code> quantized vectors
	 * and <code>0</code> for <code>int4</code> for dynamic quantile calculation.
	 * <p>
	 * Only applicable to <code>int8_hnsw</code>, <code>int4_hnsw</code>,
	 * <code>int8_flat</code>, and <code>int4_flat</code> index types.
	 * <p>
	 * API name: {@code confidence_interval}
	 * 
	 * @deprecated 9.5.0
	 */
	@Deprecated
	@Nullable
	public final Float confidenceInterval() {
		return this.confidenceInterval;
	}

	/**
	 * The number of candidates to track while assembling the list of nearest
	 * neighbors for each new node.
	 * <p>
	 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
	 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
	 * <p>
	 * API name: {@code ef_construction}
	 */
	@Nullable
	public final Integer efConstruction() {
		return this.efConstruction;
	}

	/**
	 * The number of neighbors each node will be connected to in the HNSW graph.
	 * <p>
	 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
	 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
	 * <p>
	 * API name: {@code m}
	 */
	@Nullable
	public final Integer m() {
		return this.m;
	}

	/**
	 * Required - The type of kNN algorithm to use.
	 * <p>
	 * API name: {@code type}
	 */
	public final DenseVectorIndexOptionsType type() {
		return this.type;
	}

	/**
	 * The rescore vector options. This is only applicable to <code>bbq_disk</code>,
	 * <code>bbq_hnsw</code>, <code>int4_hnsw</code>, <code>int8_hnsw</code>,
	 * <code>bbq_flat</code>, <code>int4_flat</code>, and <code>int8_flat</code>
	 * index types.
	 * <p>
	 * API name: {@code rescore_vector}
	 */
	@Nullable
	public final DenseVectorIndexOptionsRescoreVector rescoreVector() {
		return this.rescoreVector;
	}

	/**
	 * <code>true</code> if vector rescoring should be done on-disk
	 * <p>
	 * Only applicable to <code>bbq_disk</code>, <code>bbq_hnsw</code>,
	 * <code>int4_hnsw</code>, <code>int8_hnsw</code>
	 * <p>
	 * API name: {@code on_disk_rescore}
	 */
	@Nullable
	public final Boolean onDiskRescore() {
		return this.onDiskRescore;
	}

	/**
	 * The segment document count threshold below which HNSW graph construction is
	 * skipped in favor of brute-force flat search. <code>-1</code> (default) defers
	 * to format defaults: <code>300</code> for <code>bbq_hnsw</code>,
	 * <code>150</code> for <code>hnsw</code>, <code>int8_hnsw</code>, and
	 * <code>int4_hnsw</code>. <code>0</code> always builds the graph. A positive
	 * value overrides the format default.
	 * <p>
	 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
	 * <code>int4_hnsw</code>, <code>bbq_hnsw</code>, and <code>bbq_disk</code>
	 * index types.
	 * <p>
	 * API name: {@code flat_index_threshold}
	 */
	@Nullable
	public final Integer flatIndexThreshold() {
		return this.flatIndexThreshold;
	}

	/**
	 * Only applicable to <code>bbq_disk</code>. The number of vectors per cluster.
	 * Must be between 64 and 65536.
	 * <p>
	 * API name: {@code cluster_size}
	 */
	@Nullable
	public final Integer clusterSize() {
		return this.clusterSize;
	}

	/**
	 * Only applicable to <code>bbq_disk</code>. The percentage of clusters to visit
	 * during search. Must be between 0 and 100. A value of 0 defaults to using
	 * <code>num_candidates</code> for calculating the visit percentage.
	 * <p>
	 * API name: {@code default_visit_percentage}
	 */
	@Nullable
	public final Float defaultVisitPercentage() {
		return this.defaultVisitPercentage;
	}

	/**
	 * Only applicable to <code>bbq_disk</code>. The number of bits per dimension
	 * for quantization encoding. Valid values are <code>1</code>, <code>2</code>,
	 * <code>4</code>, or <code>7</code>. When no <code>rescore_vector</code> is
	 * explicitly set, the default oversampling is automatically adjusted based on
	 * the bits value. This setting can be changed without reindexing.
	 * <p>
	 * API name: {@code bits}
	 */
	@Nullable
	public final Integer bits() {
		return this.bits;
	}

	/**
	 * Only applicable to <code>bbq_disk</code>. When <code>true</code>, transforms
	 * indexed vectors using a random orthogonal projection before quantization,
	 * which can improve accuracy when vector components are not normally
	 * distributed. Cannot be changed after the field is created.
	 * <p>
	 * API name: {@code precondition}
	 */
	@Nullable
	public final Boolean precondition() {
		return this.precondition;
	}

	/**
	 * Only applicable to <code>bbq_disk</code>. When <code>true</code>,
	 * Elasticsearch automatically selects the optimal quantization encoding,
	 * oversampling factor, and preconditioning for each merged segment based on
	 * estimated recall characteristics. Cannot be changed after the field is
	 * created.
	 * <p>
	 * API name: {@code auto_calibrate}
	 */
	@Nullable
	public final Boolean autoCalibrate() {
		return this.autoCalibrate;
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

		if (this.confidenceInterval != null) {
			generator.writeKey("confidence_interval");
			generator.write(this.confidenceInterval);

		}
		if (this.efConstruction != null) {
			generator.writeKey("ef_construction");
			generator.write(this.efConstruction);

		}
		if (this.m != null) {
			generator.writeKey("m");
			generator.write(this.m);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.rescoreVector != null) {
			generator.writeKey("rescore_vector");
			this.rescoreVector.serialize(generator, mapper);

		}
		if (this.onDiskRescore != null) {
			generator.writeKey("on_disk_rescore");
			generator.write(this.onDiskRescore);

		}
		if (this.flatIndexThreshold != null) {
			generator.writeKey("flat_index_threshold");
			generator.write(this.flatIndexThreshold);

		}
		if (this.clusterSize != null) {
			generator.writeKey("cluster_size");
			generator.write(this.clusterSize);

		}
		if (this.defaultVisitPercentage != null) {
			generator.writeKey("default_visit_percentage");
			generator.write(this.defaultVisitPercentage);

		}
		if (this.bits != null) {
			generator.writeKey("bits");
			generator.write(this.bits);

		}
		if (this.precondition != null) {
			generator.writeKey("precondition");
			generator.write(this.precondition);

		}
		if (this.autoCalibrate != null) {
			generator.writeKey("auto_calibrate");
			generator.write(this.autoCalibrate);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorIndexOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorIndexOptions> {
		@Nullable
		private Float confidenceInterval;

		@Nullable
		private Integer efConstruction;

		@Nullable
		private Integer m;

		private DenseVectorIndexOptionsType type;

		@Nullable
		private DenseVectorIndexOptionsRescoreVector rescoreVector;

		@Nullable
		private Boolean onDiskRescore;

		@Nullable
		private Integer flatIndexThreshold;

		@Nullable
		private Integer clusterSize;

		@Nullable
		private Float defaultVisitPercentage;

		@Nullable
		private Integer bits;

		@Nullable
		private Boolean precondition;

		@Nullable
		private Boolean autoCalibrate;

		public Builder() {
		}
		private Builder(DenseVectorIndexOptions instance) {
			this.confidenceInterval = instance.confidenceInterval;
			this.efConstruction = instance.efConstruction;
			this.m = instance.m;
			this.type = instance.type;
			this.rescoreVector = instance.rescoreVector;
			this.onDiskRescore = instance.onDiskRescore;
			this.flatIndexThreshold = instance.flatIndexThreshold;
			this.clusterSize = instance.clusterSize;
			this.defaultVisitPercentage = instance.defaultVisitPercentage;
			this.bits = instance.bits;
			this.precondition = instance.precondition;
			this.autoCalibrate = instance.autoCalibrate;

		}
		/**
		 * The confidence interval to use when quantizing the vectors. Can be any value
		 * between and including <code>0.90</code> and <code>1.0</code> or exactly
		 * <code>0</code>. When the value is <code>0</code>, this indicates that dynamic
		 * quantiles should be calculated for optimized quantization. When between
		 * <code>0.90</code> and <code>1.0</code>, this value restricts the values used
		 * when calculating the quantization thresholds.
		 * <p>
		 * For example, a value of <code>0.95</code> will only use the middle
		 * <code>95%</code> of the values when calculating the quantization thresholds
		 * (e.g. the highest and lowest <code>2.5%</code> of values will be ignored).
		 * <p>
		 * Defaults to <code>1/(dims + 1)</code> for <code>int8</code> quantized vectors
		 * and <code>0</code> for <code>int4</code> for dynamic quantile calculation.
		 * <p>
		 * Only applicable to <code>int8_hnsw</code>, <code>int4_hnsw</code>,
		 * <code>int8_flat</code>, and <code>int4_flat</code> index types.
		 * <p>
		 * API name: {@code confidence_interval}
		 * 
		 * @deprecated 9.5.0
		 */
		@Deprecated
		public final Builder confidenceInterval(@Nullable Float value) {
			this.confidenceInterval = value;
			return this;
		}

		/**
		 * The number of candidates to track while assembling the list of nearest
		 * neighbors for each new node.
		 * <p>
		 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
		 * <p>
		 * API name: {@code ef_construction}
		 */
		public final Builder efConstruction(@Nullable Integer value) {
			this.efConstruction = value;
			return this;
		}

		/**
		 * The number of neighbors each node will be connected to in the HNSW graph.
		 * <p>
		 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_hnsw</code>, and <code>int4_hnsw</code> index types.
		 * <p>
		 * API name: {@code m}
		 */
		public final Builder m(@Nullable Integer value) {
			this.m = value;
			return this;
		}

		/**
		 * Required - The type of kNN algorithm to use.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(DenseVectorIndexOptionsType value) {
			this.type = value;
			return this;
		}

		/**
		 * The rescore vector options. This is only applicable to <code>bbq_disk</code>,
		 * <code>bbq_hnsw</code>, <code>int4_hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_flat</code>, <code>int4_flat</code>, and <code>int8_flat</code>
		 * index types.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(@Nullable DenseVectorIndexOptionsRescoreVector value) {
			this.rescoreVector = value;
			return this;
		}

		/**
		 * The rescore vector options. This is only applicable to <code>bbq_disk</code>,
		 * <code>bbq_hnsw</code>, <code>int4_hnsw</code>, <code>int8_hnsw</code>,
		 * <code>bbq_flat</code>, <code>int4_flat</code>, and <code>int8_flat</code>
		 * index types.
		 * <p>
		 * API name: {@code rescore_vector}
		 */
		public final Builder rescoreVector(
				Function<DenseVectorIndexOptionsRescoreVector.Builder, ObjectBuilder<DenseVectorIndexOptionsRescoreVector>> fn) {
			return this.rescoreVector(fn.apply(new DenseVectorIndexOptionsRescoreVector.Builder()).build());
		}

		/**
		 * <code>true</code> if vector rescoring should be done on-disk
		 * <p>
		 * Only applicable to <code>bbq_disk</code>, <code>bbq_hnsw</code>,
		 * <code>int4_hnsw</code>, <code>int8_hnsw</code>
		 * <p>
		 * API name: {@code on_disk_rescore}
		 */
		public final Builder onDiskRescore(@Nullable Boolean value) {
			this.onDiskRescore = value;
			return this;
		}

		/**
		 * The segment document count threshold below which HNSW graph construction is
		 * skipped in favor of brute-force flat search. <code>-1</code> (default) defers
		 * to format defaults: <code>300</code> for <code>bbq_hnsw</code>,
		 * <code>150</code> for <code>hnsw</code>, <code>int8_hnsw</code>, and
		 * <code>int4_hnsw</code>. <code>0</code> always builds the graph. A positive
		 * value overrides the format default.
		 * <p>
		 * Only applicable to <code>hnsw</code>, <code>int8_hnsw</code>,
		 * <code>int4_hnsw</code>, <code>bbq_hnsw</code>, and <code>bbq_disk</code>
		 * index types.
		 * <p>
		 * API name: {@code flat_index_threshold}
		 */
		public final Builder flatIndexThreshold(@Nullable Integer value) {
			this.flatIndexThreshold = value;
			return this;
		}

		/**
		 * Only applicable to <code>bbq_disk</code>. The number of vectors per cluster.
		 * Must be between 64 and 65536.
		 * <p>
		 * API name: {@code cluster_size}
		 */
		public final Builder clusterSize(@Nullable Integer value) {
			this.clusterSize = value;
			return this;
		}

		/**
		 * Only applicable to <code>bbq_disk</code>. The percentage of clusters to visit
		 * during search. Must be between 0 and 100. A value of 0 defaults to using
		 * <code>num_candidates</code> for calculating the visit percentage.
		 * <p>
		 * API name: {@code default_visit_percentage}
		 */
		public final Builder defaultVisitPercentage(@Nullable Float value) {
			this.defaultVisitPercentage = value;
			return this;
		}

		/**
		 * Only applicable to <code>bbq_disk</code>. The number of bits per dimension
		 * for quantization encoding. Valid values are <code>1</code>, <code>2</code>,
		 * <code>4</code>, or <code>7</code>. When no <code>rescore_vector</code> is
		 * explicitly set, the default oversampling is automatically adjusted based on
		 * the bits value. This setting can be changed without reindexing.
		 * <p>
		 * API name: {@code bits}
		 */
		public final Builder bits(@Nullable Integer value) {
			this.bits = value;
			return this;
		}

		/**
		 * Only applicable to <code>bbq_disk</code>. When <code>true</code>, transforms
		 * indexed vectors using a random orthogonal projection before quantization,
		 * which can improve accuracy when vector components are not normally
		 * distributed. Cannot be changed after the field is created.
		 * <p>
		 * API name: {@code precondition}
		 */
		public final Builder precondition(@Nullable Boolean value) {
			this.precondition = value;
			return this;
		}

		/**
		 * Only applicable to <code>bbq_disk</code>. When <code>true</code>,
		 * Elasticsearch automatically selects the optimal quantization encoding,
		 * oversampling factor, and preconditioning for each merged segment based on
		 * estimated recall characteristics. Cannot be changed after the field is
		 * created.
		 * <p>
		 * API name: {@code auto_calibrate}
		 */
		public final Builder autoCalibrate(@Nullable Boolean value) {
			this.autoCalibrate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorIndexOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorIndexOptions build() {
			_checkSingleUse();

			return new DenseVectorIndexOptions(this);
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
	 * Json deserializer for {@link DenseVectorIndexOptions}
	 */
	public static final JsonpDeserializer<DenseVectorIndexOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DenseVectorIndexOptions::setupDenseVectorIndexOptionsDeserializer);

	protected static void setupDenseVectorIndexOptionsDeserializer(
			ObjectDeserializer<DenseVectorIndexOptions.Builder> op) {

		op.add(Builder::confidenceInterval, JsonpDeserializer.floatDeserializer(), "confidence_interval");
		op.add(Builder::efConstruction, JsonpDeserializer.integerDeserializer(), "ef_construction");
		op.add(Builder::m, JsonpDeserializer.integerDeserializer(), "m");
		op.add(Builder::type, DenseVectorIndexOptionsType._DESERIALIZER, "type");
		op.add(Builder::rescoreVector, DenseVectorIndexOptionsRescoreVector._DESERIALIZER, "rescore_vector");
		op.add(Builder::onDiskRescore, JsonpDeserializer.booleanDeserializer(), "on_disk_rescore");
		op.add(Builder::flatIndexThreshold, JsonpDeserializer.integerDeserializer(), "flat_index_threshold");
		op.add(Builder::clusterSize, JsonpDeserializer.integerDeserializer(), "cluster_size");
		op.add(Builder::defaultVisitPercentage, JsonpDeserializer.floatDeserializer(), "default_visit_percentage");
		op.add(Builder::bits, JsonpDeserializer.integerDeserializer(), "bits");
		op.add(Builder::precondition, JsonpDeserializer.booleanDeserializer(), "precondition");
		op.add(Builder::autoCalibrate, JsonpDeserializer.booleanDeserializer(), "auto_calibrate");

	}

}
