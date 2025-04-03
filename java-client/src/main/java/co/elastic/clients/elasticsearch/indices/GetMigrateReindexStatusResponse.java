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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_migrate_reindex_status.StatusError;
import co.elastic.clients.elasticsearch.indices.get_migrate_reindex_status.StatusInProgress;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: indices.get_migrate_reindex_status.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.get_migrate_reindex_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetMigrateReindexStatusResponse implements JsonpSerializable {
	@Nullable
	private final DateTime startTime;

	private final long startTimeMillis;

	private final boolean complete;

	private final int totalIndicesInDataStream;

	private final int totalIndicesRequiringUpgrade;

	private final int successes;

	private final List<StatusInProgress> inProgress;

	private final int pending;

	private final List<StatusError> errors;

	@Nullable
	private final String exception;

	// ---------------------------------------------------------------------------------------------

	private GetMigrateReindexStatusResponse(Builder builder) {

		this.startTime = builder.startTime;
		this.startTimeMillis = ApiTypeHelper.requireNonNullWithDefault(builder.startTimeMillis, this, "startTimeMillis",
				this.startTimeMillis());
		this.complete = ApiTypeHelper.requireNonNullWithDefault(builder.complete, this, "complete", this.complete());
		this.totalIndicesInDataStream = ApiTypeHelper.requireNonNullWithDefault(builder.totalIndicesInDataStream, this,
				"totalIndicesInDataStream", this.totalIndicesInDataStream());
		this.totalIndicesRequiringUpgrade = ApiTypeHelper.requireNonNullWithDefault(
				builder.totalIndicesRequiringUpgrade, this, "totalIndicesRequiringUpgrade",
				this.totalIndicesRequiringUpgrade());
		this.successes = ApiTypeHelper.requireNonNullWithDefault(builder.successes, this, "successes",
				this.successes());
		this.inProgress = ApiTypeHelper.unmodifiableRequired(builder.inProgress, this, "inProgress");
		this.pending = ApiTypeHelper.requireNonNullWithDefault(builder.pending, this, "pending", this.pending());
		this.errors = ApiTypeHelper.unmodifiableRequired(builder.errors, this, "errors");
		this.exception = builder.exception;

	}

	public static GetMigrateReindexStatusResponse of(
			Function<Builder, ObjectBuilder<GetMigrateReindexStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * Required - API name: {@code start_time_millis}
	 */
	public final long startTimeMillis() {
		return this.startTimeMillis;
	}

	/**
	 * Required - API name: {@code complete}
	 */
	public final boolean complete() {
		return this.complete;
	}

	/**
	 * Required - API name: {@code total_indices_in_data_stream}
	 */
	public final int totalIndicesInDataStream() {
		return this.totalIndicesInDataStream;
	}

	/**
	 * Required - API name: {@code total_indices_requiring_upgrade}
	 */
	public final int totalIndicesRequiringUpgrade() {
		return this.totalIndicesRequiringUpgrade;
	}

	/**
	 * Required - API name: {@code successes}
	 */
	public final int successes() {
		return this.successes;
	}

	/**
	 * Required - API name: {@code in_progress}
	 */
	public final List<StatusInProgress> inProgress() {
		return this.inProgress;
	}

	/**
	 * Required - API name: {@code pending}
	 */
	public final int pending() {
		return this.pending;
	}

	/**
	 * Required - API name: {@code errors}
	 */
	public final List<StatusError> errors() {
		return this.errors;
	}

	/**
	 * API name: {@code exception}
	 */
	@Nullable
	public final String exception() {
		return this.exception;
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

		if (this.startTime != null) {
			generator.writeKey("start_time");
			this.startTime.serialize(generator, mapper);
		}
		generator.writeKey("start_time_millis");
		generator.write(this.startTimeMillis);

		generator.writeKey("complete");
		generator.write(this.complete);

		generator.writeKey("total_indices_in_data_stream");
		generator.write(this.totalIndicesInDataStream);

		generator.writeKey("total_indices_requiring_upgrade");
		generator.write(this.totalIndicesRequiringUpgrade);

		generator.writeKey("successes");
		generator.write(this.successes);

		if (ApiTypeHelper.isDefined(this.inProgress)) {
			generator.writeKey("in_progress");
			generator.writeStartArray();
			for (StatusInProgress item0 : this.inProgress) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("pending");
		generator.write(this.pending);

		if (ApiTypeHelper.isDefined(this.errors)) {
			generator.writeKey("errors");
			generator.writeStartArray();
			for (StatusError item0 : this.errors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exception != null) {
			generator.writeKey("exception");
			generator.write(this.exception);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetMigrateReindexStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetMigrateReindexStatusResponse> {
		@Nullable
		private DateTime startTime;

		private Long startTimeMillis;

		private Boolean complete;

		private Integer totalIndicesInDataStream;

		private Integer totalIndicesRequiringUpgrade;

		private Integer successes;

		private List<StatusInProgress> inProgress;

		private Integer pending;

		private List<StatusError> errors;

		@Nullable
		private String exception;

		/**
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_time_millis}
		 */
		public final Builder startTimeMillis(long value) {
			this.startTimeMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code complete}
		 */
		public final Builder complete(boolean value) {
			this.complete = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_indices_in_data_stream}
		 */
		public final Builder totalIndicesInDataStream(int value) {
			this.totalIndicesInDataStream = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_indices_requiring_upgrade}
		 */
		public final Builder totalIndicesRequiringUpgrade(int value) {
			this.totalIndicesRequiringUpgrade = value;
			return this;
		}

		/**
		 * Required - API name: {@code successes}
		 */
		public final Builder successes(int value) {
			this.successes = value;
			return this;
		}

		/**
		 * Required - API name: {@code in_progress}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>inProgress</code>.
		 */
		public final Builder inProgress(List<StatusInProgress> list) {
			this.inProgress = _listAddAll(this.inProgress, list);
			return this;
		}

		/**
		 * Required - API name: {@code in_progress}
		 * <p>
		 * Adds one or more values to <code>inProgress</code>.
		 */
		public final Builder inProgress(StatusInProgress value, StatusInProgress... values) {
			this.inProgress = _listAdd(this.inProgress, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code in_progress}
		 * <p>
		 * Adds a value to <code>inProgress</code> using a builder lambda.
		 */
		public final Builder inProgress(Function<StatusInProgress.Builder, ObjectBuilder<StatusInProgress>> fn) {
			return inProgress(fn.apply(new StatusInProgress.Builder()).build());
		}

		/**
		 * Required - API name: {@code pending}
		 */
		public final Builder pending(int value) {
			this.pending = value;
			return this;
		}

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>errors</code>.
		 */
		public final Builder errors(List<StatusError> list) {
			this.errors = _listAddAll(this.errors, list);
			return this;
		}

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds one or more values to <code>errors</code>.
		 */
		public final Builder errors(StatusError value, StatusError... values) {
			this.errors = _listAdd(this.errors, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code errors}
		 * <p>
		 * Adds a value to <code>errors</code> using a builder lambda.
		 */
		public final Builder errors(Function<StatusError.Builder, ObjectBuilder<StatusError>> fn) {
			return errors(fn.apply(new StatusError.Builder()).build());
		}

		/**
		 * API name: {@code exception}
		 */
		public final Builder exception(@Nullable String value) {
			this.exception = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetMigrateReindexStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetMigrateReindexStatusResponse build() {
			_checkSingleUse();

			return new GetMigrateReindexStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetMigrateReindexStatusResponse}
	 */
	public static final JsonpDeserializer<GetMigrateReindexStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetMigrateReindexStatusResponse::setupGetMigrateReindexStatusResponseDeserializer);

	protected static void setupGetMigrateReindexStatusResponseDeserializer(
			ObjectDeserializer<GetMigrateReindexStatusResponse.Builder> op) {

		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::startTimeMillis, JsonpDeserializer.longDeserializer(), "start_time_millis");
		op.add(Builder::complete, JsonpDeserializer.booleanDeserializer(), "complete");
		op.add(Builder::totalIndicesInDataStream, JsonpDeserializer.integerDeserializer(),
				"total_indices_in_data_stream");
		op.add(Builder::totalIndicesRequiringUpgrade, JsonpDeserializer.integerDeserializer(),
				"total_indices_requiring_upgrade");
		op.add(Builder::successes, JsonpDeserializer.integerDeserializer(), "successes");
		op.add(Builder::inProgress, JsonpDeserializer.arrayDeserializer(StatusInProgress._DESERIALIZER), "in_progress");
		op.add(Builder::pending, JsonpDeserializer.integerDeserializer(), "pending");
		op.add(Builder::errors, JsonpDeserializer.arrayDeserializer(StatusError._DESERIALIZER), "errors");
		op.add(Builder::exception, JsonpDeserializer.stringDeserializer(), "exception");

	}

}
