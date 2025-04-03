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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.GoogleVertexAIServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.GoogleVertexAIServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class GoogleVertexAIServiceSettings implements JsonpSerializable {
	private final String location;

	private final String modelId;

	private final String projectId;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String serviceAccountJson;

	// ---------------------------------------------------------------------------------------------

	private GoogleVertexAIServiceSettings(Builder builder) {

		this.location = ApiTypeHelper.requireNonNull(builder.location, this, "location");
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.projectId = ApiTypeHelper.requireNonNull(builder.projectId, this, "projectId");
		this.rateLimit = builder.rateLimit;
		this.serviceAccountJson = ApiTypeHelper.requireNonNull(builder.serviceAccountJson, this, "serviceAccountJson");

	}

	public static GoogleVertexAIServiceSettings of(Function<Builder, ObjectBuilder<GoogleVertexAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the location to use for the inference task. Refer to
	 * the Google documentation for the list of supported locations.
	 * <p>
	 * API name: {@code location}
	 */
	public final String location() {
		return this.location;
	}

	/**
	 * Required - The name of the model to use for the inference task. Refer to the
	 * Google documentation for the list of supported models.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The name of the project to use for the inference task.
	 * <p>
	 * API name: {@code project_id}
	 */
	public final String projectId() {
		return this.projectId;
	}

	/**
	 * This setting helps to minimize the number of rate limit errors returned from
	 * Google Vertex AI. By default, the <code>googlevertexai</code> service sets
	 * the number of requests allowed per minute to 30.000.
	 * <p>
	 * API name: {@code rate_limit}
	 */
	@Nullable
	public final RateLimitSetting rateLimit() {
		return this.rateLimit;
	}

	/**
	 * Required - A valid service account in JSON format for the Google Vertex AI
	 * API.
	 * <p>
	 * API name: {@code service_account_json}
	 */
	public final String serviceAccountJson() {
		return this.serviceAccountJson;
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

		generator.writeKey("location");
		generator.write(this.location);

		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("project_id");
		generator.write(this.projectId);

		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("service_account_json");
		generator.write(this.serviceAccountJson);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GoogleVertexAIServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GoogleVertexAIServiceSettings> {
		private String location;

		private String modelId;

		private String projectId;

		@Nullable
		private RateLimitSetting rateLimit;

		private String serviceAccountJson;

		/**
		 * Required - The name of the location to use for the inference task. Refer to
		 * the Google documentation for the list of supported locations.
		 * <p>
		 * API name: {@code location}
		 */
		public final Builder location(String value) {
			this.location = value;
			return this;
		}

		/**
		 * Required - The name of the model to use for the inference task. Refer to the
		 * Google documentation for the list of supported models.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The name of the project to use for the inference task.
		 * <p>
		 * API name: {@code project_id}
		 */
		public final Builder projectId(String value) {
			this.projectId = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Google Vertex AI. By default, the <code>googlevertexai</code> service sets
		 * the number of requests allowed per minute to 30.000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(@Nullable RateLimitSetting value) {
			this.rateLimit = value;
			return this;
		}

		/**
		 * This setting helps to minimize the number of rate limit errors returned from
		 * Google Vertex AI. By default, the <code>googlevertexai</code> service sets
		 * the number of requests allowed per minute to 30.000.
		 * <p>
		 * API name: {@code rate_limit}
		 */
		public final Builder rateLimit(Function<RateLimitSetting.Builder, ObjectBuilder<RateLimitSetting>> fn) {
			return this.rateLimit(fn.apply(new RateLimitSetting.Builder()).build());
		}

		/**
		 * Required - A valid service account in JSON format for the Google Vertex AI
		 * API.
		 * <p>
		 * API name: {@code service_account_json}
		 */
		public final Builder serviceAccountJson(String value) {
			this.serviceAccountJson = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GoogleVertexAIServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GoogleVertexAIServiceSettings build() {
			_checkSingleUse();

			return new GoogleVertexAIServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GoogleVertexAIServiceSettings}
	 */
	public static final JsonpDeserializer<GoogleVertexAIServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GoogleVertexAIServiceSettings::setupGoogleVertexAIServiceSettingsDeserializer);

	protected static void setupGoogleVertexAIServiceSettingsDeserializer(
			ObjectDeserializer<GoogleVertexAIServiceSettings.Builder> op) {

		op.add(Builder::location, JsonpDeserializer.stringDeserializer(), "location");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::projectId, JsonpDeserializer.stringDeserializer(), "project_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::serviceAccountJson, JsonpDeserializer.stringDeserializer(), "service_account_json");

	}

}
