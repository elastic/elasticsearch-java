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

// typedef: inference._types.CustomResponseParams

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.CustomResponseParams">API
 *      specification</a>
 */
@JsonpDeserializable
public class CustomResponseParams implements JsonpSerializable {
	private final JsonData jsonParser;

	// ---------------------------------------------------------------------------------------------

	private CustomResponseParams(Builder builder) {

		this.jsonParser = ApiTypeHelper.requireNonNull(builder.jsonParser, this, "jsonParser");

	}

	public static CustomResponseParams of(Function<Builder, ObjectBuilder<CustomResponseParams>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Specifies the JSON parser that is used to parse the response from
	 * the custom service. Different task types require different json_parser
	 * parameters. For example:
	 * 
	 * <pre>
	 * <code># text_embedding
	 * # For a response like this:
	 *
	 * {
	 *  &quot;object&quot;: &quot;list&quot;,
	 *  &quot;data&quot;: [
	 *      {
	 *        &quot;object&quot;: &quot;embedding&quot;,
	 *        &quot;index&quot;: 0,
	 *        &quot;embedding&quot;: [
	 *            0.014539449,
	 *            -0.015288644
	 *        ]
	 *      }
	 *  ],
	 *  &quot;model&quot;: &quot;text-embedding-ada-002-v2&quot;,
	 *  &quot;usage&quot;: {
	 *      &quot;prompt_tokens&quot;: 8,
	 *      &quot;total_tokens&quot;: 8
	 *  }
	 * }
	 *
	 * # the json_parser definition should look like this:
	 *
	 * &quot;response&quot;:{
	 *   &quot;json_parser&quot;:{
	 *     &quot;text_embeddings&quot;:&quot;$.data[*].embedding[*]&quot;
	 *   }
	 * }
	 *
	 * # sparse_embedding
	 * # For a response like this:
	 *
	 * {
	 *   &quot;request_id&quot;: &quot;75C50B5B-E79E-4930-****-F48DBB392231&quot;,
	 *   &quot;latency&quot;: 22,
	 *   &quot;usage&quot;: {
	 *      &quot;token_count&quot;: 11
	 *   },
	 *   &quot;result&quot;: {
	 *      &quot;sparse_embeddings&quot;: [
	 *         {
	 *           &quot;index&quot;: 0,
	 *           &quot;embedding&quot;: [
	 *             {
	 *               &quot;token_id&quot;: 6,
	 *               &quot;weight&quot;: 0.101
	 *             },
	 *             {
	 *               &quot;token_id&quot;: 163040,
	 *               &quot;weight&quot;: 0.28417
	 *             }
	 *           ]
	 *         }
	 *      ]
	 *   }
	 * }
	 *
	 * # the json_parser definition should look like this:
	 *
	 * &quot;response&quot;:{
	 *   &quot;json_parser&quot;:{
	 *     &quot;token_path&quot;:&quot;$.result.sparse_embeddings[*].embedding[*].token_id&quot;,
	 *     &quot;weight_path&quot;:&quot;$.result.sparse_embeddings[*].embedding[*].weight&quot;
	 *   }
	 * }
	 *
	 * # rerank
	 * # For a response like this:
	 *
	 * {
	 *   &quot;results&quot;: [
	 *     {
	 *       &quot;index&quot;: 3,
	 *       &quot;relevance_score&quot;: 0.999071,
	 *       &quot;document&quot;: &quot;abc&quot;
	 *     },
	 *     {
	 *       &quot;index&quot;: 4,
	 *       &quot;relevance_score&quot;: 0.7867867,
	 *       &quot;document&quot;: &quot;123&quot;
	 *     },
	 *     {
	 *       &quot;index&quot;: 0,
	 *       &quot;relevance_score&quot;: 0.32713068,
	 *       &quot;document&quot;: &quot;super&quot;
	 *     }
	 *   ],
	 * }
	 *
	 * # the json_parser definition should look like this:
	 *
	 * &quot;response&quot;:{
	 *   &quot;json_parser&quot;:{
	 *     &quot;reranked_index&quot;:&quot;$.result.scores[*].index&quot;,    // optional
	 *     &quot;relevance_score&quot;:&quot;$.result.scores[*].score&quot;,
	 *     &quot;document_text&quot;:&quot;xxx&quot;    // optional
	 *   }
	 * }
	 *
	 * # completion
	 * # For a response like this:
	 *
	 * {
	 *  &quot;id&quot;: &quot;chatcmpl-B9MBs8CjcvOU2jLn4n570S5qMJKcT&quot;,
	 *  &quot;object&quot;: &quot;chat.completion&quot;,
	 *  &quot;created&quot;: 1741569952,
	 *  &quot;model&quot;: &quot;gpt-4.1-2025-04-14&quot;,
	 *  &quot;choices&quot;: [
	 *    {
	 *     &quot;index&quot;: 0,
	 *     &quot;message&quot;: {
	 *       &quot;role&quot;: &quot;assistant&quot;,
	 *       &quot;content&quot;: &quot;Hello! How can I assist you today?&quot;,
	 *       &quot;refusal&quot;: null,
	 *       &quot;annotations&quot;: []
	 *     },
	 *     &quot;logprobs&quot;: null,
	 *     &quot;finish_reason&quot;: &quot;stop&quot;
	 *   }
	 *  ]
	 * }
	 *
	 * # the json_parser definition should look like this:
	 *
	 * &quot;response&quot;:{
	 *   &quot;json_parser&quot;:{
	 *     &quot;completion_result&quot;:&quot;$.choices[*].message.content&quot;
	 *   }
	 * }
	 *
	 * API name: {@code json_parser}
	 * </code>
	 * </pre>
	 */
	public final JsonData jsonParser() {
		return this.jsonParser;
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

		generator.writeKey("json_parser");
		this.jsonParser.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomResponseParams}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CustomResponseParams> {
		private JsonData jsonParser;

		public Builder() {
		}
		private Builder(CustomResponseParams instance) {
			this.jsonParser = instance.jsonParser;

		}
		/**
		 * Required - Specifies the JSON parser that is used to parse the response from
		 * the custom service. Different task types require different json_parser
		 * parameters. For example:
		 * 
		 * <pre>
		 * <code># text_embedding
		 * # For a response like this:
		 *
		 * {
		 *  &quot;object&quot;: &quot;list&quot;,
		 *  &quot;data&quot;: [
		 *      {
		 *        &quot;object&quot;: &quot;embedding&quot;,
		 *        &quot;index&quot;: 0,
		 *        &quot;embedding&quot;: [
		 *            0.014539449,
		 *            -0.015288644
		 *        ]
		 *      }
		 *  ],
		 *  &quot;model&quot;: &quot;text-embedding-ada-002-v2&quot;,
		 *  &quot;usage&quot;: {
		 *      &quot;prompt_tokens&quot;: 8,
		 *      &quot;total_tokens&quot;: 8
		 *  }
		 * }
		 *
		 * # the json_parser definition should look like this:
		 *
		 * &quot;response&quot;:{
		 *   &quot;json_parser&quot;:{
		 *     &quot;text_embeddings&quot;:&quot;$.data[*].embedding[*]&quot;
		 *   }
		 * }
		 *
		 * # sparse_embedding
		 * # For a response like this:
		 *
		 * {
		 *   &quot;request_id&quot;: &quot;75C50B5B-E79E-4930-****-F48DBB392231&quot;,
		 *   &quot;latency&quot;: 22,
		 *   &quot;usage&quot;: {
		 *      &quot;token_count&quot;: 11
		 *   },
		 *   &quot;result&quot;: {
		 *      &quot;sparse_embeddings&quot;: [
		 *         {
		 *           &quot;index&quot;: 0,
		 *           &quot;embedding&quot;: [
		 *             {
		 *               &quot;token_id&quot;: 6,
		 *               &quot;weight&quot;: 0.101
		 *             },
		 *             {
		 *               &quot;token_id&quot;: 163040,
		 *               &quot;weight&quot;: 0.28417
		 *             }
		 *           ]
		 *         }
		 *      ]
		 *   }
		 * }
		 *
		 * # the json_parser definition should look like this:
		 *
		 * &quot;response&quot;:{
		 *   &quot;json_parser&quot;:{
		 *     &quot;token_path&quot;:&quot;$.result.sparse_embeddings[*].embedding[*].token_id&quot;,
		 *     &quot;weight_path&quot;:&quot;$.result.sparse_embeddings[*].embedding[*].weight&quot;
		 *   }
		 * }
		 *
		 * # rerank
		 * # For a response like this:
		 *
		 * {
		 *   &quot;results&quot;: [
		 *     {
		 *       &quot;index&quot;: 3,
		 *       &quot;relevance_score&quot;: 0.999071,
		 *       &quot;document&quot;: &quot;abc&quot;
		 *     },
		 *     {
		 *       &quot;index&quot;: 4,
		 *       &quot;relevance_score&quot;: 0.7867867,
		 *       &quot;document&quot;: &quot;123&quot;
		 *     },
		 *     {
		 *       &quot;index&quot;: 0,
		 *       &quot;relevance_score&quot;: 0.32713068,
		 *       &quot;document&quot;: &quot;super&quot;
		 *     }
		 *   ],
		 * }
		 *
		 * # the json_parser definition should look like this:
		 *
		 * &quot;response&quot;:{
		 *   &quot;json_parser&quot;:{
		 *     &quot;reranked_index&quot;:&quot;$.result.scores[*].index&quot;,    // optional
		 *     &quot;relevance_score&quot;:&quot;$.result.scores[*].score&quot;,
		 *     &quot;document_text&quot;:&quot;xxx&quot;    // optional
		 *   }
		 * }
		 *
		 * # completion
		 * # For a response like this:
		 *
		 * {
		 *  &quot;id&quot;: &quot;chatcmpl-B9MBs8CjcvOU2jLn4n570S5qMJKcT&quot;,
		 *  &quot;object&quot;: &quot;chat.completion&quot;,
		 *  &quot;created&quot;: 1741569952,
		 *  &quot;model&quot;: &quot;gpt-4.1-2025-04-14&quot;,
		 *  &quot;choices&quot;: [
		 *    {
		 *     &quot;index&quot;: 0,
		 *     &quot;message&quot;: {
		 *       &quot;role&quot;: &quot;assistant&quot;,
		 *       &quot;content&quot;: &quot;Hello! How can I assist you today?&quot;,
		 *       &quot;refusal&quot;: null,
		 *       &quot;annotations&quot;: []
		 *     },
		 *     &quot;logprobs&quot;: null,
		 *     &quot;finish_reason&quot;: &quot;stop&quot;
		 *   }
		 *  ]
		 * }
		 *
		 * # the json_parser definition should look like this:
		 *
		 * &quot;response&quot;:{
		 *   &quot;json_parser&quot;:{
		 *     &quot;completion_result&quot;:&quot;$.choices[*].message.content&quot;
		 *   }
		 * }
		 *
		 * API name: {@code json_parser}
		 * </code>
		 * </pre>
		 */
		public final Builder jsonParser(JsonData value) {
			this.jsonParser = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CustomResponseParams}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomResponseParams build() {
			_checkSingleUse();

			return new CustomResponseParams(this);
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
	 * Json deserializer for {@link CustomResponseParams}
	 */
	public static final JsonpDeserializer<CustomResponseParams> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CustomResponseParams::setupCustomResponseParamsDeserializer);

	protected static void setupCustomResponseParamsDeserializer(ObjectDeserializer<CustomResponseParams.Builder> op) {

		op.add(Builder::jsonParser, JsonData._DESERIALIZER, "json_parser");

	}

}
