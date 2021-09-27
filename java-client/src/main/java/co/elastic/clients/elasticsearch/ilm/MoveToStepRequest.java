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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ilm.move_to_step.StepKey;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.move_to_step.Request
@JsonpDeserializable
public final class MoveToStepRequest extends RequestBase implements JsonpSerializable {
	private final String index;

	@Nullable
	private final StepKey currentStep;

	@Nullable
	private final StepKey nextStep;

	// ---------------------------------------------------------------------------------------------

	public MoveToStepRequest(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.currentStep = builder.currentStep;
		this.nextStep = builder.nextStep;

	}

	/**
	 * The name of the index whose lifecycle step is to change
	 * <p>
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code current_step}
	 */
	@Nullable
	public StepKey currentStep() {
		return this.currentStep;
	}

	/**
	 * API name: {@code next_step}
	 */
	@Nullable
	public StepKey nextStep() {
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
	public static class Builder implements ObjectBuilder<MoveToStepRequest> {
		private String index;

		@Nullable
		private StepKey currentStep;

		@Nullable
		private StepKey nextStep;

		/**
		 * The name of the index whose lifecycle step is to change
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code current_step}
		 */
		public Builder currentStep(@Nullable StepKey value) {
			this.currentStep = value;
			return this;
		}

		/**
		 * API name: {@code current_step}
		 */
		public Builder currentStep(Function<StepKey.Builder, ObjectBuilder<StepKey>> fn) {
			return this.currentStep(fn.apply(new StepKey.Builder()).build());
		}

		/**
		 * API name: {@code next_step}
		 */
		public Builder nextStep(@Nullable StepKey value) {
			this.nextStep = value;
			return this;
		}

		/**
		 * API name: {@code next_step}
		 */
		public Builder nextStep(Function<StepKey.Builder, ObjectBuilder<StepKey>> fn) {
			return this.nextStep(fn.apply(new StepKey.Builder()).build());
		}

		/**
		 * Builds a {@link MoveToStepRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MoveToStepRequest build() {

			return new MoveToStepRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MoveToStepRequest}
	 */
	public static final JsonpDeserializer<MoveToStepRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MoveToStepRequest::setupMoveToStepRequestDeserializer, Builder::build);

	protected static void setupMoveToStepRequestDeserializer(DelegatingDeserializer<MoveToStepRequest.Builder> op) {

		op.add(Builder::currentStep, StepKey._DESERIALIZER, "current_step");
		op.add(Builder::nextStep, StepKey._DESERIALIZER, "next_step");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.move_to_step}".
	 */
	public static final Endpoint<MoveToStepRequest, MoveToStepResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append(request.index);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, MoveToStepResponse._DESERIALIZER);
}
