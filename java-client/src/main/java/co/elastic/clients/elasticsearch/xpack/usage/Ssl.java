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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Ssl
@JsonpDeserializable
public final class Ssl implements JsonpSerializable {
	private final FeatureToggle http;

	private final FeatureToggle transport;

	// ---------------------------------------------------------------------------------------------

	public Ssl(Builder builder) {

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
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("http");
		this.http.serialize(generator, mapper);

		generator.writeKey("transport");
		this.transport.serialize(generator, mapper);

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
	 * Json deserializer for {@link Ssl}
	 */
	public static final JsonpDeserializer<Ssl> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ssl::setupSslDeserializer, Builder::build);

	protected static void setupSslDeserializer(DelegatingDeserializer<Ssl.Builder> op) {

		op.add(Builder::http, FeatureToggle._DESERIALIZER, "http");
		op.add(Builder::transport, FeatureToggle._DESERIALIZER, "transport");

	}

}
