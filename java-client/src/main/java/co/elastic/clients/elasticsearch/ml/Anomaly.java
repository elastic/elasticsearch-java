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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Anomaly

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Anomaly">API
 *      specification</a>
 */
@JsonpDeserializable
public class Anomaly implements JsonpSerializable {
	private final List<Double> actual;

	private final long bucketSpan;

	@Nullable
	private final String byFieldName;

	@Nullable
	private final String byFieldValue;

	private final List<AnomalyCause> causes;

	private final int detectorIndex;

	@Nullable
	private final String fieldName;

	@Nullable
	private final String function;

	@Nullable
	private final String functionDescription;

	private final List<Influence> influencers;

	private final double initialRecordScore;

	private final boolean isInterim;

	private final String jobId;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String overFieldValue;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String partitionFieldValue;

	private final double probability;

	private final double recordScore;

	private final String resultType;

	private final long timestamp;

	private final List<Double> typical;

	// ---------------------------------------------------------------------------------------------

	private Anomaly(Builder builder) {

		this.actual = ApiTypeHelper.unmodifiable(builder.actual);
		this.bucketSpan = ApiTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.byFieldName = builder.byFieldName;
		this.byFieldValue = builder.byFieldValue;
		this.causes = ApiTypeHelper.unmodifiable(builder.causes);
		this.detectorIndex = ApiTypeHelper.requireNonNull(builder.detectorIndex, this, "detectorIndex");
		this.fieldName = builder.fieldName;
		this.function = builder.function;
		this.functionDescription = builder.functionDescription;
		this.influencers = ApiTypeHelper.unmodifiable(builder.influencers);
		this.initialRecordScore = ApiTypeHelper.requireNonNull(builder.initialRecordScore, this, "initialRecordScore");
		this.isInterim = ApiTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.overFieldName = builder.overFieldName;
		this.overFieldValue = builder.overFieldValue;
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.recordScore = ApiTypeHelper.requireNonNull(builder.recordScore, this, "recordScore");
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.typical = ApiTypeHelper.unmodifiable(builder.typical);

	}

	public static Anomaly of(Function<Builder, ObjectBuilder<Anomaly>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code actual}
	 */
	public final List<Double> actual() {
		return this.actual;
	}

	/**
	 * Required - API name: {@code bucket_span}
	 */
	public final long bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public final String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * API name: {@code by_field_value}
	 */
	@Nullable
	public final String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * API name: {@code causes}
	 */
	public final List<AnomalyCause> causes() {
		return this.causes;
	}

	/**
	 * Required - API name: {@code detector_index}
	 */
	public final int detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * API name: {@code field_name}
	 */
	@Nullable
	public final String fieldName() {
		return this.fieldName;
	}

	/**
	 * API name: {@code function}
	 */
	@Nullable
	public final String function() {
		return this.function;
	}

	/**
	 * API name: {@code function_description}
	 */
	@Nullable
	public final String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * API name: {@code influencers}
	 */
	public final List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * Required - API name: {@code initial_record_score}
	 */
	public final double initialRecordScore() {
		return this.initialRecordScore;
	}

