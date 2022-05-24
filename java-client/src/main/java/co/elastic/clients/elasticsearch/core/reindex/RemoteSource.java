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

package co.elastic.clients.elasticsearch.core.reindex;

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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.RemoteSource

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_global.reindex.RemoteSource">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoteSource implements JsonpSerializable {
	@Nullable
	private final Time connectTimeout;

	private final Map<String, String> headers;

	private final String host;

	@Nullable
	private final String username;

	@Nullable
	private final String password;

	@Nullable
	private final Time socketTimeout;

	// ---------------------------------------------------------------------------------------------

	private RemoteSource(Builder builder) {

		this.connectTimeout = builder.connectTimeout;
		this.headers = ApiTypeHelper.unmodifiable(builder.headers);
		this.host = ApiTypeHelper.requireNonNull(builder.host, this, "host");
		this.username = builder.username;
		this.password = builder.password;
		this.socketTimeout = builder.socketTimeout;

	}

	public static RemoteSource of(Function<Builder, ObjectBuilder<RemoteSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code connect_timeout}
	 */
	@Nullable
	public final Time connectTimeout() {
		return this.connectTimeout;
	}

	/**
	 * API name: {@code headers}
	 */
	public final Map<String, String> headers() {
		return this.headers;
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * API name: {@code socket_timeout}
	 */
	@Nullable
	public final Time socketTimeout() {
		return this.socketTimeout;
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

		if (this.connectTimeout != null) {
			generator.writeKey("connect_timeout");
			this.connectTimeout.serialize(generator, mapper);

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
		generator.writeKey("host");
		generator.write(this.host);

		if (this.username != null) {
			generator.writeKey("username");
			generator.write(this.username);

		}
		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.socketTimeout != null) {
			generator.writeKey("socket_timeout");
			this.socketTimeout.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteSource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RemoteSource> {
		@Nullable
		private Time connectTimeout;

		@Nullable
		private Map<String, String> headers;

		private String host;

		@Nullable
		private String username;

		@Nullable
		private String password;

		@Nullable
		private Time socketTimeout;

		/**
		 * API name: {@code connect_timeout}
		 */
		public final Builder connectTimeout(@Nullable Time value) {
			this.connectTimeout = value;
			return this;
		}

		/**
		 * API name: {@code connect_timeout}
		 */
		public final Builder connectTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.connectTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, String> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, String value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code socket_timeout}
		 */
		public final Builder socketTimeout(@Nullable Time value) {
			this.socketTimeout = value;
			return this;
		}

		/**
		 * API name: {@code socket_timeout}
		 */
		public final Builder socketTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.socketTimeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoteSource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteSource build() {
			_checkSingleUse();

			return new RemoteSource(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoteSource}
	 */
	public static final JsonpDeserializer<RemoteSource> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RemoteSource::setupRemoteSourceDeserializer);

	protected static void setupRemoteSourceDeserializer(ObjectDeserializer<RemoteSource.Builder> op) {

		op.add(Builder::connectTimeout, Time._DESERIALIZER, "connect_timeout");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"headers");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::socketTimeout, Time._DESERIALIZER, "socket_timeout");

	}

}
