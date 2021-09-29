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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.stop_datafeed.Request
@JsonpDeserializable
public final class StopDatafeedRequest extends RequestBase implements JsonpSerializable {
	private final String datafeedId;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean force;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public StopDatafeedRequest(Builder builder) {

		this.datafeedId = Objects.requireNonNull(builder.datafeedId, "datafeed_id");
		this.allowNoMatch = builder.allowNoMatch;
		this.force = builder.force;
		this.timeout = builder.timeout;

	}

	public StopDatafeedRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The ID of the datafeed to stop
	 * <p>
	 * API name: {@code datafeed_id}
	 */
	public String datafeedId() {
		return this.datafeedId;
	}

	/**
	 * Whether to ignore if a wildcard expression matches no datafeeds. (This
	 * includes <code>_all</code> string or when no datafeeds have been specified)
	 * <p>
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code force}
	 */
	@Nullable
	public Boolean force() {
		return this.force;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
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

		if (this.force != null) {

			generator.writeKey("force");
			generator.write(this.force);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StopDatafeedRequest}.
	 */
	public static class Builder implements ObjectBuilder<StopDatafeedRequest> {
		private String datafeedId;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean force;

		@Nullable
		private String timeout;

		/**
		 * The ID of the datafeed to stop
		 * <p>
		 * API name: {@code datafeed_id}
		 */
		public Builder datafeedId(String value) {
			this.datafeedId = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard expression matches no datafeeds. (This
		 * includes <code>_all</code> string or when no datafeeds have been specified)
		 * <p>
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code force}
		 */
		public Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link StopDatafeedRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StopDatafeedRequest build() {

			return new StopDatafeedRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StopDatafeedRequest}
	 */
	public static final JsonpDeserializer<StopDatafeedRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StopDatafeedRequest::setupStopDatafeedRequestDeserializer, Builder::build);

	protected static void setupStopDatafeedRequestDeserializer(DelegatingDeserializer<StopDatafeedRequest.Builder> op) {

		op.add(Builder::force, JsonpDeserializer.booleanDeserializer(), "force");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.stop_datafeed}".
	 */
	public static final Endpoint<StopDatafeedRequest, StopDatafeedResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_stop");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, StopDatafeedResponse._DESERIALIZER);
}
