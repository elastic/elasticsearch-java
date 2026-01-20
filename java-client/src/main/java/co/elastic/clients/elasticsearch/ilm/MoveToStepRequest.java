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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ilm.move_to_step.StepKey;
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

// typedef: ilm.move_to_step.Request

/**
 * Move to a lifecycle step.
 * <p>
 * Manually move an index into a specific step in the lifecycle policy and run
 * that step.
 * <p>
 * WARNING: This operation can result in the loss of data. Manually moving an
 * index into a specific step runs that step even if it has already been
 * performed. This is a potentially destructive action and this should be
 * considered an expert level API.
 * <p>
 * You must specify both the current step and the step to be executed in the
 * body of the request. The request will fail if the current step does not match
 * the step currently running for the index This is to prevent the index from
 * being moved from an unexpected step into the next step.
 * <p>
 * When specifying the target (<code>next_step</code>) to which the index will
 * be moved, either the name or both the action and name fields are optional. If
 * only the phase is specified, the index will move to the first step of the
 * first action in the target phase. If the phase and action are specified, the
 * index will move to the first step of the specified action in the specified
 * phase. Only actions specified in the ILM policy are considered valid. An
 * index cannot move to a step that is not part of its policy.
 * 
 * @see <a href="../doc-files/api-spec.html#ilm.move_to_step.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MoveToStepRequest extends RequestBase implements JsonpSerializable {
	private final StepKey currentStep;

	private final String index;

	private final StepKey nextStep;

	// ---------------------------------------------------------------------------------------------

	private MoveToStepRequest(Builder builder) {

		this.currentStep = ApiTypeHelper.requireNonNull(builder.currentStep, this, "currentStep");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.nextStep = ApiTypeHelper.requireNonNull(builder.nextStep, this, "nextStep");

	}

	public static MoveToStepRequest of(Function<Builder, ObjectBuilder<MoveToStepRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The step that the index is expected to be in.
	 * <p>
	 * API name: {@code current_step}
	 */
	public final StepKey currentStep() {
		return this.currentStep;
	}

	/**
	 * Required - The name of the index whose lifecycle step is to change
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - The step that you want to run.
	 * <p>
	 * API name: {@code next_step}
	 */
	public final StepKey nextStep() {
		return this.nextStep;
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

		generator.writeKey("current_step");
		this.currentStep.serialize(generator, mapper);

		generator.writeKey("next_step");
		this.nextStep.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MoveToStepRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MoveToStepRequest> {
		private StepKey currentStep;

		private String index;

		private StepKey nextStep;

		public Builder() {
		}
		private Builder(MoveToStepRequest instance) {
			this.currentStep = instance.currentStep;
			this.index = instance.index;
			this.nextStep = instance.nextStep;

		}
		/**
		 * Required - The step that the index is expected to be in.
		 * <p>
		 * API name: {@code current_step}
		 */
		public final Builder currentStep(StepKey value) {
			this.currentStep = value;
			return this;
		}

		/**
		 * Required - The step that the index is expected to be in.
		 * <p>
		 * API name: {@code current_step}
		 */
		public final Builder currentStep(Function<StepKey.Builder, ObjectBuilder<StepKey>> fn) {
			return this.currentStep(fn.apply(new StepKey.Builder()).build());
		}

		/**
		 * Required - The name of the index whose lifecycle step is to change
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - The step that you want to run.
		 * <p>
		 * API name: {@code next_step}
		 */
		public final Builder nextStep(StepKey value) {
			this.nextStep = value;
			return this;
		}

		/**
		 * Required - The step that you want to run.
		 * <p>
		 * API name: {@code next_step}
		 */
		public final Builder nextStep(Function<StepKey.Builder, ObjectBuilder<StepKey>> fn) {
			return this.nextStep(fn.apply(new StepKey.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MoveToStepRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MoveToStepRequest build() {
			_checkSingleUse();

			return new MoveToStepRequest(this);
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
	 * Json deserializer for {@link MoveToStepRequest}
	 */
	public static final JsonpDeserializer<MoveToStepRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MoveToStepRequest::setupMoveToStepRequestDeserializer);

	protected static void setupMoveToStepRequestDeserializer(ObjectDeserializer<MoveToStepRequest.Builder> op) {

		op.add(Builder::currentStep, StepKey._DESERIALIZER, "current_step");
		op.add(Builder::nextStep, StepKey._DESERIALIZER, "next_step");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.move_to_step}".
	 */
	public static final Endpoint<MoveToStepRequest, MoveToStepResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ilm.move_to_step",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ilm");
					buf.append("/move");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, MoveToStepResponse._DESERIALIZER);
}
