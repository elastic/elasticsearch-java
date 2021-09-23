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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInputAuthentication
public final class HttpInputAuthentication implements JsonpSerializable {
	private final HttpInputBasicAuthentication basic;

	// ---------------------------------------------------------------------------------------------

	public HttpInputAuthentication(Builder builder) {

		this.basic = Objects.requireNonNull(builder.basic, "basic");

	}

	/**
	 * API name: {@code basic}
	 */
	public HttpInputBasicAuthentication basic() {
		return this.basic;
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

		generator.writeKey("basic");
		this.basic.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputAuthentication}.
	 */
	public static class Builder implements ObjectBuilder<HttpInputAuthentication> {
		private HttpInputBasicAuthentication basic;

		/**
		 * API name: {@code basic}
		 */
		public Builder basic(HttpInputBasicAuthentication value) {
			this.basic = value;
			return this;
		}

		/**
		 * API name: {@code basic}
		 */
		public Builder basic(
				Function<HttpInputBasicAuthentication.Builder, ObjectBuilder<HttpInputBasicAuthentication>> fn) {
			return this.basic(fn.apply(new HttpInputBasicAuthentication.Builder()).build());
		}

		/**
		 * Builds a {@link HttpInputAuthentication}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputAuthentication build() {

			return new HttpInputAuthentication(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputAuthentication}
	 */
	public static final JsonpDeserializer<HttpInputAuthentication> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HttpInputAuthentication::setupHttpInputAuthenticationDeserializer);

	protected static void setupHttpInputAuthenticationDeserializer(
			DelegatingDeserializer<HttpInputAuthentication.Builder> op) {

		op.add(Builder::basic, HttpInputBasicAuthentication.DESERIALIZER, "basic");

	}

}
