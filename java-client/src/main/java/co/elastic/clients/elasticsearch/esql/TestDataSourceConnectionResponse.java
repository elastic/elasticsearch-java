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

import co.elastic.clients.elasticsearch.esql.test_data_source_connection.DataSourceTestStatus;
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
import java.lang.String;
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

// typedef: esql.test_data_source_connection.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#esql.test_data_source_connection.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestDataSourceConnectionResponse implements JsonpSerializable {
	private final DataSourceTestStatus status;

	@Nullable
	private final String error;

	@Nullable
	private final String message;

	// ---------------------------------------------------------------------------------------------

	private TestDataSourceConnectionResponse(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.error = builder.error;
		this.message = builder.message;

	}

	public static TestDataSourceConnectionResponse of(
			Function<Builder, ObjectBuilder<TestDataSourceConnectionResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The outcome of the connection test.
	 * <p>
	 * API name: {@code status}
	 */
	public final DataSourceTestStatus status() {
		return this.status;
	}

	/**
	 * A human-readable description of why the connection failed. Present only when
	 * <code>status</code> is <code>failure</code>.
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * Optional user-visible guidance explaining why the connection could not be
	 * tested. Present only when <code>status</code> is <code>untestable</code> and
	 * additional context is available.
	 * <p>
	 * API name: {@code message}
	 */
	@Nullable
	public final String message() {
		return this.message;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.message != null) {
			generator.writeKey("message");
			generator.write(this.message);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TestDataSourceConnectionResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TestDataSourceConnectionResponse> {
		private DataSourceTestStatus status;

		@Nullable
		private String error;

		@Nullable
		private String message;

		/**
		 * Required - The outcome of the connection test.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(DataSourceTestStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * A human-readable description of why the connection failed. Present only when
		 * <code>status</code> is <code>failure</code>.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * Optional user-visible guidance explaining why the connection could not be
		 * tested. Present only when <code>status</code> is <code>untestable</code> and
		 * additional context is available.
		 * <p>
		 * API name: {@code message}
		 */
		public final Builder message(@Nullable String value) {
			this.message = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestDataSourceConnectionResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestDataSourceConnectionResponse build() {
			_checkSingleUse();

			return new TestDataSourceConnectionResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TestDataSourceConnectionResponse}
	 */
	public static final JsonpDeserializer<TestDataSourceConnectionResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TestDataSourceConnectionResponse::setupTestDataSourceConnectionResponseDeserializer);

	protected static void setupTestDataSourceConnectionResponseDeserializer(
			ObjectDeserializer<TestDataSourceConnectionResponse.Builder> op) {

		op.add(Builder::status, DataSourceTestStatus._DESERIALIZER, "status");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");

	}

}
