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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_data_frame_analytics.Request

/**
 * Instantiates a data frame analytics job. This API creates a data frame
 * analytics job that performs an analysis on the source indices and stores the
 * outcome in a destination index.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.put_data_frame_analytics.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDataFrameAnalyticsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowLazyStart;

	private final DataframeAnalysis analysis;

	@Nullable
	private final DataframeAnalysisAnalyzedFields analyzedFields;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	private final Map<String, List<String>> headers;

	private final String id;

	@Nullable
	private final Integer maxNumThreads;

	@Nullable
	private final String modelMemoryLimit;

	private final DataframeAnalyticsSource source;

	@Nullable
	private final String version;

	// ---------------------------------------------------------------------------------------------

	private PutDataFrameAnalyticsRequest(Builder builder) {

		this.allowLazyStart = builder.allowLazyStart;
		this.analysis = ApiTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.analyzedFields = builder.analyzedFields;
		this.description = builder.description;
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.maxNumThreads = builder.maxNumThreads;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.version = builder.version;

	}

	public static PutDataFrameAnalyticsRequest of(Function<Builder, ObjectBuilder<PutDataFrameAnalyticsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies whether this job can start when there is insufficient machine
	 * learning node capacity for it to be immediately assigned to a node. If set to
	 * <code>false</code> and a machine learning node with capacity to run the job
	 * cannot be immediately found, the API returns an error. If set to
	 * <code>true</code>, the API does not return an error; the job waits in the
	 * <code>starting</code> state until sufficient machine learning node capacity
	 * is available. This behavior is also affected by the cluster-wide
	 * <code>xpack.ml.max_lazy_ml_nodes</code> setting.
	 * <p>
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public final Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * Required - The analysis configuration, which contains the information
	 * necessary to perform one of the following types of analysis: classification,
	 * outlier detection, or regression.
	 * <p>
	 * API name: {@code analysis}
	 */
	public final DataframeAnalysis analysis() {
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
	public final DataframeAnalysisAnalyzedFields analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * A description of the job.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The destination configuration.
	 * <p>
	 * API name: {@code dest}
	 */
	public final DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * API name: {@code headers}
	 */
	public final Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * Required - Identifier for the data frame analytics job. This identifier can
	 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
	 * underscores. It must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
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
	public final Integer maxNumThreads() {
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
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * Required - The configuration of how to source the analysis data.
	 * <p>
	 * API name: {@code source}
	 */
	public final DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
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
			this.analyzedFields.serialize(generator, mapper);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
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

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataFrameAnalyticsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutDataFrameAnalyticsRequest> {
		@Nullable
		private Boolean allowLazyStart;

		private DataframeAnalysis analysis;

		@Nullable
		private DataframeAnalysisAnalyzedFields analyzedFields;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		@Nullable
		private Map<String, List<String>> headers;

		private String id;

		@Nullable
		private Integer maxNumThreads;

		@Nullable
		private String modelMemoryLimit;

		private DataframeAnalyticsSource source;

		@Nullable
		private String version;

		/**
		 * Specifies whether this job can start when there is insufficient machine
		 * learning node capacity for it to be immediately assigned to a node. If set to
		 * <code>false</code> and a machine learning node with capacity to run the job
		 * cannot be immediately found, the API returns an error. If set to
		 * <code>true</code>, the API does not return an error; the job waits in the
		 * <code>starting</code> state until sufficient machine learning node capacity
		 * is available. This behavior is also affected by the cluster-wide
		 * <code>xpack.ml.max_lazy_ml_nodes</code> setting.
		 * <p>
		 * API name: {@code allow_lazy_start}
		 */
		public final Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * Required - The analysis configuration, which contains the information
		 * necessary to perform one of the following types of analysis: classification,
		 * outlier detection, or regression.
		 * <p>
		 * API name: {@code analysis}
		 */
		public final Builder analysis(DataframeAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Required - The analysis configuration, which contains the information
		 * necessary to perform one of the following types of analysis: classification,
		 * outlier detection, or regression.
		 * <p>
		 * API name: {@code analysis}
		 */
		public final Builder analysis(Function<DataframeAnalysis.Builder, ObjectBuilder<DataframeAnalysis>> fn) {
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
		public final Builder analyzedFields(@Nullable DataframeAnalysisAnalyzedFields value) {
			this.analyzedFields = value;
			return this;
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
		public final Builder analyzedFields(
				Function<DataframeAnalysisAnalyzedFields.Builder, ObjectBuilder<DataframeAnalysisAnalyzedFields>> fn) {
			return this.analyzedFields(fn.apply(new DataframeAnalysisAnalyzedFields.Builder()).build());
		}

		/**
		 * A description of the job.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The destination configuration.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - The destination configuration.
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, List<String>> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, List<String> value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		/**
		 * Required - Identifier for the data frame analytics job. This identifier can
		 * contain lowercase alphanumeric characters (a-z and 0-9), hyphens, and
		 * underscores. It must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The maximum number of threads to be used by the analysis. Using more threads
		 * may decrease the time necessary to complete the analysis at the cost of using
		 * more CPU. Note that the process may use additional threads for operational
		 * functionality other than the analysis itself.
		 * <p>
		 * API name: {@code max_num_threads}
		 */
		public final Builder maxNumThreads(@Nullable Integer value) {
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
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - The configuration of how to source the analysis data.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The configuration of how to source the analysis data.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(
				Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataFrameAnalyticsRequest build() {
			_checkSingleUse();

			return new PutDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDataFrameAnalyticsRequest}
	 */
	public static final JsonpDeserializer<PutDataFrameAnalyticsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDataFrameAnalyticsRequest::setupPutDataFrameAnalyticsRequestDeserializer);

	protected static void setupPutDataFrameAnalyticsRequestDeserializer(
			ObjectDeserializer<PutDataFrameAnalyticsRequest.Builder> op) {

		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::analyzedFields, DataframeAnalysisAnalyzedFields._DESERIALIZER, "analyzed_fields");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_data_frame_analytics}".
	 */
	public static final Endpoint<PutDataFrameAnalyticsRequest, PutDataFrameAnalyticsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_data_frame_analytics",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutDataFrameAnalyticsResponse._DESERIALIZER);
}
