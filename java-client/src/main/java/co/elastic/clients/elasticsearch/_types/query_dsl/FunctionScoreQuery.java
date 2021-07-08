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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreQuery
public final class FunctionScoreQuery extends QueryBase {
	@Nullable
	private final JsonValue boostMode;

	@Nullable
	private final List<FunctionScoreContainer> functions;

	@Nullable
	private final Number maxBoost;

	@Nullable
	private final Number minScore;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final JsonValue scoreMode;

	// ---------------------------------------------------------------------------------------------

	protected FunctionScoreQuery(Builder builder) {
		super(builder);
		this.boostMode = builder.boostMode;
		this.functions = builder.functions;
		this.maxBoost = builder.maxBoost;
		this.minScore = builder.minScore;
		this.query = builder.query;
		this.scoreMode = builder.scoreMode;

	}

	/**
	 * API name: {@code boost_mode}
	 */
	@Nullable
	public JsonValue boostMode() {
		return this.boostMode;
	}

	/**
	 * API name: {@code functions}
	 */
	@Nullable
	public List<FunctionScoreContainer> functions() {
		return this.functions;
	}

	/**
	 * API name: {@code max_boost}
	 */
	@Nullable
	public Number maxBoost() {
		return this.maxBoost;
	}

	/**
	 * API name: {@code min_score}
	 */
	@Nullable
	public Number minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code score_mode}
	 */
	@Nullable
	public JsonValue scoreMode() {
		return this.scoreMode;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.boostMode != null) {

			generator.writeKey("boost_mode");
			generator.write(this.boostMode);

		}
		if (this.functions != null) {

			generator.writeKey("functions");
			generator.writeStartArray();
			for (FunctionScoreContainer item0 : this.functions) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxBoost != null) {

			generator.writeKey("max_boost");
			generator.write(this.maxBoost.doubleValue());

		}
		if (this.minScore != null) {

			generator.writeKey("min_score");
			generator.write(this.minScore.doubleValue());

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			generator.write(this.scoreMode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FunctionScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FunctionScoreQuery> {
		@Nullable
		private JsonValue boostMode;

		@Nullable
		private List<FunctionScoreContainer> functions;

		@Nullable
		private Number maxBoost;

		@Nullable
		private Number minScore;

		@Nullable
		private QueryContainer query;

		@Nullable
		private JsonValue scoreMode;

		/**
		 * API name: {@code boost_mode}
		 */
		public Builder boostMode(@Nullable JsonValue value) {
			this.boostMode = value;
			return this;
		}

		/**
		 * API name: {@code functions}
		 */
		public Builder functions(@Nullable List<FunctionScoreContainer> value) {
			this.functions = value;
			return this;
		}

		/**
		 * API name: {@code functions}
		 */
		public Builder functions(FunctionScoreContainer... value) {
			this.functions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #functions(List)}, creating the list if needed.
		 */
		public Builder addFunctions(FunctionScoreContainer value) {
			if (this.functions == null) {
				this.functions = new ArrayList<>();
			}
			this.functions.add(value);
			return this;
		}

		/**
		 * Set {@link #functions(List)} to a singleton list.
		 */
		public Builder functions(Function<FunctionScoreContainer.Builder, ObjectBuilder<FunctionScoreContainer>> fn) {
			return this.functions(fn.apply(new FunctionScoreContainer.Builder()).build());
		}

		/**
		 * Add a value to {@link #functions(List)}, creating the list if needed.
		 */
		public Builder addFunctions(
				Function<FunctionScoreContainer.Builder, ObjectBuilder<FunctionScoreContainer>> fn) {
			return this.addFunctions(fn.apply(new FunctionScoreContainer.Builder()).build());
		}

		/**
		 * API name: {@code max_boost}
		 */
		public Builder maxBoost(@Nullable Number value) {
			this.maxBoost = value;
			return this;
		}

		/**
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Number value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code score_mode}
		 */
		public Builder scoreMode(@Nullable JsonValue value) {
			this.scoreMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FunctionScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FunctionScoreQuery build() {

			return new FunctionScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FunctionScoreQuery
	 */
	public static final JsonpDeserializer<FunctionScoreQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FunctionScoreQuery::setupFunctionScoreQueryDeserializer);

	protected static void setupFunctionScoreQueryDeserializer(DelegatingDeserializer<FunctionScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::boostMode, JsonpDeserializer.jsonValueDeserializer(), "boost_mode");
		op.add(Builder::functions, JsonpDeserializer.arrayDeserializer(FunctionScoreContainer.DESERIALIZER),
				"functions");
		op.add(Builder::maxBoost, JsonpDeserializer.numberDeserializer(), "max_boost");
		op.add(Builder::minScore, JsonpDeserializer.numberDeserializer(), "min_score");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::scoreMode, JsonpDeserializer.jsonValueDeserializer(), "score_mode");

	}

}
