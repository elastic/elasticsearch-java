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

import co.elastic.clients.elasticsearch._types.FieldValue;
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

// typedef: inference._types.CustomTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CustomTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomTaskSettings implements JsonpSerializable {
	private final Map<String, FieldValue> parameters;

	// ---------------------------------------------------------------------------------------------

	private CustomTaskSettings(Builder builder) {

		this.parameters = ApiTypeHelper.unmodifiable(builder.parameters);

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
	public final Map<String, FieldValue> parameters() {
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

		if (ApiTypeHelper.isDefined(this.parameters)) {
			generator.writeKey("parameters");
			generator.writeStartObject();
			for (Map.Entry<String, FieldValue> item0 : this.parameters.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

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
		private Map<String, FieldValue> parameters;

		public Builder() {
		}
		private Builder(CustomTaskSettings instance) {
			this.parameters = instance.parameters;

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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>parameters</code>.
		 */
		public final Builder parameters(Map<String, FieldValue> map) {
			this.parameters = _mapPutAll(this.parameters, map);
			return this;
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
		 * <p>
		 * Adds an entry to <code>parameters</code>.
		 */
		public final Builder parameters(String key, FieldValue value) {
			this.parameters = _mapPut(this.parameters, key, value);
			return this;
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
		 * <p>
		 * Adds an entry to <code>parameters</code> using a builder lambda.
		 */
		public final Builder parameters(String key, Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return parameters(key, fn.apply(new FieldValue.Builder()).build());
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomTaskSettings}
	 */
	public static final JsonpDeserializer<CustomTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CustomTaskSettings::setupCustomTaskSettingsDeserializer);

	protected static void setupCustomTaskSettingsDeserializer(ObjectDeserializer<CustomTaskSettings.Builder> op) {

		op.add(Builder::parameters, JsonpDeserializer.stringMapDeserializer(FieldValue._DESERIALIZER), "parameters");

	}

}
