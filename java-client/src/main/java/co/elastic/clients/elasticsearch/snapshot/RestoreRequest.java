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
 * Restores a snapshot.
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
	 * API name: {@code feature_states}
	 */
	public final List<String> featureStates() {
		return this.featureStates;
	}

	/**
	 * API name: {@code ignore_index_settings}
	 */
	public final List<String> ignoreIndexSettings() {
		return this.ignoreIndexSettings;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code include_aliases}
	 */
	@Nullable
	public final Boolean includeAliases() {
		return this.includeAliases;
	}

	/**
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public final Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * API name: {@code index_settings}
	 */
	@Nullable
	public final IndexSettings indexSettings() {
		return this.indexSettings;
	}

	/**
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code partial}
	 */
	@Nullable
	public final Boolean partial() {
		return this.partial;
	}

	/**
	 * API name: {@code rename_pattern}
	 */
	@Nullable
	public final String renamePattern() {
		return this.renamePattern;
	}

	/**
	 * API name: {@code rename_replacement}
	 */
	@Nullable
	public final String renameReplacement() {
		return this.renameReplacement;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - A snapshot name
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * Should this request wait until the operation has completed before returning
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
		 * API name: {@code feature_states}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureStates</code>.
		 */
		public final Builder featureStates(List<String> list) {
			this.featureStates = _listAddAll(this.featureStates, list);
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 * <p>
		 * Adds one or more values to <code>featureStates</code>.
		 */
		public final Builder featureStates(String value, String... values) {
			this.featureStates = _listAdd(this.featureStates, value, values);
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ignoreIndexSettings</code>.
		 */
		public final Builder ignoreIndexSettings(List<String> list) {
			this.ignoreIndexSettings = _listAddAll(this.ignoreIndexSettings, list);
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 * <p>
		 * Adds one or more values to <code>ignoreIndexSettings</code>.
		 */
		public final Builder ignoreIndexSettings(String value, String... values) {
			this.ignoreIndexSettings = _listAdd(this.ignoreIndexSettings, value, values);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code include_aliases}
		 */
		public final Builder includeAliases(@Nullable Boolean value) {
			this.includeAliases = value;
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
		 * API name: {@code index_settings}
		 */
		public final Builder indexSettings(@Nullable IndexSettings value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 */
		public final Builder indexSettings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.indexSettings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code partial}
		 */
		public final Builder partial(@Nullable Boolean value) {
			this.partial = value;
			return this;
		}

		/**
		 * API name: {@code rename_pattern}
		 */
		public final Builder renamePattern(@Nullable String value) {
			this.renamePattern = value;
			return this;
		}

		/**
		 * API name: {@code rename_replacement}
		 */
		public final Builder renameReplacement(@Nullable String value) {
			this.renameReplacement = value;
			return this;
		}

		/**
		 * Required - A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - A snapshot name
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Should this request wait until the operation has completed before returning
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
