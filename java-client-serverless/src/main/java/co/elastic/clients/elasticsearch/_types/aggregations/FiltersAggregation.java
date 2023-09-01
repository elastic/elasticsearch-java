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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.FiltersAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.FiltersAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class FiltersAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Buckets<Query> filters;

	@Nullable
	private final Boolean otherBucket;

	@Nullable
	private final String otherBucketKey;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private FiltersAggregation(Builder builder) {
		super(builder);

		this.filters = builder.filters;
		this.otherBucket = builder.otherBucket;
		this.otherBucketKey = builder.otherBucketKey;
		this.keyed = builder.keyed;

	}

	public static FiltersAggregation of(Function<Builder, ObjectBuilder<FiltersAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Filters;
	}

	/**
	 * Collection of queries from which to build buckets.
	 * <p>
	 * API name: {@code filters}
	 */
	@Nullable
	public final Buckets<Query> filters() {
		return this.filters;
	}

	/**
	 * Set to <code>true</code> to add a bucket to the response which will contain
	 * all documents that do not match any of the given filters.
	 * <p>
	 * API name: {@code other_bucket}
	 */
	@Nullable
	public final Boolean otherBucket() {
		return this.otherBucket;
	}

	/**
	 * The key with which the other bucket is returned.
	 * <p>
	 * API name: {@code other_bucket_key}
	 */
	@Nullable
	public final String otherBucketKey() {
		return this.otherBucketKey;
	}

	/**
	 * By default, the named filters aggregation returns the buckets as an object.
	 * Set to <code>false</code> to return the buckets as an array of objects.
	 * <p>
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.filters != null) {
			generator.writeKey("filters");
			this.filters.serialize(generator, mapper);

		}
		if (this.otherBucket != null) {
			generator.writeKey("other_bucket");
			generator.write(this.otherBucket);

		}
		if (this.otherBucketKey != null) {
			generator.writeKey("other_bucket_key");
			generator.write(this.otherBucketKey);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FiltersAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FiltersAggregation> {
		@Nullable
		private Buckets<Query> filters;

		@Nullable
		private Boolean otherBucket;

		@Nullable
		private String otherBucketKey;

		@Nullable
		private Boolean keyed;

		/**
		 * Collection of queries from which to build buckets.
		 * <p>
		 * API name: {@code filters}
		 */
		public final Builder filters(@Nullable Buckets<Query> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Collection of queries from which to build buckets.
		 * <p>
		 * API name: {@code filters}
		 */
		public final Builder filters(Function<Buckets.Builder<Query>, ObjectBuilder<Buckets<Query>>> fn) {
			return this.filters(fn.apply(new Buckets.Builder<Query>()).build());
		}

		/**
		 * Set to <code>true</code> to add a bucket to the response which will contain
		 * all documents that do not match any of the given filters.
		 * <p>
		 * API name: {@code other_bucket}
		 */
		public final Builder otherBucket(@Nullable Boolean value) {
			this.otherBucket = value;
			return this;
		}

		/**
		 * The key with which the other bucket is returned.
		 * <p>
		 * API name: {@code other_bucket_key}
		 */
		public final Builder otherBucketKey(@Nullable String value) {
			this.otherBucketKey = value;
			return this;
		}

		/**
		 * By default, the named filters aggregation returns the buckets as an object.
		 * Set to <code>false</code> to return the buckets as an array of objects.
		 * <p>
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FiltersAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FiltersAggregation build() {
			_checkSingleUse();

			return new FiltersAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FiltersAggregation}
	 */
	public static final JsonpDeserializer<FiltersAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FiltersAggregation::setupFiltersAggregationDeserializer);

	protected static void setupFiltersAggregationDeserializer(ObjectDeserializer<FiltersAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::filters, Buckets.createBucketsDeserializer(Query._DESERIALIZER), "filters");
		op.add(Builder::otherBucket, JsonpDeserializer.booleanDeserializer(), "other_bucket");
		op.add(Builder::otherBucketKey, JsonpDeserializer.stringDeserializer(), "other_bucket_key");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
