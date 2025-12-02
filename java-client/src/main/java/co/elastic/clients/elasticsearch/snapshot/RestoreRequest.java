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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
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

// typedef: snapshot.restore.Request

/**
 * Restore a snapshot.
 * <p>
 * Restore a snapshot of a cluster or data streams and indices.
 * <p>
 * You can restore a snapshot only to a running cluster with an elected master
 * node. The snapshot repository must be registered and available to the
 * cluster. The snapshot and cluster versions must be compatible.
 * <p>
 * To restore a snapshot, the cluster's global metadata must be writable. Ensure
 * there are't any cluster blocks that prevent writes. The restore operation
 * ignores index blocks.
 * <p>
 * Before you restore a data stream, ensure the cluster contains a matching
 * index template with data streams enabled. To check, use the index management
 * feature in Kibana or the get index template API:
 * 
 * <pre>
 * <code>GET _index_template/*?filter_path=index_templates.name,index_templates.index_template.index_patterns,index_templates.index_template.data_stream
 * </code>
 * </pre>
 * <p>
 * If no such template exists, you can create one or restore a cluster state
 * that contains one. Without a matching index template, a data stream can't
 * roll over or create backing indices.
 * <p>
 * If your snapshot contains data from App Search or Workplace Search, you must
 * restore the Enterprise Search encryption key before you restore the snapshot.
 * 
 * @see <a href="../doc-files/api-spec.html#snapshot.restore.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RestoreRequest extends RequestBase implements JsonpSerializable {
	private final List<String> featureStates;

	private final List<String> ignoreIndexSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeAliases;

	@Nullable
	private final Boolean includeGlobalState;

	@Nullable
	private final IndexSettings indexSettings;

	private final List<String> indices;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean partial;

	@Nullable
	private final String renamePattern;

	@Nullable
	private final String renameReplacement;

	private final String repository;

	private final String snapshot;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private RestoreRequest(Builder builder) {

		this.featureStates = ApiTypeHelper.unmodifiable(builder.featureStates);
		this.ignoreIndexSettings = ApiTypeHelper.unmodifiable(builder.ignoreIndexSettings);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeAliases = builder.includeAliases;
		this.includeGlobalState = builder.includeGlobalState;
		this.indexSettings = builder.indexSettings;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.masterTimeout = builder.masterTimeout;
		this.partial = builder.partial;
		this.renamePattern = builder.renamePattern;
		this.renameReplacement = builder.renameReplacement;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ApiTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static RestoreRequest of(Function<Builder, ObjectBuilder<RestoreRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The feature states to restore. If <code>include_global_state</code> is
	 * <code>true</code>, the request restores all feature states in the snapshot by
	 * default. If <code>include_global_state</code> is <code>false</code>, the
	 * request restores no feature states by default. Note that specifying an empty
	 * array will result in the default behavior. To restore no feature states,
	 * regardless of the <code>include_global_state</code> value, specify an array
	 * containing only the value <code>none</code>
	 * (<code>[&quot;none&quot;]</code>).
	 * <p>
	 * API name: {@code feature_states}
	 */
	public final List<String> featureStates() {
		return this.featureStates;
	}

	/**
	 * The index settings to not restore from the snapshot. You can't use this
	 * option to ignore <code>index.number_of_shards</code>.
	 * <p>
	 * For data streams, this option applies only to restored backing indices. New
	 * backing indices are configured using the data stream's matching index
	 * template.
	 * <p>
	 * API name: {@code ignore_index_settings}
	 */
	public final List<String> ignoreIndexSettings() {
		return this.ignoreIndexSettings;
	}

	/**
	 * If <code>true</code>, the request ignores any index or data stream in indices
	 * that's missing from the snapshot. If <code>false</code>, the request returns
	 * an error for any missing index or data stream.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If <code>true</code>, the request restores aliases for any restored data
	 * streams and indices. If <code>false</code>, the request doesn’t restore
	 * aliases.
	 * <p>
	 * API name: {@code include_aliases}
	 */
	@Nullable
	public final Boolean includeAliases() {
		return this.includeAliases;
	}

	/**
	 * If <code>true</code>, restore the cluster state. The cluster state includes:
	 * <ul>
	 * <li>Persistent cluster settings</li>
	 * <li>Index templates</li>
	 * <li>Legacy index templates</li>
	 * <li>Ingest pipelines</li>
	 * <li>Index lifecycle management (ILM) policies</li>
	 * <li>Stored scripts</li>
	 * <li>For snapshots taken after 7.12.0, feature states</li>
	 * </ul>
	 * <p>
	 * If <code>include_global_state</code> is <code>true</code>, the restore
	 * operation merges the legacy index templates in your cluster with the
	 * templates contained in the snapshot, replacing any existing ones whose name
	 * matches one in the snapshot. It completely removes all persistent settings,
	 * non-legacy index templates, ingest pipelines, and ILM lifecycle policies that
	 * exist in your cluster and replaces them with the corresponding items from the
	 * snapshot.
	 * <p>
	 * Use the <code>feature_states</code> parameter to configure how feature states
	 * are restored.
	 * <p>
	 * If <code>include_global_state</code> is <code>true</code> and a snapshot was
	 * created without a global state then the restore request will fail.
	 * <p>
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public final Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * Index settings to add or change in restored indices, including backing
	 * indices. You can't use this option to change
	 * <code>index.number_of_shards</code>.
	 * <p>
	 * For data streams, this option applies only to restored backing indices. New
	 * backing indices are configured using the data stream's matching index
	 * template.
	 * <p>
	 * API name: {@code index_settings}
	 */
	@Nullable
	public final IndexSettings indexSettings() {
		return this.indexSettings;
	}

	/**
	 * A comma-separated list of indices and data streams to restore. It supports a
	 * multi-target syntax. The default behavior is all regular indices and regular
	 * data streams in the snapshot.
	 * <p>
	 * You can't use this parameter to restore system indices or system data
	 * streams. Use <code>feature_states</code> instead.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * If <code>false</code>, the entire restore operation will fail if one or more
	 * indices included in the snapshot do not have all primary shards available.
	 * <p>
	 * If true, it allows restoring a partial snapshot of indices with unavailable
	 * shards. Only shards that were successfully included in the snapshot will be
	 * restored. All missing shards will be recreated as empty.
	 * <p>
	 * API name: {@code partial}
	 */
	@Nullable
	public final Boolean partial() {
		return this.partial;
	}

	/**
	 * A rename pattern to apply to restored data streams and indices. Data streams
	 * and indices matching the rename pattern will be renamed according to
	 * <code>rename_replacement</code>.
	 * <p>
	 * The rename pattern is applied as defined by the regular expression that
	 * supports referencing the original text, according to the
	 * <code>appendReplacement</code> logic.
	 * <p>
	 * API name: {@code rename_pattern}
	 */
	@Nullable
	public final String renamePattern() {
		return this.renamePattern;
	}

	/**
	 * The rename replacement string that is used with the
	 * <code>rename_pattern</code>.
	 * <p>
	 * API name: {@code rename_replacement}
	 */
	@Nullable
	public final String renameReplacement() {
		return this.renameReplacement;
	}

	/**
	 * Required - The name of the repository to restore a snapshot from.
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - The name of the snapshot to restore.
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * If <code>true</code>, the request returns a response when the restore
	 * operation completes. The operation is complete when it finishes all attempts
	 * to recover primary shards for restored indices. This applies even if one or
	 * more of the recovery attempts fail.
	 * <p>
	 * If <code>false</code>, the request returns a response when the restore
	 * operation initializes.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public final Boolean waitForCompletion() {
		return this.waitForCompletion;
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

		if (ApiTypeHelper.isDefined(this.featureStates)) {
			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (String item0 : this.featureStates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.ignoreIndexSettings)) {
			generator.writeKey("ignore_index_settings");
			generator.writeStartArray();
			for (String item0 : this.ignoreIndexSettings) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.ignoreUnavailable != null) {
			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (this.includeAliases != null) {
			generator.writeKey("include_aliases");
			generator.write(this.includeAliases);

		}
		if (this.includeGlobalState != null) {
			generator.writeKey("include_global_state");
			generator.write(this.includeGlobalState);

		}
		if (this.indexSettings != null) {
			generator.writeKey("index_settings");
			this.indexSettings.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.partial != null) {
			generator.writeKey("partial");
			generator.write(this.partial);

		}
		if (this.renamePattern != null) {
			generator.writeKey("rename_pattern");
			generator.write(this.renamePattern);

		}
		if (this.renameReplacement != null) {
			generator.writeKey("rename_replacement");
			generator.write(this.renameReplacement);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RestoreRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<RestoreRequest> {
		@Nullable
		private List<String> featureStates;

		@Nullable
		private List<String> ignoreIndexSettings;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeAliases;

		@Nullable
		private Boolean includeGlobalState;

		@Nullable
		private IndexSettings indexSettings;

		@Nullable
		private List<String> indices;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean partial;

		@Nullable
		private String renamePattern;

		@Nullable
		private String renameReplacement;

		private String repository;

		private String snapshot;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * The feature states to restore. If <code>include_global_state</code> is
		 * <code>true</code>, the request restores all feature states in the snapshot by
		 * default. If <code>include_global_state</code> is <code>false</code>, the
		 * request restores no feature states by default. Note that specifying an empty
		 * array will result in the default behavior. To restore no feature states,
		 * regardless of the <code>include_global_state</code> value, specify an array
		 * containing only the value <code>none</code>
		 * (<code>[&quot;none&quot;]</code>).
		 * <p>
		 * API name: {@code feature_states}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureStates</code>.
		 */
		public final Builder featureStates(List<String> list) {
			this.featureStates = _listAddAll(this.featureStates, list);
			return this;
		}

		/**
		 * The feature states to restore. If <code>include_global_state</code> is
		 * <code>true</code>, the request restores all feature states in the snapshot by
		 * default. If <code>include_global_state</code> is <code>false</code>, the
		 * request restores no feature states by default. Note that specifying an empty
		 * array will result in the default behavior. To restore no feature states,
		 * regardless of the <code>include_global_state</code> value, specify an array
		 * containing only the value <code>none</code>
		 * (<code>[&quot;none&quot;]</code>).
		 * <p>
		 * API name: {@code feature_states}
		 * <p>
		 * Adds one or more values to <code>featureStates</code>.
		 */
		public final Builder featureStates(String value, String... values) {
			this.featureStates = _listAdd(this.featureStates, value, values);
			return this;
		}

		/**
		 * The index settings to not restore from the snapshot. You can't use this
		 * option to ignore <code>index.number_of_shards</code>.
		 * <p>
		 * For data streams, this option applies only to restored backing indices. New
		 * backing indices are configured using the data stream's matching index
		 * template.
		 * <p>
		 * API name: {@code ignore_index_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ignoreIndexSettings</code>.
		 */
		public final Builder ignoreIndexSettings(List<String> list) {
			this.ignoreIndexSettings = _listAddAll(this.ignoreIndexSettings, list);
			return this;
		}

		/**
		 * The index settings to not restore from the snapshot. You can't use this
		 * option to ignore <code>index.number_of_shards</code>.
		 * <p>
		 * For data streams, this option applies only to restored backing indices. New
		 * backing indices are configured using the data stream's matching index
		 * template.
		 * <p>
		 * API name: {@code ignore_index_settings}
		 * <p>
		 * Adds one or more values to <code>ignoreIndexSettings</code>.
		 */
		public final Builder ignoreIndexSettings(String value, String... values) {
			this.ignoreIndexSettings = _listAdd(this.ignoreIndexSettings, value, values);
			return this;
		}

		/**
		 * If <code>true</code>, the request ignores any index or data stream in indices
		 * that's missing from the snapshot. If <code>false</code>, the request returns
		 * an error for any missing index or data stream.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request restores aliases for any restored data
		 * streams and indices. If <code>false</code>, the request doesn’t restore
		 * aliases.
		 * <p>
		 * API name: {@code include_aliases}
		 */
		public final Builder includeAliases(@Nullable Boolean value) {
			this.includeAliases = value;
			return this;
		}

		/**
		 * If <code>true</code>, restore the cluster state. The cluster state includes:
		 * <ul>
		 * <li>Persistent cluster settings</li>
		 * <li>Index templates</li>
		 * <li>Legacy index templates</li>
		 * <li>Ingest pipelines</li>
		 * <li>Index lifecycle management (ILM) policies</li>
		 * <li>Stored scripts</li>
		 * <li>For snapshots taken after 7.12.0, feature states</li>
		 * </ul>
		 * <p>
		 * If <code>include_global_state</code> is <code>true</code>, the restore
		 * operation merges the legacy index templates in your cluster with the
		 * templates contained in the snapshot, replacing any existing ones whose name
		 * matches one in the snapshot. It completely removes all persistent settings,
		 * non-legacy index templates, ingest pipelines, and ILM lifecycle policies that
		 * exist in your cluster and replaces them with the corresponding items from the
		 * snapshot.
		 * <p>
		 * Use the <code>feature_states</code> parameter to configure how feature states
		 * are restored.
		 * <p>
		 * If <code>include_global_state</code> is <code>true</code> and a snapshot was
		 * created without a global state then the restore request will fail.
		 * <p>
		 * API name: {@code include_global_state}
		 */
		public final Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * Index settings to add or change in restored indices, including backing
		 * indices. You can't use this option to change
		 * <code>index.number_of_shards</code>.
		 * <p>
		 * For data streams, this option applies only to restored backing indices. New
		 * backing indices are configured using the data stream's matching index
		 * template.
		 * <p>
		 * API name: {@code index_settings}
		 */
		public final Builder indexSettings(@Nullable IndexSettings value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * Index settings to add or change in restored indices, including backing
		 * indices. You can't use this option to change
		 * <code>index.number_of_shards</code>.
		 * <p>
		 * For data streams, this option applies only to restored backing indices. New
		 * backing indices are configured using the data stream's matching index
		 * template.
		 * <p>
		 * API name: {@code index_settings}
		 */
		public final Builder indexSettings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.indexSettings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * A comma-separated list of indices and data streams to restore. It supports a
		 * multi-target syntax. The default behavior is all regular indices and regular
		 * data streams in the snapshot.
		 * <p>
		 * You can't use this parameter to restore system indices or system data
		 * streams. Use <code>feature_states</code> instead.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * A comma-separated list of indices and data streams to restore. It supports a
		 * multi-target syntax. The default behavior is all regular indices and regular
		 * data streams in the snapshot.
		 * <p>
		 * You can't use this parameter to restore system indices or system data
		 * streams. Use <code>feature_states</code> instead.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * If <code>false</code>, the entire restore operation will fail if one or more
		 * indices included in the snapshot do not have all primary shards available.
		 * <p>
		 * If true, it allows restoring a partial snapshot of indices with unavailable
		 * shards. Only shards that were successfully included in the snapshot will be
		 * restored. All missing shards will be recreated as empty.
		 * <p>
		 * API name: {@code partial}
		 */
		public final Builder partial(@Nullable Boolean value) {
			this.partial = value;
			return this;
		}

		/**
		 * A rename pattern to apply to restored data streams and indices. Data streams
		 * and indices matching the rename pattern will be renamed according to
		 * <code>rename_replacement</code>.
		 * <p>
		 * The rename pattern is applied as defined by the regular expression that
		 * supports referencing the original text, according to the
		 * <code>appendReplacement</code> logic.
		 * <p>
		 * API name: {@code rename_pattern}
		 */
		public final Builder renamePattern(@Nullable String value) {
			this.renamePattern = value;
			return this;
		}

		/**
		 * The rename replacement string that is used with the
		 * <code>rename_pattern</code>.
		 * <p>
		 * API name: {@code rename_replacement}
		 */
		public final Builder renameReplacement(@Nullable String value) {
			this.renameReplacement = value;
			return this;
		}

		/**
		 * Required - The name of the repository to restore a snapshot from.
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - The name of the snapshot to restore.
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request returns a response when the restore
		 * operation completes. The operation is complete when it finishes all attempts
		 * to recover primary shards for restored indices. This applies even if one or
		 * more of the recovery attempts fail.
		 * <p>
		 * If <code>false</code>, the request returns a response when the restore
		 * operation initializes.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public final Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RestoreRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RestoreRequest build() {
			_checkSingleUse();

			return new RestoreRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RestoreRequest}
	 */
	public static final JsonpDeserializer<RestoreRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RestoreRequest::setupRestoreRequestDeserializer);

	protected static void setupRestoreRequestDeserializer(ObjectDeserializer<RestoreRequest.Builder> op) {

		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_states");
		op.add(Builder::ignoreIndexSettings,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ignore_index_settings");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::includeAliases, JsonpDeserializer.booleanDeserializer(), "include_aliases");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indexSettings, IndexSettings._DESERIALIZER, "index_settings");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::partial, JsonpDeserializer.booleanDeserializer(), "partial");
		op.add(Builder::renamePattern, JsonpDeserializer.stringDeserializer(), "rename_pattern");
		op.add(Builder::renameReplacement, JsonpDeserializer.stringDeserializer(), "rename_replacement");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.restore}".
	 */
	public static final Endpoint<RestoreRequest, RestoreResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.restore",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshot, buf);
					buf.append("/_restore");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				propsSet |= _repository;
				propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					params.put("repository", request.repository);
					params.put("snapshot", request.snapshot);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RestoreResponse._DESERIALIZER);
}
