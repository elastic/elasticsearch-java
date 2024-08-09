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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ilm._types.Actions

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.Actions">API
 *      specification</a>
 */
@JsonpDeserializable
public class Actions implements JsonpSerializable {
	@Nullable
	private final AllocateAction allocate;

	@Nullable
	private final DeleteAction delete;

	@Nullable
	private final DownsampleAction downsample;

	@Nullable
	private final EmptyObject freeze;

	@Nullable
	private final ForceMergeAction forcemerge;

	@Nullable
	private final MigrateAction migrate;

	@Nullable
	private final EmptyObject readonly;

	@Nullable
	private final RolloverAction rollover;

	@Nullable
	private final SetPriorityAction setPriority;

	@Nullable
	private final SearchableSnapshotAction searchableSnapshot;

	@Nullable
	private final ShrinkAction shrink;

	@Nullable
	private final EmptyObject unfollow;

	@Nullable
	private final WaitForSnapshotAction waitForSnapshot;

	// ---------------------------------------------------------------------------------------------

	private Actions(Builder builder) {

		this.allocate = builder.allocate;
		this.delete = builder.delete;
		this.downsample = builder.downsample;
		this.freeze = builder.freeze;
		this.forcemerge = builder.forcemerge;
		this.migrate = builder.migrate;
		this.readonly = builder.readonly;
		this.rollover = builder.rollover;
		this.setPriority = builder.setPriority;
		this.searchableSnapshot = builder.searchableSnapshot;
		this.shrink = builder.shrink;
		this.unfollow = builder.unfollow;
		this.waitForSnapshot = builder.waitForSnapshot;

	}

