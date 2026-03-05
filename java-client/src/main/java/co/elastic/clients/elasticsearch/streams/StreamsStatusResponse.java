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

package co.elastic.clients.elasticsearch.streams;

import co.elastic.clients.elasticsearch.streams.status.StreamStatus;
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

// typedef: streams.status.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#streams.status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StreamsStatusResponse implements JsonpSerializable {
	private final StreamStatus logs;

	private final StreamStatus logsOtel;

	private final StreamStatus logsEcs;

	// ---------------------------------------------------------------------------------------------

	private StreamsStatusResponse(Builder builder) {

		this.logs = ApiTypeHelper.requireNonNull(builder.logs, this, "logs");
		this.logsOtel = ApiTypeHelper.requireNonNull(builder.logsOtel, this, "logsOtel");
		this.logsEcs = ApiTypeHelper.requireNonNull(builder.logsEcs, this, "logsEcs");

	}

	public static StreamsStatusResponse of(Function<Builder, ObjectBuilder<StreamsStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code logs}
	 */
	public final StreamStatus logs() {
		return this.logs;
	}

	/**
	 * Required - API name: {@code logs.otel}
	 */
	public final StreamStatus logsOtel() {
		return this.logsOtel;
	}

	/**
	 * Required - API name: {@code logs.ecs}
	 */
	public final StreamStatus logsEcs() {
		return this.logsEcs;
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

		generator.writeKey("logs");
		this.logs.serialize(generator, mapper);

		generator.writeKey("logs.otel");
		this.logsOtel.serialize(generator, mapper);

		generator.writeKey("logs.ecs");
		this.logsEcs.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StreamsStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StreamsStatusResponse> {
		private StreamStatus logs;

		private StreamStatus logsOtel;

		private StreamStatus logsEcs;

		/**
		 * Required - API name: {@code logs}
		 */
		public final Builder logs(StreamStatus value) {
			this.logs = value;
			return this;
		}

		/**
		 * Required - API name: {@code logs}
		 */
		public final Builder logs(Function<StreamStatus.Builder, ObjectBuilder<StreamStatus>> fn) {
			return this.logs(fn.apply(new StreamStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code logs.otel}
		 */
		public final Builder logsOtel(StreamStatus value) {
			this.logsOtel = value;
			return this;
		}

		/**
		 * Required - API name: {@code logs.otel}
		 */
		public final Builder logsOtel(Function<StreamStatus.Builder, ObjectBuilder<StreamStatus>> fn) {
			return this.logsOtel(fn.apply(new StreamStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code logs.ecs}
		 */
		public final Builder logsEcs(StreamStatus value) {
			this.logsEcs = value;
			return this;
		}

		/**
		 * Required - API name: {@code logs.ecs}
		 */
		public final Builder logsEcs(Function<StreamStatus.Builder, ObjectBuilder<StreamStatus>> fn) {
			return this.logsEcs(fn.apply(new StreamStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StreamsStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StreamsStatusResponse build() {
			_checkSingleUse();

			return new StreamsStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StreamsStatusResponse}
	 */
	public static final JsonpDeserializer<StreamsStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StreamsStatusResponse::setupStreamsStatusResponseDeserializer);

	protected static void setupStreamsStatusResponseDeserializer(ObjectDeserializer<StreamsStatusResponse.Builder> op) {

		op.add(Builder::logs, StreamStatus._DESERIALIZER, "logs");
		op.add(Builder::logsOtel, StreamStatus._DESERIALIZER, "logs.otel");
		op.add(Builder::logsEcs, StreamStatus._DESERIALIZER, "logs.ecs");

	}

}
