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
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInputResponseResult
public final class HttpInputResponseResult implements JsonpSerializable {
	private final String body;

	private final Map<String, List<String>> headers;

	private final Number status;

	// ---------------------------------------------------------------------------------------------

	public HttpInputResponseResult(Builder builder) {

		this.body = Objects.requireNonNull(builder.body, "body");
		this.headers = Objects.requireNonNull(builder.headers, "headers");
		this.status = Objects.requireNonNull(builder.status, "status");

	}

	/**
	 * API name: {@code body}
	 */
	public String body() {
		return this.body;
	}

	/**
	 * API name: {@code headers}
	 */
	public Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * API name: {@code status}
	 */
	public Number status() {
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

		generator.writeKey("body");
		generator.write(this.body);

		generator.writeKey("headers");
		generator.writeStartObject();
		for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (String item1 : item0.getValue()) {
				generator.write(item1);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("status");
		generator.write(this.status.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputResponseResult}.
	 */
	public static class Builder implements ObjectBuilder<HttpInputResponseResult> {
		private String body;

		private Map<String, List<String>> headers;

		private Number status;

		/**
		 * API name: {@code body}
		 */
		public Builder body(String value) {
			this.body = value;
			return this;
		}

		/**
		 * API name: {@code headers}
		 */
		public Builder headers(Map<String, List<String>> value) {
			this.headers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public Builder putHeaders(String key, List<String> value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Number value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link HttpInputResponseResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputResponseResult build() {

			return new HttpInputResponseResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputResponseResult}
	 */
	public static final JsonpDeserializer<HttpInputResponseResult> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HttpInputResponseResult::setupHttpInputResponseResultDeserializer);

	protected static void setupHttpInputResponseResultDeserializer(
			DelegatingDeserializer<HttpInputResponseResult.Builder> op) {

		op.add(Builder::body, JsonpDeserializer.stringDeserializer(), "body");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::status, JsonpDeserializer.numberDeserializer(), "status");

	}

}
