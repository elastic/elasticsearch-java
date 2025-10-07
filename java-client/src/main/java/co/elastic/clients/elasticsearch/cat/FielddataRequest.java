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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.TimeUnit;
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
import java.util.Arrays;
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

// typedef: cat.fielddata.Request

/**
 * Get field data cache information.
 * <p>
 * Get the amount of heap memory currently used by the field data cache on every
 * data node in the cluster.
 * <p>
 * IMPORTANT: cat APIs are only intended for human consumption using the command
 * line or Kibana console. They are not intended for use by applications. For
 * application consumption, use the nodes stats API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.fielddata.Request">API
 *      specification</a>
 */

public class FielddataRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	private final List<String> fields;

	private final List<String> h;

	private final List<String> s;

	@Nullable
	private final TimeUnit time;

	// ---------------------------------------------------------------------------------------------

	private FielddataRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.h = ApiTypeHelper.unmodifiable(builder.h);
		this.s = ApiTypeHelper.unmodifiable(builder.s);
		this.time = builder.time;

	}

	public static FielddataRequest of(Function<Builder, ObjectBuilder<FielddataRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Sets the units for columns that contain a byte-size value. Note that
	 * byte-size value units work in terms of powers of 1024. For instance
	 * <code>1kb</code> means 1024 bytes, not 1000 bytes. If omitted, byte-size
	 * values are rendered with a suffix such as <code>kb</code>, <code>mb</code>,
	 * or <code>gb</code>, chosen such that the numeric value of the column is as
	 * small as possible whilst still being at least <code>1.0</code>. If given,
	 * byte-size values are rendered as an integer with no suffix, representing the
	 * value of the column in the chosen unit. Values that are not an exact multiple
	 * of the chosen unit are rounded down.
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

	/**
	 * A comma-separated list of columns names to display. It supports simple
	 * wildcards.
	 * <p>
	 * API name: {@code h}
	 */
	public final List<String> h() {
		return this.h;
	}

	/**
	 * List of columns that determine how the table should be sorted. Sorting
	 * defaults to ascending and can be changed by setting <code>:asc</code> or
	 * <code>:desc</code> as a suffix to the column name.
	 * <p>
	 * API name: {@code s}
	 */
	public final List<String> s() {
		return this.s;
	}

	/**
	 * Sets the units for columns that contain a time duration. If omitted, time
	 * duration values are rendered with a suffix such as <code>ms</code>,
	 * <code>s</code>, <code>m</code> or <code>h</code>, chosen such that the
	 * numeric value of the column is as small as possible whilst still being at
	 * least <code>1.0</code>. If given, time duration values are rendered as an
	 * integer with no suffix. Values that are not an exact multiple of the chosen
	 * unit are rounded down.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
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

		@Nullable
		private List<String> h;

		@Nullable
		private List<String> s;

		@Nullable
		private TimeUnit time;

		/**
		 * Sets the units for columns that contain a byte-size value. Note that
		 * byte-size value units work in terms of powers of 1024. For instance
		 * <code>1kb</code> means 1024 bytes, not 1000 bytes. If omitted, byte-size
		 * values are rendered with a suffix such as <code>kb</code>, <code>mb</code>,
		 * or <code>gb</code>, chosen such that the numeric value of the column is as
		 * small as possible whilst still being at least <code>1.0</code>. If given,
		 * byte-size values are rendered as an integer with no suffix, representing the
		 * value of the column in the chosen unit. Values that are not an exact multiple
		 * of the chosen unit are rounded down.
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

		/**
		 * A comma-separated list of columns names to display. It supports simple
		 * wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>h</code>.
		 */
		public final Builder h(List<String> list) {
			this.h = _listAddAll(this.h, list);
			return this;
		}

		/**
		 * A comma-separated list of columns names to display. It supports simple
		 * wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds one or more values to <code>h</code>.
		 */
		public final Builder h(String value, String... values) {
			this.h = _listAdd(this.h, value, values);
			return this;
		}

		/**
		 * A comma-separated list of columns names to display. It supports simple
		 * wildcards.
		 * <p>
		 * API name: {@code h}
		 * <p>
		 * Adds one or more enum values to <code>h</code>.
		 */
		public final Builder h(CatFieldDataColumn value, CatFieldDataColumn... values) {
			this.h = _listAdd(this.h, value.jsonValue(),
					Arrays.stream(values).map(CatFieldDataColumn::jsonValue).toArray(String[]::new));
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>s</code>.
		 */
		public final Builder s(List<String> list) {
			this.s = _listAddAll(this.s, list);
			return this;
		}

		/**
		 * List of columns that determine how the table should be sorted. Sorting
		 * defaults to ascending and can be changed by setting <code>:asc</code> or
		 * <code>:desc</code> as a suffix to the column name.
		 * <p>
		 * API name: {@code s}
		 * <p>
		 * Adds one or more values to <code>s</code>.
		 */
		public final Builder s(String value, String... values) {
			this.s = _listAdd(this.s, value, values);
			return this;
		}

		/**
		 * Sets the units for columns that contain a time duration. If omitted, time
		 * duration values are rendered with a suffix such as <code>ms</code>,
		 * <code>s</code>, <code>m</code> or <code>h</code>, chosen such that the
		 * numeric value of the column is as small as possible whilst still being at
		 * least <code>1.0</code>. If given, time duration values are rendered as an
		 * integer with no suffix. Values that are not an exact multiple of the chosen
		 * unit are rounded down.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable TimeUnit value) {
			this.time = value;
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
				if (ApiTypeHelper.isDefined(request.s)) {
					params.put("s", request.s.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (ApiTypeHelper.isDefined(request.h)) {
					params.put("h", request.h.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, FielddataResponse._DESERIALIZER);
}
