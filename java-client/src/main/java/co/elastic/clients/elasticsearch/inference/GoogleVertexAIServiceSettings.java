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
import java.lang.Integer;
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
	@Nullable
	private final GoogleModelGardenProvider provider;

	@Nullable
	private final String url;

	@Nullable
	private final String streamingUrl;

	@Nullable
	private final String location;

	@Nullable
	private final String modelId;

	@Nullable
	private final String projectId;

	@Nullable
	private final RateLimitSetting rateLimit;

	private final String serviceAccountJson;

	@Nullable
	private final Integer dimensions;

	// ---------------------------------------------------------------------------------------------

	private GoogleVertexAIServiceSettings(Builder builder) {

		this.provider = builder.provider;
		this.url = builder.url;
		this.streamingUrl = builder.streamingUrl;
		this.location = builder.location;
		this.modelId = builder.modelId;
		this.projectId = builder.projectId;
		this.rateLimit = builder.rateLimit;
		this.serviceAccountJson = ApiTypeHelper.requireNonNull(builder.serviceAccountJson, this, "serviceAccountJson");
		this.dimensions = builder.dimensions;

	}

	public static GoogleVertexAIServiceSettings of(Function<Builder, ObjectBuilder<GoogleVertexAIServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name of the Google Model Garden Provider for <code>completion</code> and
	 * <code>chat_completion</code> tasks. In order for a Google Model Garden
	 * endpoint to be used <code>provider</code> must be defined and be other than
	 * <code>google</code>. Modes:
	 * <ul>
	 * <li>Google Model Garden (third-party models): set <code>provider</code> to a
	 * supported non-<code>google</code> value and provide <code>url</code> and/or
	 * <code>streaming_url</code>.</li>
	 * <li>Google Vertex AI: omit <code>provider</code> or set it to
	 * <code>google</code>. In this mode, do not set <code>url</code> or
	 * <code>streaming_url</code> and Elastic will construct the endpoint url from
	 * <code>location</code>, <code>model_id</code>, and <code>project_id</code>
	 * parameters.</li>
	 * </ul>
	 * <p>
	 * API name: {@code provider}
	 */
	@Nullable
	public final GoogleModelGardenProvider provider() {
		return this.provider;
	}

	/**
	 * The URL for non-streaming <code>completion</code> requests to a Google Model
	 * Garden provider endpoint. If both <code>url</code> and
	 * <code>streaming_url</code> are provided, each is used for its respective
	 * mode. If <code>streaming_url</code> is not provided, <code>url</code> is also
	 * used for streaming <code>completion</code> and <code>chat_completion</code>.
	 * If <code>provider</code> is not provided or set to <code>google</code>
	 * (Google Vertex AI), do not set <code>url</code> (or
	 * <code>streaming_url</code>). At least one of <code>url</code> or
	 * <code>streaming_url</code> must be provided for Google Model Garden endpoint
	 * usage.
	 * <p>
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
		return this.url;
	}

	/**
	 * The URL for streaming <code>completion</code> and
	 * <code>chat_completion</code> requests to a Google Model Garden provider
	 * endpoint. If both <code>streaming_url</code> and <code>url</code> are
	 * provided, each is used for its respective mode. If <code>url</code> is not
	 * provided, <code>streaming_url</code> is also used for non-streaming
	 * <code>completion</code> requests. If <code>provider</code> is not provided or
	 * set to <code>google</code> (Google Vertex AI), do not set
	 * <code>streaming_url</code> (or <code>url</code>). At least one of
	 * <code>streaming_url</code> or <code>url</code> must be provided for Google
	 * Model Garden endpoint usage.
	 * <p>
	 * API name: {@code streaming_url}
	 */
	@Nullable
	public final String streamingUrl() {
		return this.streamingUrl;
	}

	/**
	 * The name of the location to use for the inference task for the Google Vertex
	 * AI inference task. For Google Vertex AI, when <code>provider</code> is
	 * omitted or <code>google</code> <code>location</code> is mandatory. For Google
	 * Model Garden's <code>completion</code> and <code>chat_completion</code>
	 * tasks, when <code>provider</code> is a supported non-<code>google</code>
	 * value - <code>location</code> is ignored. Refer to the Google documentation
	 * for the list of supported locations.
	 * <p>
	 * API name: {@code location}
	 */
	@Nullable
	public final String location() {
		return this.location;
	}

	/**
	 * The name of the model to use for the inference task. For Google Vertex AI
	 * <code>model_id</code> is mandatory. For Google Model Garden's
	 * <code>completion</code> and <code>chat_completion</code> tasks, when
	 * <code>provider</code> is a supported non-<code>google</code> value -
	 * <code>model_id</code> will be used for some providers that require it,
	 * otherwise - ignored. Refer to the Google documentation for the list of
	 * supported models for Google Vertex AI.
	 * <p>
	 * API name: {@code model_id}
	 */
	@Nullable
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The name of the project to use for the Google Vertex AI inference task. For
	 * Google Vertex AI <code>project_id</code> is mandatory. For Google Model
	 * Garden's <code>completion</code> and <code>chat_completion</code> tasks, when
	 * <code>provider</code> is a supported non-<code>google</code> value -
	 * <code>project_id</code> is ignored.
	 * <p>
	 * API name: {@code project_id}
	 */
	@Nullable
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
	 * For a <code>text_embedding</code> task, the number of dimensions the
	 * resulting output embeddings should have. By default, the model's standard
	 * output dimension is used. Refer to the Google documentation for more
	 * information.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
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

		if (this.provider != null) {
			generator.writeKey("provider");
			this.provider.serialize(generator, mapper);
		}
		if (this.url != null) {
			generator.writeKey("url");
			generator.write(this.url);

		}
		if (this.streamingUrl != null) {
			generator.writeKey("streaming_url");
			generator.write(this.streamingUrl);

		}
		if (this.location != null) {
			generator.writeKey("location");
			generator.write(this.location);

		}
		if (this.modelId != null) {
			generator.writeKey("model_id");
			generator.write(this.modelId);

		}
		if (this.projectId != null) {
			generator.writeKey("project_id");
			generator.write(this.projectId);

		}
		if (this.rateLimit != null) {
			generator.writeKey("rate_limit");
			this.rateLimit.serialize(generator, mapper);

		}
		generator.writeKey("service_account_json");
		generator.write(this.serviceAccountJson);

		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}

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
		@Nullable
		private GoogleModelGardenProvider provider;

		@Nullable
		private String url;

		@Nullable
		private String streamingUrl;

		@Nullable
		private String location;

		@Nullable
		private String modelId;

		@Nullable
		private String projectId;

		@Nullable
		private RateLimitSetting rateLimit;

		private String serviceAccountJson;

		@Nullable
		private Integer dimensions;

		/**
		 * The name of the Google Model Garden Provider for <code>completion</code> and
		 * <code>chat_completion</code> tasks. In order for a Google Model Garden
		 * endpoint to be used <code>provider</code> must be defined and be other than
		 * <code>google</code>. Modes:
		 * <ul>
		 * <li>Google Model Garden (third-party models): set <code>provider</code> to a
		 * supported non-<code>google</code> value and provide <code>url</code> and/or
		 * <code>streaming_url</code>.</li>
		 * <li>Google Vertex AI: omit <code>provider</code> or set it to
		 * <code>google</code>. In this mode, do not set <code>url</code> or
		 * <code>streaming_url</code> and Elastic will construct the endpoint url from
		 * <code>location</code>, <code>model_id</code>, and <code>project_id</code>
		 * parameters.</li>
		 * </ul>
		 * <p>
		 * API name: {@code provider}
		 */
		public final Builder provider(@Nullable GoogleModelGardenProvider value) {
			this.provider = value;
			return this;
		}

		/**
		 * The URL for non-streaming <code>completion</code> requests to a Google Model
		 * Garden provider endpoint. If both <code>url</code> and
		 * <code>streaming_url</code> are provided, each is used for its respective
		 * mode. If <code>streaming_url</code> is not provided, <code>url</code> is also
		 * used for streaming <code>completion</code> and <code>chat_completion</code>.
		 * If <code>provider</code> is not provided or set to <code>google</code>
		 * (Google Vertex AI), do not set <code>url</code> (or
		 * <code>streaming_url</code>). At least one of <code>url</code> or
		 * <code>streaming_url</code> must be provided for Google Model Garden endpoint
		 * usage.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(@Nullable String value) {
			this.url = value;
			return this;
		}

		/**
		 * The URL for streaming <code>completion</code> and
		 * <code>chat_completion</code> requests to a Google Model Garden provider
		 * endpoint. If both <code>streaming_url</code> and <code>url</code> are
		 * provided, each is used for its respective mode. If <code>url</code> is not
		 * provided, <code>streaming_url</code> is also used for non-streaming
		 * <code>completion</code> requests. If <code>provider</code> is not provided or
		 * set to <code>google</code> (Google Vertex AI), do not set
		 * <code>streaming_url</code> (or <code>url</code>). At least one of
		 * <code>streaming_url</code> or <code>url</code> must be provided for Google
		 * Model Garden endpoint usage.
		 * <p>
		 * API name: {@code streaming_url}
		 */
		public final Builder streamingUrl(@Nullable String value) {
			this.streamingUrl = value;
			return this;
		}

		/**
		 * The name of the location to use for the inference task for the Google Vertex
		 * AI inference task. For Google Vertex AI, when <code>provider</code> is
		 * omitted or <code>google</code> <code>location</code> is mandatory. For Google
		 * Model Garden's <code>completion</code> and <code>chat_completion</code>
		 * tasks, when <code>provider</code> is a supported non-<code>google</code>
		 * value - <code>location</code> is ignored. Refer to the Google documentation
		 * for the list of supported locations.
		 * <p>
		 * API name: {@code location}
		 */
		public final Builder location(@Nullable String value) {
			this.location = value;
			return this;
		}

		/**
		 * The name of the model to use for the inference task. For Google Vertex AI
		 * <code>model_id</code> is mandatory. For Google Model Garden's
		 * <code>completion</code> and <code>chat_completion</code> tasks, when
		 * <code>provider</code> is a supported non-<code>google</code> value -
		 * <code>model_id</code> will be used for some providers that require it,
		 * otherwise - ignored. Refer to the Google documentation for the list of
		 * supported models for Google Vertex AI.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(@Nullable String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The name of the project to use for the Google Vertex AI inference task. For
		 * Google Vertex AI <code>project_id</code> is mandatory. For Google Model
		 * Garden's <code>completion</code> and <code>chat_completion</code> tasks, when
		 * <code>provider</code> is a supported non-<code>google</code> value -
		 * <code>project_id</code> is ignored.
		 * <p>
		 * API name: {@code project_id}
		 */
		public final Builder projectId(@Nullable String value) {
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

		/**
		 * For a <code>text_embedding</code> task, the number of dimensions the
		 * resulting output embeddings should have. By default, the model's standard
		 * output dimension is used. Refer to the Google documentation for more
		 * information.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
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

		op.add(Builder::provider, GoogleModelGardenProvider._DESERIALIZER, "provider");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::streamingUrl, JsonpDeserializer.stringDeserializer(), "streaming_url");
		op.add(Builder::location, JsonpDeserializer.stringDeserializer(), "location");
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::projectId, JsonpDeserializer.stringDeserializer(), "project_id");
		op.add(Builder::rateLimit, RateLimitSetting._DESERIALIZER, "rate_limit");
		op.add(Builder::serviceAccountJson, JsonpDeserializer.stringDeserializer(), "service_account_json");
		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");

	}

}
