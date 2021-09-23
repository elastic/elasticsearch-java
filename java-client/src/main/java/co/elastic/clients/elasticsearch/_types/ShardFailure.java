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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ShardFailure
public final class ShardFailure implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String node;

	private final ErrorCause reason;

	private final Number shard;

	@Nullable
	private final String status;

	// ---------------------------------------------------------------------------------------------

	public ShardFailure(Builder builder) {

		this.index = builder.index;
		this.node = builder.node;
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.status = builder.status;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code reason}
	 */
	public ErrorCause reason() {
		return this.reason;
	}

	/**
	 * API name: {@code shard}
	 */
	public Number shard() {
		return this.shard;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public String status() {
		return this.status;
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

		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.node != null) {

			generator.writeKey("node");
			generator.write(this.node);

		}

		generator.writeKey("reason");
		this.reason.serialize(generator, mapper);

		generator.writeKey("shard");
		generator.write(this.shard.doubleValue());

		if (this.status != null) {

			generator.writeKey("status");
			generator.write(this.status);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardFailure}.
	 */
	public static class Builder implements ObjectBuilder<ShardFailure> {
		@Nullable
		private String index;

		@Nullable
		private String node;

		private ErrorCause reason;

		private Number shard;

		@Nullable
		private String status;

		/**
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(ErrorCause value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.reason(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code shard}
		 */
		public Builder shard(Number value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(@Nullable String value) {
			this.status = value;
			return this;
		}

		/**
		 * Builds a {@link ShardFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardFailure build() {

			return new ShardFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardFailure}
	 */
	public static final JsonpDeserializer<ShardFailure> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardFailure::setupShardFailureDeserializer);

	protected static void setupShardFailureDeserializer(DelegatingDeserializer<ShardFailure.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::reason, ErrorCause.DESERIALIZER, "reason");
		op.add(Builder::shard, JsonpDeserializer.numberDeserializer(), "shard");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");

	}

}
