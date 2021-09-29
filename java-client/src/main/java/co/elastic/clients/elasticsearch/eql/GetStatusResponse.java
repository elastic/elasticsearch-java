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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: eql.get_status.Response
@JsonpDeserializable
public final class GetStatusResponse implements JsonpSerializable {
	private final String id;

	private final boolean isPartial;

	private final boolean isRunning;

	@Nullable
	private final String startTimeInMillis;

	@Nullable
	private final String expirationTimeInMillis;

	@Nullable
	private final Integer completionStatus;

	// ---------------------------------------------------------------------------------------------

	public GetStatusResponse(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.isPartial = Objects.requireNonNull(builder.isPartial, "is_partial");
		this.isRunning = Objects.requireNonNull(builder.isRunning, "is_running");
		this.startTimeInMillis = builder.startTimeInMillis;
		this.expirationTimeInMillis = builder.expirationTimeInMillis;
		this.completionStatus = builder.completionStatus;

	}

	public GetStatusResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Identifier for the search.
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * If true, the search request is still executing. If false, the search is
	 * completed.
	 * <p>
	 * API name: {@code is_partial}
	 */
	public boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * If true, the response does not contain complete search results. This could be
	 * because either the search is still running (is_running status is false), or
	 * because it is already completed (is_running status is true) and results are
	 * partial due to failures or timeouts.
	 * <p>
	 * API name: {@code is_running}
	 */
	public boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * For a running search shows a timestamp when the eql search started, in
	 * milliseconds since the Unix epoch.
	 * <p>
	 * API name: {@code start_time_in_millis}
	 */
	@Nullable
	public String startTimeInMillis() {
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
	public String expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * For a completed search shows the http status code of the completed search.
	 * <p>
	 * API name: {@code completion_status}
	 */
	@Nullable
	public Integer completionStatus() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetStatusResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetStatusResponse> {
		private String id;

		private Boolean isPartial;

		private Boolean isRunning;

		@Nullable
		private String startTimeInMillis;

		@Nullable
		private String expirationTimeInMillis;

		@Nullable
		private Integer completionStatus;

		/**
		 * Identifier for the search.
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * If true, the search request is still executing. If false, the search is
		 * completed.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public Builder isPartial(boolean value) {
			this.isPartial = value;
			return this;
		}

		/**
		 * If true, the response does not contain complete search results. This could be
		 * because either the search is still running (is_running status is false), or
		 * because it is already completed (is_running status is true) and results are
		 * partial due to failures or timeouts.
		 * <p>
		 * API name: {@code is_running}
		 */
		public Builder isRunning(boolean value) {
			this.isRunning = value;
			return this;
		}

		/**
		 * For a running search shows a timestamp when the eql search started, in
		 * milliseconds since the Unix epoch.
		 * <p>
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(@Nullable String value) {
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
		public Builder expirationTimeInMillis(@Nullable String value) {
			this.expirationTimeInMillis = value;
			return this;
		}

		/**
		 * For a completed search shows the http status code of the completed search.
		 * <p>
		 * API name: {@code completion_status}
		 */
		public Builder completionStatus(@Nullable Integer value) {
			this.completionStatus = value;
			return this;
		}

		/**
		 * Builds a {@link GetStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetStatusResponse build() {

			return new GetStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetStatusResponse}
	 */
	public static final JsonpDeserializer<GetStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetStatusResponse::setupGetStatusResponseDeserializer, Builder::build);

	protected static void setupGetStatusResponseDeserializer(DelegatingDeserializer<GetStatusResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(Builder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.stringDeserializer(), "start_time_in_millis");
		op.add(Builder::expirationTimeInMillis, JsonpDeserializer.stringDeserializer(), "expiration_time_in_millis");
		op.add(Builder::completionStatus, JsonpDeserializer.integerDeserializer(), "completion_status");

	}

}
