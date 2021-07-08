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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.InnerHitsMetadata
public final class InnerHitsMetadata implements ToJsonp {
	private final JsonValue total;

	private final List<Hit<Map<String, JsonValue>>> hits;

	@Nullable
	private final Number maxScore;

	// ---------------------------------------------------------------------------------------------

	protected InnerHitsMetadata(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.maxScore = builder.maxScore;

	}

	/**
	 * API name: {@code total}
	 */
	public JsonValue total() {
		return this.total;
	}

	/**
	 * API name: {@code hits}
	 */
	public List<Hit<Map<String, JsonValue>>> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public Number maxScore() {
		return this.maxScore;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("hits");
		generator.writeStartArray();
		for (Hit<Map<String, JsonValue>> item0 : this.hits) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		if (this.maxScore != null) {

			generator.writeKey("max_score");
			generator.write(this.maxScore.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHitsMetadata}.
	 */
	public static class Builder implements ObjectBuilder<InnerHitsMetadata> {
		private JsonValue total;

		private List<Hit<Map<String, JsonValue>>> hits;

		@Nullable
		private Number maxScore;

		/**
		 * API name: {@code total}
		 */
		public Builder total(JsonValue value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder hits(List<Hit<Map<String, JsonValue>>> value) {
			this.hits = value;
			return this;
		}

		/**
		 * API name: {@code hits}
		 */
		public Builder hits(Hit<Map<String, JsonValue>>... value) {
			this.hits = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder addHits(Hit<Map<String, JsonValue>> value) {
			if (this.hits == null) {
				this.hits = new ArrayList<>();
			}
			this.hits.add(value);
			return this;
		}

		/**
		 * Set {@link #hits(List)} to a singleton list.
		 */
		public Builder hits(
				Function<Hit.Builder<Map<String, JsonValue>>, ObjectBuilder<Hit<Map<String, JsonValue>>>> fn) {
			return this.hits(fn.apply(new Hit.Builder<Map<String, JsonValue>>()).build());
		}

		/**
		 * Add a value to {@link #hits(List)}, creating the list if needed.
		 */
		public Builder addHits(
				Function<Hit.Builder<Map<String, JsonValue>>, ObjectBuilder<Hit<Map<String, JsonValue>>>> fn) {
			return this.addHits(fn.apply(new Hit.Builder<Map<String, JsonValue>>()).build());
		}

		/**
		 * API name: {@code max_score}
		 */
		public Builder maxScore(@Nullable Number value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * Builds a {@link InnerHitsMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHitsMetadata build() {

			return new InnerHitsMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for InnerHitsMetadata
	 */
	public static final JsonpDeserializer<InnerHitsMetadata> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, InnerHitsMetadata::setupInnerHitsMetadataDeserializer);

	protected static void setupInnerHitsMetadataDeserializer(DelegatingDeserializer<InnerHitsMetadata.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.jsonValueDeserializer(), "total");
		op.add(Builder::hits, JsonpDeserializer.arrayDeserializer(Hit.createHitDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()))), "hits");
		op.add(Builder::maxScore, JsonpDeserializer.numberDeserializer(), "max_score");

	}

}
