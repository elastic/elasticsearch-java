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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: snapshot._types.ShardsStats
public final class ShardsStats implements ToJsonp {
	private final Number done;

	private final Number failed;

	private final Number finalizing;

	private final Number initializing;

	private final Number started;

	private final Number total;

	// ---------------------------------------------------------------------------------------------

	protected ShardsStats(Builder builder) {

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
	public Number done() {
		return this.done;
	}

	/**
	 * API name: {@code failed}
	 */
	public Number failed() {
		return this.failed;
	}

	/**
	 * API name: {@code finalizing}
	 */
	public Number finalizing() {
		return this.finalizing;
	}

	/**
	 * API name: {@code initializing}
	 */
	public Number initializing() {
		return this.initializing;
	}

	/**
	 * API name: {@code started}
	 */
	public Number started() {
		return this.started;
	}

	/**
	 * API name: {@code total}
	 */
	public Number total() {
		return this.total;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("done");
		generator.write(this.done.doubleValue());

		generator.writeKey("failed");
		generator.write(this.failed.doubleValue());

		generator.writeKey("finalizing");
		generator.write(this.finalizing.doubleValue());

		generator.writeKey("initializing");
		generator.write(this.initializing.doubleValue());

		generator.writeKey("started");
		generator.write(this.started.doubleValue());

		generator.writeKey("total");
		generator.write(this.total.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardsStats> {
		private Number done;

		private Number failed;

		private Number finalizing;

		private Number initializing;

		private Number started;

		private Number total;

		/**
		 * API name: {@code done}
		 */
		public Builder done(Number value) {
			this.done = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code finalizing}
		 */
		public Builder finalizing(Number value) {
			this.finalizing = value;
			return this;
		}

		/**
		 * API name: {@code initializing}
		 */
		public Builder initializing(Number value) {
			this.initializing = value;
			return this;
		}

		/**
		 * API name: {@code started}
		 */
		public Builder started(Number value) {
			this.started = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Number value) {
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
	 * Json deserializer for ShardsStats
	 */
	public static final JsonpDeserializer<ShardsStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardsStats::setupShardsStatsDeserializer);

	protected static void setupShardsStatsDeserializer(DelegatingDeserializer<ShardsStats.Builder> op) {

		op.add(Builder::done, JsonpDeserializer.numberDeserializer(), "done");
		op.add(Builder::failed, JsonpDeserializer.numberDeserializer(), "failed");
		op.add(Builder::finalizing, JsonpDeserializer.numberDeserializer(), "finalizing");
		op.add(Builder::initializing, JsonpDeserializer.numberDeserializer(), "initializing");
		op.add(Builder::started, JsonpDeserializer.numberDeserializer(), "started");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
