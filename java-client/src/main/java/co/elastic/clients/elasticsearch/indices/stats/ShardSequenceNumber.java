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
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices.stats.ShardSequenceNumber
@JsonpDeserializable
public final class ShardSequenceNumber implements JsonpSerializable {
	private final long globalCheckpoint;

	private final long localCheckpoint;

	private final int maxSeqNo;

	// ---------------------------------------------------------------------------------------------

	public ShardSequenceNumber(Builder builder) {

		this.globalCheckpoint = Objects.requireNonNull(builder.globalCheckpoint, "global_checkpoint");
		this.localCheckpoint = Objects.requireNonNull(builder.localCheckpoint, "local_checkpoint");
		this.maxSeqNo = Objects.requireNonNull(builder.maxSeqNo, "max_seq_no");

	}

	public ShardSequenceNumber(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code global_checkpoint}
	 */
	public long globalCheckpoint() {
		return this.globalCheckpoint;
	}

	/**
	 * API name: {@code local_checkpoint}
	 */
	public long localCheckpoint() {
		return this.localCheckpoint;
	}

	/**
	 * API name: {@code max_seq_no}
	 */
	public int maxSeqNo() {
		return this.maxSeqNo;
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

		generator.writeKey("global_checkpoint");
		generator.write(this.globalCheckpoint);

		generator.writeKey("local_checkpoint");
		generator.write(this.localCheckpoint);

		generator.writeKey("max_seq_no");
		generator.write(this.maxSeqNo);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardSequenceNumber}.
	 */
	public static class Builder implements ObjectBuilder<ShardSequenceNumber> {
		private Long globalCheckpoint;

		private Long localCheckpoint;

		private Integer maxSeqNo;

		/**
		 * API name: {@code global_checkpoint}
		 */
		public Builder globalCheckpoint(long value) {
			this.globalCheckpoint = value;
			return this;
		}

		/**
		 * API name: {@code local_checkpoint}
		 */
		public Builder localCheckpoint(long value) {
			this.localCheckpoint = value;
			return this;
		}

		/**
		 * API name: {@code max_seq_no}
		 */
		public Builder maxSeqNo(int value) {
			this.maxSeqNo = value;
			return this;
		}

		/**
		 * Builds a {@link ShardSequenceNumber}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardSequenceNumber build() {

			return new ShardSequenceNumber(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardSequenceNumber}
	 */
	public static final JsonpDeserializer<ShardSequenceNumber> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ShardSequenceNumber::setupShardSequenceNumberDeserializer, Builder::build);

	protected static void setupShardSequenceNumberDeserializer(DelegatingDeserializer<ShardSequenceNumber.Builder> op) {

		op.add(Builder::globalCheckpoint, JsonpDeserializer.longDeserializer(), "global_checkpoint");
		op.add(Builder::localCheckpoint, JsonpDeserializer.longDeserializer(), "local_checkpoint");
		op.add(Builder::maxSeqNo, JsonpDeserializer.integerDeserializer(), "max_seq_no");

	}

}
