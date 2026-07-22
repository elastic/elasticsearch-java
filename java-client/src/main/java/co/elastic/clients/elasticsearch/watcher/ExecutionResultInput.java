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

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.JsonData;
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

// typedef: watcher._types.ExecutionResultInput

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultInput">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultInput implements JsonpSerializable {
	private final Map<String, JsonData> payload;

	private final ExecutionResultStatus status;

	private final InputType type;

	@Nullable
	private final ExecutionResultSearchInput search;

	@Nullable
	private final ExecutionResultHttpInput http;

	private final Map<String, ExecutionResultInput> chain;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultInput(Builder builder) {

		this.payload = ApiTypeHelper.unmodifiable(builder.payload);
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.search = builder.search;
		this.http = builder.http;
		this.chain = ApiTypeHelper.unmodifiable(builder.chain);
		this.error = builder.error;

	}

	public static ExecutionResultInput of(Function<Builder, ObjectBuilder<ExecutionResultInput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code payload}
	 */
	public final Map<String, JsonData> payload() {
		return this.payload;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ExecutionResultStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final InputType type() {
		return this.type;
	}

	/**
	 * The resolved search request, present when the input is a search input.
	 * <p>
	 * API name: {@code search}
	 */
	@Nullable
	public final ExecutionResultSearchInput search() {
		return this.search;
	}

	/**
	 * The resolved HTTP request, present when the input is an HTTP input.
	 * <p>
	 * API name: {@code http}
	 */
	@Nullable
	public final ExecutionResultHttpInput http() {
		return this.http;
	}

	/**
	 * The result of each named input, present when the input is a chain input.
	 * <p>
	 * API name: {@code chain}
	 */
	public final Map<String, ExecutionResultInput> chain() {
		return this.chain;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		if (ApiTypeHelper.isDefined(this.payload)) {
			generator.writeKey("payload");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.payload.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.search != null) {
			generator.writeKey("search");
			this.search.serialize(generator, mapper);

		}
		if (this.http != null) {
			generator.writeKey("http");
			this.http.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.chain)) {
			generator.writeKey("chain");
			generator.writeStartObject();
			for (Map.Entry<String, ExecutionResultInput> item0 : this.chain.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultInput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExecutionResultInput> {
		@Nullable
		private Map<String, JsonData> payload;

		private ExecutionResultStatus status;

		private InputType type;

		@Nullable
		private ExecutionResultSearchInput search;

		@Nullable
		private ExecutionResultHttpInput http;

		@Nullable
		private Map<String, ExecutionResultInput> chain;

		@Nullable
		private ErrorCause error;

		public Builder() {
		}
		private Builder(ExecutionResultInput instance) {
			this.payload = instance.payload;
			this.status = instance.status;
			this.type = instance.type;
			this.search = instance.search;
			this.http = instance.http;
			this.chain = instance.chain;
			this.error = instance.error;

		}
		/**
		 * API name: {@code payload}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>payload</code>.
		 */
		public final Builder payload(Map<String, JsonData> map) {
			this.payload = _mapPutAll(this.payload, map);
			return this;
		}

		/**
		 * API name: {@code payload}
		 * <p>
		 * Adds an entry to <code>payload</code>.
		 */
		public final Builder payload(String key, JsonData value) {
			this.payload = _mapPut(this.payload, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ExecutionResultStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(InputType value) {
			this.type = value;
			return this;
		}

		/**
		 * The resolved search request, present when the input is a search input.
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable ExecutionResultSearchInput value) {
			this.search = value;
			return this;
		}

		/**
		 * The resolved search request, present when the input is a search input.
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(
				Function<ExecutionResultSearchInput.Builder, ObjectBuilder<ExecutionResultSearchInput>> fn) {
			return this.search(fn.apply(new ExecutionResultSearchInput.Builder()).build());
		}

		/**
		 * The resolved HTTP request, present when the input is an HTTP input.
		 * <p>
		 * API name: {@code http}
		 */
		public final Builder http(@Nullable ExecutionResultHttpInput value) {
			this.http = value;
			return this;
		}

		/**
		 * The resolved HTTP request, present when the input is an HTTP input.
		 * <p>
		 * API name: {@code http}
		 */
		public final Builder http(
				Function<ExecutionResultHttpInput.Builder, ObjectBuilder<ExecutionResultHttpInput>> fn) {
			return this.http(fn.apply(new ExecutionResultHttpInput.Builder()).build());
		}

		/**
		 * The result of each named input, present when the input is a chain input.
		 * <p>
		 * API name: {@code chain}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>chain</code>.
		 */
		public final Builder chain(Map<String, ExecutionResultInput> map) {
			this.chain = _mapPutAll(this.chain, map);
			return this;
		}

		/**
		 * The result of each named input, present when the input is a chain input.
		 * <p>
		 * API name: {@code chain}
		 * <p>
		 * Adds an entry to <code>chain</code>.
		 */
		public final Builder chain(String key, ExecutionResultInput value) {
			this.chain = _mapPut(this.chain, key, value);
			return this;
		}

		/**
		 * The result of each named input, present when the input is a chain input.
		 * <p>
		 * API name: {@code chain}
		 * <p>
		 * Adds an entry to <code>chain</code> using a builder lambda.
		 */
		public final Builder chain(String key,
				Function<ExecutionResultInput.Builder, ObjectBuilder<ExecutionResultInput>> fn) {
			return chain(key, fn.apply(new ExecutionResultInput.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultInput build() {
			_checkSingleUse();

			return new ExecutionResultInput(this);
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
	 * Json deserializer for {@link ExecutionResultInput}
	 */
	public static final JsonpDeserializer<ExecutionResultInput> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultInput::setupExecutionResultInputDeserializer);

	protected static void setupExecutionResultInputDeserializer(ObjectDeserializer<ExecutionResultInput.Builder> op) {

		op.add(Builder::payload, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "payload");
		op.add(Builder::status, ExecutionResultStatus._DESERIALIZER, "status");
		op.add(Builder::type, InputType._DESERIALIZER, "type");
		op.add(Builder::search, ExecutionResultSearchInput._DESERIALIZER, "search");
		op.add(Builder::http, ExecutionResultHttpInput._DESERIALIZER, "http");
		op.add(Builder::chain, JsonpDeserializer.stringMapDeserializer(ExecutionResultInput._DESERIALIZER), "chain");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
