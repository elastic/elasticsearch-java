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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.create.Request
@JsonpDeserializable
public final class CreateRequest extends RequestBase implements JsonpSerializable {
	private final String repository;

	private final String snapshot;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final Boolean waitForCompletion;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeGlobalState;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final List<String> featureStates;

	@Nullable
	private final Map<String, JsonData> metadata;

	@Nullable
	private final Boolean partial;

	// ---------------------------------------------------------------------------------------------

	public CreateRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.masterTimeout = builder.masterTimeout;
		this.waitForCompletion = builder.waitForCompletion;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeGlobalState = builder.includeGlobalState;
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.featureStates = ModelTypeHelper.unmodifiable(builder.featureStates);
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.partial = builder.partial;

	}

	public CreateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Repository for the snapshot.
	 * <p>
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * Name of the snapshot. Must be unique in the repository.
	 * <p>
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * If <code>true</code>, the request returns a response when the snapshot is
	 * complete. If <code>false</code>, the request returns a response when the
	 * snapshot initializes.
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	/**
	 * If <code>true</code>, the request ignores data streams and indices in
	 * <code>indices</code> that are missing or closed. If <code>false</code>, the
	 * request returns an error for any data stream or index that is missing or
	 * closed.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If <code>true</code>, the current cluster state is included in the snapshot.
	 * The cluster state includes persistent cluster settings, composable index
	 * templates, legacy index templates, ingest pipelines, and ILM policies. It
	 * also includes data stored in system indices, such as Watches and task records
	 * (configurable via <code>feature_states</code>).
	 * <p>
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * Data streams and indices to include in the snapshot. Supports multi-target
	 * syntax. Includes all data streams and indices by default.
	 * <p>
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * Feature states to include in the snapshot. Each feature state includes one or
	 * more system indices containing related data. You can view a list of eligible
	 * features using the get features API. If <code>include_global_state</code> is
	 * <code>true</code>, all current feature states are included by default. If
	 * <code>include_global_state</code> is <code>false</code>, no feature states
	 * are included by default.
	 * <p>
	 * API name: {@code feature_states}
	 */
	@Nullable
	public List<String> featureStates() {
		return this.featureStates;
	}

	/**
	 * Optional metadata for the snapshot. May have any contents. Must be less than
	 * 1024 bytes. This map is not automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * If <code>true</code>, allows restoring a partial snapshot of indices with
	 * unavailable shards. Only shards that were successfully included in the
	 * snapshot will be restored. All missing shards will be recreated as empty. If
	 * <code>false</code>, the entire restore operation will fail if one or more
	 * indices included in the snapshot do not have all primary shards available.
	 * <p>
	 * API name: {@code partial}
	 */
	@Nullable
	public Boolean partial() {
		return this.partial;
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

		if (this.ignoreUnavailable != null) {

			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (this.includeGlobalState != null) {

			generator.writeKey("include_global_state");
			generator.write(this.includeGlobalState);

		}
		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.featureStates != null) {

			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (String item0 : this.featureStates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.partial != null) {

			generator.writeKey("partial");
			generator.write(this.partial);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateRequest> {
		private String repository;

		private String snapshot;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Boolean waitForCompletion;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeGlobalState;

		@Nullable
		private List<String> indices;

		@Nullable
		private List<String> featureStates;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Boolean partial;

		/**
		 * Repository for the snapshot.
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Name of the snapshot. Must be unique in the repository.
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request returns a response when the snapshot is
		 * complete. If <code>false</code>, the request returns a response when the
		 * snapshot initializes.
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request ignores data streams and indices in
		 * <code>indices</code> that are missing or closed. If <code>false</code>, the
		 * request returns an error for any data stream or index that is missing or
		 * closed.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If <code>true</code>, the current cluster state is included in the snapshot.
		 * The cluster state includes persistent cluster settings, composable index
		 * templates, legacy index templates, ingest pipelines, and ILM policies. It
		 * also includes data stored in system indices, such as Watches and task records
		 * (configurable via <code>feature_states</code>).
		 * <p>
		 * API name: {@code include_global_state}
		 */
		public Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * Data streams and indices to include in the snapshot. Supports multi-target
		 * syntax. Includes all data streams and indices by default.
		 * <p>
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Data streams and indices to include in the snapshot. Supports multi-target
		 * syntax. Includes all data streams and indices by default.
		 * <p>
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed. 4
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Feature states to include in the snapshot. Each feature state includes one or
		 * more system indices containing related data. You can view a list of eligible
		 * features using the get features API. If <code>include_global_state</code> is
		 * <code>true</code>, all current feature states are included by default. If
		 * <code>include_global_state</code> is <code>false</code>, no feature states
		 * are included by default.
		 * <p>
		 * API name: {@code feature_states}
		 */
		public Builder featureStates(@Nullable List<String> value) {
			this.featureStates = value;
			return this;
		}

		/**
		 * Feature states to include in the snapshot. Each feature state includes one or
		 * more system indices containing related data. You can view a list of eligible
		 * features using the get features API. If <code>include_global_state</code> is
		 * <code>true</code>, all current feature states are included by default. If
		 * <code>include_global_state</code> is <code>false</code>, no feature states
		 * are included by default.
		 * <p>
		 * API name: {@code feature_states}
		 */
		public Builder featureStates(String... value) {
			this.featureStates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #featureStates(List)}, creating the list if needed. 4
		 */
		public Builder addFeatureStates(String value) {
			if (this.featureStates == null) {
				this.featureStates = new ArrayList<>();
			}
			this.featureStates.add(value);
			return this;
		}

		/**
		 * Optional metadata for the snapshot. May have any contents. Must be less than
		 * 1024 bytes. This map is not automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * If <code>true</code>, allows restoring a partial snapshot of indices with
		 * unavailable shards. Only shards that were successfully included in the
		 * snapshot will be restored. All missing shards will be recreated as empty. If
		 * <code>false</code>, the entire restore operation will fail if one or more
		 * indices included in the snapshot do not have all primary shards available.
		 * <p>
		 * API name: {@code partial}
		 */
		public Builder partial(@Nullable Boolean value) {
			this.partial = value;
			return this;
		}

		/**
		 * Builds a {@link CreateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateRequest build() {

			return new CreateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateRequest}
	 */
	public static final JsonpDeserializer<CreateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CreateRequest::setupCreateRequestDeserializer, Builder::build);

	protected static void setupCreateRequestDeserializer(DelegatingDeserializer<CreateRequest.Builder> op) {

		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_states");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::partial, JsonpDeserializer.booleanDeserializer(), "partial");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.create}".
	 */
	public static final Endpoint<CreateRequest, CreateResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

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
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CreateResponse._DESERIALIZER);
}
