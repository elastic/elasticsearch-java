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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.SignificantLongTermsAggregate
@JsonpDeserializable
public class SignificantLongTermsAggregate extends MultiBucketAggregateBase<SignificantLongTermsBucket>
		implements
			AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private SignificantLongTermsAggregate(Builder builder) {
		super(builder);

	}

	public static SignificantLongTermsAggregate of(Function<Builder, ObjectBuilder<SignificantLongTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "siglterms";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantLongTermsAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<SignificantLongTermsBucket, Builder>
			implements
				ObjectBuilder<SignificantLongTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantLongTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantLongTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new SignificantLongTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantLongTermsAggregate}
	 */
	public static final JsonpDeserializer<SignificantLongTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, SignificantLongTermsAggregate::setupSignificantLongTermsAggregateDeserializer,
			Builder::build);

	protected static void setupSignificantLongTermsAggregateDeserializer(
			DelegatingDeserializer<SignificantLongTermsAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op,
				SignificantLongTermsBucket._DESERIALIZER);

	}

}
