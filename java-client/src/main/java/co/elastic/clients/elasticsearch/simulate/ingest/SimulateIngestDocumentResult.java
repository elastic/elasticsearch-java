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

package co.elastic.clients.elasticsearch.simulate.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: simulate.ingest.SimulateIngestDocumentResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#simulate.ingest.SimulateIngestDocumentResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateIngestDocumentResult implements JsonpSerializable {
	@Nullable
	private final IngestDocumentSimulation doc;

	// ---------------------------------------------------------------------------------------------

	private SimulateIngestDocumentResult(Builder builder) {

		this.doc = builder.doc;

	}

	public static SimulateIngestDocumentResult of(Function<Builder, ObjectBuilder<SimulateIngestDocumentResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public final IngestDocumentSimulation doc() {
		return this.doc;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateIngestDocumentResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SimulateIngestDocumentResult> {
		@Nullable
		private IngestDocumentSimulation doc;

		public Builder() {
		}
		private Builder(SimulateIngestDocumentResult instance) {
			this.doc = instance.doc;

		}
		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable IngestDocumentSimulation value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(
				Function<IngestDocumentSimulation.Builder, ObjectBuilder<IngestDocumentSimulation>> fn) {
			return this.doc(fn.apply(new IngestDocumentSimulation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateIngestDocumentResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIngestDocumentResult build() {
			_checkSingleUse();

			return new SimulateIngestDocumentResult(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateIngestDocumentResult}
	 */
	public static final JsonpDeserializer<SimulateIngestDocumentResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SimulateIngestDocumentResult::setupSimulateIngestDocumentResultDeserializer);

	protected static void setupSimulateIngestDocumentResultDeserializer(
			ObjectDeserializer<SimulateIngestDocumentResult.Builder> op) {

		op.add(Builder::doc, IngestDocumentSimulation._DESERIALIZER, "doc");

	}

}
