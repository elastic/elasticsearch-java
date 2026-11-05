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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch.data_recovery.start_recovery.RecoveryMode;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: data_recovery._types.Recovery

/**
 *
 * @see <a href="../doc-files/api-spec.html#data_recovery._types.Recovery">API
 *      specification</a>
 */
@JsonpDeserializable
public class Recovery implements JsonpSerializable {
	private final String recoveryId;

	private final RecoveryRunStatus status;

	private final Point recoveryPoint;

	private final RecoveryMode destinationMode;

	private final List<ResolvedRecoverySource> sources;

	private final Map<String, JsonData> metadata;

	private final DateTime startedAt;

	@Nullable
	private final DateTime completedAt;

	private final RecoveryProgress progress;

	private final List<RecoveryFailure> failures;

	private final int totalFailureCount;

	// ---------------------------------------------------------------------------------------------

	protected Recovery(AbstractBuilder<?> builder) {

		this.recoveryId = ApiTypeHelper.requireNonNull(builder.recoveryId, this, "recoveryId");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.recoveryPoint = ApiTypeHelper.requireNonNull(builder.recoveryPoint, this, "recoveryPoint");
		this.destinationMode = ApiTypeHelper.requireNonNull(builder.destinationMode, this, "destinationMode");
		this.sources = ApiTypeHelper.unmodifiableRequired(builder.sources, this, "sources");
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.startedAt = ApiTypeHelper.requireNonNull(builder.startedAt, this, "startedAt");
		this.completedAt = builder.completedAt;
		this.progress = ApiTypeHelper.requireNonNull(builder.progress, this, "progress");
		this.failures = ApiTypeHelper.unmodifiableRequired(builder.failures, this, "failures");
		this.totalFailureCount = ApiTypeHelper.requireNonNull(builder.totalFailureCount, this, "totalFailureCount", 0);

	}

