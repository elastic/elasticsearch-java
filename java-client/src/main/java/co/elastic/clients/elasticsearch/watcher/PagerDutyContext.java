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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyContext
public final class PagerDutyContext implements ToJsonp {
	private final String href;

	private final String src;

	private final JsonValue type;

	// ---------------------------------------------------------------------------------------------

	protected PagerDutyContext(Builder builder) {

		this.href = Objects.requireNonNull(builder.href, "href");
		this.src = Objects.requireNonNull(builder.src, "src");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code href}
	 */
	public String href() {
		return this.href;
	}

	/**
	 * API name: {@code src}
	 */
	public String src() {
		return this.src;
	}

	/**
	 * API name: {@code type}
	 */
	public JsonValue type() {
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

		generator.writeKey("href");
		generator.write(this.href);

		generator.writeKey("src");
		generator.write(this.src);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyContext}.
	 */
	public static class Builder implements ObjectBuilder<PagerDutyContext> {
		private String href;

		private String src;

		private JsonValue type;

		/**
		 * API name: {@code href}
		 */
		public Builder href(String value) {
			this.href = value;
			return this;
		}

		/**
		 * API name: {@code src}
		 */
		public Builder src(String value) {
			this.src = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(JsonValue value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link PagerDutyContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyContext build() {

			return new PagerDutyContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PagerDutyContext
	 */
	public static final JsonpValueParser<PagerDutyContext> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PagerDutyContext::setupPagerDutyContextParser);

	protected static void setupPagerDutyContextParser(DelegatingJsonpValueParser<PagerDutyContext.Builder> op) {

		op.add(Builder::href, JsonpValueParser.stringParser(), "href");
		op.add(Builder::src, JsonpValueParser.stringParser(), "src");
		op.add(Builder::type, JsonpValueParser.jsonValueParser(), "type");

	}

}
