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
import javax.annotation.Nullable;

// typedef: watcher._types.Logging
public final class Logging implements ToJsonp {
	private final String level;

	private final String text;

	// ---------------------------------------------------------------------------------------------

	protected Logging(Builder builder) {

		this.level = Objects.requireNonNull(builder.level, "level");
		this.text = Objects.requireNonNull(builder.text, "text");

	}

	/**
	 * API name: {@code level}
	 */
	public String level() {
		return this.level;
	}

	/**
	 * API name: {@code text}
	 */
	public String text() {
		return this.text;
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

		generator.writeKey("level");
		generator.write(this.level);

		generator.writeKey("text");
		generator.write(this.text);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Logging}.
	 */
	public static class Builder implements ObjectBuilder<Logging> {
		private String level;

		private String text;

		/**
		 * API name: {@code level}
		 */
		public Builder level(String value) {
			this.level = value;
			return this;
		}

		/**
		 * API name: {@code text}
		 */
		public Builder text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * Builds a {@link Logging}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Logging build() {

			return new Logging(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Logging
	 */
	public static final JsonpValueParser<Logging> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Logging::setupLoggingParser);

	protected static void setupLoggingParser(DelegatingJsonpValueParser<Logging.Builder> op) {

		op.add(Builder::level, JsonpValueParser.stringParser(), "level");
		op.add(Builder::text, JsonpValueParser.stringParser(), "text");

	}

}
