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

// typedef: ml.info.AnomalyDetectors

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.info.AnomalyDetectors">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnomalyDetectors implements JsonpSerializable {
	private final CategorizationAnalyzer categorizationAnalyzer;

	private final int categorizationExamplesLimit;

	private final String modelMemoryLimit;

	private final int modelSnapshotRetentionDays;

	private final int dailyModelSnapshotRetentionAfterDays;

	// ---------------------------------------------------------------------------------------------

	private AnomalyDetectors(Builder builder) {

		this.categorizationAnalyzer = ApiTypeHelper.requireNonNull(builder.categorizationAnalyzer, this,
				"categorizationAnalyzer");
		this.categorizationExamplesLimit = ApiTypeHelper.requireNonNull(builder.categorizationExamplesLimit, this,
				"categorizationExamplesLimit");
		this.modelMemoryLimit = ApiTypeHelper.requireNonNull(builder.modelMemoryLimit, this, "modelMemoryLimit");
		this.modelSnapshotRetentionDays = ApiTypeHelper.requireNonNull(builder.modelSnapshotRetentionDays, this,
				"modelSnapshotRetentionDays");
		this.dailyModelSnapshotRetentionAfterDays = ApiTypeHelper.requireNonNull(
				builder.dailyModelSnapshotRetentionAfterDays, this, "dailyModelSnapshotRetentionAfterDays");

	}

	public static AnomalyDetectors of(Function<Builder, ObjectBuilder<AnomalyDetectors>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code categorization_analyzer}
	 */
	public final CategorizationAnalyzer categorizationAnalyzer() {
		return this.categorizationAnalyzer;
	}

	/**
	 * Required - API name: {@code categorization_examples_limit}
	 */
	public final int categorizationExamplesLimit() {
		return this.categorizationExamplesLimit;
	}

	/**
	 * Required - API name: {@code model_memory_limit}
	 */
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * Required - API name: {@code model_snapshot_retention_days}
	 */
	public final int modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * Required - API name: {@code daily_model_snapshot_retention_after_days}
	 */
	public final int dailyModelSnapshotRetentionAfterDays() {
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
		generator.write(this.categorizationExamplesLimit);

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("model_snapshot_retention_days");
		generator.write(this.modelSnapshotRetentionDays);

		generator.writeKey("daily_model_snapshot_retention_after_days");
		generator.write(this.dailyModelSnapshotRetentionAfterDays);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyDetectors}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AnomalyDetectors> {
		private CategorizationAnalyzer categorizationAnalyzer;

		private Integer categorizationExamplesLimit;

		private String modelMemoryLimit;

		private Integer modelSnapshotRetentionDays;

		private Integer dailyModelSnapshotRetentionAfterDays;

		/**
		 * Required - API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(CategorizationAnalyzer value) {
			this.categorizationAnalyzer = value;
			return this;
		}

		/**
		 * Required - API name: {@code categorization_analyzer}
		 */
		public final Builder categorizationAnalyzer(
				Function<CategorizationAnalyzer.Builder, ObjectBuilder<CategorizationAnalyzer>> fn) {
			return this.categorizationAnalyzer(fn.apply(new CategorizationAnalyzer.Builder()).build());
		}

		/**
		 * Required - API name: {@code categorization_examples_limit}
		 */
		public final Builder categorizationExamplesLimit(int value) {
			this.categorizationExamplesLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code model_snapshot_retention_days}
		 */
		public final Builder modelSnapshotRetentionDays(int value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * Required - API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public final Builder dailyModelSnapshotRetentionAfterDays(int value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnomalyDetectors}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnomalyDetectors build() {
			_checkSingleUse();

			return new AnomalyDetectors(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnomalyDetectors}
	 */
	public static final JsonpDeserializer<AnomalyDetectors> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AnomalyDetectors::setupAnomalyDetectorsDeserializer);

	protected static void setupAnomalyDetectorsDeserializer(ObjectDeserializer<AnomalyDetectors.Builder> op) {

		op.add(Builder::categorizationAnalyzer, CategorizationAnalyzer._DESERIALIZER, "categorization_analyzer");
		op.add(Builder::categorizationExamplesLimit, JsonpDeserializer.integerDeserializer(),
				"categorization_examples_limit");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.integerDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.integerDeserializer(),
				"daily_model_snapshot_retention_after_days");

	}

}
