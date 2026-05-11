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

package co.elastic.clients.elasticsearch.inference;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: inference.put_custom.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#inference.put_custom.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutCustomResponse extends InferenceEndpointInfoCustom {
	// ---------------------------------------------------------------------------------------------

	private PutCustomResponse(Builder builder) {
		super(builder);

	}

	public static PutCustomResponse of(Function<Builder, ObjectBuilder<PutCustomResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutCustomResponse}.
	 */

	public static class Builder extends InferenceEndpointInfoCustom.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutCustomResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutCustomResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutCustomResponse build() {
			_checkSingleUse();

			return new PutCustomResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutCustomResponse}
	 */
	public static final JsonpDeserializer<PutCustomResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutCustomResponse::setupPutCustomResponseDeserializer);

	protected static void setupPutCustomResponseDeserializer(ObjectDeserializer<PutCustomResponse.Builder> op) {
		InferenceEndpointInfoCustom.setupInferenceEndpointInfoCustomDeserializer(op);

	}

}
