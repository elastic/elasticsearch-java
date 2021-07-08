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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.RankEvalHit
public final class RankEvalHit implements ToJsonp {
	private final String _id;

	private final String _index;

	@Nullable
	private final String _type;

	private final Number _score;

	// ---------------------------------------------------------------------------------------------

	protected RankEvalHit(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");
		this._type = builder._type;
		this._score = Objects.requireNonNull(builder._score, "_score");

	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String _type() {
		return this._type;
	}

	/**
	 * API name: {@code _score}
	 */
	public Number _score() {
		return this._score;
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

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

		if (this._type != null) {

			generator.writeKey("_type");
			generator.write(this._type);

		}

		generator.writeKey("_score");
		generator.write(this._score.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalHit}.
	 */
	public static class Builder implements ObjectBuilder<RankEvalHit> {
		private String _id;

		private String _index;

		@Nullable
		private String _type;

		private Number _score;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder _type(@Nullable String value) {
			this._type = value;
			return this;
		}

		/**
		 * API name: {@code _score}
		 */
		public Builder _score(Number value) {
			this._score = value;
			return this;
		}

		/**
		 * Builds a {@link RankEvalHit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalHit build() {

			return new RankEvalHit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RankEvalHit
	 */
	public static final JsonpDeserializer<RankEvalHit> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RankEvalHit::setupRankEvalHitDeserializer);

	protected static void setupRankEvalHitDeserializer(DelegatingDeserializer<RankEvalHit.Builder> op) {

		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::_type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::_score, JsonpDeserializer.numberDeserializer(), "_score");

	}

}
