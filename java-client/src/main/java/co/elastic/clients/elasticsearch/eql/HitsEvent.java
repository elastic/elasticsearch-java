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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: eql._types.HitsEvent

public class HitsEvent<TEvent> implements JsonpSerializable {
	private final String index;

	private final String id;

	private final TEvent source;

	private final Map<String, List<JsonData>> fields;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	private HitsEvent(Builder<TEvent> builder) {

		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
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

		if (ModelTypeHelper.isDefined(this.fields)) {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsEvent}.
	 */
	public static class Builder<TEvent> extends ObjectBuilderBase implements ObjectBuilder<HitsEvent<TEvent>> {
		private String index;

		private String id;

		private TEvent source;

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
		 * API name: {@code fields}
		 */
		public final Builder<TEvent> fields(@Nullable Map<String, List<JsonData>> value) {
			this.fields = value;
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
	 * Create a json deserializer for HitsEvent
	 */
	public static <TEvent> JsonpDeserializer<HitsEvent<TEvent>> createHitsEventDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> HitsEvent.setupHitsEventDeserializer(op, tEventDeserializer));
	};

	protected static <TEvent> void setupHitsEventDeserializer(DelegatingDeserializer<HitsEvent.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::source, tEventDeserializer, "_source");
		op.add(Builder::fields,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER)),
				"fields");

	}

}
