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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.inference.decision.DecisionInput;
import co.elastic.clients.elasticsearch.inference.decision.DecisionTaskSettings;
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
import java.util.HashMap;
import java.util.Map;
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

// typedef: inference.decision.Request

/**
 * Perform decision inference on the service.
 * <p>
 * Answer a set of named questions about an input, such as whether a customer is
 * complaining, which team should handle a request, or how angry a customer is.
 * The questions are defined in the task settings of the inference endpoint, and
 * can be replaced for a single request through <code>task_settings</code>.
 * <blockquote>
 * <p>
 * info Only the <code>elastic</code> service currently supports the
 * <code>decision</code> task.
 * </p>
 * </blockquote>
 *
 * @see <a href="../doc-files/api-spec.html#inference.decision.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionRequest extends RequestBase implements JsonpSerializable {
	private final String inferenceId;

	private final DecisionInput input;

	@Nullable
	private final DecisionTaskSettings taskSettings;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private DecisionRequest(Builder builder) {

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");
		this.taskSettings = builder.taskSettings;
		this.timeout = builder.timeout;

	}

	public static DecisionRequest of(Function<Builder, ObjectBuilder<DecisionRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier for the inference endpoint.
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Required - The input to answer the questions about. It can be specified as a
	 * string, or as an object. The object form additionally allows specifying
	 * images.
	 * <p>
	 * string example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: &quot;I was charged twice for my order and nobody answers my emails.&quot;
	 * </code>
	 * </pre>
	 * <p>
	 * object example:
	 * 
	 * <pre>
	 * <code>&quot;input&quot;: {
	 *   &quot;type&quot;: &quot;image&quot;,
	 *   &quot;format&quot;: &quot;base64&quot;,
	 *   &quot;value&quot;: &quot;data:image/jpeg;base64,...&quot;
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code input}
	 */
	public final DecisionInput input() {
		return this.input;
	}

	/**
	 * Task settings for the individual inference request. These settings override
	 * the task settings specified when creating the inference endpoint.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final DecisionTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * The amount of time to wait for the inference request to complete.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DecisionRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<DecisionRequest> {
		private String inferenceId;

		private DecisionInput input;

		@Nullable
		private DecisionTaskSettings taskSettings;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(DecisionRequest instance) {
			this.inferenceId = instance.inferenceId;
			this.input = instance.input;
			this.taskSettings = instance.taskSettings;
			this.timeout = instance.timeout;

		}
		/**
		 * Required - The unique identifier for the inference endpoint.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * Required - The input to answer the questions about. It can be specified as a
		 * string, or as an object. The object form additionally allows specifying
		 * images.
		 * <p>
		 * string example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: &quot;I was charged twice for my order and nobody answers my emails.&quot;
		 * </code>
		 * </pre>
		 * <p>
		 * object example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: {
		 *   &quot;type&quot;: &quot;image&quot;,
		 *   &quot;format&quot;: &quot;base64&quot;,
		 *   &quot;value&quot;: &quot;data:image/jpeg;base64,...&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(DecisionInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - The input to answer the questions about. It can be specified as a
		 * string, or as an object. The object form additionally allows specifying
		 * images.
		 * <p>
		 * string example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: &quot;I was charged twice for my order and nobody answers my emails.&quot;
		 * </code>
		 * </pre>
		 * <p>
		 * object example:
		 * 
		 * <pre>
		 * <code>&quot;input&quot;: {
		 *   &quot;type&quot;: &quot;image&quot;,
		 *   &quot;format&quot;: &quot;base64&quot;,
		 *   &quot;value&quot;: &quot;data:image/jpeg;base64,...&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(Function<DecisionInput.Builder, ObjectBuilder<DecisionInput>> fn) {
			return this.input(fn.apply(new DecisionInput.Builder()).build());
		}

		/**
		 * Task settings for the individual inference request. These settings override
		 * the task settings specified when creating the inference endpoint.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable DecisionTaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Task settings for the individual inference request. These settings override
		 * the task settings specified when creating the inference endpoint.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(
				Function<DecisionTaskSettings.Builder, ObjectBuilder<DecisionTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new DecisionTaskSettings.Builder()).build());
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The amount of time to wait for the inference request to complete.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DecisionRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DecisionRequest build() {
			_checkSingleUse();

			return new DecisionRequest(this);
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
	 * Json deserializer for {@link DecisionRequest}
	 */
	public static final JsonpDeserializer<DecisionRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DecisionRequest::setupDecisionRequestDeserializer);

	protected static void setupDecisionRequestDeserializer(ObjectDeserializer<DecisionRequest.Builder> op) {

		op.add(Builder::input, DecisionInput._DESERIALIZER, "input");
		op.add(Builder::taskSettings, DecisionTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.decision}".
	 */
	public static final Endpoint<DecisionRequest, DecisionResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.decision",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/decision");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.inferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _inferenceId = 1 << 0;

				int propsSet = 0;

				propsSet |= _inferenceId;

				if (propsSet == (_inferenceId)) {
					params.put("inferenceId", request.inferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, DecisionResponse._DESERIALIZER);
}
