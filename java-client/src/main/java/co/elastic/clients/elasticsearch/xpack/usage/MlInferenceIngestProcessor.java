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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: xpack.usage.MlInferenceIngestProcessor

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceIngestProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceIngestProcessor implements JsonpSerializable {
	private final MlInferenceIngestProcessorCount numDocsProcessed;

	private final MlCounter pipelines;

	private final MlInferenceIngestProcessorCount numFailures;

	private final MlInferenceIngestProcessorCount timeMs;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceIngestProcessor(Builder builder) {

		this.numDocsProcessed = ApiTypeHelper.requireNonNull(builder.numDocsProcessed, this, "numDocsProcessed");
		this.pipelines = ApiTypeHelper.requireNonNull(builder.pipelines, this, "pipelines");
		this.numFailures = ApiTypeHelper.requireNonNull(builder.numFailures, this, "numFailures");
		this.timeMs = ApiTypeHelper.requireNonNull(builder.timeMs, this, "timeMs");

	}

	public static MlInferenceIngestProcessor of(Function<Builder, ObjectBuilder<MlInferenceIngestProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code num_docs_processed}
	 */
	public final MlInferenceIngestProcessorCount numDocsProcessed() {
		return this.numDocsProcessed;
	}

	/**
	 * Required - API name: {@code pipelines}
	 */
	public final MlCounter pipelines() {
		return this.pipelines;
	}

	/**
	 * Required - API name: {@code num_failures}
	 */
	public final MlInferenceIngestProcessorCount numFailures() {
		return this.numFailures;
	}

	/**
	 * Required - API name: {@code time_ms}
	 */
	public final MlInferenceIngestProcessorCount timeMs() {
		return this.timeMs;
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

		generator.writeKey("num_docs_processed");
		this.numDocsProcessed.serialize(generator, mapper);

		generator.writeKey("pipelines");
		this.pipelines.serialize(generator, mapper);

		generator.writeKey("num_failures");
		this.numFailures.serialize(generator, mapper);

		generator.writeKey("time_ms");
		this.timeMs.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceIngestProcessor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceIngestProcessor> {
		private MlInferenceIngestProcessorCount numDocsProcessed;

		private MlCounter pipelines;

		private MlInferenceIngestProcessorCount numFailures;

		private MlInferenceIngestProcessorCount timeMs;

		/**
		 * Required - API name: {@code num_docs_processed}
		 */
		public final Builder numDocsProcessed(MlInferenceIngestProcessorCount value) {
			this.numDocsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_docs_processed}
		 */
		public final Builder numDocsProcessed(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.numDocsProcessed(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		/**
		 * Required - API name: {@code pipelines}
		 */
		public final Builder pipelines(MlCounter value) {
			this.pipelines = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipelines}
		 */
		public final Builder pipelines(Function<MlCounter.Builder, ObjectBuilder<MlCounter>> fn) {
			return this.pipelines(fn.apply(new MlCounter.Builder()).build());
		}

		/**
		 * Required - API name: {@code num_failures}
		 */
		public final Builder numFailures(MlInferenceIngestProcessorCount value) {
			this.numFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_failures}
		 */
		public final Builder numFailures(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.numFailures(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_ms}
		 */
		public final Builder timeMs(MlInferenceIngestProcessorCount value) {
			this.timeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_ms}
		 */
		public final Builder timeMs(
				Function<MlInferenceIngestProcessorCount.Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
			return this.timeMs(fn.apply(new MlInferenceIngestProcessorCount.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceIngestProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceIngestProcessor build() {
			_checkSingleUse();

			return new MlInferenceIngestProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceIngestProcessor}
	 */
	public static final JsonpDeserializer<MlInferenceIngestProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceIngestProcessor::setupMlInferenceIngestProcessorDeserializer);

	protected static void setupMlInferenceIngestProcessorDeserializer(
			ObjectDeserializer<MlInferenceIngestProcessor.Builder> op) {

		op.add(Builder::numDocsProcessed, MlInferenceIngestProcessorCount._DESERIALIZER, "num_docs_processed");
		op.add(Builder::pipelines, MlCounter._DESERIALIZER, "pipelines");
		op.add(Builder::numFailures, MlInferenceIngestProcessorCount._DESERIALIZER, "num_failures");
		op.add(Builder::timeMs, MlInferenceIngestProcessorCount._DESERIALIZER, "time_ms");

	}

}
