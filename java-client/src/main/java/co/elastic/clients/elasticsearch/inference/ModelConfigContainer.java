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

// typedef: inference._types.ModelConfigContainer

/**
 * Represents a model as returned by the GET API
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ModelConfigContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelConfigContainer extends ModelConfig {
	private final String modelId;

	private final TaskType taskType;

	// ---------------------------------------------------------------------------------------------

	protected ModelConfigContainer(AbstractBuilder<?> builder) {
		super(builder);

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static ModelConfigContainer modelConfigContainerOf(
			Function<Builder, ObjectBuilder<ModelConfigContainer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The model Id
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The model's task type
	 * <p>
	 * API name: {@code task_type}
	 */
	public final TaskType taskType() {
		return this.taskType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("task_type");
		this.taskType.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelConfigContainer}.
	 */

	public static class Builder extends ModelConfigContainer.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ModelConfigContainer> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModelConfigContainer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelConfigContainer build() {
			_checkSingleUse();

			return new ModelConfigContainer(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ModelConfig.AbstractBuilder<BuilderT> {
		private String modelId;

		private TaskType taskType;

		/**
		 * Required - The model Id
		 * <p>
		 * API name: {@code model_id}
		 */
		public final BuilderT modelId(String value) {
			this.modelId = value;
			return self();
		}

		/**
		 * Required - The model's task type
		 * <p>
		 * API name: {@code task_type}
		 */
		public final BuilderT taskType(TaskType value) {
			this.taskType = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelConfigContainer}
	 */
	public static final JsonpDeserializer<ModelConfigContainer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ModelConfigContainer::setupModelConfigContainerDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupModelConfigContainerDeserializer(
			ObjectDeserializer<BuilderT> op) {
		ModelConfig.setupModelConfigDeserializer(op);
		op.add(AbstractBuilder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(AbstractBuilder::taskType, TaskType._DESERIALIZER, "task_type");

	}

}
