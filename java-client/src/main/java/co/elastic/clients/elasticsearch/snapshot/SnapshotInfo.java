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

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotInfo
@JsonpDeserializable
public class SnapshotInfo implements JsonpSerializable {
	private final List<String> dataStreams;

	@Nullable
	private final String duration;

	@Nullable
	private final String durationInMillis;

	@Nullable
	private final String endTime;

	@Nullable
	private final String endTimeInMillis;

	private final List<SnapshotShardFailure> failures;

	@Nullable
	private final Boolean includeGlobalState;

	private final List<String> indices;

	private final Map<String, IndexDetails> indexDetails;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String reason;

	@Nullable
	private final String repository;

	private final String snapshot;

	@Nullable
	private final ShardStatistics shards;

	@Nullable
	private final String startTime;

	@Nullable
	private final String startTimeInMillis;

	@Nullable
	private final String state;

	private final String uuid;

	@Nullable
	private final String version;

	@Nullable
	private final Long versionId;

	private final List<InfoFeatureState> featureStates;

	// ---------------------------------------------------------------------------------------------

	private SnapshotInfo(Builder builder) {

		this.dataStreams = ModelTypeHelper.unmodifiableRequired(builder.dataStreams, this, "dataStreams");
		this.duration = builder.duration;
		this.durationInMillis = builder.durationInMillis;
		this.endTime = builder.endTime;
		this.endTimeInMillis = builder.endTimeInMillis;
		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.includeGlobalState = builder.includeGlobalState;
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.indexDetails = ModelTypeHelper.unmodifiable(builder.indexDetails);
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.reason = builder.reason;
		this.repository = builder.repository;
		this.snapshot = ModelTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.shards = builder.shards;
		this.startTime = builder.startTime;
		this.startTimeInMillis = builder.startTimeInMillis;
		this.state = builder.state;
		this.uuid = ModelTypeHelper.requireNonNull(builder.uuid, this, "uuid");
		this.version = builder.version;
		this.versionId = builder.versionId;
		this.featureStates = ModelTypeHelper.unmodifiable(builder.featureStates);

	}

