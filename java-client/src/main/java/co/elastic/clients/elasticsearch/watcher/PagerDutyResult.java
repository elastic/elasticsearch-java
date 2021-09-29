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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyResult
@JsonpDeserializable
public final class PagerDutyResult implements JsonpSerializable {
	private final PagerDutyActionEventResult sentEvent;

	// ---------------------------------------------------------------------------------------------

	public PagerDutyResult(Builder builder) {

		this.sentEvent = Objects.requireNonNull(builder.sentEvent, "sent_event");

	}

	public PagerDutyResult(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code sent_event}
	 */
	public PagerDutyActionEventResult sentEvent() {
		return this.sentEvent;
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

		generator.writeKey("sent_event");
		this.sentEvent.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyResult}.
	 */
	public static class Builder implements ObjectBuilder<PagerDutyResult> {
		private PagerDutyActionEventResult sentEvent;

		/**
		 * API name: {@code sent_event}
		 */
		public Builder sentEvent(PagerDutyActionEventResult value) {
			this.sentEvent = value;
			return this;
		}

		/**
		 * API name: {@code sent_event}
		 */
		public Builder sentEvent(
				Function<PagerDutyActionEventResult.Builder, ObjectBuilder<PagerDutyActionEventResult>> fn) {
			return this.sentEvent(fn.apply(new PagerDutyActionEventResult.Builder()).build());
		}

		/**
		 * Builds a {@link PagerDutyResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyResult build() {

			return new PagerDutyResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyResult}
	 */
	public static final JsonpDeserializer<PagerDutyResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyResult::setupPagerDutyResultDeserializer, Builder::build);

	protected static void setupPagerDutyResultDeserializer(DelegatingDeserializer<PagerDutyResult.Builder> op) {

		op.add(Builder::sentEvent, PagerDutyActionEventResult._DESERIALIZER, "sent_event");

	}

}
