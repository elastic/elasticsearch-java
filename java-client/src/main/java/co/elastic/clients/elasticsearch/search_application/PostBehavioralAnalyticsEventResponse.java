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

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
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

// typedef: search_application.post_behavioral_analytics_event.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.post_behavioral_analytics_event.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostBehavioralAnalyticsEventResponse implements JsonpSerializable {
	private final boolean accepted;

	@Nullable
	private final JsonData event;

	// ---------------------------------------------------------------------------------------------

	private PostBehavioralAnalyticsEventResponse(Builder builder) {

		this.accepted = ApiTypeHelper.requireNonNull(builder.accepted, this, "accepted", false);
		this.event = builder.event;

	}

	public static PostBehavioralAnalyticsEventResponse of(
			Function<Builder, ObjectBuilder<PostBehavioralAnalyticsEventResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code accepted}
	 */
	public final boolean accepted() {
		return this.accepted;
	}

	/**
	 * API name: {@code event}
	 */
	@Nullable
	public final JsonData event() {
		return this.event;
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

		generator.writeKey("accepted");
		generator.write(this.accepted);

		if (this.event != null) {
			generator.writeKey("event");
			this.event.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostBehavioralAnalyticsEventResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PostBehavioralAnalyticsEventResponse> {
		private Boolean accepted;

		@Nullable
		private JsonData event;

		/**
		 * Required - API name: {@code accepted}
		 */
		public final Builder accepted(boolean value) {
			this.accepted = value;
			return this;
		}

		/**
		 * API name: {@code event}
		 */
		public final Builder event(@Nullable JsonData value) {
			this.event = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostBehavioralAnalyticsEventResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostBehavioralAnalyticsEventResponse build() {
			_checkSingleUse();

			return new PostBehavioralAnalyticsEventResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostBehavioralAnalyticsEventResponse}
	 */
	public static final JsonpDeserializer<PostBehavioralAnalyticsEventResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					PostBehavioralAnalyticsEventResponse::setupPostBehavioralAnalyticsEventResponseDeserializer);

	protected static void setupPostBehavioralAnalyticsEventResponseDeserializer(
			ObjectDeserializer<PostBehavioralAnalyticsEventResponse.Builder> op) {

		op.add(Builder::accepted, JsonpDeserializer.booleanDeserializer(), "accepted");
		op.add(Builder::event, JsonData._DESERIALIZER, "event");

	}

}
