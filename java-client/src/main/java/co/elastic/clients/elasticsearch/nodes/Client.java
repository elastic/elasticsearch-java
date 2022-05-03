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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Client

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Client">API
 *      specification</a>
 */
@JsonpDeserializable
public class Client implements JsonpSerializable {
	@Nullable
	private final Long id;

	@Nullable
	private final String agent;

	@Nullable
	private final String localAddress;

	@Nullable
	private final String remoteAddress;

	@Nullable
	private final String lastUri;

	@Nullable
	private final Long openedTimeMillis;

	@Nullable
	private final Long closedTimeMillis;

	@Nullable
	private final Long lastRequestTimeMillis;

	@Nullable
	private final Long requestCount;

	@Nullable
	private final Long requestSizeBytes;

	@Nullable
	private final String xOpaqueId;

	// ---------------------------------------------------------------------------------------------

	private Client(Builder builder) {

		this.id = builder.id;
		this.agent = builder.agent;
		this.localAddress = builder.localAddress;
		this.remoteAddress = builder.remoteAddress;
		this.lastUri = builder.lastUri;
		this.openedTimeMillis = builder.openedTimeMillis;
		this.closedTimeMillis = builder.closedTimeMillis;
		this.lastRequestTimeMillis = builder.lastRequestTimeMillis;
		this.requestCount = builder.requestCount;
		this.requestSizeBytes = builder.requestSizeBytes;
		this.xOpaqueId = builder.xOpaqueId;

	}

	public static Client of(Function<Builder, ObjectBuilder<Client>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final Long id() {
		return this.id;
	}

	/**
	 * API name: {@code agent}
	 */
	@Nullable
	public final String agent() {
		return this.agent;
	}

	/**
	 * API name: {@code local_address}
	 */
	@Nullable
	public final String localAddress() {
		return this.localAddress;
	}

	/**
	 * API name: {@code remote_address}
	 */
	@Nullable
	public final String remoteAddress() {
		return this.remoteAddress;
	}

	/**
	 * API name: {@code last_uri}
	 */
	@Nullable
	public final String lastUri() {
		return this.lastUri;
	}

	/**
	 * API name: {@code opened_time_millis}
	 */
	@Nullable
	public final Long openedTimeMillis() {
		return this.openedTimeMillis;
	}

	/**
	 * API name: {@code closed_time_millis}
	 */
	@Nullable
	public final Long closedTimeMillis() {
		return this.closedTimeMillis;
	}

	/**
	 * API name: {@code last_request_time_millis}
	 */
	@Nullable
	public final Long lastRequestTimeMillis() {
		return this.lastRequestTimeMillis;
	}

	/**
	 * API name: {@code request_count}
	 */
	@Nullable
	public final Long requestCount() {
		return this.requestCount;
	}

	/**
	 * API name: {@code request_size_bytes}
	 */
	@Nullable
	public final Long requestSizeBytes() {
		return this.requestSizeBytes;
	}

	/**
	 * API name: {@code x_opaque_id}
	 */
	@Nullable
	public final String xOpaqueId() {
		return this.xOpaqueId;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.agent != null) {
			generator.writeKey("agent");
			generator.write(this.agent);

		}
		if (this.localAddress != null) {
			generator.writeKey("local_address");
			generator.write(this.localAddress);

		}
		if (this.remoteAddress != null) {
			generator.writeKey("remote_address");
			generator.write(this.remoteAddress);

		}
		if (this.lastUri != null) {
			generator.writeKey("last_uri");
			generator.write(this.lastUri);

		}
		if (this.openedTimeMillis != null) {
			generator.writeKey("opened_time_millis");
			generator.write(this.openedTimeMillis);

		}
		if (this.closedTimeMillis != null) {
			generator.writeKey("closed_time_millis");
			generator.write(this.closedTimeMillis);

		}
		if (this.lastRequestTimeMillis != null) {
			generator.writeKey("last_request_time_millis");
			generator.write(this.lastRequestTimeMillis);

		}
		if (this.requestCount != null) {
			generator.writeKey("request_count");
			generator.write(this.requestCount);

		}
		if (this.requestSizeBytes != null) {
			generator.writeKey("request_size_bytes");
			generator.write(this.requestSizeBytes);

		}
		if (this.xOpaqueId != null) {
			generator.writeKey("x_opaque_id");
			generator.write(this.xOpaqueId);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Client}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Client> {
		@Nullable
		private Long id;

		@Nullable
		private String agent;

		@Nullable
		private String localAddress;

		@Nullable
		private String remoteAddress;

		@Nullable
		private String lastUri;

		@Nullable
		private Long openedTimeMillis;

		@Nullable
		private Long closedTimeMillis;

		@Nullable
		private Long lastRequestTimeMillis;

		@Nullable
		private Long requestCount;

		@Nullable
		private Long requestSizeBytes;

		@Nullable
		private String xOpaqueId;

		/**
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable Long value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code agent}
		 */
		public final Builder agent(@Nullable String value) {
			this.agent = value;
			return this;
		}

		/**
		 * API name: {@code local_address}
		 */
		public final Builder localAddress(@Nullable String value) {
			this.localAddress = value;
			return this;
		}

		/**
		 * API name: {@code remote_address}
		 */
		public final Builder remoteAddress(@Nullable String value) {
			this.remoteAddress = value;
			return this;
		}

		/**
		 * API name: {@code last_uri}
		 */
		public final Builder lastUri(@Nullable String value) {
			this.lastUri = value;
			return this;
		}

		/**
		 * API name: {@code opened_time_millis}
		 */
		public final Builder openedTimeMillis(@Nullable Long value) {
			this.openedTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code closed_time_millis}
		 */
		public final Builder closedTimeMillis(@Nullable Long value) {
			this.closedTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code last_request_time_millis}
		 */
		public final Builder lastRequestTimeMillis(@Nullable Long value) {
			this.lastRequestTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code request_count}
		 */
		public final Builder requestCount(@Nullable Long value) {
			this.requestCount = value;
			return this;
		}

		/**
		 * API name: {@code request_size_bytes}
		 */
		public final Builder requestSizeBytes(@Nullable Long value) {
			this.requestSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code x_opaque_id}
		 */
		public final Builder xOpaqueId(@Nullable String value) {
			this.xOpaqueId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Client}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Client build() {
			_checkSingleUse();

			return new Client(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Client}
	 */
	public static final JsonpDeserializer<Client> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Client::setupClientDeserializer);

	protected static void setupClientDeserializer(ObjectDeserializer<Client.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::agent, JsonpDeserializer.stringDeserializer(), "agent");
		op.add(Builder::localAddress, JsonpDeserializer.stringDeserializer(), "local_address");
		op.add(Builder::remoteAddress, JsonpDeserializer.stringDeserializer(), "remote_address");
		op.add(Builder::lastUri, JsonpDeserializer.stringDeserializer(), "last_uri");
		op.add(Builder::openedTimeMillis, JsonpDeserializer.longDeserializer(), "opened_time_millis");
		op.add(Builder::closedTimeMillis, JsonpDeserializer.longDeserializer(), "closed_time_millis");
		op.add(Builder::lastRequestTimeMillis, JsonpDeserializer.longDeserializer(), "last_request_time_millis");
		op.add(Builder::requestCount, JsonpDeserializer.longDeserializer(), "request_count");
		op.add(Builder::requestSizeBytes, JsonpDeserializer.longDeserializer(), "request_size_bytes");
		op.add(Builder::xOpaqueId, JsonpDeserializer.stringDeserializer(), "x_opaque_id");

	}

}
