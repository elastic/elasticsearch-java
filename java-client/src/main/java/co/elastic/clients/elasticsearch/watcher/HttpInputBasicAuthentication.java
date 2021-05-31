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

// typedef: watcher._types.HttpInputBasicAuthentication
public final class HttpInputBasicAuthentication implements ToJsonp {
	private final String password;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	protected HttpInputBasicAuthentication(Builder builder) {

		this.password = Objects.requireNonNull(builder.password, "password");
		this.username = Objects.requireNonNull(builder.username, "username");

	}

	/**
	 * API name: {@code password}
	 */
	public String password() {
		return this.password;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
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

		generator.writeKey("password");
		generator.write(this.password);

		generator.writeKey("username");
		generator.write(this.username);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputBasicAuthentication}.
	 */
	public static class Builder implements ObjectBuilder<HttpInputBasicAuthentication> {
		private String password;

		private String username;

		/**
		 * API name: {@code password}
		 */
		public Builder password(String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link HttpInputBasicAuthentication}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputBasicAuthentication build() {

			return new HttpInputBasicAuthentication(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for HttpInputBasicAuthentication
	 */
	public static final JsonpValueParser<HttpInputBasicAuthentication> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, HttpInputBasicAuthentication::setupHttpInputBasicAuthenticationParser);

	protected static void setupHttpInputBasicAuthenticationParser(
			DelegatingJsonpValueParser<HttpInputBasicAuthentication.Builder> op) {

		op.add(Builder::password, JsonpValueParser.stringParser(), "password");
		op.add(Builder::username, JsonpValueParser.stringParser(), "username");

	}

}
