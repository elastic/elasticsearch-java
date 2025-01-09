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
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
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
public class ElasticsearchSnapshotClient extends ApiClient<ElasticsearchTransport, ElasticsearchSnapshotClient> {

	public ElasticsearchSnapshotClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSnapshotClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSnapshotClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSnapshotClient(this.transport, transportOptions);
	}

	// ----- Endpoint: snapshot.cleanup_repository

	/**
	 * Clean up the snapshot repository. Trigger the review of the contents of a
	 * snapshot repository and delete any stale data not referenced by existing
	 * snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CleanupRepositoryResponse cleanupRepository(CleanupRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CleanupRepositoryRequest, CleanupRepositoryResponse, ErrorResponse>) CleanupRepositoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/clean-up-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CleanupRepositoryResponse cleanupRepository(
			Function<CleanupRepositoryRequest.Builder, ObjectBuilder<CleanupRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return cleanupRepository(fn.apply(new CleanupRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.clone

	/**
	 * Clone a snapshot. Clone part of all of a snapshot into another snapshot in
	 * the same repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/clone-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloneSnapshotResponse clone(CloneSnapshotRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CloneSnapshotRequest, CloneSnapshotResponse, ErrorResponse>) CloneSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clone a snapshot. Clone part of all of a snapshot into another snapshot in
	 * the same repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CloneSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/clone-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CloneSnapshotResponse clone(
			Function<CloneSnapshotRequest.Builder, ObjectBuilder<CloneSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return clone(fn.apply(new CloneSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.create

	/**
	 * Create a snapshot. Take a snapshot of a cluster or of data streams and
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/create-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateSnapshotResponse create(CreateSnapshotRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateSnapshotRequest, CreateSnapshotResponse, ErrorResponse>) CreateSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a snapshot. Take a snapshot of a cluster or of data streams and
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/create-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateSnapshotResponse create(
			Function<CreateSnapshotRequest.Builder, ObjectBuilder<CreateSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CreateRepositoryResponse createRepository(CreateRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateRepositoryRequest, CreateRepositoryResponse, ErrorResponse>) CreateRepositoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CreateRepositoryResponse createRepository(
			Function<CreateRepositoryRequest.Builder, ObjectBuilder<CreateRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return createRepository(fn.apply(new CreateRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.delete

	/**
	 * Delete snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/delete-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteSnapshotResponse delete(DeleteSnapshotRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteSnapshotRequest, DeleteSnapshotResponse, ErrorResponse>) DeleteSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/delete-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteSnapshotResponse delete(
			Function<DeleteSnapshotRequest.Builder, ObjectBuilder<DeleteSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/delete-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse>) DeleteRepositoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/delete-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteRepositoryResponse deleteRepository(
			Function<DeleteRepositoryRequest.Builder, ObjectBuilder<DeleteRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRepository(fn.apply(new DeleteRepositoryRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get

	/**
	 * Get snapshot information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSnapshotResponse get(GetSnapshotRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSnapshotRequest, GetSnapshotResponse, ErrorResponse>) GetSnapshotRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get snapshot information.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSnapshotRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSnapshotResponse get(Function<GetSnapshotRequest.Builder, ObjectBuilder<GetSnapshotRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetSnapshotRequest.Builder()).build());
	}

	// ----- Endpoint: snapshot.get_repository

	/**
	 * Get snapshot repository information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRepositoryResponse getRepository(GetRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRepositoryRequest, GetRepositoryResponse, ErrorResponse>) GetRepositoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get snapshot repository information.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRepositoryResponse getRepository(
			Function<GetRepositoryRequest.Builder, ObjectBuilder<GetRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRepository(fn.apply(new GetRepositoryRequest.Builder()).build());
	}

	/**
	 * Get snapshot repository information.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRepositoryResponse getRepository() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRepositoryRequest.Builder().build(), GetRepositoryRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/verify-repo-integrity-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RepositoryVerifyIntegrityResponse repositoryVerifyIntegrity(RepositoryVerifyIntegrityRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse> endpoint = (JsonEndpoint<RepositoryVerifyIntegrityRequest, RepositoryVerifyIntegrityResponse, ErrorResponse>) RepositoryVerifyIntegrityRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/verify-repo-integrity-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RepositoryVerifyIntegrityResponse repositoryVerifyIntegrity(
			Function<RepositoryVerifyIntegrityRequest.Builder, ObjectBuilder<RepositoryVerifyIntegrityRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/restore-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RestoreResponse restore(RestoreRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse> endpoint = (JsonEndpoint<RestoreRequest, RestoreResponse, ErrorResponse>) RestoreRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/restore-snapshot-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RestoreResponse restore(Function<RestoreRequest.Builder, ObjectBuilder<RestoreRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SnapshotStatusResponse status(SnapshotStatusRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotStatusRequest, SnapshotStatusResponse, ErrorResponse>) SnapshotStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SnapshotStatusResponse status(
			Function<SnapshotStatusRequest.Builder, ObjectBuilder<SnapshotStatusRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/get-snapshot-status-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SnapshotStatusResponse status() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SnapshotStatusRequest.Builder().build(),
				SnapshotStatusRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: snapshot.verify_repository

	/**
	 * Verify a snapshot repository. Check for common misconfigurations in a
	 * snapshot repository.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/verify-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public VerifyRepositoryResponse verifyRepository(VerifyRepositoryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse> endpoint = (JsonEndpoint<VerifyRepositoryRequest, VerifyRepositoryResponse, ErrorResponse>) VerifyRepositoryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Verify a snapshot repository. Check for common misconfigurations in a
	 * snapshot repository.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link VerifyRepositoryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/verify-snapshot-repo-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final VerifyRepositoryResponse verifyRepository(
			Function<VerifyRepositoryRequest.Builder, ObjectBuilder<VerifyRepositoryRequest>> fn)
			throws IOException, ElasticsearchException {
		return verifyRepository(fn.apply(new VerifyRepositoryRequest.Builder()).build());
	}

}
