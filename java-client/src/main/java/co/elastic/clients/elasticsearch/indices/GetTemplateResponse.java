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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.endpoints.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.get_template.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/indices/get_template/IndicesGetTemplateResponse.ts#L23-L23">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTemplateResponse extends DictionaryResponse<String, TemplateMapping> {
	// ---------------------------------------------------------------------------------------------

	private GetTemplateResponse(Builder builder) {
		super(builder);

	}

	public static GetTemplateResponse of(Function<Builder, ObjectBuilder<GetTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTemplateResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, TemplateMapping, Builder>
			implements
				ObjectBuilder<GetTemplateResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTemplateResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTemplateResponse}
	 */
	public static final JsonpDeserializer<GetTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTemplateResponse::setupGetTemplateResponseDeserializer);

	protected static void setupGetTemplateResponseDeserializer(ObjectDeserializer<GetTemplateResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				TemplateMapping._DESERIALIZER);

	}

}
