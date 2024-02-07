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
 * Manually moves an index into the specified step and executes that step.
 * 
 * @see <a href="../doc-files/api-spec.html#ilm.move_to_step.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MoveToStepRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final StepKey currentStep;

	private final String index;

	@Nullable
	private final StepKey nextStep;

	// ---------------------------------------------------------------------------------------------

	private MoveToStepRequest(Builder builder) {

		this.currentStep = builder.currentStep;
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.nextStep = builder.nextStep;

	}

	public static MoveToStepRequest of(Function<Builder, ObjectBuilder<MoveToStepRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code current_step}
	 */
	@Nullable
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
	 * API name: {@code next_step}
	 */
	@Nullable
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

		if (this.currentStep != null) {
			generator.writeKey("current_step");
			this.currentStep.serialize(generator, mapper);

		}
		if (this.nextStep != null) {
			generator.writeKey("next_step");
			this.nextStep.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MoveToStepRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MoveToStepRequest> {
		@Nullable
		private StepKey currentStep;

		private String index;

		@Nullable
		private StepKey nextStep;

		/**
		 * API name: {@code current_step}
		 */
		public final Builder currentStep(@Nullable StepKey value) {
			this.currentStep = value;
			return this;
		}

		/**
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
		 * API name: {@code next_step}
		 */
		public final Builder nextStep(@Nullable StepKey value) {
			this.nextStep = value;
			return this;
		}

		/**
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
