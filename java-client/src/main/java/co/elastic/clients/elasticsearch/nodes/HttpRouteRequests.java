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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: nodes._types.HttpRouteRequests

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.HttpRouteRequests">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpRouteRequests implements JsonpSerializable {
	private final long count;

	private final long totalSizeInBytes;

	private final List<SizeHttpHistogram> sizeHistogram;

	// ---------------------------------------------------------------------------------------------

	private HttpRouteRequests(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.totalSizeInBytes = ApiTypeHelper.requireNonNull(builder.totalSizeInBytes, this, "totalSizeInBytes", 0);
		this.sizeHistogram = ApiTypeHelper.unmodifiableRequired(builder.sizeHistogram, this, "sizeHistogram");

	}

	public static HttpRouteRequests of(Function<Builder, ObjectBuilder<HttpRouteRequests>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code total_size_in_bytes}
	 */
	public final long totalSizeInBytes() {
		return this.totalSizeInBytes;
	}

	/**
	 * Required - API name: {@code size_histogram}
	 */
	public final List<SizeHttpHistogram> sizeHistogram() {
		return this.sizeHistogram;
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

		generator.writeKey("total_size_in_bytes");
		generator.write(this.totalSizeInBytes);

		if (ApiTypeHelper.isDefined(this.sizeHistogram)) {
			generator.writeKey("size_histogram");
			generator.writeStartArray();
			for (SizeHttpHistogram item0 : this.sizeHistogram) {
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
	 * Builder for {@link HttpRouteRequests}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HttpRouteRequests> {
		private Long count;

		private Long totalSizeInBytes;

		private List<SizeHttpHistogram> sizeHistogram;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_size_in_bytes}
		 */
		public final Builder totalSizeInBytes(long value) {
			this.totalSizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_histogram}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sizeHistogram</code>.
		 */
		public final Builder sizeHistogram(List<SizeHttpHistogram> list) {
			this.sizeHistogram = _listAddAll(this.sizeHistogram, list);
			return this;
		}

		/**
		 * Required - API name: {@code size_histogram}
		 * <p>
		 * Adds one or more values to <code>sizeHistogram</code>.
		 */
		public final Builder sizeHistogram(SizeHttpHistogram value, SizeHttpHistogram... values) {
			this.sizeHistogram = _listAdd(this.sizeHistogram, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code size_histogram}
		 * <p>
		 * Adds a value to <code>sizeHistogram</code> using a builder lambda.
		 */
		public final Builder sizeHistogram(Function<SizeHttpHistogram.Builder, ObjectBuilder<SizeHttpHistogram>> fn) {
			return sizeHistogram(fn.apply(new SizeHttpHistogram.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HttpRouteRequests}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpRouteRequests build() {
			_checkSingleUse();

			return new HttpRouteRequests(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpRouteRequests}
	 */
	public static final JsonpDeserializer<HttpRouteRequests> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HttpRouteRequests::setupHttpRouteRequestsDeserializer);

	protected static void setupHttpRouteRequestsDeserializer(ObjectDeserializer<HttpRouteRequests.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::totalSizeInBytes, JsonpDeserializer.longDeserializer(), "total_size_in_bytes");
		op.add(Builder::sizeHistogram, JsonpDeserializer.arrayDeserializer(SizeHttpHistogram._DESERIALIZER),
				"size_histogram");

	}

}
