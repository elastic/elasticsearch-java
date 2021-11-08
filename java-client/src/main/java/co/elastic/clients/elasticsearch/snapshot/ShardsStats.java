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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: snapshot._types.ShardsStats
@JsonpDeserializable
public class ShardsStats implements JsonpSerializable {
	private final long done;

	private final long failed;

	private final long finalizing;

	private final long initializing;

	private final long started;

	private final long total;

	// ---------------------------------------------------------------------------------------------

	private ShardsStats(Builder builder) {

		this.done = ModelTypeHelper.requireNonNull(builder.done, this, "done");
		this.failed = ModelTypeHelper.requireNonNull(builder.failed, this, "failed");
		this.finalizing = ModelTypeHelper.requireNonNull(builder.finalizing, this, "finalizing");
		this.initializing = ModelTypeHelper.requireNonNull(builder.initializing, this, "initializing");
		this.started = ModelTypeHelper.requireNonNull(builder.started, this, "started");
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");

	}

	public static ShardsStats of(Function<Builder, ObjectBuilder<ShardsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code done}
	 */
	public final long done() {
		return this.done;
	}

	/**
	 * Required - API name: {@code failed}
	 */
	public final long failed() {
		return this.failed;
	}

	/**
	 * Required - API name: {@code finalizing}
	 */
	public final long finalizing() {
		return this.finalizing;
	}

	/**
	 * Required - API name: {@code initializing}
	 */
	public final long initializing() {
		return this.initializing;
	}

	/**
	 * Required - API name: {@code started}
	 */
	public final long started() {
		return this.started;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardsStats> {
		private Long done;

		private Long failed;

		private Long finalizing;

		private Long initializing;

		private Long started;

		private Long total;

		/**
		 * Required - API name: {@code done}
		 */
		public final Builder done(long value) {
			this.done = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed}
		 */
		public final Builder failed(long value) {
			this.failed = value;
			return this;
		}

		/**
		 * Required - API name: {@code finalizing}
		 */
		public final Builder finalizing(long value) {
			this.finalizing = value;
			return this;
		}

		/**
		 * Required - API name: {@code initializing}
		 */
		public final Builder initializing(long value) {
			this.initializing = value;
			return this;
		}

		/**
		 * Required - API name: {@code started}
		 */
		public final Builder started(long value) {
			this.started = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
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
			_checkSingleUse();

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
