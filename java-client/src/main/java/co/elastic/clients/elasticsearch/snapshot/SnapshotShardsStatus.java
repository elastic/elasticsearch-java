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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotShardsStatus

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SnapshotShardsStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotShardsStatus implements JsonpSerializable {
	private final ShardsStatsStage stage;

	private final ShardsStatsSummary stats;

	// ---------------------------------------------------------------------------------------------

	private SnapshotShardsStatus(Builder builder) {

		this.stage = ApiTypeHelper.requireNonNull(builder.stage, this, "stage");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");

	}

	public static SnapshotShardsStatus of(Function<Builder, ObjectBuilder<SnapshotShardsStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stage}
	 */
	public final ShardsStatsStage stage() {
		return this.stage;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final ShardsStatsSummary stats() {
		return this.stats;
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

		generator.writeKey("stage");
		this.stage.serialize(generator, mapper);
		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotShardsStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotShardsStatus> {
		private ShardsStatsStage stage;

		private ShardsStatsSummary stats;

		/**
		 * Required - API name: {@code stage}
		 */
		public final Builder stage(ShardsStatsStage value) {
			this.stage = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(ShardsStatsSummary value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<ShardsStatsSummary.Builder, ObjectBuilder<ShardsStatsSummary>> fn) {
			return this.stats(fn.apply(new ShardsStatsSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotShardsStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotShardsStatus build() {
			_checkSingleUse();

			return new SnapshotShardsStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotShardsStatus}
	 */
	public static final JsonpDeserializer<SnapshotShardsStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotShardsStatus::setupSnapshotShardsStatusDeserializer);

	protected static void setupSnapshotShardsStatusDeserializer(ObjectDeserializer<SnapshotShardsStatus.Builder> op) {

		op.add(Builder::stage, ShardsStatsStage._DESERIALIZER, "stage");
		op.add(Builder::stats, ShardsStatsSummary._DESERIALIZER, "stats");

	}

}
