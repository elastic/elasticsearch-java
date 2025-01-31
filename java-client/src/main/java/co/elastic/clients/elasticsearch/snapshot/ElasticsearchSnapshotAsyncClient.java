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
	 * Clean up the snapshot repository. Trigger the review of the contents of a
	 * snapshot repository and delete any stale data not referenced by existing
	 * snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CleanupRepositoryResponse> cleanupRepository(CleanupRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse>) CleanupRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clean up the snapshot repository. Trigger the review of the contents of a
	 * snapshot repository and delete any stale data not referenced by existing
	 * snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CleanupRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CleanupRepositoryResponse> cleanupRepository(
			Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn) {
		return cleanupRepository(fn.apply(new CleanupRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.clone

	/**
	 * Clone a snapshot. Clone part of all of a snapshot into another snapshot in
	 * the same repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/clone-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CloneSnapshotResponse> clone(CloneSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse>) CloneSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clone a snapshot. Clone part of all of a snapshot into another snapshot in
	 * the same repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/clone-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CloneSnapshotResponse> clone(
			Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn) {
		return clone(fn.apply(new CloneSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.create

	/**
	 * Create a snapshot. Take a snapshot of a cluster or of data streams and
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/create-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateSnapshotResponse> create(CreateSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a snapshot. Take a snapshot of a cluster or of data streams and
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/create-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateSnapshotResponse> create(
			Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn) {
		return create(fn.apply(new CreateSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.create_repository

	/**
	 * Create or update a snapshot repository. IMPORTANT: If you are migrating
	 * searchable snapshots, the repository name must be identical in the source and
	 * destination clusters. To register a snapshot repository, the cluster's global
	 * metadata must be writeable. Ensure there are no cluster blocks (for example,
	 * <code>cluster.blocks.read_only</code> and
	 * <code>clsuter.blocks.read_only_allow_delete</code> settings) that prevent
	 * write access.
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
	 * Create or update a snapshot repository. IMPORTANT: If you are migrating
	 * searchable snapshots, the repository name must be identical in the source and
	 * destination clusters. To register a snapshot repository, the cluster's global
	 * metadata must be writeable. Ensure there are no cluster blocks (for example,
	 * <code>cluster.blocks.read_only</code> and
	 * <code>clsuter.blocks.read_only_allow_delete</code> settings) that prevent
	 * write access.
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
	 * Delete snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteSnapshotResponse> delete(DeleteSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteSnapshotResponse> delete(
			Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn) {
		return delete(fn.apply(new DeleteSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.delete_repository

	/**
	 * Delete snapshot repositories. When a repository is unregistered,
	 * Elasticsearch removes only the reference to the location where the repository
	 * is storing the snapshots. The snapshots themselves are left untouched and in
	 * place.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse>) DeleteRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete snapshot repositories. When a repository is unregistered,
	 * Elasticsearch removes only the reference to the location where the repository
	 * is storing the snapshots. The snapshots themselves are left untouched and in
	 * place.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRepositoryResponse> deleteRepository(
			Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn) {
		return deleteRepository(fn.apply(new DeleteRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get

	/**
	 * Get snapshot information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetSnapshotResponse> get(GetSnapshotRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse>) GetSnapshotRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get snapshot information.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetSnapshotResponse> get(
			Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn) {
		return get(fn.apply(new GetSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get_repository

	/**
	 * Get snapshot repository information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse>) GetRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get snapshot repository information.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRepositoryResponse> getRepository(
			Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn) {
		return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build());
	}

	/**
	 * Get snapshot repository information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRepositoryResponse> getRepository() {
		return this.transport.performRequestAsync(new GetRepositoryRequest.Builder().build(),
				GetRepositoryRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.repository_analyze

	/**
	 * Analyze a snapshot repository. Analyze the performance characteristics and
	 * any incorrect behaviour found in a repository.
	 * <p>
	 * The response exposes implementation details of the analysis which may change
	 * from version to version. The response body format is therefore not considered
	 * stable and may be different in newer versions.
	 * <p>
	 * There are a large number of third-party storage systems available, not all of
	 * which are suitable for use as a snapshot repository by Elasticsearch. Some
	 * storage systems behave incorrectly, or perform poorly, especially when
	 * accessed concurrently by multiple clients as the nodes of an Elasticsearch
	 * cluster do. This API performs a collection of read and write operations on
	 * your repository which are designed to detect incorrect behaviour and to
	 * measure the performance characteristics of your storage system.
	 * <p>
	 * The default values for the parameters are deliberately low to reduce the
	 * impact of running an analysis inadvertently and to provide a sensible
	 * starting point for your investigations. Run your first analysis with the
	 * default parameter values to check for simple problems. If successful, run a
	 * sequence of increasingly large analyses until you encounter a failure or you
	 * reach a <code>blob_count</code> of at least <code>2000</code>, a
	 * <code>max_blob_size</code> of at least <code>2gb</code>, a
	 * <code>max_total_data_size</code> of at least <code>1tb</code>, and a
	 * <code>register_operation_count</code> of at least <code>100</code>. Always
	 * specify a generous timeout, possibly <code>1h</code> or longer, to allow time
	 * for each analysis to run to completion. Perform the analyses using a
	 * multi-node cluster of a similar size to your production cluster so that it
	 * can detect any problems that only arise when the repository is accessed by
	 * many nodes at once.
	 * <p>
	 * If the analysis fails, Elasticsearch detected that your repository behaved
	 * unexpectedly. This usually means you are using a third-party storage system
	 * with an incorrect or incompatible implementation of the API it claims to
	 * support. If so, this storage system is not suitable for use as a snapshot
	 * repository. You will need to work with the supplier of your storage system to
	 * address the incompatibilities that Elasticsearch detects.
	 * <p>
	 * If the analysis is successful, the API returns details of the testing
	 * process, optionally including how long each operation took. You can use this
	 * information to determine the performance of your storage system. If any
	 * operation fails or returns an incorrect result, the API returns an error. If
	 * the API returns an error, it may not have removed all the data it wrote to
	 * the repository. The error will indicate the location of any leftover data and
	 * this path is also recorded in the Elasticsearch logs. You should verify that
	 * this location has been cleaned up correctly. If there is still leftover data
	 * at the specified location, you should manually remove it.
	 * <p>
	 * If the connection from your client to Elasticsearch is closed while the
	 * client is waiting for the result of the analysis, the test is cancelled. Some
	 * clients are configured to close their connection if no response is received
	 * within a certain timeout. An analysis takes a long time to complete so you
	 * might need to relax any such client-side timeouts. On cancellation the
	 * analysis attempts to clean up the data it was writing, but it may not be able
	 * to remove it all. The path to the leftover data is recorded in the
	 * Elasticsearch logs. You should verify that this location has been cleaned up
	 * correctly. If there is still leftover data at the specified location, you
	 * should manually remove it.
	 * <p>
	 * If the analysis is successful then it detected no incorrect behaviour, but
	 * this does not mean that correct behaviour is guaranteed. The analysis
	 * attempts to detect common bugs but it does not offer 100% coverage.
	 * Additionally, it does not test the following:
	 * <ul>
	 * <li>Your repository must perform durable writes. Once a blob has been written
	 * it must remain in place until it is deleted, even after a power loss or
	 * similar disaster.</li>
	 * <li>Your repository must not suffer from silent data corruption. Once a blob
	 * has been written, its contents must remain unchanged until it is deliberately
	 * modified or deleted.</li>
	 * <li>Your repository must behave correctly even if connectivity from the
	 * cluster is disrupted. Reads and writes may fail in this case, but they must
	 * not return incorrect results.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: An analysis writes a substantial amount of data to your repository
	 * and then reads it back again. This consumes bandwidth on the network between
	 * the cluster and the repository, and storage space and I/O bandwidth on the
	 * repository itself. You must ensure this load does not affect other users of
	 * these systems. Analyses respect the repository settings
	 * <code>max_snapshot_bytes_per_sec</code> and
	 * <code>max_restore_bytes_per_sec</code> if available and the cluster setting
	 * <code>indices.recovery.max_bytes_per_sec</code> which you can use to limit
	 * the bandwidth they consume.
	 * <p>
	 * NOTE: This API is intended for exploratory use by humans. You should expect
	 * the request parameters and the response format to vary in future versions.
	 * <p>
	 * NOTE: Different versions of Elasticsearch may perform different checks for
	 * repository compatibility, with newer versions typically being stricter than
	 * older ones. A storage system that passes repository analysis with one version
	 * of Elasticsearch may fail with a different version. This indicates it behaves
	 * incorrectly in ways that the former version did not detect. You must work
	 * with the supplier of your storage system to address the incompatibilities
	 * detected by the repository analysis API in any version of Elasticsearch.
	 * <p>
	 * NOTE: This API may not work correctly in a mixed-version cluster.
	 * <p>
	 * <em>Implementation details</em>
	 * <p>
	 * NOTE: This section of documentation describes how the repository analysis API
	 * works in this version of Elasticsearch, but you should expect the
	 * implementation to vary between versions. The request parameters and response
	 * format depend on details of the implementation so may also be different in
	 * newer versions.
	 * <p>
	 * The analysis comprises a number of blob-level tasks, as set by the
	 * <code>blob_count</code> parameter and a number of compare-and-exchange
	 * operations on linearizable registers, as set by the
	 * <code>register_operation_count</code> parameter. These tasks are distributed
	 * over the data and master-eligible nodes in the cluster for execution.
	 * <p>
	 * For most blob-level tasks, the executing node first writes a blob to the
	 * repository and then instructs some of the other nodes in the cluster to
	 * attempt to read the data it just wrote. The size of the blob is chosen
	 * randomly, according to the <code>max_blob_size</code> and
	 * <code>max_total_data_size</code> parameters. If any of these reads fails then
	 * the repository does not implement the necessary read-after-write semantics
	 * that Elasticsearch requires.
	 * <p>
	 * For some blob-level tasks, the executing node will instruct some of its peers
	 * to attempt to read the data before the writing process completes. These reads
	 * are permitted to fail, but must not return partial data. If any read returns
	 * partial data then the repository does not implement the necessary atomicity
	 * semantics that Elasticsearch requires.
	 * <p>
	 * For some blob-level tasks, the executing node will overwrite the blob while
	 * its peers are reading it. In this case the data read may come from either the
	 * original or the overwritten blob, but the read operation must not return
	 * partial data or a mix of data from the two blobs. If any of these reads
	 * returns partial data or a mix of the two blobs then the repository does not
	 * implement the necessary atomicity semantics that Elasticsearch requires for
	 * overwrites.
	 * <p>
	 * The executing node will use a variety of different methods to write the blob.
	 * For instance, where applicable, it will use both single-part and multi-part
	 * uploads. Similarly, the reading nodes will use a variety of different methods
	 * to read the data back again. For instance they may read the entire blob from
	 * start to end or may read only a subset of the data.
	 * <p>
	 * For some blob-level tasks, the executing node will cancel the write before it
	 * is complete. In this case, it still instructs some of the other nodes in the
	 * cluster to attempt to read the blob but all of these reads must fail to find
	 * the blob.
	 * <p>
	 * Linearizable registers are special blobs that Elasticsearch manipulates using
	 * an atomic compare-and-exchange operation. This operation ensures correct and
	 * strongly-consistent behavior even when the blob is accessed by multiple nodes
	 * at the same time. The detailed implementation of the compare-and-exchange
	 * operation on linearizable registers varies by repository type. Repository
	 * analysis verifies that that uncontended compare-and-exchange operations on a
	 * linearizable register blob always succeed. Repository analysis also verifies
	 * that contended operations either succeed or report the contention but do not
	 * return incorrect results. If an operation fails due to contention,
	 * Elasticsearch retries the operation until it succeeds. Most of the
	 * compare-and-exchange operations performed by repository analysis atomically
	 * increment a counter which is represented as an 8-byte blob. Some operations
	 * also verify the behavior on small blobs with sizes other than 8 bytes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/repo-analysis-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RepositoryAnalyzeResponse> repositoryAnalyze(RepositoryAnalyzeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RepositoryAnalyzeRequest, RepositoryAnalyzeResponse, ErrorResponse> endpoint = (JsonEndpoint<RepositoryAnalyzeRequest, RepositoryAnalyzeResponse, ErrorResponse>) RepositoryAnalyzeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Analyze a snapshot repository. Analyze the performance characteristics and
	 * any incorrect behaviour found in a repository.
	 * <p>
	 * The response exposes implementation details of the analysis which may change
	 * from version to version. The response body format is therefore not considered
	 * stable and may be different in newer versions.
	 * <p>
	 * There are a large number of third-party storage systems available, not all of
	 * which are suitable for use as a snapshot repository by Elasticsearch. Some
	 * storage systems behave incorrectly, or perform poorly, especially when
	 * accessed concurrently by multiple clients as the nodes of an Elasticsearch
	 * cluster do. This API performs a collection of read and write operations on
	 * your repository which are designed to detect incorrect behaviour and to
	 * measure the performance characteristics of your storage system.
	 * <p>
	 * The default values for the parameters are deliberately low to reduce the
	 * impact of running an analysis inadvertently and to provide a sensible
	 * starting point for your investigations. Run your first analysis with the
	 * default parameter values to check for simple problems. If successful, run a
	 * sequence of increasingly large analyses until you encounter a failure or you
	 * reach a <code>blob_count</code> of at least <code>2000</code>, a
	 * <code>max_blob_size</code> of at least <code>2gb</code>, a
	 * <code>max_total_data_size</code> of at least <code>1tb</code>, and a
	 * <code>register_operation_count</code> of at least <code>100</code>. Always
	 * specify a generous timeout, possibly <code>1h</code> or longer, to allow time
	 * for each analysis to run to completion. Perform the analyses using a
	 * multi-node cluster of a similar size to your production cluster so that it
	 * can detect any problems that only arise when the repository is accessed by
	 * many nodes at once.
	 * <p>
	 * If the analysis fails, Elasticsearch detected that your repository behaved
	 * unexpectedly. This usually means you are using a third-party storage system
	 * with an incorrect or incompatible implementation of the API it claims to
	 * support. If so, this storage system is not suitable for use as a snapshot
	 * repository. You will need to work with the supplier of your storage system to
	 * address the incompatibilities that Elasticsearch detects.
	 * <p>
	 * If the analysis is successful, the API returns details of the testing
	 * process, optionally including how long each operation took. You can use this
	 * information to determine the performance of your storage system. If any
	 * operation fails or returns an incorrect result, the API returns an error. If
	 * the API returns an error, it may not have removed all the data it wrote to
	 * the repository. The error will indicate the location of any leftover data and
	 * this path is also recorded in the Elasticsearch logs. You should verify that
	 * this location has been cleaned up correctly. If there is still leftover data
	 * at the specified location, you should manually remove it.
	 * <p>
	 * If the connection from your client to Elasticsearch is closed while the
	 * client is waiting for the result of the analysis, the test is cancelled. Some
	 * clients are configured to close their connection if no response is received
	 * within a certain timeout. An analysis takes a long time to complete so you
	 * might need to relax any such client-side timeouts. On cancellation the
	 * analysis attempts to clean up the data it was writing, but it may not be able
	 * to remove it all. The path to the leftover data is recorded in the
	 * Elasticsearch logs. You should verify that this location has been cleaned up
	 * correctly. If there is still leftover data at the specified location, you
	 * should manually remove it.
	 * <p>
	 * If the analysis is successful then it detected no incorrect behaviour, but
	 * this does not mean that correct behaviour is guaranteed. The analysis
	 * attempts to detect common bugs but it does not offer 100% coverage.
	 * Additionally, it does not test the following:
	 * <ul>
	 * <li>Your repository must perform durable writes. Once a blob has been written
	 * it must remain in place until it is deleted, even after a power loss or
	 * similar disaster.</li>
	 * <li>Your repository must not suffer from silent data corruption. Once a blob
	 * has been written, its contents must remain unchanged until it is deliberately
	 * modified or deleted.</li>
	 * <li>Your repository must behave correctly even if connectivity from the
	 * cluster is disrupted. Reads and writes may fail in this case, but they must
	 * not return incorrect results.</li>
	 * </ul>
	 * <p>
	 * IMPORTANT: An analysis writes a substantial amount of data to your repository
	 * and then reads it back again. This consumes bandwidth on the network between
	 * the cluster and the repository, and storage space and I/O bandwidth on the
	 * repository itself. You must ensure this load does not affect other users of
	 * these systems. Analyses respect the repository settings
	 * <code>max_snapshot_bytes_per_sec</code> and
	 * <code>max_restore_bytes_per_sec</code> if available and the cluster setting
	 * <code>indices.recovery.max_bytes_per_sec</code> which you can use to limit
	 * the bandwidth they consume.
	 * <p>
	 * NOTE: This API is intended for exploratory use by humans. You should expect
	 * the request parameters and the response format to vary in future versions.
	 * <p>
	 * NOTE: Different versions of Elasticsearch may perform different checks for
	 * repository compatibility, with newer versions typically being stricter than
	 * older ones. A storage system that passes repository analysis with one version
	 * of Elasticsearch may fail with a different version. This indicates it behaves
	 * incorrectly in ways that the former version did not detect. You must work
	 * with the supplier of your storage system to address the incompatibilities
	 * detected by the repository analysis API in any version of Elasticsearch.
	 * <p>
	 * NOTE: This API may not work correctly in a mixed-version cluster.
	 * <p>
	 * <em>Implementation details</em>
	 * <p>
	 * NOTE: This section of documentation describes how the repository analysis API
	 * works in this version of Elasticsearch, but you should expect the
	 * implementation to vary between versions. The request parameters and response
	 * format depend on details of the implementation so may also be different in
	 * newer versions.
	 * <p>
	 * The analysis comprises a number of blob-level tasks, as set by the
	 * <code>blob_count</code> parameter and a number of compare-and-exchange
	 * operations on linearizable registers, as set by the
	 * <code>register_operation_count</code> parameter. These tasks are distributed
	 * over the data and master-eligible nodes in the cluster for execution.
	 * <p>
	 * For most blob-level tasks, the executing node first writes a blob to the
	 * repository and then instructs some of the other nodes in the cluster to
	 * attempt to read the data it just wrote. The size of the blob is chosen
	 * randomly, according to the <code>max_blob_size</code> and
	 * <code>max_total_data_size</code> parameters. If any of these reads fails then
	 * the repository does not implement the necessary read-after-write semantics
	 * that Elasticsearch requires.
	 * <p>
	 * For some blob-level tasks, the executing node will instruct some of its peers
	 * to attempt to read the data before the writing process completes. These reads
	 * are permitted to fail, but must not return partial data. If any read returns
	 * partial data then the repository does not implement the necessary atomicity
	 * semantics that Elasticsearch requires.
	 * <p>
	 * For some blob-level tasks, the executing node will overwrite the blob while
	 * its peers are reading it. In this case the data read may come from either the
	 * original or the overwritten blob, but the read operation must not return
	 * partial data or a mix of data from the two blobs. If any of these reads
	 * returns partial data or a mix of the two blobs then the repository does not
	 * implement the necessary atomicity semantics that Elasticsearch requires for
	 * overwrites.
	 * <p>
	 * The executing node will use a variety of different methods to write the blob.
	 * For instance, where applicable, it will use both single-part and multi-part
	 * uploads. Similarly, the reading nodes will use a variety of different methods
	 * to read the data back again. For instance they may read the entire blob from
	 * start to end or may read only a subset of the data.
	 * <p>
	 * For some blob-level tasks, the executing node will cancel the write before it
	 * is complete. In this case, it still instructs some of the other nodes in the
	 * cluster to attempt to read the blob but all of these reads must fail to find
	 * the blob.
	 * <p>
	 * Linearizable registers are special blobs that Elasticsearch manipulates using
	 * an atomic compare-and-exchange operation. This operation ensures correct and
	 * strongly-consistent behavior even when the blob is accessed by multiple nodes
	 * at the same time. The detailed implementation of the compare-and-exchange
	 * operation on linearizable registers varies by repository type. Repository
	 * analysis verifies that that uncontended compare-and-exchange operations on a
	 * linearizable register blob always succeed. Repository analysis also verifies
	 * that contended operations either succeed or report the contention but do not
	 * return incorrect results. If an operation fails due to contention,
	 * Elasticsearch retries the operation until it succeeds. Most of the
	 * compare-and-exchange operations performed by repository analysis atomically
	 * increment a counter which is represented as an 8-byte blob. Some operations
	 * also verify the behavior on small blobs with sizes other than 8 bytes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RepositoryAnalyzeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/repo-analysis-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RepositoryAnalyzeResponse> repositoryAnalyze(
			Function<RepositoryAnalyzeRequest.Builder, ObjectBuilder<RepositoryAnalyzeRequest>> fn) {
		return repositoryAnalyze(fn.apply(new RepositoryAnalyzeRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.repository_verify_integrity

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
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/verify-repo-integrity-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RepositoryVerifyIntegrityResponse> repositoryVerifyIntegrity(
			RepositoryVerifyIntegrityRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse> endpoint = (JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse>) RepositoryVerifyIntegrityRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

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
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RepositoryVerifyIntegrityRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/verify-repo-integrity-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RepositoryVerifyIntegrityResponse> repositoryVerifyIntegrity(
			Function<RepositoryVerifyIntegrityRequest.Builder, ObjectBuilder<RepositoryVerifyIntegrityRequest>> fn) {
		return repositoryVerifyIntegrity(fn.apply(new RepositoryVerifyIntegrityRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.restore

	/**
	 * Restore a snapshot. Restore a snapshot of a cluster or data streams and
	 * indices.
	 * <p>
	 * You can restore a snapshot only to a running cluster with an elected master
	 * node. The snapshot repository must be registered and available to the
	 * cluster. The snapshot and cluster versions must be compatible.
	 * <p>
	 * To restore a snapshot, the cluster's global metadata must be writable. Ensure
	 * there are't any cluster blocks that prevent writes. The restore operation
	 * ignores index blocks.
	 * <p>
	 * Before you restore a data stream, ensure the cluster contains a matching
	 * index template with data streams enabled. To check, use the index management
	 * feature in Kibana or the get index template API:
	 * 
	 * <pre>
	 * <code>GET _index_template/*?filter_path=index_templates.name,index_templates.index_template.index_patterns,index_templates.index_template.data_stream
	 * </code>
	 * </pre>
	 * <p>
	 * If no such template exists, you can create one or restore a cluster state
	 * that contains one. Without a matching index template, a data stream can't
	 * roll over or create backing indices.
	 * <p>
	 * If your snapshot contains data from App Search or Workplace Search, you must
	 * restore the Enterprise Search encryption key before you restore the snapshot.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/restore-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RestoreResponse> restore(RestoreRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse>) RestoreRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Restore a snapshot. Restore a snapshot of a cluster or data streams and
	 * indices.
	 * <p>
	 * You can restore a snapshot only to a running cluster with an elected master
	 * node. The snapshot repository must be registered and available to the
	 * cluster. The snapshot and cluster versions must be compatible.
	 * <p>
	 * To restore a snapshot, the cluster's global metadata must be writable. Ensure
	 * there are't any cluster blocks that prevent writes. The restore operation
	 * ignores index blocks.
	 * <p>
	 * Before you restore a data stream, ensure the cluster contains a matching
	 * index template with data streams enabled. To check, use the index management
	 * feature in Kibana or the get index template API:
	 * 
	 * <pre>
	 * <code>GET _index_template/*?filter_path=index_templates.name,index_templates.index_template.index_patterns,index_templates.index_template.data_stream
	 * </code>
	 * </pre>
	 * <p>
	 * If no such template exists, you can create one or restore a cluster state
	 * that contains one. Without a matching index template, a data stream can't
	 * roll over or create backing indices.
	 * <p>
	 * If your snapshot contains data from App Search or Workplace Search, you must
	 * restore the Enterprise Search encryption key before you restore the snapshot.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RestoreRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/restore-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RestoreResponse> restore(
			Function<RestoreRequest.Builder, ObjectBuilder<RestoreRequest>> fn) {
		return restore(fn.apply(new RestoreRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.status

	/**
	 * Get the snapshot status. Get a detailed description of the current state for
	 * each shard participating in the snapshot. Note that this API should be used
	 * only to obtain detailed shard-level information for ongoing snapshots. If
	 * this detail is not needed or you want to obtain information about one or more
	 * existing snapshots, use the get snapshot API.
	 * <p>
	 * WARNING: Using the API to return the status of any snapshots other than
	 * currently running snapshots can be expensive. The API requires a read from
	 * the repository for each shard in each snapshot. For example, if you have 100
	 * snapshots with 1,000 shards each, an API request that includes all snapshots
	 * will require 100,000 reads (100 snapshots x 1,000 shards).
	 * <p>
	 * Depending on the latency of your storage, such requests can take an extremely
	 * long time to return results. These requests can also tax machine resources
	 * and, when using cloud storage, incur high processing costs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotStatusResponse> status(SnapshotStatusRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse>) SnapshotStatusRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the snapshot status. Get a detailed description of the current state for
	 * each shard participating in the snapshot. Note that this API should be used
	 * only to obtain detailed shard-level information for ongoing snapshots. If
	 * this detail is not needed or you want to obtain information about one or more
	 * existing snapshots, use the get snapshot API.
	 * <p>
	 * WARNING: Using the API to return the status of any snapshots other than
	 * currently running snapshots can be expensive. The API requires a read from
	 * the repository for each shard in each snapshot. For example, if you have 100
	 * snapshots with 1,000 shards each, an API request that includes all snapshots
	 * will require 100,000 reads (100 snapshots x 1,000 shards).
	 * <p>
	 * Depending on the latency of your storage, such requests can take an extremely
	 * long time to return results. These requests can also tax machine resources
	 * and, when using cloud storage, incur high processing costs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotStatusResponse> status(
			Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn) {
		return status(fn.apply(new SnapshotStatusRequest.Builder()).build());
	}

	/**
	 * Get the snapshot status. Get a detailed description of the current state for
	 * each shard participating in the snapshot. Note that this API should be used
	 * only to obtain detailed shard-level information for ongoing snapshots. If
	 * this detail is not needed or you want to obtain information about one or more
	 * existing snapshots, use the get snapshot API.
	 * <p>
	 * WARNING: Using the API to return the status of any snapshots other than
	 * currently running snapshots can be expensive. The API requires a read from
	 * the repository for each shard in each snapshot. For example, if you have 100
	 * snapshots with 1,000 shards each, an API request that includes all snapshots
	 * will require 100,000 reads (100 snapshots x 1,000 shards).
	 * <p>
	 * Depending on the latency of your storage, such requests can take an extremely
	 * long time to return results. These requests can also tax machine resources
	 * and, when using cloud storage, incur high processing costs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotStatusResponse> status() {
		return this.transport.performRequestAsync(new SnapshotStatusRequest.Builder().build(),
				SnapshotStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.verify_repository

	/**
	 * Verify a snapshot repository. Check for common misconfigurations in a
	 * snapshot repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/verify-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<VerifyRepositoryResponse> verifyRepository(VerifyRepositoryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse>) VerifyRepositoryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Verify a snapshot repository. Check for common misconfigurations in a
	 * snapshot repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link VerifyRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/verify-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<VerifyRepositoryResponse> verifyRepository(
			Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn) {
		return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
	}

}
