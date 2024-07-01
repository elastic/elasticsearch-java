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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyAggregate;
import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyAggregateVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Void;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.aggregations.UnmappedTermsAggregate

/**
 * Result of a <code>terms</code> aggregation when the field is unmapped.
 * <code>buckets</code> is always empty.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.UnmappedTermsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class UnmappedTermsAggregate extends TermsAggregateBase<Void>
		implements
			AggregateVariant,
			ApiKeyAggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private UnmappedTermsAggregate(Builder builder) {
		super(builder);

	}

	public static UnmappedTermsAggregate of(Function<Builder, ObjectBuilder<UnmappedTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Umterms;
	}

	/**
	 * ApiKeyAggregate variant kind.
	 */
	@Override
	public ApiKeyAggregate.Kind _apiKeyAggregateKind() {
		return ApiKeyAggregate.Kind.Umterms;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnmappedTermsAggregate}.
	 */

	public static class Builder extends TermsAggregateBase.AbstractBuilder<Void, Builder>
			implements
				ObjectBuilder<UnmappedTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UnmappedTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnmappedTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new UnmappedTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UnmappedTermsAggregate}
	 */
	public static final JsonpDeserializer<UnmappedTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UnmappedTermsAggregate::setupUnmappedTermsAggregateDeserializer);

	protected static void setupUnmappedTermsAggregateDeserializer(
			ObjectDeserializer<UnmappedTermsAggregate.Builder> op) {
		TermsAggregateBase.setupTermsAggregateBaseDeserializer(op, JsonpDeserializer.voidDeserializer());

	}

}
