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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.CgroupMemory

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.CgroupMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class CgroupMemory implements JsonpSerializable {
	@Nullable
	private final String controlGroup;

	@Nullable
	private final String limitInBytes;

	@Nullable
	private final String usageInBytes;

	// ---------------------------------------------------------------------------------------------

	private CgroupMemory(Builder builder) {

		this.controlGroup = builder.controlGroup;
		this.limitInBytes = builder.limitInBytes;
		this.usageInBytes = builder.usageInBytes;

	}

	public static CgroupMemory of(Function<Builder, ObjectBuilder<CgroupMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code control_group}
	 */
	@Nullable
	public final String controlGroup() {
		return this.controlGroup;
	}

	/**
	 * API name: {@code limit_in_bytes}
	 */
	@Nullable
	public final String limitInBytes() {
		return this.limitInBytes;
	}

	/**
	 * API name: {@code usage_in_bytes}
	 */
	@Nullable
	public final String usageInBytes() {
		return this.usageInBytes;
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

		if (this.controlGroup != null) {
			generator.writeKey("control_group");
			generator.write(this.controlGroup);

		}
		if (this.limitInBytes != null) {
			generator.writeKey("limit_in_bytes");
			generator.write(this.limitInBytes);

		}
		if (this.usageInBytes != null) {
			generator.writeKey("usage_in_bytes");
			generator.write(this.usageInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CgroupMemory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CgroupMemory> {
		@Nullable
		private String controlGroup;

		@Nullable
		private String limitInBytes;

		@Nullable
		private String usageInBytes;

		/**
		 * API name: {@code control_group}
		 */
		public final Builder controlGroup(@Nullable String value) {
			this.controlGroup = value;
			return this;
		}

		/**
		 * API name: {@code limit_in_bytes}
		 */
		public final Builder limitInBytes(@Nullable String value) {
			this.limitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code usage_in_bytes}
		 */
		public final Builder usageInBytes(@Nullable String value) {
			this.usageInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CgroupMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CgroupMemory build() {
			_checkSingleUse();

			return new CgroupMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CgroupMemory}
	 */
	public static final JsonpDeserializer<CgroupMemory> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CgroupMemory::setupCgroupMemoryDeserializer);

	protected static void setupCgroupMemoryDeserializer(ObjectDeserializer<CgroupMemory.Builder> op) {

		op.add(Builder::controlGroup, JsonpDeserializer.stringDeserializer(), "control_group");
		op.add(Builder::limitInBytes, JsonpDeserializer.stringDeserializer(), "limit_in_bytes");
		op.add(Builder::usageInBytes, JsonpDeserializer.stringDeserializer(), "usage_in_bytes");

	}

}
