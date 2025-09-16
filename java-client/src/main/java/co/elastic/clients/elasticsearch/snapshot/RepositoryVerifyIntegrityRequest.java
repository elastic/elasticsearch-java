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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: snapshot.repository_verify_integrity.Request

/**
 * Verify the repository integrity. Verify the integrity of the contents of a
 * snapshot repository.
 * <p>
 * This API enables you to perform a comprehensive check of the contents of a
 * repository, looking for any anomalies in its data or metadata which might
 * prevent you from restoring snapshots from the repository or which might cause
 * future snapshot create or delete operations to fail.
 * <p>
 * If you suspect the integrity of the contents of one of your snapshot
 * repositories, cease all write activity to this repository immediately, set
 * its <code>read_only</code> option to <code>true</code>, and use this API to
 * verify its integrity. Until you do so:
 * <ul>
 * <li>It may not be possible to restore some snapshots from this
 * repository.</li>
 * <li>Searchable snapshots may report errors when searched or may have
 * unassigned shards.</li>
 * <li>Taking snapshots into this repository may fail or may appear to succeed
 * but have created a snapshot which cannot be restored.</li>
 * <li>Deleting snapshots from this repository may fail or may appear to succeed
 * but leave the underlying data on disk.</li>
 * <li>Continuing to write to the repository while it is in an invalid state may
 * causing additional damage to its contents.</li>
 * </ul>
 * <p>
 * If the API finds any problems with the integrity of the contents of your
 * repository, Elasticsearch will not be able to repair the damage. The only way
 * to bring the repository back into a fully working state after its contents
 * have been damaged is by restoring its contents from a repository backup which
 * was taken before the damage occurred. You must also identify what caused the
 * damage and take action to prevent it from happening again.
 * <p>
 * If you cannot restore a repository backup, register a new repository and use
 * this for all future snapshot operations. In some cases it may be possible to
 * recover some of the contents of a damaged repository, either by restoring as
 * many of its snapshots as needed and taking new snapshots of the restored
 * data, or by using the reindex API to copy data from any searchable snapshots
 * mounted from the damaged repository.
 * <p>
 * Avoid all operations which write to the repository while the verify
 * repository integrity API is running. If something changes the repository
 * contents while an integrity verification is running then Elasticsearch may
 * incorrectly report having detected some anomalies in its contents due to the
 * concurrent writes. It may also incorrectly fail to report some anomalies that
 * the concurrent writes prevented it from detecting.
 * <p>
 * NOTE: This API is intended for exploratory use by humans. You should expect
 * the request parameters and the response format to vary in future versions.
 * <p>
 * NOTE: This API may not work correctly in a mixed-version cluster.
 * <p>
 * The default values for the parameters of this API are designed to limit the
 * impact of the integrity verification on other activities in your cluster. For
 * instance, by default it will only use at most half of the
 * <code>snapshot_meta</code> threads to verify the integrity of each snapshot,
 * allowing other snapshot operations to use the other half of this thread pool.
 * If you modify these parameters to speed up the verification process, you risk
 * disrupting other snapshot-related operations in your cluster. For large
 * repositories, consider setting up a separate single-node Elasticsearch
 * cluster just for running the integrity verification API.
 * <p>
 * The response exposes implementation details of the analysis which may change
 * from version to version. The response body format is therefore not considered
 * stable and may be different in newer versions.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot.repository_verify_integrity.Request">API
 *      specification</a>
 */

public class RepositoryVerifyIntegrityRequest extends RequestBase {
	@Nullable
	private final Integer blobThreadPoolConcurrency;

	@Nullable
	private final Integer indexSnapshotVerificationConcurrency;

	@Nullable
	private final Integer indexVerificationConcurrency;

	@Nullable
	private final String maxBytesPerSec;

	@Nullable
	private final Integer maxFailedShardSnapshots;

	@Nullable
	private final Integer metaThreadPoolConcurrency;

	private final List<String> name;

	@Nullable
	private final Integer snapshotVerificationConcurrency;

	@Nullable
	private final Boolean verifyBlobContents;

	// ---------------------------------------------------------------------------------------------

