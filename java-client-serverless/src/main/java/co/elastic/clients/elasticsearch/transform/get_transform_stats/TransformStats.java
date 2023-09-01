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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformStats implements JsonpSerializable {
	private final Checkpointing checkpointing;

	@Nullable
	private final TransformStatsHealth health;

	private final String id;

	@Nullable
	private final String reason;

	private final String state;

	private final TransformIndexerStats stats;

	// ---------------------------------------------------------------------------------------------

	private TransformStats(Builder builder) {

		this.checkpointing = ApiTypeHelper.requireNonNull(builder.checkpointing, this, "checkpointing");
		this.health = builder.health;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.reason = builder.reason;
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");

	}

	public static TransformStats of(Function<Builder, ObjectBuilder<TransformStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code checkpointing}
	 */
	public final Checkpointing checkpointing() {
		return this.checkpointing;
	}

	/**
	 * API name: {@code health}
	 */
	@Nullable
	public final TransformStatsHealth health() {
		return this.health;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final String state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final TransformIndexerStats stats() {
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

		generator.writeKey("checkpointing");
		this.checkpointing.serialize(generator, mapper);

		if (this.health != null) {
			generator.writeKey("health");
			this.health.serialize(generator, mapper);

		}
		generator.writeKey("id");
		generator.write(this.id);

		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TransformStats> {
		private Checkpointing checkpointing;

		@Nullable
		private TransformStatsHealth health;

		private String id;

		@Nullable
		private String reason;

		private String state;

		private TransformIndexerStats stats;

		/**
		 * Required - API name: {@code checkpointing}
		 */
		public final Builder checkpointing(Checkpointing value) {
			this.checkpointing = value;
			return this;
		}

		/**
		 * Required - API name: {@code checkpointing}
		 */
		public final Builder checkpointing(Function<Checkpointing.Builder, ObjectBuilder<Checkpointing>> fn) {
			return this.checkpointing(fn.apply(new Checkpointing.Builder()).build());
		}

		/**
		 * API name: {@code health}
		 */
		public final Builder health(@Nullable TransformStatsHealth value) {
			this.health = value;
			return this;
		}

		/**
		 * API name: {@code health}
		 */
		public final Builder health(Function<TransformStatsHealth.Builder, ObjectBuilder<TransformStatsHealth>> fn) {
			return this.health(fn.apply(new TransformStatsHealth.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(String value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(TransformIndexerStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<TransformIndexerStats.Builder, ObjectBuilder<TransformIndexerStats>> fn) {
			return this.stats(fn.apply(new TransformIndexerStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformStats build() {
			_checkSingleUse();

			return new TransformStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformStats}
	 */
	public static final JsonpDeserializer<TransformStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TransformStats::setupTransformStatsDeserializer);

	protected static void setupTransformStatsDeserializer(ObjectDeserializer<TransformStats.Builder> op) {

		op.add(Builder::checkpointing, Checkpointing._DESERIALIZER, "checkpointing");
		op.add(Builder::health, TransformStatsHealth._DESERIALIZER, "health");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::stats, TransformIndexerStats._DESERIALIZER, "stats");

	}

}
