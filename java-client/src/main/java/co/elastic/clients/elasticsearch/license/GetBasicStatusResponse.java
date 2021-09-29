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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: license.get_basic_status.Response
@JsonpDeserializable
public final class GetBasicStatusResponse implements JsonpSerializable {
	private final boolean eligibleToStartBasic;

	// ---------------------------------------------------------------------------------------------

	public GetBasicStatusResponse(Builder builder) {

		this.eligibleToStartBasic = Objects.requireNonNull(builder.eligibleToStartBasic, "eligible_to_start_basic");

	}

	public GetBasicStatusResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code eligible_to_start_basic}
	 */
	public boolean eligibleToStartBasic() {
		return this.eligibleToStartBasic;
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

		generator.writeKey("eligible_to_start_basic");
		generator.write(this.eligibleToStartBasic);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBasicStatusResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetBasicStatusResponse> {
		private Boolean eligibleToStartBasic;

		/**
		 * API name: {@code eligible_to_start_basic}
		 */
		public Builder eligibleToStartBasic(boolean value) {
			this.eligibleToStartBasic = value;
			return this;
		}

		/**
		 * Builds a {@link GetBasicStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBasicStatusResponse build() {

			return new GetBasicStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetBasicStatusResponse}
	 */
	public static final JsonpDeserializer<GetBasicStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetBasicStatusResponse::setupGetBasicStatusResponseDeserializer, Builder::build);

	protected static void setupGetBasicStatusResponseDeserializer(
			DelegatingDeserializer<GetBasicStatusResponse.Builder> op) {

		op.add(Builder::eligibleToStartBasic, JsonpDeserializer.booleanDeserializer(), "eligible_to_start_basic");

	}

}
