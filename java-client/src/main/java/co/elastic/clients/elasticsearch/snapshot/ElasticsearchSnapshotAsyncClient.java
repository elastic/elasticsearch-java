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

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the snapshot namespace.
 */
public class ElasticsearchSnapshotAsyncClient extends ApiClient {

	public ElasticsearchSnapshotAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: snapshot.cleanup_repository

	/**
	 * Removes stale data from repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CleanupRepositoryResponse> cleanupRepository(CleanupRepositoryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CleanupRepositoryRequest.ENDPOINT);
	}

	/**
	 * Removes stale data from repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CleanupRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CleanupRepositoryResponse> cleanupRepository(
			Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return cleanupRepository(fn.apply(new CleanupRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.clone

	/**
	 * Clones indices from one snapshot into another snapshot in the same
	 * repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloneSnapshotResponse> clone(CloneSnapshotRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CloneSnapshotRequest.ENDPOINT);
	}

	/**
	 * Clones indices from one snapshot into another snapshot in the same
	 * repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloneSnapshotResponse> clone(
			Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return clone(fn.apply(new CloneSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.create

	/**
	 * Creates a snapshot in a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateSnapshotResponse> create(CreateSnapshotRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateSnapshotRequest.ENDPOINT);
	}

	/**
	 * Creates a snapshot in a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateSnapshotResponse> create(
			Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return create(fn.apply(new CreateSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.create_repository

	/**
	 * Creates a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateRepositoryRequest.ENDPOINT);
	}

	/**
	 * Creates a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateRepositoryResponse> createRepository(
			Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return createRepository(fn.apply(new CreateRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.delete

	/**
	 * Deletes one or more snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSnapshotResponse> delete(DeleteSnapshotRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteSnapshotRequest.ENDPOINT);
	}

	/**
	 * Deletes one or more snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSnapshotResponse> delete(
			Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.delete_repository

	/**
	 * Deletes a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteRepositoryRequest.ENDPOINT);
	}

	/**
	 * Deletes a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRepositoryResponse> deleteRepository(
			Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRepository(fn.apply(new DeleteRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get

	/**
	 * Returns information about a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSnapshotResponse> get(GetSnapshotRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetSnapshotRequest.ENDPOINT);
	}

	/**
	 * Returns information about a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSnapshotResponse> get(
			Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get_repository

	/**
	 * Returns information about a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetRepositoryRequest.ENDPOINT);
	}

	/**
	 * Returns information about a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRepositoryResponse> getRepository(
			Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build());
	}

	/**
	 * Returns information about a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRepositoryRequest.Builder().build(),
				GetRepositoryRequest.ENDPOINT);
	}

	// ----- Endpoint: snapshot.restore

	/**
	 * Restores a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RestoreResponse> restore(RestoreRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RestoreRequest.ENDPOINT);
	}

	/**
	 * Restores a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RestoreRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RestoreResponse> restore(
			Function<RestoreRequest.Builder, ObjectBuilder<RestoreRequest>> fn)
			throws IOException, ElasticsearchException {
		return restore(fn.apply(new RestoreRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.status

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StatusResponse> status(StatusRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, StatusRequest.ENDPOINT);
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StatusResponse> status(
			Function<StatusRequest.Builder, ObjectBuilder<StatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return status(fn.apply(new StatusRequest.Builder()).build());
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StatusResponse> status() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new StatusRequest.Builder().build(), StatusRequest.ENDPOINT);
	}

	// ----- Endpoint: snapshot.verify_repository

	/**
	 * Verifies a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<VerifyRepositoryResponse> verifyRepository(VerifyRepositoryRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, VerifyRepositoryRequest.ENDPOINT);
	}

	/**
	 * Verifies a repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link VerifyRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<VerifyRepositoryResponse> verifyRepository(
			Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
	}

}
