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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.TriggerEventResult
public final class TriggerEventResult implements ToJsonp {
	private final TriggerEventContainer manual;

	private final String triggeredTime;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected TriggerEventResult(Builder builder) {

		this.manual = Objects.requireNonNull(builder.manual, "manual");
		this.triggeredTime = Objects.requireNonNull(builder.triggeredTime, "triggered_time");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code manual}
	 */
	public TriggerEventContainer manual() {
		return this.manual;
	}

	/**
	 * API name: {@code triggered_time}
	 */
	public String triggeredTime() {
		return this.triggeredTime;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("manual");
		this.manual.toJsonp(generator, mapper);

		generator.writeKey("triggered_time");
		generator.write(this.triggeredTime);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TriggerEventResult}.
	 */
	public static class Builder implements ObjectBuilder<TriggerEventResult> {
		private TriggerEventContainer manual;

		private String triggeredTime;

		private String type;

		/**
		 * API name: {@code manual}
		 */
		public Builder manual(TriggerEventContainer value) {
			this.manual = value;
			return this;
		}

		/**
		 * API name: {@code manual}
		 */
		public Builder manual(Function<TriggerEventContainer.Builder, ObjectBuilder<TriggerEventContainer>> fn) {
			return this.manual(fn.apply(new TriggerEventContainer.Builder()).build());
		}

		/**
		 * API name: {@code triggered_time}
		 */
		public Builder triggeredTime(String value) {
			this.triggeredTime = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link TriggerEventResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TriggerEventResult build() {

			return new TriggerEventResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TriggerEventResult
	 */
	public static final JsonpValueParser<TriggerEventResult> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TriggerEventResult::setupTriggerEventResultParser);

	protected static void setupTriggerEventResultParser(DelegatingJsonpValueParser<TriggerEventResult.Builder> op) {

		op.add(Builder::manual, TriggerEventContainer.JSONP_PARSER, "manual");
		op.add(Builder::triggeredTime, JsonpValueParser.stringParser(), "triggered_time");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
