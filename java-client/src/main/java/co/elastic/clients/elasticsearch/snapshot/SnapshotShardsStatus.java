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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotShardsStatus
public final class SnapshotShardsStatus implements ToJsonp {
	private final JsonValue stage;

	private final ShardsStatsSummary stats;

	// ---------------------------------------------------------------------------------------------

	protected SnapshotShardsStatus(Builder builder) {

		this.stage = Objects.requireNonNull(builder.stage, "stage");
		this.stats = Objects.requireNonNull(builder.stats, "stats");

	}

	/**
	 * API name: {@code stage}
	 */
	public JsonValue stage() {
		return this.stage;
	}

	/**
	 * API name: {@code stats}
	 */
	public ShardsStatsSummary stats() {
		return this.stats;
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

		generator.writeKey("stage");
		generator.write(this.stage);

		generator.writeKey("stats");
		this.stats.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotShardsStatus}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotShardsStatus> {
		private JsonValue stage;

		private ShardsStatsSummary stats;

		/**
		 * API name: {@code stage}
		 */
		public Builder stage(JsonValue value) {
			this.stage = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(ShardsStatsSummary value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public Builder stats(Function<ShardsStatsSummary.Builder, ObjectBuilder<ShardsStatsSummary>> fn) {
			return this.stats(fn.apply(new ShardsStatsSummary.Builder()).build());
		}

		/**
		 * Builds a {@link SnapshotShardsStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotShardsStatus build() {

			return new SnapshotShardsStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for SnapshotShardsStatus
	 */
	public static final JsonpDeserializer<SnapshotShardsStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, SnapshotShardsStatus::setupSnapshotShardsStatusDeserializer);

	protected static void setupSnapshotShardsStatusDeserializer(
			DelegatingDeserializer<SnapshotShardsStatus.Builder> op) {

		op.add(Builder::stage, JsonpDeserializer.jsonValueDeserializer(), "stage");
		op.add(Builder::stats, ShardsStatsSummary.DESERIALIZER, "stats");

	}

}
