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

package co.elastic.clients.elasticsearch.ingest.simulate_pipeline;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.simulate_pipeline.PipelineSimulation
public final class PipelineSimulation implements ToJsonp {
	@Nullable
	private final DocumentSimulation doc;

	@Nullable
	private final List<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation> processorResults;

	@Nullable
	private final String tag;

	@Nullable
	private final String processorType;

	@Nullable
	private final JsonValue status;

	// ---------------------------------------------------------------------------------------------

	protected PipelineSimulation(Builder builder) {

		this.doc = builder.doc;
		this.processorResults = builder.processorResults;
		this.tag = builder.tag;
		this.processorType = builder.processorType;
		this.status = builder.status;

	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public DocumentSimulation doc() {
		return this.doc;
	}

	/**
	 * API name: {@code processor_results}
	 */
	@Nullable
	public List<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation> processorResults() {
		return this.processorResults;
	}

	/**
	 * API name: {@code tag}
	 */
	@Nullable
	public String tag() {
		return this.tag;
	}

	/**
	 * API name: {@code processor_type}
	 */
	@Nullable
	public String processorType() {
		return this.processorType;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public JsonValue status() {
		return this.status;
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

		if (this.doc != null) {

			generator.writeKey("doc");
			this.doc.toJsonp(generator, mapper);

		}
		if (this.processorResults != null) {

			generator.writeKey("processor_results");
			generator.writeStartArray();
			for (co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation item0 : this.processorResults) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tag != null) {

			generator.writeKey("tag");
			generator.write(this.tag);

		}
		if (this.processorType != null) {

			generator.writeKey("processor_type");
			generator.write(this.processorType);

		}
		if (this.status != null) {

			generator.writeKey("status");
			generator.write(this.status);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineSimulation}.
	 */
	public static class Builder implements ObjectBuilder<PipelineSimulation> {
		@Nullable
		private DocumentSimulation doc;

		@Nullable
		private List<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation> processorResults;

		@Nullable
		private String tag;

		@Nullable
		private String processorType;

		@Nullable
		private JsonValue status;

		/**
		 * API name: {@code doc}
		 */
		public Builder doc(@Nullable DocumentSimulation value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public Builder doc(Function<DocumentSimulation.Builder, ObjectBuilder<DocumentSimulation>> fn) {
			return this.doc(fn.apply(new DocumentSimulation.Builder()).build());
		}

		/**
		 * API name: {@code processor_results}
		 */
		public Builder processorResults(
				@Nullable List<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation> value) {
			this.processorResults = value;
			return this;
		}

		/**
		 * API name: {@code processor_results}
		 */
		public Builder processorResults(
				co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation... value) {
			this.processorResults = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processorResults(List)}, creating the list if needed.
		 */
		public Builder addProcessorResults(
				co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation value) {
			if (this.processorResults == null) {
				this.processorResults = new ArrayList<>();
			}
			this.processorResults.add(value);
			return this;
		}

		/**
		 * Set {@link #processorResults(List)} to a singleton list.
		 */
		public Builder processorResults(
				Function<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation>> fn) {
			return this.processorResults(
					fn.apply(new co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation.Builder())
							.build());
		}

		/**
		 * Add a value to {@link #processorResults(List)}, creating the list if needed.
		 */
		public Builder addProcessorResults(
				Function<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation>> fn) {
			return this.addProcessorResults(
					fn.apply(new co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation.Builder())
							.build());
		}

		/**
		 * API name: {@code tag}
		 */
		public Builder tag(@Nullable String value) {
			this.tag = value;
			return this;
		}

		/**
		 * API name: {@code processor_type}
		 */
		public Builder processorType(@Nullable String value) {
			this.processorType = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(@Nullable JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link PipelineSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineSimulation build() {

			return new PipelineSimulation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PipelineSimulation
	 */
	public static final JsonpDeserializer<PipelineSimulation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PipelineSimulation::setupPipelineSimulationDeserializer);

	protected static void setupPipelineSimulationDeserializer(DelegatingDeserializer<PipelineSimulation.Builder> op) {

		op.add(Builder::doc, DocumentSimulation.DESERIALIZER, "doc");
		op.add(Builder::processorResults,
				JsonpDeserializer.arrayDeserializer(
						co.elastic.clients.elasticsearch.ingest.simulate_pipeline.PipelineSimulation.DESERIALIZER),
				"processor_results");
		op.add(Builder::tag, JsonpDeserializer.stringDeserializer(), "tag");
		op.add(Builder::processorType, JsonpDeserializer.stringDeserializer(), "processor_type");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");

	}

}
