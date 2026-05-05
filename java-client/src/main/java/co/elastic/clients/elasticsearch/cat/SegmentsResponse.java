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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.segments.SegmentsRecord;
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
import jakarta.json.stream.JsonParser;
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

// typedef: cat.segments.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.segments.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SegmentsResponse implements JsonpSerializable {
	private final List<SegmentsRecord> segments;

	// ---------------------------------------------------------------------------------------------

	private SegmentsResponse(Builder builder) {

		this.segments = ApiTypeHelper.unmodifiableRequired(builder.segments, this, "segments");

	}

	public static SegmentsResponse of(Function<Builder, ObjectBuilder<SegmentsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<SegmentsRecord> segments() {
		return this.segments;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (SegmentsRecord item0 : this.segments) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

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
		private List<SegmentsRecord> segments;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>segments</code>.
		 */
		public final Builder segments(List<SegmentsRecord> list) {
			this.segments = _listAddAll(this.segments, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>segments</code>.
		 */
		public final Builder segments(SegmentsRecord value, SegmentsRecord... values) {
			this.segments = _listAdd(this.segments, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>segments</code> using a builder lambda.
		 */
		public final Builder segments(Function<SegmentsRecord.Builder, ObjectBuilder<SegmentsRecord>> fn) {
			return segments(fn.apply(new SegmentsRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<SegmentsRecord> value = (List<SegmentsRecord>) JsonpDeserializer
					.arrayDeserializer(SegmentsRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.segments(value);
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

	public static final JsonpDeserializer<SegmentsResponse> _DESERIALIZER = createSegmentsResponseDeserializer();
	protected static JsonpDeserializer<SegmentsResponse> createSegmentsResponseDeserializer() {

		JsonpDeserializer<List<SegmentsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(SegmentsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.segments(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
