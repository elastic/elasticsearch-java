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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.IndexDetails
public final class IndexDetails implements JsonpSerializable {
	private final Number shardCount;

	@Nullable
	private final JsonValue size;

	private final Number sizeInBytes;

	private final Number maxSegmentsPerShard;

	// ---------------------------------------------------------------------------------------------

	public IndexDetails(Builder builder) {

		this.shardCount = Objects.requireNonNull(builder.shardCount, "shard_count");
		this.size = builder.size;
		this.sizeInBytes = Objects.requireNonNull(builder.sizeInBytes, "size_in_bytes");
		this.maxSegmentsPerShard = Objects.requireNonNull(builder.maxSegmentsPerShard, "max_segments_per_shard");

	}

	/**
	 * API name: {@code shard_count}
	 */
	public Number shardCount() {
		return this.shardCount;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue size() {
		return this.size;
	}

	/**
	 * API name: {@code size_in_bytes}
	 */
	public Number sizeInBytes() {
		return this.sizeInBytes;
	}

	/**
	 * API name: {@code max_segments_per_shard}
	 */
	public Number maxSegmentsPerShard() {
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
		generator.write(this.shardCount.doubleValue());

		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes.doubleValue());

		generator.writeKey("max_segments_per_shard");
		generator.write(this.maxSegmentsPerShard.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexDetails}.
	 */
	public static class Builder implements ObjectBuilder<IndexDetails> {
		private Number shardCount;

		@Nullable
		private JsonValue size;

		private Number sizeInBytes;

		private Number maxSegmentsPerShard;

		/**
		 * API name: {@code shard_count}
		 */
		public Builder shardCount(Number value) {
			this.shardCount = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size_in_bytes}
		 */
		public Builder sizeInBytes(Number value) {
			this.sizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_segments_per_shard}
		 */
		public Builder maxSegmentsPerShard(Number value) {
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
	public static final JsonpDeserializer<IndexDetails> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexDetails::setupIndexDetailsDeserializer);

	protected static void setupIndexDetailsDeserializer(DelegatingDeserializer<IndexDetails.Builder> op) {

		op.add(Builder::shardCount, JsonpDeserializer.numberDeserializer(), "shard_count");
		op.add(Builder::size, JsonpDeserializer.jsonValueDeserializer(), "size");
		op.add(Builder::sizeInBytes, JsonpDeserializer.numberDeserializer(), "size_in_bytes");
		op.add(Builder::maxSegmentsPerShard, JsonpDeserializer.numberDeserializer(), "max_segments_per_shard");

	}

}
