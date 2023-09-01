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

import co.elastic.clients.elasticsearch._types.GeoBounds;
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

// typedef: _types.aggregations.GeoBoundsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GeoBoundsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoBoundsAggregate extends AggregateBase implements AggregateVariant {
	@Nullable
	private final GeoBounds bounds;

	// ---------------------------------------------------------------------------------------------

	private GeoBoundsAggregate(Builder builder) {
		super(builder);

		this.bounds = builder.bounds;

	}

	public static GeoBoundsAggregate of(Function<Builder, ObjectBuilder<GeoBoundsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.GeoBounds;
	}

	/**
	 * API name: {@code bounds}
	 */
	@Nullable
	public final GeoBounds bounds() {
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
	 * Builder for {@link GeoBoundsAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoBoundsAggregate> {
		@Nullable
		private GeoBounds bounds;

		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(@Nullable GeoBounds value) {
			this.bounds = value;
			return this;
		}

		/**
		 * API name: {@code bounds}
		 */
		public final Builder bounds(Function<GeoBounds.Builder, ObjectBuilder<GeoBounds>> fn) {
			return this.bounds(fn.apply(new GeoBounds.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoBoundsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoBoundsAggregate build() {
			_checkSingleUse();

			return new GeoBoundsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoBoundsAggregate}
	 */
	public static final JsonpDeserializer<GeoBoundsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoBoundsAggregate::setupGeoBoundsAggregateDeserializer);

	protected static void setupGeoBoundsAggregateDeserializer(ObjectDeserializer<GeoBoundsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::bounds, GeoBounds._DESERIALIZER, "bounds");

	}

}
