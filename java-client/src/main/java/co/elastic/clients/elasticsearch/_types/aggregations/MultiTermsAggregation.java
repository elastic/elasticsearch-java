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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiTermsAggregation
public final class MultiTermsAggregation extends BucketAggregationBase {
	private final List<MultiTermLookup> terms;

	// ---------------------------------------------------------------------------------------------

	protected MultiTermsAggregation(Builder builder) {
		super(builder);
		this.terms = Objects.requireNonNull(builder.terms, "terms");

	}

	/**
	 * API name: {@code terms}
	 */
	public List<MultiTermLookup> terms() {
		return this.terms;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("terms");
		generator.writeStartArray();
		for (MultiTermLookup item0 : this.terms) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiTermsAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MultiTermsAggregation> {
		private List<MultiTermLookup> terms;

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(List<MultiTermLookup> value) {
			this.terms = value;
			return this;
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(MultiTermLookup... value) {
			this.terms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #terms(List)}, creating the list if needed.
		 */
		public Builder addTerms(MultiTermLookup value) {
			if (this.terms == null) {
				this.terms = new ArrayList<>();
			}
			this.terms.add(value);
			return this;
		}

		/**
		 * Set {@link #terms(List)} to a singleton list.
		 */
		public Builder terms(Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>> fn) {
			return this.terms(fn.apply(new MultiTermLookup.Builder()).build());
		}

		/**
		 * Add a value to {@link #terms(List)}, creating the list if needed.
		 */
		public Builder addTerms(Function<MultiTermLookup.Builder, ObjectBuilder<MultiTermLookup>> fn) {
			return this.addTerms(fn.apply(new MultiTermLookup.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiTermsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiTermsAggregation build() {

			return new MultiTermsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MultiTermsAggregation
	 */
	public static final JsonpDeserializer<MultiTermsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MultiTermsAggregation::setupMultiTermsAggregationDeserializer);

	protected static void setupMultiTermsAggregationDeserializer(
			DelegatingDeserializer<MultiTermsAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(MultiTermLookup.DESERIALIZER), "terms");

	}

}
