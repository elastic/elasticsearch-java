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

// typedef: inference._types.ModelConfig

/**
 * Configuration options when storing the model config
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.ModelConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelConfig implements JsonpSerializable {
	private final String service;

	private final JsonData serviceSettings;

	private final JsonData taskSettings;

	// ---------------------------------------------------------------------------------------------

	protected ModelConfig(AbstractBuilder<?> builder) {

		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = ApiTypeHelper.requireNonNull(builder.taskSettings, this, "taskSettings");

	}

	public static ModelConfig modelConfigOf(Function<Builder, ObjectBuilder<ModelConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The service type
	 * <p>
	 * API name: {@code service}
	 */
	public final String service() {
		return this.service;
	}

	/**
	 * Required - Settings specific to the service
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final JsonData serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - Task settings specific to the service and model
	 * <p>
	 * API name: {@code task_settings}
	 */
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

		generator.writeKey("service");
		generator.write(this.service);

		generator.writeKey("service_settings");
		this.serviceSettings.serialize(generator, mapper);

		generator.writeKey("task_settings");
		this.taskSettings.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelConfig}.
	 */

	public static class Builder extends ModelConfig.AbstractBuilder<Builder> implements ObjectBuilder<ModelConfig> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModelConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelConfig build() {
			_checkSingleUse();

			return new ModelConfig(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String service;

		private JsonData serviceSettings;

		private JsonData taskSettings;

		/**
		 * Required - The service type
		 * <p>
		 * API name: {@code service}
		 */
		public final BuilderT service(String value) {
			this.service = value;
			return self();
		}

		/**
		 * Required - Settings specific to the service
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final BuilderT serviceSettings(JsonData value) {
			this.serviceSettings = value;
			return self();
		}

		/**
		 * Required - Task settings specific to the service and model
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final BuilderT taskSettings(JsonData value) {
			this.taskSettings = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelConfig}
	 */
	public static final JsonpDeserializer<ModelConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ModelConfig::setupModelConfigDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupModelConfigDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::service, JsonpDeserializer.stringDeserializer(), "service");
		op.add(AbstractBuilder::serviceSettings, JsonData._DESERIALIZER, "service_settings");
		op.add(AbstractBuilder::taskSettings, JsonData._DESERIALIZER, "task_settings");

	}

}
