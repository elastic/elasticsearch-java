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

package co.elastic.clients.elasticsearch.ingest.simulate;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.util.List;
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

// typedef: ingest.simulate.SimulateDocumentResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.simulate.SimulateDocumentResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateDocumentResult implements JsonpSerializable {
	@Nullable
	private final DocumentSimulation doc;

	@Nullable
	private final ErrorCause error;

	private final List<PipelineSimulation> processorResults;

	// ---------------------------------------------------------------------------------------------

	private SimulateDocumentResult(Builder builder) {

		this.doc = builder.doc;
		this.error = builder.error;
		this.processorResults = ApiTypeHelper.unmodifiable(builder.processorResults);

	}

	public static SimulateDocumentResult of(Function<Builder, ObjectBuilder<SimulateDocumentResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public final DocumentSimulation doc() {
		return this.doc;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
	}

	/**
	 * API name: {@code processor_results}
	 */
	public final List<PipelineSimulation> processorResults() {
		return this.processorResults;
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

		if (this.doc != null) {
			generator.writeKey("doc");
			this.doc.serialize(generator, mapper);

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.processorResults)) {
			generator.writeKey("processor_results");
			generator.writeStartArray();
			for (PipelineSimulation item0 : this.processorResults) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateDocumentResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SimulateDocumentResult> {
		@Nullable
		private DocumentSimulation doc;

		@Nullable
		private ErrorCause error;

		@Nullable
		private List<PipelineSimulation> processorResults;

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable DocumentSimulation value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(Function<DocumentSimulation.Builder, ObjectBuilder<DocumentSimulation>> fn) {
			return this.doc(fn.apply(new DocumentSimulation.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code processor_results}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processorResults</code>.
		 */
		public final Builder processorResults(List<PipelineSimulation> list) {
			this.processorResults = _listAddAll(this.processorResults, list);
			return this;
		}

		/**
		 * API name: {@code processor_results}
		 * <p>
		 * Adds one or more values to <code>processorResults</code>.
		 */
		public final Builder processorResults(PipelineSimulation value, PipelineSimulation... values) {
			this.processorResults = _listAdd(this.processorResults, value, values);
			return this;
		}

		/**
		 * API name: {@code processor_results}
		 * <p>
		 * Adds a value to <code>processorResults</code> using a builder lambda.
		 */
		public final Builder processorResults(
				Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn) {
			return processorResults(fn.apply(new PipelineSimulation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateDocumentResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateDocumentResult build() {
			_checkSingleUse();

			return new SimulateDocumentResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateDocumentResult}
	 */
	public static final JsonpDeserializer<SimulateDocumentResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateDocumentResult::setupSimulateDocumentResultDeserializer);

	protected static void setupSimulateDocumentResultDeserializer(
			ObjectDeserializer<SimulateDocumentResult.Builder> op) {

		op.add(Builder::doc, DocumentSimulation._DESERIALIZER, "doc");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::processorResults, JsonpDeserializer.arrayDeserializer(PipelineSimulation._DESERIALIZER),
				"processor_results");

	}

}
