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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MultiBucketAggregateBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MultiBucketAggregateBase">API
 *      specification</a>
 */

public abstract class MultiBucketAggregateBase<TBucket> extends AggregateBase {
	private final Buckets<TBucket> buckets;

	@Nullable
	private final JsonpSerializer<TBucket> tBucketSerializer;

	// ---------------------------------------------------------------------------------------------

	protected MultiBucketAggregateBase(AbstractBuilder<TBucket, ?> builder) {
		super(builder);

		this.buckets = ApiTypeHelper.requireNonNull(builder.buckets, this, "buckets");
		this.tBucketSerializer = builder.tBucketSerializer;

	}

	/**
	 * Required - API name: {@code buckets}
	 */
	public final Buckets<TBucket> buckets() {
		return this.buckets;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("buckets");
		this.buckets.serialize(generator, mapper);

	}

	public abstract static class AbstractBuilder<TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>>
			extends
				AggregateBase.AbstractBuilder<BuilderT> {
		private Buckets<TBucket> buckets;

		@Nullable
		private JsonpSerializer<TBucket> tBucketSerializer;

		/**
		 * Required - API name: {@code buckets}
		 */
		public final BuilderT buckets(Buckets<TBucket> value) {
			this.buckets = value;
			return self();
		}

		/**
		 * Required - API name: {@code buckets}
		 */
		public final BuilderT buckets(Function<Buckets.Builder<TBucket>, ObjectBuilder<Buckets<TBucket>>> fn) {
			return this.buckets(fn.apply(new Buckets.Builder<TBucket>()).build());
		}

		/**
		 * Serializer for TBucket. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tBucketSerializer(@Nullable JsonpSerializer<TBucket> value) {
			this.tBucketSerializer = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>> void setupMultiBucketAggregateBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TBucket> tBucketDeserializer) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(AbstractBuilder::buckets, Buckets.createBucketsDeserializer(tBucketDeserializer), "buckets");

	}

}
