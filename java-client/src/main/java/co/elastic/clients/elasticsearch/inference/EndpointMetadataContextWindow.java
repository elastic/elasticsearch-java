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
import java.lang.Integer;
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

// typedef: inference._types.EndpointMetadataContextWindow

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataContextWindow">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataContextWindow implements JsonpSerializable {
	@Nullable
	private final Integer maxInputTokens;

	@Nullable
	private final Integer maxOutputTokens;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataContextWindow(Builder builder) {

		this.maxInputTokens = builder.maxInputTokens;
		this.maxOutputTokens = builder.maxOutputTokens;

	}

	public static EndpointMetadataContextWindow of(Function<Builder, ObjectBuilder<EndpointMetadataContextWindow>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The maximum number of input tokens that the model accepts.
	 * <p>
	 * API name: {@code max_input_tokens}
	 */
	@Nullable
	public final Integer maxInputTokens() {
		return this.maxInputTokens;
	}

	/**
	 * The maximum number of output tokens that the model generates.
	 * <p>
	 * API name: {@code max_output_tokens}
	 */
	@Nullable
	public final Integer maxOutputTokens() {
		return this.maxOutputTokens;
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

		if (this.maxInputTokens != null) {
			generator.writeKey("max_input_tokens");
			generator.write(this.maxInputTokens);

		}
		if (this.maxOutputTokens != null) {
			generator.writeKey("max_output_tokens");
			generator.write(this.maxOutputTokens);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataContextWindow}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataContextWindow> {
		@Nullable
		private Integer maxInputTokens;

		@Nullable
		private Integer maxOutputTokens;

		public Builder() {
		}
		private Builder(EndpointMetadataContextWindow instance) {
			this.maxInputTokens = instance.maxInputTokens;
			this.maxOutputTokens = instance.maxOutputTokens;

		}
		/**
		 * The maximum number of input tokens that the model accepts.
		 * <p>
		 * API name: {@code max_input_tokens}
		 */
		public final Builder maxInputTokens(@Nullable Integer value) {
			this.maxInputTokens = value;
			return this;
		}

		/**
		 * The maximum number of output tokens that the model generates.
		 * <p>
		 * API name: {@code max_output_tokens}
		 */
		public final Builder maxOutputTokens(@Nullable Integer value) {
			this.maxOutputTokens = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataContextWindow}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataContextWindow build() {
			_checkSingleUse();

			return new EndpointMetadataContextWindow(this);
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
	 * Json deserializer for {@link EndpointMetadataContextWindow}
	 */
	public static final JsonpDeserializer<EndpointMetadataContextWindow> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataContextWindow::setupEndpointMetadataContextWindowDeserializer);

	protected static void setupEndpointMetadataContextWindowDeserializer(
			ObjectDeserializer<EndpointMetadataContextWindow.Builder> op) {

		op.add(Builder::maxInputTokens, JsonpDeserializer.integerDeserializer(), "max_input_tokens");
		op.add(Builder::maxOutputTokens, JsonpDeserializer.integerDeserializer(), "max_output_tokens");

	}

}
