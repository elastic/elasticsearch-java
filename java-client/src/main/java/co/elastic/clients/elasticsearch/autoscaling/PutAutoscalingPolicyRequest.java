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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
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

	private final AutoscalingPolicy value;

	// ---------------------------------------------------------------------------------------------

	public PutAutoscalingPolicyRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.value = Objects.requireNonNull(builder.value, "value");

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
	 * API name: {@code value}
	 */
	public AutoscalingPolicy value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoscalingPolicyRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutAutoscalingPolicyRequest> {
		private String name;

		private AutoscalingPolicy value;

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
		 * API name: {@code value}
		 */
		public Builder value(AutoscalingPolicy value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Function<AutoscalingPolicy.Builder, ObjectBuilder<AutoscalingPolicy>> fn) {
			return this.value(fn.apply(new AutoscalingPolicy.Builder()).build());
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAutoscalingPolicyRequest}
	 */
	public static final JsonpDeserializer<PutAutoscalingPolicyRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, PutAutoscalingPolicyRequest::setupPutAutoscalingPolicyRequestDeserializer, Builder::build);

	protected static void setupPutAutoscalingPolicyRequestDeserializer(
			DelegatingDeserializer<PutAutoscalingPolicyRequest.Builder> op) {

		op.add(Builder::value, AutoscalingPolicy._DESERIALIZER, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code autoscaling.put_autoscaling_policy}".
	 */
	public static final Endpoint<PutAutoscalingPolicyRequest, PutAutoscalingPolicyResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_autoscaling");
					buf.append("/policy");
					buf.append("/");
					buf.append(request.name);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PutAutoscalingPolicyResponse._DESERIALIZER);
}
