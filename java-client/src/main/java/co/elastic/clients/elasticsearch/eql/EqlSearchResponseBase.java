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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: eql._types.EqlSearchResponseBase
public abstract class EqlSearchResponseBase<TEvent> implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean isPartial;

	@Nullable
	private final Boolean isRunning;

	@Nullable
	private final Number took;

	@Nullable
	private final Boolean timedOut;

	private final EqlHits<TEvent> hits;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	public EqlSearchResponseBase(AbstractBuilder<TEvent, ?> builder) {

		this.id = builder.id;
		this.isPartial = builder.isPartial;
		this.isRunning = builder.isRunning;
		this.took = builder.took;
		this.timedOut = builder.timedOut;
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.tEventSerializer = builder.tEventSerializer;

	}

	/**
	 * Identifier for the search.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * If true, the response does not contain complete search results.
	 * <p>
	 * API name: {@code is_partial}
	 */
	@Nullable
	public Boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * If true, the search request is still executing.
	 * <p>
	 * API name: {@code is_running}
	 */
	@Nullable
	public Boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * Milliseconds it took Elasticsearch to execute the request.
	 * <p>
	 * API name: {@code took}
	 */
	@Nullable
	public Number took() {
		return this.took;
	}

	/**
	 * If true, the request timed out before completion.
	 * <p>
	 * API name: {@code timed_out}
	 */
	@Nullable
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * Contains matching events and sequences. Also contains related metadata.
	 * <p>
	 * API name: {@code hits}
	 */
	public EqlHits<TEvent> hits() {
		return this.hits;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.isPartial != null) {

			generator.writeKey("is_partial");
			generator.write(this.isPartial);

		}
		if (this.isRunning != null) {

			generator.writeKey("is_running");
			generator.write(this.isRunning);

		}
		if (this.took != null) {

			generator.writeKey("took");
			generator.write(this.took.doubleValue());

		}
		if (this.timedOut != null) {

			generator.writeKey("timed_out");
			generator.write(this.timedOut);

		}

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

	}

	protected abstract static class AbstractBuilder<TEvent, BuilderT extends AbstractBuilder<TEvent, BuilderT>> {
		@Nullable
		private String id;

		@Nullable
		private Boolean isPartial;

		@Nullable
		private Boolean isRunning;

		@Nullable
		private Number took;

		@Nullable
		private Boolean timedOut;

		private EqlHits<TEvent> hits;

		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Identifier for the search.
		 * <p>
		 * API name: {@code id}
		 */
		public BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * If true, the response does not contain complete search results.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public BuilderT isPartial(@Nullable Boolean value) {
			this.isPartial = value;
			return self();
		}

		/**
		 * If true, the search request is still executing.
		 * <p>
		 * API name: {@code is_running}
		 */
		public BuilderT isRunning(@Nullable Boolean value) {
			this.isRunning = value;
			return self();
		}

		/**
		 * Milliseconds it took Elasticsearch to execute the request.
		 * <p>
		 * API name: {@code took}
		 */
		public BuilderT took(@Nullable Number value) {
			this.took = value;
			return self();
		}

		/**
		 * If true, the request timed out before completion.
		 * <p>
		 * API name: {@code timed_out}
		 */
		public BuilderT timedOut(@Nullable Boolean value) {
			this.timedOut = value;
			return self();
		}

		/**
		 * Contains matching events and sequences. Also contains related metadata.
		 * <p>
		 * API name: {@code hits}
		 */
		public BuilderT hits(EqlHits<TEvent> value) {
			this.hits = value;
			return self();
		}

		/**
		 * Contains matching events and sequences. Also contains related metadata.
		 * <p>
		 * API name: {@code hits}
		 */
		public BuilderT hits(Function<EqlHits.Builder<TEvent>, ObjectBuilder<EqlHits<TEvent>>> fn) {
			return this.hits(fn.apply(new EqlHits.Builder<TEvent>()).build());
		}

		/**
		 * Serializer for TEvent. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public BuilderT tEventSerializer(@Nullable JsonpSerializer<TEvent> value) {
			this.tEventSerializer = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TEvent, BuilderT extends AbstractBuilder<TEvent, BuilderT>> void setupEqlSearchResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op, JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(AbstractBuilder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(AbstractBuilder::took, JsonpDeserializer.numberDeserializer(), "took");
		op.add(AbstractBuilder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(AbstractBuilder::hits, EqlHits.createEqlHitsDeserializer(tEventDeserializer), "hits");

	}

}
