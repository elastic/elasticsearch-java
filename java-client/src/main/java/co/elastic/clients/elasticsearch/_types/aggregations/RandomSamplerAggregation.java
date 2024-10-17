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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
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

// typedef: _types.aggregations.RandomSamplerAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.RandomSamplerAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RandomSamplerAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	private final double probability;

	@Nullable
	private final Integer seed;

	@Nullable
	private final Integer shardSeed;

	// ---------------------------------------------------------------------------------------------

	private RandomSamplerAggregation(Builder builder) {

		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.seed = builder.seed;
		this.shardSeed = builder.shardSeed;

	}

	public static RandomSamplerAggregation of(Function<Builder, ObjectBuilder<RandomSamplerAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.RandomSampler;
	}

	/**
	 * Required - The probability that a document will be included in the aggregated
	 * data. Must be greater than 0, less than 0.5, or exactly 1. The lower the
	 * probability, the fewer documents are matched.
	 * <p>
	 * API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * The seed to generate the random sampling of documents. When a seed is
	 * provided, the random subset of documents is the same between calls.
	 * <p>
	 * API name: {@code seed}
	 */
	@Nullable
	public final Integer seed() {
		return this.seed;
	}

	/**
	 * When combined with seed, setting shard_seed ensures 100% consistent sampling
	 * over shards where data is exactly the same.
	 * <p>
	 * API name: {@code shard_seed}
	 */
	@Nullable
	public final Integer shardSeed() {
		return this.shardSeed;
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

		generator.writeKey("probability");
		generator.write(this.probability);

		if (this.seed != null) {
			generator.writeKey("seed");
			generator.write(this.seed);

		}
		if (this.shardSeed != null) {
			generator.writeKey("shard_seed");
			generator.write(this.shardSeed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RandomSamplerAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RandomSamplerAggregation> {
		private Double probability;

		@Nullable
		private Integer seed;

		@Nullable
		private Integer shardSeed;

		/**
		 * Required - The probability that a document will be included in the aggregated
		 * data. Must be greater than 0, less than 0.5, or exactly 1. The lower the
		 * probability, the fewer documents are matched.
		 * <p>
		 * API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * The seed to generate the random sampling of documents. When a seed is
		 * provided, the random subset of documents is the same between calls.
		 * <p>
		 * API name: {@code seed}
		 */
		public final Builder seed(@Nullable Integer value) {
			this.seed = value;
			return this;
		}

		/**
		 * When combined with seed, setting shard_seed ensures 100% consistent sampling
		 * over shards where data is exactly the same.
		 * <p>
		 * API name: {@code shard_seed}
		 */
		public final Builder shardSeed(@Nullable Integer value) {
			this.shardSeed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RandomSamplerAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RandomSamplerAggregation build() {
			_checkSingleUse();

			return new RandomSamplerAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RandomSamplerAggregation}
	 */
	public static final JsonpDeserializer<RandomSamplerAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RandomSamplerAggregation::setupRandomSamplerAggregationDeserializer);

	protected static void setupRandomSamplerAggregationDeserializer(
			ObjectDeserializer<RandomSamplerAggregation.Builder> op) {

		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::seed, JsonpDeserializer.integerDeserializer(), "seed");
		op.add(Builder::shardSeed, JsonpDeserializer.integerDeserializer(), "shard_seed");

	}

}
