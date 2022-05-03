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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.get_policy.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#enrich.get_policy.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetPolicyResponse implements JsonpSerializable {
	private final List<EnrichSummary> policies;

	// ---------------------------------------------------------------------------------------------

	private GetPolicyResponse(Builder builder) {

		this.policies = ApiTypeHelper.unmodifiableRequired(builder.policies, this, "policies");

	}

	public static GetPolicyResponse of(Function<Builder, ObjectBuilder<GetPolicyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policies}
	 */
	public final List<EnrichSummary> policies() {
		return this.policies;
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

		if (ApiTypeHelper.isDefined(this.policies)) {
			generator.writeKey("policies");
			generator.writeStartArray();
			for (EnrichSummary item0 : this.policies) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPolicyResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetPolicyResponse> {
		private List<EnrichSummary> policies;

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>policies</code>.
		 */
		public final Builder policies(List<EnrichSummary> list) {
			this.policies = _listAddAll(this.policies, list);
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds one or more values to <code>policies</code>.
		 */
		public final Builder policies(EnrichSummary value, EnrichSummary... values) {
			this.policies = _listAdd(this.policies, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code policies}
		 * <p>
		 * Adds a value to <code>policies</code> using a builder lambda.
		 */
		public final Builder policies(Function<EnrichSummary.Builder, ObjectBuilder<EnrichSummary>> fn) {
			return policies(fn.apply(new EnrichSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPolicyResponse build() {
			_checkSingleUse();

			return new GetPolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetPolicyResponse}
	 */
	public static final JsonpDeserializer<GetPolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetPolicyResponse::setupGetPolicyResponseDeserializer);

	protected static void setupGetPolicyResponseDeserializer(ObjectDeserializer<GetPolicyResponse.Builder> op) {

		op.add(Builder::policies, JsonpDeserializer.arrayDeserializer(EnrichSummary._DESERIALIZER), "policies");

	}

}
