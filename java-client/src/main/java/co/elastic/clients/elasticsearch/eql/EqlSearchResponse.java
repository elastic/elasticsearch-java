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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

// typedef: eql.search.Response

public class EqlSearchResponse<TEvent> extends EqlSearchResponseBase<TEvent> {
	// ---------------------------------------------------------------------------------------------

	private EqlSearchResponse(Builder<TEvent> builder) {
		super(builder);

	}

	public static <TEvent> EqlSearchResponse<TEvent> of(
			Function<Builder<TEvent>, ObjectBuilder<EqlSearchResponse<TEvent>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlSearchResponse}.
	 */
	public static class Builder<TEvent> extends EqlSearchResponseBase.AbstractBuilder<TEvent, Builder<TEvent>>
			implements
				ObjectBuilder<EqlSearchResponse<TEvent>> {
		@Override
		protected Builder<TEvent> self() {
			return this;
		}

		/**
		 * Builds a {@link EqlSearchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlSearchResponse<TEvent> build() {
			_checkSingleUse();

			return new EqlSearchResponse<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for EqlSearchResponse
	 */
	public static <TEvent> JsonpDeserializer<EqlSearchResponse<TEvent>> createEqlSearchResponseDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> EqlSearchResponse.setupEqlSearchResponseDeserializer(op, tEventDeserializer));
	};

	protected static <TEvent> void setupEqlSearchResponseDeserializer(
			DelegatingDeserializer<EqlSearchResponse.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {
		EqlSearchResponseBase.setupEqlSearchResponseBaseDeserializer(op, tEventDeserializer);

	}

}
