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
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: _types.aggregations.ChangePointAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ChangePointAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChangePointAggregate extends AggregateBase implements AggregateVariant {
	private final ChangeType type;

	@Nullable
	private final ChangePointBucket bucket;

	// ---------------------------------------------------------------------------------------------

	private ChangePointAggregate(Builder builder) {
		super(builder);

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.bucket = builder.bucket;

	}

	public static ChangePointAggregate of(Function<Builder, ObjectBuilder<ChangePointAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.ChangePoint;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final ChangeType type() {
		return this.type;
	}

	/**
	 * API name: {@code bucket}
	 */
	@Nullable
	public final ChangePointBucket bucket() {
		return this.bucket;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		if (this.bucket != null) {
			generator.writeKey("bucket");
			this.bucket.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChangePointAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ChangePointAggregate> {
		private ChangeType type;

		@Nullable
		private ChangePointBucket bucket;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(ChangeType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(Function<ChangeType.Builder, ObjectBuilder<ChangeType>> fn) {
			return this.type(fn.apply(new ChangeType.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(ChangeTypeVariant value) {
			this.type = value._toChangeType();
			return this;
		}

		/**
		 * API name: {@code bucket}
		 */
		public final Builder bucket(@Nullable ChangePointBucket value) {
			this.bucket = value;
			return this;
		}

		/**
		 * API name: {@code bucket}
		 */
		public final Builder bucket(Function<ChangePointBucket.Builder, ObjectBuilder<ChangePointBucket>> fn) {
			return this.bucket(fn.apply(new ChangePointBucket.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChangePointAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChangePointAggregate build() {
			_checkSingleUse();

			return new ChangePointAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChangePointAggregate}
	 */
	public static final JsonpDeserializer<ChangePointAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChangePointAggregate::setupChangePointAggregateDeserializer);

	protected static void setupChangePointAggregateDeserializer(ObjectDeserializer<ChangePointAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::type, ChangeType._DESERIALIZER, "type");
		op.add(Builder::bucket, ChangePointBucket._DESERIALIZER, "bucket");

	}

}
