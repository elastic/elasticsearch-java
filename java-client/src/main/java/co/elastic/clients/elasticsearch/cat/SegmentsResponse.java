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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.segments.SegmentsRecord;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.segments.Response
@JsonpDeserializable
public final class SegmentsResponse implements JsonpSerializable {
	private final List<SegmentsRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	public SegmentsResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableNonNull(builder.valueBody, "_value_body");

	}

	public SegmentsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<SegmentsRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (SegmentsRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SegmentsResponse}.
	 */
	public static class Builder implements ObjectBuilder<SegmentsResponse> {
		private List<SegmentsRecord> valueBody;

		/**
		 * Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder valueBody(List<SegmentsRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder valueBody(SegmentsRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #valueBody(List)}, creating the list if needed. 4
		 */
		public Builder addValueBody(SegmentsRecord value) {
			if (this.valueBody == null) {
				this.valueBody = new ArrayList<>();
			}
			this.valueBody.add(value);
			return this;
		}

		/**
		 * Set {@link #valueBody(List)} to a singleton list.
		 */
		public Builder valueBody(Function<SegmentsRecord.Builder, ObjectBuilder<SegmentsRecord>> fn) {
			return this.valueBody(fn.apply(new SegmentsRecord.Builder()).build());
		}

		/**
		 * Add a value to {@link #valueBody(List)}, creating the list if needed. 5
		 */
		public Builder addValueBody(Function<SegmentsRecord.Builder, ObjectBuilder<SegmentsRecord>> fn) {
			return this.addValueBody(fn.apply(new SegmentsRecord.Builder()).build());
		}

		/**
		 * Builds a {@link SegmentsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SegmentsResponse build() {

			return new SegmentsResponse(this);
		}
	}

	public static final JsonpDeserializer<SegmentsResponse> _DESERIALIZER = createSegmentsResponseDeserializer();
	protected static JsonpDeserializer<SegmentsResponse> createSegmentsResponseDeserializer() {

		JsonpDeserializer<List<SegmentsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(SegmentsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
