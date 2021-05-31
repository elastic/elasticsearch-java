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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.BulkIndexByScrollFailure
public final class BulkIndexByScrollFailure implements ToJsonp {
	private final MainError cause;

	private final String id;

	private final String index;

	private final Number status;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected BulkIndexByScrollFailure(Builder builder) {

		this.cause = Objects.requireNonNull(builder.cause, "cause");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	/**
	 * API name: {@code cause}
	 */
	public MainError cause() {
		return this.cause;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code status}
	 */
	public Number status() {
		return this.status;
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

		generator.writeKey("cause");
		this.cause.toJsonp(generator, mapper);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("status");
		generator.write(this.status.doubleValue());

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkIndexByScrollFailure}.
	 */
	public static class Builder implements ObjectBuilder<BulkIndexByScrollFailure> {
		private MainError cause;

		private String id;

		private String index;

		private Number status;

		private String type;

		/**
		 * API name: {@code cause}
		 */
		public Builder cause(MainError value) {
			this.cause = value;
			return this;
		}

		/**
		 * API name: {@code cause}
		 */
		public Builder cause(Function<MainError.Builder, ObjectBuilder<MainError>> fn) {
			return this.cause(fn.apply(new MainError.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
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
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link BulkIndexByScrollFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkIndexByScrollFailure build() {

			return new BulkIndexByScrollFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for BulkIndexByScrollFailure
	 */
	public static final JsonpValueParser<BulkIndexByScrollFailure> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, BulkIndexByScrollFailure::setupBulkIndexByScrollFailureParser);

	protected static void setupBulkIndexByScrollFailureParser(
			DelegatingJsonpValueParser<BulkIndexByScrollFailure.Builder> op) {

		op.add(Builder::cause, MainError.JSONP_PARSER, "cause");
		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::index, JsonpValueParser.stringParser(), "index");
		op.add(Builder::status, JsonpValueParser.numberParser(), "status");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type");

	}

}
