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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.activate_watch.Response
@JsonpDeserializable
public class ActivateWatchResponse implements JsonpSerializable {
	private final ActivationStatus status;

	// ---------------------------------------------------------------------------------------------

	private ActivateWatchResponse(Builder builder) {

		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static ActivateWatchResponse of(Function<Builder, ObjectBuilder<ActivateWatchResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActivationStatus status() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActivateWatchResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ActivateWatchResponse> {
		private ActivationStatus status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActivationStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Function<ActivationStatus.Builder, ObjectBuilder<ActivationStatus>> fn) {
			return this.status(fn.apply(new ActivationStatus.Builder()).build());
		}

		/**
		 * Builds a {@link ActivateWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActivateWatchResponse build() {
			_checkSingleUse();

			return new ActivateWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ActivateWatchResponse}
	 */
	public static final JsonpDeserializer<ActivateWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ActivateWatchResponse::setupActivateWatchResponseDeserializer, Builder::build);

	protected static void setupActivateWatchResponseDeserializer(
			DelegatingDeserializer<ActivateWatchResponse.Builder> op) {

		op.add(Builder::status, ActivationStatus._DESERIALIZER, "status");

	}

}
