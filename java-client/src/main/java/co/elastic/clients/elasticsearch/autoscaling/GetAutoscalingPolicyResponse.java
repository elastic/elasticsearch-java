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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: autoscaling.get_autoscaling_policy.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/autoscaling/get_autoscaling_policy/GetAutoscalingPolicyResponse.ts#L22-L24">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAutoscalingPolicyResponse extends AutoscalingPolicy {
	// ---------------------------------------------------------------------------------------------

	private GetAutoscalingPolicyResponse(Builder builder) {
		super(builder);

	}

	public static GetAutoscalingPolicyResponse of(Function<Builder, ObjectBuilder<GetAutoscalingPolicyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoscalingPolicyResponse}.
	 */

	public static class Builder extends AutoscalingPolicy.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetAutoscalingPolicyResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetAutoscalingPolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoscalingPolicyResponse build() {
			_checkSingleUse();

			return new GetAutoscalingPolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAutoscalingPolicyResponse}
	 */
	public static final JsonpDeserializer<GetAutoscalingPolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAutoscalingPolicyResponse::setupGetAutoscalingPolicyResponseDeserializer);

	protected static void setupGetAutoscalingPolicyResponseDeserializer(
			ObjectDeserializer<GetAutoscalingPolicyResponse.Builder> op) {
		AutoscalingPolicy.setupAutoscalingPolicyDeserializer(op);

	}

}
