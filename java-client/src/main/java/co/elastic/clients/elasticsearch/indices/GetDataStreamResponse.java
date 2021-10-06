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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch.indices.get_data_stream.IndicesGetDataStreamItem;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_data_stream.Response
@JsonpDeserializable
public final class GetDataStreamResponse implements JsonpSerializable {
	private final List<IndicesGetDataStreamItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	public GetDataStreamResponse(Builder builder) {

		this.dataStreams = ModelTypeHelper.unmodifiableNonNull(builder.dataStreams, "data_streams");

	}

	public GetDataStreamResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public List<IndicesGetDataStreamItem> dataStreams() {
		return this.dataStreams;
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

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (IndicesGetDataStreamItem item0 : this.dataStreams) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataStreamResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDataStreamResponse> {
		private List<IndicesGetDataStreamItem> dataStreams;

		/**
		 * Required - API name: {@code data_streams}
		 */
		public Builder dataStreams(List<IndicesGetDataStreamItem> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public Builder dataStreams(IndicesGetDataStreamItem... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(IndicesGetDataStreamItem value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * Set {@link #dataStreams(List)} to a singleton list.
		 */
		public Builder dataStreams(
				Function<IndicesGetDataStreamItem.Builder, ObjectBuilder<IndicesGetDataStreamItem>> fn) {
			return this.dataStreams(fn.apply(new IndicesGetDataStreamItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(
				Function<IndicesGetDataStreamItem.Builder, ObjectBuilder<IndicesGetDataStreamItem>> fn) {
			return this.addDataStreams(fn.apply(new IndicesGetDataStreamItem.Builder()).build());
		}

		/**
		 * Builds a {@link GetDataStreamResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataStreamResponse build() {

			return new GetDataStreamResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataStreamResponse}
	 */
	public static final JsonpDeserializer<GetDataStreamResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDataStreamResponse::setupGetDataStreamResponseDeserializer, Builder::build);

	protected static void setupGetDataStreamResponseDeserializer(
			DelegatingDeserializer<GetDataStreamResponse.Builder> op) {

		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(IndicesGetDataStreamItem._DESERIALIZER),
				"data_streams");

	}

}
