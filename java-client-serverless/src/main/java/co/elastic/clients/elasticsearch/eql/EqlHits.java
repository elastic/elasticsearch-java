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

import co.elastic.clients.elasticsearch.core.search.TotalHits;
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

// typedef: eql._types.EqlHits

/**
 *
 * @see <a href="../doc-files/api-spec.html#eql._types.EqlHits">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlHits<TEvent> implements JsonpSerializable {
	@Nullable
	private final TotalHits total;

	private final List<HitsEvent<TEvent>> events;

	private final List<HitsSequence<TEvent>> sequences;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	private EqlHits(Builder<TEvent> builder) {

		this.total = builder.total;
		this.events = ApiTypeHelper.unmodifiable(builder.events);
		this.sequences = ApiTypeHelper.unmodifiable(builder.sequences);
		this.tEventSerializer = builder.tEventSerializer;

	}

	public static <TEvent> EqlHits<TEvent> of(Function<Builder<TEvent>, ObjectBuilder<EqlHits<TEvent>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Metadata about the number of matching events or sequences.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final TotalHits total() {
		return this.total;
	}

	/**
	 * Contains events matching the query. Each object represents a matching event.
	 * <p>
	 * API name: {@code events}
	 */
	public final List<HitsEvent<TEvent>> events() {
		return this.events;
	}

	/**
	 * Contains event sequences matching the query. Each object represents a
	 * matching sequence. This parameter is only returned for EQL queries containing
	 * a sequence.
	 * <p>
	 * API name: {@code sequences}
	 */
	public final List<HitsSequence<TEvent>> sequences() {
		return this.sequences;
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

		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (HitsEvent<TEvent> item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.sequences)) {
			generator.writeKey("sequences");
			generator.writeStartArray();
			for (HitsSequence<TEvent> item0 : this.sequences) {
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
	 * Builder for {@link EqlHits}.
	 */

	public static class Builder<TEvent> extends WithJsonObjectBuilderBase<Builder<TEvent>>
			implements
				ObjectBuilder<EqlHits<TEvent>> {
		@Nullable
		private TotalHits total;

		@Nullable
		private List<HitsEvent<TEvent>> events;

		@Nullable
		private List<HitsSequence<TEvent>> sequences;

		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Metadata about the number of matching events or sequences.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder<TEvent> total(@Nullable TotalHits value) {
			this.total = value;
			return this;
		}

		/**
		 * Metadata about the number of matching events or sequences.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder<TEvent> total(Function<TotalHits.Builder, ObjectBuilder<TotalHits>> fn) {
			return this.total(fn.apply(new TotalHits.Builder()).build());
		}

		/**
		 * Contains events matching the query. Each object represents a matching event.
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
		 * Contains events matching the query. Each object represents a matching event.
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
		 * Contains events matching the query. Each object represents a matching event.
		 * <p>
		 * API name: {@code events}
		 * <p>
		 * Adds a value to <code>events</code> using a builder lambda.
		 */
		public final Builder<TEvent> events(Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn) {
			return events(fn.apply(new HitsEvent.Builder<TEvent>()).build());
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sequences</code>.
		 */
		public final Builder<TEvent> sequences(List<HitsSequence<TEvent>> list) {
			this.sequences = _listAddAll(this.sequences, list);
			return this;
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 * <p>
		 * Adds one or more values to <code>sequences</code>.
		 */
		public final Builder<TEvent> sequences(HitsSequence<TEvent> value, HitsSequence<TEvent>... values) {
			this.sequences = _listAdd(this.sequences, value, values);
			return this;
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 * <p>
		 * Adds a value to <code>sequences</code> using a builder lambda.
		 */
		public final Builder<TEvent> sequences(
				Function<HitsSequence.Builder<TEvent>, ObjectBuilder<HitsSequence<TEvent>>> fn) {
			return sequences(fn.apply(new HitsSequence.Builder<TEvent>()).build());
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
		 * Builds a {@link EqlHits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlHits<TEvent> build() {
			_checkSingleUse();

			return new EqlHits<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for EqlHits
	 */
	public static <TEvent> JsonpDeserializer<EqlHits<TEvent>> createEqlHitsDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> EqlHits.setupEqlHitsDeserializer(op, tEventDeserializer));
	};

	/**
	 * Json deserializer for {@link EqlHits} based on named deserializers provided
	 * by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<EqlHits<Object>> _DESERIALIZER = JsonpDeserializer
			.lazy(() -> createEqlHitsDeserializer(
					new NamedDeserializer<>("co.elastic.clients:Deserializer:eql._types.EqlHits.TEvent")));

	protected static <TEvent> void setupEqlHitsDeserializer(ObjectDeserializer<EqlHits.Builder<TEvent>> op,
			JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(Builder::total, TotalHits._DESERIALIZER, "total");
		op.add(Builder::events,
				JsonpDeserializer.arrayDeserializer(HitsEvent.createHitsEventDeserializer(tEventDeserializer)),
				"events");
		op.add(Builder::sequences,
				JsonpDeserializer.arrayDeserializer(HitsSequence.createHitsSequenceDeserializer(tEventDeserializer)),
				"sequences");

	}

}
