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

package co.elastic.clients.elasticsearch.logstash;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: logstash.get_pipeline.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#logstash.get_pipeline.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetPipelineResponse implements JsonpSerializable {
	private final Map<String, Pipeline> valueBody;

	// ---------------------------------------------------------------------------------------------

	private GetPipelineResponse(Builder builder) {

		this.valueBody = ApiTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static GetPipelineResponse of(Function<Builder, ObjectBuilder<GetPipelineResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final Map<String, Pipeline> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Pipeline> item0 : this.valueBody.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetPipelineResponse> {
		private Map<String, Pipeline> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>valueBody</code>.
		 */
		public final Builder valueBody(Map<String, Pipeline> map) {
			this.valueBody = _mapPutAll(this.valueBody, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds an entry to <code>valueBody</code>.
		 */
		public final Builder valueBody(String key, Pipeline value) {
			this.valueBody = _mapPut(this.valueBody, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 * <p>
		 * Adds an entry to <code>valueBody</code> using a builder lambda.
		 */
		public final Builder valueBody(String key, Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return valueBody(key, fn.apply(new Pipeline.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, Pipeline> value = (Map<String, Pipeline>) JsonpDeserializer
					.stringMapDeserializer(Pipeline._DESERIALIZER).deserialize(parser, mapper);
			return this.valueBody(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPipelineResponse build() {
			_checkSingleUse();

			return new GetPipelineResponse(this);
		}
	}

	public static final JsonpDeserializer<GetPipelineResponse> _DESERIALIZER = createGetPipelineResponseDeserializer();
	protected static JsonpDeserializer<GetPipelineResponse> createGetPipelineResponseDeserializer() {

		JsonpDeserializer<Map<String, Pipeline>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(Pipeline._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(),
				(parser, mapper) -> new Builder().valueBody(valueDeserializer.deserialize(parser, mapper)).build());
	}

}
