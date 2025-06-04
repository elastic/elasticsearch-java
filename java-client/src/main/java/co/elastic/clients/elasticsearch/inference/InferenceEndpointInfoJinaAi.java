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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
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

// typedef: inference._types.InferenceEndpointInfoJinaAi

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.InferenceEndpointInfoJinaAi">API
 *      specification</a>
 */

public abstract class InferenceEndpointInfoJinaAi extends InferenceEndpoint {
	private final String inferenceId;

	private final TaskTypeJinaAi taskType;

	// ---------------------------------------------------------------------------------------------

	protected InferenceEndpointInfoJinaAi(AbstractBuilder<?> builder) {
		super(builder);

		this.inferenceId = ApiTypeHelper.requireNonNull(builder.inferenceId, this, "inferenceId");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	/**
	 * Required - The inference Id
	 * <p>
	 * API name: {@code inference_id}
	 */
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * Required - The task type
	 * <p>
	 * API name: {@code task_type}
	 */
	public final TaskTypeJinaAi taskType() {
		return this.taskType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("inference_id");
		generator.write(this.inferenceId);

		generator.writeKey("task_type");
		this.taskType.serialize(generator, mapper);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				InferenceEndpoint.AbstractBuilder<BuilderT> {
		private String inferenceId;

		private TaskTypeJinaAi taskType;

		/**
		 * Required - The inference Id
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final BuilderT inferenceId(String value) {
			this.inferenceId = value;
			return self();
		}

		/**
		 * Required - The task type
		 * <p>
		 * API name: {@code task_type}
		 */
		public final BuilderT taskType(TaskTypeJinaAi value) {
			this.taskType = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupInferenceEndpointInfoJinaAiDeserializer(
			ObjectDeserializer<BuilderT> op) {
		InferenceEndpoint.setupInferenceEndpointDeserializer(op);
		op.add(AbstractBuilder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(AbstractBuilder::taskType, TaskTypeJinaAi._DESERIALIZER, "task_type");

	}

}
