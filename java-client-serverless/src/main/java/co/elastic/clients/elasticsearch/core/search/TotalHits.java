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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpDeserializerBase;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpMappingException;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.LazyDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Long;
import java.util.EnumSet;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.TotalHits

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.TotalHits">API
 *      specification</a>
 */
@JsonpDeserializable
public class TotalHits implements JsonpSerializable {
	private final TotalHitsRelation relation;

	private final long value;

	// ---------------------------------------------------------------------------------------------

	private TotalHits(Builder builder) {

		this.relation = ApiTypeHelper.requireNonNull(builder.relation, this, "relation");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static TotalHits of(Function<Builder, ObjectBuilder<TotalHits>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code relation}
	 */
	public final TotalHitsRelation relation() {
		return this.relation;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final long value() {
		return this.value;
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

		generator.writeKey("relation");
		this.relation.serialize(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalHits}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TotalHits> {
		private TotalHitsRelation relation;

		private Long value;

		/**
		 * Required - API name: {@code relation}
		 */
		public final Builder relation(TotalHitsRelation value) {
			this.relation = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TotalHits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalHits build() {
			_checkSingleUse();

			return new TotalHits(this);
		}
	}

	/**
	 * Json deserializer for {@link TotalHits}
	 */
	// Custom deserializer that can read the modern TotalHits structure and the
	// pre-7.0 single value
	public static final JsonpDeserializer<TotalHits> _DESERIALIZER = new LazyDeserializer<>(() -> {

		JsonpDeserializer<Long> longDeserializer = JsonpDeserializer.longDeserializer();
		EnumSet<JsonParser.Event> events = EnumSet.of(JsonParser.Event.START_OBJECT);
		events.addAll(longDeserializer.acceptedEvents());

		return new JsonpDeserializerBase<TotalHits>(events) {
			@Override
			public TotalHits deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {
				Builder builder = new Builder();

				if (longDeserializer.acceptedEvents().contains(event)) {
					return builder.relation(TotalHitsRelation.Eq)
							.value(longDeserializer.deserialize(parser, mapper, event)).build();
				}

				JsonpUtils.expectEvent(parser, JsonParser.Event.START_OBJECT, event);
				while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
					JsonpUtils.expectEvent(parser, JsonParser.Event.KEY_NAME, event);
					switch (parser.getString()) {
						case "relation" :
							builder.relation(TotalHitsRelation._DESERIALIZER.deserialize(parser, mapper));
							break;
						case "value" :
							builder.value(longDeserializer.deserialize(parser, mapper));
							break;
						default :
							throw new JsonpMappingException("Unknown field '" + parser.getString() + "'",
									parser.getLocation());
					}
				}
				return builder.build();
			}
		};
	});
}
