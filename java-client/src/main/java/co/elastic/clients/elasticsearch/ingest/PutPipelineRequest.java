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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.put_pipeline.Request
public final class PutPipelineRequest extends RequestBase implements ToJsonp {
	private final String id;

	@Nullable
	private final JsonValue masterTimeout;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final String description;

	@Nullable
	private final List<ProcessorContainer> onFailure;

	@Nullable
	private final List<ProcessorContainer> processors;

	@Nullable
	private final Number version;

	// ---------------------------------------------------------------------------------------------

	protected PutPipelineRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.description = builder.description;
		this.onFailure = builder.onFailure;
		this.processors = builder.processors;
		this.version = builder.version;

	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public JsonValue masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code on_failure}
	 */
	@Nullable
	public List<ProcessorContainer> onFailure() {
		return this.onFailure;
	}

	/**
	 * API name: {@code processors}
	 */
	@Nullable
	public List<ProcessorContainer> processors() {
		return this.processors;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.onFailure != null) {

			generator.writeKey("on_failure");
			generator.writeStartArray();
			for (ProcessorContainer item0 : this.onFailure) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.processors != null) {

			generator.writeKey("processors");
			generator.writeStartArray();
			for (ProcessorContainer item0 : this.processors) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPipelineRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPipelineRequest> {
		private String id;

		@Nullable
		private JsonValue masterTimeout;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private String description;

		@Nullable
		private List<ProcessorContainer> onFailure;

		@Nullable
		private List<ProcessorContainer> processors;

		@Nullable
		private Number version;

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable JsonValue value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public Builder onFailure(@Nullable List<ProcessorContainer> value) {
			this.onFailure = value;
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public Builder onFailure(ProcessorContainer... value) {
			this.onFailure = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #onFailure(List)}, creating the list if needed.
		 */
		public Builder addOnFailure(ProcessorContainer value) {
			if (this.onFailure == null) {
				this.onFailure = new ArrayList<>();
			}
			this.onFailure.add(value);
			return this;
		}

		/**
		 * Set {@link #onFailure(List)} to a singleton list.
		 */
		public Builder onFailure(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.onFailure(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #onFailure(List)}, creating the list if needed.
		 */
		public Builder addOnFailure(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.addOnFailure(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(@Nullable List<ProcessorContainer> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public Builder processors(ProcessorContainer... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(ProcessorContainer value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Set {@link #processors(List)} to a singleton list.
		 */
		public Builder processors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.processors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Function<ProcessorContainer.Builder, ObjectBuilder<ProcessorContainer>> fn) {
			return this.addProcessors(fn.apply(new ProcessorContainer.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
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
	 * Json deserializer for PutPipelineRequest
	 */
	public static final JsonpDeserializer<PutPipelineRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutPipelineRequest::setupPutPipelineRequestDeserializer);

	protected static void setupPutPipelineRequestDeserializer(DelegatingDeserializer<PutPipelineRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::onFailure, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "on_failure");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "processors");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.put_pipeline}".
	 */
	public static final Endpoint<PutPipelineRequest, PutPipelineResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/");
					buf.append(request.id);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.toString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutPipelineResponse.DESERIALIZER);
}
