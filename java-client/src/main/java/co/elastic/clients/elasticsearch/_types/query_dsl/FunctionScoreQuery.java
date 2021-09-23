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
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreQuery
public final class FunctionScoreQuery extends QueryBase implements Query {
	@Nullable
	private final FunctionBoostMode boostMode;

	@Nullable
	private final List<FunctionScore> functions;

	@Nullable
	private final Number maxBoost;

	@Nullable
	private final Number minScore;

	@Nullable
	private final Query query;

	@Nullable
	private final FunctionScoreMode scoreMode;

	// ---------------------------------------------------------------------------------------------

	public FunctionScoreQuery(Builder builder) {
		super(builder);

		this.boostMode = builder.boostMode;
		this.functions = builder.functions;
		this.maxBoost = builder.maxBoost;
		this.minScore = builder.minScore;
		this.query = builder.query;
		this.scoreMode = builder.scoreMode;

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "function_score";
	}

	/**
	 * API name: {@code boost_mode}
	 */
	@Nullable
	public FunctionBoostMode boostMode() {
		return this.boostMode;
	}

	/**
	 * API name: {@code functions}
	 */
	@Nullable
	public List<FunctionScore> functions() {
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
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code score_mode}
	 */
	@Nullable
	public FunctionScoreMode scoreMode() {
		return this.scoreMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);
		if (this.boostMode != null) {

			generator.writeKey("boost_mode");
			this.boostMode.serialize(generator, mapper);
		}
		if (this.functions != null) {

			generator.writeKey("functions");
			generator.writeStartArray();
			for (FunctionScore item0 : this.functions) {
				item0.serialize(generator, mapper);

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
			this.query.serialize(generator, mapper);

		}
		if (this.scoreMode != null) {

			generator.writeKey("score_mode");
			this.scoreMode.serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FunctionScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FunctionScoreQuery> {
		@Nullable
		private FunctionBoostMode boostMode;

		@Nullable
		private List<FunctionScore> functions;

		@Nullable
		private Number maxBoost;

		@Nullable
		private Number minScore;

		@Nullable
		private Query query;

		@Nullable
		private FunctionScoreMode scoreMode;

		/**
		 * API name: {@code boost_mode}
		 */
		public Builder boostMode(@Nullable FunctionBoostMode value) {
			this.boostMode = value;
			return this;
		}

		/**
		 * API name: {@code functions}
		 */
		public Builder functions(@Nullable List<FunctionScore> value) {
			this.functions = value;
			return this;
		}

		/**
		 * API name: {@code functions}
		 */
		public Builder functions(FunctionScore... value) {
			this.functions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #functions(List)}, creating the list if needed.
		 */
		public Builder addFunctions(FunctionScore value) {
			if (this.functions == null) {
				this.functions = new ArrayList<>();
			}
			this.functions.add(value);
			return this;
		}

		/**
		 * Set {@link #functions(List)} to a singleton list.
		 */
		public Builder functions(Function<FunctionScore.Builder, ObjectBuilder<FunctionScore>> fn) {
			return this.functions(fn.apply(new FunctionScore.Builder()).build());
		}

		/**
		 * Add a value to {@link #functions(List)}, creating the list if needed.
		 */
		public Builder addFunctions(Function<FunctionScore.Builder, ObjectBuilder<FunctionScore>> fn) {
			return this.addFunctions(fn.apply(new FunctionScore.Builder()).build());
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
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code score_mode}
		 */
		public Builder scoreMode(@Nullable FunctionScoreMode value) {
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

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<FunctionScoreQuery.Builder, FunctionScoreQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(FunctionScoreQuery::setupFunctionScoreQueryDeserializer);

	protected static void setupFunctionScoreQueryDeserializer(DelegatingDeserializer<FunctionScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::boostMode, FunctionBoostMode.DESERIALIZER, "boost_mode");
		op.add(Builder::functions, JsonpDeserializer.arrayDeserializer(FunctionScore.DESERIALIZER), "functions");
		op.add(Builder::maxBoost, JsonpDeserializer.numberDeserializer(), "max_boost");
		op.add(Builder::minScore, JsonpDeserializer.numberDeserializer(), "min_score");
		op.add(Builder::query, Query.DESERIALIZER, "query");
		op.add(Builder::scoreMode, FunctionScoreMode.DESERIALIZER, "score_mode");

	}

}
