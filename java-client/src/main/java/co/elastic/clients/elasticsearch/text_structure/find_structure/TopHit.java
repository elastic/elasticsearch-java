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

package co.elastic.clients.elasticsearch.text_structure.find_structure;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: text_structure.find_structure.TopHit
public final class TopHit implements ToJsonp {
	private final Number count;

	private final JsonValue value;

	// ---------------------------------------------------------------------------------------------

	protected TopHit(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code value}
	 */
	public JsonValue value() {
		return this.value;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopHit}.
	 */
	public static class Builder implements ObjectBuilder<TopHit> {
		private Number count;

		private JsonValue value;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(JsonValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link TopHit}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopHit build() {

			return new TopHit(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TopHit
	 */
	public static final JsonpValueParser<TopHit> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			TopHit::setupTopHitParser);

	protected static void setupTopHitParser(DelegatingJsonpValueParser<TopHit.Builder> op) {

		op.add(Builder::count, JsonpValueParser.numberParser(), "count");
		op.add(Builder::value, JsonpValueParser.jsonValueParser(), "value");

	}

}
