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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

// typedef: rollup.put_job.Request

/**
 * Creates a rollup job.
 * 
 * @see <a href="../doc-files/api-spec.html#rollup.put_job.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutJobRequest extends RequestBase implements JsonpSerializable {
	private final String cron;

	private final Groupings groups;

	private final Map<String, List<String>> headers;

	private final String id;

	private final String indexPattern;

	private final List<FieldMetric> metrics;

	private final int pageSize;

	private final String rollupIndex;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutJobRequest(Builder builder) {

		this.cron = ApiTypeHelper.requireNonNull(builder.cron, this, "cron");
		this.groups = ApiTypeHelper.requireNonNull(builder.groups, this, "groups");
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.indexPattern = ApiTypeHelper.requireNonNull(builder.indexPattern, this, "indexPattern");
		this.metrics = ApiTypeHelper.unmodifiable(builder.metrics);
		this.pageSize = ApiTypeHelper.requireNonNull(builder.pageSize, this, "pageSize");
		this.rollupIndex = ApiTypeHelper.requireNonNull(builder.rollupIndex, this, "rollupIndex");
		this.timeout = builder.timeout;

	}

	public static PutJobRequest of(Function<Builder, ObjectBuilder<PutJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A cron string which defines the intervals when the rollup job
	 * should be executed. When the interval triggers, the indexer attempts to
	 * rollup the data in the index pattern. The cron pattern is unrelated to the
	 * time interval of the data being rolled up. For example, you may wish to
	 * create hourly rollups of your document but to only run the indexer on a daily
	 * basis at midnight, as defined by the cron. The cron pattern is defined just
	 * like a Watcher cron schedule.
	 * <p>
	 * API name: {@code cron}
	 */
	public final String cron() {
		return this.cron;
	}

	/**
	 * Required - Defines the grouping fields and aggregations that are defined for
	 * this rollup job. These fields will then be available later for aggregating
	 * into buckets. These aggs and fields can be used in any combination. Think of
	 * the groups configuration as defining a set of tools that can later be used in
	 * aggregations to partition the data. Unlike raw data, we have to think ahead
	 * to which fields and aggregations might be used. Rollups provide enough
	 * flexibility that you simply need to determine which fields are needed, not in
	 * what order they are needed.
	 * <p>
	 * API name: {@code groups}
	 */
	public final Groupings groups() {
		return this.groups;
	}

	/**
	 * API name: {@code headers}
	 */
	public final Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * Required - Identifier for the rollup job. This can be any alphanumeric string
	 * and uniquely identifies the data that is associated with the rollup job. The
	 * ID is persistent; it is stored with the rolled up data. If you create a job,
	 * let it run for a while, then delete the job, the data that the job rolled up
	 * is still be associated with this job ID. You cannot create a new job with the
	 * same ID since that could lead to problems with mismatched job configurations.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The index or index pattern to roll up. Supports wildcard-style
	 * patterns (<code>logstash-*</code>). The job attempts to rollup the entire
	 * index or index-pattern.
	 * <p>
	 * API name: {@code index_pattern}
	 */
	public final String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * Defines the metrics to collect for each grouping tuple. By default, only the
	 * doc_counts are collected for each group. To make rollup useful, you will
	 * often add metrics like averages, mins, maxes, etc. Metrics are defined on a
	 * per-field basis and for each field you configure which metric should be
	 * collected.
	 * <p>
	 * API name: {@code metrics}
	 */
	public final List<FieldMetric> metrics() {
		return this.metrics;
	}

	/**
	 * Required - The number of bucket results that are processed on each iteration
	 * of the rollup indexer. A larger value tends to execute faster, but requires
	 * more memory during processing. This value has no effect on how the data is
	 * rolled up; it is merely used for tweaking the speed or memory cost of the
	 * indexer.
	 * <p>
	 * API name: {@code page_size}
	 */
	public final int pageSize() {
		return this.pageSize;
	}

	/**
	 * Required - The index that contains the rollup results. The index can be
	 * shared with other rollup jobs. The data is stored so that it doesn’t
	 * interfere with unrelated jobs.
	 * <p>
	 * API name: {@code rollup_index}
	 */
	public final String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * Time to wait for the request to complete.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		generator.writeKey("cron");
		generator.write(this.cron);

		generator.writeKey("groups");
		this.groups.serialize(generator, mapper);

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
		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		if (ApiTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (FieldMetric item0 : this.metrics) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("page_size");
		generator.write(this.pageSize);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutJobRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutJobRequest> {
		private String cron;

		private Groupings groups;

		@Nullable
		private Map<String, List<String>> headers;

		private String id;

		private String indexPattern;

		@Nullable
		private List<FieldMetric> metrics;

		private Integer pageSize;

		private String rollupIndex;

		@Nullable
		private Time timeout;

		/**
		 * Required - A cron string which defines the intervals when the rollup job
		 * should be executed. When the interval triggers, the indexer attempts to
		 * rollup the data in the index pattern. The cron pattern is unrelated to the
		 * time interval of the data being rolled up. For example, you may wish to
		 * create hourly rollups of your document but to only run the indexer on a daily
		 * basis at midnight, as defined by the cron. The cron pattern is defined just
		 * like a Watcher cron schedule.
		 * <p>
		 * API name: {@code cron}
		 */
		public final Builder cron(String value) {
			this.cron = value;
			return this;
		}

		/**
		 * Required - Defines the grouping fields and aggregations that are defined for
		 * this rollup job. These fields will then be available later for aggregating
		 * into buckets. These aggs and fields can be used in any combination. Think of
		 * the groups configuration as defining a set of tools that can later be used in
		 * aggregations to partition the data. Unlike raw data, we have to think ahead
		 * to which fields and aggregations might be used. Rollups provide enough
		 * flexibility that you simply need to determine which fields are needed, not in
		 * what order they are needed.
		 * <p>
		 * API name: {@code groups}
		 */
		public final Builder groups(Groupings value) {
			this.groups = value;
			return this;
		}

		/**
		 * Required - Defines the grouping fields and aggregations that are defined for
		 * this rollup job. These fields will then be available later for aggregating
		 * into buckets. These aggs and fields can be used in any combination. Think of
		 * the groups configuration as defining a set of tools that can later be used in
		 * aggregations to partition the data. Unlike raw data, we have to think ahead
		 * to which fields and aggregations might be used. Rollups provide enough
		 * flexibility that you simply need to determine which fields are needed, not in
		 * what order they are needed.
		 * <p>
		 * API name: {@code groups}
		 */
		public final Builder groups(Function<Groupings.Builder, ObjectBuilder<Groupings>> fn) {
			return this.groups(fn.apply(new Groupings.Builder()).build());
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
		 * Required - Identifier for the rollup job. This can be any alphanumeric string
		 * and uniquely identifies the data that is associated with the rollup job. The
		 * ID is persistent; it is stored with the rolled up data. If you create a job,
		 * let it run for a while, then delete the job, the data that the job rolled up
		 * is still be associated with this job ID. You cannot create a new job with the
		 * same ID since that could lead to problems with mismatched job configurations.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The index or index pattern to roll up. Supports wildcard-style
		 * patterns (<code>logstash-*</code>). The job attempts to rollup the entire
		 * index or index-pattern.
		 * <p>
		 * API name: {@code index_pattern}
		 */
		public final Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * Defines the metrics to collect for each grouping tuple. By default, only the
		 * doc_counts are collected for each group. To make rollup useful, you will
		 * often add metrics like averages, mins, maxes, etc. Metrics are defined on a
		 * per-field basis and for each field you configure which metric should be
		 * collected.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metrics</code>.
		 */
		public final Builder metrics(List<FieldMetric> list) {
			this.metrics = _listAddAll(this.metrics, list);
			return this;
		}

		/**
		 * Defines the metrics to collect for each grouping tuple. By default, only the
		 * doc_counts are collected for each group. To make rollup useful, you will
		 * often add metrics like averages, mins, maxes, etc. Metrics are defined on a
		 * per-field basis and for each field you configure which metric should be
		 * collected.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds one or more values to <code>metrics</code>.
		 */
		public final Builder metrics(FieldMetric value, FieldMetric... values) {
			this.metrics = _listAdd(this.metrics, value, values);
			return this;
		}

		/**
		 * Defines the metrics to collect for each grouping tuple. By default, only the
		 * doc_counts are collected for each group. To make rollup useful, you will
		 * often add metrics like averages, mins, maxes, etc. Metrics are defined on a
		 * per-field basis and for each field you configure which metric should be
		 * collected.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds a value to <code>metrics</code> using a builder lambda.
		 */
		public final Builder metrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn) {
			return metrics(fn.apply(new FieldMetric.Builder()).build());
		}

		/**
		 * Required - The number of bucket results that are processed on each iteration
		 * of the rollup indexer. A larger value tends to execute faster, but requires
		 * more memory during processing. This value has no effect on how the data is
		 * rolled up; it is merely used for tweaking the speed or memory cost of the
		 * indexer.
		 * <p>
		 * API name: {@code page_size}
		 */
		public final Builder pageSize(int value) {
			this.pageSize = value;
			return this;
		}

		/**
		 * Required - The index that contains the rollup results. The index can be
		 * shared with other rollup jobs. The data is stored so that it doesn’t
		 * interfere with unrelated jobs.
		 * <p>
		 * API name: {@code rollup_index}
		 */
		public final Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Time to wait for the request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Time to wait for the request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutJobRequest build() {
			_checkSingleUse();

			return new PutJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutJobRequest}
	 */
	public static final JsonpDeserializer<PutJobRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutJobRequest::setupPutJobRequestDeserializer);

	protected static void setupPutJobRequestDeserializer(ObjectDeserializer<PutJobRequest.Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::groups, Groupings._DESERIALIZER, "groups");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(FieldMetric._DESERIALIZER), "metrics");
		op.add(Builder::pageSize, JsonpDeserializer.integerDeserializer(), "page_size");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.put_job}".
	 */
	public static final Endpoint<PutJobRequest, PutJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/rollup.put_job",

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
					buf.append("/_rollup");
					buf.append("/job");
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

			}, SimpleEndpoint.emptyMap(), true, PutJobResponse._DESERIALIZER);
}
