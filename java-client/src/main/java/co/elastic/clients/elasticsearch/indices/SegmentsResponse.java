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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.segments.IndexSegment;
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
import java.lang.String;
import java.util.Map;
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

// typedef: indices.segments.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.segments.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentsResponse implements JsonpSerializable {
	private final Map<String, IndexSegment> indices;

	private final ShardStatistics shards;

	// ---------------------------------------------------------------------------------------------

	private SegmentsResponse(Builder builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.shards = ApiTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static SegmentsResponse of(Function<Builder, ObjectBuilder<SegmentsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final Map<String, IndexSegment> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public final ShardStatistics shards() {
		return this.shards;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, IndexSegment> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SegmentsResponse> {
		private Map<String, IndexSegment> indices;

		private ShardStatistics shards;

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indices</code>.
		 */
		public final Builder indices(Map<String, IndexSegment> map) {
			this.indices = _mapPutAll(this.indices, map);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code>.
		 */
		public final Builder indices(String key, IndexSegment value) {
			this.indices = _mapPut(this.indices, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds an entry to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(String key, Function<IndexSegment.Builder, ObjectBuilder<IndexSegment>> fn) {
			return indices(key, fn.apply(new IndexSegment.Builder()).build());
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SegmentsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsResponse build() {
			_checkSingleUse();

			return new SegmentsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SegmentsResponse}
	 */
	public static final JsonpDeserializer<SegmentsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SegmentsResponse::setupSegmentsResponseDeserializer);

	protected static void setupSegmentsResponseDeserializer(ObjectDeserializer<SegmentsResponse.Builder> op) {

		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndexSegment._DESERIALIZER), "indices");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");

	}

}
