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

package co.elastic.clients.elasticsearch.query_rules;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
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

// typedef: query_rules.test.Request

/**
 * Creates or updates a query ruleset.
 * 
 * @see <a href="../doc-files/api-spec.html#query_rules.test.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> matchCriteria;

	private final String rulesetId;

	// ---------------------------------------------------------------------------------------------

	private TestRequest(Builder builder) {

		this.matchCriteria = ApiTypeHelper.unmodifiableRequired(builder.matchCriteria, this, "matchCriteria");
		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");

	}

	public static TestRequest of(Function<Builder, ObjectBuilder<TestRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code match_criteria}
	 */
	public final Map<String, JsonData> matchCriteria() {
		return this.matchCriteria;
	}

	/**
	 * Required - The unique identifier of the query ruleset to be created or
	 * updated
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
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

		if (ApiTypeHelper.isDefined(this.matchCriteria)) {
			generator.writeKey("match_criteria");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.matchCriteria.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TestRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<TestRequest> {
		private Map<String, JsonData> matchCriteria;

		private String rulesetId;

		/**
		 * Required - API name: {@code match_criteria}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>matchCriteria</code>.
		 */
		public final Builder matchCriteria(Map<String, JsonData> map) {
			this.matchCriteria = _mapPutAll(this.matchCriteria, map);
			return this;
		}

		/**
		 * Required - API name: {@code match_criteria}
		 * <p>
		 * Adds an entry to <code>matchCriteria</code>.
		 */
		public final Builder matchCriteria(String key, JsonData value) {
			this.matchCriteria = _mapPut(this.matchCriteria, key, value);
			return this;
		}

		/**
		 * Required - The unique identifier of the query ruleset to be created or
		 * updated
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestRequest build() {
			_checkSingleUse();

			return new TestRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TestRequest}
	 */
	public static final JsonpDeserializer<TestRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TestRequest::setupTestRequestDeserializer);

	protected static void setupTestRequestDeserializer(ObjectDeserializer<TestRequest.Builder> op) {

		op.add(Builder::matchCriteria, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"match_criteria");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code query_rules.test}".
	 */
	public static final Endpoint<TestRequest, TestResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/query_rules.test",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query_rules");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rulesetId, buf);
					buf.append("/_test");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					params.put("rulesetId", request.rulesetId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, TestResponse._DESERIALIZER);
}
