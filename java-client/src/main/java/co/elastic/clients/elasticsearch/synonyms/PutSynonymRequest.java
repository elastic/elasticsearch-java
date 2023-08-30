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

package co.elastic.clients.elasticsearch.synonyms;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: synonyms.put_synonym.Request

/**
 * Creates or updates a synonym set.
 * 
 * @see <a href="../doc-files/api-spec.html#synonyms.put_synonym.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutSynonymRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	private final List<SynonymRule> synonymsSet;

	// ---------------------------------------------------------------------------------------------

	private PutSynonymRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.synonymsSet = ApiTypeHelper.unmodifiableRequired(builder.synonymsSet, this, "synonymsSet");

	}

	public static PutSynonymRequest of(Function<Builder, ObjectBuilder<PutSynonymRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The id of the synonyms set to be created or updated
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The synonym set information to update
	 * <p>
	 * API name: {@code synonyms_set}
	 */
	public final List<SynonymRule> synonymsSet() {
		return this.synonymsSet;
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

		if (ApiTypeHelper.isDefined(this.synonymsSet)) {
			generator.writeKey("synonyms_set");
			generator.writeStartArray();
			for (SynonymRule item0 : this.synonymsSet) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSynonymRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutSynonymRequest> {
		private String id;

		private List<SynonymRule> synonymsSet;

		/**
		 * Required - The id of the synonyms set to be created or updated
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The synonym set information to update
		 * <p>
		 * API name: {@code synonyms_set}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>synonymsSet</code>.
		 */
		public final Builder synonymsSet(List<SynonymRule> list) {
			this.synonymsSet = _listAddAll(this.synonymsSet, list);
			return this;
		}

		/**
		 * Required - The synonym set information to update
		 * <p>
		 * API name: {@code synonyms_set}
		 * <p>
		 * Adds one or more values to <code>synonymsSet</code>.
		 */
		public final Builder synonymsSet(SynonymRule value, SynonymRule... values) {
			this.synonymsSet = _listAdd(this.synonymsSet, value, values);
			return this;
		}

		/**
		 * Required - The synonym set information to update
		 * <p>
		 * API name: {@code synonyms_set}
		 * <p>
		 * Adds a value to <code>synonymsSet</code> using a builder lambda.
		 */
		public final Builder synonymsSet(Function<SynonymRule.Builder, ObjectBuilder<SynonymRule>> fn) {
			return synonymsSet(fn.apply(new SynonymRule.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutSynonymRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSynonymRequest build() {
			_checkSingleUse();

			return new PutSynonymRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSynonymRequest}
	 */
	public static final JsonpDeserializer<PutSynonymRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSynonymRequest::setupPutSynonymRequestDeserializer);

	protected static void setupPutSynonymRequestDeserializer(ObjectDeserializer<PutSynonymRequest.Builder> op) {

		op.add(Builder::synonymsSet, JsonpDeserializer.arrayDeserializer(SynonymRule._DESERIALIZER), "synonyms_set");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code synonyms.put_synonym}".
	 */
	public static final Endpoint<PutSynonymRequest, PutSynonymResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/synonyms.put_synonym",

			// Request method
			request -> {
				return "PUT";

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

			}, SimpleEndpoint.emptyMap(), true, PutSynonymResponse._DESERIALIZER);
}
