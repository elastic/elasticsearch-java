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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.deactivate_watch.Response
public final class DeactivateWatchResponse implements ToJsonp {
	private final ActivationStatus status;

	// ---------------------------------------------------------------------------------------------

	protected DeactivateWatchResponse(Builder builder) {

		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code status}
	 */
	public ActivationStatus status() {
		return this.status;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("status");
		this.status.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeactivateWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<DeactivateWatchResponse> {
		private ActivationStatus status;

		/**
		 * API name: {@code status}
		 */
		public Builder status(ActivationStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<ActivationStatus.Builder, ObjectBuilder<ActivationStatus>> fn) {
			return this.status(fn.apply(new ActivationStatus.Builder()).build());
		}

		/**
		 * Builds a {@link DeactivateWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeactivateWatchResponse build() {

			return new DeactivateWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DeactivateWatchResponse
	 */
	public static final JsonpValueParser<DeactivateWatchResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DeactivateWatchResponse::setupDeactivateWatchResponseParser);

	protected static void setupDeactivateWatchResponseParser(
			DelegatingJsonpValueParser<DeactivateWatchResponse.Builder> op) {

		op.add(Builder::status, ActivationStatus.JSONP_PARSER, "status");

	}

}
