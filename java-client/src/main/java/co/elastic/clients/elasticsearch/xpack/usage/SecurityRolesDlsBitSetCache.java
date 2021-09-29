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
import java.lang.Integer;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.SecurityRolesDlsBitSetCache
@JsonpDeserializable
public final class SecurityRolesDlsBitSetCache implements JsonpSerializable {
	private final int count;

	@Nullable
	private final String memory;

	private final Number memoryInBytes;

	// ---------------------------------------------------------------------------------------------

	public SecurityRolesDlsBitSetCache(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.memory = builder.memory;
		this.memoryInBytes = Objects.requireNonNull(builder.memoryInBytes, "memory_in_bytes");

	}

	public SecurityRolesDlsBitSetCache(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code count}
	 */
	public int count() {
		return this.count;
	}

	/**
	 * API name: {@code memory}
	 */
	@Nullable
	public String memory() {
		return this.memory;
	}

	/**
	 * API name: {@code memory_in_bytes}
	 */
	public Number memoryInBytes() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDlsBitSetCache}.
	 */
	public static class Builder implements ObjectBuilder<SecurityRolesDlsBitSetCache> {
		private Integer count;

		@Nullable
		private String memory;

		private Number memoryInBytes;

		/**
		 * API name: {@code count}
		 */
		public Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public Builder memory(@Nullable String value) {
			this.memory = value;
			return this;
		}

		/**
		 * API name: {@code memory_in_bytes}
		 */
		public Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesDlsBitSetCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDlsBitSetCache build() {

			return new SecurityRolesDlsBitSetCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SecurityRolesDlsBitSetCache}
	 */
	public static final JsonpDeserializer<SecurityRolesDlsBitSetCache> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, SecurityRolesDlsBitSetCache::setupSecurityRolesDlsBitSetCacheDeserializer, Builder::build);

	protected static void setupSecurityRolesDlsBitSetCacheDeserializer(
			DelegatingDeserializer<SecurityRolesDlsBitSetCache.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::memory, JsonpDeserializer.stringDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");

	}

}
