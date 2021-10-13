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
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInputProxy
@JsonpDeserializable
public final class HttpInputProxy implements JsonpSerializable {
	private final String host;

	private final Number port;

	// ---------------------------------------------------------------------------------------------

	public HttpInputProxy(Builder builder) {

		this.host = Objects.requireNonNull(builder.host, "host");
		this.port = Objects.requireNonNull(builder.port, "port");

	}

	public HttpInputProxy(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code port}
	 */
	public Number port() {
		return this.port;
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

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("port");
		generator.write(this.port.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputProxy}.
	 */
	public static class Builder implements ObjectBuilder<HttpInputProxy> {
		private String host;

		private Number port;

		/**
		 * Required - API name: {@code host}
		 */
		public Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Required - API name: {@code port}
		 */
		public Builder port(Number value) {
			this.port = value;
			return this;
		}

		/**
		 * Builds a {@link HttpInputProxy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputProxy build() {

			return new HttpInputProxy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputProxy}
	 */
	public static final JsonpDeserializer<HttpInputProxy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HttpInputProxy::setupHttpInputProxyDeserializer, Builder::build);

	protected static void setupHttpInputProxyDeserializer(DelegatingDeserializer<HttpInputProxy.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::port, JsonpDeserializer.numberDeserializer(), "port");

	}

}
