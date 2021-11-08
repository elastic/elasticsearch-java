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

import co.elastic.clients.elasticsearch.indices.get_mapping.IndexMappingRecord;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.DictionaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.get_mapping.Response
@JsonpDeserializable
public class GetMappingResponse extends DictionaryResponse<String, IndexMappingRecord> {
	// ---------------------------------------------------------------------------------------------

	private GetMappingResponse(Builder builder) {
		super(builder);

	}

	public static GetMappingResponse of(Function<Builder, ObjectBuilder<GetMappingResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetMappingResponse}.
	 */
	public static class Builder extends DictionaryResponse.AbstractBuilder<String, IndexMappingRecord, Builder>
			implements
				ObjectBuilder<GetMappingResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetMappingResponse build() {
			_checkSingleUse();
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetMappingResponse}
	 */
	public static final JsonpDeserializer<GetMappingResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetMappingResponse::setupGetMappingResponseDeserializer, Builder::build);

	protected static void setupGetMappingResponseDeserializer(DelegatingDeserializer<GetMappingResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				IndexMappingRecord._DESERIALIZER);

	}

}
