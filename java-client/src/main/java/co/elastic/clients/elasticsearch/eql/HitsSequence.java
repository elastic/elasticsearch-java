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
import java.util.List;
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

// typedef: eql._types.HitsSequence

/**
 *
 * @see <a href="../doc-files/api-spec.html#eql._types.HitsSequence">API
 *      specification</a>
 */
@JsonpDeserializable
public class HitsSequence<TEvent> implements JsonpSerializable {
	private final List<HitsEvent<TEvent>> events;

	private final List<JsonData> joinKeys;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	private HitsSequence(Builder<TEvent> builder) {

		this.events = ApiTypeHelper.unmodifiableRequired(builder.events, this, "events");
		this.joinKeys = ApiTypeHelper.unmodifiable(builder.joinKeys);
		this.tEventSerializer = builder.tEventSerializer;

	}

	public static <TEvent> HitsSequence<TEvent> of(Function<Builder<TEvent>, ObjectBuilder<HitsSequence<TEvent>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - Contains events matching the query. Each object represents a
	 * matching event.
	 * <p>
	 * API name: {@code events}
	 */
	public final List<HitsEvent<TEvent>> events() {
		return this.events;
	}

	/**
	 * Shared field values used to constrain matches in the sequence. These are
	 * defined using the by keyword in the EQL query syntax.
	 * <p>
	 * API name: {@code join_keys}
	 */
	public final List<JsonData> joinKeys() {
		return this.joinKeys;
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

		if (ApiTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (HitsEvent<TEvent> item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.joinKeys)) {
			generator.writeKey("join_keys");
			generator.writeStartArray();
			for (JsonData item0 : this.joinKeys) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link HitsSequence}.
	 */

	public static class Builder<TEvent> extends WithJsonObjectBuilderBase<Builder<TEvent>>
			implements
				ObjectBuilder<HitsSequence<TEvent>> {
		private List<HitsEvent<TEvent>> events;

		@Nullable
		private List<JsonData> joinKeys;

		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Required - Contains events matching the query. Each object represents a
		 * matching event.
		 * <p>
		 * API name: {@code events}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>events</code>.
		 */
		public final Builder<TEvent> events(List<HitsEvent<TEvent>> list) {
			this.events = _listAddAll(this.events, list);
			return this;
		}

		/**
		 * Required - Contains events matching the query. Each object represents a
		 * matching event.
		 * <p>
		 * API name: {@code events}
		 * <p>
		 * Adds one or more values to <code>events</code>.
		 */
		public final Builder<TEvent> events(HitsEvent<TEvent> value, HitsEvent<TEvent>... values) {
			this.events = _listAdd(this.events, value, values);
			return this;
		}

		/**
		 * Required - Contains events matching the query. Each object represents a
		 * matching event.
		 * <p>
		 * API name: {@code events}
		 * <p>
		 * Adds a value to <code>events</code> using a builder lambda.
		 */
		public final Builder<TEvent> events(Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn) {
			return events(fn.apply(new HitsEvent.Builder<TEvent>()).build());
		}

		/**
		 * Shared field values used to constrain matches in the sequence. These are
		 * defined using the by keyword in the EQL query syntax.
		 * <p>
		 * API name: {@code join_keys}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>joinKeys</code>.
		 */
		public final Builder<TEvent> joinKeys(List<JsonData> list) {
			this.joinKeys = _listAddAll(this.joinKeys, list);
			return this;
		}

		/**
		 * Shared field values used to constrain matches in the sequence. These are
		 * defined using the by keyword in the EQL query syntax.
		 * <p>
		 * API name: {@code join_keys}
		 * <p>
		 * Adds one or more values to <code>joinKeys</code>.
		 */
		public final Builder<TEvent> joinKeys(JsonData value, JsonData... values) {
			this.joinKeys = _listAdd(this.joinKeys, value, values);
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
		 * Builds a {@link HitsSequence}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HitsSequence<TEvent> build() {
			_checkSingleUse();

			return new HitsSequence<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for HitsSequence
	 */
	public static <TEvent> JsonpDeserializer<HitsSequence<TEvent>> createHitsSequenceDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> HitsSequence.setupHitsSequenceDeserializer(op, tEventDeserializer));
	};

	/**
	 * Json deserializer for {@link HitsSequence} based on named deserializers
	 * provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<HitsSequence<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createHitsSequenceDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:eql._types.HitsSequence.TEvent")));

	protected static <TEvent> void setupHitsSequenceDeserializer(ObjectDeserializer<HitsSequence.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(Builder::events,
				JsonpDeserializer.arrayDeserializer(HitsEvent.createHitsEventDeserializer(tEventDeserializer)),
				"events");
		op.add(Builder::joinKeys, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "join_keys");

	}

}
