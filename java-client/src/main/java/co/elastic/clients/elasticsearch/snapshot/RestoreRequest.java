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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.PutSettingsRequest;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: snapshot.restore.Request
@JsonpDeserializable
public final class RestoreRequest extends RequestBase implements JsonpSerializable {
	private final String repository;

	private final String snapshot;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final Boolean waitForCompletion;

	@Nullable
	private final List<String> ignoreIndexSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeAliases;

	@Nullable
	private final Boolean includeGlobalState;

	@Nullable
	private final PutSettingsRequest indexSettings;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final Boolean partial;

	@Nullable
	private final String renamePattern;

	@Nullable
	private final String renameReplacement;

	// ---------------------------------------------------------------------------------------------

	public RestoreRequest(Builder builder) {

		this.repository = Objects.requireNonNull(builder.repository, "repository");
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.masterTimeout = builder.masterTimeout;
		this.waitForCompletion = builder.waitForCompletion;
		this.ignoreIndexSettings = builder.ignoreIndexSettings;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeAliases = builder.includeAliases;
		this.includeGlobalState = builder.includeGlobalState;
		this.indexSettings = builder.indexSettings;
		this.indices = builder.indices;
		this.partial = builder.partial;
		this.renamePattern = builder.renamePattern;
		this.renameReplacement = builder.renameReplacement;

	}

	/**
	 * A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public String repository() {
		return this.repository;
	}

	/**
	 * A snapshot name
	 * <p>
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Should this request wait until the operation has completed before returning
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	/**
	 * API name: {@code ignore_index_settings}
	 */
	@Nullable
	public List<String> ignoreIndexSettings() {
		return this.ignoreIndexSettings;
	}

	/**
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * API name: {@code include_aliases}
	 */
	@Nullable
	public Boolean includeAliases() {
		return this.includeAliases;
	}

	/**
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * API name: {@code index_settings}
	 */
	@Nullable
	public PutSettingsRequest indexSettings() {
		return this.indexSettings;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code partial}
	 */
	@Nullable
	public Boolean partial() {
		return this.partial;
	}

	/**
	 * API name: {@code rename_pattern}
	 */
	@Nullable
	public String renamePattern() {
		return this.renamePattern;
	}

	/**
	 * API name: {@code rename_replacement}
	 */
	@Nullable
	public String renameReplacement() {
		return this.renameReplacement;
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

		if (this.ignoreIndexSettings != null) {

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
		if (this.indices != null) {

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
	public static class Builder implements ObjectBuilder<RestoreRequest> {
		private String repository;

		private String snapshot;

		@Nullable
		private String masterTimeout;

		@Nullable
		private Boolean waitForCompletion;

		@Nullable
		private List<String> ignoreIndexSettings;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeAliases;

		@Nullable
		private Boolean includeGlobalState;

		@Nullable
		private PutSettingsRequest indexSettings;

		@Nullable
		private List<String> indices;

		@Nullable
		private Boolean partial;

		@Nullable
		private String renamePattern;

		@Nullable
		private String renameReplacement;

		/**
		 * A repository name
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String value) {
			this.repository = value;
			return this;
		}

		/**
		 * A snapshot name
		 * <p>
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Should this request wait until the operation has completed before returning
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 */
		public Builder ignoreIndexSettings(@Nullable List<String> value) {
			this.ignoreIndexSettings = value;
			return this;
		}

		/**
		 * API name: {@code ignore_index_settings}
		 */
		public Builder ignoreIndexSettings(String... value) {
			this.ignoreIndexSettings = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ignoreIndexSettings(List)}, creating the list if
		 * needed.
		 */
		public Builder addIgnoreIndexSettings(String value) {
			if (this.ignoreIndexSettings == null) {
				this.ignoreIndexSettings = new ArrayList<>();
			}
			this.ignoreIndexSettings.add(value);
			return this;
		}

		/**
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * API name: {@code include_aliases}
		 */
		public Builder includeAliases(@Nullable Boolean value) {
			this.includeAliases = value;
			return this;
		}

		/**
		 * API name: {@code include_global_state}
		 */
		public Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 */
		public Builder indexSettings(@Nullable PutSettingsRequest value) {
			this.indexSettings = value;
			return this;
		}

		/**
		 * API name: {@code index_settings}
		 */
		public Builder indexSettings(Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn) {
			return this.indexSettings(fn.apply(new PutSettingsRequest.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code partial}
		 */
		public Builder partial(@Nullable Boolean value) {
			this.partial = value;
			return this;
		}

		/**
		 * API name: {@code rename_pattern}
		 */
		public Builder renamePattern(@Nullable String value) {
			this.renamePattern = value;
			return this;
		}

		/**
		 * API name: {@code rename_replacement}
		 */
		public Builder renameReplacement(@Nullable String value) {
			this.renameReplacement = value;
			return this;
		}

		/**
		 * Builds a {@link RestoreRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RestoreRequest build() {

			return new RestoreRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RestoreRequest}
	 */
	public static final JsonpDeserializer<RestoreRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RestoreRequest::setupRestoreRequestDeserializer, Builder::build);

	protected static void setupRestoreRequestDeserializer(DelegatingDeserializer<RestoreRequest.Builder> op) {

		op.add(Builder::ignoreIndexSettings,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ignore_index_settings");
		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::includeAliases, JsonpDeserializer.booleanDeserializer(), "include_aliases");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indexSettings, PutSettingsRequest._DESERIALIZER, "index_settings");
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
	public static final Endpoint<RestoreRequest, RestoreResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;
				final int _snapshot = 1 << 1;

				int propsSet = 0;

				if (request.repository() != null)
					propsSet |= _repository;
				if (request.snapshot() != null)
					propsSet |= _snapshot;

				if (propsSet == (_repository | _snapshot)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					buf.append(request.repository);
					buf.append("/");
					buf.append(request.snapshot);
					buf.append("/_restore");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

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

			}, Endpoint.Simple.emptyMap(), true, RestoreResponse._DESERIALIZER);
}
