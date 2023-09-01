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

import co.elastic.clients.elasticsearch.ingest.simulate.PipelineSimulation;
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

// typedef: ingest.simulate.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest.simulate.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateResponse implements JsonpSerializable {
	private final List<PipelineSimulation> docs;

	// ---------------------------------------------------------------------------------------------

	private SimulateResponse(Builder builder) {

		this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");

	}

	public static SimulateResponse of(Function<Builder, ObjectBuilder<SimulateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final List<PipelineSimulation> docs() {
		return this.docs;
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

		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (PipelineSimulation item0 : this.docs) {
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
	 * Builder for {@link SimulateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SimulateResponse> {
		private List<PipelineSimulation> docs;

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<PipelineSimulation> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(PipelineSimulation value, PipelineSimulation... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<PipelineSimulation.Builder, ObjectBuilder<PipelineSimulation>> fn) {
			return docs(fn.apply(new PipelineSimulation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateResponse build() {
			_checkSingleUse();

			return new SimulateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateResponse}
	 */
	public static final JsonpDeserializer<SimulateResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SimulateResponse::setupSimulateResponseDeserializer);

	protected static void setupSimulateResponseDeserializer(ObjectDeserializer<SimulateResponse.Builder> op) {

		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(PipelineSimulation._DESERIALIZER), "docs");

	}

}
