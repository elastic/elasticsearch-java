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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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

/**
 * Client for the snapshot namespace.
 */
public class ElasticsearchSnapshotAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSnapshotAsyncClient> {

	public ElasticsearchSnapshotAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSnapshotAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSnapshotAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSnapshotAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: snapshot.cleanup_repository

	/**
	 * Triggers the review of a snapshot repository’s contents and deletes any stale
	 * data not referenced by existing snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CleanupRepositoryResponse> cleanupRepository(CleanupRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse>) CleanupRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Triggers the review of a snapshot repository’s contents and deletes any stale
	 * data not referenced by existing snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CleanupRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CleanupRepositoryResponse> cleanupRepository(
			Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn) {
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

	public CompletableFuture<CloneSnapshotResponse> clone(CloneSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse>) CloneSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn) {
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

	public CompletableFuture<CreateSnapshotResponse> create(CreateSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn) {
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

	public CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse>) CreateRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn) {
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

	public CompletableFuture<DeleteSnapshotResponse> delete(DeleteSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn) {
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

	public CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse>) DeleteRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn) {
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

	public CompletableFuture<GetSnapshotResponse> get(GetSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse>) GetSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn) {
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

	public CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse>) GetRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn) {
		return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build());
	}

	/**
	 * Returns information about a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository() {
		return this.transport.performRequestAsync(new GetRepositoryRequest.Builder().build(),
				GetRepositoryRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.repository_verify_integrity

	/**
	 * Verifies the integrity of the contents of a snapshot repository
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RepositoryVerifyIntegrityResponse> repositoryVerifyIntegrity(
			RepositoryVerifyIntegrityRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse> endpoint = (JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse>) RepositoryVerifyIntegrityRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Verifies the integrity of the contents of a snapshot repository
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RepositoryVerifyIntegrityRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RepositoryVerifyIntegrityResponse> repositoryVerifyIntegrity(
			Function<RepositoryVerifyIntegrityRequest.Builder, ObjectBuilder<RepositoryVerifyIntegrityRequest>> fn) {
		return repositoryVerifyIntegrity(fn.apply(new RepositoryVerifyIntegrityRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.restore

	/**
	 * Restores a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RestoreResponse> restore(RestoreRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse>) RestoreRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<RestoreRequest.Builder, ObjectBuilder<RestoreRequest>> fn) {
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

	public CompletableFuture<SnapshotStatusResponse> status(SnapshotStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse>) SnapshotStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotStatusResponse> status(
			Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn) {
		return status(fn.apply(new SnapshotStatusRequest.Builder()).build());
	}

	/**
	 * Returns information about the status of a snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotStatusResponse> status() {
		return this.transport.performRequestAsync(new SnapshotStatusRequest.Builder().build(),
				SnapshotStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.verify_repository

	/**
	 * Verifies a repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<VerifyRepositoryResponse> verifyRepository(VerifyRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse>) VerifyRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn) {
		return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
	}

}
