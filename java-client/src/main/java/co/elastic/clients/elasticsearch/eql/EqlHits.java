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

import co.elastic.clients.elasticsearch.core.search.TotalHits;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: eql._types.EqlHits

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
		this.events = ModelTypeHelper.unmodifiable(builder.events);
		this.sequences = ModelTypeHelper.unmodifiable(builder.sequences);
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
		if (ModelTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (HitsEvent<TEvent> item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.sequences)) {
			generator.writeKey("sequences");
			generator.writeStartArray();
			for (HitsSequence<TEvent> item0 : this.sequences) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlHits}.
	 */
	public static class Builder<TEvent> extends ObjectBuilderBase implements ObjectBuilder<EqlHits<TEvent>> {
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
		 */
		public final Builder<TEvent> events(@Nullable List<HitsEvent<TEvent>> value) {
			this.events = value;
			return this;
		}

		/**
		 * Contains events matching the query. Each object represents a matching event.
		 * <p>
		 * API name: {@code events}
		 */
		public final Builder<TEvent> events(HitsEvent<TEvent>... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Contains events matching the query. Each object represents a matching event.
		 * <p>
		 * API name: {@code events}
		 */
		@SafeVarargs
		public final Builder<TEvent> events(
				Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>>... fns) {
			this.events = new ArrayList<>(fns.length);
			for (Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn : fns) {
				this.events.add(fn.apply(new HitsEvent.Builder<TEvent>()).build());
			}
			return this;
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 */
		public final Builder<TEvent> sequences(@Nullable List<HitsSequence<TEvent>> value) {
			this.sequences = value;
			return this;
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 */
		public final Builder<TEvent> sequences(HitsSequence<TEvent>... value) {
			this.sequences = Arrays.asList(value);
			return this;
		}

		/**
		 * Contains event sequences matching the query. Each object represents a
		 * matching sequence. This parameter is only returned for EQL queries containing
		 * a sequence.
		 * <p>
		 * API name: {@code sequences}
		 */
		@SafeVarargs
		public final Builder<TEvent> sequences(
				Function<HitsSequence.Builder<TEvent>, ObjectBuilder<HitsSequence<TEvent>>>... fns) {
			this.sequences = new ArrayList<>(fns.length);
			for (Function<HitsSequence.Builder<TEvent>, ObjectBuilder<HitsSequence<TEvent>>> fn : fns) {
				this.sequences.add(fn.apply(new HitsSequence.Builder<TEvent>()).build());
			}
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
	 * Create a json deserializer for EqlHits
	 */
	public static <TEvent> JsonpDeserializer<EqlHits<TEvent>> createEqlHitsDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> EqlHits.setupEqlHitsDeserializer(op, tEventDeserializer));
	};

	protected static <TEvent> void setupEqlHitsDeserializer(DelegatingDeserializer<EqlHits.Builder<TEvent>> op,
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
