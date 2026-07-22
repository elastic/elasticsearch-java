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

package co.elastic.clients.elasticsearch.watcher;

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
import java.lang.Integer;
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

// typedef: watcher._types.ExecutionResultHttpInput

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultHttpInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultHttpInput implements JsonpSerializable {
	private final HttpInputRequestResult request;

	@Nullable
	private final Integer statusCode;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultHttpInput(Builder builder) {

		this.request = ApiTypeHelper.requireNonNull(builder.request, this, "request");
		this.statusCode = builder.statusCode;

	}

	public static ExecutionResultHttpInput of(Function<Builder, ObjectBuilder<ExecutionResultHttpInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code request}
	 */
	public final HttpInputRequestResult request() {
		return this.request;
	}

	/**
	 * The HTTP status code returned by the request. It is only present when the
	 * request was executed.
	 * <p>
	 * API name: {@code status_code}
	 */
	@Nullable
	public final Integer statusCode() {
		return this.statusCode;
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

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		if (this.statusCode != null) {
			generator.writeKey("status_code");
			generator.write(this.statusCode);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultHttpInput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultHttpInput> {
		private HttpInputRequestResult request;

		@Nullable
		private Integer statusCode;

		public Builder() {
		}
		private Builder(ExecutionResultHttpInput instance) {
			this.request = instance.request;
			this.statusCode = instance.statusCode;

		}
		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(HttpInputRequestResult value) {
			this.request = value;
			return this;
		}

		/**
		 * Required - API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestResult.Builder, ObjectBuilder<HttpInputRequestResult>> fn) {
			return this.request(fn.apply(new HttpInputRequestResult.Builder()).build());
		}

		/**
		 * The HTTP status code returned by the request. It is only present when the
		 * request was executed.
		 * <p>
		 * API name: {@code status_code}
		 */
		public final Builder statusCode(@Nullable Integer value) {
			this.statusCode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultHttpInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultHttpInput build() {
			_checkSingleUse();

			return new ExecutionResultHttpInput(this);
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
	 * Json deserializer for {@link ExecutionResultHttpInput}
	 */
	public static final JsonpDeserializer<ExecutionResultHttpInput> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultHttpInput::setupExecutionResultHttpInputDeserializer);

	protected static void setupExecutionResultHttpInputDeserializer(
			ObjectDeserializer<ExecutionResultHttpInput.Builder> op) {

		op.add(Builder::request, HttpInputRequestResult._DESERIALIZER, "request");
		op.add(Builder::statusCode, JsonpDeserializer.integerDeserializer(), "status_code");

	}

}
