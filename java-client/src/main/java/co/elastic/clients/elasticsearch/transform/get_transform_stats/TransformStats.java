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

import co.elastic.clients.elasticsearch._types.NodeAttributes;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformStats
@JsonpDeserializable
public class TransformStats implements JsonpSerializable {
	private final Checkpointing checkpointing;

	private final String id;

	@Nullable
	private final NodeAttributes node;

	@Nullable
	private final String reason;

	private final String state;

	private final TransformIndexerStats stats;

	// ---------------------------------------------------------------------------------------------

	private TransformStats(Builder builder) {

		this.checkpointing = ModelTypeHelper.requireNonNull(builder.checkpointing, this, "checkpointing");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.node = builder.node;
		this.reason = builder.reason;
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.stats = ModelTypeHelper.requireNonNull(builder.stats, this, "stats");

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
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public final NodeAttributes node() {
		return this.node;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.node != null) {
			generator.writeKey("node");
			this.node.serialize(generator, mapper);

		}
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		generator.writeKey("state");
		generator.write(this.state);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TransformStats> {
		private Checkpointing checkpointing;

		private String id;

		@Nullable
		private NodeAttributes node;

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
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable NodeAttributes value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public final Builder node(Function<NodeAttributes.Builder, ObjectBuilder<NodeAttributes>> fn) {
			return this.node(fn.apply(new NodeAttributes.Builder()).build());
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
			TransformStats::setupTransformStatsDeserializer, Builder::build);

	protected static void setupTransformStatsDeserializer(DelegatingDeserializer<TransformStats.Builder> op) {

		op.add(Builder::checkpointing, Checkpointing._DESERIALIZER, "checkpointing");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::node, NodeAttributes._DESERIALIZER, "node");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::stats, TransformIndexerStats._DESERIALIZER, "stats");

	}

}
