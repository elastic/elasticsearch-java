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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: inference._types.CustomServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CustomServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomServiceSettings implements JsonpSerializable {
	@Nullable
	private final Integer batchSize;

	private final Map<String, String> headers;

	private final Map<CustomServiceInputType, String> inputType;

	private final List<List<String>> queryParameters;

	private final CustomRequestParams request;

	private final CustomResponseParams response;

	private final Map<String, String> secretParameters;

	@Nullable
	private final String url;

	// ---------------------------------------------------------------------------------------------

	private CustomServiceSettings(Builder builder) {

		this.batchSize = builder.batchSize;
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.inputType = ApiTypeHelper.unmodifiable(builder.inputType);
		this.queryParameters = ApiTypeHelper.unmodifiable(builder.queryParameters);
		this.request = ApiTypeHelper.requireNonNull(builder.request, this, "request");
		this.response = ApiTypeHelper.requireNonNull(builder.response, this, "response");
		this.secretParameters = ApiTypeHelper.unmodifiableRequired(builder.secretParameters, this, "secretParameters");
		this.url = builder.url;

	}

	public static CustomServiceSettings of(Function<Builder, ObjectBuilder<CustomServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the batch size used for the semantic_text field. If the field is
	 * not provided, the default is 10. The batch size is the maximum number of
	 * inputs in a single request to the upstream service. The chunk within the
	 * batch are controlled by the selected chunking strategy for the semantic_text
	 * field.
	 * <p>
	 * API name: {@code batch_size}
	 */
	@Nullable
	public final Integer batchSize() {
		return this.batchSize;
	}

	/**
	 * Specifies the HTTP header parameters – such as <code>Authentication</code> or
	 * <code>Content-Type</code> – that are required to access the custom service.
	 * For example:
	 * 
	 * <pre>
	 * <code>&quot;headers&quot;: {
	 *   &quot;Authorization&quot;: &quot;Bearer ${api_key}&quot;,
	 *   &quot;Content-Type&quot;: &quot;application/json;charset=utf-8&quot;
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
	 * Specifies the input type translation values that are used to replace the
	 * <code>${input_type}</code> template in the request body. For example:
	 * 
	 * <pre>
	 * <code>&quot;input_type&quot;: {
	 *   &quot;translation&quot;: {
	 *     &quot;ingest&quot;: &quot;do_ingest&quot;,
	 *     &quot;search&quot;: &quot;do_search&quot;
	 *   },
	 *   &quot;default&quot;: &quot;a_default&quot;
	 * },
	 * </code>
	 * </pre>
	 * <p>
	 * If the subsequent inference requests come from a search context, the
	 * <code>search</code> key will be used and the template will be replaced with
	 * <code>do_search</code>. If it comes from the ingest context
	 * <code>do_ingest</code> is used. If it's a different context that is not
	 * specified, the default value will be used. If no default is specified an
	 * empty string is used. <code>translation</code> can be:
	 * <ul>
	 * <li><code>classification</code></li>
	 * <li><code>clustering</code></li>
	 * <li><code>ingest</code></li>
	 * <li><code>search</code></li>
	 * </ul>
	 * <p>
	 * API name: {@code input_type}
	 */
	public final Map<CustomServiceInputType, String> inputType() {
		return this.inputType;
	}

	/**
	 * Specifies the query parameters as a list of tuples. The arrays inside the
	 * <code>query_parameters</code> must have two items, a key and a value. For
	 * example:
	 * 
	 * <pre>
	 * <code>&quot;query_parameters&quot;:[
	 *   [&quot;param_key&quot;, &quot;some_value&quot;],
	 *   [&quot;param_key&quot;, &quot;another_value&quot;],
	 *   [&quot;other_key&quot;, &quot;other_value&quot;]
	 * ]
	 * </code>
	 * </pre>
	 * <p>
	 * If the base url is <code>https://www.elastic.co</code> it results in:
	 * <code>https://www.elastic.co?param_key=some_value&amp;param_key=another_value&amp;other_key=other_value</code>.
	 * <p>
	 * API name: {@code query_parameters}
	 */
	public final List<List<String>> queryParameters() {
		return this.queryParameters;
	}

	/**
	 * Required - The request configuration object.
	 * <p>
	 * API name: {@code request}
	 */
	public final CustomRequestParams request() {
		return this.request;
	}

	/**
	 * Required - The response configuration object.
	 * <p>
	 * API name: {@code response}
	 */
	public final CustomResponseParams response() {
		return this.response;
	}

	/**
	 * Required - Specifies secret parameters, like <code>api_key</code> or
	 * <code>api_token</code>, that are required to access the custom service. For
	 * example:
	 * 
	 * <pre>
	 * <code>&quot;secret_parameters&quot;:{
	 *   &quot;api_key&quot;:&quot;&lt;api_key&gt;&quot;
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * API name: {@code secret_parameters}
	 */
	public final Map<String, String> secretParameters() {
		return this.secretParameters;
	}

	/**
	 * The URL endpoint to use for the requests.
	 * <p>
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
		return this.url;
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

		if (this.batchSize != null) {
			generator.writeKey("batch_size");
			generator.write(this.batchSize);

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
		if (ApiTypeHelper.isDefined(this.inputType)) {
			generator.writeKey("input_type");
			generator.writeStartObject();
			for (Map.Entry<CustomServiceInputType, String> item0 : this.inputType.entrySet()) {
				generator.writeKey(item0.getKey().jsonValue());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.queryParameters)) {
			generator.writeKey("query_parameters");
			generator.writeStartArray();
			for (List<String> item0 : this.queryParameters) {
				generator.writeStartArray();
				if (item0 != null) {
					for (String item1 : item0) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		generator.writeKey("response");
		this.response.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.secretParameters)) {
			generator.writeKey("secret_parameters");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.secretParameters.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.url != null) {
			generator.writeKey("url");
			generator.write(this.url);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CustomServiceSettings> {
		@Nullable
		private Integer batchSize;

		@Nullable
		private Map<String, String> headers;

		@Nullable
		private Map<CustomServiceInputType, String> inputType;

		@Nullable
		private List<List<String>> queryParameters;

		private CustomRequestParams request;

		private CustomResponseParams response;

		private Map<String, String> secretParameters;

		@Nullable
		private String url;

		public Builder() {
		}
		private Builder(CustomServiceSettings instance) {
			this.batchSize = instance.batchSize;
			this.headers = instance.headers;
			this.inputType = instance.inputType;
			this.queryParameters = instance.queryParameters;
			this.request = instance.request;
			this.response = instance.response;
			this.secretParameters = instance.secretParameters;
			this.url = instance.url;

		}
		/**
		 * Specifies the batch size used for the semantic_text field. If the field is
		 * not provided, the default is 10. The batch size is the maximum number of
		 * inputs in a single request to the upstream service. The chunk within the
		 * batch are controlled by the selected chunking strategy for the semantic_text
		 * field.
		 * <p>
		 * API name: {@code batch_size}
		 */
		public final Builder batchSize(@Nullable Integer value) {
			this.batchSize = value;
			return this;
		}

		/**
		 * Specifies the HTTP header parameters – such as <code>Authentication</code> or
		 * <code>Content-Type</code> – that are required to access the custom service.
		 * For example:
		 * 
		 * <pre>
		 * <code>&quot;headers&quot;: {
		 *   &quot;Authorization&quot;: &quot;Bearer ${api_key}&quot;,
		 *   &quot;Content-Type&quot;: &quot;application/json;charset=utf-8&quot;
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
		 * Specifies the HTTP header parameters – such as <code>Authentication</code> or
		 * <code>Content-Type</code> – that are required to access the custom service.
		 * For example:
		 * 
		 * <pre>
		 * <code>&quot;headers&quot;: {
		 *   &quot;Authorization&quot;: &quot;Bearer ${api_key}&quot;,
		 *   &quot;Content-Type&quot;: &quot;application/json;charset=utf-8&quot;
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

		/**
		 * Specifies the input type translation values that are used to replace the
		 * <code>${input_type}</code> template in the request body. For example:
		 * 
		 * <pre>
		 * <code>&quot;input_type&quot;: {
		 *   &quot;translation&quot;: {
		 *     &quot;ingest&quot;: &quot;do_ingest&quot;,
		 *     &quot;search&quot;: &quot;do_search&quot;
		 *   },
		 *   &quot;default&quot;: &quot;a_default&quot;
		 * },
		 * </code>
		 * </pre>
		 * <p>
		 * If the subsequent inference requests come from a search context, the
		 * <code>search</code> key will be used and the template will be replaced with
		 * <code>do_search</code>. If it comes from the ingest context
		 * <code>do_ingest</code> is used. If it's a different context that is not
		 * specified, the default value will be used. If no default is specified an
		 * empty string is used. <code>translation</code> can be:
		 * <ul>
		 * <li><code>classification</code></li>
		 * <li><code>clustering</code></li>
		 * <li><code>ingest</code></li>
		 * <li><code>search</code></li>
		 * </ul>
		 * <p>
		 * API name: {@code input_type}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>inputType</code>.
		 */
		public final Builder inputType(Map<CustomServiceInputType, String> map) {
			this.inputType = _mapPutAll(this.inputType, map);
			return this;
		}

		/**
		 * Specifies the input type translation values that are used to replace the
		 * <code>${input_type}</code> template in the request body. For example:
		 * 
		 * <pre>
		 * <code>&quot;input_type&quot;: {
		 *   &quot;translation&quot;: {
		 *     &quot;ingest&quot;: &quot;do_ingest&quot;,
		 *     &quot;search&quot;: &quot;do_search&quot;
		 *   },
		 *   &quot;default&quot;: &quot;a_default&quot;
		 * },
		 * </code>
		 * </pre>
		 * <p>
		 * If the subsequent inference requests come from a search context, the
		 * <code>search</code> key will be used and the template will be replaced with
		 * <code>do_search</code>. If it comes from the ingest context
		 * <code>do_ingest</code> is used. If it's a different context that is not
		 * specified, the default value will be used. If no default is specified an
		 * empty string is used. <code>translation</code> can be:
		 * <ul>
		 * <li><code>classification</code></li>
		 * <li><code>clustering</code></li>
		 * <li><code>ingest</code></li>
		 * <li><code>search</code></li>
		 * </ul>
		 * <p>
		 * API name: {@code input_type}
		 * <p>
		 * Adds an entry to <code>inputType</code>.
		 */
		public final Builder inputType(CustomServiceInputType key, String value) {
			this.inputType = _mapPut(this.inputType, key, value);
			return this;
		}

		/**
		 * Specifies the query parameters as a list of tuples. The arrays inside the
		 * <code>query_parameters</code> must have two items, a key and a value. For
		 * example:
		 * 
		 * <pre>
		 * <code>&quot;query_parameters&quot;:[
		 *   [&quot;param_key&quot;, &quot;some_value&quot;],
		 *   [&quot;param_key&quot;, &quot;another_value&quot;],
		 *   [&quot;other_key&quot;, &quot;other_value&quot;]
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * If the base url is <code>https://www.elastic.co</code> it results in:
		 * <code>https://www.elastic.co?param_key=some_value&amp;param_key=another_value&amp;other_key=other_value</code>.
		 * <p>
		 * API name: {@code query_parameters}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queryParameters</code>.
		 */
		public final Builder queryParameters(List<List<String>> list) {
			this.queryParameters = _listAddAll(this.queryParameters, list);
			return this;
		}

		/**
		 * Specifies the query parameters as a list of tuples. The arrays inside the
		 * <code>query_parameters</code> must have two items, a key and a value. For
		 * example:
		 * 
		 * <pre>
		 * <code>&quot;query_parameters&quot;:[
		 *   [&quot;param_key&quot;, &quot;some_value&quot;],
		 *   [&quot;param_key&quot;, &quot;another_value&quot;],
		 *   [&quot;other_key&quot;, &quot;other_value&quot;]
		 * ]
		 * </code>
		 * </pre>
		 * <p>
		 * If the base url is <code>https://www.elastic.co</code> it results in:
		 * <code>https://www.elastic.co?param_key=some_value&amp;param_key=another_value&amp;other_key=other_value</code>.
		 * <p>
		 * API name: {@code query_parameters}
		 * <p>
		 * Adds one or more values to <code>queryParameters</code>.
		 */
		public final Builder queryParameters(List<String> value, List<String>... values) {
			this.queryParameters = _listAdd(this.queryParameters, value, values);
			return this;
		}

		/**
		 * Required - The request configuration object.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(CustomRequestParams value) {
			this.request = value;
			return this;
		}

		/**
		 * Required - The request configuration object.
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(Function<CustomRequestParams.Builder, ObjectBuilder<CustomRequestParams>> fn) {
			return this.request(fn.apply(new CustomRequestParams.Builder()).build());
		}

		/**
		 * Required - The response configuration object.
		 * <p>
		 * API name: {@code response}
		 */
		public final Builder response(CustomResponseParams value) {
			this.response = value;
			return this;
		}

		/**
		 * Required - The response configuration object.
		 * <p>
		 * API name: {@code response}
		 */
		public final Builder response(Function<CustomResponseParams.Builder, ObjectBuilder<CustomResponseParams>> fn) {
			return this.response(fn.apply(new CustomResponseParams.Builder()).build());
		}

		/**
		 * Required - Specifies secret parameters, like <code>api_key</code> or
		 * <code>api_token</code>, that are required to access the custom service. For
		 * example:
		 * 
		 * <pre>
		 * <code>&quot;secret_parameters&quot;:{
		 *   &quot;api_key&quot;:&quot;&lt;api_key&gt;&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code secret_parameters}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>secretParameters</code>.
		 */
		public final Builder secretParameters(Map<String, String> map) {
			this.secretParameters = _mapPutAll(this.secretParameters, map);
			return this;
		}

		/**
		 * Required - Specifies secret parameters, like <code>api_key</code> or
		 * <code>api_token</code>, that are required to access the custom service. For
		 * example:
		 * 
		 * <pre>
		 * <code>&quot;secret_parameters&quot;:{
		 *   &quot;api_key&quot;:&quot;&lt;api_key&gt;&quot;
		 * }
		 * </code>
		 * </pre>
		 * <p>
		 * API name: {@code secret_parameters}
		 * <p>
		 * Adds an entry to <code>secretParameters</code>.
		 */
		public final Builder secretParameters(String key, String value) {
			this.secretParameters = _mapPut(this.secretParameters, key, value);
			return this;
		}

		/**
		 * The URL endpoint to use for the requests.
		 * <p>
		 * API name: {@code url}
		 */
		public final Builder url(@Nullable String value) {
			this.url = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomServiceSettings build() {
			_checkSingleUse();

			return new CustomServiceSettings(this);
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
	 * Json deserializer for {@link CustomServiceSettings}
	 */
	public static final JsonpDeserializer<CustomServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CustomServiceSettings::setupCustomServiceSettingsDeserializer);

	protected static void setupCustomServiceSettingsDeserializer(ObjectDeserializer<CustomServiceSettings.Builder> op) {

		op.add(Builder::batchSize, JsonpDeserializer.integerDeserializer(), "batch_size");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"headers");
		op.add(Builder::inputType, JsonpDeserializer.enumMapDeserializer(CustomServiceInputType._DESERIALIZER,
				JsonpDeserializer.stringDeserializer()), "input_type");
		op.add(Builder::queryParameters,
				JsonpDeserializer
						.arrayDeserializer(JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())),
				"query_parameters");
		op.add(Builder::request, CustomRequestParams._DESERIALIZER, "request");
		op.add(Builder::response, CustomResponseParams._DESERIALIZER, "response");
		op.add(Builder::secretParameters,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "secret_parameters");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
