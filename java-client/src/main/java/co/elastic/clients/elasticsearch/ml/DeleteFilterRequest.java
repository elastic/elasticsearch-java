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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.delete_filter.Request

public final class DeleteFilterRequest extends RequestBase {
	private final String filterId;

	// ---------------------------------------------------------------------------------------------

	public DeleteFilterRequest(Builder builder) {

		this.filterId = Objects.requireNonNull(builder.filterId, "filter_id");

	}

	/**
	 * The ID of the filter to delete
	 * <p>
	 * API name: {@code filter_id}
	 */
	public String filterId() {
		return this.filterId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteFilterRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteFilterRequest> {
		private String filterId;

		/**
		 * The ID of the filter to delete
		 * <p>
		 * API name: {@code filter_id}
		 */
		public Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteFilterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteFilterRequest build() {

			return new DeleteFilterRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_filter}".
	 */
	public static final Endpoint<DeleteFilterRequest, DeleteFilterResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _filterId = 1 << 0;

				int propsSet = 0;

				propsSet |= _filterId;

				if (propsSet == (_filterId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/filters");
					buf.append("/");
					buf.append(request.filterId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, DeleteFilterResponse._DESERIALIZER);
}
