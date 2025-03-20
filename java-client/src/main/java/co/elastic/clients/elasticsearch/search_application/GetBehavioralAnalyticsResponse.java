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

package co.elastic.clients.elasticsearch.search_application;

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

// typedef: search_application.get_behavioral_analytics.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.get_behavioral_analytics.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetBehavioralAnalyticsResponse implements JsonpSerializable {
	private final Map<String, AnalyticsCollection> analytics;

	// ---------------------------------------------------------------------------------------------

	private GetBehavioralAnalyticsResponse(Builder builder) {

		this.analytics = ApiTypeHelper.unmodifiableRequired(builder.analytics, this, "analytics");

	}

	public static GetBehavioralAnalyticsResponse of(
			Function<Builder, ObjectBuilder<GetBehavioralAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, AnalyticsCollection> analytics() {
		return this.analytics;
	}

	/**
	 * Get an element of {@code analytics}.
	 */
	public final @Nullable AnalyticsCollection get(String key) {
		return this.analytics.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, AnalyticsCollection> item0 : this.analytics.entrySet()) {
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
	 * Builder for {@link GetBehavioralAnalyticsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetBehavioralAnalyticsResponse> {
		private Map<String, AnalyticsCollection> analytics = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>analytics</code>.
		 */
		public final Builder analytics(Map<String, AnalyticsCollection> map) {
			this.analytics = _mapPutAll(this.analytics, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>analytics</code>.
		 */
		public final Builder analytics(String key, AnalyticsCollection value) {
			this.analytics = _mapPut(this.analytics, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>analytics</code> using a builder lambda.
		 */
		public final Builder analytics(String key,
				Function<AnalyticsCollection.Builder, ObjectBuilder<AnalyticsCollection>> fn) {
			return analytics(key, fn.apply(new AnalyticsCollection.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, AnalyticsCollection> value = (Map<String, AnalyticsCollection>) JsonpDeserializer
					.stringMapDeserializer(AnalyticsCollection._DESERIALIZER).deserialize(parser, mapper);
			return this.analytics(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetBehavioralAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBehavioralAnalyticsResponse build() {
			_checkSingleUse();

			return new GetBehavioralAnalyticsResponse(this);
		}
	}

	public static final JsonpDeserializer<GetBehavioralAnalyticsResponse> _DESERIALIZER = createGetBehavioralAnalyticsResponseDeserializer();
	protected static JsonpDeserializer<GetBehavioralAnalyticsResponse> createGetBehavioralAnalyticsResponseDeserializer() {

		JsonpDeserializer<Map<String, AnalyticsCollection>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(AnalyticsCollection._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.analytics(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
