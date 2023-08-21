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

// typedef: ml.set_upgrade_mode.Request

/**
 * Sets a cluster wide upgrade_mode setting that prepares machine learning
 * indices for an upgrade. When upgrading your cluster, in some circumstances
 * you must restart your nodes and reindex your machine learning indices. In
 * those circumstances, there must be no machine learning jobs running. You can
 * close the machine learning jobs, do the upgrade, then open all the jobs
 * again. Alternatively, you can use this API to temporarily halt tasks
 * associated with the jobs and datafeeds and prevent new jobs from opening. You
 * can also use this API during upgrades that do not require you to reindex your
 * machine learning indices, though stopping jobs is not a requirement in that
 * case. You can see the current value for the upgrade_mode setting by using the
 * get machine learning info API.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.set_upgrade_mode.Request">API
 *      specification</a>
 */

public class SetUpgradeModeRequest extends RequestBase {
	@Nullable
	private final Boolean enabled;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private SetUpgradeModeRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.timeout = builder.timeout;

	}

	public static SetUpgradeModeRequest of(Function<Builder, ObjectBuilder<SetUpgradeModeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * When <code>true</code>, it enables <code>upgrade_mode</code> which
	 * temporarily halts all job and datafeed tasks and prohibits new job and
	 * datafeed tasks from starting.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * The time to wait for the request to be completed.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SetUpgradeModeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SetUpgradeModeRequest> {
		@Nullable
		private Boolean enabled;

		@Nullable
		private Time timeout;

		/**
		 * When <code>true</code>, it enables <code>upgrade_mode</code> which
		 * temporarily halts all job and datafeed tasks and prohibits new job and
		 * datafeed tasks from starting.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * The time to wait for the request to be completed.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The time to wait for the request to be completed.
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
		 * Builds a {@link SetUpgradeModeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SetUpgradeModeRequest build() {
			_checkSingleUse();

			return new SetUpgradeModeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.set_upgrade_mode}".
	 */
	public static final Endpoint<SetUpgradeModeRequest, SetUpgradeModeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.set_upgrade_mode",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/set_upgrade_mode";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.enabled != null) {
					params.put("enabled", String.valueOf(request.enabled));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SetUpgradeModeResponse._DESERIALIZER);
}
