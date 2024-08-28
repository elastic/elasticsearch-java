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

// typedef: _types.query_dsl.TermRangeQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.TermRangeQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermRangeQuery extends RangeQueryBase<String> implements RangeQueryVariant {
	// Single key dictionary
	private final String field;

	// ---------------------------------------------------------------------------------------------

	private TermRangeQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

	}

	public static TermRangeQuery of(Function<Builder, ObjectBuilder<TermRangeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * RangeQuery variant kind.
	 */
	@Override
	public RangeQuery.Kind _rangeQueryKind() {
		return RangeQuery.Kind.Term;
	}

	/**
	 * Required - the required field
	 */
	public final String field() {
		return this.field;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermRangeQuery}.
	 */

	public static class Builder extends RangeQueryBase.AbstractBuilder<String, Builder>
			implements
				ObjectBuilder<TermRangeQuery> {
		private String field;

		/**
		 * Required - the required field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermRangeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermRangeQuery build() {
			_checkSingleUse();
			super.tSerializer(null);

			return new TermRangeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermRangeQuery}
	 */
	public static final JsonpDeserializer<TermRangeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermRangeQuery::setupTermRangeQueryDeserializer);

	protected static void setupTermRangeQueryDeserializer(ObjectDeserializer<TermRangeQuery.Builder> op) {
		RangeQueryBase.setupRangeQueryBaseDeserializer(op, JsonpDeserializer.stringDeserializer());

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
