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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ScriptScoreQuery
@JsonpDeserializable
public final class ScriptScoreQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Float minScore;

	private final Query query;

	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	public ScriptScoreQuery(Builder builder) {
		super(builder);

		this.minScore = builder.minScore;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.script = Objects.requireNonNull(builder.script, "script");

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "script_score";
	}

	/**
	 * API name: {@code min_score}
	 */
	@Nullable
	public Float minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code query}
	 */
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code script}
	 */
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.minScore != null) {

			generator.writeKey("min_score");
			generator.write(this.minScore);

		}

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		generator.writeKey("script");
		generator.write(this.script);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptScoreQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ScriptScoreQuery> {
		@Nullable
		private Float minScore;

		private Query query;

		private JsonValue /* _types.Script */ script;

		/**
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Float value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Query value) {
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
		 * API name: {@code script}
		 */
		public Builder script(JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScriptScoreQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptScoreQuery build() {

			return new ScriptScoreQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptScoreQuery}
	 */
	public static final JsonpDeserializer<ScriptScoreQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptScoreQuery::setupScriptScoreQueryDeserializer, Builder::build);

	protected static void setupScriptScoreQueryDeserializer(DelegatingDeserializer<ScriptScoreQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::minScore, JsonpDeserializer.floatDeserializer(), "min_score");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

}
