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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.LongRareTermsAggregate

/**
 * Result of the <code>rare_terms</code> aggregation when the field is some kind
 * of whole number like a integer, long, or a date.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.LongRareTermsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class LongRareTermsAggregate extends MultiBucketAggregateBase<LongRareTermsBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private LongRareTermsAggregate(Builder builder) {
		super(builder);

	}

	public static LongRareTermsAggregate of(Function<Builder, ObjectBuilder<LongRareTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Lrareterms;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LongRareTermsAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<LongRareTermsBucket, Builder>
			implements
				ObjectBuilder<LongRareTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LongRareTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LongRareTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new LongRareTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LongRareTermsAggregate}
	 */
	public static final JsonpDeserializer<LongRareTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LongRareTermsAggregate::setupLongRareTermsAggregateDeserializer);

	protected static void setupLongRareTermsAggregateDeserializer(
			ObjectDeserializer<LongRareTermsAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, LongRareTermsBucket._DESERIALIZER);

	}

}
