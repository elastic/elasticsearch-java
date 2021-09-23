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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.HttpInputRequestDefinition
public class HttpInputRequestDefinition implements JsonpSerializable {
	@Nullable
	private final HttpInputAuthentication auth;

	@Nullable
	private final String body;

	@Nullable
	private final JsonValue connectionTimeout;

	@Nullable
	private final Map<String, String> headers;

	@Nullable
	private final String host;

	@Nullable
	private final HttpInputMethod method;

	@Nullable
	private final Map<String, String> params;

	@Nullable
	private final String path;

	@Nullable
	private final Number port;

	@Nullable
	private final HttpInputProxy proxy;

	@Nullable
	private final JsonValue readTimeout;

	@Nullable
	private final ConnectionScheme scheme;

	@Nullable
	private final String url;

	// ---------------------------------------------------------------------------------------------

	public HttpInputRequestDefinition(AbstractBuilder<?> builder) {

		this.auth = builder.auth;
		this.body = builder.body;
		this.connectionTimeout = builder.connectionTimeout;
		this.headers = builder.headers;
		this.host = builder.host;
		this.method = builder.method;
		this.params = builder.params;
		this.path = builder.path;
		this.port = builder.port;
		this.proxy = builder.proxy;
		this.readTimeout = builder.readTimeout;
		this.scheme = builder.scheme;
		this.url = builder.url;

	}

	/**
	 * API name: {@code auth}
	 */
	@Nullable
	public HttpInputAuthentication auth() {
		return this.auth;
	}

	/**
	 * API name: {@code body}
	 */
	@Nullable
	public String body() {
		return this.body;
	}

	/**
	 * API name: {@code connection_timeout}
	 */
	@Nullable
	public JsonValue connectionTimeout() {
		return this.connectionTimeout;
	}

	/**
	 * API name: {@code headers}
	 */
	@Nullable
	public Map<String, String> headers() {
		return this.headers;
	}

