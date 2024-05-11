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
import java.lang.Double;
import java.util.List;
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

// typedef: _types.query_dsl.DisMaxQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.DisMaxQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class DisMaxQuery extends QueryBase implements QueryVariant {
	private final List<Query> queries;

	@Nullable
	private final Double tieBreaker;

	// ---------------------------------------------------------------------------------------------

	private DisMaxQuery(Builder builder) {
		super(builder);

		this.queries = ApiTypeHelper.unmodifiableRequired(builder.queries, this, "queries");
		this.tieBreaker = builder.tieBreaker;

	}

	public static DisMaxQuery of(Function<Builder, ObjectBuilder<DisMaxQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.DisMax;
	}

	/**
	 * Required - API name: {@code queries}
	 */
	public final List<Query> queries() {
		return this.queries;
	}

	/**
	 * API name: {@code tie_breaker}
	 */
	@Nullable
	public final Double tieBreaker() {
		return this.tieBreaker;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.queries)) {
			generator.writeKey("queries");
			generator.writeStartArray();
			for (Query item0 : this.queries) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tieBreaker != null) {
			generator.writeKey("tie_breaker");
			generator.write(this.tieBreaker);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DisMaxQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<DisMaxQuery> {
		private List<Query> queries;

		@Nullable
		private Double tieBreaker;

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>queries</code>.
		 */
		public final Builder queries(List<Query> list) {
			this.queries = _listAddAll(this.queries, list);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds one or more values to <code>queries</code>.
		 */
		public final Builder queries(Query value, Query... values) {
			this.queries = _listAdd(this.queries, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds a value to <code>queries</code> using a builder lambda.
		 */
		public final Builder queries(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return queries(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code tie_breaker}
		 */
		public final Builder tieBreaker(@Nullable Double value) {
			this.tieBreaker = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DisMaxQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DisMaxQuery build() {
			_checkSingleUse();

			return new DisMaxQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DisMaxQuery}
	 */
	public static final JsonpDeserializer<DisMaxQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DisMaxQuery::setupDisMaxQueryDeserializer);

	protected static void setupDisMaxQueryDeserializer(ObjectDeserializer<DisMaxQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::queries, JsonpDeserializer.arrayDeserializer(Query._DESERIALIZER), "queries");
		op.add(Builder::tieBreaker, JsonpDeserializer.doubleDeserializer(), "tie_breaker");

	}

}
