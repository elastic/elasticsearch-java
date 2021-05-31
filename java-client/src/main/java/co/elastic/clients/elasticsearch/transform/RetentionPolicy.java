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

package co.elastic.clients.elasticsearch.transform;

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

// typedef: transform._types.RetentionPolicy
public final class RetentionPolicy implements ToJsonp {
	private final String field;

	private final JsonValue maxAge;

	// ---------------------------------------------------------------------------------------------

	protected RetentionPolicy(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.maxAge = Objects.requireNonNull(builder.maxAge, "max_age");

	}

	/**
	 * The date field that is used to calculate the age of the document.
	 *
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Specifies the maximum age of a document in the destination index. Documents
	 * that are older than the configured value are removed from the destination
	 * index.
	 *
	 * API name: {@code max_age}
	 */
	public JsonValue maxAge() {
		return this.maxAge;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("max_age");
		generator.write(this.maxAge);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RetentionPolicy}.
	 */
	public static class Builder implements ObjectBuilder<RetentionPolicy> {
		private String field;

		private JsonValue maxAge;

		/**
		 * The date field that is used to calculate the age of the document.
		 *
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Specifies the maximum age of a document in the destination index. Documents
		 * that are older than the configured value are removed from the destination
		 * index.
		 *
		 * API name: {@code max_age}
		 */
		public Builder maxAge(JsonValue value) {
			this.maxAge = value;
			return this;
		}

		/**
		 * Builds a {@link RetentionPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RetentionPolicy build() {

			return new RetentionPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RetentionPolicy
	 */
	public static final JsonpValueParser<RetentionPolicy> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RetentionPolicy::setupRetentionPolicyParser);

	protected static void setupRetentionPolicyParser(DelegatingJsonpValueParser<RetentionPolicy.Builder> op) {

		op.add(Builder::field, JsonpValueParser.stringParser(), "field");
		op.add(Builder::maxAge, JsonpValueParser.jsonValueParser(), "max_age");

	}

}
