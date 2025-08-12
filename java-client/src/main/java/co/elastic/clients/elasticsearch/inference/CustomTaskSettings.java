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

// typedef: inference._types.CustomTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CustomTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomTaskSettings implements JsonpSerializable {
	@Nullable
	private final JsonData parameters;

	// ---------------------------------------------------------------------------------------------

	private CustomTaskSettings(Builder builder) {

		this.parameters = builder.parameters;

	}

	public static CustomTaskSettings of(Function<Builder, ObjectBuilder<CustomTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies parameters that are required to run the custom service. The
	 * parameters depend on the model your custom service uses. For example:
	 * 
	 * <pre>
	 * <code>&quot;task_settings&quot;:{
	 *   &quot;parameters&quot;:{
	 *     &quot;input_type&quot;:&quot;query&quot;,
	 *     &quot;return_token&quot;:true
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code parameters}
	 */
	@Nullable
	public final JsonData parameters() {
		return this.parameters;
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

		if (this.parameters != null) {
			generator.writeKey("parameters");
			this.parameters.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CustomTaskSettings> {
		@Nullable
		private JsonData parameters;

		/**
		 * Specifies parameters that are required to run the custom service. The
		 * parameters depend on the model your custom service uses. For example:
		 * 
		 * <pre>
		 * <code>&quot;task_settings&quot;:{
		 *   &quot;parameters&quot;:{
		 *     &quot;input_type&quot;:&quot;query&quot;,
		 *     &quot;return_token&quot;:true
		 *   }
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code parameters}
		 */
		public final Builder parameters(@Nullable JsonData value) {
			this.parameters = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomTaskSettings build() {
			_checkSingleUse();

			return new CustomTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomTaskSettings}
	 */
	public static final JsonpDeserializer<CustomTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CustomTaskSettings::setupCustomTaskSettingsDeserializer);

	protected static void setupCustomTaskSettingsDeserializer(ObjectDeserializer<CustomTaskSettings.Builder> op) {

		op.add(Builder::parameters, JsonData._DESERIALIZER, "parameters");

	}

}
