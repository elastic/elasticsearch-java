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

package co.elastic.clients.elasticsearch.synonyms;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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

// typedef: synonyms.delete_synonym.Request

/**
 * Delete a synonym set.
 * <p>
 * You can only delete a synonyms set that is not in use by any index analyzer.
 * <p>
 * Synonyms sets can be used in synonym graph token filters and synonym token
 * filters. These synonym filters can be used as part of search analyzers.
 * <p>
 * Analyzers need to be loaded when an index is restored (such as when a node
 * starts, or the index becomes open). Even if the analyzer is not used on any
 * field mapping, it still needs to be loaded on the index recovery phase.
 * <p>
 * If any analyzers cannot be loaded, the index becomes unavailable and the
 * cluster status becomes red or yellow as index shards are not available. To
 * prevent that, synonyms sets that are used in analyzers can't be deleted. A
 * delete request in this case will return a 400 response code.
 * <p>
 * To remove a synonyms set, you must first remove all indices that contain
 * analyzers using it. You can migrate an index by creating a new index that
 * does not contain the token filter with the synonyms set, and use the reindex
 * API in order to copy over the index data. Once finished, you can delete the
 * index. When the synonyms set is not used in analyzers, you will be able to
 * delete it.
 * 
 * @see <a href="../doc-files/api-spec.html#synonyms.delete_synonym.Request">API
 *      specification</a>
 */

public class DeleteSynonymRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private DeleteSynonymRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static DeleteSynonymRequest of(Function<Builder, ObjectBuilder<DeleteSynonymRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The synonyms set identifier to delete.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteSynonymRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteSynonymRequest> {
		private String id;

		/**
		 * Required - The synonyms set identifier to delete.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteSynonymRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteSynonymRequest build() {
			_checkSingleUse();

			return new DeleteSynonymRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code synonyms.delete_synonym}".
	 */
	public static final Endpoint<DeleteSynonymRequest, DeleteSynonymResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/synonyms.delete_synonym",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_synonyms");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteSynonymResponse._DESERIALIZER);
}
