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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
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

// typedef: migration.deprecations.Request

/**
 * Get deprecation information.
 * <p>
 * Returns information about deprecated features which are in use in the
 * cluster. The reported features include cluster, node, and index level
 * settings that will be removed or changed in the next major version. You must
 * address the reported issues before upgrading to the next major version.
 * However, no action is required when upgrading within the current major
 * version. Deprecated features remain fully supported and will continue to work
 * in the current version, and when upgrading to a newer minor or patch release
 * in the same major version. Use this API to review your usage of these
 * features and migrate away from them at your own pace, before upgrading to a
 * new major version. <blockquote>
 * <p>
 * info This API is designed for indirect use by the <a href=
 * "https://www.elastic.co/docs/deploy-manage/upgrade/prepare-to-upgrade/upgrade-assistant">Upgrade
 * Assistant</a>. We recommend learning about deprecated features using the
 * Upgrade Assistant rather than calling this API directly.
 * </p>
 * </blockquote>
 *
 * @see <a href="../doc-files/api-spec.html#migration.deprecations.Request">API
 *      specification</a>
 */

public class DeprecationsRequest extends RequestBase {
	@Nullable
	private final String index;

	// ---------------------------------------------------------------------------------------------

	private DeprecationsRequest(Builder builder) {

		this.index = builder.index;

	}

	public static DeprecationsRequest of(Function<Builder, ObjectBuilder<DeprecationsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separate list of data streams or indices to check. Wildcard (*)
	 * expressions are supported.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeprecationsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeprecationsRequest> {
		@Nullable
		private String index;

		public Builder() {
		}
		private Builder(DeprecationsRequest instance) {
			this.index = instance.index;

		}
		/**
		 * Comma-separate list of data streams or indices to check. Wildcard (*)
		 * expressions are supported.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeprecationsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeprecationsRequest build() {
			_checkSingleUse();

			return new DeprecationsRequest(this);
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
	 * Endpoint "{@code migration.deprecations}".
	 */
	public static final Endpoint<DeprecationsRequest, DeprecationsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/migration.deprecations",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_migration");
					buf.append("/deprecations");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_migration");
					buf.append("/deprecations");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeprecationsResponse._DESERIALIZER);
}
