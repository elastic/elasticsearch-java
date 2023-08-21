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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.upgrade_transforms.Request

/**
 * Upgrades all transforms. This API identifies transforms that have a legacy
 * configuration format and upgrades them to the latest version. It also cleans
 * up the internal data structures that store the transform state and
 * checkpoints. The upgrade does not affect the source and destination indices.
 * The upgrade also does not affect the roles that transforms use when
 * Elasticsearch security features are enabled; the role used to read source
 * data and write to the destination index remains unchanged.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.upgrade_transforms.Request">API
 *      specification</a>
 */

public class UpgradeTransformsRequest extends RequestBase {
	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private UpgradeTransformsRequest(Builder builder) {

		this.dryRun = builder.dryRun;
		this.timeout = builder.timeout;

	}

	public static UpgradeTransformsRequest of(Function<Builder, ObjectBuilder<UpgradeTransformsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * When true, the request checks for updates but does not run them.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpgradeTransformsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpgradeTransformsRequest> {
		@Nullable
		private Boolean dryRun;

		@Nullable
		private Time timeout;

		/**
		 * When true, the request checks for updates but does not run them.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
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
		 * Builds a {@link UpgradeTransformsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpgradeTransformsRequest build() {
			_checkSingleUse();

			return new UpgradeTransformsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.upgrade_transforms}".
	 */
	public static final Endpoint<UpgradeTransformsRequest, UpgradeTransformsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/transform.upgrade_transforms",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_transform/_upgrade";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, UpgradeTransformsResponse._DESERIALIZER);
}
