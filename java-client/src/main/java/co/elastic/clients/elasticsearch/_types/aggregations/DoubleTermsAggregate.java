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

// typedef: _types.aggregations.DoubleTermsAggregate

/**
 * Result of a <code>terms</code> aggregation when the field is some kind of
 * decimal number like a float, double, or distance.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.DoubleTermsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class DoubleTermsAggregate extends TermsAggregateBase<DoubleTermsBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private DoubleTermsAggregate(Builder builder) {
		super(builder);

	}

	public static DoubleTermsAggregate of(Function<Builder, ObjectBuilder<DoubleTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Dterms;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DoubleTermsAggregate}.
	 */

	public static class Builder extends TermsAggregateBase.AbstractBuilder<DoubleTermsBucket, Builder>
			implements
				ObjectBuilder<DoubleTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DoubleTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DoubleTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new DoubleTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DoubleTermsAggregate}
	 */
	public static final JsonpDeserializer<DoubleTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DoubleTermsAggregate::setupDoubleTermsAggregateDeserializer);

	protected static void setupDoubleTermsAggregateDeserializer(ObjectDeserializer<DoubleTermsAggregate.Builder> op) {
		TermsAggregateBase.setupTermsAggregateBaseDeserializer(op, DoubleTermsBucket._DESERIALIZER);

	}

}
