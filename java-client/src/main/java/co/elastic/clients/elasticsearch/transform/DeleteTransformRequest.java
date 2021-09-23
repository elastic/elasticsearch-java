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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform.delete_transform.Request
public final class DeleteTransformRequest extends RequestBase {
	private final String transformId;

	@Nullable
	private final Boolean force;

	// ---------------------------------------------------------------------------------------------

	public DeleteTransformRequest(Builder builder) {

		this.transformId = Objects.requireNonNull(builder.transformId, "transform_id");
		this.force = builder.force;

	}

	/**
	 * The id of the transform to delete
	 * <p>
	 * API name: {@code transform_id}
	 */
	public String transformId() {
		return this.transformId;
	}

	/**
	 * When <code>true</code>, the transform is deleted regardless of its current
	 * state. The default value is <code>false</code>, meaning that the transform
	 * must be <code>stopped</code> before it can be deleted.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public Boolean force() {
		return this.force;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTransformRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteTransformRequest> {
		private String transformId;

		@Nullable
		private Boolean force;

		/**
		 * The id of the transform to delete
		 * <p>
		 * API name: {@code transform_id}
		 */
		public Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * When <code>true</code>, the transform is deleted regardless of its current
		 * state. The default value is <code>false</code>, meaning that the transform
		 * must be <code>stopped</code> before it can be deleted.
		 * <p>
		 * API name: {@code force}
		 */
		public Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTransformRequest build() {

			return new DeleteTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.delete_transform}".
	 */
	public static final Endpoint<DeleteTransformRequest, DeleteTransformResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					buf.append(request.transformId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, DeleteTransformResponse.DESERIALIZER);
}
