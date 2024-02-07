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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.IpFilter

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.IpFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpFilter implements JsonpSerializable {
	private final boolean http;

	private final boolean transport;

	// ---------------------------------------------------------------------------------------------

	private IpFilter(Builder builder) {

		this.http = ApiTypeHelper.requireNonNull(builder.http, this, "http");
		this.transport = ApiTypeHelper.requireNonNull(builder.transport, this, "transport");

	}

	public static IpFilter of(Function<Builder, ObjectBuilder<IpFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code http}
	 */
	public final boolean http() {
		return this.http;
	}

	/**
	 * Required - API name: {@code transport}
	 */
	public final boolean transport() {
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
		generator.write(this.http);

		generator.writeKey("transport");
		generator.write(this.transport);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpFilter}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IpFilter> {
		private Boolean http;

		private Boolean transport;

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(boolean value) {
			this.http = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(boolean value) {
			this.transport = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpFilter build() {
			_checkSingleUse();

			return new IpFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpFilter}
	 */
	public static final JsonpDeserializer<IpFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpFilter::setupIpFilterDeserializer);

	protected static void setupIpFilterDeserializer(ObjectDeserializer<IpFilter.Builder> op) {

		op.add(Builder::http, JsonpDeserializer.booleanDeserializer(), "http");
		op.add(Builder::transport, JsonpDeserializer.booleanDeserializer(), "transport");

	}

}
