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

import co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity.AutoscalingDeciders;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.Response
@JsonpDeserializable
public final class GetAutoscalingCapacityResponse implements JsonpSerializable {
	private final Map<String, AutoscalingDeciders> policies;

	// ---------------------------------------------------------------------------------------------

	public GetAutoscalingCapacityResponse(Builder builder) {

		this.policies = Objects.requireNonNull(builder.policies, "policies");

	}

	/**
	 * API name: {@code policies}
	 */
	public Map<String, AutoscalingDeciders> policies() {
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
		generator.writeStartObject();
		for (Map.Entry<String, AutoscalingDeciders> item0 : this.policies.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoscalingCapacityResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetAutoscalingCapacityResponse> {
		private Map<String, AutoscalingDeciders> policies;

		/**
		 * API name: {@code policies}
		 */
		public Builder policies(Map<String, AutoscalingDeciders> value) {
			this.policies = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #policies(Map)}, creating the map if needed.
		 */
		public Builder putPolicies(String key, AutoscalingDeciders value) {
			if (this.policies == null) {
				this.policies = new HashMap<>();
			}
			this.policies.put(key, value);
			return this;
		}

		/**
		 * Set {@link #policies(Map)} to a singleton map.
		 */
		public Builder policies(String key,
				Function<AutoscalingDeciders.Builder, ObjectBuilder<AutoscalingDeciders>> fn) {
			return this.policies(Collections.singletonMap(key, fn.apply(new AutoscalingDeciders.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #policies(Map)}, creating the map if needed.
		 */
		public Builder putPolicies(String key,
				Function<AutoscalingDeciders.Builder, ObjectBuilder<AutoscalingDeciders>> fn) {
			return this.putPolicies(key, fn.apply(new AutoscalingDeciders.Builder()).build());
		}

		/**
		 * Builds a {@link GetAutoscalingCapacityResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoscalingCapacityResponse build() {

			return new GetAutoscalingCapacityResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAutoscalingCapacityResponse}
	 */
	public static final JsonpDeserializer<GetAutoscalingCapacityResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAutoscalingCapacityResponse::setupGetAutoscalingCapacityResponseDeserializer,
					Builder::build);

	protected static void setupGetAutoscalingCapacityResponseDeserializer(
			DelegatingDeserializer<GetAutoscalingCapacityResponse.Builder> op) {

		op.add(Builder::policies, JsonpDeserializer.stringMapDeserializer(AutoscalingDeciders._DESERIALIZER),
				"policies");

	}

}
