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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: transform.reset_transform.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.reset_transform.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResetTransformResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	private ResetTransformResponse(Builder builder) {
		super(builder);

	}

	public static ResetTransformResponse of(Function<Builder, ObjectBuilder<ResetTransformResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResetTransformResponse}.
	 */

	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ResetTransformResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResetTransformResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResetTransformResponse build() {
			_checkSingleUse();

			return new ResetTransformResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResetTransformResponse}
	 */
	public static final JsonpDeserializer<ResetTransformResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResetTransformResponse::setupResetTransformResponseDeserializer);

	protected static void setupResetTransformResponseDeserializer(
			ObjectDeserializer<ResetTransformResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
