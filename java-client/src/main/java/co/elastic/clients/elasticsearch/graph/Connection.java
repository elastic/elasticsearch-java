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

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: graph._types.Connection
public final class Connection implements ToJsonp {
	private final Number docCount;

	private final Number source;

	private final Number target;

	private final Number weight;

	// ---------------------------------------------------------------------------------------------

	protected Connection(Builder builder) {

		this.docCount = Objects.requireNonNull(builder.docCount, "doc_count");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.target = Objects.requireNonNull(builder.target, "target");
		this.weight = Objects.requireNonNull(builder.weight, "weight");

	}

	/**
	 * API name: {@code doc_count}
	 */
	public Number docCount() {
		return this.docCount;
	}

	/**
	 * API name: {@code source}
	 */
	public Number source() {
		return this.source;
	}

	/**
	 * API name: {@code target}
	 */
	public Number target() {
		return this.target;
	}

	/**
	 * API name: {@code weight}
	 */
	public Number weight() {
		return this.weight;
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

		generator.writeKey("doc_count");
		generator.write(this.docCount.doubleValue());

		generator.writeKey("source");
		generator.write(this.source.doubleValue());

		generator.writeKey("target");
		generator.write(this.target.doubleValue());

		generator.writeKey("weight");
		generator.write(this.weight.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Connection}.
	 */
	public static class Builder implements ObjectBuilder<Connection> {
		private Number docCount;

		private Number source;

		private Number target;

		private Number weight;

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(Number value) {
			this.docCount = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Number value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code target}
		 */
		public Builder target(Number value) {
			this.target = value;
			return this;
		}

		/**
		 * API name: {@code weight}
		 */
		public Builder weight(Number value) {
			this.weight = value;
			return this;
		}

		/**
		 * Builds a {@link Connection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Connection build() {

			return new Connection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Connection
	 */
	public static final JsonpValueParser<Connection> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, Connection::setupConnectionParser);

	protected static void setupConnectionParser(DelegatingJsonpValueParser<Connection.Builder> op) {

		op.add(Builder::docCount, JsonpValueParser.numberParser(), "doc_count");
		op.add(Builder::source, JsonpValueParser.numberParser(), "source");
		op.add(Builder::target, JsonpValueParser.numberParser(), "target");
		op.add(Builder::weight, JsonpValueParser.numberParser(), "weight");

	}

}
