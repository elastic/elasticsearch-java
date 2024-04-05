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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _types.aggregations.BucketPathAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.BucketPathAggregation">API
 *      specification</a>
 */

public abstract class BucketPathAggregation extends AggregationBase implements JsonpSerializable {
	@Nullable
	private final BucketsPath bucketsPath;

	// ---------------------------------------------------------------------------------------------

	protected BucketPathAggregation(AbstractBuilder<?> builder) {

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

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.bucketsPath != null) {
			generator.writeKey("buckets_path");
			this.bucketsPath.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
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

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupBucketPathAggregationDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::bucketsPath, BucketsPath._DESERIALIZER, "buckets_path");

	}

}
