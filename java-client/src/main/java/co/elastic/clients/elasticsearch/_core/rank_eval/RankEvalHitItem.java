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

package co.elastic.clients.elasticsearch._core.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalHitItem
public final class RankEvalHitItem implements JsonpSerializable {
	private final RankEvalHit hit;

	@Nullable
	private final Number rating;

	// ---------------------------------------------------------------------------------------------

	public RankEvalHitItem(Builder builder) {

		this.hit = Objects.requireNonNull(builder.hit, "hit");
		this.rating = builder.rating;

	}

	/**
	 * API name: {@code hit}
	 */
	public RankEvalHit hit() {
		return this.hit;
	}

	/**
	 * API name: {@code rating}
	 */
	@Nullable
	public Number rating() {
		return this.rating;
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

		generator.writeKey("hit");
		this.hit.serialize(generator, mapper);

		if (this.rating != null) {

			generator.writeKey("rating");
			generator.write(this.rating.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalHitItem}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalHitItem> {
		private RankEvalHit hit;

		@Nullable
		private Number rating;

		/**
		 * API name: {@code hit}
		 */
		public Builder hit(RankEvalHit value) {
			this.hit = value;
			return this;
		}

		/**
		 * API name: {@code hit}
		 */
		public Builder hit(Function<RankEvalHit.Builder, ObjectBuilder<RankEvalHit>> fn) {
			return this.hit(fn.apply(new RankEvalHit.Builder()).build());
		}

		/**
		 * API name: {@code rating}
		 */
		public Builder rating(@Nullable Number value) {
			this.rating = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalHitItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalHitItem build() {

			return new RankEvalHitItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalHitItem}
	 */
	public static final JsonpDeserializer<RankEvalHitItem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankEvalHitItem::setupRankEvalHitItemDeserializer);

	protected static void setupRankEvalHitItemDeserializer(DelegatingDeserializer<RankEvalHitItem.Builder> op) {

		op.add(Builder::hit, RankEvalHit.DESERIALIZER, "hit");
		op.add(Builder::rating, JsonpDeserializer.numberDeserializer(), "rating");

	}

}
