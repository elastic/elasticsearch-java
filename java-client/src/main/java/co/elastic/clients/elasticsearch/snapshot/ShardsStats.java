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
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.ShardsStats
@JsonpDeserializable
public final class ShardsStats implements JsonpSerializable {
	private final Long done;

	private final Long failed;

	private final Long finalizing;

	private final Long initializing;

	private final Long started;

	private final Long total;

	// ---------------------------------------------------------------------------------------------

	public ShardsStats(Builder builder) {

		this.done = Objects.requireNonNull(builder.done, "done");
		this.failed = Objects.requireNonNull(builder.failed, "failed");
		this.finalizing = Objects.requireNonNull(builder.finalizing, "finalizing");
		this.initializing = Objects.requireNonNull(builder.initializing, "initializing");
		this.started = Objects.requireNonNull(builder.started, "started");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	/**
	 * API name: {@code done}
	 */
	public Long done() {
		return this.done;
	}

	/**
	 * API name: {@code failed}
	 */
	public Long failed() {
		return this.failed;
	}

	/**
	 * API name: {@code finalizing}
	 */
	public Long finalizing() {
		return this.finalizing;
	}

	/**
	 * API name: {@code initializing}
	 */
	public Long initializing() {
		return this.initializing;
	}

	/**
	 * API name: {@code started}
	 */
	public Long started() {
		return this.started;
	}

	/**
	 * API name: {@code total}
	 */
	public Long total() {
		return this.total;
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

		generator.writeKey("done");
		generator.write(this.done);

		generator.writeKey("failed");
		generator.write(this.failed);

		generator.writeKey("finalizing");
		generator.write(this.finalizing);

		generator.writeKey("initializing");
		generator.write(this.initializing);

		generator.writeKey("started");
		generator.write(this.started);

		generator.writeKey("total");
		generator.write(this.total);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardsStats> {
		private Long done;

		private Long failed;

		private Long finalizing;

		private Long initializing;

		private Long started;

		private Long total;

		/**
		 * API name: {@code done}
		 */
		public Builder done(Long value) {
			this.done = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(Long value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code finalizing}
		 */
		public Builder finalizing(Long value) {
			this.finalizing = value;
			return this;
		}

		/**
		 * API name: {@code initializing}
		 */
		public Builder initializing(Long value) {
			this.initializing = value;
			return this;
		}

		/**
		 * API name: {@code started}
		 */
		public Builder started(Long value) {
			this.started = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Long value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStats build() {

			return new ShardsStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStats}
	 */
	public static final JsonpDeserializer<ShardsStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsStats::setupShardsStatsDeserializer, Builder::build);

	protected static void setupShardsStatsDeserializer(DelegatingDeserializer<ShardsStats.Builder> op) {

		op.add(Builder::done, JsonpDeserializer.longDeserializer(), "done");
		op.add(Builder::failed, JsonpDeserializer.longDeserializer(), "failed");
		op.add(Builder::finalizing, JsonpDeserializer.longDeserializer(), "finalizing");
		op.add(Builder::initializing, JsonpDeserializer.longDeserializer(), "initializing");
		op.add(Builder::started, JsonpDeserializer.longDeserializer(), "started");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");

	}

}
