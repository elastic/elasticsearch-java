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

import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyQuery;
import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyQueryVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _types.query_dsl.TermsQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.TermsQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermsQuery extends QueryBase implements ApiKeyQueryVariant, QueryVariant {
	private final String field;

	private final TermsQueryField terms;

	// ---------------------------------------------------------------------------------------------

	private TermsQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.terms = ApiTypeHelper.requireNonNull(builder.terms, this, "terms");

	}

	public static TermsQuery of(Function<Builder, ObjectBuilder<TermsQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ApiKeyQuery variant kind.
	 */
	@Override
	public ApiKeyQuery.Kind _apiKeyQueryKind() {
		return ApiKeyQuery.Kind.Terms;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Terms;
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final TermsQueryField terms() {
		return this.terms;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.terms.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TermsQuery> {
		private String field;

		private TermsQueryField terms;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder terms(TermsQueryField value) {
			this.terms = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder terms(Function<TermsQueryField.Builder, ObjectBuilder<TermsQueryField>> fn) {
			return this.terms(fn.apply(new TermsQueryField.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsQuery build() {
			_checkSingleUse();

			return new TermsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsQuery}
	 */
	public static final JsonpDeserializer<TermsQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsQuery::setupTermsQueryDeserializer);

	protected static void setupTermsQueryDeserializer(ObjectDeserializer<TermsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.terms(TermsQueryField._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
