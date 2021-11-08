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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonData;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.promote_data_stream.Response
@JsonpDeserializable
public class PromoteDataStreamResponse implements JsonpSerializable {
	private final JsonData valueBody;

	// ---------------------------------------------------------------------------------------------

	private PromoteDataStreamResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.requireNonNull(builder.valueBody, this, "valueBody");

	}

	public static PromoteDataStreamResponse of(Function<Builder, ObjectBuilder<PromoteDataStreamResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final JsonData valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.valueBody.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PromoteDataStreamResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PromoteDataStreamResponse> {
		private JsonData valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(JsonData value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Builds a {@link PromoteDataStreamResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PromoteDataStreamResponse build() {
			_checkSingleUse();

			return new PromoteDataStreamResponse(this);
		}
	}

	public static final JsonpDeserializer<PromoteDataStreamResponse> _DESERIALIZER = createPromoteDataStreamResponseDeserializer();
	protected static JsonpDeserializer<PromoteDataStreamResponse> createPromoteDataStreamResponseDeserializer() {

		JsonpDeserializer<JsonData> valueDeserializer = JsonData._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
