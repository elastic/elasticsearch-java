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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: ingest.get_pipeline.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest.get_pipeline.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetPipelineResponse implements JsonpSerializable {
	private final Map<String, Pipeline> pipelines;

	// ---------------------------------------------------------------------------------------------

	private GetPipelineResponse(Builder builder) {

		this.pipelines = ApiTypeHelper.unmodifiableRequired(builder.pipelines, this, "pipelines");

	}

	public static GetPipelineResponse of(Function<Builder, ObjectBuilder<GetPipelineResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, Pipeline> pipelines() {
		return this.pipelines;
	}

	/**
	 * Get an element of {@code pipelines}.
	 */
	public final @Nullable Pipeline get(String key) {
		return this.pipelines.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Pipeline> item0 : this.pipelines.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetPipelineResponse> {
		private Map<String, Pipeline> pipelines = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>pipelines</code>.
		 */
		public final Builder pipelines(Map<String, Pipeline> map) {
			this.pipelines = _mapPutAll(this.pipelines, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>pipelines</code>.
		 */
		public final Builder pipelines(String key, Pipeline value) {
			this.pipelines = _mapPut(this.pipelines, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>pipelines</code> using a builder lambda.
		 */
		public final Builder pipelines(String key, Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return pipelines(key, fn.apply(new Pipeline.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, Pipeline> value = (Map<String, Pipeline>) JsonpDeserializer
					.stringMapDeserializer(Pipeline._DESERIALIZER).deserialize(parser, mapper);
			return this.pipelines(value);
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

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.pipelines(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
