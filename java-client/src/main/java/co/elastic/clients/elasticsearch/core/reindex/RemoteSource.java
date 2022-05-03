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
	private final Time connectTimeout;

	private final String host;

	private final String username;

	private final String password;

	private final Time socketTimeout;

	// ---------------------------------------------------------------------------------------------

	private RemoteSource(Builder builder) {

		this.connectTimeout = ApiTypeHelper.requireNonNull(builder.connectTimeout, this, "connectTimeout");
		this.host = ApiTypeHelper.requireNonNull(builder.host, this, "host");
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.password = ApiTypeHelper.requireNonNull(builder.password, this, "password");
		this.socketTimeout = ApiTypeHelper.requireNonNull(builder.socketTimeout, this, "socketTimeout");

	}

	public static RemoteSource of(Function<Builder, ObjectBuilder<RemoteSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code connect_timeout}
	 */
	public final Time connectTimeout() {
		return this.connectTimeout;
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code password}
	 */
	public final String password() {
		return this.password;
	}

	/**
	 * Required - API name: {@code socket_timeout}
	 */
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

		generator.writeKey("connect_timeout");
		this.connectTimeout.serialize(generator, mapper);

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("password");
		generator.write(this.password);

		generator.writeKey("socket_timeout");
		this.socketTimeout.serialize(generator, mapper);

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
		private Time connectTimeout;

		private String host;

		private String username;

		private String password;

		private Time socketTimeout;

		/**
		 * Required - API name: {@code connect_timeout}
		 */
		public final Builder connectTimeout(Time value) {
			this.connectTimeout = value;
			return this;
		}

		/**
		 * Required - API name: {@code connect_timeout}
		 */
		public final Builder connectTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.connectTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - API name: {@code password}
		 */
		public final Builder password(String value) {
			this.password = value;
			return this;
		}

		/**
		 * Required - API name: {@code socket_timeout}
		 */
		public final Builder socketTimeout(Time value) {
			this.socketTimeout = value;
			return this;
		}

		/**
		 * Required - API name: {@code socket_timeout}
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
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::socketTimeout, Time._DESERIALIZER, "socket_timeout");

	}

}
