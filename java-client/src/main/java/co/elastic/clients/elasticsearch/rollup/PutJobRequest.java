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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.put_job.Request
@JsonpDeserializable
public class PutJobRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String cron;

	@Nullable
	private final Groupings groups;

	private final String id;

	@Nullable
	private final String indexPattern;

	private final List<FieldMetric> metrics;

	@Nullable
	private final Long pageSize;

	@Nullable
	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	private PutJobRequest(Builder builder) {

		this.cron = builder.cron;
		this.groups = builder.groups;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.indexPattern = builder.indexPattern;
		this.metrics = ModelTypeHelper.unmodifiable(builder.metrics);
		this.pageSize = builder.pageSize;
		this.rollupIndex = builder.rollupIndex;

	}

	public static PutJobRequest of(Function<Builder, ObjectBuilder<PutJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cron}
	 */
	@Nullable
	public final String cron() {
		return this.cron;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public final Groupings groups() {
		return this.groups;
	}

	/**
	 * Required - The ID of the job to create
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code index_pattern}
	 */
	@Nullable
	public final String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * API name: {@code metrics}
	 */
	public final List<FieldMetric> metrics() {
		return this.metrics;
	}

	/**
	 * API name: {@code page_size}
	 */
	@Nullable
	public final Long pageSize() {
		return this.pageSize;
	}

	/**
	 * API name: {@code rollup_index}
	 */
	@Nullable
	public final String rollupIndex() {
		return this.rollupIndex;
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

		if (this.cron != null) {
			generator.writeKey("cron");
			generator.write(this.cron);

		}
		if (this.groups != null) {
			generator.writeKey("groups");
			this.groups.serialize(generator, mapper);

		}
		if (this.indexPattern != null) {
			generator.writeKey("index_pattern");
			generator.write(this.indexPattern);

		}
		if (ModelTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (FieldMetric item0 : this.metrics) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.pageSize != null) {
			generator.writeKey("page_size");
			generator.write(this.pageSize);

		}
		if (this.rollupIndex != null) {
			generator.writeKey("rollup_index");
			generator.write(this.rollupIndex);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutJobRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutJobRequest> {
		@Nullable
		private String cron;

		@Nullable
		private Groupings groups;

		private String id;

		@Nullable
		private String indexPattern;

		@Nullable
		private List<FieldMetric> metrics;

		@Nullable
		private Long pageSize;

		@Nullable
		private String rollupIndex;

		/**
		 * API name: {@code cron}
		 */
		public final Builder cron(@Nullable String value) {
			this.cron = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public final Builder groups(@Nullable Groupings value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public final Builder groups(Function<Groupings.Builder, ObjectBuilder<Groupings>> fn) {
			return this.groups(fn.apply(new Groupings.Builder()).build());
		}

		/**
		 * Required - The ID of the job to create
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index_pattern}
		 */
		public final Builder indexPattern(@Nullable String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public final Builder metrics(@Nullable List<FieldMetric> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		public final Builder metrics(FieldMetric... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code metrics}
		 */
		@SafeVarargs
		public final Builder metrics(Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>>... fns) {
			this.metrics = new ArrayList<>(fns.length);
			for (Function<FieldMetric.Builder, ObjectBuilder<FieldMetric>> fn : fns) {
				this.metrics.add(fn.apply(new FieldMetric.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code page_size}
		 */
		public final Builder pageSize(@Nullable Long value) {
			this.pageSize = value;
			return this;
		}

		/**
		 * API name: {@code rollup_index}
		 */
		public final Builder rollupIndex(@Nullable String value) {
			this.rollupIndex = value;
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
			PutJobRequest::setupPutJobRequestDeserializer, Builder::build);

	protected static void setupPutJobRequestDeserializer(DelegatingDeserializer<PutJobRequest.Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::groups, Groupings._DESERIALIZER, "groups");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(FieldMetric._DESERIALIZER), "metrics");
		op.add(Builder::pageSize, JsonpDeserializer.longDeserializer(), "page_size");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.put_job}".
	 */
	public static final Endpoint<PutJobRequest, PutJobResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutJobResponse._DESERIALIZER);
}
