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
import java.lang.Integer;
import java.lang.String;
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

// typedef: watcher._types.PagerDutyEventProxy

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.PagerDutyEventProxy">API
 *      specification</a>
 */
@JsonpDeserializable
public class PagerDutyEventProxy implements JsonpSerializable {
	@Nullable
	private final String host;

	@Nullable
	private final Integer port;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyEventProxy(Builder builder) {

		this.host = builder.host;
		this.port = builder.port;

	}

	public static PagerDutyEventProxy of(Function<Builder, ObjectBuilder<PagerDutyEventProxy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code host}
	 */
	@Nullable
	public final String host() {
		return this.host;
	}

	/**
	 * API name: {@code port}
	 */
	@Nullable
	public final Integer port() {
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

		if (this.host != null) {
			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.port != null) {
			generator.writeKey("port");
			generator.write(this.port);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyEventProxy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PagerDutyEventProxy> {
		@Nullable
		private String host;

		@Nullable
		private Integer port;

		/**
		 * API name: {@code host}
		 */
		public final Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code port}
		 */
		public final Builder port(@Nullable Integer value) {
			this.port = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PagerDutyEventProxy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyEventProxy build() {
			_checkSingleUse();

			return new PagerDutyEventProxy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyEventProxy}
	 */
	public static final JsonpDeserializer<PagerDutyEventProxy> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PagerDutyEventProxy::setupPagerDutyEventProxyDeserializer);

	protected static void setupPagerDutyEventProxyDeserializer(ObjectDeserializer<PagerDutyEventProxy.Builder> op) {

		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::port, JsonpDeserializer.integerDeserializer(), "port");

	}

}
