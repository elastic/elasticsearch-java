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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: watcher._types.HttpInputRequestDefinition

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.HttpInputRequestDefinition">API
 *      specification</a>
 */
@JsonpDeserializable
public class HttpInputRequestDefinition implements JsonpSerializable {
	@Nullable
	private final HttpInputAuthentication auth;

	@Nullable
	private final String body;

	@Nullable
	private final Time connectionTimeout;

	private final Map<String, String> headers;

	@Nullable
	private final String host;

	@Nullable
	private final HttpInputMethod method;

	private final Map<String, String> params;

	@Nullable
	private final String path;

	@Nullable
	private final Number port;

	@Nullable
	private final HttpInputProxy proxy;

	@Nullable
	private final Time readTimeout;

	@Nullable
	private final ConnectionScheme scheme;

	@Nullable
	private final String url;

	// ---------------------------------------------------------------------------------------------

	protected HttpInputRequestDefinition(AbstractBuilder<?> builder) {

		this.auth = builder.auth;
		this.body = builder.body;
		this.connectionTimeout = builder.connectionTimeout;
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.host = builder.host;
		this.method = builder.method;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.path = builder.path;
		this.port = builder.port;
		this.proxy = builder.proxy;
		this.readTimeout = builder.readTimeout;
		this.scheme = builder.scheme;
		this.url = builder.url;

	}

	public static HttpInputRequestDefinition httpInputRequestDefinitionOf(
			Function<Builder, ObjectBuilder<HttpInputRequestDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code auth}
	 */
	@Nullable
	public final HttpInputAuthentication auth() {
		return this.auth;
	}

	/**
	 * API name: {@code body}
	 */
	@Nullable
	public final String body() {
		return this.body;
	}

	/**
	 * API name: {@code connection_timeout}
	 */
	@Nullable
	public final Time connectionTimeout() {
		return this.connectionTimeout;
	}

	/**
	 * API name: {@code headers}
	 */
	public final Map<String, String> headers() {
		return this.headers;
	}

	/**
	 * API name: {@code host}
	 */
	@Nullable
	public final String host() {
		return this.host;
	}

	/**
	 * API name: {@code method}
	 */
	@Nullable
	public final HttpInputMethod method() {
		return this.method;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, String> params() {
		return this.params;
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * API name: {@code port}
	 */
	@Nullable
	public final Number port() {
		return this.port;
	}

	/**
	 * API name: {@code proxy}
	 */
	@Nullable
	public final HttpInputProxy proxy() {
		return this.proxy;
	}

	/**
	 * API name: {@code read_timeout}
	 */
	@Nullable
	public final Time readTimeout() {
		return this.readTimeout;
	}

	/**
	 * API name: {@code scheme}
	 */
	@Nullable
	public final ConnectionScheme scheme() {
		return this.scheme;
	}

	/**
	 * API name: {@code url}
	 */
	@Nullable
	public final String url() {
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
			this.connectionTimeout.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.headers)) {
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
		if (ApiTypeHelper.isDefined(this.params)) {
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
			this.readTimeout.serialize(generator, mapper);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
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
			_checkSingleUse();

			return new HttpInputRequestDefinition(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private HttpInputAuthentication auth;

		@Nullable
		private String body;

		@Nullable
		private Time connectionTimeout;

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
		private Time readTimeout;

		@Nullable
		private ConnectionScheme scheme;

		@Nullable
		private String url;

		/**
		 * API name: {@code auth}
		 */
		public final BuilderT auth(@Nullable HttpInputAuthentication value) {
			this.auth = value;
			return self();
		}

		/**
		 * API name: {@code auth}
		 */
		public final BuilderT auth(
				Function<HttpInputAuthentication.Builder, ObjectBuilder<HttpInputAuthentication>> fn) {
			return this.auth(fn.apply(new HttpInputAuthentication.Builder()).build());
		}

		/**
		 * API name: {@code body}
		 */
		public final BuilderT body(@Nullable String value) {
			this.body = value;
			return self();
		}

		/**
		 * API name: {@code connection_timeout}
		 */
		public final BuilderT connectionTimeout(@Nullable Time value) {
			this.connectionTimeout = value;
			return self();
		}

		/**
		 * API name: {@code connection_timeout}
		 */
		public final BuilderT connectionTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.connectionTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final BuilderT headers(Map<String, String> map) {
			this.headers = _mapPutAll(this.headers, map);
			return self();
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final BuilderT headers(String key, String value) {
			this.headers = _mapPut(this.headers, key, value);
			return self();
		}

		/**
		 * API name: {@code host}
		 */
		public final BuilderT host(@Nullable String value) {
			this.host = value;
			return self();
		}

		/**
		 * API name: {@code method}
		 */
		public final BuilderT method(@Nullable HttpInputMethod value) {
			this.method = value;
			return self();
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final BuilderT params(Map<String, String> map) {
			this.params = _mapPutAll(this.params, map);
			return self();
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final BuilderT params(String key, String value) {
			this.params = _mapPut(this.params, key, value);
			return self();
		}

		/**
		 * API name: {@code path}
		 */
		public final BuilderT path(@Nullable String value) {
			this.path = value;
			return self();
		}

		/**
		 * API name: {@code port}
		 */
		public final BuilderT port(@Nullable Number value) {
			this.port = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public final BuilderT proxy(@Nullable HttpInputProxy value) {
			this.proxy = value;
			return self();
		}

		/**
		 * API name: {@code proxy}
		 */
		public final BuilderT proxy(Function<HttpInputProxy.Builder, ObjectBuilder<HttpInputProxy>> fn) {
			return this.proxy(fn.apply(new HttpInputProxy.Builder()).build());
		}

		/**
		 * API name: {@code read_timeout}
		 */
		public final BuilderT readTimeout(@Nullable Time value) {
			this.readTimeout = value;
			return self();
		}

		/**
		 * API name: {@code read_timeout}
		 */
		public final BuilderT readTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.readTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code scheme}
		 */
		public final BuilderT scheme(@Nullable ConnectionScheme value) {
			this.scheme = value;
			return self();
		}

		/**
		 * API name: {@code url}
		 */
		public final BuilderT url(@Nullable String value) {
			this.url = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HttpInputRequestDefinition}
	 */
	public static final JsonpDeserializer<HttpInputRequestDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HttpInputRequestDefinition::setupHttpInputRequestDefinitionDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupHttpInputRequestDefinitionDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::auth, HttpInputAuthentication._DESERIALIZER, "auth");
		op.add(AbstractBuilder::body, JsonpDeserializer.stringDeserializer(), "body");
		op.add(AbstractBuilder::connectionTimeout, Time._DESERIALIZER, "connection_timeout");
		op.add(AbstractBuilder::headers,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "headers");
		op.add(AbstractBuilder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(AbstractBuilder::method, HttpInputMethod._DESERIALIZER, "method");
		op.add(AbstractBuilder::params, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"params");
		op.add(AbstractBuilder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(AbstractBuilder::port, JsonpDeserializer.numberDeserializer(), "port");
		op.add(AbstractBuilder::proxy, HttpInputProxy._DESERIALIZER, "proxy");
		op.add(AbstractBuilder::readTimeout, Time._DESERIALIZER, "read_timeout");
		op.add(AbstractBuilder::scheme, ConnectionScheme._DESERIALIZER, "scheme");
		op.add(AbstractBuilder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
