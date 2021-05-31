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

// typedef: watcher._types.PagerDutyResult
public final class PagerDutyResult implements ToJsonp {
	private final PagerDutyActionEventResult sentEvent;

	// ---------------------------------------------------------------------------------------------

	protected PagerDutyResult(Builder builder) {

		this.sentEvent = Objects.requireNonNull(builder.sentEvent, "sent_event");

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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("sent_event");
		this.sentEvent.toJsonp(generator, mapper);

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
	 * Json parser for PagerDutyResult
	 */
	public static final JsonpValueParser<PagerDutyResult> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PagerDutyResult::setupPagerDutyResultParser);

	protected static void setupPagerDutyResultParser(DelegatingJsonpValueParser<PagerDutyResult.Builder> op) {

		op.add(Builder::sentEvent, PagerDutyActionEventResult.JSONP_PARSER, "sent_event");

	}

}
