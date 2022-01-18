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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: ingest.delete_pipeline.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest.delete_pipeline.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeletePipelineResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private DeletePipelineResponse(Builder builder) {
		super(builder);

	}

	public static DeletePipelineResponse of(Function<Builder, ObjectBuilder<DeletePipelineResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeletePipelineResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeletePipelineResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeletePipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeletePipelineResponse build() {
			_checkSingleUse();

			return new DeletePipelineResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeletePipelineResponse}
	 */
	public static final JsonpDeserializer<DeletePipelineResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeletePipelineResponse::setupDeletePipelineResponseDeserializer);

	protected static void setupDeletePipelineResponseDeserializer(
			ObjectDeserializer<DeletePipelineResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
