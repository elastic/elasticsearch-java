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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.ClusterStateUpdate

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.ClusterStateUpdate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterStateUpdate implements JsonpSerializable {
	private final long count;

	@Nullable
	private final Time computationTime;

	@Nullable
	private final Long computationTimeMillis;

	@Nullable
	private final Time publicationTime;

	@Nullable
	private final Long publicationTimeMillis;

	@Nullable
	private final Time contextConstructionTime;

	@Nullable
	private final Long contextConstructionTimeMillis;

	@Nullable
	private final Time commitTime;

	@Nullable
	private final Long commitTimeMillis;

	@Nullable
	private final Time completionTime;

	@Nullable
	private final Long completionTimeMillis;

	@Nullable
	private final Time masterApplyTime;

	@Nullable
	private final Long masterApplyTimeMillis;

	@Nullable
	private final Time notificationTime;

	@Nullable
	private final Long notificationTimeMillis;

	// ---------------------------------------------------------------------------------------------

	private ClusterStateUpdate(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.computationTime = builder.computationTime;
		this.computationTimeMillis = builder.computationTimeMillis;
		this.publicationTime = builder.publicationTime;
		this.publicationTimeMillis = builder.publicationTimeMillis;
		this.contextConstructionTime = builder.contextConstructionTime;
		this.contextConstructionTimeMillis = builder.contextConstructionTimeMillis;
		this.commitTime = builder.commitTime;
		this.commitTimeMillis = builder.commitTimeMillis;
		this.completionTime = builder.completionTime;
		this.completionTimeMillis = builder.completionTimeMillis;
		this.masterApplyTime = builder.masterApplyTime;
		this.masterApplyTimeMillis = builder.masterApplyTimeMillis;
		this.notificationTime = builder.notificationTime;
		this.notificationTimeMillis = builder.notificationTimeMillis;

	}

	public static ClusterStateUpdate of(Function<Builder, ObjectBuilder<ClusterStateUpdate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code computation_time}
	 */
	@Nullable
	public final Time computationTime() {
		return this.computationTime;
	}

	/**
	 * API name: {@code computation_time_millis}
	 */
	@Nullable
	public final Long computationTimeMillis() {
		return this.computationTimeMillis;
	}

	/**
	 * API name: {@code publication_time}
	 */
	@Nullable
	public final Time publicationTime() {
		return this.publicationTime;
	}

	/**
	 * API name: {@code publication_time_millis}
	 */
	@Nullable
	public final Long publicationTimeMillis() {
		return this.publicationTimeMillis;
	}

	/**
	 * API name: {@code context_construction_time}
	 */
	@Nullable
	public final Time contextConstructionTime() {
		return this.contextConstructionTime;
	}

	/**
	 * API name: {@code context_construction_time_millis}
	 */
	@Nullable
	public final Long contextConstructionTimeMillis() {
		return this.contextConstructionTimeMillis;
	}

	/**
	 * API name: {@code commit_time}
	 */
	@Nullable
	public final Time commitTime() {
		return this.commitTime;
	}

	/**
	 * API name: {@code commit_time_millis}
	 */
	@Nullable
	public final Long commitTimeMillis() {
		return this.commitTimeMillis;
	}

	/**
	 * API name: {@code completion_time}
	 */
	@Nullable
	public final Time completionTime() {
		return this.completionTime;
	}

	/**
	 * API name: {@code completion_time_millis}
	 */
	@Nullable
	public final Long completionTimeMillis() {
		return this.completionTimeMillis;
	}

	/**
	 * API name: {@code master_apply_time}
	 */
	@Nullable
	public final Time masterApplyTime() {
		return this.masterApplyTime;
	}

	/**
	 * API name: {@code master_apply_time_millis}
	 */
	@Nullable
	public final Long masterApplyTimeMillis() {
		return this.masterApplyTimeMillis;
	}

	/**
	 * API name: {@code notification_time}
	 */
	@Nullable
	public final Time notificationTime() {
		return this.notificationTime;
	}

	/**
	 * API name: {@code notification_time_millis}
	 */
	@Nullable
	public final Long notificationTimeMillis() {
		return this.notificationTimeMillis;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (this.computationTime != null) {
			generator.writeKey("computation_time");
			this.computationTime.serialize(generator, mapper);

		}
		if (this.computationTimeMillis != null) {
			generator.writeKey("computation_time_millis");
			generator.write(this.computationTimeMillis);

		}
		if (this.publicationTime != null) {
			generator.writeKey("publication_time");
			this.publicationTime.serialize(generator, mapper);

		}
		if (this.publicationTimeMillis != null) {
			generator.writeKey("publication_time_millis");
			generator.write(this.publicationTimeMillis);

		}
		if (this.contextConstructionTime != null) {
			generator.writeKey("context_construction_time");
			this.contextConstructionTime.serialize(generator, mapper);

		}
		if (this.contextConstructionTimeMillis != null) {
			generator.writeKey("context_construction_time_millis");
			generator.write(this.contextConstructionTimeMillis);

		}
		if (this.commitTime != null) {
			generator.writeKey("commit_time");
			this.commitTime.serialize(generator, mapper);

		}
		if (this.commitTimeMillis != null) {
			generator.writeKey("commit_time_millis");
			generator.write(this.commitTimeMillis);

		}
		if (this.completionTime != null) {
			generator.writeKey("completion_time");
			this.completionTime.serialize(generator, mapper);

		}
		if (this.completionTimeMillis != null) {
			generator.writeKey("completion_time_millis");
			generator.write(this.completionTimeMillis);

		}
		if (this.masterApplyTime != null) {
			generator.writeKey("master_apply_time");
			this.masterApplyTime.serialize(generator, mapper);

		}
		if (this.masterApplyTimeMillis != null) {
			generator.writeKey("master_apply_time_millis");
			generator.write(this.masterApplyTimeMillis);

		}
		if (this.notificationTime != null) {
			generator.writeKey("notification_time");
			this.notificationTime.serialize(generator, mapper);

		}
		if (this.notificationTimeMillis != null) {
			generator.writeKey("notification_time_millis");
			generator.write(this.notificationTimeMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateUpdate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterStateUpdate> {
		private Long count;

		@Nullable
		private Time computationTime;

		@Nullable
		private Long computationTimeMillis;

		@Nullable
		private Time publicationTime;

		@Nullable
		private Long publicationTimeMillis;

		@Nullable
		private Time contextConstructionTime;

		@Nullable
		private Long contextConstructionTimeMillis;

		@Nullable
		private Time commitTime;

		@Nullable
		private Long commitTimeMillis;

		@Nullable
		private Time completionTime;

		@Nullable
		private Long completionTimeMillis;

		@Nullable
		private Time masterApplyTime;

		@Nullable
		private Long masterApplyTimeMillis;

		@Nullable
		private Time notificationTime;

		@Nullable
		private Long notificationTimeMillis;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code computation_time}
		 */
		public final Builder computationTime(@Nullable Time value) {
			this.computationTime = value;
			return this;
		}

		/**
		 * API name: {@code computation_time}
		 */
		public final Builder computationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.computationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code computation_time_millis}
		 */
		public final Builder computationTimeMillis(@Nullable Long value) {
			this.computationTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code publication_time}
		 */
		public final Builder publicationTime(@Nullable Time value) {
			this.publicationTime = value;
			return this;
		}

		/**
		 * API name: {@code publication_time}
		 */
		public final Builder publicationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.publicationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code publication_time_millis}
		 */
		public final Builder publicationTimeMillis(@Nullable Long value) {
			this.publicationTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code context_construction_time}
		 */
		public final Builder contextConstructionTime(@Nullable Time value) {
			this.contextConstructionTime = value;
			return this;
		}

		/**
		 * API name: {@code context_construction_time}
		 */
		public final Builder contextConstructionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.contextConstructionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code context_construction_time_millis}
		 */
		public final Builder contextConstructionTimeMillis(@Nullable Long value) {
			this.contextConstructionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code commit_time}
		 */
		public final Builder commitTime(@Nullable Time value) {
			this.commitTime = value;
			return this;
		}

		/**
		 * API name: {@code commit_time}
		 */
		public final Builder commitTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.commitTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code commit_time_millis}
		 */
		public final Builder commitTimeMillis(@Nullable Long value) {
			this.commitTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code completion_time}
		 */
		public final Builder completionTime(@Nullable Time value) {
			this.completionTime = value;
			return this;
		}

		/**
		 * API name: {@code completion_time}
		 */
		public final Builder completionTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.completionTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code completion_time_millis}
		 */
		public final Builder completionTimeMillis(@Nullable Long value) {
			this.completionTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code master_apply_time}
		 */
		public final Builder masterApplyTime(@Nullable Time value) {
			this.masterApplyTime = value;
			return this;
		}

		/**
		 * API name: {@code master_apply_time}
		 */
		public final Builder masterApplyTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterApplyTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code master_apply_time_millis}
		 */
		public final Builder masterApplyTimeMillis(@Nullable Long value) {
			this.masterApplyTimeMillis = value;
			return this;
		}

		/**
		 * API name: {@code notification_time}
		 */
		public final Builder notificationTime(@Nullable Time value) {
			this.notificationTime = value;
			return this;
		}

		/**
		 * API name: {@code notification_time}
		 */
		public final Builder notificationTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.notificationTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code notification_time_millis}
		 */
		public final Builder notificationTimeMillis(@Nullable Long value) {
			this.notificationTimeMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterStateUpdate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateUpdate build() {
			_checkSingleUse();

			return new ClusterStateUpdate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateUpdate}
	 */
	public static final JsonpDeserializer<ClusterStateUpdate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterStateUpdate::setupClusterStateUpdateDeserializer);

	protected static void setupClusterStateUpdateDeserializer(ObjectDeserializer<ClusterStateUpdate.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::computationTime, Time._DESERIALIZER, "computation_time");
		op.add(Builder::computationTimeMillis, JsonpDeserializer.longDeserializer(), "computation_time_millis");
		op.add(Builder::publicationTime, Time._DESERIALIZER, "publication_time");
		op.add(Builder::publicationTimeMillis, JsonpDeserializer.longDeserializer(), "publication_time_millis");
		op.add(Builder::contextConstructionTime, Time._DESERIALIZER, "context_construction_time");
		op.add(Builder::contextConstructionTimeMillis, JsonpDeserializer.longDeserializer(),
				"context_construction_time_millis");
		op.add(Builder::commitTime, Time._DESERIALIZER, "commit_time");
		op.add(Builder::commitTimeMillis, JsonpDeserializer.longDeserializer(), "commit_time_millis");
		op.add(Builder::completionTime, Time._DESERIALIZER, "completion_time");
		op.add(Builder::completionTimeMillis, JsonpDeserializer.longDeserializer(), "completion_time_millis");
		op.add(Builder::masterApplyTime, Time._DESERIALIZER, "master_apply_time");
		op.add(Builder::masterApplyTimeMillis, JsonpDeserializer.longDeserializer(), "master_apply_time_millis");
		op.add(Builder::notificationTime, Time._DESERIALIZER, "notification_time");
		op.add(Builder::notificationTimeMillis, JsonpDeserializer.longDeserializer(), "notification_time_millis");

	}

}
