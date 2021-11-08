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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_buckets.Response
@JsonpDeserializable
public class GetBucketsResponse implements JsonpSerializable {
	private final List<BucketSummary> buckets;

	private final long count;

	// ---------------------------------------------------------------------------------------------

	private GetBucketsResponse(Builder builder) {

		this.buckets = ModelTypeHelper.unmodifiableRequired(builder.buckets, this, "buckets");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static GetBucketsResponse of(Function<Builder, ObjectBuilder<GetBucketsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code buckets}
	 */
	public final List<BucketSummary> buckets() {
		return this.buckets;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
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

		if (ModelTypeHelper.isDefined(this.buckets)) {
			generator.writeKey("buckets");
			generator.writeStartArray();
			for (BucketSummary item0 : this.buckets) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("count");
		generator.write(this.count);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetBucketsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetBucketsResponse> {
		private List<BucketSummary> buckets;

		private Long count;

		/**
		 * Required - API name: {@code buckets}
		 */
		public final Builder buckets(List<BucketSummary> value) {
			this.buckets = value;
			return this;
		}

		/**
		 * Required - API name: {@code buckets}
		 */
		public final Builder buckets(BucketSummary... value) {
			this.buckets = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code buckets}
		 */
		@SafeVarargs
		public final Builder buckets(Function<BucketSummary.Builder, ObjectBuilder<BucketSummary>>... fns) {
			this.buckets = new ArrayList<>(fns.length);
			for (Function<BucketSummary.Builder, ObjectBuilder<BucketSummary>> fn : fns) {
				this.buckets.add(fn.apply(new BucketSummary.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link GetBucketsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetBucketsResponse build() {
			_checkSingleUse();

			return new GetBucketsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetBucketsResponse}
	 */
	public static final JsonpDeserializer<GetBucketsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetBucketsResponse::setupGetBucketsResponseDeserializer, Builder::build);

	protected static void setupGetBucketsResponseDeserializer(DelegatingDeserializer<GetBucketsResponse.Builder> op) {

		op.add(Builder::buckets, JsonpDeserializer.arrayDeserializer(BucketSummary._DESERIALIZER), "buckets");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
