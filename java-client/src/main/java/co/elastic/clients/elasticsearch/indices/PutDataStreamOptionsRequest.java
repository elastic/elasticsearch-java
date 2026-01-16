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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: indices.put_data_stream_options.Request

/**
 * Update data stream options.
 * <p>
 * Update the data stream options of the specified data streams.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.put_data_stream_options.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDataStreamOptionsRequest extends RequestBase implements JsonpSerializable {
	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final DataStreamFailureStore failureStore;

	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutDataStreamOptionsRequest(Builder builder) {

		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.failureStore = builder.failureStore;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.timeout = builder.timeout;

	}

	public static PutDataStreamOptionsRequest of(Function<Builder, ObjectBuilder<PutDataStreamOptionsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Type of data stream that wildcard patterns can match. Supports
	 * comma-separated values, such as <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If defined, it will update the failure store configuration of every data
	 * stream resolved by the name expression.
	 * <p>
	 * API name: {@code failure_store}
	 */
	@Nullable
	public final DataStreamFailureStore failureStore() {
		return this.failureStore;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - Comma-separated list of data streams used to limit the request.
	 * Supports wildcards (<code>*</code>). To target all data streams use
	 * <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.failureStore != null) {
			generator.writeKey("failure_store");
			this.failureStore.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataStreamOptionsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutDataStreamOptionsRequest> {
		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private DataStreamFailureStore failureStore;

		@Nullable
		private Time masterTimeout;

		private List<String> name;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutDataStreamOptionsRequest instance) {
			this.expandWildcards = instance.expandWildcards;
			this.failureStore = instance.failureStore;
			this.masterTimeout = instance.masterTimeout;
			this.name = instance.name;
			this.timeout = instance.timeout;

		}
		/**
		 * Type of data stream that wildcard patterns can match. Supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of data stream that wildcard patterns can match. Supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If defined, it will update the failure store configuration of every data
		 * stream resolved by the name expression.
		 * <p>
		 * API name: {@code failure_store}
		 */
		public final Builder failureStore(@Nullable DataStreamFailureStore value) {
			this.failureStore = value;
			return this;
		}

		/**
		 * If defined, it will update the failure store configuration of every data
		 * stream resolved by the name expression.
		 * <p>
		 * API name: {@code failure_store}
		 */
		public final Builder failureStore(
				Function<DataStreamFailureStore.Builder, ObjectBuilder<DataStreamFailureStore>> fn) {
			return this.failureStore(fn.apply(new DataStreamFailureStore.Builder()).build());
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Comma-separated list of data streams used to limit the request.
		 * Supports wildcards (<code>*</code>). To target all data streams use
		 * <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams used to limit the request.
		 * Supports wildcards (<code>*</code>). To target all data streams use
		 * <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDataStreamOptionsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataStreamOptionsRequest build() {
			_checkSingleUse();

			return new PutDataStreamOptionsRequest(this);
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
	 * Json deserializer for {@link PutDataStreamOptionsRequest}
	 */
	public static final JsonpDeserializer<PutDataStreamOptionsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDataStreamOptionsRequest::setupPutDataStreamOptionsRequestDeserializer);

	protected static void setupPutDataStreamOptionsRequestDeserializer(
			ObjectDeserializer<PutDataStreamOptionsRequest.Builder> op) {

		op.add(Builder::failureStore, DataStreamFailureStore._DESERIALIZER, "failure_store");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_data_stream_options}".
	 */
	public static final Endpoint<PutDataStreamOptionsRequest, PutDataStreamOptionsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.put_data_stream_options",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_options");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutDataStreamOptionsResponse._DESERIALIZER);
}
