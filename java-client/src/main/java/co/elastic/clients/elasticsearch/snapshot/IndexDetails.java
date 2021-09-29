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

package co.elastic.clients.elasticsearch.snapshot;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.IndexDetails
@JsonpDeserializable
public final class IndexDetails implements JsonpSerializable {
	private final int shardCount;

	@Nullable
	private final String size;

	private final long sizeInBytes;

	private final long maxSegmentsPerShard;

	// ---------------------------------------------------------------------------------------------

	public IndexDetails(Builder builder) {

		this.shardCount = Objects.requireNonNull(builder.shardCount, "shard_count");
		this.size = builder.size;
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.maxSegmentsPerShard = Objects.requireNonNull(builder.maxSegmentsPerShard, "max_segments_per_shard");

	}

	public IndexDetails(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code shard_count}
	 */
	public int shardCount() {
		return this.shardCount;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public String size() {
		return this.size;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public long sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code max_segments_per_shard}
	 */
	public long maxSegmentsPerShard() {
		return this.maxSegmentsPerShard;
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

		generator.writeKey("shard_count");
		generator.write(this.shardCount);

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

		generator.writeKey("max_segments_per_shard");
		generator.write(this.maxSegmentsPerShard);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexDetails}.
	 */
	public static class Builder implements ObjectBuilder<IndexDetails> {
		private Integer shardCount;

		@Nullable
		private String size;

		private Long sizeInBytes;

		private Long maxSegmentsPerShard;

		/**
		 * API name: {@code shard_count}
		 */
		public Builder shardCount(int value) {
			this.shardCount = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable String value) {
			this.size = value;
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
		 * API name: {@code max_segments_per_shard}
		 */
		public Builder maxSegmentsPerShard(long value) {
			this.maxSegmentsPerShard = value;
			return this;
		}

		/**
		 * Builds a {@link IndexDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexDetails build() {

			return new IndexDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexDetails}
	 */
	public static final JsonpDeserializer<IndexDetails> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexDetails::setupIndexDetailsDeserializer, Builder::build);

	protected static void setupIndexDetailsDeserializer(DelegatingDeserializer<IndexDetails.Builder> op) {

		op.add(Builder::shardCount, JsonpDeserializer.integerDeserializer(), "shard_count");
		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");
		op.add(Builder::maxSegmentsPerShard, JsonpDeserializer.longDeserializer(), "max_segments_per_shard");

	}

}
