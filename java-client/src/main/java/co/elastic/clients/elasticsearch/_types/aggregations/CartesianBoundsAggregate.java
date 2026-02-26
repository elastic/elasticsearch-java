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

import co.elastic.clients.elasticsearch._types.TopLeftBottomRightGeoBounds;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.aggregations.CartesianBoundsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CartesianBoundsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class CartesianBoundsAggregate extends AggregateBase implements AggregateVariant {
	@Nullable
	private final TopLeftBottomRightGeoBounds bounds;

	// ---------------------------------------------------------------------------------------------

	private CartesianBoundsAggregate(Builder builder) {
		super(builder);

		this.bounds = builder.bounds;

	}

	public static CartesianBoundsAggregate of(Function<Builder, ObjectBuilder<CartesianBoundsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.CartesianBounds;
	}

	/**
	 * API name: {@code bounds}
	 */
	@Nullable
	public final TopLeftBottomRightGeoBounds bounds() {
		return this.bounds;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.bounds != null) {
			generator.writeKey("bounds");
			this.bounds.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CartesianBoundsAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CartesianBoundsAggregate> {
		@Nullable
		private TopLeftBottomRightGeoBounds bounds;

		public Builder() {
		}
		private Builder(CartesianBoundsAggregate instance) {
			this.bounds = instance.bounds;

		}
		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable TopLeftBottomRightGeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(
				Function<TopLeftBottomRightGeoBounds.Builder, ObjectBuilder<TopLeftBottomRightGeoBounds>> fn) {
			return this.bounds(fn.apply(new TopLeftBottomRightGeoBounds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CartesianBoundsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CartesianBoundsAggregate build() {
			_checkSingleUse();

			return new CartesianBoundsAggregate(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CartesianBoundsAggregate}
	 */
	public static final JsonpDeserializer<CartesianBoundsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CartesianBoundsAggregate::setupCartesianBoundsAggregateDeserializer);

	protected static void setupCartesianBoundsAggregateDeserializer(
			ObjectDeserializer<CartesianBoundsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::bounds, TopLeftBottomRightGeoBounds._DESERIALIZER, "bounds");

	}

}
