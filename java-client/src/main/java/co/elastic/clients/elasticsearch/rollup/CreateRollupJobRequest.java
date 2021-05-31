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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.create_rollup_job.Request
public final class CreateRollupJobRequest extends RequestBase implements ToJsonp {
	private final String id;

	@Nullable
	private final String cron;

	@Nullable
	private final Groupings groups;

	@Nullable
	private final String indexPattern;

	@Nullable
	private final List<FieldMetric> metrics;

	@Nullable
	private final Number pageSize;

	@Nullable
	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	protected CreateRollupJobRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.cron = builder.cron;
		this.groups = builder.groups;
		this.indexPattern = builder.indexPattern;
		this.metrics = builder.metrics;
		this.pageSize = builder.pageSize;
		this.rollupIndex = builder.rollupIndex;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code cron}
	 */
	@Nullable
	public String cron() {
		return this.cron;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public Groupings groups() {
		return this.groups;
	}

	/**
	 * API name: {@code index_pattern}
	 */
	@Nullable
	public String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * API name: {@code metrics}
	 */
	@Nullable
	public List<FieldMetric> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code page_size}
	 */
	@Nullable
	public Number pageSize() {
		return this.pageSize;
	}

	/**
	 * API name: {@code rollup_index}
	 */
	@Nullable
	public String rollupIndex() {
		return this.rollupIndex;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.cron != null) {

			generator.writeKey("cron");
			generator.write(this.cron);

		}
		if (this.groups != null) {

			generator.writeKey("groups");
			this.groups.toJsonp(generator, mapper);

		}
		if (this.indexPattern != null) {

			generator.writeKey("index_pattern");
			generator.write(this.indexPattern);

		}
		if (this.metrics != null) {

			generator.writeKey("metrics");
			generator.writeStartArray();
			for (FieldMetric item0 : this.metrics) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.pageSize != null) {

			generator.writeKey("page_size");
			generator.write(this.pageSize.doubleValue());

		}
		if (this.rollupIndex != null) {

			generator.writeKey("rollup_index");
			generator.write(this.rollupIndex);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRollupJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateRollupJobRequest> {
		private String id;

		@Nullable
		private String cron;

		@Nullable
		private Groupings groups;

		@Nullable
		private String indexPattern;

		@Nullable
		private List<FieldMetric> metrics;

		@Nullable
		private Number pageSize;

		@Nullable
		private String rollupIndex;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code cron}
		 */
		public Builder cron(@Nullable String value) {
			this.cron = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable Groupings value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(Function<Groupings.Builder, ObjectBuilder<Groupings>> fn) {
			return this.groups(fn.apply(new Groupings.Builder()).build());
		}

		/**
		 * API name: {@code index_pattern}
		 */
		public Builder indexPattern(@Nullable String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(@Nullable List<FieldMetric> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public Builder metrics(FieldMetric... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(FieldMetric value) {
			if (this.metrics == null) {
				this.metrics = new ArrayList<>();
			}
			this.metrics.add(value);
			return this;
		}

		/**
		 * Set {@link #metrics(List)} to a singleton list.
		 */
		public Builder metrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn) {
			return this.metrics(fn.apply(new FieldMetric.Builder()).build());
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn) {
			return this.addMetrics(fn.apply(new FieldMetric.Builder()).build());
		}

		/**
		 * API name: {@code page_size}
		 */
		public Builder pageSize(@Nullable Number value) {
			this.pageSize = value;
			return this;
		}

		/**
		 * API name: {@code rollup_index}
		 */
		public Builder rollupIndex(@Nullable String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Builds a {@link CreateRollupJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateRollupJobRequest build() {

			return new CreateRollupJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for CreateRollupJobRequest
	 */
	public static final JsonpValueParser<CreateRollupJobRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, CreateRollupJobRequest::setupCreateRollupJobRequestParser);

	protected static void setupCreateRollupJobRequestParser(
			DelegatingJsonpValueParser<CreateRollupJobRequest.Builder> op) {

		op.add(Builder::cron, JsonpValueParser.stringParser(), "cron");
		op.add(Builder::groups, Groupings.JSONP_PARSER, "groups");
		op.add(Builder::indexPattern, JsonpValueParser.stringParser(), "index_pattern");
		op.add(Builder::metrics, JsonpValueParser.arrayParser(FieldMetric.JSONP_PARSER), "metrics");
		op.add(Builder::pageSize, JsonpValueParser.numberParser(), "page_size");
		op.add(Builder::rollupIndex, JsonpValueParser.stringParser(), "rollup_index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.put_job}".
	 */
	public static final Endpoint<CreateRollupJobRequest, CreateRollupJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "PUT",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_rollup");
				buf.append("/job");
				buf.append("/");
				buf.append(request.id);
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, CreateRollupJobResponse.JSONP_PARSER);
}
