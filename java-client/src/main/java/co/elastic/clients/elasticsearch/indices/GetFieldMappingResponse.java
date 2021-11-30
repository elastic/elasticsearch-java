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

import co.elastic.clients.elasticsearch.indices.get_field_mapping.TypeFieldMappings;
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

// typedef: indices.get_field_mapping.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/get_field_mapping/IndicesGetFieldMappingResponse.ts#L24-L27">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetFieldMappingResponse extends DictionaryResponse<String, TypeFieldMappings> {
	// ---------------------------------------------------------------------------------------------

	private GetFieldMappingResponse(Builder builder) {
		super(builder);

	}

	public static GetFieldMappingResponse of(Function<Builder, ObjectBuilder<GetFieldMappingResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFieldMappingResponse}.
	 */

	public static class Builder extends DictionaryResponse.AbstractBuilder<String, TypeFieldMappings, Builder>
			implements
				ObjectBuilder<GetFieldMappingResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetFieldMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFieldMappingResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetFieldMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetFieldMappingResponse}
	 */
	public static final JsonpDeserializer<GetFieldMappingResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetFieldMappingResponse::setupGetFieldMappingResponseDeserializer);

	protected static void setupGetFieldMappingResponseDeserializer(
			ObjectDeserializer<GetFieldMappingResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				TypeFieldMappings._DESERIALIZER);

	}

}