	/**
	 * API name: {@code host}
	 */
	@Nullable
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code method}
	 */
	@Nullable
	public HttpInputMethod method() {
		return this.method;
	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, String> params() {
		return this.params;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public String path() {
		return this.path;
	}

	/**
	 * API name: {@code port}
	 */
	@Nullable
	public Number port() {
		return this.port;
	}

	/**
	 * API name: {@code proxy}
	 */
	@Nullable
	public HttpInputProxy proxy() {
		return this.proxy;
	}

	/**
	 * API name: {@code read_timeout}
	 */
	@Nullable
	public JsonValue readTimeout() {
		return this.readTimeout;
	}

	/**
	 * API name: {@code scheme}
	 */
	@Nullable
	public ConnectionScheme scheme() {
		return this.scheme;
	}

	/**
	 * API name: {@code url}
	 */
	@Nullable
	public String url() {
		return this.url;
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

		if (this.auth != null) {

			generator.writeKey("auth");
			this.auth.serialize(generator, mapper);

		}
		if (this.body != null) {

			generator.writeKey("body");
			generator.write(this.body);

		}
		if (this.connectionTimeout != null) {

			generator.writeKey("connection_timeout");
			generator.write(this.connectionTimeout);

		}
		if (this.headers != null) {

			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.host != null) {

			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.method != null) {

			generator.writeKey("method");
			this.method.serialize(generator, mapper);
		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.path != null) {

			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.port != null) {

			generator.writeKey("port");
			generator.write(this.port.doubleValue());

		}
		if (this.proxy != null) {

			generator.writeKey("proxy");
			this.proxy.serialize(generator, mapper);

		}
		if (this.readTimeout != null) {

			generator.writeKey("read_timeout");
			generator.write(this.readTimeout);

		}
		if (this.scheme != null) {

			generator.writeKey("scheme");
			this.scheme.serialize(generator, mapper);
		}
		if (this.url != null) {

			generator.writeKey("url");
			generator.write(this.url);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HttpInputRequestDefinition}.
	 */
	public static class Builder extends HttpInputRequestDefinition.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HttpInputRequestDefinition> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HttpInputRequestDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HttpInputRequestDefinition build() {

			return new HttpInputRequestDefinition(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private HttpInputAuthentication auth;

		@Nullable
		private String body;

		@Nullable
		private JsonValue connectionTimeout;

		@Nullable
		private Map<String, String> headers;

		@Nullable
		private String host;

		@Nullable
		private HttpInputMethod method;

		@Nullable
		private Map<String, String> params;

		@Nullable
		private String path;

		@Nullable
		private Number port;

		@Nullable
		private HttpInputProxy proxy;

		@Nullable
		private JsonValue readTimeout;

		@Nullable
		private ConnectionScheme scheme;

		@Nullable
		private String url;

		/**
		 * API name: {@code auth}
		 */
		public BuilderT auth(@Nullable HttpInputAuthentication value) {
			this.auth = value;
			return self();
		}

		/**
		 * API name: {@code auth}
		 */
		public BuilderT auth(Function<HttpInputAuthentication.Builder, ObjectBuilder<HttpInputAuthentication>> fn) {
			return this.auth(fn.apply(new HttpInputAuthentication.Builder()).build());
		}

		/**
		 * API name: {@code body}
		 */
		public BuilderT body(@Nullable String value) {
			this.body = value;
			return self();
		}

		/**
		 * API name: {@code connection_timeout}
		 */
		public BuilderT connectionTimeout(@Nullable JsonValue value) {
			this.connectionTimeout = value;
			return self();
		}

		/**
		 * API name: {@code headers}
		 */
		public BuilderT headers(@Nullable Map<String, String> value) {
			this.headers = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public BuilderT putHeaders(String key, String value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return self();
		}

		/**
		 * API name: {@code host}
		 */
		public BuilderT host(@Nullable String value) {
			this.host = value;
			return self();
		}

		/**
		 * API name: {@code method}
		 */
		public BuilderT method(@Nullable HttpInputMethod value) {
			this.method = value;
			return self();
		}

		/**
		 * API name: {@code params}
		 */
		public BuilderT params(@Nullable Map<String, String> value) {
			this.params = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public BuilderT putParams(String key, String value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return self();
		}

		/**
		 * API name: {@code path}
		 */
		public BuilderT path(@Nullable String value) {
			this.path = value;
			return self();
		}

		/**
		 * API name: {@code port}
		 */
		public BuilderT port(@Nullable Number value) {
			this.port = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public BuilderT proxy(@Nullable HttpInputProxy value) {
			this.proxy = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public BuilderT proxy(Function<HttpInputProxy.Builder, ObjectBuilder<HttpInputProxy>> fn) {
			return this.proxy(fn.apply(new HttpInputProxy.Builder()).build());
		}

		/**
		 * API name: {@code read_timeout}
		 */
		public BuilderT readTimeout(@Nullable JsonValue value) {
			this.readTimeout = value;
			return self();
		}

		/**
		 * API name: {@code scheme}
		 */
		public BuilderT scheme(@Nullable ConnectionScheme value) {
			this.scheme = value;
			return self();
		}

		/**
		 * API name: {@code url}
		 */
		public BuilderT url(@Nullable String value) {
			this.url = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputRequestDefinition}
	 */
	public static final JsonpDeserializer<HttpInputRequestDefinition> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HttpInputRequestDefinition::setupHttpInputRequestDefinitionDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupHttpInputRequestDefinitionDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::auth, HttpInputAuthentication.DESERIALIZER, "auth");
		op.add(AbstractBuilder::body, JsonpDeserializer.stringDeserializer(), "body");
		op.add(AbstractBuilder::connectionTimeout, JsonpDeserializer.jsonValueDeserializer(), "connection_timeout");
		op.add(AbstractBuilder::headers,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "headers");
		op.add(AbstractBuilder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(AbstractBuilder::method, HttpInputMethod.DESERIALIZER, "method");
		op.add(AbstractBuilder::params, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"params");
		op.add(AbstractBuilder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(AbstractBuilder::port, JsonpDeserializer.numberDeserializer(), "port");
		op.add(AbstractBuilder::proxy, HttpInputProxy.DESERIALIZER, "proxy");
		op.add(AbstractBuilder::readTimeout, JsonpDeserializer.jsonValueDeserializer(), "read_timeout");
		op.add(AbstractBuilder::scheme, ConnectionScheme.DESERIALIZER, "scheme");
		op.add(AbstractBuilder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
