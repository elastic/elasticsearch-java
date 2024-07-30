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

package co.elastic.clients.elasticsearch.connector;

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
import java.lang.String;
import java.util.Collections;
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

// typedef: connector.sync_job_post.Request

/**
 * Creates a connector sync job.
 * 
 * @see <a href="../doc-files/api-spec.html#connector.sync_job_post.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SyncJobPostRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	@Nullable
	private final SyncJobType jobType;

	@Nullable
	private final SyncJobTriggerMethod triggerMethod;

	// ---------------------------------------------------------------------------------------------

	private SyncJobPostRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.jobType = builder.jobType;
		this.triggerMethod = builder.triggerMethod;

	}

	public static SyncJobPostRequest of(Function<Builder, ObjectBuilder<SyncJobPostRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The id of the associated connector
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code job_type}
	 */
	@Nullable
	public final SyncJobType jobType() {
		return this.jobType;
	}

	/**
	 * API name: {@code trigger_method}
	 */
	@Nullable
	public final SyncJobTriggerMethod triggerMethod() {
		return this.triggerMethod;
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

		if (this.jobType != null) {
			generator.writeKey("job_type");
			this.jobType.serialize(generator, mapper);
		}
		if (this.triggerMethod != null) {
			generator.writeKey("trigger_method");
			this.triggerMethod.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SyncJobPostRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SyncJobPostRequest> {
		private String id;

		@Nullable
		private SyncJobType jobType;

		@Nullable
		private SyncJobTriggerMethod triggerMethod;

		/**
		 * Required - The id of the associated connector
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code job_type}
		 */
		public final Builder jobType(@Nullable SyncJobType value) {
			this.jobType = value;
			return this;
		}

		/**
		 * API name: {@code trigger_method}
		 */
		public final Builder triggerMethod(@Nullable SyncJobTriggerMethod value) {
			this.triggerMethod = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SyncJobPostRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SyncJobPostRequest build() {
			_checkSingleUse();

			return new SyncJobPostRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SyncJobPostRequest}
	 */
	public static final JsonpDeserializer<SyncJobPostRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SyncJobPostRequest::setupSyncJobPostRequestDeserializer);

	protected static void setupSyncJobPostRequestDeserializer(ObjectDeserializer<SyncJobPostRequest.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::jobType, SyncJobType._DESERIALIZER, "job_type");
		op.add(Builder::triggerMethod, SyncJobTriggerMethod._DESERIALIZER, "trigger_method");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.sync_job_post}".
	 */
	public static final Endpoint<SyncJobPostRequest, SyncJobPostResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.sync_job_post",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_connector/_sync_job";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SyncJobPostResponse._DESERIALIZER);
}
