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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Ssl
public final class Ssl implements ToJsonp {
	private final FeatureToggle http;

	private final FeatureToggle transport;

	// ---------------------------------------------------------------------------------------------

	protected Ssl(Builder builder) {

		this.http = Objects.requireNonNull(builder.http, "http");
		this.transport = Objects.requireNonNull(builder.transport, "transport");

	}

	/**
	 * API name: {@code http}
	 */
	public FeatureToggle http() {
		return this.http;
	}

	/**
	 * API name: {@code transport}
	 */
	public FeatureToggle transport() {
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
		this.http.toJsonp(generator, mapper);

		generator.writeKey("transport");
		this.transport.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ssl}.
	 */
	public static class Builder implements ObjectBuilder<Ssl> {
		private FeatureToggle http;

		private FeatureToggle transport;

		/**
		 * API name: {@code http}
		 */
		public Builder http(FeatureToggle value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.http(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(FeatureToggle value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.transport(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Builds a {@link Ssl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ssl build() {

			return new Ssl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for Ssl
	 */
	public static final JsonpValueParser<Ssl> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Ssl::setupSslParser);

	protected static void setupSslParser(DelegatingJsonpValueParser<Ssl.Builder> op) {

		op.add(Builder::http, FeatureToggle.JSONP_PARSER, "http");
		op.add(Builder::transport, FeatureToggle.JSONP_PARSER, "transport");

	}

}
