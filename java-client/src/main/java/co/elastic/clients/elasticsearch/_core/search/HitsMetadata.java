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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search._types.HitsMetadata

public final class HitsMetadata<T> implements JsonpSerializable {
	private final JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total;

	private final List<Hit<T>> hits;

	@Nullable
	private final Double maxScore;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	public HitsMetadata(Builder<T> builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.maxScore = builder.maxScore;
		this.tSerializer = builder.tSerializer;

	}

	/**
	 * API name: {@code total}
	 */
	public JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total() {
		return this.total;
	}

	/**
	 * API name: {@code hits}
	 */
	public List<Hit<T>> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public Double maxScore() {
		return this.maxScore;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("hits");
		generator.writeStartArray();
		for (Hit<T> item0 : this.hits) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.maxScore != null) {

			generator.writeKey("max_score");
			generator.write(this.maxScore);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsMetadata}.
	 */
	public static class Builder<T> implements ObjectBuilder<HitsMetadata<T>> {
		private JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total;

		private List<Hit<T>> hits;

		@Nullable
		private Double maxScore;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * API name: {@code total}
		 */
		public Builder<T> total(JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder<T> hits(List<Hit<T>> value) {
			this.hits = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder<T> hits(Hit<T>... value) {
			this.hits = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder<T> addHits(Hit<T> value) {
			if (this.hits == null) {
				this.hits = new ArrayList<>();
			}
			this.hits.add(value);
			return this;
		}

		/**
		 * Set {@link #hits(List)} to a singleton list.
		 */
		public Builder<T> hits(Function<Hit.Builder<T>, ObjectBuilder<Hit<T>>> fn) {
			return this.hits(fn.apply(new Hit.Builder<T>()).build());
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder<T> addHits(Function<Hit.Builder<T>, ObjectBuilder<Hit<T>>> fn) {
			return this.addHits(fn.apply(new Hit.Builder<T>()).build());
		}

		/**
		 * API name: {@code max_score}
		 */
		public Builder<T> maxScore(@Nullable Double value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public Builder<T> tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link HitsMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HitsMetadata<T> build() {

			return new HitsMetadata<T>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for HitsMetadata
	 */
	public static <T> JsonpDeserializer<HitsMetadata<T>> createHitsMetadataDeserializer(
			JsonpDeserializer<T> tDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<T>>) Builder::new,
				op -> HitsMetadata.setupHitsMetadataDeserializer(op, tDeserializer));
	};

	protected static <T> void setupHitsMetadataDeserializer(DelegatingDeserializer<HitsMetadata.Builder<T>> op,
			JsonpDeserializer<T> tDeserializer) {

		op.add(Builder::total, JsonpDeserializer.jsonValueDeserializer(), "total");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(tDeserializer)), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");

	}

}
