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

package co.elastic.clients.elasticsearch.ml.info;

import co.elastic.clients.elasticsearch.ml.CategorizationAnalyzer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.info.AnomalyDetectors
public final class AnomalyDetectors implements JsonpSerializable {
	private final CategorizationAnalyzer categorizationAnalyzer;

	private final Number categorizationExamplesLimit;

	private final String modelMemoryLimit;

	private final Number modelSnapshotRetentionDays;

	private final Number dailyModelSnapshotRetentionAfterDays;

	// ---------------------------------------------------------------------------------------------

	public AnomalyDetectors(Builder builder) {

		this.categorizationAnalyzer = Objects.requireNonNull(builder.categorizationAnalyzer, "categorization_analyzer");
		this.categorizationExamplesLimit = Objects.requireNonNull(builder.categorizationExamplesLimit,
				"categorization_examples_limit");
		this.modelMemoryLimit = Objects.requireNonNull(builder.modelMemoryLimit, "model_memory_limit");
		this.modelSnapshotRetentionDays = Objects.requireNonNull(builder.modelSnapshotRetentionDays,
				"model_snapshot_retention_days");
		this.dailyModelSnapshotRetentionAfterDays = Objects.requireNonNull(builder.dailyModelSnapshotRetentionAfterDays,
				"daily_model_snapshot_retention_after_days");

	}

	/**
	 * API name: {@code categorization_analyzer}
	 */
	public CategorizationAnalyzer categorizationAnalyzer() {
		return this.categorizationAnalyzer;
	}

	/**
	 * API name: {@code categorization_examples_limit}
	 */
	public Number categorizationExamplesLimit() {
		return this.categorizationExamplesLimit;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	public Number dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
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

		generator.writeKey("categorization_analyzer");
		this.categorizationAnalyzer.serialize(generator, mapper);

		generator.writeKey("categorization_examples_limit");
		generator.write(this.categorizationExamplesLimit.doubleValue());

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("model_snapshot_retention_days");
		generator.write(this.modelSnapshotRetentionDays.doubleValue());

		generator.writeKey("daily_model_snapshot_retention_after_days");
		generator.write(this.dailyModelSnapshotRetentionAfterDays.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyDetectors}.
	 */
	public static class Builder implements ObjectBuilder<AnomalyDetectors> {
		private CategorizationAnalyzer categorizationAnalyzer;

		private Number categorizationExamplesLimit;

		private String modelMemoryLimit;

		private Number modelSnapshotRetentionDays;

		private Number dailyModelSnapshotRetentionAfterDays;

		/**
		 * API name: {@code categorization_analyzer}
		 */
		public Builder categorizationAnalyzer(CategorizationAnalyzer value) {
			this.categorizationAnalyzer = value;
			return this;
		}

		/**
		 * API name: {@code categorization_analyzer}
		 */
		public Builder categorizationAnalyzer(
				Function<CategorizationAnalyzer.Builder, ObjectBuilder<CategorizationAnalyzer>> fn) {
			return this.categorizationAnalyzer(fn.apply(new CategorizationAnalyzer.Builder()).build());
		}

		/**
		 * API name: {@code categorization_examples_limit}
		 */
		public Builder categorizationExamplesLimit(Number value) {
			this.categorizationExamplesLimit = value;
			return this;
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(Number value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * Builds a {@link AnomalyDetectors}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnomalyDetectors build() {

			return new AnomalyDetectors(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnomalyDetectors}
	 */
	public static final JsonpDeserializer<AnomalyDetectors> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnomalyDetectors::setupAnomalyDetectorsDeserializer);

	protected static void setupAnomalyDetectorsDeserializer(DelegatingDeserializer<AnomalyDetectors.Builder> op) {

		op.add(Builder::categorizationAnalyzer, CategorizationAnalyzer.DESERIALIZER, "categorization_analyzer");
		op.add(Builder::categorizationExamplesLimit, JsonpDeserializer.numberDeserializer(),
				"categorization_examples_limit");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.numberDeserializer(),
				"daily_model_snapshot_retention_after_days");

	}

}
