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

package co.elastic.clients.elasticsearch.esql;

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

// typedef: esql.test_data_source_connection.Request

/**
 * Test an ES|QL data source connection.
 * <p>
 * Tests whether the supplied data source configuration can establish a live
 * connection. The data source does not need to exist in cluster state: this
 * endpoint is intended for validating a new configuration before saving it. The
 * request body accepts the same <code>type</code> and <code>settings</code>
 * fields as the create or update data source API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#esql.test_data_source_connection.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestDataSourceConnectionRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> settings;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private TestDataSourceConnectionRequest(Builder builder) {

		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static TestDataSourceConnectionRequest of(
			Function<Builder, ObjectBuilder<TestDataSourceConnectionRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Type-specific connection and authentication settings to test. Uses the same
	 * structure as the <code>settings</code> field in the create or update data
	 * source API.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Required - The data source type to test. Must be a known, registered type
	 * such as <code>s3</code>, <code>gcs</code>, or <code>azure</code>. Unknown
	 * types return a <code>400</code> error.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
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

		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TestDataSourceConnectionRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TestDataSourceConnectionRequest> {
		@Nullable
		private Map<String, JsonData> settings;

		private String type;

		public Builder() {
		}
		private Builder(TestDataSourceConnectionRequest instance) {
			this.settings = instance.settings;
			this.type = instance.type;

		}
		/**
		 * Type-specific connection and authentication settings to test. Uses the same
		 * structure as the <code>settings</code> field in the create or update data
		 * source API.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Type-specific connection and authentication settings to test. Uses the same
		 * structure as the <code>settings</code> field in the create or update data
		 * source API.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * Required - The data source type to test. Must be a known, registered type
		 * such as <code>s3</code>, <code>gcs</code>, or <code>azure</code>. Unknown
		 * types return a <code>400</code> error.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestDataSourceConnectionRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestDataSourceConnectionRequest build() {
			_checkSingleUse();

			return new TestDataSourceConnectionRequest(this);
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
	 * Json deserializer for {@link TestDataSourceConnectionRequest}
	 */
	public static final JsonpDeserializer<TestDataSourceConnectionRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TestDataSourceConnectionRequest::setupTestDataSourceConnectionRequestDeserializer);

	protected static void setupTestDataSourceConnectionRequestDeserializer(
			ObjectDeserializer<TestDataSourceConnectionRequest.Builder> op) {

		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code esql.test_data_source_connection}".
	 */
	public static final Endpoint<TestDataSourceConnectionRequest, TestDataSourceConnectionResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/esql.test_data_source_connection",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_query/data_source/_test";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, TestDataSourceConnectionResponse._DESERIALIZER);
}
