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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.NamedDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
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

// typedef: eql._types.HitsEvent

/**
 *
 * @see <a href="../doc-files/api-spec.html#eql._types.HitsEvent">API
 *      specification</a>
 */
@JsonpDeserializable
public class HitsEvent<TEvent> implements JsonpSerializable {
	private final String index;

	private final String id;

	private final TEvent source;

	@Nullable
	private final Boolean missing;

	private final Map<String, List<JsonData>> fields;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	private HitsEvent(Builder<TEvent> builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.missing = builder.missing;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.tEventSerializer = builder.tEventSerializer;

	}

	public static <TEvent> HitsEvent<TEvent> of(Function<Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - Name of the index containing the event.
	 * <p>
	 * API name: {@code _index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - Unique identifier for the event. This ID is only unique within the
	 * index.
	 * <p>
	 * API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - Original JSON body passed for the event at index time.
	 * <p>
	 * API name: {@code _source}
	 */
	public final TEvent source() {
		return this.source;
	}

	/**
	 * Set to <code>true</code> for events in a timespan-constrained sequence that
	 * do not meet a given condition.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final Boolean missing() {
		return this.missing;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, List<JsonData>> fields() {
		return this.fields;
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

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_source");
		JsonpUtils.serialize(this.source, generator, tEventSerializer, mapper);

		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, List<JsonData>> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (JsonData item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsEvent}.
	 */

	public static class Builder<TEvent> extends WithJsonObjectBuilderBase<Builder<TEvent>>
			implements
				ObjectBuilder<HitsEvent<TEvent>> {
		private String index;

		private String id;

		private TEvent source;

		@Nullable
		private Boolean missing;

		@Nullable
		private Map<String, List<JsonData>> fields;

		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Required - Name of the index containing the event.
		 * <p>
		 * API name: {@code _index}
		 */
		public final Builder<TEvent> index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Unique identifier for the event. This ID is only unique within the
		 * index.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder<TEvent> id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - Original JSON body passed for the event at index time.
		 * <p>
		 * API name: {@code _source}
		 */
		public final Builder<TEvent> source(TEvent value) {
			this.source = value;
			return this;
		}

		/**
		 * Set to <code>true</code> for events in a timespan-constrained sequence that
		 * do not meet a given condition.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder<TEvent> missing(@Nullable Boolean value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder<TEvent> fields(Map<String, List<JsonData>> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder<TEvent> fields(String key, List<JsonData> value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Serializer for TEvent. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TEvent> tEventSerializer(@Nullable JsonpSerializer<TEvent> value) {
			this.tEventSerializer = value;
			return this;
		}

		@Override
		protected Builder<TEvent> self() {
			return this;
		}

		/**
		 * Builds a {@link HitsEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HitsEvent<TEvent> build() {
			_checkSingleUse();

			return new HitsEvent<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for HitsEvent
	 */
	public static <TEvent> JsonpDeserializer<HitsEvent<TEvent>> createHitsEventDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> HitsEvent.setupHitsEventDeserializer(op, tEventDeserializer));
	};

	/**
	 * Json deserializer for {@link HitsEvent} based on named deserializers provided
	 * by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<HitsEvent<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createHitsEventDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:eql._types.HitsEvent.TEvent")));

	protected static <TEvent> void setupHitsEventDeserializer(ObjectDeserializer<HitsEvent.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::source, tEventDeserializer, "_source");
		op.add(Builder::missing, JsonpDeserializer.booleanDeserializer(), "missing");
		op.add(Builder::fields,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"fields");

	}

}
