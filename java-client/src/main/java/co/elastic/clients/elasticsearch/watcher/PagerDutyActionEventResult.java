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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyActionEventResult
public final class PagerDutyActionEventResult implements JsonpSerializable {
	private final PagerDutyEvent event;

	private final String reason;

	private final HttpInputRequestResult request;

	private final HttpInputResponseResult response;

	// ---------------------------------------------------------------------------------------------

	public PagerDutyActionEventResult(Builder builder) {

		this.event = Objects.requireNonNull(builder.event, "event");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.request = Objects.requireNonNull(builder.request, "request");
		this.response = Objects.requireNonNull(builder.response, "response");

	}

	/**
	 * API name: {@code event}
	 */
	public PagerDutyEvent event() {
		return this.event;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code request}
	 */
	public HttpInputRequestResult request() {
		return this.request;
	}

	/**
	 * API name: {@code response}
	 */
	public HttpInputResponseResult response() {
		return this.response;
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

		generator.writeKey("event");
		this.event.serialize(generator, mapper);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		generator.writeKey("response");
		this.response.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyActionEventResult}.
	 */
	public static class Builder implements ObjectBuilder<PagerDutyActionEventResult> {
		private PagerDutyEvent event;

		private String reason;

		private HttpInputRequestResult request;

		private HttpInputResponseResult response;

		/**
		 * API name: {@code event}
		 */
		public Builder event(PagerDutyEvent value) {
			this.event = value;
			return this;
		}

		/**
		 * API name: {@code event}
		 */
		public Builder event(Function<PagerDutyEvent.Builder, ObjectBuilder<PagerDutyEvent>> fn) {
			return this.event(fn.apply(new PagerDutyEvent.Builder()).build());
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(HttpInputRequestResult value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(Function<HttpInputRequestResult.Builder, ObjectBuilder<HttpInputRequestResult>> fn) {
			return this.request(fn.apply(new HttpInputRequestResult.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(HttpInputResponseResult value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(Function<HttpInputResponseResult.Builder, ObjectBuilder<HttpInputResponseResult>> fn) {
			return this.response(fn.apply(new HttpInputResponseResult.Builder()).build());
		}

		/**
		 * Builds a {@link PagerDutyActionEventResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyActionEventResult build() {

			return new PagerDutyActionEventResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyActionEventResult}
	 */
	public static final JsonpDeserializer<PagerDutyActionEventResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PagerDutyActionEventResult::setupPagerDutyActionEventResultDeserializer);

	protected static void setupPagerDutyActionEventResultDeserializer(
			DelegatingDeserializer<PagerDutyActionEventResult.Builder> op) {

		op.add(Builder::event, PagerDutyEvent.DESERIALIZER, "event");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::request, HttpInputRequestResult.DESERIALIZER, "request");
		op.add(Builder::response, HttpInputResponseResult.DESERIALIZER, "response");

	}

}
