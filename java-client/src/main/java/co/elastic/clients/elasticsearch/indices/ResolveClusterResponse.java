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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.resolve_cluster.ResolveClusterInfo;
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

// typedef: indices.resolve_cluster.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.resolve_cluster.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ResolveClusterResponse implements JsonpSerializable {
	private final Map<String, ResolveClusterInfo> result;

	// ---------------------------------------------------------------------------------------------

	private ResolveClusterResponse(Builder builder) {

		this.result = ApiTypeHelper.unmodifiableRequired(builder.result, this, "result");

	}

	public static ResolveClusterResponse of(Function<Builder, ObjectBuilder<ResolveClusterResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, ResolveClusterInfo> result() {
		return this.result;
	}

	/**
	 * Get an element of {@code result}.
	 */
	public final @Nullable ResolveClusterInfo get(String key) {
		return this.result.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, ResolveClusterInfo> item0 : this.result.entrySet()) {
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
	 * Builder for {@link ResolveClusterResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ResolveClusterResponse> {
		private Map<String, ResolveClusterInfo> result = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>result</code>.
		 */
		public final Builder result(Map<String, ResolveClusterInfo> map) {
			this.result = _mapPutAll(this.result, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>result</code>.
		 */
		public final Builder result(String key, ResolveClusterInfo value) {
			this.result = _mapPut(this.result, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>result</code> using a builder lambda.
		 */
		public final Builder result(String key,
				Function<ResolveClusterInfo.Builder, ObjectBuilder<ResolveClusterInfo>> fn) {
			return result(key, fn.apply(new ResolveClusterInfo.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, ResolveClusterInfo> value = (Map<String, ResolveClusterInfo>) JsonpDeserializer
					.stringMapDeserializer(ResolveClusterInfo._DESERIALIZER).deserialize(parser, mapper);
			return this.result(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ResolveClusterResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveClusterResponse build() {
			_checkSingleUse();

			return new ResolveClusterResponse(this);
		}
	}

	public static final JsonpDeserializer<ResolveClusterResponse> _DESERIALIZER = createResolveClusterResponseDeserializer();
	protected static JsonpDeserializer<ResolveClusterResponse> createResolveClusterResponseDeserializer() {

		JsonpDeserializer<Map<String, ResolveClusterInfo>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(ResolveClusterInfo._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.result(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
