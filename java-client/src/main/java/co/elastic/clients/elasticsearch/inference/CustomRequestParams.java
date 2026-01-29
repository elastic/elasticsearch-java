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

// typedef: inference._types.CustomRequestParams

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CustomRequestParams">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomRequestParams implements JsonpSerializable {
	private final String content;

	// ---------------------------------------------------------------------------------------------

	private CustomRequestParams(Builder builder) {

		this.content = ApiTypeHelper.requireNonNull(builder.content, this, "content");

	}

	public static CustomRequestParams of(Function<Builder, ObjectBuilder<CustomRequestParams>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The body structure of the request. It requires passing in the
	 * string-escaped result of the JSON format HTTP request body. For example:
	 * 
	 * <pre>
	 * <code>&quot;request&quot;: &quot;{\&quot;input\&quot;:${input}}&quot;
	 * </code>
	 * </pre>
	 * 
	 * <blockquote>
	 * <p>
	 * info The content string needs to be a single line except when using the
	 * Kibana console.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code content}
	 */
	public final String content() {
		return this.content;
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

		generator.writeKey("content");
		generator.write(this.content);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomRequestParams}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CustomRequestParams> {
		private String content;

		public Builder() {
		}
		private Builder(CustomRequestParams instance) {
			this.content = instance.content;

		}
		/**
		 * Required - The body structure of the request. It requires passing in the
		 * string-escaped result of the JSON format HTTP request body. For example:
		 * 
		 * <pre>
		 * <code>&quot;request&quot;: &quot;{\&quot;input\&quot;:${input}}&quot;
		 * </code>
		 * </pre>
		 * 
		 * <blockquote>
		 * <p>
		 * info The content string needs to be a single line except when using the
		 * Kibana console.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code content}
		 */
		public final Builder content(String value) {
			this.content = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomRequestParams}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomRequestParams build() {
			_checkSingleUse();

			return new CustomRequestParams(this);
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
	 * Json deserializer for {@link CustomRequestParams}
	 */
	public static final JsonpDeserializer<CustomRequestParams> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CustomRequestParams::setupCustomRequestParamsDeserializer);

	protected static void setupCustomRequestParamsDeserializer(ObjectDeserializer<CustomRequestParams.Builder> op) {

		op.add(Builder::content, JsonpDeserializer.stringDeserializer(), "content");

	}

}
