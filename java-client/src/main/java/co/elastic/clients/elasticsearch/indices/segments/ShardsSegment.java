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

package co.elastic.clients.elasticsearch.indices.segments;

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
import java.lang.Integer;
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

// typedef: indices.segments.ShardsSegment

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.segments.ShardsSegment">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsSegment implements JsonpSerializable {
	private final int numCommittedSegments;

	private final ShardSegmentRouting routing;

	private final int numSearchSegments;

	private final Map<String, Segment> segments;

	// ---------------------------------------------------------------------------------------------

	private ShardsSegment(Builder builder) {

		this.numCommittedSegments = ApiTypeHelper.requireNonNull(builder.numCommittedSegments, this,
				"numCommittedSegments");
		this.routing = ApiTypeHelper.requireNonNull(builder.routing, this, "routing");
		this.numSearchSegments = ApiTypeHelper.requireNonNull(builder.numSearchSegments, this, "numSearchSegments");
		this.segments = ApiTypeHelper.unmodifiableRequired(builder.segments, this, "segments");

	}

	public static ShardsSegment of(Function<Builder, ObjectBuilder<ShardsSegment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code num_committed_segments}
	 */
	public final int numCommittedSegments() {
		return this.numCommittedSegments;
	}

	/**
	 * Required - API name: {@code routing}
	 */
	public final ShardSegmentRouting routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code num_search_segments}
	 */
	public final int numSearchSegments() {
		return this.numSearchSegments;
	}

	/**
	 * Required - API name: {@code segments}
	 */
	public final Map<String, Segment> segments() {
		return this.segments;
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

		generator.writeKey("num_committed_segments");
		generator.write(this.numCommittedSegments);

		generator.writeKey("routing");
		this.routing.serialize(generator, mapper);

		generator.writeKey("num_search_segments");
		generator.write(this.numSearchSegments);

		if (ApiTypeHelper.isDefined(this.segments)) {
			generator.writeKey("segments");
			generator.writeStartObject();
			for (Map.Entry<String, Segment> item0 : this.segments.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link ShardsSegment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardsSegment> {
		private Integer numCommittedSegments;

		private ShardSegmentRouting routing;

		private Integer numSearchSegments;

		private Map<String, Segment> segments;

		/**
		 * Required - API name: {@code num_committed_segments}
		 */
		public final Builder numCommittedSegments(int value) {
			this.numCommittedSegments = value;
			return this;
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(ShardSegmentRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(Function<ShardSegmentRouting.Builder, ObjectBuilder<ShardSegmentRouting>> fn) {
			return this.routing(fn.apply(new ShardSegmentRouting.Builder()).build());
		}

		/**
		 * Required - API name: {@code num_search_segments}
		 */
		public final Builder numSearchSegments(int value) {
			this.numSearchSegments = value;
			return this;
		}

		/**
		 * Required - API name: {@code segments}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>segments</code>.
		 */
		public final Builder segments(Map<String, Segment> map) {
			this.segments = _mapPutAll(this.segments, map);
			return this;
		}

		/**
		 * Required - API name: {@code segments}
		 * <p>
		 * Adds an entry to <code>segments</code>.
		 */
		public final Builder segments(String key, Segment value) {
			this.segments = _mapPut(this.segments, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code segments}
		 * <p>
		 * Adds an entry to <code>segments</code> using a builder lambda.
		 */
		public final Builder segments(String key, Function<Segment.Builder, ObjectBuilder<Segment>> fn) {
			return segments(key, fn.apply(new Segment.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsSegment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsSegment build() {
			_checkSingleUse();

			return new ShardsSegment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsSegment}
	 */
	public static final JsonpDeserializer<ShardsSegment> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsSegment::setupShardsSegmentDeserializer);

	protected static void setupShardsSegmentDeserializer(ObjectDeserializer<ShardsSegment.Builder> op) {

		op.add(Builder::numCommittedSegments, JsonpDeserializer.integerDeserializer(), "num_committed_segments");
		op.add(Builder::routing, ShardSegmentRouting._DESERIALIZER, "routing");
		op.add(Builder::numSearchSegments, JsonpDeserializer.integerDeserializer(), "num_search_segments");
		op.add(Builder::segments, JsonpDeserializer.stringMapDeserializer(Segment._DESERIALIZER), "segments");

	}

}
