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

// typedef: inference._types.EndpointMetadataDisplay

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataDisplay">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataDisplay implements JsonpSerializable {
	@Nullable
	private final String name;

	@Nullable
	private final String modelCreator;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataDisplay(Builder builder) {

		this.name = builder.name;
		this.modelCreator = builder.modelCreator;

	}

	public static EndpointMetadataDisplay of(Function<Builder, ObjectBuilder<EndpointMetadataDisplay>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name to display for the endpoint.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * The creator of the model, for display purposes.
	 * <p>
	 * API name: {@code model_creator}
	 */
	@Nullable
	public final String modelCreator() {
		return this.modelCreator;
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.modelCreator != null) {
			generator.writeKey("model_creator");
			generator.write(this.modelCreator);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataDisplay}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataDisplay> {
		@Nullable
		private String name;

		@Nullable
		private String modelCreator;

		public Builder() {
		}
		private Builder(EndpointMetadataDisplay instance) {
			this.name = instance.name;
			this.modelCreator = instance.modelCreator;

		}
		/**
		 * The name to display for the endpoint.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * The creator of the model, for display purposes.
		 * <p>
		 * API name: {@code model_creator}
		 */
		public final Builder modelCreator(@Nullable String value) {
			this.modelCreator = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataDisplay}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataDisplay build() {
			_checkSingleUse();

			return new EndpointMetadataDisplay(this);
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
	 * Json deserializer for {@link EndpointMetadataDisplay}
	 */
	public static final JsonpDeserializer<EndpointMetadataDisplay> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataDisplay::setupEndpointMetadataDisplayDeserializer);

	protected static void setupEndpointMetadataDisplayDeserializer(
			ObjectDeserializer<EndpointMetadataDisplay.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::modelCreator, JsonpDeserializer.stringDeserializer(), "model_creator");

	}

}
