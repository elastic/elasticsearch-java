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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: license.get_basic_status.Response
@JsonpDeserializable
public class GetBasicStatusResponse implements JsonpSerializable {
	private final boolean eligibleToStartBasic;

	// ---------------------------------------------------------------------------------------------

	private GetBasicStatusResponse(Builder builder) {

		this.eligibleToStartBasic = ModelTypeHelper.requireNonNull(builder.eligibleToStartBasic, this,
				"eligibleToStartBasic");

	}

	public static GetBasicStatusResponse of(Function<Builder, ObjectBuilder<GetBasicStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code eligible_to_start_basic}
	 */
	public final boolean eligibleToStartBasic() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetBasicStatusResponse> {
		private Boolean eligibleToStartBasic;

		/**
		 * Required - API name: {@code eligible_to_start_basic}
		 */
		public final Builder eligibleToStartBasic(boolean value) {
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
			_checkSingleUse();

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
