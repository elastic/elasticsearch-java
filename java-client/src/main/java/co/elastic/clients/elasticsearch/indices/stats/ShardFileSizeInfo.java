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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardFileSizeInfo
@JsonpDeserializable
public final class ShardFileSizeInfo implements JsonpSerializable {
	private final String description;

	private final long sizeInBytes;

	@Nullable
	private final Long minSizeInBytes;

	@Nullable
	private final Long maxSizeInBytes;

	@Nullable
	private final Long averageSizeInBytes;

	@Nullable
	private final Long count;

	// ---------------------------------------------------------------------------------------------

	public ShardFileSizeInfo(Builder builder) {

		this.description = Objects.requireNonNull(builder.description, "description");
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.minSizeInBytes = builder.minSizeInBytes;
		this.maxSizeInBytes = builder.maxSizeInBytes;
		this.averageSizeInBytes = builder.averageSizeInBytes;
		this.count = builder.count;

	}

	public ShardFileSizeInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code min_size_in_bytes}
	 */
	@Nullable
	public Long minSizeInBytes() {
		return this.minSizeInBytes;
	}

	/**
	 * API name: {@code max_size_in_bytes}
	 */
	@Nullable
	public Long maxSizeInBytes() {
		return this.maxSizeInBytes;
	}

	/**
	 * API name: {@code average_size_in_bytes}
	 */
	@Nullable
	public Long averageSizeInBytes() {
		return this.averageSizeInBytes;
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public Long count() {
		return this.count;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		if (this.minSizeInBytes != null) {

			generator.writeKey("min_size_in_bytes");
			generator.write(this.minSizeInBytes);

		}
		if (this.maxSizeInBytes != null) {

			generator.writeKey("max_size_in_bytes");
			generator.write(this.maxSizeInBytes);

		}
		if (this.averageSizeInBytes != null) {

			generator.writeKey("average_size_in_bytes");
			generator.write(this.averageSizeInBytes);

		}
		if (this.count != null) {

			generator.writeKey("count");
			generator.write(this.count);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardFileSizeInfo}.
	 */
	public static class Builder implements ObjectBuilder<ShardFileSizeInfo> {
		private String description;

		private Long sizeInBytes;

		@Nullable
		private Long minSizeInBytes;

		@Nullable
		private Long maxSizeInBytes;

		@Nullable
		private Long averageSizeInBytes;

		@Nullable
		private Long count;

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code min_size_in_bytes}
		 */
		public Builder minSizeInBytes(@Nullable Long value) {
			this.minSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_size_in_bytes}
		 */
		public Builder maxSizeInBytes(@Nullable Long value) {
			this.maxSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code average_size_in_bytes}
		 */
		public Builder averageSizeInBytes(@Nullable Long value) {
			this.averageSizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link ShardFileSizeInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardFileSizeInfo build() {

			return new ShardFileSizeInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardFileSizeInfo}
	 */
	public static final JsonpDeserializer<ShardFileSizeInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardFileSizeInfo::setupShardFileSizeInfoDeserializer, Builder::build);

	protected static void setupShardFileSizeInfoDeserializer(DelegatingDeserializer<ShardFileSizeInfo.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::minSizeInBytes, JsonpDeserializer.longDeserializer(), "min_size_in_bytes");
		op.add(Builder::maxSizeInBytes, JsonpDeserializer.longDeserializer(), "max_size_in_bytes");
		op.add(Builder::averageSizeInBytes, JsonpDeserializer.longDeserializer(), "average_size_in_bytes");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
