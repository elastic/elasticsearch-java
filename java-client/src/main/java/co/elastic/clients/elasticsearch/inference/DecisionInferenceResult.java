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

// typedef: inference._types.DecisionInferenceResult

/**
 * Defines the response for a decision request.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.DecisionInferenceResult">API
 *      specification</a>
 */

public abstract class DecisionInferenceResult implements JsonpSerializable {
	private final DecisionResult decision;

	// ---------------------------------------------------------------------------------------------

	protected DecisionInferenceResult(AbstractBuilder<?> builder) {

		this.decision = ApiTypeHelper.requireNonNull(builder.decision, this, "decision");

	}

	/**
	 * Required - API name: {@code decision}
	 */
	public final DecisionResult decision() {
		return this.decision;
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

		generator.writeKey("decision");
		this.decision.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private DecisionResult decision;

		/**
		 * Required - API name: {@code decision}
		 */
		public final BuilderT decision(DecisionResult value) {
			this.decision = value;
			return self();
		}

		/**
		 * Required - API name: {@code decision}
		 */
		public final BuilderT decision(Function<DecisionResult.Builder, ObjectBuilder<DecisionResult>> fn) {
			return this.decision(fn.apply(new DecisionResult.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDecisionInferenceResultDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::decision, DecisionResult._DESERIALIZER, "decision");

	}

}
