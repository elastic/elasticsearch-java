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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.fielddata.Request

/**
 * Returns the amount of heap memory currently used by the field data cache on
 * every data node in the cluster. IMPORTANT: cat APIs are only intended for
 * human consumption using the command line or Kibana console. They are not
 * intended for use by applications. For application consumption, use the nodes
 * stats API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.fielddata.Request">API
 *      specification</a>
 */

public class FielddataRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	private final List<String> fields;

	// ---------------------------------------------------------------------------------------------

	private FielddataRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static FielddataRequest of(Function<Builder, ObjectBuilder<FielddataRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unit used to display byte values.
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * Comma-separated list of fields used to limit returned information. To
	 * retrieve all fields, omit this parameter.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FielddataRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FielddataRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private List<String> fields;

		/**
		 * The unit used to display byte values.
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Comma-separated list of fields used to limit returned information. To
		 * retrieve all fields, omit this parameter.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Comma-separated list of fields used to limit returned information. To
		 * retrieve all fields, omit this parameter.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FielddataRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FielddataRequest build() {
			_checkSingleUse();

			return new FielddataRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.fielddata}".
	 */
	public static final Endpoint<FielddataRequest, FielddataResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.fielddata",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _fields = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.fields()))
					propsSet |= _fields;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/fielddata");
					return buf.toString();
				}
				if (propsSet == (_fields)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/fielddata");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.fields.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _fields = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.fields()))
					propsSet |= _fields;

				if (propsSet == 0) {
				}
				if (propsSet == (_fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, FielddataResponse._DESERIALIZER);
}
