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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: logstash.get_pipeline.Response
public final class GetPipelineResponse implements ToJsonp {
	private final Map<String, Pipeline> value;

	// ---------------------------------------------------------------------------------------------

	protected GetPipelineResponse(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code value}
	 */
	public Map<String, Pipeline> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Pipeline> item0 : this.value.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPipelineResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetPipelineResponse> {
		private Map<String, Pipeline> value;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Map<String, Pipeline> value) {
			this.value = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #value(Map)}, creating the map if needed.
		 */
		public Builder putValue(String key, Pipeline value) {
			if (this.value == null) {
				this.value = new HashMap<>();
			}
			this.value.put(key, value);
			return this;
		}

		/**
		 * Set {@link #value(Map)} to a singleton map.
		 */
		public Builder value(String key, Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.value(Collections.singletonMap(key, fn.apply(new Pipeline.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #value(Map)}, creating the map if needed.
		 */
		public Builder putValue(String key, Function<Pipeline.Builder, ObjectBuilder<Pipeline>> fn) {
			return this.putValue(key, fn.apply(new Pipeline.Builder()).build());
		}

		/**
		 * Builds a {@link GetPipelineResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPipelineResponse build() {

			return new GetPipelineResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetPipelineResponse
	 */
	public static final JsonpDeserializer<GetPipelineResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetPipelineResponse::setupGetPipelineResponseDeserializer);

	protected static void setupGetPipelineResponseDeserializer(DelegatingDeserializer<GetPipelineResponse.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.stringMapDeserializer(Pipeline.DESERIALIZER), "value");

	}

}
