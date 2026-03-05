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

import co.elastic.clients.json.JsonData;
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

// typedef: inference._types.RequestEmbedding

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.RequestEmbedding">API
 *      specification</a>
 */
@JsonpDeserializable
public class RequestEmbedding implements JsonpSerializable {
	private final EmbeddingInput input;

	@Nullable
	private final String inputType;

	@Nullable
	private final JsonData taskSettings;

	// ---------------------------------------------------------------------------------------------

	private RequestEmbedding(Builder builder) {

		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");
		this.inputType = builder.inputType;
		this.taskSettings = builder.taskSettings;

	}

	public static RequestEmbedding of(Function<Builder, ObjectBuilder<RequestEmbedding>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Inference input. Either a string, an array of strings, a
	 * <code>content</code> object, or an array of <code>content</code> objects.
	 * <p>
	 * string example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: &quot;Some text&quot;
	 * </code>
	 * </pre>
	 * <p>
	 * string array example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: [&quot;Some text&quot;, &quot;Some more text&quot;]
	 * </code>
	 * </pre>
	 * <p>
	 * <code>content</code> object example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: {
	 *     &quot;content&quot;: {
	 *       &quot;type&quot;: &quot;image&quot;,
	 *       &quot;format&quot;: &quot;base64&quot;,
	 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
	 *     }
	 *   }
	 * </code>
	 * </pre>
	 * <p>
	 * <code>content</code> object array example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: [
	 *   {
	 *     &quot;content&quot;: {
	 *       &quot;type&quot;: &quot;text&quot;,
	 *       &quot;format&quot;: &quot;text&quot;,
	 *       &quot;value&quot;: &quot;Some text to generate an embedding&quot;
	 *     }
	 *   },
	 *   {
	 *     &quot;content&quot;: {
	 *       &quot;type&quot;: &quot;image&quot;,
	 *       &quot;format&quot;: &quot;base64&quot;,
	 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
	 *     }
	 *   }
	 * ]
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code input}
	 */
	public final EmbeddingInput input() {
		return this.input;
	}

	/**
	 * The input data type for the embedding model. Possible values include:
	 * <ul>
	 * <li><code>SEARCH</code></li>
	 * <li><code>INGEST</code></li>
	 * <li><code>CLASSIFICATION</code></li>
	 * <li><code>CLUSTERING</code></li>
	 * </ul>
	 * <p>
	 * Not all models support all values. Unsupported values will trigger a
	 * validation exception. Accepted values depend on the configured inference
	 * service, refer to the relevant service-specific documentation for more info.
	 * <blockquote>
	 * <p>
	 * info The <code>input_type</code> parameter specified on the root level of the
	 * request body will take precedence over the <code>input_type</code> parameter
	 * specified in <code>task_settings</code>.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code input_type}
	 */
	@Nullable
	public final String inputType() {
		return this.inputType;
	}

	/**
	 * Task settings for the individual inference request. These settings are
	 * specific to the &lt;task_type&gt; you specified and override the task
	 * settings specified when initializing the service.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final JsonData taskSettings() {
		return this.taskSettings;
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

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.inputType != null) {
			generator.writeKey("input_type");
			generator.write(this.inputType);

		}
		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RequestEmbedding}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RequestEmbedding> {
		private EmbeddingInput input;

		@Nullable
		private String inputType;

		@Nullable
		private JsonData taskSettings;

		public Builder() {
		}
		private Builder(RequestEmbedding instance) {
			this.input = instance.input;
			this.inputType = instance.inputType;
			this.taskSettings = instance.taskSettings;

		}
		/**
		 * Required - Inference input. Either a string, an array of strings, a
		 * <code>content</code> object, or an array of <code>content</code> objects.
		 * <p>
		 * string example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: &quot;Some text&quot;
		 * </code>
		 * </pre>
		 * <p>
		 * string array example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: [&quot;Some text&quot;, &quot;Some more text&quot;]
		 * </code>
		 * </pre>
		 * <p>
		 * <code>content</code> object example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;image&quot;,
		 *       &quot;format&quot;: &quot;base64&quot;,
		 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
		 *     }
		 *   }
		 * </code>
		 * </pre>
		 * <p>
		 * <code>content</code> object array example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: [
		 *   {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;text&quot;,
		 *       &quot;format&quot;: &quot;text&quot;,
		 *       &quot;value&quot;: &quot;Some text to generate an embedding&quot;
		 *     }
		 *   },
		 *   {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;image&quot;,
		 *       &quot;format&quot;: &quot;base64&quot;,
		 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
		 *     }
		 *   }
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(EmbeddingInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - Inference input. Either a string, an array of strings, a
		 * <code>content</code> object, or an array of <code>content</code> objects.
		 * <p>
		 * string example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: &quot;Some text&quot;
		 * </code>
		 * </pre>
		 * <p>
		 * string array example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: [&quot;Some text&quot;, &quot;Some more text&quot;]
		 * </code>
		 * </pre>
		 * <p>
		 * <code>content</code> object example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;image&quot;,
		 *       &quot;format&quot;: &quot;base64&quot;,
		 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
		 *     }
		 *   }
		 * </code>
		 * </pre>
		 * <p>
		 * <code>content</code> object array example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: [
		 *   {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;text&quot;,
		 *       &quot;format&quot;: &quot;text&quot;,
		 *       &quot;value&quot;: &quot;Some text to generate an embedding&quot;
		 *     }
		 *   },
		 *   {
		 *     &quot;content&quot;: {
		 *       &quot;type&quot;: &quot;image&quot;,
		 *       &quot;format&quot;: &quot;base64&quot;,
		 *       &quot;value&quot;: &quot;data:image/jpg;base64,...&quot;
		 *     }
		 *   }
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(Function<EmbeddingInput.Builder, ObjectBuilder<EmbeddingInput>> fn) {
			return this.input(fn.apply(new EmbeddingInput.Builder()).build());
		}

		/**
		 * The input data type for the embedding model. Possible values include:
		 * <ul>
		 * <li><code>SEARCH</code></li>
		 * <li><code>INGEST</code></li>
		 * <li><code>CLASSIFICATION</code></li>
		 * <li><code>CLUSTERING</code></li>
		 * </ul>
		 * <p>
		 * Not all models support all values. Unsupported values will trigger a
		 * validation exception. Accepted values depend on the configured inference
		 * service, refer to the relevant service-specific documentation for more info.
		 * <blockquote>
		 * <p>
		 * info The <code>input_type</code> parameter specified on the root level of the
		 * request body will take precedence over the <code>input_type</code> parameter
		 * specified in <code>task_settings</code>.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code input_type}
		 */
		public final Builder inputType(@Nullable String value) {
			this.inputType = value;
			return this;
		}

		/**
		 * Task settings for the individual inference request. These settings are
		 * specific to the &lt;task_type&gt; you specified and override the task
		 * settings specified when initializing the service.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable JsonData value) {
			this.taskSettings = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RequestEmbedding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RequestEmbedding build() {
			_checkSingleUse();

			return new RequestEmbedding(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RequestEmbedding}
	 */
	public static final JsonpDeserializer<RequestEmbedding> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RequestEmbedding::setupRequestEmbeddingDeserializer);

	protected static void setupRequestEmbeddingDeserializer(ObjectDeserializer<RequestEmbedding.Builder> op) {

		op.add(Builder::input, EmbeddingInput._DESERIALIZER, "input");
		op.add(Builder::inputType, JsonpDeserializer.stringDeserializer(), "input_type");
		op.add(Builder::taskSettings, JsonData._DESERIALIZER, "task_settings");

	}

}
