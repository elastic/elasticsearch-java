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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search_mvt.Response
public final class SearchMvtResponse implements ToJsonp {
	private final JsonValue value;

	// ---------------------------------------------------------------------------------------------

	protected SearchMvtResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code value}
	 */
	public JsonValue value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchMvtResponse}.
	 */
	public static class Builder implements ObjectBuilder<SearchMvtResponse> {
		private JsonValue value;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(JsonValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link SearchMvtResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchMvtResponse build() {

			return new SearchMvtResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SearchMvtResponse
	 */
	public static final JsonpDeserializer<SearchMvtResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SearchMvtResponse::setupSearchMvtResponseDeserializer);

	protected static void setupSearchMvtResponseDeserializer(DelegatingDeserializer<SearchMvtResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.jsonValueDeserializer(), "value");

	}

}
