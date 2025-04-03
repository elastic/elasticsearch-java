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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.Ssl

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Ssl">API
 *      specification</a>
 */
@JsonpDeserializable
public class Ssl implements JsonpSerializable {
	private final FeatureToggle http;

	private final FeatureToggle transport;

	// ---------------------------------------------------------------------------------------------

	private Ssl(Builder builder) {

		this.http = ApiTypeHelper.requireNonNull(builder.http, this, "http");
		this.transport = ApiTypeHelper.requireNonNull(builder.transport, this, "transport");

	}

	public static Ssl of(Function<Builder, ObjectBuilder<Ssl>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code http}
	 */
	public final FeatureToggle http() {
		return this.http;
	}

	/**
	 * Required - API name: {@code transport}
	 */
	public final FeatureToggle transport() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ssl}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Ssl> {
		private FeatureToggle http;

		private FeatureToggle transport;

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(FeatureToggle value) {
			this.http = value;
			return this;
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.http(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(FeatureToggle value) {
			this.transport = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.transport(fn.apply(new FeatureToggle.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Ssl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ssl build() {
			_checkSingleUse();

			return new Ssl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ssl}
	 */
	public static final JsonpDeserializer<Ssl> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ssl::setupSslDeserializer);

	protected static void setupSslDeserializer(ObjectDeserializer<Ssl.Builder> op) {

		op.add(Builder::http, FeatureToggle._DESERIALIZER, "http");
		op.add(Builder::transport, FeatureToggle._DESERIALIZER, "transport");

	}

}