	public static SnapshotInfo of(Function<Builder, ObjectBuilder<SnapshotInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public final List<String> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * API name: {@code duration}
	 */
	@Nullable
	public final String duration() {
		return this.duration;
	}

	/**
	 * API name: {@code duration_in_millis}
	 */
	@Nullable
	public final String durationInMillis() {
		return this.durationInMillis;
	}

	/**
	 * API name: {@code end_time}
	 */
	@Nullable
	public final String endTime() {
		return this.endTime;
	}

	/**
	 * API name: {@code end_time_in_millis}
	 */
	@Nullable
	public final String endTimeInMillis() {
		return this.endTimeInMillis;
	}

	/**
	 * API name: {@code failures}
	 */
	public final List<SnapshotShardFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public final Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code index_details}
	 */
	public final Map<String, IndexDetails> indexDetails() {
		return this.indexDetails;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code shards}
	 */
	@Nullable
	public final ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public final String startTime() {
		return this.startTime;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	@Nullable
	public final String startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code state}
	 */
	@Nullable
	public final String state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code uuid}
	 */
	public final String uuid() {
		return this.uuid;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code version_id}
	 */
	@Nullable
	public final Long versionId() {
		return this.versionId;
	}

	/**
	 * API name: {@code feature_states}
	 */
	public final List<InfoFeatureState> featureStates() {
		return this.featureStates;
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

		if (ModelTypeHelper.isDefined(this.dataStreams)) {
			generator.writeKey("data_streams");
			generator.writeStartArray();
			for (String item0 : this.dataStreams) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.duration != null) {
			generator.writeKey("duration");
			generator.write(this.duration);

		}
		if (this.durationInMillis != null) {
			generator.writeKey("duration_in_millis");
			generator.write(this.durationInMillis);

		}
		if (this.endTime != null) {
			generator.writeKey("end_time");
			generator.write(this.endTime);

		}
		if (this.endTimeInMillis != null) {
			generator.writeKey("end_time_in_millis");
			generator.write(this.endTimeInMillis);

		}
		if (ModelTypeHelper.isDefined(this.failures)) {
			generator.writeKey("failures");
			generator.writeStartArray();
			for (SnapshotShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.includeGlobalState != null) {
			generator.writeKey("include_global_state");
			generator.write(this.includeGlobalState);

		}
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indexDetails)) {
			generator.writeKey("index_details");
			generator.writeStartObject();
			for (Map.Entry<String, IndexDetails> item0 : this.indexDetails.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (this.repository != null) {
			generator.writeKey("repository");
			generator.write(this.repository);

		}
		generator.writeKey("snapshot");
		generator.write(this.snapshot);

		if (this.shards != null) {
			generator.writeKey("shards");
			this.shards.serialize(generator, mapper);

		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.startTimeInMillis != null) {
			generator.writeKey("start_time_in_millis");
			generator.write(this.startTimeInMillis);

		}
		if (this.state != null) {
			generator.writeKey("state");
			generator.write(this.state);

		}
		generator.writeKey("uuid");
		generator.write(this.uuid);

		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionId != null) {
			generator.writeKey("version_id");
			generator.write(this.versionId);

		}
		if (ModelTypeHelper.isDefined(this.featureStates)) {
			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (InfoFeatureState item0 : this.featureStates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotInfo}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotInfo> {
		private List<String> dataStreams;

		@Nullable
		private String duration;

		@Nullable
		private String durationInMillis;

		@Nullable
		private String endTime;

		@Nullable
		private String endTimeInMillis;

		@Nullable
		private List<SnapshotShardFailure> failures;

		@Nullable
		private Boolean includeGlobalState;

		private List<String> indices;

		@Nullable
		private Map<String, IndexDetails> indexDetails;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String reason;

		@Nullable
		private String repository;

		private String snapshot;

		@Nullable
		private ShardStatistics shards;

		@Nullable
		private String startTime;

		@Nullable
		private String startTimeInMillis;

		@Nullable
		private String state;

		private String uuid;

		@Nullable
		private String version;

		@Nullable
		private Long versionId;

		@Nullable
		private List<InfoFeatureState> featureStates;

		/**
		 * Required - API name: {@code data_streams}
		 */
		public final Builder dataStreams(List<String> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public final Builder dataStreams(String... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code duration}
		 */
		public final Builder duration(@Nullable String value) {
			this.duration = value;
			return this;
		}

		/**
		 * API name: {@code duration_in_millis}
		 */
		public final Builder durationInMillis(@Nullable String value) {
			this.durationInMillis = value;
			return this;
		}

		/**
		 * API name: {@code end_time}
		 */
		public final Builder endTime(@Nullable String value) {
			this.endTime = value;
			return this;
		}

		/**
		 * API name: {@code end_time_in_millis}
		 */
		public final Builder endTimeInMillis(@Nullable String value) {
			this.endTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(@Nullable List<SnapshotShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public final Builder failures(SnapshotShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		@SafeVarargs
		public final Builder failures(
				Function<SnapshotShardFailure.Builder, ObjectBuilder<SnapshotShardFailure>>... fns) {
			this.failures = new ArrayList<>(fns.length);
			for (Function<SnapshotShardFailure.Builder, ObjectBuilder<SnapshotShardFailure>> fn : fns) {
				this.failures.add(fn.apply(new SnapshotShardFailure.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code include_global_state}
		 */
		public final Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code index_details}
		 */
		public final Builder indexDetails(@Nullable Map<String, IndexDetails> value) {
			this.indexDetails = value;
			return this;
		}

		/**
		 * Set {@link #indexDetails(Map)} to a singleton map.
		 */
		public Builder indexDetails(String key, Function<IndexDetails.Builder, ObjectBuilder<IndexDetails>> fn) {
			return this.indexDetails(Collections.singletonMap(key, fn.apply(new IndexDetails.Builder()).build()));
		}

		public final Builder indexDetails(
				Function<MapBuilder<String, IndexDetails, IndexDetails.Builder>, ObjectBuilder<Map<String, IndexDetails>>> fn) {
			return indexDetails(fn.apply(new MapBuilder<>(IndexDetails.Builder::new)).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
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
		 * API name: {@code repository}
		 */
		public final Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public final Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public final Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(@Nullable String value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code uuid}
		 */
		public final Builder uuid(String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_id}
		 */
		public final Builder versionId(@Nullable Long value) {
			this.versionId = value;
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 */
		public final Builder featureStates(@Nullable List<InfoFeatureState> value) {
			this.featureStates = value;
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 */
		public final Builder featureStates(InfoFeatureState... value) {
			this.featureStates = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 */
		@SafeVarargs
		public final Builder featureStates(Function<InfoFeatureState.Builder, ObjectBuilder<InfoFeatureState>>... fns) {
			this.featureStates = new ArrayList<>(fns.length);
			for (Function<InfoFeatureState.Builder, ObjectBuilder<InfoFeatureState>> fn : fns) {
				this.featureStates.add(fn.apply(new InfoFeatureState.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link SnapshotInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotInfo build() {
			_checkSingleUse();

			return new SnapshotInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotInfo}
	 */
	public static final JsonpDeserializer<SnapshotInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SnapshotInfo::setupSnapshotInfoDeserializer, Builder::build);

	protected static void setupSnapshotInfoDeserializer(DelegatingDeserializer<SnapshotInfo.Builder> op) {

		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"data_streams");
		op.add(Builder::duration, JsonpDeserializer.stringDeserializer(), "duration");
		op.add(Builder::durationInMillis, JsonpDeserializer.stringDeserializer(), "duration_in_millis");
		op.add(Builder::endTime, JsonpDeserializer.stringDeserializer(), "end_time");
		op.add(Builder::endTimeInMillis, JsonpDeserializer.stringDeserializer(), "end_time_in_millis");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(SnapshotShardFailure._DESERIALIZER), "failures");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indexDetails, JsonpDeserializer.stringMapDeserializer(IndexDetails._DESERIALIZER),
				"index_details");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "shards");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.stringDeserializer(), "start_time_in_millis");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::versionId, JsonpDeserializer.longDeserializer(), "version_id");
		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(InfoFeatureState._DESERIALIZER),
				"feature_states");

	}

}
