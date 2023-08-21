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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices.migrate_to_data_stream.Request

/**
 * Converts an index alias to a data stream. You must have a matching index
 * template that is data stream enabled. The alias must meet the following
 * criteria: The alias must have a write index; All indices for the alias must
 * have a <code>@timestamp</code> field mapping of a <code>date</code> or
 * <code>date_nanos</code> field type; The alias must not have any filters; The
 * alias must not use custom routing. If successful, the request removes the
 * alias and creates a data stream with the same name. The indices for the alias
 * become hidden backing indices for the stream. The write index for the alias
 * becomes the write index for the stream.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.migrate_to_data_stream.Request">API
 *      specification</a>
 */

public class MigrateToDataStreamRequest extends RequestBase {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private MigrateToDataStreamRequest(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static MigrateToDataStreamRequest of(Function<Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the index alias to convert to a data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateToDataStreamRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MigrateToDataStreamRequest> {
		private String name;

		/**
		 * Required - Name of the index alias to convert to a data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateToDataStreamRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateToDataStreamRequest build() {
			_checkSingleUse();

			return new MigrateToDataStreamRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.migrate_to_data_stream}".
	 */
	public static final Endpoint<MigrateToDataStreamRequest, MigrateToDataStreamResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.migrate_to_data_stream",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/_migrate");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
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
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, MigrateToDataStreamResponse._DESERIALIZER);
}
