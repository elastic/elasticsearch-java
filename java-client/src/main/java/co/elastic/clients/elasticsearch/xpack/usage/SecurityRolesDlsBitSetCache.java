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
import java.lang.Integer;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRolesDlsBitSetCache

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.SecurityRolesDlsBitSetCache">API
 *      specification</a>
 */
@JsonpDeserializable
public class SecurityRolesDlsBitSetCache implements JsonpSerializable {
	private final int count;

	@Nullable
	private final String memory;

	private final Number memoryInBytes;

	// ---------------------------------------------------------------------------------------------

	private SecurityRolesDlsBitSetCache(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.memory = builder.memory;
		this.memoryInBytes = ApiTypeHelper.requireNonNull(builder.memoryInBytes, this, "memoryInBytes");

	}

	public static SecurityRolesDlsBitSetCache of(Function<Builder, ObjectBuilder<SecurityRolesDlsBitSetCache>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * API name: {@code memory}
	 */
	@Nullable
	public final String memory() {
		return this.memory;
	}

	/**
	 * Required - API name: {@code memory_in_bytes}
	 */
	public final Number memoryInBytes() {
		return this.memoryInBytes;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (this.memory != null) {
			generator.writeKey("memory");
			generator.write(this.memory);

		}
		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes.doubleValue());

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDlsBitSetCache}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SecurityRolesDlsBitSetCache> {
		private Integer count;

		@Nullable
		private String memory;

		private Number memoryInBytes;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public final Builder memory(@Nullable String value) {
			this.memory = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_in_bytes}
		 */
		public final Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesDlsBitSetCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDlsBitSetCache build() {
			_checkSingleUse();

			return new SecurityRolesDlsBitSetCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesDlsBitSetCache}
	 */
	public static final JsonpDeserializer<SecurityRolesDlsBitSetCache> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SecurityRolesDlsBitSetCache::setupSecurityRolesDlsBitSetCacheDeserializer);

	protected static void setupSecurityRolesDlsBitSetCacheDeserializer(
			ObjectDeserializer<SecurityRolesDlsBitSetCache.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::memory, JsonpDeserializer.stringDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");

	}

}