	public static Recovery recoveryOf(Function<Builder, ObjectBuilder<Recovery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier of the recovery.
	 * <p>
	 * API name: {@code recovery_id}
	 */
	public final String recoveryId() {
		return this.recoveryId;
	}

	/**
	 * Required - The status of the recovery.
	 * <p>
	 * API name: {@code status}
	 */
	public final RecoveryRunStatus status() {
		return this.status;
	}

	/**
	 * Required - The recovery point that the sources are recovered from.
	 * <p>
	 * API name: {@code recovery_point}
	 */
	public final Point recoveryPoint() {
		return this.recoveryPoint;
	}

	/**
	 * Required - Whether the sources are recovered in place (<code>replace</code>)
	 * or under new names (<code>rename</code>).
	 * <p>
	 * API name: {@code destination_mode}
	 */
	public final RecoveryMode destinationMode() {
		return this.destinationMode;
	}

	/**
	 * Required - The sources that the requested source expressions resolved to,
	 * with the destinations that they are recovered to.
	 * <p>
	 * API name: {@code sources}
	 */
	public final List<ResolvedRecoverySource> sources() {
		return this.sources;
	}

	/**
	 * Required - The custom metadata that was provided when the recovery was
	 * started.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - The time when the recovery started.
	 * <p>
	 * API name: {@code started_at}
	 */
	public final DateTime startedAt() {
		return this.startedAt;
	}

	/**
	 * The time when the recovery finished. It is omitted while the recovery is
	 * running.
	 * <p>
	 * API name: {@code completed_at}
	 */
	@Nullable
	public final DateTime completedAt() {
		return this.completedAt;
	}

	/**
	 * Required - The progress of the recovery.
	 * <p>
	 * API name: {@code progress}
	 */
	public final RecoveryProgress progress() {
		return this.progress;
	}

	/**
	 * Required - The sources that could not be recovered. The list is capped, so it
	 * can be shorter than <code>total_failure_count</code>.
	 * <p>
	 * API name: {@code failures}
	 */
	public final List<RecoveryFailure> failures() {
		return this.failures;
	}

	/**
	 * Required - The total number of sources that could not be recovered, including
	 * any that are not listed in <code>failures</code>.
	 * <p>
	 * API name: {@code total_failure_count}
	 */
	public final int totalFailureCount() {
		return this.totalFailureCount;
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

		generator.writeKey("recovery_id");
		generator.write(this.recoveryId);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("recovery_point");
		this.recoveryPoint.serialize(generator, mapper);

		generator.writeKey("destination_mode");
		this.destinationMode.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.sources)) {
			generator.writeKey("sources");
			generator.writeStartArray();
			for (ResolvedRecoverySource item0 : this.sources) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("started_at");
		this.startedAt.serialize(generator, mapper);
		if (this.completedAt != null) {
			generator.writeKey("completed_at");
			this.completedAt.serialize(generator, mapper);
		}
		generator.writeKey("progress");
		this.progress.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (RecoveryFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total_failure_count");
		generator.write(this.totalFailureCount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Recovery}.
	 */

	public static class Builder extends Recovery.AbstractBuilder<Builder> implements ObjectBuilder<Recovery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Recovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Recovery build() {
			_checkSingleUse();

			return new Recovery(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String recoveryId;

		private RecoveryRunStatus status;

		private Point recoveryPoint;

		private RecoveryMode destinationMode;

		private List<ResolvedRecoverySource> sources;

		private Map<String, JsonData> metadata;

		private DateTime startedAt;

		@Nullable
		private DateTime completedAt;

		private RecoveryProgress progress;

		private List<RecoveryFailure> failures;

		private Integer totalFailureCount;

		/**
		 * Required - The identifier of the recovery.
		 * <p>
		 * API name: {@code recovery_id}
		 */
		public final BuilderT recoveryId(String value) {
			this.recoveryId = value;
			return self();
		}

		/**
		 * Required - The status of the recovery.
		 * <p>
		 * API name: {@code status}
		 */
		public final BuilderT status(RecoveryRunStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * Required - The recovery point that the sources are recovered from.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final BuilderT recoveryPoint(Point value) {
			this.recoveryPoint = value;
			return self();
		}

		/**
		 * Required - The recovery point that the sources are recovered from.
		 * <p>
		 * API name: {@code recovery_point}
		 */
		public final BuilderT recoveryPoint(Function<Point.Builder, ObjectBuilder<Point>> fn) {
			return this.recoveryPoint(fn.apply(new Point.Builder()).build());
		}

		/**
		 * Required - Whether the sources are recovered in place (<code>replace</code>)
		 * or under new names (<code>rename</code>).
		 * <p>
		 * API name: {@code destination_mode}
		 */
		public final BuilderT destinationMode(RecoveryMode value) {
			this.destinationMode = value;
			return self();
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sources</code>.
		 */
		public final BuilderT sources(List<ResolvedRecoverySource> list) {
			this.sources = _listAddAll(this.sources, list);
			return self();
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds one or more values to <code>sources</code>.
		 */
		public final BuilderT sources(ResolvedRecoverySource value, ResolvedRecoverySource... values) {
			this.sources = _listAdd(this.sources, value, values);
			return self();
		}

		/**
		 * Required - The sources that the requested source expressions resolved to,
		 * with the destinations that they are recovered to.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds a value to <code>sources</code> using a builder lambda.
		 */
		public final BuilderT sources(
				Function<ResolvedRecoverySource.Builder, ObjectBuilder<ResolvedRecoverySource>> fn) {
			return sources(fn.apply(new ResolvedRecoverySource.Builder()).build());
		}

		/**
		 * Required - The custom metadata that was provided when the recovery was
		 * started.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final BuilderT metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return self();
		}

		/**
		 * Required - The custom metadata that was provided when the recovery was
		 * started.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final BuilderT metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return self();
		}

		/**
		 * Required - The time when the recovery started.
		 * <p>
		 * API name: {@code started_at}
		 */
		public final BuilderT startedAt(DateTime value) {
			this.startedAt = value;
			return self();
		}

		/**
		 * The time when the recovery finished. It is omitted while the recovery is
		 * running.
		 * <p>
		 * API name: {@code completed_at}
		 */
		public final BuilderT completedAt(@Nullable DateTime value) {
			this.completedAt = value;
			return self();
		}

		/**
		 * Required - The progress of the recovery.
		 * <p>
		 * API name: {@code progress}
		 */
		public final BuilderT progress(RecoveryProgress value) {
			this.progress = value;
			return self();
		}

		/**
		 * Required - The progress of the recovery.
		 * <p>
		 * API name: {@code progress}
		 */
		public final BuilderT progress(Function<RecoveryProgress.Builder, ObjectBuilder<RecoveryProgress>> fn) {
			return this.progress(fn.apply(new RecoveryProgress.Builder()).build());
		}

		/**
		 * Required - The sources that could not be recovered. The list is capped, so it
		 * can be shorter than <code>total_failure_count</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>failures</code>.
		 */
		public final BuilderT failures(List<RecoveryFailure> list) {
			this.failures = _listAddAll(this.failures, list);
			return self();
		}

		/**
		 * Required - The sources that could not be recovered. The list is capped, so it
		 * can be shorter than <code>total_failure_count</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds one or more values to <code>failures</code>.
		 */
		public final BuilderT failures(RecoveryFailure value, RecoveryFailure... values) {
			this.failures = _listAdd(this.failures, value, values);
			return self();
		}

		/**
		 * Required - The sources that could not be recovered. The list is capped, so it
		 * can be shorter than <code>total_failure_count</code>.
		 * <p>
		 * API name: {@code failures}
		 * <p>
		 * Adds a value to <code>failures</code> using a builder lambda.
		 */
		public final BuilderT failures(Function<RecoveryFailure.Builder, ObjectBuilder<RecoveryFailure>> fn) {
			return failures(fn.apply(new RecoveryFailure.Builder()).build());
		}

		/**
		 * Required - The total number of sources that could not be recovered, including
		 * any that are not listed in <code>failures</code>.
		 * <p>
		 * API name: {@code total_failure_count}
		 */
		public final BuilderT totalFailureCount(int value) {
			this.totalFailureCount = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Recovery}
	 */
	public static final JsonpDeserializer<Recovery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Recovery::setupRecoveryDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRecoveryDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::recoveryId, JsonpDeserializer.stringDeserializer(), "recovery_id");
		op.add(AbstractBuilder::status, RecoveryRunStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::recoveryPoint, Point._DESERIALIZER, "recovery_point");
		op.add(AbstractBuilder::destinationMode, RecoveryMode._DESERIALIZER, "destination_mode");
		op.add(AbstractBuilder::sources, JsonpDeserializer.arrayDeserializer(ResolvedRecoverySource._DESERIALIZER),
				"sources");
		op.add(AbstractBuilder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(AbstractBuilder::startedAt, DateTime._DESERIALIZER, "started_at");
		op.add(AbstractBuilder::completedAt, DateTime._DESERIALIZER, "completed_at");
		op.add(AbstractBuilder::progress, RecoveryProgress._DESERIALIZER, "progress");
		op.add(AbstractBuilder::failures, JsonpDeserializer.arrayDeserializer(RecoveryFailure._DESERIALIZER),
				"failures");
		op.add(AbstractBuilder::totalFailureCount, JsonpDeserializer.integerDeserializer(), "total_failure_count");

	}

}
