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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Pool

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Pool">API
 *      specification</a>
 */
@JsonpDeserializable
public class Pool implements JsonpSerializable {
	@Nullable
	private final Long usedInBytes;

	@Nullable
	private final Long maxInBytes;

	@Nullable
	private final Long peakUsedInBytes;

	@Nullable
	private final Long peakMaxInBytes;

	// ---------------------------------------------------------------------------------------------

	private Pool(Builder builder) {

		this.usedInBytes = builder.usedInBytes;
		this.maxInBytes = builder.maxInBytes;
		this.peakUsedInBytes = builder.peakUsedInBytes;
		this.peakMaxInBytes = builder.peakMaxInBytes;

	}

	public static Pool of(Function<Builder, ObjectBuilder<Pool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	@Nullable
	public final Long usedInBytes() {
		return this.usedInBytes;
	}

	/**
	 * API name: {@code max_in_bytes}
	 */
	@Nullable
	public final Long maxInBytes() {
		return this.maxInBytes;
	}

	/**
	 * API name: {@code peak_used_in_bytes}
	 */
	@Nullable
	public final Long peakUsedInBytes() {
		return this.peakUsedInBytes;
	}

	/**
	 * API name: {@code peak_max_in_bytes}
	 */
	@Nullable
	public final Long peakMaxInBytes() {
		return this.peakMaxInBytes;
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

		if (this.usedInBytes != null) {
			generator.writeKey("used_in_bytes");
			generator.write(this.usedInBytes);

		}
		if (this.maxInBytes != null) {
			generator.writeKey("max_in_bytes");
			generator.write(this.maxInBytes);

		}
		if (this.peakUsedInBytes != null) {
			generator.writeKey("peak_used_in_bytes");
			generator.write(this.peakUsedInBytes);

		}
		if (this.peakMaxInBytes != null) {
			generator.writeKey("peak_max_in_bytes");
			generator.write(this.peakMaxInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pool}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Pool> {
		@Nullable
		private Long usedInBytes;

		@Nullable
		private Long maxInBytes;

		@Nullable
		private Long peakUsedInBytes;

		@Nullable
		private Long peakMaxInBytes;

		/**
		 * API name: {@code used_in_bytes}
		 */
		public final Builder usedInBytes(@Nullable Long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_in_bytes}
		 */
		public final Builder maxInBytes(@Nullable Long value) {
			this.maxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code peak_used_in_bytes}
		 */
		public final Builder peakUsedInBytes(@Nullable Long value) {
			this.peakUsedInBytes = value;
			return this;
		}

		/**
		 * API name: {@code peak_max_in_bytes}
		 */
		public final Builder peakMaxInBytes(@Nullable Long value) {
			this.peakMaxInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Pool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pool build() {
			_checkSingleUse();

			return new Pool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Pool}
	 */
	public static final JsonpDeserializer<Pool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pool::setupPoolDeserializer);

	protected static void setupPoolDeserializer(ObjectDeserializer<Pool.Builder> op) {

		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");
		op.add(Builder::maxInBytes, JsonpDeserializer.longDeserializer(), "max_in_bytes");
		op.add(Builder::peakUsedInBytes, JsonpDeserializer.longDeserializer(), "peak_used_in_bytes");
		op.add(Builder::peakMaxInBytes, JsonpDeserializer.longDeserializer(), "peak_max_in_bytes");

	}

}
