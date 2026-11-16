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

// typedef: inference._types.EndpointMetadataCapabilities

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataCapabilities">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataCapabilities implements JsonpSerializable {
	@Nullable
	private final EndpointMetadataReasoningCapability reasoning;

	@Nullable
	private final EndpointMetadataContextWindow contextWindow;

	@Nullable
	private final EndpointMetadataTemplatesCapability templates;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataCapabilities(Builder builder) {

		this.reasoning = builder.reasoning;
		this.contextWindow = builder.contextWindow;
		this.templates = builder.templates;

	}

	public static EndpointMetadataCapabilities of(Function<Builder, ObjectBuilder<EndpointMetadataCapabilities>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The reasoning support of the endpoint.
	 * <p>
	 * API name: {@code reasoning}
	 */
	@Nullable
	public final EndpointMetadataReasoningCapability reasoning() {
		return this.reasoning;
	}

	/**
	 * The context window of the model.
	 * <p>
	 * API name: {@code context_window}
	 */
	@Nullable
	public final EndpointMetadataContextWindow contextWindow() {
		return this.contextWindow;
	}

	/**
	 * The prompt template support of the endpoint. It is returned only for chat
	 * completion endpoints that require a template instead of caller-authored
	 * messages.
	 * <p>
	 * API name: {@code templates}
	 */
	@Nullable
	public final EndpointMetadataTemplatesCapability templates() {
		return this.templates;
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

		if (this.reasoning != null) {
			generator.writeKey("reasoning");
			this.reasoning.serialize(generator, mapper);

		}
		if (this.contextWindow != null) {
			generator.writeKey("context_window");
			this.contextWindow.serialize(generator, mapper);

		}
		if (this.templates != null) {
			generator.writeKey("templates");
			this.templates.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataCapabilities}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataCapabilities> {
		@Nullable
		private EndpointMetadataReasoningCapability reasoning;

		@Nullable
		private EndpointMetadataContextWindow contextWindow;

		@Nullable
		private EndpointMetadataTemplatesCapability templates;

		public Builder() {
		}
		private Builder(EndpointMetadataCapabilities instance) {
			this.reasoning = instance.reasoning;
			this.contextWindow = instance.contextWindow;
			this.templates = instance.templates;

		}
		/**
		 * The reasoning support of the endpoint.
		 * <p>
		 * API name: {@code reasoning}
		 */
		public final Builder reasoning(@Nullable EndpointMetadataReasoningCapability value) {
			this.reasoning = value;
			return this;
		}

		/**
		 * The reasoning support of the endpoint.
		 * <p>
		 * API name: {@code reasoning}
		 */
		public final Builder reasoning(
				Function<EndpointMetadataReasoningCapability.Builder, ObjectBuilder<EndpointMetadataReasoningCapability>> fn) {
			return this.reasoning(fn.apply(new EndpointMetadataReasoningCapability.Builder()).build());
		}

		/**
		 * The context window of the model.
		 * <p>
		 * API name: {@code context_window}
		 */
		public final Builder contextWindow(@Nullable EndpointMetadataContextWindow value) {
			this.contextWindow = value;
			return this;
		}

		/**
		 * The context window of the model.
		 * <p>
		 * API name: {@code context_window}
		 */
		public final Builder contextWindow(
				Function<EndpointMetadataContextWindow.Builder, ObjectBuilder<EndpointMetadataContextWindow>> fn) {
			return this.contextWindow(fn.apply(new EndpointMetadataContextWindow.Builder()).build());
		}

		/**
		 * The prompt template support of the endpoint. It is returned only for chat
		 * completion endpoints that require a template instead of caller-authored
		 * messages.
		 * <p>
		 * API name: {@code templates}
		 */
		public final Builder templates(@Nullable EndpointMetadataTemplatesCapability value) {
			this.templates = value;
			return this;
		}

		/**
		 * The prompt template support of the endpoint. It is returned only for chat
		 * completion endpoints that require a template instead of caller-authored
		 * messages.
		 * <p>
		 * API name: {@code templates}
		 */
		public final Builder templates(
				Function<EndpointMetadataTemplatesCapability.Builder, ObjectBuilder<EndpointMetadataTemplatesCapability>> fn) {
			return this.templates(fn.apply(new EndpointMetadataTemplatesCapability.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataCapabilities}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataCapabilities build() {
			_checkSingleUse();

			return new EndpointMetadataCapabilities(this);
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
	 * Json deserializer for {@link EndpointMetadataCapabilities}
	 */
	public static final JsonpDeserializer<EndpointMetadataCapabilities> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataCapabilities::setupEndpointMetadataCapabilitiesDeserializer);

	protected static void setupEndpointMetadataCapabilitiesDeserializer(
			ObjectDeserializer<EndpointMetadataCapabilities.Builder> op) {

		op.add(Builder::reasoning, EndpointMetadataReasoningCapability._DESERIALIZER, "reasoning");
		op.add(Builder::contextWindow, EndpointMetadataContextWindow._DESERIALIZER, "context_window");
		op.add(Builder::templates, EndpointMetadataTemplatesCapability._DESERIALIZER, "templates");

	}

}
