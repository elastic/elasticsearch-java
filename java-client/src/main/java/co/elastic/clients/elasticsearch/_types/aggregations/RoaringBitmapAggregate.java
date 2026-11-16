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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: _types.aggregations.RoaringBitmapAggregate

/**
 * Result of the <code>roaring_bitmap</code> aggregation.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RoaringBitmapAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoaringBitmapAggregate extends AggregateBase implements AggregateVariant {
	@Nullable
	private final String value;

	// ---------------------------------------------------------------------------------------------

	private RoaringBitmapAggregate(Builder builder) {
		super(builder);

		this.value = builder.value;

	}

	public static RoaringBitmapAggregate of(Function<Builder, ObjectBuilder<RoaringBitmapAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.RoaringBitmap;
	}

	/**
	 * The distinct values of the field, as a base64-encoded portable roaring
	 * bitmap. It is <code>null</code> if the field is unmapped.
	 * <p>
	 * API name: {@code value}
	 */
	@Nullable
	public final String value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.value != null) {
			generator.writeKey("value");
			generator.write(this.value);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoaringBitmapAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RoaringBitmapAggregate> {
		@Nullable
		private String value;

		public Builder() {
		}
		private Builder(RoaringBitmapAggregate instance) {
			super(instance);
			this.value = instance.value;

		}
		/**
		 * The distinct values of the field, as a base64-encoded portable roaring
		 * bitmap. It is <code>null</code> if the field is unmapped.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(@Nullable String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RoaringBitmapAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoaringBitmapAggregate build() {
			_checkSingleUse();

			return new RoaringBitmapAggregate(this);
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
	 * Json deserializer for {@link RoaringBitmapAggregate}
	 */
	public static final JsonpDeserializer<RoaringBitmapAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RoaringBitmapAggregate::setupRoaringBitmapAggregateDeserializer);

	protected static void setupRoaringBitmapAggregateDeserializer(
			ObjectDeserializer<RoaringBitmapAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
