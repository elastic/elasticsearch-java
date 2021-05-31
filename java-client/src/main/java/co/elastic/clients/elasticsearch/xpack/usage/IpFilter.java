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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.IpFilter
public final class IpFilter implements ToJsonp {
	private final Boolean http;

	private final Boolean transport;

	// ---------------------------------------------------------------------------------------------

	protected IpFilter(Builder builder) {

		this.http = Objects.requireNonNull(builder.http, "http");
		this.transport = Objects.requireNonNull(builder.transport, "transport");

	}

	/**
	 * API name: {@code http}
	 */
	public Boolean http() {
		return this.http;
	}

	/**
	 * API name: {@code transport}
	 */
	public Boolean transport() {
		return this.transport;
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

		generator.writeKey("http");
		generator.write(this.http);

		generator.writeKey("transport");
		generator.write(this.transport);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpFilter}.
	 */
	public static class Builder implements ObjectBuilder<IpFilter> {
		private Boolean http;

		private Boolean transport;

		/**
		 * API name: {@code http}
		 */
		public Builder http(Boolean value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(Boolean value) {
			this.transport = value;
			return this;
		}

		/**
		 * Builds a {@link IpFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpFilter build() {

			return new IpFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for IpFilter
	 */
	public static final JsonpValueParser<IpFilter> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			IpFilter::setupIpFilterParser);

	protected static void setupIpFilterParser(DelegatingJsonpValueParser<IpFilter.Builder> op) {

		op.add(Builder::http, JsonpValueParser.booleanParser(), "http");
		op.add(Builder::transport, JsonpValueParser.booleanParser(), "transport");

	}

}
