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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketPathAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketPathAggregation">API
 *      specification</a>
 */

public abstract class BucketPathAggregation extends AggregationBase {
	@Nullable
	private final BucketsPath bucketsPath;

	// ---------------------------------------------------------------------------------------------

	protected BucketPathAggregation(AbstractBuilder<?> builder) {
		super(builder);

		this.bucketsPath = builder.bucketsPath;

	}

	/**
	 * Path to the buckets that contain one set of values to correlate.
	 * <p>
	 * API name: {@code buckets_path}
	 */
	@Nullable
	public final BucketsPath bucketsPath() {
		return this.bucketsPath;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.bucketsPath != null) {
			generator.writeKey("buckets_path");
			this.bucketsPath.serialize(generator, mapper);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private BucketsPath bucketsPath;

		/**
		 * Path to the buckets that contain one set of values to correlate.
		 * <p>
		 * API name: {@code buckets_path}
		 */
		public final BuilderT bucketsPath(@Nullable BucketsPath value) {
			this.bucketsPath = value;
			return self();
		}

		/**
		 * Path to the buckets that contain one set of values to correlate.
		 * <p>
		 * API name: {@code buckets_path}
		 */
		public final BuilderT bucketsPath(Function<BucketsPath.Builder, ObjectBuilder<BucketsPath>> fn) {
			return this.bucketsPath(fn.apply(new BucketsPath.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBucketPathAggregationDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(AbstractBuilder::bucketsPath, BucketsPath._DESERIALIZER, "buckets_path");

	}

}
