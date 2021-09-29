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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.LoggingResult
@JsonpDeserializable
public final class LoggingResult implements JsonpSerializable {
	private final String loggedText;

	// ---------------------------------------------------------------------------------------------

	public LoggingResult(Builder builder) {

		this.loggedText = Objects.requireNonNull(builder.loggedText, "logged_text");

	}

	public LoggingResult(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code logged_text}
	 */
	public String loggedText() {
		return this.loggedText;
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

		generator.writeKey("logged_text");
		generator.write(this.loggedText);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LoggingResult}.
	 */
	public static class Builder implements ObjectBuilder<LoggingResult> {
		private String loggedText;

		/**
		 * API name: {@code logged_text}
		 */
		public Builder loggedText(String value) {
			this.loggedText = value;
			return this;
		}

		/**
		 * Builds a {@link LoggingResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LoggingResult build() {

			return new LoggingResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LoggingResult}
	 */
	public static final JsonpDeserializer<LoggingResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LoggingResult::setupLoggingResultDeserializer, Builder::build);

	protected static void setupLoggingResultDeserializer(DelegatingDeserializer<LoggingResult.Builder> op) {

		op.add(Builder::loggedText, JsonpDeserializer.stringDeserializer(), "logged_text");

	}

}
