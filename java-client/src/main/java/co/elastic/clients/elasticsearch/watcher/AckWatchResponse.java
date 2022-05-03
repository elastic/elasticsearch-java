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

package co.elastic.clients.elasticsearch.watcher;

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

// typedef: watcher.ack_watch.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher.ack_watch.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class AckWatchResponse implements JsonpSerializable {
	private final WatchStatus status;

	// ---------------------------------------------------------------------------------------------

	private AckWatchResponse(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static AckWatchResponse of(Function<Builder, ObjectBuilder<AckWatchResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final WatchStatus status() {
		return this.status;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AckWatchResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AckWatchResponse> {
		private WatchStatus status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AckWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AckWatchResponse build() {
			_checkSingleUse();

			return new AckWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AckWatchResponse}
	 */
	public static final JsonpDeserializer<AckWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AckWatchResponse::setupAckWatchResponseDeserializer);

	protected static void setupAckWatchResponseDeserializer(ObjectDeserializer<AckWatchResponse.Builder> op) {

		op.add(Builder::status, WatchStatus._DESERIALIZER, "status");

	}

}
