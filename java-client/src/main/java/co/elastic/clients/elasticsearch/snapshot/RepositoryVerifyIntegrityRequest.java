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
 * Verifies the integrity of the contents of a snapshot repository
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
	 * Number of threads to use for reading blob contents
	 * <p>
	 * API name: {@code blob_thread_pool_concurrency}
	 */
	@Nullable
	public final Integer blobThreadPoolConcurrency() {
		return this.blobThreadPoolConcurrency;
	}

	/**
	 * Number of snapshots to verify concurrently within each index
	 * <p>
	 * API name: {@code index_snapshot_verification_concurrency}
	 */
	@Nullable
	public final Integer indexSnapshotVerificationConcurrency() {
		return this.indexSnapshotVerificationConcurrency;
	}

	/**
	 * Number of indices to verify concurrently
	 * <p>
	 * API name: {@code index_verification_concurrency}
	 */
	@Nullable
	public final Integer indexVerificationConcurrency() {
		return this.indexVerificationConcurrency;
	}

	/**
	 * Rate limit for individual blob verification
	 * <p>
	 * API name: {@code max_bytes_per_sec}
	 */
	@Nullable
	public final String maxBytesPerSec() {
		return this.maxBytesPerSec;
	}

	/**
	 * Maximum permitted number of failed shard snapshots
	 * <p>
	 * API name: {@code max_failed_shard_snapshots}
	 */
	@Nullable
	public final Integer maxFailedShardSnapshots() {
		return this.maxFailedShardSnapshots;
	}

	/**
	 * Number of threads to use for reading metadata
	 * <p>
	 * API name: {@code meta_thread_pool_concurrency}
	 */
	@Nullable
	public final Integer metaThreadPoolConcurrency() {
		return this.metaThreadPoolConcurrency;
	}

	/**
	 * Required - A repository name
	 * <p>
	 * API name: {@code repository}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * Number of snapshots to verify concurrently
	 * <p>
	 * API name: {@code snapshot_verification_concurrency}
	 */
	@Nullable
	public final Integer snapshotVerificationConcurrency() {
		return this.snapshotVerificationConcurrency;
	}

	/**
	 * Whether to verify the contents of individual blobs
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
		 * Number of threads to use for reading blob contents
		 * <p>
		 * API name: {@code blob_thread_pool_concurrency}
		 */
		public final Builder blobThreadPoolConcurrency(@Nullable Integer value) {
			this.blobThreadPoolConcurrency = value;
			return this;
		}

		/**
		 * Number of snapshots to verify concurrently within each index
		 * <p>
		 * API name: {@code index_snapshot_verification_concurrency}
		 */
		public final Builder indexSnapshotVerificationConcurrency(@Nullable Integer value) {
			this.indexSnapshotVerificationConcurrency = value;
			return this;
		}

		/**
		 * Number of indices to verify concurrently
		 * <p>
		 * API name: {@code index_verification_concurrency}
		 */
		public final Builder indexVerificationConcurrency(@Nullable Integer value) {
			this.indexVerificationConcurrency = value;
			return this;
		}

		/**
		 * Rate limit for individual blob verification
		 * <p>
		 * API name: {@code max_bytes_per_sec}
		 */
		public final Builder maxBytesPerSec(@Nullable String value) {
			this.maxBytesPerSec = value;
			return this;
		}

		/**
		 * Maximum permitted number of failed shard snapshots
		 * <p>
		 * API name: {@code max_failed_shard_snapshots}
		 */
		public final Builder maxFailedShardSnapshots(@Nullable Integer value) {
			this.maxFailedShardSnapshots = value;
			return this;
		}

		/**
		 * Number of threads to use for reading metadata
		 * <p>
		 * API name: {@code meta_thread_pool_concurrency}
		 */
		public final Builder metaThreadPoolConcurrency(@Nullable Integer value) {
			this.metaThreadPoolConcurrency = value;
			return this;
		}

		/**
		 * Required - A repository name
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
		 * Required - A repository name
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
		 * Number of snapshots to verify concurrently
		 * <p>
		 * API name: {@code snapshot_verification_concurrency}
		 */
		public final Builder snapshotVerificationConcurrency(@Nullable Integer value) {
			this.snapshotVerificationConcurrency = value;
			return this;
		}

		/**
		 * Whether to verify the contents of individual blobs
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
