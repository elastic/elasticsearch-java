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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.base.DictionaryResponse;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot.get_repository.Response
@JsonpDeserializable
public final class GetRepositoryResponse extends DictionaryResponse<String, Repository> {
	// ---------------------------------------------------------------------------------------------

	public GetRepositoryResponse(Builder builder) {
		super(builder);

	}

	public GetRepositoryResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRepositoryResponse}.
	 */
	public static class Builder extends DictionaryResponse.AbstractBuilder<String, Repository, Builder>
			implements
				ObjectBuilder<GetRepositoryResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRepositoryResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRepositoryResponse build() {
			super.tKeySerializer(null);
			super.tValueSerializer(null);

			return new GetRepositoryResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRepositoryResponse}
	 */
	public static final JsonpDeserializer<GetRepositoryResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRepositoryResponse::setupGetRepositoryResponseDeserializer, Builder::build);

	protected static void setupGetRepositoryResponseDeserializer(
			DelegatingDeserializer<GetRepositoryResponse.Builder> op) {
		DictionaryResponse.setupDictionaryResponseDeserializer(op, JsonpDeserializer.stringDeserializer(),
				Repository._DESERIALIZER);

	}

}
