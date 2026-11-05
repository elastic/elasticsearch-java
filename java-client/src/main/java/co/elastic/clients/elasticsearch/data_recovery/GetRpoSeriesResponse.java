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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.data_recovery.get_rpo_series.RpoBucket;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.List;
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

// typedef: data_recovery.get_rpo_series.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.get_rpo_series.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRpoSeriesResponse implements JsonpSerializable {
	private final DateTime start;

	private final DateTime end;

	private final Time bucketDuration;

	private final int bucketCount;

	private final List<RpoBucket> buckets;

	// ---------------------------------------------------------------------------------------------

	private GetRpoSeriesResponse(Builder builder) {

		this.start = ApiTypeHelper.requireNonNull(builder.start, this, "start");
		this.end = ApiTypeHelper.requireNonNull(builder.end, this, "end");
		this.bucketDuration = ApiTypeHelper.requireNonNull(builder.bucketDuration, this, "bucketDuration");
		this.bucketCount = ApiTypeHelper.requireNonNull(builder.bucketCount, this, "bucketCount", 0);
		this.buckets = ApiTypeHelper.unmodifiableRequired(builder.buckets, this, "buckets");

	}

	public static GetRpoSeriesResponse of(Function<Builder, ObjectBuilder<GetRpoSeriesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The inclusive start of the range.
	 * <p>
	 * API name: {@code start}
	 */
	public final DateTime start() {
		return this.start;
	}

	/**
	 * Required - The exclusive end of the range.
	 * <p>
	 * API name: {@code end}
	 */
	public final DateTime end() {
		return this.end;
	}

	/**
	 * Required - The duration of each bucket.
	 * <p>
	 * API name: {@code bucket_duration}
	 */
	public final Time bucketDuration() {
		return this.bucketDuration;
	}

	/**
	 * Required - The number of buckets in the series.
	 * <p>
	 * API name: {@code bucket_count}
	 */
	public final int bucketCount() {
		return this.bucketCount;
	}

	/**
	 * Required - The buckets in ascending order by start time.
	 * <p>
	 * API name: {@code buckets}
	 */
	public final List<RpoBucket> buckets() {
		return this.buckets;
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

		generator.writeKey("start");
		this.start.serialize(generator, mapper);
		generator.writeKey("end");
		this.end.serialize(generator, mapper);
		generator.writeKey("bucket_duration");
		this.bucketDuration.serialize(generator, mapper);

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount);

		if (ApiTypeHelper.isDefined(this.buckets)) {
			generator.writeKey("buckets");
			generator.writeStartArray();
			for (RpoBucket item0 : this.buckets) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRpoSeriesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRpoSeriesResponse> {
		private DateTime start;

		private DateTime end;

		private Time bucketDuration;

		private Integer bucketCount;

		private List<RpoBucket> buckets;

		/**
		 * Required - The inclusive start of the range.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(DateTime value) {
			this.start = value;
			return this;
		}

		/**
		 * Required - The exclusive end of the range.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * Required - The duration of each bucket.
		 * <p>
		 * API name: {@code bucket_duration}
		 */
		public final Builder bucketDuration(Time value) {
			this.bucketDuration = value;
			return this;
		}

		/**
		 * Required - The duration of each bucket.
		 * <p>
		 * API name: {@code bucket_duration}
		 */
		public final Builder bucketDuration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.bucketDuration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The number of buckets in the series.
		 * <p>
		 * API name: {@code bucket_count}
		 */
		public final Builder bucketCount(int value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * Required - The buckets in ascending order by start time.
		 * <p>
		 * API name: {@code buckets}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>buckets</code>.
		 */
		public final Builder buckets(List<RpoBucket> list) {
			this.buckets = _listAddAll(this.buckets, list);
			return this;
		}

		/**
		 * Required - The buckets in ascending order by start time.
		 * <p>
		 * API name: {@code buckets}
		 * <p>
		 * Adds one or more values to <code>buckets</code>.
		 */
		public final Builder buckets(RpoBucket value, RpoBucket... values) {
			this.buckets = _listAdd(this.buckets, value, values);
			return this;
		}

		/**
		 * Required - The buckets in ascending order by start time.
		 * <p>
		 * API name: {@code buckets}
		 * <p>
		 * Adds a value to <code>buckets</code> using a builder lambda.
		 */
		public final Builder buckets(Function<RpoBucket.Builder, ObjectBuilder<RpoBucket>> fn) {
			return buckets(fn.apply(new RpoBucket.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRpoSeriesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRpoSeriesResponse build() {
			_checkSingleUse();

			return new GetRpoSeriesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRpoSeriesResponse}
	 */
	public static final JsonpDeserializer<GetRpoSeriesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRpoSeriesResponse::setupGetRpoSeriesResponseDeserializer);

	protected static void setupGetRpoSeriesResponseDeserializer(ObjectDeserializer<GetRpoSeriesResponse.Builder> op) {

		op.add(Builder::start, DateTime._DESERIALIZER, "start");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::bucketDuration, Time._DESERIALIZER, "bucket_duration");
		op.add(Builder::bucketCount, JsonpDeserializer.integerDeserializer(), "bucket_count");
		op.add(Builder::buckets, JsonpDeserializer.arrayDeserializer(RpoBucket._DESERIALIZER), "buckets");

	}

}
