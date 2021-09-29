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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_overall_buckets.Response
@JsonpDeserializable
public final class GetOverallBucketsResponse implements JsonpSerializable {
	private final long count;

	private final List<OverallBucket> overallBuckets;

	// ---------------------------------------------------------------------------------------------

	public GetOverallBucketsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.overallBuckets = ModelTypeHelper.unmodifiableNonNull(builder.overallBuckets, "overall_buckets");

	}

	public GetOverallBucketsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Array of overall bucket objects
	 * <p>
	 * API name: {@code overall_buckets}
	 */
	public List<OverallBucket> overallBuckets() {
		return this.overallBuckets;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("overall_buckets");
		generator.writeStartArray();
		for (OverallBucket item0 : this.overallBuckets) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetOverallBucketsResponse> {
		private Long count;

		private List<OverallBucket> overallBuckets;

		/**
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Array of overall bucket objects
		 * <p>
		 * API name: {@code overall_buckets}
		 */
		public Builder overallBuckets(List<OverallBucket> value) {
			this.overallBuckets = value;
			return this;
		}

		/**
		 * Array of overall bucket objects
		 * <p>
		 * API name: {@code overall_buckets}
		 */
		public Builder overallBuckets(OverallBucket... value) {
			this.overallBuckets = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #overallBuckets(List)}, creating the list if needed. 4
		 */
		public Builder addOverallBuckets(OverallBucket value) {
			if (this.overallBuckets == null) {
				this.overallBuckets = new ArrayList<>();
			}
			this.overallBuckets.add(value);
			return this;
		}

		/**
		 * Set {@link #overallBuckets(List)} to a singleton list.
		 */
		public Builder overallBuckets(Function<OverallBucket.Builder, ObjectBuilder<OverallBucket>> fn) {
			return this.overallBuckets(fn.apply(new OverallBucket.Builder()).build());
		}

		/**
		 * Add a value to {@link #overallBuckets(List)}, creating the list if needed. 5
		 */
		public Builder addOverallBuckets(Function<OverallBucket.Builder, ObjectBuilder<OverallBucket>> fn) {
			return this.addOverallBuckets(fn.apply(new OverallBucket.Builder()).build());
		}

		/**
		 * Builds a {@link GetOverallBucketsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetOverallBucketsResponse build() {

			return new GetOverallBucketsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetOverallBucketsResponse}
	 */
	public static final JsonpDeserializer<GetOverallBucketsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetOverallBucketsResponse::setupGetOverallBucketsResponseDeserializer, Builder::build);

	protected static void setupGetOverallBucketsResponseDeserializer(
			DelegatingDeserializer<GetOverallBucketsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::overallBuckets, JsonpDeserializer.arrayDeserializer(OverallBucket._DESERIALIZER),
				"overall_buckets");

	}

}
