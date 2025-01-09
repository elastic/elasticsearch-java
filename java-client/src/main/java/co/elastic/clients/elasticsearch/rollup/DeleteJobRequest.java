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

package co.elastic.clients.elasticsearch.rollup;

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

// typedef: rollup.delete_job.Request

/**
 * Delete a rollup job.
 * <p>
 * A job must be stopped before it can be deleted. If you attempt to delete a
 * started job, an error occurs. Similarly, if you attempt to delete a
 * nonexistent job, an exception occurs.
 * <p>
 * IMPORTANT: When you delete a job, you remove only the process that is
 * actively monitoring and rolling up data. The API does not delete any
 * previously rolled up data. This is by design; a user may wish to roll up a
 * static data set. Because the data set is static, after it has been fully
 * rolled up there is no need to keep the indexing rollup job around (as there
 * will be no new data). Thus the job can be deleted, leaving behind the rolled
 * up data for analysis. If you wish to also remove the rollup data and the
 * rollup index contains the data for only a single job, you can delete the
 * whole rollup index. If the rollup index stores data from several jobs, you
 * must issue a delete-by-query that targets the rollup job's identifier in the
 * rollup index. For example:
 * 
 * <pre>
 * <code>POST my_rollup_index/_delete_by_query
 * {
 *   &quot;query&quot;: {
 *     &quot;term&quot;: {
 *       &quot;_rollup.id&quot;: &quot;the_rollup_job_id&quot;
 *     }
 *   }
 * }
 * </code>
 * </pre>
 *
 * @see <a href="../doc-files/api-spec.html#rollup.delete_job.Request">API
 *      specification</a>
 * @deprecated 8.11.0
 */
@Deprecated
public class DeleteJobRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private DeleteJobRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static DeleteJobRequest of(Function<Builder, ObjectBuilder<DeleteJobRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Identifier for the job.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteJobRequest}.
	 */
	@Deprecated
	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteJobRequest> {
		private String id;

		/**
		 * Required - Identifier for the job.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteJobRequest build() {
			_checkSingleUse();

			return new DeleteJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code rollup.delete_job}".
	 */
	public static final Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/rollup.delete_job",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_rollup");
					buf.append("/job");
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

			}, SimpleEndpoint.emptyMap(), false, DeleteJobResponse._DESERIALIZER);
}
