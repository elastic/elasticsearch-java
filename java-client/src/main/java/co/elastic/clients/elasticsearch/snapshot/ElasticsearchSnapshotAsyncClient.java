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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the snapshot namespace.
 */
public class ElasticsearchSnapshotAsyncClient extends ApiClient<ElasticsearchSnapshotAsyncClient> {

	public ElasticsearchSnapshotAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchSnapshotAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSnapshotAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSnapshotAsyncClient(this.transport, transportOptions);
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
		@SuppressWarnings("unchecked")
		Endpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse> endpoint = (Endpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse>) CleanupRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		Endpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> endpoint = (Endpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse>) CloneSnapshotRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (Endpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> endpoint = (Endpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse>) CreateRepositoryRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (Endpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> endpoint = (Endpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse>) DeleteRepositoryRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> endpoint = (Endpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse>) GetSnapshotRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse> endpoint = (Endpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse>) GetRepositoryRequest._ENDPOINT;

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
				GetRepositoryRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		Endpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (Endpoint<RestoreRequest, RestoreResponse, ErrorResponse>) RestoreRequest._ENDPOINT;

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
		@SuppressWarnings("unchecked")
		Endpoint<StatusRequest, StatusResponse, ErrorResponse> endpoint = (Endpoint<StatusRequest, StatusResponse, ErrorResponse>) StatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
		return this.transport.performRequestAsync(new StatusRequest.Builder().build(), StatusRequest._ENDPOINT,
				this.transportOptions);
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
		@SuppressWarnings("unchecked")
		Endpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse> endpoint = (Endpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse>) VerifyRepositoryRequest._ENDPOINT;

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
			Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
	}

}
