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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: search_application._types.AnalyticsCollection

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application._types.AnalyticsCollection">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnalyticsCollection implements JsonpSerializable {
	private final EventDataStream eventDataStream;

	// ---------------------------------------------------------------------------------------------

	private AnalyticsCollection(Builder builder) {

		this.eventDataStream = ApiTypeHelper.requireNonNull(builder.eventDataStream, this, "eventDataStream");

	}

	public static AnalyticsCollection of(Function<Builder, ObjectBuilder<AnalyticsCollection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Data stream for the collection
	 * <p>
	 * API name: {@code event_data_stream}
	 */
	public final EventDataStream eventDataStream() {
		return this.eventDataStream;
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

		generator.writeKey("event_data_stream");
		this.eventDataStream.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyticsCollection}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AnalyticsCollection> {
		private EventDataStream eventDataStream;

		/**
		 * Required - Data stream for the collection
		 * <p>
		 * API name: {@code event_data_stream}
		 */
		public final Builder eventDataStream(EventDataStream value) {
			this.eventDataStream = value;
			return this;
		}

		/**
		 * Required - Data stream for the collection
		 * <p>
		 * API name: {@code event_data_stream}
		 */
		public final Builder eventDataStream(Function<EventDataStream.Builder, ObjectBuilder<EventDataStream>> fn) {
			return this.eventDataStream(fn.apply(new EventDataStream.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnalyticsCollection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyticsCollection build() {
			_checkSingleUse();

			return new AnalyticsCollection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyticsCollection}
	 */
	public static final JsonpDeserializer<AnalyticsCollection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnalyticsCollection::setupAnalyticsCollectionDeserializer);

	protected static void setupAnalyticsCollectionDeserializer(ObjectDeserializer<AnalyticsCollection.Builder> op) {

		op.add(Builder::eventDataStream, EventDataStream._DESERIALIZER, "event_data_stream");

	}

}
