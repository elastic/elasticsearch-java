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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
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

// typedef: ml.start_datafeed.Request

/**
 * Starts one or more datafeeds.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.start_datafeed.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartDatafeedRequest extends RequestBase implements JsonpSerializable {
	private final String datafeedId;

	@Nullable
	private final Time end;

	@Nullable
	private final Time start;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private StartDatafeedRequest(Builder builder) {

		this.datafeedId = ApiTypeHelper.requireNonNull(builder.datafeedId, this, "datafeedId");
		this.end = builder.end;
		this.start = builder.start;
		this.timeout = builder.timeout;

	}

	public static StartDatafeedRequest of(Function<Builder, ObjectBuilder<StartDatafeedRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the datafeed to start
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public final String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public final Time end() {
		return this.end;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public final Time start() {
		return this.start;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		if (this.end != null) {
			generator.writeKey("end");
			this.end.serialize(generator, mapper);

		}
		if (this.start != null) {
			generator.writeKey("start");
			this.start.serialize(generator, mapper);

		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDatafeedRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StartDatafeedRequest> {
		private String datafeedId;

		@Nullable
		private Time end;

		@Nullable
		private Time start;

		@Nullable
		private Time timeout;

		/**
		 * Required - The ID of the datafeed to start
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public final Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable Time value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public final Builder end(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.end(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable Time value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public final Builder start(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.start(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDatafeedRequest build() {
			_checkSingleUse();

			return new StartDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StartDatafeedRequest}
	 */
	public static final JsonpDeserializer<StartDatafeedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartDatafeedRequest::setupStartDatafeedRequestDeserializer);

	protected static void setupStartDatafeedRequestDeserializer(ObjectDeserializer<StartDatafeedRequest.Builder> op) {

		op.add(Builder::end, Time._DESERIALIZER, "end");
		op.add(Builder::start, Time._DESERIALIZER, "start");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.start_datafeed}".
	 */
	public static final Endpoint<StartDatafeedRequest, StartDatafeedResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.start_datafeed",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _datafeedId = 1 << 0;

				int propsSet = 0;

				propsSet |= _datafeedId;

				if (propsSet == (_datafeedId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/datafeeds");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.datafeedId, buf);
					buf.append("/_start");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, StartDatafeedResponse._DESERIALIZER);
}