	public static Actions of(Function<Builder, ObjectBuilder<Actions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Phases allowed: warm, cold.
	 * <p>
	 * API name: {@code allocate}
	 */
	@Nullable
	public final AllocateAction allocate() {
		return this.allocate;
	}

	/**
	 * Phases allowed: delete.
	 * <p>
	 * API name: {@code delete}
	 */
	@Nullable
	public final DeleteAction delete() {
		return this.delete;
	}

	/**
	 * Phases allowed: hot, warm, cold.
	 * <p>
	 * API name: {@code downsample}
	 */
	@Nullable
	public final DownsampleAction downsample() {
		return this.downsample;
	}

	/**
	 * The freeze action is a noop in 8.x
	 * <p>
	 * API name: {@code freeze}
	 * 
	 * @deprecated 7.0.0
	 */
	@Deprecated
	@Nullable
	public final EmptyObject freeze() {
		return this.freeze;
	}

	/**
	 * Phases allowed: hot, warm.
	 * <p>
	 * API name: {@code forcemerge}
	 */
	@Nullable
	public final ForceMergeAction forcemerge() {
		return this.forcemerge;
	}

	/**
	 * Phases allowed: warm, cold.
	 * <p>
	 * API name: {@code migrate}
	 */
	@Nullable
	public final MigrateAction migrate() {
		return this.migrate;
	}

	/**
	 * Phases allowed: hot, warm, cold.
	 * <p>
	 * API name: {@code readonly}
	 */
	@Nullable
	public final EmptyObject readonly() {
		return this.readonly;
	}

	/**
	 * Phases allowed: hot.
	 * <p>
	 * API name: {@code rollover}
	 */
	@Nullable
	public final RolloverAction rollover() {
		return this.rollover;
	}

	/**
	 * Phases allowed: hot, warm, cold.
	 * <p>
	 * API name: {@code set_priority}
	 */
	@Nullable
	public final SetPriorityAction setPriority() {
		return this.setPriority;
	}

	/**
	 * Phases allowed: hot, cold, frozen.
	 * <p>
	 * API name: {@code searchable_snapshot}
	 */
	@Nullable
	public final SearchableSnapshotAction searchableSnapshot() {
		return this.searchableSnapshot;
	}

	/**
	 * Phases allowed: hot, warm.
	 * <p>
	 * API name: {@code shrink}
	 */
	@Nullable
	public final ShrinkAction shrink() {
		return this.shrink;
	}

	/**
	 * Phases allowed: hot, warm, cold, frozen.
	 * <p>
	 * API name: {@code unfollow}
	 */
	@Nullable
	public final EmptyObject unfollow() {
		return this.unfollow;
	}

	/**
	 * Phases allowed: delete.
	 * <p>
	 * API name: {@code wait_for_snapshot}
	 */
	@Nullable
	public final WaitForSnapshotAction waitForSnapshot() {
		return this.waitForSnapshot;
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

		if (this.allocate != null) {
			generator.writeKey("allocate");
			this.allocate.serialize(generator, mapper);

		}
		if (this.delete != null) {
			generator.writeKey("delete");
			this.delete.serialize(generator, mapper);

		}
		if (this.downsample != null) {
			generator.writeKey("downsample");
			this.downsample.serialize(generator, mapper);

		}
		if (this.freeze != null) {
			generator.writeKey("freeze");
			this.freeze.serialize(generator, mapper);

		}
		if (this.forcemerge != null) {
			generator.writeKey("forcemerge");
			this.forcemerge.serialize(generator, mapper);

		}
		if (this.migrate != null) {
			generator.writeKey("migrate");
			this.migrate.serialize(generator, mapper);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			this.readonly.serialize(generator, mapper);

		}
		if (this.rollover != null) {
			generator.writeKey("rollover");
			this.rollover.serialize(generator, mapper);

		}
		if (this.setPriority != null) {
			generator.writeKey("set_priority");
			this.setPriority.serialize(generator, mapper);

		}
		if (this.searchableSnapshot != null) {
			generator.writeKey("searchable_snapshot");
			this.searchableSnapshot.serialize(generator, mapper);

		}
		if (this.shrink != null) {
			generator.writeKey("shrink");
			this.shrink.serialize(generator, mapper);

		}
		if (this.unfollow != null) {
			generator.writeKey("unfollow");
			this.unfollow.serialize(generator, mapper);

		}
		if (this.waitForSnapshot != null) {
			generator.writeKey("wait_for_snapshot");
			this.waitForSnapshot.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Actions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Actions> {
		@Nullable
		private AllocateAction allocate;

		@Nullable
		private DeleteAction delete;

		@Nullable
		private DownsampleAction downsample;

		@Nullable
		private EmptyObject freeze;

		@Nullable
		private ForceMergeAction forcemerge;

		@Nullable
		private MigrateAction migrate;

		@Nullable
		private EmptyObject readonly;

		@Nullable
		private RolloverAction rollover;

		@Nullable
		private SetPriorityAction setPriority;

		@Nullable
		private SearchableSnapshotAction searchableSnapshot;

		@Nullable
		private ShrinkAction shrink;

		@Nullable
		private EmptyObject unfollow;

		@Nullable
		private WaitForSnapshotAction waitForSnapshot;

		/**
		 * Phases allowed: warm, cold.
		 * <p>
		 * API name: {@code allocate}
		 */
		public final Builder allocate(@Nullable AllocateAction value) {
			this.allocate = value;
			return this;
		}

		/**
		 * Phases allowed: warm, cold.
		 * <p>
		 * API name: {@code allocate}
		 */
		public final Builder allocate(Function<AllocateAction.Builder, ObjectBuilder<AllocateAction>> fn) {
			return this.allocate(fn.apply(new AllocateAction.Builder()).build());
		}

		/**
		 * Phases allowed: delete.
		 * <p>
		 * API name: {@code delete}
		 */
		public final Builder delete(@Nullable DeleteAction value) {
			this.delete = value;
			return this;
		}

		/**
		 * Phases allowed: delete.
		 * <p>
		 * API name: {@code delete}
		 */
		public final Builder delete(Function<DeleteAction.Builder, ObjectBuilder<DeleteAction>> fn) {
			return this.delete(fn.apply(new DeleteAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code downsample}
		 */
		public final Builder downsample(@Nullable DownsampleAction value) {
			this.downsample = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code downsample}
		 */
		public final Builder downsample(Function<DownsampleAction.Builder, ObjectBuilder<DownsampleAction>> fn) {
			return this.downsample(fn.apply(new DownsampleAction.Builder()).build());
		}

		/**
		 * The freeze action is a noop in 8.x
		 * <p>
		 * API name: {@code freeze}
		 * 
		 * @deprecated 7.0.0
		 */
		@Deprecated
		public final Builder freeze(@Nullable EmptyObject value) {
			this.freeze = value;
			return this;
		}

		/**
		 * The freeze action is a noop in 8.x
		 * <p>
		 * API name: {@code freeze}
		 * 
		 * @deprecated 7.0.0
		 */
		@Deprecated
		public final Builder freeze(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.freeze(fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm.
		 * <p>
		 * API name: {@code forcemerge}
		 */
		public final Builder forcemerge(@Nullable ForceMergeAction value) {
			this.forcemerge = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm.
		 * <p>
		 * API name: {@code forcemerge}
		 */
		public final Builder forcemerge(Function<ForceMergeAction.Builder, ObjectBuilder<ForceMergeAction>> fn) {
			return this.forcemerge(fn.apply(new ForceMergeAction.Builder()).build());
		}

		/**
		 * Phases allowed: warm, cold.
		 * <p>
		 * API name: {@code migrate}
		 */
		public final Builder migrate(@Nullable MigrateAction value) {
			this.migrate = value;
			return this;
		}

		/**
		 * Phases allowed: warm, cold.
		 * <p>
		 * API name: {@code migrate}
		 */
		public final Builder migrate(Function<MigrateAction.Builder, ObjectBuilder<MigrateAction>> fn) {
			return this.migrate(fn.apply(new MigrateAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code readonly}
		 */
		public final Builder readonly(@Nullable EmptyObject value) {
			this.readonly = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code readonly}
		 */
		public final Builder readonly(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.readonly(fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Phases allowed: hot.
		 * <p>
		 * API name: {@code rollover}
		 */
		public final Builder rollover(@Nullable RolloverAction value) {
			this.rollover = value;
			return this;
		}

		/**
		 * Phases allowed: hot.
		 * <p>
		 * API name: {@code rollover}
		 */
		public final Builder rollover(Function<RolloverAction.Builder, ObjectBuilder<RolloverAction>> fn) {
			return this.rollover(fn.apply(new RolloverAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code set_priority}
		 */
		public final Builder setPriority(@Nullable SetPriorityAction value) {
			this.setPriority = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm, cold.
		 * <p>
		 * API name: {@code set_priority}
		 */
		public final Builder setPriority(Function<SetPriorityAction.Builder, ObjectBuilder<SetPriorityAction>> fn) {
			return this.setPriority(fn.apply(new SetPriorityAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, cold, frozen.
		 * <p>
		 * API name: {@code searchable_snapshot}
		 */
		public final Builder searchableSnapshot(@Nullable SearchableSnapshotAction value) {
			this.searchableSnapshot = value;
			return this;
		}

		/**
		 * Phases allowed: hot, cold, frozen.
		 * <p>
		 * API name: {@code searchable_snapshot}
		 */
		public final Builder searchableSnapshot(
				Function<SearchableSnapshotAction.Builder, ObjectBuilder<SearchableSnapshotAction>> fn) {
			return this.searchableSnapshot(fn.apply(new SearchableSnapshotAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm.
		 * <p>
		 * API name: {@code shrink}
		 */
		public final Builder shrink(@Nullable ShrinkAction value) {
			this.shrink = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm.
		 * <p>
		 * API name: {@code shrink}
		 */
		public final Builder shrink(Function<ShrinkAction.Builder, ObjectBuilder<ShrinkAction>> fn) {
			return this.shrink(fn.apply(new ShrinkAction.Builder()).build());
		}

		/**
		 * Phases allowed: hot, warm, cold, frozen.
		 * <p>
		 * API name: {@code unfollow}
		 */
		public final Builder unfollow(@Nullable EmptyObject value) {
			this.unfollow = value;
			return this;
		}

		/**
		 * Phases allowed: hot, warm, cold, frozen.
		 * <p>
		 * API name: {@code unfollow}
		 */
		public final Builder unfollow(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.unfollow(fn.apply(new EmptyObject.Builder()).build());
		}

		/**
		 * Phases allowed: delete.
		 * <p>
		 * API name: {@code wait_for_snapshot}
		 */
		public final Builder waitForSnapshot(@Nullable WaitForSnapshotAction value) {
			this.waitForSnapshot = value;
			return this;
		}

		/**
		 * Phases allowed: delete.
		 * <p>
		 * API name: {@code wait_for_snapshot}
		 */
		public final Builder waitForSnapshot(
				Function<WaitForSnapshotAction.Builder, ObjectBuilder<WaitForSnapshotAction>> fn) {
			return this.waitForSnapshot(fn.apply(new WaitForSnapshotAction.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Actions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Actions build() {
			_checkSingleUse();

			return new Actions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Actions}
	 */
	public static final JsonpDeserializer<Actions> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Actions::setupActionsDeserializer);

	protected static void setupActionsDeserializer(ObjectDeserializer<Actions.Builder> op) {

		op.add(Builder::allocate, AllocateAction._DESERIALIZER, "allocate");
		op.add(Builder::delete, DeleteAction._DESERIALIZER, "delete");
		op.add(Builder::downsample, DownsampleAction._DESERIALIZER, "downsample");
		op.add(Builder::freeze, EmptyObject._DESERIALIZER, "freeze");
		op.add(Builder::forcemerge, ForceMergeAction._DESERIALIZER, "forcemerge");
		op.add(Builder::migrate, MigrateAction._DESERIALIZER, "migrate");
		op.add(Builder::readonly, EmptyObject._DESERIALIZER, "readonly");
		op.add(Builder::rollover, RolloverAction._DESERIALIZER, "rollover");
		op.add(Builder::setPriority, SetPriorityAction._DESERIALIZER, "set_priority");
		op.add(Builder::searchableSnapshot, SearchableSnapshotAction._DESERIALIZER, "searchable_snapshot");
		op.add(Builder::shrink, ShrinkAction._DESERIALIZER, "shrink");
		op.add(Builder::unfollow, EmptyObject._DESERIALIZER, "unfollow");
		op.add(Builder::waitForSnapshot, WaitForSnapshotAction._DESERIALIZER, "wait_for_snapshot");

	}

}
