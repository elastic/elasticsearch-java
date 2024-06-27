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

package co.elastic.clients.elasticsearch.security.query_api_keys;

import co.elastic.clients.elasticsearch._types.aggregations.BucketAggregationBase;
import co.elastic.clients.elasticsearch._types.aggregations.Buckets;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: security.query_api_keys.ApiKeyFiltersAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyFiltersAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKeyFiltersAggregation extends BucketAggregationBase
		implements
			ApiKeyAggregationVariant,
			JsonpSerializable {
	@Nullable
	private final Buckets<ApiKeyQuery> filters;

	@Nullable
	private final Boolean otherBucket;

	@Nullable
	private final String otherBucketKey;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private ApiKeyFiltersAggregation(Builder builder) {

		this.filters = builder.filters;
		this.otherBucket = builder.otherBucket;
		this.otherBucketKey = builder.otherBucketKey;
		this.keyed = builder.keyed;

	}

	public static ApiKeyFiltersAggregation of(Function<Builder, ObjectBuilder<ApiKeyFiltersAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ApiKeyAggregation variant kind.
	 */
	@Override
	public ApiKeyAggregation.Kind _apiKeyAggregationKind() {
		return ApiKeyAggregation.Kind.Filters;
	}

	/**
	 * Collection of queries from which to build buckets.
	 * <p>
	 * API name: {@code filters}
	 */
	@Nullable
	public final Buckets<ApiKeyQuery> filters() {
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

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApiKeyFiltersAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ApiKeyFiltersAggregation> {
		@Nullable
		private Buckets<ApiKeyQuery> filters;

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
		public final Builder filters(@Nullable Buckets<ApiKeyQuery> value) {
			this.filters = value;
			return this;
		}

		/**
		 * Collection of queries from which to build buckets.
		 * <p>
		 * API name: {@code filters}
		 */
		public final Builder filters(Function<Buckets.Builder<ApiKeyQuery>, ObjectBuilder<Buckets<ApiKeyQuery>>> fn) {
			return this.filters(fn.apply(new Buckets.Builder<ApiKeyQuery>()).build());
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
		 * Builds a {@link ApiKeyFiltersAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApiKeyFiltersAggregation build() {
			_checkSingleUse();

			return new ApiKeyFiltersAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApiKeyFiltersAggregation}
	 */
	public static final JsonpDeserializer<ApiKeyFiltersAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApiKeyFiltersAggregation::setupApiKeyFiltersAggregationDeserializer);

	protected static void setupApiKeyFiltersAggregationDeserializer(
			ObjectDeserializer<ApiKeyFiltersAggregation.Builder> op) {

		op.add(Builder::filters, Buckets.createBucketsDeserializer(ApiKeyQuery._DESERIALIZER), "filters");
		op.add(Builder::otherBucket, JsonpDeserializer.booleanDeserializer(), "other_bucket");
		op.add(Builder::otherBucketKey, JsonpDeserializer.stringDeserializer(), "other_bucket_key");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
