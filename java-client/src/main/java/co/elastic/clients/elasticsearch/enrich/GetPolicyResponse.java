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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.get_policy.Response
@JsonpDeserializable
public final class GetPolicyResponse implements JsonpSerializable {
	private final List<Summary> policies;

	// ---------------------------------------------------------------------------------------------

	public GetPolicyResponse(Builder builder) {

		this.policies = ModelTypeHelper.unmodifiableNonNull(builder.policies, "policies");

	}

	public GetPolicyResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code policies}
	 */
	public List<Summary> policies() {
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

		generator.writeKey("policies");
		generator.writeStartArray();
		for (Summary item0 : this.policies) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPolicyResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetPolicyResponse> {
		private List<Summary> policies;

		/**
		 * API name: {@code policies}
		 */
		public Builder policies(List<Summary> value) {
			this.policies = value;
			return this;
		}

		/**
		 * API name: {@code policies}
		 */
		public Builder policies(Summary... value) {
			this.policies = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #policies(List)}, creating the list if needed. 4
		 */
		public Builder addPolicies(Summary value) {
			if (this.policies == null) {
				this.policies = new ArrayList<>();
			}
			this.policies.add(value);
			return this;
		}

		/**
		 * Set {@link #policies(List)} to a singleton list.
		 */
		public Builder policies(Function<Summary.Builder, ObjectBuilder<Summary>> fn) {
			return this.policies(fn.apply(new Summary.Builder()).build());
		}

		/**
		 * Add a value to {@link #policies(List)}, creating the list if needed. 5
		 */
		public Builder addPolicies(Function<Summary.Builder, ObjectBuilder<Summary>> fn) {
			return this.addPolicies(fn.apply(new Summary.Builder()).build());
		}

		/**
		 * Builds a {@link GetPolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPolicyResponse build() {

			return new GetPolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetPolicyResponse}
	 */
	public static final JsonpDeserializer<GetPolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetPolicyResponse::setupGetPolicyResponseDeserializer, Builder::build);

	protected static void setupGetPolicyResponseDeserializer(DelegatingDeserializer<GetPolicyResponse.Builder> op) {

		op.add(Builder::policies, JsonpDeserializer.arrayDeserializer(Summary._DESERIALIZER), "policies");

	}

}
