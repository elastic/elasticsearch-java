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

package co.elastic.clients.elasticsearch.sql;

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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Number;
import java.lang.String;
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

// typedef: sql.get_async_status.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#sql.get_async_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAsyncStatusResponse implements JsonpSerializable {
	private final String id;

	private final boolean isRunning;

	private final boolean isPartial;

	private final long startTimeInMillis;

	private final long expirationTimeInMillis;

	@Nullable
	private final Number completionStatus;

	// ---------------------------------------------------------------------------------------------

	private GetAsyncStatusResponse(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.isRunning = ApiTypeHelper.requireNonNull(builder.isRunning, this, "isRunning");
		this.isPartial = ApiTypeHelper.requireNonNull(builder.isPartial, this, "isPartial");
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis");
		this.expirationTimeInMillis = ApiTypeHelper.requireNonNull(builder.expirationTimeInMillis, this,
				"expirationTimeInMillis");
		this.completionStatus = builder.completionStatus;

	}

	public static GetAsyncStatusResponse of(Function<Builder, ObjectBuilder<GetAsyncStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Identifier for the search.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - If <code>true</code>, the search is still running. If
	 * <code>false</code>, the search has finished.
	 * <p>
	 * API name: {@code is_running}
	 */
	public final boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * Required - If <code>true</code>, the response does not contain complete
	 * search results. If <code>is_partial</code> is <code>true</code> and
	 * <code>is_running</code> is <code>true</code>, the search is still running. If
	 * <code>is_partial</code> is <code>true</code> but <code>is_running</code> is
	 * <code>false</code>, the results are partial due to a failure or timeout.
	 * <p>
	 * API name: {@code is_partial}
	 */
	public final boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * Required - Timestamp, in milliseconds since the Unix epoch, when the search
	 * started. The API only returns this property for running searches.
	 * <p>
	 * API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * Required - Timestamp, in milliseconds since the Unix epoch, when
	 * Elasticsearch will delete the search and its results, even if the search is
	 * still running.
	 * <p>
	 * API name: {@code expiration_time_in_millis}
	 */
	public final long expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * HTTP status code for the search. The API only returns this property for
	 * completed searches.
	 * <p>
	 * API name: {@code completion_status}
	 */
	@Nullable
	public final Number completionStatus() {
		return this.completionStatus;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		generator.writeKey("is_partial");
		generator.write(this.isPartial);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		generator.writeKey("expiration_time_in_millis");
		generator.write(this.expirationTimeInMillis);

		if (this.completionStatus != null) {
			generator.writeKey("completion_status");
			generator.write(this.completionStatus.doubleValue());

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAsyncStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetAsyncStatusResponse> {
		private String id;

		private Boolean isRunning;

		private Boolean isPartial;

		private Long startTimeInMillis;

		private Long expirationTimeInMillis;

		@Nullable
		private Number completionStatus;

		/**
		 * Required - Identifier for the search.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the search is still running. If
		 * <code>false</code>, the search has finished.
		 * <p>
		 * API name: {@code is_running}
		 */
		public final Builder isRunning(boolean value) {
			this.isRunning = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the response does not contain complete
		 * search results. If <code>is_partial</code> is <code>true</code> and
		 * <code>is_running</code> is <code>true</code>, the search is still running. If
		 * <code>is_partial</code> is <code>true</code> but <code>is_running</code> is
		 * <code>false</code>, the results are partial due to a failure or timeout.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public final Builder isPartial(boolean value) {
			this.isPartial = value;
			return this;
		}

		/**
		 * Required - Timestamp, in milliseconds since the Unix epoch, when the search
		 * started. The API only returns this property for running searches.
		 * <p>
		 * API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * Required - Timestamp, in milliseconds since the Unix epoch, when
		 * Elasticsearch will delete the search and its results, even if the search is
		 * still running.
		 * <p>
		 * API name: {@code expiration_time_in_millis}
		 */
		public final Builder expirationTimeInMillis(long value) {
			this.expirationTimeInMillis = value;
			return this;
		}

		/**
		 * HTTP status code for the search. The API only returns this property for
		 * completed searches.
		 * <p>
		 * API name: {@code completion_status}
		 */
		public final Builder completionStatus(@Nullable Number value) {
			this.completionStatus = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAsyncStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAsyncStatusResponse build() {
			_checkSingleUse();

			return new GetAsyncStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAsyncStatusResponse}
	 */
	public static final JsonpDeserializer<GetAsyncStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAsyncStatusResponse::setupGetAsyncStatusResponseDeserializer);

	protected static void setupGetAsyncStatusResponseDeserializer(
			ObjectDeserializer<GetAsyncStatusResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(Builder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::expirationTimeInMillis, JsonpDeserializer.longDeserializer(), "expiration_time_in_millis");
		op.add(Builder::completionStatus, JsonpDeserializer.numberDeserializer(), "completion_status");

	}

}