	/**
	 * Required - API name: {@code is_interim}
	 */
	public final boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public final String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * API name: {@code over_field_value}
	 */
	@Nullable
	public final String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public final String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public final String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Required - API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * Required - API name: {@code record_score}
	 */
	public final double recordScore() {
		return this.recordScore;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code typical}
	 */
	public final List<Double> typical() {
		return this.typical;
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

		if (ApiTypeHelper.isDefined(this.actual)) {
			generator.writeKey("actual");
			generator.writeStartArray();
			for (Double item0 : this.actual) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		if (this.byFieldName != null) {
			generator.writeKey("by_field_name");
			generator.write(this.byFieldName);

		}
		if (this.byFieldValue != null) {
			generator.writeKey("by_field_value");
			generator.write(this.byFieldValue);

		}
		if (ApiTypeHelper.isDefined(this.causes)) {
			generator.writeKey("causes");
			generator.writeStartArray();
			for (AnomalyCause item0 : this.causes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("detector_index");
		generator.write(this.detectorIndex);

		if (this.fieldName != null) {
			generator.writeKey("field_name");
			generator.write(this.fieldName);

		}
		if (this.function != null) {
			generator.writeKey("function");
			generator.write(this.function);

		}
		if (this.functionDescription != null) {
			generator.writeKey("function_description");
			generator.write(this.functionDescription);

		}
		if (ApiTypeHelper.isDefined(this.influencers)) {
			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influence item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("initial_record_score");
		generator.write(this.initialRecordScore);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		if (this.overFieldName != null) {
			generator.writeKey("over_field_name");
			generator.write(this.overFieldName);

		}
		if (this.overFieldValue != null) {
			generator.writeKey("over_field_value");
			generator.write(this.overFieldValue);

		}
		if (this.partitionFieldName != null) {
			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.partitionFieldValue != null) {
			generator.writeKey("partition_field_value");
			generator.write(this.partitionFieldValue);

		}
		generator.writeKey("probability");
		generator.write(this.probability);

		generator.writeKey("record_score");
		generator.write(this.recordScore);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (ApiTypeHelper.isDefined(this.typical)) {
			generator.writeKey("typical");
			generator.writeStartArray();
			for (Double item0 : this.typical) {
				generator.write(item0);

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
	 * Builder for {@link Anomaly}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Anomaly> {
		@Nullable
		private List<Double> actual;

		private Long bucketSpan;

		@Nullable
		private String byFieldName;

		@Nullable
		private String byFieldValue;

		@Nullable
		private List<AnomalyCause> causes;

		private Integer detectorIndex;

		@Nullable
		private String fieldName;

		@Nullable
		private String function;

		@Nullable
		private String functionDescription;

		@Nullable
		private List<Influence> influencers;

		private Double initialRecordScore;

		private Boolean isInterim;

		private String jobId;

		@Nullable
		private String overFieldName;

		@Nullable
		private String overFieldValue;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private String partitionFieldValue;

		private Double probability;

		private Double recordScore;

		private String resultType;

		private Long timestamp;

		@Nullable
		private List<Double> typical;

		/**
		 * API name: {@code actual}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actual</code>.
		 */
		public final Builder actual(List<Double> list) {
			this.actual = _listAddAll(this.actual, list);
			return this;
		}

		/**
		 * API name: {@code actual}
		 * <p>
		 * Adds one or more values to <code>actual</code>.
		 */
		public final Builder actual(Double value, Double... values) {
			this.actual = _listAdd(this.actual, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(long value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * API name: {@code by_field_name}
		 */
		public final Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * API name: {@code by_field_value}
		 */
		public final Builder byFieldValue(@Nullable String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code causes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>causes</code>.
		 */
		public final Builder causes(List<AnomalyCause> list) {
			this.causes = _listAddAll(this.causes, list);
			return this;
		}

		/**
		 * API name: {@code causes}
		 * <p>
		 * Adds one or more values to <code>causes</code>.
		 */
		public final Builder causes(AnomalyCause value, AnomalyCause... values) {
			this.causes = _listAdd(this.causes, value, values);
			return this;
		}

		/**
		 * API name: {@code causes}
		 * <p>
		 * Adds a value to <code>causes</code> using a builder lambda.
		 */
		public final Builder causes(Function<AnomalyCause.Builder, ObjectBuilder<AnomalyCause>> fn) {
			return causes(fn.apply(new AnomalyCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code detector_index}
		 */
		public final Builder detectorIndex(int value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * API name: {@code field_name}
		 */
		public final Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * API name: {@code function}
		 */
		public final Builder function(@Nullable String value) {
			this.function = value;
			return this;
		}

		/**
		 * API name: {@code function_description}
		 */
		public final Builder functionDescription(@Nullable String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>influencers</code>.
		 */
		public final Builder influencers(List<Influence> list) {
			this.influencers = _listAddAll(this.influencers, list);
			return this;
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds one or more values to <code>influencers</code>.
		 */
		public final Builder influencers(Influence value, Influence... values) {
			this.influencers = _listAdd(this.influencers, value, values);
			return this;
		}

		/**
		 * API name: {@code influencers}
		 * <p>
		 * Adds a value to <code>influencers</code> using a builder lambda.
		 */
		public final Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return influencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * Required - API name: {@code initial_record_score}
		 */
		public final Builder initialRecordScore(double value) {
			this.initialRecordScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code is_interim}
		 */
		public final Builder isInterim(boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code over_field_name}
		 */
		public final Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * API name: {@code over_field_value}
		 */
		public final Builder overFieldValue(@Nullable String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public final Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * Required - API name: {@code record_score}
		 */
		public final Builder recordScore(double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>typical</code>.
		 */
		public final Builder typical(List<Double> list) {
			this.typical = _listAddAll(this.typical, list);
			return this;
		}

		/**
		 * API name: {@code typical}
		 * <p>
		 * Adds one or more values to <code>typical</code>.
		 */
		public final Builder typical(Double value, Double... values) {
			this.typical = _listAdd(this.typical, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Anomaly}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Anomaly build() {
			_checkSingleUse();

			return new Anomaly(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Anomaly}
	 */
	public static final JsonpDeserializer<Anomaly> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Anomaly::setupAnomalyDeserializer);

	protected static void setupAnomalyDeserializer(ObjectDeserializer<Anomaly.Builder> op) {

		op.add(Builder::actual, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()), "actual");
		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::byFieldValue, JsonpDeserializer.stringDeserializer(), "by_field_value");
		op.add(Builder::causes, JsonpDeserializer.arrayDeserializer(AnomalyCause._DESERIALIZER), "causes");
		op.add(Builder::detectorIndex, JsonpDeserializer.integerDeserializer(), "detector_index");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::functionDescription, JsonpDeserializer.stringDeserializer(), "function_description");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influence._DESERIALIZER), "influencers");
		op.add(Builder::initialRecordScore, JsonpDeserializer.doubleDeserializer(), "initial_record_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::overFieldName, JsonpDeserializer.stringDeserializer(), "over_field_name");
		op.add(Builder::overFieldValue, JsonpDeserializer.stringDeserializer(), "over_field_value");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::typical, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"typical");

	}

}
