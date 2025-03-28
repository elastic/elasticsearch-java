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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch.rollup.get_rollup_caps.RollupCapabilities;
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

// typedef: rollup.get_rollup_caps.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#rollup.get_rollup_caps.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRollupCapsResponse implements JsonpSerializable {
	private final Map<String, RollupCapabilities> capabilities;

	// ---------------------------------------------------------------------------------------------

	private GetRollupCapsResponse(Builder builder) {

		this.capabilities = ApiTypeHelper.unmodifiableRequired(builder.capabilities, this, "capabilities");

	}

	public static GetRollupCapsResponse of(Function<Builder, ObjectBuilder<GetRollupCapsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, RollupCapabilities> capabilities() {
		return this.capabilities;
	}

	/**
	 * Get an element of {@code capabilities}.
	 */
	public final @Nullable RollupCapabilities get(String key) {
		return this.capabilities.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, RollupCapabilities> item0 : this.capabilities.entrySet()) {
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
	 * Builder for {@link GetRollupCapsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRollupCapsResponse> {
		private Map<String, RollupCapabilities> capabilities = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>capabilities</code>.
		 */
		public final Builder capabilities(Map<String, RollupCapabilities> map) {
			this.capabilities = _mapPutAll(this.capabilities, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>capabilities</code>.
		 */
		public final Builder capabilities(String key, RollupCapabilities value) {
			this.capabilities = _mapPut(this.capabilities, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>capabilities</code> using a builder lambda.
		 */
		public final Builder capabilities(String key,
				Function<RollupCapabilities.Builder, ObjectBuilder<RollupCapabilities>> fn) {
			return capabilities(key, fn.apply(new RollupCapabilities.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, RollupCapabilities> value = (Map<String, RollupCapabilities>) JsonpDeserializer
					.stringMapDeserializer(RollupCapabilities._DESERIALIZER).deserialize(parser, mapper);
			return this.capabilities(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRollupCapsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRollupCapsResponse build() {
			_checkSingleUse();

			return new GetRollupCapsResponse(this);
		}
	}

	public static final JsonpDeserializer<GetRollupCapsResponse> _DESERIALIZER = createGetRollupCapsResponseDeserializer();
	protected static JsonpDeserializer<GetRollupCapsResponse> createGetRollupCapsResponseDeserializer() {

		JsonpDeserializer<Map<String, RollupCapabilities>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(RollupCapabilities._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.capabilities(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
