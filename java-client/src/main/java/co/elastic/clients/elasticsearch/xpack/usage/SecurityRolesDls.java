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

// typedef: xpack.usage.SecurityRolesDls

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.SecurityRolesDls">API
 *      specification</a>
 */
@JsonpDeserializable
public class SecurityRolesDls implements JsonpSerializable {
	private final SecurityRolesDlsBitSetCache bitSetCache;

	// ---------------------------------------------------------------------------------------------

	private SecurityRolesDls(Builder builder) {

		this.bitSetCache = ApiTypeHelper.requireNonNull(builder.bitSetCache, this, "bitSetCache");

	}

	public static SecurityRolesDls of(Function<Builder, ObjectBuilder<SecurityRolesDls>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bit_set_cache}
	 */
	public final SecurityRolesDlsBitSetCache bitSetCache() {
		return this.bitSetCache;
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

		generator.writeKey("bit_set_cache");
		this.bitSetCache.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDls}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SecurityRolesDls> {
		private SecurityRolesDlsBitSetCache bitSetCache;

		/**
		 * Required - API name: {@code bit_set_cache}
		 */
		public final Builder bitSetCache(SecurityRolesDlsBitSetCache value) {
			this.bitSetCache = value;
			return this;
		}

		/**
		 * Required - API name: {@code bit_set_cache}
		 */
		public final Builder bitSetCache(
				Function<SecurityRolesDlsBitSetCache.Builder, ObjectBuilder<SecurityRolesDlsBitSetCache>> fn) {
			return this.bitSetCache(fn.apply(new SecurityRolesDlsBitSetCache.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesDls}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDls build() {
			_checkSingleUse();

			return new SecurityRolesDls(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesDls}
	 */
	public static final JsonpDeserializer<SecurityRolesDls> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SecurityRolesDls::setupSecurityRolesDlsDeserializer);

	protected static void setupSecurityRolesDlsDeserializer(ObjectDeserializer<SecurityRolesDls.Builder> op) {

		op.add(Builder::bitSetCache, SecurityRolesDlsBitSetCache._DESERIALIZER, "bit_set_cache");

	}

}
