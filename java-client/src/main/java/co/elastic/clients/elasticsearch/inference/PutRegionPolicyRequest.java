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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.lang.Boolean;
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

// typedef: inference.put_region_policy.Request

/**
 * Create or update the inference region policy.
 * <p>
 * The region policy restricts inference to a set of allowed geographic areas or
 * cloud service provider regions.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_region_policy.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRegionPolicyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean force;

	private final RegionPolicy regionPolicy;

	// ---------------------------------------------------------------------------------------------

	private PutRegionPolicyRequest(Builder builder) {

		this.force = builder.force;
		this.regionPolicy = ApiTypeHelper.requireNonNull(builder.regionPolicy, this, "regionPolicy");

	}

	public static PutRegionPolicyRequest of(Function<Builder, ObjectBuilder<PutRegionPolicyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the region policy is applied even if it would deny
	 * access to inference endpoints that are currently in use by ingest pipeline or
	 * indices.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Required - The region policy configuration.
	 * <p>
	 * API name: {@code region_policy}
	 */
	public final RegionPolicy regionPolicy() {
		return this.regionPolicy;
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

		generator.writeKey("region_policy");
		this.regionPolicy.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRegionPolicyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutRegionPolicyRequest> {
		@Nullable
		private Boolean force;

		private RegionPolicy regionPolicy;

		public Builder() {
		}
		private Builder(PutRegionPolicyRequest instance) {
			this.force = instance.force;
			this.regionPolicy = instance.regionPolicy;

		}
		/**
		 * If <code>true</code>, the region policy is applied even if it would deny
		 * access to inference endpoints that are currently in use by ingest pipeline or
		 * indices.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Required - The region policy configuration.
		 * <p>
		 * API name: {@code region_policy}
		 */
		public final Builder regionPolicy(RegionPolicy value) {
			this.regionPolicy = value;
			return this;
		}

		/**
		 * Required - The region policy configuration.
		 * <p>
		 * API name: {@code region_policy}
		 */
		public final Builder regionPolicy(Function<RegionPolicy.Builder, ObjectBuilder<RegionPolicy>> fn) {
			return this.regionPolicy(fn.apply(new RegionPolicy.Builder()).build());
		}

		/**
		 * Required - The region policy configuration.
		 * <p>
		 * API name: {@code region_policy}
		 */
		public final Builder regionPolicy(RegionPolicyVariant value) {
			this.regionPolicy = value._toRegionPolicy();
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRegionPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRegionPolicyRequest build() {
			_checkSingleUse();

			return new PutRegionPolicyRequest(this);
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
	 * Json deserializer for {@link PutRegionPolicyRequest}
	 */
	public static final JsonpDeserializer<PutRegionPolicyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRegionPolicyRequest::setupPutRegionPolicyRequestDeserializer);

	protected static void setupPutRegionPolicyRequestDeserializer(
			ObjectDeserializer<PutRegionPolicyRequest.Builder> op) {

		op.add(Builder::regionPolicy, RegionPolicy._DESERIALIZER, "region_policy");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_region_policy}".
	 */
	public static final Endpoint<PutRegionPolicyRequest, PutRegionPolicyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_region_policy",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_inference/_region_policy";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutRegionPolicyResponse._DESERIALIZER);
}
