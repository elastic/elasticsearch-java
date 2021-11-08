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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.RoleMapping
@JsonpDeserializable
public class RoleMapping implements JsonpSerializable {
	private final int enabled;

	private final int size;

	// ---------------------------------------------------------------------------------------------

	private RoleMapping(Builder builder) {

		this.enabled = ModelTypeHelper.requireNonNull(builder.enabled, this, "enabled");
		this.size = ModelTypeHelper.requireNonNull(builder.size, this, "size");

	}

	public static RoleMapping of(Function<Builder, ObjectBuilder<RoleMapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final int enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code size}
	 */
	public final int size() {
		return this.size;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("size");
		generator.write(this.size);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RoleMapping}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleMapping> {
		private Integer enabled;

		private Integer size;

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(int value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code size}
		 */
		public final Builder size(int value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link RoleMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RoleMapping build() {
			_checkSingleUse();

			return new RoleMapping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RoleMapping}
	 */
	public static final JsonpDeserializer<RoleMapping> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleMapping::setupRoleMappingDeserializer, Builder::build);

	protected static void setupRoleMappingDeserializer(DelegatingDeserializer<RoleMapping.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.integerDeserializer(), "enabled");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
