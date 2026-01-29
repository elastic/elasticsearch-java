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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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

// typedef: snapshot._types.AzureRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.AzureRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AzureRepositorySettings extends RepositorySettingsBase {
	@Nullable
	private final String basePath;

	@Nullable
	private final String client;

	@Nullable
	private final String container;

	@Nullable
	private final Integer deleteObjectsMaxSize;

	@Nullable
	private final String locationMode;

	@Nullable
	private final Integer maxConcurrentBatchDeletes;

	@Nullable
	private final Boolean readonly;

	// ---------------------------------------------------------------------------------------------

	private AzureRepositorySettings(Builder builder) {
		super(builder);

		this.basePath = builder.basePath;
		this.client = builder.client;
		this.container = builder.container;
		this.deleteObjectsMaxSize = builder.deleteObjectsMaxSize;
		this.locationMode = builder.locationMode;
		this.maxConcurrentBatchDeletes = builder.maxConcurrentBatchDeletes;
		this.readonly = builder.readonly;

	}

	public static AzureRepositorySettings of(Function<Builder, ObjectBuilder<AzureRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The path to the repository data within the container. It defaults to the root
	 * directory.
	 * <p>
	 * NOTE: Don't set <code>base_path</code> when configuring a snapshot repository
	 * for Elastic Cloud Enterprise. Elastic Cloud Enterprise automatically
	 * generates the <code>base_path</code> for each deployment so that multiple
	 * deployments can share the same bucket.
	 * <p>
	 * API name: {@code base_path}
	 */
	@Nullable
	public final String basePath() {
		return this.basePath;
	}

	/**
	 * The name of the Azure repository client to use.
	 * <p>
	 * API name: {@code client}
	 */
	@Nullable
	public final String client() {
		return this.client;
	}

	/**
	 * The Azure container.
	 * <p>
	 * API name: {@code container}
	 */
	@Nullable
	public final String container() {
		return this.container;
	}

	/**
	 * The maxmimum batch size, between 1 and 256, used for <code>BlobBatch</code>
	 * requests. Defaults to 256 which is the maximum number supported by the Azure
	 * blob batch API.
	 * <p>
	 * API name: {@code delete_objects_max_size}
	 */
	@Nullable
	public final Integer deleteObjectsMaxSize() {
		return this.deleteObjectsMaxSize;
	}

	/**
	 * Either <code>primary_only</code> or <code>secondary_only</code>. Note that if
	 * you set it to <code>secondary_only</code>, it will force
	 * <code>readonly</code> to <code>true</code>.
	 * <p>
	 * API name: {@code location_mode}
	 */
	@Nullable
	public final String locationMode() {
		return this.locationMode;
	}

	/**
	 * The maximum number of concurrent batch delete requests that will be submitted
	 * for any individual bulk delete with <code>BlobBatch</code>. Note that the
	 * effective number of concurrent deletes is further limited by the Azure client
	 * connection and event loop thread limits. Defaults to 10, minimum is 1,
	 * maximum is 100.
	 * <p>
	 * API name: {@code max_concurrent_batch_deletes}
	 */
	@Nullable
	public final Integer maxConcurrentBatchDeletes() {
		return this.maxConcurrentBatchDeletes;
	}

	/**
	 * If <code>true</code>, the repository is read-only. The cluster can retrieve
	 * and restore snapshots from the repository but not write to the repository or
	 * create snapshots in it.
	 * <p>
	 * Only a cluster with write access can create snapshots in the repository. All
	 * other clusters connected to the repository should have the
	 * <code>readonly</code> parameter set to <code>true</code>. If
	 * <code>false</code>, the cluster can write to the repository and create
	 * snapshots in it.
	 * <p>
	 * IMPORTANT: If you register the same snapshot repository with multiple
	 * clusters, only one cluster should have write access to the repository. Having
	 * multiple clusters write to the repository at the same time risks corrupting
	 * the contents of the repository.
	 * <p>
	 * API name: {@code readonly}
	 */
	@Nullable
	public final Boolean readonly() {
		return this.readonly;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.basePath != null) {
			generator.writeKey("base_path");
			generator.write(this.basePath);

		}
		if (this.client != null) {
			generator.writeKey("client");
			generator.write(this.client);

		}
		if (this.container != null) {
			generator.writeKey("container");
			generator.write(this.container);

		}
		if (this.deleteObjectsMaxSize != null) {
			generator.writeKey("delete_objects_max_size");
			generator.write(this.deleteObjectsMaxSize);

		}
		if (this.locationMode != null) {
			generator.writeKey("location_mode");
			generator.write(this.locationMode);

		}
		if (this.maxConcurrentBatchDeletes != null) {
			generator.writeKey("max_concurrent_batch_deletes");
			generator.write(this.maxConcurrentBatchDeletes);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			generator.write(this.readonly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AzureRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AzureRepositorySettings> {
		@Nullable
		private String basePath;

		@Nullable
		private String client;

		@Nullable
		private String container;

		@Nullable
		private Integer deleteObjectsMaxSize;

		@Nullable
		private String locationMode;

		@Nullable
		private Integer maxConcurrentBatchDeletes;

		@Nullable
		private Boolean readonly;

		public Builder() {
		}
		private Builder(AzureRepositorySettings instance) {
			this.basePath = instance.basePath;
			this.client = instance.client;
			this.container = instance.container;
			this.deleteObjectsMaxSize = instance.deleteObjectsMaxSize;
			this.locationMode = instance.locationMode;
			this.maxConcurrentBatchDeletes = instance.maxConcurrentBatchDeletes;
			this.readonly = instance.readonly;

		}
		/**
		 * The path to the repository data within the container. It defaults to the root
		 * directory.
		 * <p>
		 * NOTE: Don't set <code>base_path</code> when configuring a snapshot repository
		 * for Elastic Cloud Enterprise. Elastic Cloud Enterprise automatically
		 * generates the <code>base_path</code> for each deployment so that multiple
		 * deployments can share the same bucket.
		 * <p>
		 * API name: {@code base_path}
		 */
		public final Builder basePath(@Nullable String value) {
			this.basePath = value;
			return this;
		}

		/**
		 * The name of the Azure repository client to use.
		 * <p>
		 * API name: {@code client}
		 */
		public final Builder client(@Nullable String value) {
			this.client = value;
			return this;
		}

		/**
		 * The Azure container.
		 * <p>
		 * API name: {@code container}
		 */
		public final Builder container(@Nullable String value) {
			this.container = value;
			return this;
		}

		/**
		 * The maxmimum batch size, between 1 and 256, used for <code>BlobBatch</code>
		 * requests. Defaults to 256 which is the maximum number supported by the Azure
		 * blob batch API.
		 * <p>
		 * API name: {@code delete_objects_max_size}
		 */
		public final Builder deleteObjectsMaxSize(@Nullable Integer value) {
			this.deleteObjectsMaxSize = value;
			return this;
		}

		/**
		 * Either <code>primary_only</code> or <code>secondary_only</code>. Note that if
		 * you set it to <code>secondary_only</code>, it will force
		 * <code>readonly</code> to <code>true</code>.
		 * <p>
		 * API name: {@code location_mode}
		 */
		public final Builder locationMode(@Nullable String value) {
			this.locationMode = value;
			return this;
		}

		/**
		 * The maximum number of concurrent batch delete requests that will be submitted
		 * for any individual bulk delete with <code>BlobBatch</code>. Note that the
		 * effective number of concurrent deletes is further limited by the Azure client
		 * connection and event loop thread limits. Defaults to 10, minimum is 1,
		 * maximum is 100.
		 * <p>
		 * API name: {@code max_concurrent_batch_deletes}
		 */
		public final Builder maxConcurrentBatchDeletes(@Nullable Integer value) {
			this.maxConcurrentBatchDeletes = value;
			return this;
		}

		/**
		 * If <code>true</code>, the repository is read-only. The cluster can retrieve
		 * and restore snapshots from the repository but not write to the repository or
		 * create snapshots in it.
		 * <p>
		 * Only a cluster with write access can create snapshots in the repository. All
		 * other clusters connected to the repository should have the
		 * <code>readonly</code> parameter set to <code>true</code>. If
		 * <code>false</code>, the cluster can write to the repository and create
		 * snapshots in it.
		 * <p>
		 * IMPORTANT: If you register the same snapshot repository with multiple
		 * clusters, only one cluster should have write access to the repository. Having
		 * multiple clusters write to the repository at the same time risks corrupting
		 * the contents of the repository.
		 * <p>
		 * API name: {@code readonly}
		 */
		public final Builder readonly(@Nullable Boolean value) {
			this.readonly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AzureRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AzureRepositorySettings build() {
			_checkSingleUse();

			return new AzureRepositorySettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AzureRepositorySettings}
	 */
	public static final JsonpDeserializer<AzureRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AzureRepositorySettings::setupAzureRepositorySettingsDeserializer);

	protected static void setupAzureRepositorySettingsDeserializer(
			ObjectDeserializer<AzureRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::basePath, JsonpDeserializer.stringDeserializer(), "base_path");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::container, JsonpDeserializer.stringDeserializer(), "container");
		op.add(Builder::deleteObjectsMaxSize, JsonpDeserializer.integerDeserializer(), "delete_objects_max_size");
		op.add(Builder::locationMode, JsonpDeserializer.stringDeserializer(), "location_mode");
		op.add(Builder::maxConcurrentBatchDeletes, JsonpDeserializer.integerDeserializer(),
				"max_concurrent_batch_deletes");
		op.add(Builder::readonly, JsonpDeserializer.booleanDeserializer(), "readonly");

	}

}
