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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.PipelineProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.PipelineProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class PipelineProcessor extends ProcessorBase implements ProcessorVariant {
	private final String name;

	@Nullable
	private final Boolean ignoreMissingPipeline;

	// ---------------------------------------------------------------------------------------------

	private PipelineProcessor(Builder builder) {
		super(builder);

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.ignoreMissingPipeline = builder.ignoreMissingPipeline;

	}

	public static PipelineProcessor of(Function<Builder, ObjectBuilder<PipelineProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Pipeline;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code ignore_missing_pipeline}
	 */
	@Nullable
	public final Boolean ignoreMissingPipeline() {
		return this.ignoreMissingPipeline;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("name");
		generator.write(this.name);

		if (this.ignoreMissingPipeline != null) {
			generator.writeKey("ignore_missing_pipeline");
			generator.write(this.ignoreMissingPipeline);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PipelineProcessor> {
		private String name;

		@Nullable
		private Boolean ignoreMissingPipeline;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing_pipeline}
		 */
		public final Builder ignoreMissingPipeline(@Nullable Boolean value) {
			this.ignoreMissingPipeline = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PipelineProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineProcessor build() {
			_checkSingleUse();

			return new PipelineProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineProcessor}
	 */
	public static final JsonpDeserializer<PipelineProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PipelineProcessor::setupPipelineProcessorDeserializer);

	protected static void setupPipelineProcessorDeserializer(ObjectDeserializer<PipelineProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::ignoreMissingPipeline, JsonpDeserializer.booleanDeserializer(), "ignore_missing_pipeline");

	}

}
