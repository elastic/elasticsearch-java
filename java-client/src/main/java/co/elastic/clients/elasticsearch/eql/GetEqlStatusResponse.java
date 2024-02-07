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

package co.elastic.clients.elasticsearch.eql;

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
import java.lang.Integer;
import java.lang.Long;
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

// typedef: eql.get_status.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#eql.get_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetEqlStatusResponse implements JsonpSerializable {
	private final String id;

	private final boolean isPartial;

	private final boolean isRunning;

	@Nullable
	private final Long startTimeInMillis;

	@Nullable
	private final Long expirationTimeInMillis;

	@Nullable
	private final Integer completionStatus;

	// ---------------------------------------------------------------------------------------------

	private GetEqlStatusResponse(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.isPartial = ApiTypeHelper.requireNonNull(builder.isPartial, this, "isPartial");
		this.isRunning = ApiTypeHelper.requireNonNull(builder.isRunning, this, "isRunning");
		this.startTimeInMillis = builder.startTimeInMillis;
		this.expirationTimeInMillis = builder.expirationTimeInMillis;
		this.completionStatus = builder.completionStatus;

	}

	public static GetEqlStatusResponse of(Function<Builder, ObjectBuilder<GetEqlStatusResponse>> fn) {
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
	 * Required - If true, the search request is still executing. If false, the
	 * search is completed.
	 * <p>
	 * API name: {@code is_partial}
	 */
	public final boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * Required - If true, the response does not contain complete search results.
	 * This could be because either the search is still running (is_running status
	 * is false), or because it is already completed (is_running status is true) and
	 * results are partial due to failures or timeouts.
	 * <p>
	 * API name: {@code is_running}
	 */
	public final boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * For a running search shows a timestamp when the eql search started, in
	 * milliseconds since the Unix epoch.
	 * <p>
	 * API name: {@code start_time_in_millis}
	 */
	@Nullable
	public final Long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * Shows a timestamp when the eql search will be expired, in milliseconds since
	 * the Unix epoch. When this time is reached, the search and its results are
	 * deleted, even if the search is still ongoing.
	 * <p>
	 * API name: {@code expiration_time_in_millis}
	 */
	@Nullable
	public final Long expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * For a completed search shows the http status code of the completed search.
	 * <p>
	 * API name: {@code completion_status}
	 */
	@Nullable
	public final Integer completionStatus() {
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

		generator.writeKey("is_partial");
		generator.write(this.isPartial);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		if (this.startTimeInMillis != null) {
			generator.writeKey("start_time_in_millis");
			generator.write(this.startTimeInMillis);

		}
		if (this.expirationTimeInMillis != null) {
			generator.writeKey("expiration_time_in_millis");
			generator.write(this.expirationTimeInMillis);

		}
		if (this.completionStatus != null) {
			generator.writeKey("completion_status");
			generator.write(this.completionStatus);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetEqlStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetEqlStatusResponse> {
		private String id;

		private Boolean isPartial;

		private Boolean isRunning;

		@Nullable
		private Long startTimeInMillis;

		@Nullable
		private Long expirationTimeInMillis;

		@Nullable
		private Integer completionStatus;

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
		 * Required - If true, the search request is still executing. If false, the
		 * search is completed.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public final Builder isPartial(boolean value) {
			this.isPartial = value;
			return this;
		}

		/**
		 * Required - If true, the response does not contain complete search results.
		 * This could be because either the search is still running (is_running status
		 * is false), or because it is already completed (is_running status is true) and
		 * results are partial due to failures or timeouts.
		 * <p>
		 * API name: {@code is_running}
		 */
		public final Builder isRunning(boolean value) {
			this.isRunning = value;
			return this;
		}

		/**
		 * For a running search shows a timestamp when the eql search started, in
		 * milliseconds since the Unix epoch.
		 * <p>
		 * API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(@Nullable Long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * Shows a timestamp when the eql search will be expired, in milliseconds since
		 * the Unix epoch. When this time is reached, the search and its results are
		 * deleted, even if the search is still ongoing.
		 * <p>
		 * API name: {@code expiration_time_in_millis}
		 */
		public final Builder expirationTimeInMillis(@Nullable Long value) {
			this.expirationTimeInMillis = value;
			return this;
		}

		/**
		 * For a completed search shows the http status code of the completed search.
		 * <p>
		 * API name: {@code completion_status}
		 */
		public final Builder completionStatus(@Nullable Integer value) {
			this.completionStatus = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetEqlStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetEqlStatusResponse build() {
			_checkSingleUse();

			return new GetEqlStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetEqlStatusResponse}
	 */
	public static final JsonpDeserializer<GetEqlStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetEqlStatusResponse::setupGetEqlStatusResponseDeserializer);

	protected static void setupGetEqlStatusResponseDeserializer(ObjectDeserializer<GetEqlStatusResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(Builder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::expirationTimeInMillis, JsonpDeserializer.longDeserializer(), "expiration_time_in_millis");
		op.add(Builder::completionStatus, JsonpDeserializer.integerDeserializer(), "completion_status");

	}

}
