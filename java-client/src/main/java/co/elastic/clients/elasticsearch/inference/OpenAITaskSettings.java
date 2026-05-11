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

// typedef: inference._types.OpenAITaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.OpenAITaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenAITaskSettings implements JsonpSerializable {
	@Nullable
	private final String user;

	private final Map<String, String> headers;

	// ---------------------------------------------------------------------------------------------

	private OpenAITaskSettings(Builder builder) {

		this.user = builder.user;
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);

	}

	public static OpenAITaskSettings of(Function<Builder, ObjectBuilder<OpenAITaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the user issuing the request. This information can be used for
	 * abuse detection.
	 * <p>
	 * API name: {@code user}
	 */
	@Nullable
	public final String user() {
		return this.user;
	}

	/**
	 * Specifies custom HTTP header parameters. For example:
	 * 
	 * <pre>
	 * <code>&quot;headers&quot;: {
	 *   &quot;Custom-Header&quot;: &quot;Some-Value&quot;,
	 *   &quot;Another-Custom-Header&quot;: &quot;Another-Value&quot;
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code headers}
	 */
	public final Map<String, String> headers() {
		return this.headers;
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

		if (this.user != null) {
			generator.writeKey("user");
			generator.write(this.user);

		}
		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link OpenAITaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OpenAITaskSettings> {
		@Nullable
		private String user;

		@Nullable
		private Map<String, String> headers;

		public Builder() {
		}
		private Builder(OpenAITaskSettings instance) {
			this.user = instance.user;
			this.headers = instance.headers;

		}
		/**
		 * Specifies the user issuing the request. This information can be used for
		 * abuse detection.
		 * <p>
		 * API name: {@code user}
		 */
		public final Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		/**
		 * Specifies custom HTTP header parameters. For example:
		 * 
		 * <pre>
		 * <code>&quot;headers&quot;: {
		 *   &quot;Custom-Header&quot;: &quot;Some-Value&quot;,
		 *   &quot;Another-Custom-Header&quot;: &quot;Another-Value&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, String> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * Specifies custom HTTP header parameters. For example:
		 * 
		 * <pre>
		 * <code>&quot;headers&quot;: {
		 *   &quot;Custom-Header&quot;: &quot;Some-Value&quot;,
		 *   &quot;Another-Custom-Header&quot;: &quot;Another-Value&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, String value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenAITaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenAITaskSettings build() {
			_checkSingleUse();

			return new OpenAITaskSettings(this);
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
	 * Json deserializer for {@link OpenAITaskSettings}
	 */
	public static final JsonpDeserializer<OpenAITaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OpenAITaskSettings::setupOpenAITaskSettingsDeserializer);

	protected static void setupOpenAITaskSettingsDeserializer(ObjectDeserializer<OpenAITaskSettings.Builder> op) {

		op.add(Builder::user, JsonpDeserializer.stringDeserializer(), "user");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"headers");

	}

}
