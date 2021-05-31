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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlInferenceIngestProcessor
public final class MlInferenceIngestProcessor implements ToJsonp {
	private final MlInferenceIngestProcessorCount numDocsProcessed;

	private final MlCounter pipelines;

	private final MlInferenceIngestProcessorCount numFailures;

	private final MlInferenceIngestProcessorCount timeMs;

	// ---------------------------------------------------------------------------------------------

	protected MlInferenceIngestProcessor(Builder builder) {

		this.numDocsProcessed = Objects.requireNonNull(builder.numDocsProcessed, "num_docs_processed");
		this.pipelines = Objects.requireNonNull(builder.pipelines, "pipelines");
		this.numFailures = Objects.requireNonNull(builder.numFailures, "num_failures");
		this.timeMs = Objects.requireNonNull(builder.timeMs, "time_ms");

	}

	/**
	 * API name: {@code num_docs_processed}
	 */
	public MlInferenceIngestProcessorCount numDocsProcessed() {
		return this.numDocsProcessed;
	}

	/**
	 * API name: {@code pipelines}
	 */
	public MlCounter pipelines() {
		return this.pipelines;
	}

	/**
	 * API name: {@code num_failures}
	 */
	public MlInferenceIngestProcessorCount numFailures() {
		return this.numFailures;
	}

	/**
	 * API name: {@code time_ms}
	 */
	public MlInferenceIngestProcessorCount timeMs() {
		return this.timeMs;
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

		generator.writeKey("num_docs_processed");
		this.numDocsProcessed.toJsonp(generator, mapper);

		generator.writeKey("pipelines");
		this.pipelines.toJsonp(generator, mapper);

		generator.writeKey("num_failures");
		this.numFailures.toJsonp(generator, mapper);

		generator.writeKey("time_ms");
		this.timeMs.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceIngestProcessor}.
	 */
	public static class Builder implements ObjectBuilder<MlInferenceIngestProcessor> {
		private MlInferenceIngestProcessorCount numDocsProcessed;

		private MlCounter pipelines;

		private MlInferenceIngestProcessorCount numFailures;

		private MlInferenceIngestProcessorCount timeMs;

		/**
		 * API name: {@code num_docs_processed}
		 */
		public Builder numDocsProcessed(MlInferenceIngestProcessorCount value) {
			this.numDocsProcessed = value;
			return this;
		}

		/**
		 * API name: {@code num_docs_processed}
		 */
		public Builder numDocsProcessed(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.numDocsProcessed(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		/**
		 * API name: {@code pipelines}
		 */
		public Builder pipelines(MlCounter value) {
			this.pipelines = value;
			return this;
		}

		/**
		 * API name: {@code pipelines}
		 */
		public Builder pipelines(Function<MlCounter.Builder, ObjectBuilder<MlCounter>> fn) {
			return this.pipelines(fn.apply(new MlCounter.Builder()).build());
		}

		/**
		 * API name: {@code num_failures}
		 */
		public Builder numFailures(MlInferenceIngestProcessorCount value) {
			this.numFailures = value;
			return this;
		}

		/**
		 * API name: {@code num_failures}
		 */
		public Builder numFailures(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.numFailures(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		/**
		 * API name: {@code time_ms}
		 */
		public Builder timeMs(MlInferenceIngestProcessorCount value) {
			this.timeMs = value;
			return this;
		}

		/**
		 * API name: {@code time_ms}
		 */
		public Builder timeMs(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.timeMs(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		/**
		 * Builds a {@link MlInferenceIngestProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceIngestProcessor build() {

			return new MlInferenceIngestProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for MlInferenceIngestProcessor
	 */
	public static final JsonpValueParser<MlInferenceIngestProcessor> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, MlInferenceIngestProcessor::setupMlInferenceIngestProcessorParser);

	protected static void setupMlInferenceIngestProcessorParser(
			DelegatingJsonpValueParser<MlInferenceIngestProcessor.Builder> op) {

		op.add(Builder::numDocsProcessed, MlInferenceIngestProcessorCount.JSONP_PARSER, "num_docs_processed");
		op.add(Builder::pipelines, MlCounter.JSONP_PARSER, "pipelines");
		op.add(Builder::numFailures, MlInferenceIngestProcessorCount.JSONP_PARSER, "num_failures");
		op.add(Builder::timeMs, MlInferenceIngestProcessorCount.JSONP_PARSER, "time_ms");

	}

}
