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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.query_dsl.MatchAllQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.MatchAllQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatchAllQuery extends QueryBase implements QueryVariant {
	// ---------------------------------------------------------------------------------------------

	private MatchAllQuery(Builder builder) {
		super(builder);

	}

	public static MatchAllQuery of(Function<Builder, ObjectBuilder<MatchAllQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.MatchAll;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatchAllQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MatchAllQuery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatchAllQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatchAllQuery build() {
			_checkSingleUse();

			return new MatchAllQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatchAllQuery}
	 */
	public static final JsonpDeserializer<MatchAllQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MatchAllQuery::setupMatchAllQueryDeserializer);

	protected static void setupMatchAllQueryDeserializer(ObjectDeserializer<MatchAllQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

	}

}
