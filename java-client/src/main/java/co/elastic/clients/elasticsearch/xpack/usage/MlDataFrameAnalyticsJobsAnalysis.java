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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlDataFrameAnalyticsJobsAnalysis

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlDataFrameAnalyticsJobsAnalysis">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlDataFrameAnalyticsJobsAnalysis implements JsonpSerializable {
	@Nullable
	private final Integer classification;

	@Nullable
	private final Integer outlierDetection;

	@Nullable
	private final Integer regression;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsJobsAnalysis(Builder builder) {

		this.classification = builder.classification;
		this.outlierDetection = builder.outlierDetection;
		this.regression = builder.regression;

	}

	public static MlDataFrameAnalyticsJobsAnalysis of(
			Function<Builder, ObjectBuilder<MlDataFrameAnalyticsJobsAnalysis>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code classification}
	 */
	@Nullable
	public final Integer classification() {
		return this.classification;
	}

	/**
	 * API name: {@code outlier_detection}
	 */
	@Nullable
	public final Integer outlierDetection() {
		return this.outlierDetection;
	}

	/**
	 * API name: {@code regression}
	 */
	@Nullable
	public final Integer regression() {
		return this.regression;
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

		if (this.classification != null) {
			generator.writeKey("classification");
			generator.write(this.classification);

		}
		if (this.outlierDetection != null) {
			generator.writeKey("outlier_detection");
			generator.write(this.outlierDetection);

		}
		if (this.regression != null) {
			generator.writeKey("regression");
			generator.write(this.regression);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsAnalysis}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsJobsAnalysis> {
		@Nullable
		private Integer classification;

		@Nullable
		private Integer outlierDetection;

		@Nullable
		private Integer regression;

		/**
		 * API name: {@code classification}
		 */
		public final Builder classification(@Nullable Integer value) {
			this.classification = value;
			return this;
		}

		/**
		 * API name: {@code outlier_detection}
		 */
		public final Builder outlierDetection(@Nullable Integer value) {
			this.outlierDetection = value;
			return this;
		}

		/**
		 * API name: {@code regression}
		 */
		public final Builder regression(@Nullable Integer value) {
			this.regression = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsAnalysis}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsAnalysis build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsJobsAnalysis(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobsAnalysis}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsAnalysis> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlDataFrameAnalyticsJobsAnalysis::setupMlDataFrameAnalyticsJobsAnalysisDeserializer);

	protected static void setupMlDataFrameAnalyticsJobsAnalysisDeserializer(
			ObjectDeserializer<MlDataFrameAnalyticsJobsAnalysis.Builder> op) {

		op.add(Builder::classification, JsonpDeserializer.integerDeserializer(), "classification");
		op.add(Builder::outlierDetection, JsonpDeserializer.integerDeserializer(), "outlier_detection");
		op.add(Builder::regression, JsonpDeserializer.integerDeserializer(), "regression");

	}

}
