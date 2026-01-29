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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Boolean;
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

// typedef: search_application.post_behavioral_analytics_event.Request

/**
 * Create a behavioral analytics collection event.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.post_behavioral_analytics_event.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostBehavioralAnalyticsEventRequest extends RequestBase implements JsonpSerializable {
	private final String collectionName;

	@Nullable
	private final Boolean debug;

	private final EventType eventType;

	private final JsonData payload;

	// ---------------------------------------------------------------------------------------------

	private PostBehavioralAnalyticsEventRequest(Builder builder) {

		this.collectionName = ApiTypeHelper.requireNonNull(builder.collectionName, this, "collectionName");
		this.debug = builder.debug;
		this.eventType = ApiTypeHelper.requireNonNull(builder.eventType, this, "eventType");
		this.payload = ApiTypeHelper.requireNonNull(builder.payload, this, "payload");

	}

	public static PostBehavioralAnalyticsEventRequest of(
			Function<Builder, ObjectBuilder<PostBehavioralAnalyticsEventRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the behavioral analytics collection.
	 * <p>
	 * API name: {@code collection_name}
	 */
	public final String collectionName() {
		return this.collectionName;
	}

	/**
	 * Whether the response type has to include more details
	 * <p>
	 * API name: {@code debug}
	 */
	@Nullable
	public final Boolean debug() {
		return this.debug;
	}

	/**
	 * Required - The analytics event type.
	 * <p>
	 * API name: {@code event_type}
	 */
	public final EventType eventType() {
		return this.eventType;
	}

	/**
	 * Required - Request body.
	 */
	public final JsonData payload() {
		return this.payload;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.payload.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostBehavioralAnalyticsEventRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostBehavioralAnalyticsEventRequest> {
		private String collectionName;

		@Nullable
		private Boolean debug;

		private EventType eventType;

		private JsonData payload;

		public Builder() {
		}
		private Builder(PostBehavioralAnalyticsEventRequest instance) {
			this.collectionName = instance.collectionName;
			this.debug = instance.debug;
			this.eventType = instance.eventType;
			this.payload = instance.payload;

		}
		/**
		 * Required - The name of the behavioral analytics collection.
		 * <p>
		 * API name: {@code collection_name}
		 */
		public final Builder collectionName(String value) {
			this.collectionName = value;
			return this;
		}

		/**
		 * Whether the response type has to include more details
		 * <p>
		 * API name: {@code debug}
		 */
		public final Builder debug(@Nullable Boolean value) {
			this.debug = value;
			return this;
		}

		/**
		 * Required - The analytics event type.
		 * <p>
		 * API name: {@code event_type}
		 */
		public final Builder eventType(EventType value) {
			this.eventType = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder payload(JsonData value) {
			this.payload = value;
			return this;
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			JsonData value = (JsonData) JsonData._DESERIALIZER.deserialize(parser, mapper);
			return this.payload(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostBehavioralAnalyticsEventRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostBehavioralAnalyticsEventRequest build() {
			_checkSingleUse();

			return new PostBehavioralAnalyticsEventRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	public static final JsonpDeserializer<PostBehavioralAnalyticsEventRequest> _DESERIALIZER = createPostBehavioralAnalyticsEventRequestDeserializer();
	protected static JsonpDeserializer<PostBehavioralAnalyticsEventRequest> createPostBehavioralAnalyticsEventRequestDeserializer() {

		JsonpDeserializer<JsonData> valueDeserializer = JsonData._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.payload(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_application.post_behavioral_analytics_event}".
	 */
	public static final Endpoint<PostBehavioralAnalyticsEventRequest, PostBehavioralAnalyticsEventResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/search_application.post_behavioral_analytics_event",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _eventType = 1 << 0;
				final int _collectionName = 1 << 1;

				int propsSet = 0;

				propsSet |= _eventType;
				propsSet |= _collectionName;

				if (propsSet == (_collectionName | _eventType)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_application");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.collectionName, buf);
					buf.append("/event");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.eventType.jsonValue(), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _eventType = 1 << 0;
				final int _collectionName = 1 << 1;

				int propsSet = 0;

				propsSet |= _eventType;
				propsSet |= _collectionName;

				if (propsSet == (_collectionName | _eventType)) {
					params.put("collectionName", request.collectionName);
					params.put("eventType", request.eventType.jsonValue());
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.debug != null) {
					params.put("debug", String.valueOf(request.debug));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PostBehavioralAnalyticsEventResponse._DESERIALIZER);
}
