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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Anomaly
public final class Anomaly implements JsonpSerializable {
	@Nullable
	private final List<Number> actual;

	private final JsonValue bucketSpan;

	@Nullable
	private final String byFieldName;

	@Nullable
	private final String byFieldValue;

	@Nullable
	private final List<AnomalyCause> causes;

	private final Number detectorIndex;

	@Nullable
	private final String fieldName;

	@Nullable
	private final String function;

	@Nullable
	private final String functionDescription;

	@Nullable
	private final List<Influence> influencers;

	private final Number initialRecordScore;

	private final Boolean isInterim;

	private final String jobId;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String overFieldValue;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String partitionFieldValue;

	private final Number probability;

	private final Number recordScore;

	private final String resultType;

	private final JsonValue timestamp;

	@Nullable
	private final List<Number> typical;

	// ---------------------------------------------------------------------------------------------

	public Anomaly(Builder builder) {

		this.actual = builder.actual;
		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.byFieldName = builder.byFieldName;
		this.byFieldValue = builder.byFieldValue;
		this.causes = builder.causes;
		this.detectorIndex = Objects.requireNonNull(builder.detectorIndex, "detector_index");
		this.fieldName = builder.fieldName;
		this.function = builder.function;
		this.functionDescription = builder.functionDescription;
		this.influencers = builder.influencers;
		this.initialRecordScore = Objects.requireNonNull(builder.initialRecordScore, "initial_record_score");
		this.isInterim = Objects.requireNonNull(builder.isInterim, "is_interim");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.overFieldName = builder.overFieldName;
		this.overFieldValue = builder.overFieldValue;
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.probability = Objects.requireNonNull(builder.probability, "probability");
		this.recordScore = Objects.requireNonNull(builder.recordScore, "record_score");
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.typical = builder.typical;

	}

	/**
	 * API name: {@code actual}
	 */
	@Nullable
	public List<Number> actual() {
		return this.actual;
	}

	/**
	 * API name: {@code bucket_span}
	 */
	public JsonValue bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * API name: {@code by_field_value}
	 */
	@Nullable
	public String byFieldValue() {
		return this.byFieldValue;
	}

	/**
	 * API name: {@code causes}
	 */
	@Nullable
	public List<AnomalyCause> causes() {
		return this.causes;
	}

	/**
	 * API name: {@code detector_index}
	 */
	public Number detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * API name: {@code field_name}
	 */
	@Nullable
	public String fieldName() {
		return this.fieldName;
	}

	/**
	 * API name: {@code function}
	 */
	@Nullable
	public String function() {
		return this.function;
	}

	/**
	 * API name: {@code function_description}
	 */
	@Nullable
	public String functionDescription() {
		return this.functionDescription;
	}

	/**
	 * API name: {@code influencers}
	 */
	@Nullable
	public List<Influence> influencers() {
		return this.influencers;
	}

	/**
	 * API name: {@code initial_record_score}
	 */
	public Number initialRecordScore() {
		return this.initialRecordScore;
	}

