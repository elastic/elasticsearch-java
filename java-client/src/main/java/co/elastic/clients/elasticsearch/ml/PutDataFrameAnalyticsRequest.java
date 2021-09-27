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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_data_frame_analytics.Request
@JsonpDeserializable
public final class PutDataFrameAnalyticsRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final Boolean allowLazyStart;

	private final DataframeAnalysis analysis;

	@Nullable
	private final JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	@Nullable
	private final Integer maxNumThreads;

	@Nullable
	private final String modelMemoryLimit;

	private final DataframeAnalyticsSource source;

	// ---------------------------------------------------------------------------------------------

	public PutDataFrameAnalyticsRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.allowLazyStart = builder.allowLazyStart;
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.analyzedFields = builder.analyzedFields;
		this.description = builder.description;
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.maxNumThreads = builder.maxNumThreads;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.source = Objects.requireNonNull(builder.source, "source");

	}

	/**
	 * Identifier for the data frame analytics job. This identifier can contain
	 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
	 * must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Specifies whether this job can start when there is insufficient machine
	 * learning node capacity for it to be immediately assigned to a node. If set to
	 * false and a machine learning node with capacity to run the job cannot be
	 * immediately found, the API returns an error. If set to true, the API does not
	 * return an error; the job waits in the <code>starting</code> state until
	 * sufficient machine learning node capacity is available. This behavior is also
	 * affected by the cluster-wide <code>xpack.ml.max_lazy_ml_nodes</code> setting.
	 * <p>
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * The analysis configuration, which contains the information necessary to
	 * perform one of the following types of analysis: classification, outlier
	 * detection, or regression.
	 * <p>
	 * API name: {@code analysis}
	 */
	public DataframeAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * Specifies <code>includes</code> and/or <code>excludes</code> patterns to
	 * select which fields will be included in the analysis. The patterns specified
	 * in <code>excludes</code> are applied last, therefore <code>excludes</code>
	 * takes precedence. In other words, if the same field is specified in both
	 * <code>includes</code> and <code>excludes</code>, then the field will not be
	 * included in the analysis. If <code>analyzed_fields</code> is not set, only
	 * the relevant fields will be included. For example, all the numeric fields for
	 * outlier detection. The supported fields vary for each type of analysis.
	 * Outlier detection requires numeric or <code>boolean</code> data to analyze.
	 * The algorithms don’t support missing values therefore fields that have data
	 * types other than numeric or boolean are ignored. Documents where included
	 * fields contain missing values, null values, or an array are also ignored.
	 * Therefore the <code>dest</code> index may contain documents that don’t have
	 * an outlier score. Regression supports fields that are numeric,
	 * <code>boolean</code>, <code>text</code>, <code>keyword</code>, and
	 * <code>ip</code> data types. It is also tolerant of missing values. Fields
	 * that are supported are included in the analysis, other fields are ignored.
	 * Documents where included fields contain an array with two or more values are
	 * also ignored. Documents in the <code>dest</code> index that don’t contain a
	 * results field are not included in the regression analysis. Classification
	 * supports fields that are numeric, <code>boolean</code>, <code>text</code>,
	 * <code>keyword</code>, and <code>ip</code> data types. It is also tolerant of
	 * missing values. Fields that are supported are included in the analysis, other
	 * fields are ignored. Documents where included fields contain an array with two
	 * or more values are also ignored. Documents in the <code>dest</code> index
	 * that don’t contain a results field are not included in the classification
	 * analysis. Classification analysis can be improved by mapping ordinal variable
	 * values to a single number. For example, in case of age ranges, you can model
	 * the values as <code>0-14 = 0</code>, <code>15-24 = 1</code>,
	 * <code>25-34 = 2</code>, and so on.
	 * <p>
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * The destination configuration.
	 * <p>
	 * API name: {@code dest}
	 */
	public DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * The maximum number of threads to be used by the analysis. Using more threads
	 * may decrease the time necessary to complete the analysis at the cost of using
	 * more CPU. Note that the process may use additional threads for operational
	 * functionality other than the analysis itself.
	 * <p>
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public Integer maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * The approximate maximum amount of memory resources that are permitted for
	 * analytical processing. If your <code>elasticsearch.yml</code> file contains
	 * an <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
	 * you try to create data frame analytics jobs that have
	 * <code>model_memory_limit</code> values greater than that setting.
	 * <p>
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * The configuration of how to source the analysis data.
	 * <p>
	 * API name: {@code source}
	 */
	public DataframeAnalyticsSource source() {
		return this.source;
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

		if (this.allowLazyStart != null) {

			generator.writeKey("allow_lazy_start");
			generator.write(this.allowLazyStart);

		}

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		if (this.maxNumThreads != null) {

			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads);

		}
		if (this.modelMemoryLimit != null) {

			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutDataFrameAnalyticsRequest> {
		private String id;

		@Nullable
		private Boolean allowLazyStart;

		private DataframeAnalysis analysis;

		@Nullable
		private JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		@Nullable
		private Integer maxNumThreads;

		@Nullable
		private String modelMemoryLimit;

		private DataframeAnalyticsSource source;

		/**
		 * Identifier for the data frame analytics job. This identifier can contain
		 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
		 * must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specifies whether this job can start when there is insufficient machine
		 * learning node capacity for it to be immediately assigned to a node. If set to
		 * false and a machine learning node with capacity to run the job cannot be
		 * immediately found, the API returns an error. If set to true, the API does not
		 * return an error; the job waits in the <code>starting</code> state until
		 * sufficient machine learning node capacity is available. This behavior is also
		 * affected by the cluster-wide <code>xpack.ml.max_lazy_ml_nodes</code> setting.
		 * <p>
		 * API name: {@code allow_lazy_start}
		 */
		public Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * The analysis configuration, which contains the information necessary to
		 * perform one of the following types of analysis: classification, outlier
		 * detection, or regression.
		 * <p>
		 * API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * The analysis configuration, which contains the information necessary to
		 * perform one of the following types of analysis: classification, outlier
		 * detection, or regression.
		 * <p>
		 * API name: {@code analysis}
		 */
		public Builder analysis(Function<DataframeAnalysis.Builder, ObjectBuilder<DataframeAnalysis>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysis.Builder()).build());
		}

		/**
		 * Specifies <code>includes</code> and/or <code>excludes</code> patterns to
		 * select which fields will be included in the analysis. The patterns specified
		 * in <code>excludes</code> are applied last, therefore <code>excludes</code>
		 * takes precedence. In other words, if the same field is specified in both
		 * <code>includes</code> and <code>excludes</code>, then the field will not be
		 * included in the analysis. If <code>analyzed_fields</code> is not set, only
		 * the relevant fields will be included. For example, all the numeric fields for
		 * outlier detection. The supported fields vary for each type of analysis.
		 * Outlier detection requires numeric or <code>boolean</code> data to analyze.
		 * The algorithms don’t support missing values therefore fields that have data
		 * types other than numeric or boolean are ignored. Documents where included
		 * fields contain missing values, null values, or an array are also ignored.
		 * Therefore the <code>dest</code> index may contain documents that don’t have
		 * an outlier score. Regression supports fields that are numeric,
		 * <code>boolean</code>, <code>text</code>, <code>keyword</code>, and
		 * <code>ip</code> data types. It is also tolerant of missing values. Fields
		 * that are supported are included in the analysis, other fields are ignored.
		 * Documents where included fields contain an array with two or more values are
		 * also ignored. Documents in the <code>dest</code> index that don’t contain a
		 * results field are not included in the regression analysis. Classification
		 * supports fields that are numeric, <code>boolean</code>, <code>text</code>,
		 * <code>keyword</code>, and <code>ip</code> data types. It is also tolerant of
		 * missing values. Fields that are supported are included in the analysis, other
		 * fields are ignored. Documents where included fields contain an array with two
		 * or more values are also ignored. Documents in the <code>dest</code> index
		 * that don’t contain a results field are not included in the classification
		 * analysis. Classification analysis can be improved by mapping ordinal variable
		 * values to a single number. For example, in case of age ranges, you can model
		 * the values as <code>0-14 = 0</code>, <code>15-24 = 1</code>,
		 * <code>25-34 = 2</code>, and so on.
		 * <p>
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The destination configuration.
		 * <p>
		 * API name: {@code dest}
		 */
		public Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * The destination configuration.
		 * <p>
		 * API name: {@code dest}
		 */
		public Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * The maximum number of threads to be used by the analysis. Using more threads
		 * may decrease the time necessary to complete the analysis at the cost of using
		 * more CPU. Note that the process may use additional threads for operational
		 * functionality other than the analysis itself.
		 * <p>
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(@Nullable Integer value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * The approximate maximum amount of memory resources that are permitted for
		 * analytical processing. If your <code>elasticsearch.yml</code> file contains
		 * an <code>xpack.ml.max_model_memory_limit</code> setting, an error occurs when
		 * you try to create data frame analytics jobs that have
		 * <code>model_memory_limit</code> values greater than that setting.
		 * <p>
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * The configuration of how to source the analysis data.
		 * <p>
		 * API name: {@code source}
		 */
		public Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * The configuration of how to source the analysis data.
		 * <p>
		 * API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * Builds a {@link PutDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataFrameAnalyticsRequest build() {

			return new PutDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDataFrameAnalyticsRequest}
	 */
	public static final JsonpDeserializer<PutDataFrameAnalyticsRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, PutDataFrameAnalyticsRequest::setupPutDataFrameAnalyticsRequestDeserializer, Builder::build);

	protected static void setupPutDataFrameAnalyticsRequestDeserializer(
			DelegatingDeserializer<PutDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::analyzedFields, JsonpDeserializer.jsonValueDeserializer(), "analyzed_fields");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_data_frame_analytics}".
	 */
	public static final Endpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutDataFrameAnalyticsResponse._DESERIALIZER);
}
