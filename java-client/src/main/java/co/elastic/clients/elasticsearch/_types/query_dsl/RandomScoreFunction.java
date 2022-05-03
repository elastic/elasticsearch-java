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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RandomScoreFunction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RandomScoreFunction">API
 *      specification</a>
 */
@JsonpDeserializable
public class RandomScoreFunction implements FunctionScoreVariant, JsonpSerializable {
	@Nullable
	private final String field;

	@Nullable
	private final String seed;

	// ---------------------------------------------------------------------------------------------

	private RandomScoreFunction(Builder builder) {

		this.field = builder.field;
		this.seed = builder.seed;

	}

	public static RandomScoreFunction of(Function<Builder, ObjectBuilder<RandomScoreFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FunctionScore variant kind.
	 */
	@Override
	public FunctionScore.Kind _functionScoreKind() {
		return FunctionScore.Kind.RandomScore;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code seed}
	 */
	@Nullable
	public final String seed() {
		return this.seed;
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

		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.seed != null) {
			generator.writeKey("seed");
			generator.write(this.seed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RandomScoreFunction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RandomScoreFunction> {
		@Nullable
		private String field;

		@Nullable
		private String seed;

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code seed}
		 */
		public final Builder seed(@Nullable String value) {
			this.seed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RandomScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RandomScoreFunction build() {
			_checkSingleUse();

			return new RandomScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RandomScoreFunction}
	 */
	public static final JsonpDeserializer<RandomScoreFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RandomScoreFunction::setupRandomScoreFunctionDeserializer);

	protected static void setupRandomScoreFunctionDeserializer(ObjectDeserializer<RandomScoreFunction.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::seed, JsonpDeserializer.stringDeserializer(), "seed");

	}

}
