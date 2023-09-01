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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanOrQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.SpanOrQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanOrQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final List<SpanQuery> clauses;

	// ---------------------------------------------------------------------------------------------

	private SpanOrQuery(Builder builder) {
		super(builder);

		this.clauses = ApiTypeHelper.unmodifiableRequired(builder.clauses, this, "clauses");

	}

	public static SpanOrQuery of(Function<Builder, ObjectBuilder<SpanOrQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanOr;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanOr;
	}

	/**
	 * Required - Array of one or more other span type queries.
	 * <p>
	 * API name: {@code clauses}
	 */
	public final List<SpanQuery> clauses() {
		return this.clauses;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.clauses)) {
			generator.writeKey("clauses");
			generator.writeStartArray();
			for (SpanQuery item0 : this.clauses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanOrQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanOrQuery> {
		private List<SpanQuery> clauses;

		/**
		 * Required - Array of one or more other span type queries.
		 * <p>
		 * API name: {@code clauses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clauses</code>.
		 */
		public final Builder clauses(List<SpanQuery> list) {
			this.clauses = _listAddAll(this.clauses, list);
			return this;
		}

		/**
		 * Required - Array of one or more other span type queries.
		 * <p>
		 * API name: {@code clauses}
		 * <p>
		 * Adds one or more values to <code>clauses</code>.
		 */
		public final Builder clauses(SpanQuery value, SpanQuery... values) {
			this.clauses = _listAdd(this.clauses, value, values);
			return this;
		}

		/**
		 * Required - Array of one or more other span type queries.
		 * <p>
		 * API name: {@code clauses}
		 * <p>
		 * Adds a value to <code>clauses</code> using a builder lambda.
		 */
		public final Builder clauses(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return clauses(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanOrQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanOrQuery build() {
			_checkSingleUse();

			return new SpanOrQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanOrQuery}
	 */
	public static final JsonpDeserializer<SpanOrQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanOrQuery::setupSpanOrQueryDeserializer);

	protected static void setupSpanOrQueryDeserializer(ObjectDeserializer<SpanOrQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::clauses, JsonpDeserializer.arrayDeserializer(SpanQuery._DESERIALIZER), "clauses");

	}

}
