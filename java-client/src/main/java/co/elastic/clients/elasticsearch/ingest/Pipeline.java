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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.Pipeline
public final class Pipeline implements ToJsonp {
	@Nullable
	private final String description;

	@Nullable
	private final List<ProcessorContainer> onFailure;

	@Nullable
	private final List<ProcessorContainer> processors;

	@Nullable
	private final Number version;

	// ---------------------------------------------------------------------------------------------

	protected Pipeline(Builder builder) {

		this.description = builder.description;
		this.onFailure = builder.onFailure;
		this.processors = builder.processors;
		this.version = builder.version;

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
	 * Builder for {@link Pipeline}.
	 */
	public static class Builder implements ObjectBuilder<Pipeline> {
		@Nullable
		private String description;

		@Nullable
		private List<ProcessorContainer> onFailure;

		@Nullable
		private List<ProcessorContainer> processors;

		@Nullable
		private Number version;

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
		 * Builds a {@link Pipeline}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pipeline build() {

			return new Pipeline(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Pipeline
	 */
	public static final JsonpDeserializer<Pipeline> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Pipeline::setupPipelineDeserializer);

	protected static void setupPipelineDeserializer(DelegatingDeserializer<Pipeline.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::onFailure, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "on_failure");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(ProcessorContainer.DESERIALIZER), "processors");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");

	}

}
