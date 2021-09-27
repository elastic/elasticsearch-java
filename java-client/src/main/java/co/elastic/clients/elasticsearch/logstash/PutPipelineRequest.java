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

package co.elastic.clients.elasticsearch.logstash;

import co.elastic.clients.base.BooleanResponse;
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

// typedef: logstash.put_pipeline.Request
@JsonpDeserializable
public final class PutPipelineRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	private final Pipeline value;

	// ---------------------------------------------------------------------------------------------

	public PutPipelineRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * The ID of the Pipeline
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public Pipeline value() {
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
	 * Builder for {@link PutPipelineRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPipelineRequest> {
		private String id;

		private Pipeline value;

		/**
		 * The ID of the Pipeline
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Pipeline value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.value(fn.apply(new Pipeline.Builder()).build());
		}

		/**
		 * Builds a {@link PutPipelineRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPipelineRequest build() {

			return new PutPipelineRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPipelineRequest}
	 */
	public static final JsonpDeserializer<PutPipelineRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutPipelineRequest::setupPutPipelineRequestDeserializer, Builder::build);

	protected static void setupPutPipelineRequestDeserializer(DelegatingDeserializer<PutPipelineRequest.Builder> op) {

		op.add(Builder::value, Pipeline._DESERIALIZER, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code logstash.put_pipeline}".
	 */
	public static final Endpoint<PutPipelineRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new Endpoint.Boolean<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_logstash");
					buf.append("/pipeline");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, null);
}