	private RepositoryVerifyIntegrityRequest(Builder builder) {

		this.blobThreadPoolConcurrency = builder.blobThreadPoolConcurrency;
		this.indexSnapshotVerificationConcurrency = builder.indexSnapshotVerificationConcurrency;
		this.indexVerificationConcurrency = builder.indexVerificationConcurrency;
		this.maxBytesPerSec = builder.maxBytesPerSec;
		this.maxFailedShardSnapshots = builder.maxFailedShardSnapshots;
		this.metaThreadPoolConcurrency = builder.metaThreadPoolConcurrency;
		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.snapshotVerificationConcurrency = builder.snapshotVerificationConcurrency;
		this.verifyBlobContents = builder.verifyBlobContents;

	}

	public static RepositoryVerifyIntegrityRequest of(
			Function<Builder, ObjectBuilder<RepositoryVerifyIntegrityRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>verify_blob_contents</code> is <code>true</code>, this parameter
	 * specifies how many blobs to verify at once.
	 * <p>
	 * API name: {@code blob_thread_pool_concurrency}
	 */
	@Nullable
	public final Integer blobThreadPoolConcurrency() {
		return this.blobThreadPoolConcurrency;
	}

	/**
	 * The maximum number of index snapshots to verify concurrently within each
	 * index verification.
	 * <p>
	 * API name: {@code index_snapshot_verification_concurrency}
	 */
	@Nullable
	public final Integer indexSnapshotVerificationConcurrency() {
		return this.indexSnapshotVerificationConcurrency;
	}

	/**
	 * The number of indices to verify concurrently. The default behavior is to use
	 * the entire <code>snapshot_meta</code> thread pool.
	 * <p>
	 * API name: {@code index_verification_concurrency}
	 */
	@Nullable
	public final Integer indexVerificationConcurrency() {
		return this.indexVerificationConcurrency;
	}

	/**
	 * If <code>verify_blob_contents</code> is <code>true</code>, this parameter
	 * specifies the maximum amount of data that Elasticsearch will read from the
	 * repository every second.
	 * <p>
	 * API name: {@code max_bytes_per_sec}
	 */
	@Nullable
	public final String maxBytesPerSec() {
		return this.maxBytesPerSec;
	}

	/**
	 * The number of shard snapshot failures to track during integrity verification,
	 * in order to avoid excessive resource usage. If your repository contains more
	 * than this number of shard snapshot failures, the verification will fail.
	 * <p>
	 * API name: {@code max_failed_shard_snapshots}
	 */
	@Nullable
	public final Integer maxFailedShardSnapshots() {
		return this.maxFailedShardSnapshots;
	}

	/**
	 * The maximum number of snapshot metadata operations to run concurrently. The
	 * default behavior is to use at most half of the <code>snapshot_meta</code>
	 * thread pool at once.
	 * <p>
	 * API name: {@code meta_thread_pool_concurrency}
	 */
	@Nullable
	public final Integer metaThreadPoolConcurrency() {
		return this.metaThreadPoolConcurrency;
	}

	/**
	 * Required - The name of the snapshot repository.
	 * <p>
	 * API name: {@code repository}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * The number of snapshots to verify concurrently. The default behavior is to
	 * use at most half of the <code>snapshot_meta</code> thread pool at once.
	 * <p>
	 * API name: {@code snapshot_verification_concurrency}
	 */
	@Nullable
	public final Integer snapshotVerificationConcurrency() {
		return this.snapshotVerificationConcurrency;
	}

	/**
	 * Indicates whether to verify the checksum of every data blob in the
	 * repository. If this feature is enabled, Elasticsearch will read the entire
	 * repository contents, which may be extremely slow and expensive.
	 * <p>
	 * API name: {@code verify_blob_contents}
	 */
	@Nullable
	public final Boolean verifyBlobContents() {
		return this.verifyBlobContents;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoryVerifyIntegrityRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RepositoryVerifyIntegrityRequest> {
		@Nullable
		private Integer blobThreadPoolConcurrency;

		@Nullable
		private Integer indexSnapshotVerificationConcurrency;

		@Nullable
		private Integer indexVerificationConcurrency;

		@Nullable
		private String maxBytesPerSec;

		@Nullable
		private Integer maxFailedShardSnapshots;

		@Nullable
		private Integer metaThreadPoolConcurrency;

		private List<String> name;

		@Nullable
		private Integer snapshotVerificationConcurrency;

		@Nullable
		private Boolean verifyBlobContents;

		/**
		 * If <code>verify_blob_contents</code> is <code>true</code>, this parameter
		 * specifies how many blobs to verify at once.
		 * <p>
		 * API name: {@code blob_thread_pool_concurrency}
		 */
		public final Builder blobThreadPoolConcurrency(@Nullable Integer value) {
			this.blobThreadPoolConcurrency = value;
			return this;
		}

		/**
		 * The maximum number of index snapshots to verify concurrently within each
		 * index verification.
		 * <p>
		 * API name: {@code index_snapshot_verification_concurrency}
		 */
		public final Builder indexSnapshotVerificationConcurrency(@Nullable Integer value) {
			this.indexSnapshotVerificationConcurrency = value;
			return this;
		}

		/**
		 * The number of indices to verify concurrently. The default behavior is to use
		 * the entire <code>snapshot_meta</code> thread pool.
		 * <p>
		 * API name: {@code index_verification_concurrency}
		 */
		public final Builder indexVerificationConcurrency(@Nullable Integer value) {
			this.indexVerificationConcurrency = value;
			return this;
		}

		/**
		 * If <code>verify_blob_contents</code> is <code>true</code>, this parameter
		 * specifies the maximum amount of data that Elasticsearch will read from the
		 * repository every second.
		 * <p>
		 * API name: {@code max_bytes_per_sec}
		 */
		public final Builder maxBytesPerSec(@Nullable String value) {
			this.maxBytesPerSec = value;
			return this;
		}

		/**
		 * The number of shard snapshot failures to track during integrity verification,
		 * in order to avoid excessive resource usage. If your repository contains more
		 * than this number of shard snapshot failures, the verification will fail.
		 * <p>
		 * API name: {@code max_failed_shard_snapshots}
		 */
		public final Builder maxFailedShardSnapshots(@Nullable Integer value) {
			this.maxFailedShardSnapshots = value;
			return this;
		}

		/**
		 * The maximum number of snapshot metadata operations to run concurrently. The
		 * default behavior is to use at most half of the <code>snapshot_meta</code>
		 * thread pool at once.
		 * <p>
		 * API name: {@code meta_thread_pool_concurrency}
		 */
		public final Builder metaThreadPoolConcurrency(@Nullable Integer value) {
			this.metaThreadPoolConcurrency = value;
			return this;
		}

		/**
		 * Required - The name of the snapshot repository.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Required - The name of the snapshot repository.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * The number of snapshots to verify concurrently. The default behavior is to
		 * use at most half of the <code>snapshot_meta</code> thread pool at once.
		 * <p>
		 * API name: {@code snapshot_verification_concurrency}
		 */
		public final Builder snapshotVerificationConcurrency(@Nullable Integer value) {
			this.snapshotVerificationConcurrency = value;
			return this;
		}

		/**
		 * Indicates whether to verify the checksum of every data blob in the
		 * repository. If this feature is enabled, Elasticsearch will read the entire
		 * repository contents, which may be extremely slow and expensive.
		 * <p>
		 * API name: {@code verify_blob_contents}
		 */
		public final Builder verifyBlobContents(@Nullable Boolean value) {
			this.verifyBlobContents = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoryVerifyIntegrityRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoryVerifyIntegrityRequest build() {
			_checkSingleUse();

			return new RepositoryVerifyIntegrityRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.repository_verify_integrity}".
	 */
	public static final Endpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/snapshot.repository_verify_integrity",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_verify_integrity");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.maxFailedShardSnapshots != null) {
					params.put("max_failed_shard_snapshots", String.valueOf(request.maxFailedShardSnapshots));
				}
				if (request.snapshotVerificationConcurrency != null) {
					params.put("snapshot_verification_concurrency",
							String.valueOf(request.snapshotVerificationConcurrency));
				}
				if (request.metaThreadPoolConcurrency != null) {
					params.put("meta_thread_pool_concurrency", String.valueOf(request.metaThreadPoolConcurrency));
				}
				if (request.blobThreadPoolConcurrency != null) {
					params.put("blob_thread_pool_concurrency", String.valueOf(request.blobThreadPoolConcurrency));
				}
				if (request.indexVerificationConcurrency != null) {
					params.put("index_verification_concurrency", String.valueOf(request.indexVerificationConcurrency));
				}
				if (request.indexSnapshotVerificationConcurrency != null) {
					params.put("index_snapshot_verification_concurrency",
							String.valueOf(request.indexSnapshotVerificationConcurrency));
				}
				if (request.verifyBlobContents != null) {
					params.put("verify_blob_contents", String.valueOf(request.verifyBlobContents));
				}
				if (request.maxBytesPerSec != null) {
					params.put("max_bytes_per_sec", request.maxBytesPerSec);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RepositoryVerifyIntegrityResponse._DESERIALIZER);
}
