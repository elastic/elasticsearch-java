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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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

// typedef: searchable_snapshots.mount.Request

/**
 * Mount a snapshot as a searchable index.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#searchable_snapshots.mount.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MountRequest extends RequestBase implements JsonpSerializable {
	private final List<String> ignoreIndexSettings;

	private final String index;

	private final Map<String, JsonData> indexSettings;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final String renamedIndex;

	private final String repository;

	private final String snapshot;

	@Nullable
	private final String storage;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	private MountRequest(Builder builder) {

		this.ignoreIndexSettings = ApiTypeHelper.unmodifiable(builder.ignoreIndexSettings);
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.indexSettings = ApiTypeHelper.unmodifiable(builder.indexSettings);
		this.masterTimeout = builder.masterTimeout;
		this.renamedIndex = builder.renamedIndex;
		this.repository = ApiTypeHelper.requireNonNull(builder.repository, this, "repository");
		this.snapshot = ApiTypeHelper.requireNonNull(builder.snapshot, this, "snapshot");
		this.storage = builder.storage;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public static MountRequest of(Function<Builder, ObjectBuilder<MountRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code ignore_index_settings}
	 */
	public final List<String> ignoreIndexSettings() {
		return this.ignoreIndexSettings;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code index_settings}
	 */
	public final Map<String, JsonData> indexSettings() {
		return this.indexSettings;
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
	 * API name: {@code renamed_index}
	 */
	@Nullable
	public final String renamedIndex() {
		return this.renamedIndex;
	}

	/**
	 * Required - The name of the repository containing the snapshot of the index to
	 * mount
	 * <p>
	 * API name: {@code repository}
	 */
	public final String repository() {
		return this.repository;
	}

	/**
	 * Required - The name of the snapshot of the index to mount
	 * <p>
	 * API name: {@code snapshot}
	 */
	public final String snapshot() {
		return this.snapshot;
	}

	/**
	 * Selects the kind of local storage used to accelerate searches. Experimental,
	 * and defaults to <code>full_copy</code>
	 * <p>
	 * API name: {@code storage}
	 */
	@Nullable
	public final String storage() {
		return this.storage;
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

		if (ApiTypeHelper.isDefined(this.ignoreIndexSettings)) {
			generator.writeKey("ignore_index_settings");
			generator.writeStartArray();
			for (String item0 : this.ignoreIndexSettings) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("index");
		generator.write(this.index);

		if (ApiTypeHelper.isDefined(this.indexSettings)) {
			generator.writeKey("index_settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.indexSettings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.renamedIndex != null) {
			generator.writeKey("renamed_index");
			generator.write(this.renamedIndex);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MountRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<MountRequest> {
		@Nullable
		private List<String> ignoreIndexSettings;

		private String index;

		@Nullable
		private Map<String, JsonData> indexSettings;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private String renamedIndex;

		private String repository;

		private String snapshot;

		@Nullable
		private String storage;

		@Nullable
		private Boolean waitForCompletion;

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
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(Map<String, JsonData> map) {
			this.indexSettings = _mapPutAll(this.indexSettings, map);
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 * <p>
		 * Adds an entry to <code>indexSettings</code>.
		 */
		public final Builder indexSettings(String key, JsonData value) {
			this.indexSettings = _mapPut(this.indexSettings, key, value);
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
		 * API name: {@code renamed_index}
		 */
		public final Builder renamedIndex(@Nullable String value) {
			this.renamedIndex = value;
			return this;
		}

		/**
		 * Required - The name of the repository containing the snapshot of the index to
		 * mount
		 * <p>
		 * API name: {@code repository}
		 */
		public final Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - The name of the snapshot of the index to mount
		 * <p>
		 * API name: {@code snapshot}
		 */
		public final Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Selects the kind of local storage used to accelerate searches. Experimental,
		 * and defaults to <code>full_copy</code>
		 * <p>
		 * API name: {@code storage}
		 */
		public final Builder storage(@Nullable String value) {
			this.storage = value;
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
		 * Builds a {@link MountRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MountRequest build() {
			_checkSingleUse();

			return new MountRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MountRequest}
	 */
	public static final JsonpDeserializer<MountRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MountRequest::setupMountRequestDeserializer);

	protected static void setupMountRequestDeserializer(ObjectDeserializer<MountRequest.Builder> op) {

		op.add(Builder::ignoreIndexSettings,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ignore_index_settings");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indexSettings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"index_settings");
		op.add(Builder::renamedIndex, JsonpDeserializer.stringDeserializer(), "renamed_index");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code searchable_snapshots.mount}".
	 */
	public static final Endpoint<MountRequest, MountResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/searchable_snapshots.mount",

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
					buf.append("/_mount");
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
				if (request.storage != null) {
					params.put("storage", request.storage);
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, MountResponse._DESERIALIZER);
}
