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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.delete_trained_model_alias.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.delete_trained_model_alias.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class DeleteTrainedModelAliasResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private DeleteTrainedModelAliasResponse(Builder builder) {
		super(builder);

	}

	public static DeleteTrainedModelAliasResponse of(
			Function<Builder, ObjectBuilder<DeleteTrainedModelAliasResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTrainedModelAliasResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteTrainedModelAliasResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteTrainedModelAliasResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTrainedModelAliasResponse build() {
			_checkSingleUse();

			return new DeleteTrainedModelAliasResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteTrainedModelAliasResponse}
	 */
	public static final JsonpDeserializer<DeleteTrainedModelAliasResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteTrainedModelAliasResponse::setupDeleteTrainedModelAliasResponseDeserializer);

	protected static void setupDeleteTrainedModelAliasResponseDeserializer(
			ObjectDeserializer<DeleteTrainedModelAliasResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
