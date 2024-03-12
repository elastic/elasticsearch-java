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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.query_dsl.WeightedTokensQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.WeightedTokensQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class WeightedTokensQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	private final Map<String, Float> tokens;

	@Nullable
	private final TokenPruningConfig pruningConfig;

	// ---------------------------------------------------------------------------------------------

	private WeightedTokensQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.tokens = ApiTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
		this.pruningConfig = builder.pruningConfig;

	}

	public static WeightedTokensQuery of(Function<Builder, ObjectBuilder<WeightedTokensQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.WeightedTokens;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The tokens representing this query
	 * <p>
	 * API name: {@code tokens}
	 */
	public final Map<String, Float> tokens() {
		return this.tokens;
	}

	/**
	 * Token pruning configurations
	 * <p>
	 * API name: {@code pruning_config}
	 */
	@Nullable
	public final TokenPruningConfig pruningConfig() {
		return this.pruningConfig;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.tokens)) {
			generator.writeKey("tokens");
			generator.writeStartObject();
			for (Map.Entry<String, Float> item0 : this.tokens.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.pruningConfig != null) {
			generator.writeKey("pruning_config");
			this.pruningConfig.serialize(generator, mapper);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WeightedTokensQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WeightedTokensQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		private Map<String, Float> tokens;

		@Nullable
		private TokenPruningConfig pruningConfig;

		/**
		 * Required - The tokens representing this query
		 * <p>
		 * API name: {@code tokens}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>tokens</code>.
		 */
		public final Builder tokens(Map<String, Float> map) {
			this.tokens = _mapPutAll(this.tokens, map);
			return this;
		}

		/**
		 * Required - The tokens representing this query
		 * <p>
		 * API name: {@code tokens}
		 * <p>
		 * Adds an entry to <code>tokens</code>.
		 */
		public final Builder tokens(String key, Float value) {
			this.tokens = _mapPut(this.tokens, key, value);
			return this;
		}

		/**
		 * Token pruning configurations
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(@Nullable TokenPruningConfig value) {
			this.pruningConfig = value;
			return this;
		}

		/**
		 * Token pruning configurations
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(Function<TokenPruningConfig.Builder, ObjectBuilder<TokenPruningConfig>> fn) {
			return this.pruningConfig(fn.apply(new TokenPruningConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WeightedTokensQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WeightedTokensQuery build() {
			_checkSingleUse();

			return new WeightedTokensQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WeightedTokensQuery}
	 */
	public static final JsonpDeserializer<WeightedTokensQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WeightedTokensQuery::setupWeightedTokensQueryDeserializer);

	protected static void setupWeightedTokensQueryDeserializer(ObjectDeserializer<WeightedTokensQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::tokens, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.floatDeserializer()),
				"tokens");
		op.add(Builder::pruningConfig, TokenPruningConfig._DESERIALIZER, "pruning_config");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
