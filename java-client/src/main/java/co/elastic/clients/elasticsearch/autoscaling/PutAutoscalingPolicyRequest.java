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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.put_autoscaling_policy.Request
@JsonpDeserializable
public final class PutAutoscalingPolicyRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	private final AutoscalingPolicy policy;

	// ---------------------------------------------------------------------------------------------

	public PutAutoscalingPolicyRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.policy = Objects.requireNonNull(builder.policy, "_value_body");

	}

	public PutAutoscalingPolicyRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * the name of the autoscaling policy
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public AutoscalingPolicy policy() {
		return this.policy;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.policy.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoscalingPolicyRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutAutoscalingPolicyRequest> {
		private String name;

		private AutoscalingPolicy policy;

		/**
		 * the name of the autoscaling policy
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder policy(AutoscalingPolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder policy(Function<AutoscalingPolicy.Builder, ObjectBuilder<AutoscalingPolicy>> fn) {
			return this.policy(fn.apply(new AutoscalingPolicy.Builder()).build());
		}

		/**
		 * Builds a {@link PutAutoscalingPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAutoscalingPolicyRequest build() {

			return new PutAutoscalingPolicyRequest(this);
		}
	}

	public static final JsonpDeserializer<PutAutoscalingPolicyRequest> _DESERIALIZER = createPutAutoscalingPolicyRequestDeserializer();
	protected static JsonpDeserializer<PutAutoscalingPolicyRequest> createPutAutoscalingPolicyRequestDeserializer() {

		JsonpDeserializer<AutoscalingPolicy> valueDeserializer = AutoscalingPolicy._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.policy(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code autoscaling.put_autoscaling_policy}".
	 */
	public static final Endpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_autoscaling");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutAutoscalingPolicyResponse._DESERIALIZER);
}
