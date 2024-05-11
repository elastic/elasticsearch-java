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
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: _types.query_dsl.SpanNearQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SpanNearQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanNearQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final List<SpanQuery> clauses;

	@Nullable
	private final Boolean inOrder;

	@Nullable
	private final Integer slop;

	// ---------------------------------------------------------------------------------------------

	private SpanNearQuery(Builder builder) {
		super(builder);

		this.clauses = ApiTypeHelper.unmodifiableRequired(builder.clauses, this, "clauses");
		this.inOrder = builder.inOrder;
		this.slop = builder.slop;

	}

	public static SpanNearQuery of(Function<Builder, ObjectBuilder<SpanNearQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanNear;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanNear;
	}

	/**
	 * Required - API name: {@code clauses}
	 */
	public final List<SpanQuery> clauses() {
		return this.clauses;
	}

	/**
	 * API name: {@code in_order}
	 */
	@Nullable
	public final Boolean inOrder() {
		return this.inOrder;
	}

	/**
	 * API name: {@code slop}
	 */
	@Nullable
	public final Integer slop() {
		return this.slop;
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
		if (this.inOrder != null) {
			generator.writeKey("in_order");
			generator.write(this.inOrder);

		}
		if (this.slop != null) {
			generator.writeKey("slop");
			generator.write(this.slop);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanNearQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanNearQuery> {
		private List<SpanQuery> clauses;

		@Nullable
		private Boolean inOrder;

		@Nullable
		private Integer slop;

		/**
		 * Required - API name: {@code clauses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clauses</code>.
		 */
		public final Builder clauses(List<SpanQuery> list) {
			this.clauses = _listAddAll(this.clauses, list);
			return this;
		}

		/**
		 * Required - API name: {@code clauses}
		 * <p>
		 * Adds one or more values to <code>clauses</code>.
		 */
		public final Builder clauses(SpanQuery value, SpanQuery... values) {
			this.clauses = _listAdd(this.clauses, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code clauses}
		 * <p>
		 * Adds a value to <code>clauses</code> using a builder lambda.
		 */
		public final Builder clauses(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return clauses(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * API name: {@code in_order}
		 */
		public final Builder inOrder(@Nullable Boolean value) {
			this.inOrder = value;
			return this;
		}

		/**
		 * API name: {@code slop}
		 */
		public final Builder slop(@Nullable Integer value) {
			this.slop = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanNearQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanNearQuery build() {
			_checkSingleUse();

			return new SpanNearQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanNearQuery}
	 */
	public static final JsonpDeserializer<SpanNearQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanNearQuery::setupSpanNearQueryDeserializer);

	protected static void setupSpanNearQueryDeserializer(ObjectDeserializer<SpanNearQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::clauses, JsonpDeserializer.arrayDeserializer(SpanQuery._DESERIALIZER), "clauses");
		op.add(Builder::inOrder, JsonpDeserializer.booleanDeserializer(), "in_order");
		op.add(Builder::slop, JsonpDeserializer.integerDeserializer(), "slop");

	}

}