	/**
	 * API name: {@code is_interim}
	 */
	public Boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * API name: {@code over_field_value}
	 */
	@Nullable
	public String overFieldValue() {
		return this.overFieldValue;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * API name: {@code probability}
	 */
	public Number probability() {
		return this.probability;
	}

	/**
	 * API name: {@code record_score}
	 */
	public Number recordScore() {
		return this.recordScore;
	}

	/**
	 * API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public JsonValue timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code typical}
	 */
	@Nullable
	public List<Number> typical() {
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

		if (this.actual != null) {

			generator.writeKey("actual");
			generator.writeStartArray();
			for (Number item0 : this.actual) {
				generator.write(item0.doubleValue());

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
		if (this.causes != null) {

			generator.writeKey("causes");
			generator.writeStartArray();
			for (AnomalyCause item0 : this.causes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("detector_index");
		generator.write(this.detectorIndex.doubleValue());

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
		if (this.influencers != null) {

			generator.writeKey("influencers");
			generator.writeStartArray();
			for (Influence item0 : this.influencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("initial_record_score");
		generator.write(this.initialRecordScore.doubleValue());

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
		generator.write(this.probability.doubleValue());

		generator.writeKey("record_score");
		generator.write(this.recordScore.doubleValue());

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (this.typical != null) {

			generator.writeKey("typical");
			generator.writeStartArray();
			for (Number item0 : this.typical) {
				generator.write(item0.doubleValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Anomaly}.
	 */
	public static class Builder implements ObjectBuilder<Anomaly> {
		@Nullable
		private List<Number> actual;

		private JsonValue bucketSpan;

		@Nullable
		private String byFieldName;

		@Nullable
		private String byFieldValue;

		@Nullable
		private List<AnomalyCause> causes;

		private Number detectorIndex;

		@Nullable
		private String fieldName;

		@Nullable
		private String function;

		@Nullable
		private String functionDescription;

		@Nullable
		private List<Influence> influencers;

		private Number initialRecordScore;

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

		private Number probability;

		private Number recordScore;

		private String resultType;

		private JsonValue timestamp;

		@Nullable
		private List<Number> typical;

		/**
		 * API name: {@code actual}
		 */
		public Builder actual(@Nullable List<Number> value) {
			this.actual = value;
			return this;
		}

		/**
		 * API name: {@code actual}
		 */
		public Builder actual(Number... value) {
			this.actual = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actual(List)}, creating the list if needed.
		 */
		public Builder addActual(Number value) {
			if (this.actual == null) {
				this.actual = new ArrayList<>();
			}
			this.actual.add(value);
			return this;
		}

		/**
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(JsonValue value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * API name: {@code by_field_name}
		 */
		public Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * API name: {@code by_field_value}
		 */
		public Builder byFieldValue(@Nullable String value) {
			this.byFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code causes}
		 */
		public Builder causes(@Nullable List<AnomalyCause> value) {
			this.causes = value;
			return this;
		}

		/**
		 * API name: {@code causes}
		 */
		public Builder causes(AnomalyCause... value) {
			this.causes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #causes(List)}, creating the list if needed.
		 */
		public Builder addCauses(AnomalyCause value) {
			if (this.causes == null) {
				this.causes = new ArrayList<>();
			}
			this.causes.add(value);
			return this;
		}

		/**
		 * Set {@link #causes(List)} to a singleton list.
		 */
		public Builder causes(Function<AnomalyCause.Builder, ObjectBuilder<AnomalyCause>> fn) {
			return this.causes(fn.apply(new AnomalyCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #causes(List)}, creating the list if needed.
		 */
		public Builder addCauses(Function<AnomalyCause.Builder, ObjectBuilder<AnomalyCause>> fn) {
			return this.addCauses(fn.apply(new AnomalyCause.Builder()).build());
		}

		/**
		 * API name: {@code detector_index}
		 */
		public Builder detectorIndex(Number value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * API name: {@code field_name}
		 */
		public Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * API name: {@code function}
		 */
		public Builder function(@Nullable String value) {
			this.function = value;
			return this;
		}

		/**
		 * API name: {@code function_description}
		 */
		public Builder functionDescription(@Nullable String value) {
			this.functionDescription = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(@Nullable List<Influence> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * API name: {@code influencers}
		 */
		public Builder influencers(Influence... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(Influence value) {
			if (this.influencers == null) {
				this.influencers = new ArrayList<>();
			}
			this.influencers.add(value);
			return this;
		}

		/**
		 * Set {@link #influencers(List)} to a singleton list.
		 */
		public Builder influencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return this.influencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(Function<Influence.Builder, ObjectBuilder<Influence>> fn) {
			return this.addInfluencers(fn.apply(new Influence.Builder()).build());
		}

		/**
		 * API name: {@code initial_record_score}
		 */
		public Builder initialRecordScore(Number value) {
			this.initialRecordScore = value;
			return this;
		}

		/**
		 * API name: {@code is_interim}
		 */
		public Builder isInterim(Boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code over_field_name}
		 */
		public Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * API name: {@code over_field_value}
		 */
		public Builder overFieldValue(@Nullable String value) {
			this.overFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_value}
		 */
		public Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code probability}
		 */
		public Builder probability(Number value) {
			this.probability = value;
			return this;
		}

		/**
		 * API name: {@code record_score}
		 */
		public Builder recordScore(Number value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(JsonValue value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 */
		public Builder typical(@Nullable List<Number> value) {
			this.typical = value;
			return this;
		}

		/**
		 * API name: {@code typical}
		 */
		public Builder typical(Number... value) {
			this.typical = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #typical(List)}, creating the list if needed.
		 */
		public Builder addTypical(Number value) {
			if (this.typical == null) {
				this.typical = new ArrayList<>();
			}
			this.typical.add(value);
			return this;
		}

		/**
		 * Builds a {@link Anomaly}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Anomaly build() {

			return new Anomaly(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Anomaly}
	 */
	public static final JsonpDeserializer<Anomaly> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Anomaly::setupAnomalyDeserializer);

	protected static void setupAnomalyDeserializer(DelegatingDeserializer<Anomaly.Builder> op) {

		op.add(Builder::actual, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "actual");
		op.add(Builder::bucketSpan, JsonpDeserializer.jsonValueDeserializer(), "bucket_span");
		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::byFieldValue, JsonpDeserializer.stringDeserializer(), "by_field_value");
		op.add(Builder::causes, JsonpDeserializer.arrayDeserializer(AnomalyCause.DESERIALIZER), "causes");
		op.add(Builder::detectorIndex, JsonpDeserializer.numberDeserializer(), "detector_index");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::functionDescription, JsonpDeserializer.stringDeserializer(), "function_description");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(Influence.DESERIALIZER), "influencers");
		op.add(Builder::initialRecordScore, JsonpDeserializer.numberDeserializer(), "initial_record_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::overFieldName, JsonpDeserializer.stringDeserializer(), "over_field_name");
		op.add(Builder::overFieldValue, JsonpDeserializer.stringDeserializer(), "over_field_value");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::probability, JsonpDeserializer.numberDeserializer(), "probability");
		op.add(Builder::recordScore, JsonpDeserializer.numberDeserializer(), "record_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.jsonValueDeserializer(), "timestamp");
		op.add(Builder::typical, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()),
				"typical");

	}

}
