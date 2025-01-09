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

package co.elastic.clients.elasticsearch.ccr;

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
 * Client for the ccr namespace.
 */
public class ElasticsearchCcrClient extends ApiClient<ElasticsearchTransport, ElasticsearchCcrClient> {

	public ElasticsearchCcrClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCcrClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCcrClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCcrClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ccr.delete_auto_follow_pattern

	/**
	 * Delete auto-follow patterns. Delete a collection of cross-cluster replication
	 * auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAutoFollowPatternResponse deleteAutoFollowPattern(DeleteAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteAutoFollowPatternRequest, DeleteAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteAutoFollowPatternRequest, DeleteAutoFollowPatternResponse, ErrorResponse>) DeleteAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete auto-follow patterns. Delete a collection of cross-cluster replication
	 * auto-follow patterns.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAutoFollowPatternResponse deleteAutoFollowPattern(
			Function<DeleteAutoFollowPatternRequest.Builder, ObjectBuilder<DeleteAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteAutoFollowPattern(fn.apply(new DeleteAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow

	/**
	 * Create a follower. Create a cross-cluster replication follower index that
	 * follows a specific leader index. When the API returns, the follower index
	 * exists and cross-cluster replication starts replicating operations from the
	 * leader index to the follower index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowResponse follow(FollowRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowRequest, FollowResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowRequest, FollowResponse, ErrorResponse>) FollowRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a follower. Create a cross-cluster replication follower index that
	 * follows a specific leader index. When the API returns, the follower index
	 * exists and cross-cluster replication starts replicating operations from the
	 * leader index to the follower index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowResponse follow(Function<FollowRequest.Builder, ObjectBuilder<FollowRequest>> fn)
			throws IOException, ElasticsearchException {
		return follow(fn.apply(new FollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow_info

	/**
	 * Get follower information. Get information about all cross-cluster replication
	 * follower indices. For example, the results include follower index names,
	 * leader index names, replication options, and whether the follower indices are
	 * active or paused.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowInfoResponse followInfo(FollowInfoRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowInfoRequest, FollowInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowInfoRequest, FollowInfoResponse, ErrorResponse>) FollowInfoRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get follower information. Get information about all cross-cluster replication
	 * follower indices. For example, the results include follower index names,
	 * leader index names, replication options, and whether the follower indices are
	 * active or paused.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowInfoResponse followInfo(Function<FollowInfoRequest.Builder, ObjectBuilder<FollowInfoRequest>> fn)
			throws IOException, ElasticsearchException {
		return followInfo(fn.apply(new FollowInfoRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow_stats

	/**
	 * Get follower stats. Get cross-cluster replication follower stats. The API
	 * returns shard-level stats about the &quot;following tasks&quot; associated
	 * with each shard for the specified indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowStatsResponse followStats(FollowStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FollowStatsRequest, FollowStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<FollowStatsRequest, FollowStatsResponse, ErrorResponse>) FollowStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get follower stats. Get cross-cluster replication follower stats. The API
	 * returns shard-level stats about the &quot;following tasks&quot; associated
	 * with each shard for the specified indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowStatsResponse followStats(
			Function<FollowStatsRequest.Builder, ObjectBuilder<FollowStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return followStats(fn.apply(new FollowStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.forget_follower

	/**
	 * Forget a follower. Remove the cross-cluster replication follower retention
	 * leases from the leader.
	 * <p>
	 * A following index takes out retention leases on its leader index. These
	 * leases are used to increase the likelihood that the shards of the leader
	 * index retain the history of operations that the shards of the following index
	 * need to run replication. When a follower index is converted to a regular
	 * index by the unfollow API (either by directly calling the API or by index
	 * lifecycle management tasks), these leases are removed. However, removal of
	 * the leases can fail, for example when the remote cluster containing the
	 * leader index is unavailable. While the leases will eventually expire on their
	 * own, their extended existence can cause the leader index to hold more history
	 * than necessary and prevent index lifecycle management from performing some
	 * operations on the leader index. This API exists to enable manually removing
	 * the leases when the unfollow API is unable to do so.
	 * <p>
	 * NOTE: This API does not stop replication by a following index. If you use
	 * this API with a follower index that is still actively following, the
	 * following index will add back retention leases on the leader. The only
	 * purpose of this API is to handle the case of failure to remove the following
	 * retention leases after the unfollow API is invoked.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForgetFollowerResponse forgetFollower(ForgetFollowerRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ForgetFollowerRequest, ForgetFollowerResponse, ErrorResponse> endpoint = (JsonEndpoint<ForgetFollowerRequest, ForgetFollowerResponse, ErrorResponse>) ForgetFollowerRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Forget a follower. Remove the cross-cluster replication follower retention
	 * leases from the leader.
	 * <p>
	 * A following index takes out retention leases on its leader index. These
	 * leases are used to increase the likelihood that the shards of the leader
	 * index retain the history of operations that the shards of the following index
	 * need to run replication. When a follower index is converted to a regular
	 * index by the unfollow API (either by directly calling the API or by index
	 * lifecycle management tasks), these leases are removed. However, removal of
	 * the leases can fail, for example when the remote cluster containing the
	 * leader index is unavailable. While the leases will eventually expire on their
	 * own, their extended existence can cause the leader index to hold more history
	 * than necessary and prevent index lifecycle management from performing some
	 * operations on the leader index. This API exists to enable manually removing
	 * the leases when the unfollow API is unable to do so.
	 * <p>
	 * NOTE: This API does not stop replication by a following index. If you use
	 * this API with a follower index that is still actively following, the
	 * following index will add back retention leases on the leader. The only
	 * purpose of this API is to handle the case of failure to remove the following
	 * retention leases after the unfollow API is invoked.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForgetFollowerRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ForgetFollowerResponse forgetFollower(
			Function<ForgetFollowerRequest.Builder, ObjectBuilder<ForgetFollowerRequest>> fn)
			throws IOException, ElasticsearchException {
		return forgetFollower(fn.apply(new ForgetFollowerRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.get_auto_follow_pattern

	/**
	 * Get auto-follow patterns. Get cross-cluster replication auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoFollowPatternResponse getAutoFollowPattern(GetAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetAutoFollowPatternRequest, GetAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<GetAutoFollowPatternRequest, GetAutoFollowPatternResponse, ErrorResponse>) GetAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get auto-follow patterns. Get cross-cluster replication auto-follow patterns.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoFollowPatternResponse getAutoFollowPattern(
			Function<GetAutoFollowPatternRequest.Builder, ObjectBuilder<GetAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return getAutoFollowPattern(fn.apply(new GetAutoFollowPatternRequest.Builder()).build());
	}

	/**
	 * Get auto-follow patterns. Get cross-cluster replication auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoFollowPatternResponse getAutoFollowPattern() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetAutoFollowPatternRequest.Builder().build(),
				GetAutoFollowPatternRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ccr.pause_auto_follow_pattern

	/**
	 * Pause an auto-follow pattern. Pause a cross-cluster replication auto-follow
	 * pattern. When the API returns, the auto-follow pattern is inactive. New
	 * indices that are created on the remote cluster and match the auto-follow
	 * patterns are ignored.
	 * <p>
	 * You can resume auto-following with the resume auto-follow pattern API. When
	 * it resumes, the auto-follow pattern is active again and automatically
	 * configures follower indices for newly created indices on the remote cluster
	 * that match its patterns. Remote indices that were created while the pattern
	 * was paused will also be followed, unless they have been deleted or closed in
	 * the interim.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public PauseAutoFollowPatternResponse pauseAutoFollowPattern(PauseAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PauseAutoFollowPatternRequest, PauseAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<PauseAutoFollowPatternRequest, PauseAutoFollowPatternResponse, ErrorResponse>) PauseAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Pause an auto-follow pattern. Pause a cross-cluster replication auto-follow
	 * pattern. When the API returns, the auto-follow pattern is inactive. New
	 * indices that are created on the remote cluster and match the auto-follow
	 * patterns are ignored.
	 * <p>
	 * You can resume auto-following with the resume auto-follow pattern API. When
	 * it resumes, the auto-follow pattern is active again and automatically
	 * configures follower indices for newly created indices on the remote cluster
	 * that match its patterns. Remote indices that were created while the pattern
	 * was paused will also be followed, unless they have been deleted or closed in
	 * the interim.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PauseAutoFollowPatternResponse pauseAutoFollowPattern(
			Function<PauseAutoFollowPatternRequest.Builder, ObjectBuilder<PauseAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return pauseAutoFollowPattern(fn.apply(new PauseAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.pause_follow

	/**
	 * Pause a follower. Pause a cross-cluster replication follower index. The
	 * follower index will not fetch any additional operations from the leader
	 * index. You can resume following with the resume follower API. You can pause
	 * and resume a follower index to change the configuration of the following
	 * task.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public PauseFollowResponse pauseFollow(PauseFollowRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PauseFollowRequest, PauseFollowResponse, ErrorResponse> endpoint = (JsonEndpoint<PauseFollowRequest, PauseFollowResponse, ErrorResponse>) PauseFollowRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Pause a follower. Pause a cross-cluster replication follower index. The
	 * follower index will not fetch any additional operations from the leader
	 * index. You can resume following with the resume follower API. You can pause
	 * and resume a follower index to change the configuration of the following
	 * task.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PauseFollowResponse pauseFollow(
			Function<PauseFollowRequest.Builder, ObjectBuilder<PauseFollowRequest>> fn)
			throws IOException, ElasticsearchException {
		return pauseFollow(fn.apply(new PauseFollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.put_auto_follow_pattern

	/**
	 * Create or update auto-follow patterns. Create a collection of cross-cluster
	 * replication auto-follow patterns for a remote cluster. Newly created indices
	 * on the remote cluster that match any of the patterns are automatically
	 * configured as follower indices. Indices on the remote cluster that were
	 * created before the auto-follow pattern was created will not be auto-followed
	 * even if they match the pattern.
	 * <p>
	 * This API can also be used to update auto-follow patterns. NOTE: Follower
	 * indices that were configured automatically before updating an auto-follow
	 * pattern will remain unchanged even if they do not match against the new
	 * patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAutoFollowPatternResponse putAutoFollowPattern(PutAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAutoFollowPatternRequest, PutAutoFollowPatternResponse, ErrorResponse>) PutAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update auto-follow patterns. Create a collection of cross-cluster
	 * replication auto-follow patterns for a remote cluster. Newly created indices
	 * on the remote cluster that match any of the patterns are automatically
	 * configured as follower indices. Indices on the remote cluster that were
	 * created before the auto-follow pattern was created will not be auto-followed
	 * even if they match the pattern.
	 * <p>
	 * This API can also be used to update auto-follow patterns. NOTE: Follower
	 * indices that were configured automatically before updating an auto-follow
	 * pattern will remain unchanged even if they do not match against the new
	 * patterns.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAutoFollowPatternResponse putAutoFollowPattern(
			Function<PutAutoFollowPatternRequest.Builder, ObjectBuilder<PutAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAutoFollowPattern(fn.apply(new PutAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.resume_auto_follow_pattern

	/**
	 * Resume an auto-follow pattern. Resume a cross-cluster replication auto-follow
	 * pattern that was paused. The auto-follow pattern will resume configuring
	 * following indices for newly created indices that match its patterns on the
	 * remote cluster. Remote indices created while the pattern was paused will also
	 * be followed unless they have been deleted or closed in the interim.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResumeAutoFollowPatternResponse resumeAutoFollowPattern(ResumeAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResumeAutoFollowPatternRequest, ResumeAutoFollowPatternResponse, ErrorResponse> endpoint = (JsonEndpoint<ResumeAutoFollowPatternRequest, ResumeAutoFollowPatternResponse, ErrorResponse>) ResumeAutoFollowPatternRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Resume an auto-follow pattern. Resume a cross-cluster replication auto-follow
	 * pattern that was paused. The auto-follow pattern will resume configuring
	 * following indices for newly created indices that match its patterns on the
	 * remote cluster. Remote indices created while the pattern was paused will also
	 * be followed unless they have been deleted or closed in the interim.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResumeAutoFollowPatternResponse resumeAutoFollowPattern(
			Function<ResumeAutoFollowPatternRequest.Builder, ObjectBuilder<ResumeAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
		return resumeAutoFollowPattern(fn.apply(new ResumeAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.resume_follow

	/**
	 * Resume a follower. Resume a cross-cluster replication follower index that was
	 * paused. The follower index could have been paused with the pause follower
	 * API. Alternatively it could be paused due to replication that cannot be
	 * retried due to failures during following tasks. When this API returns, the
	 * follower index will resume fetching operations from the leader index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResumeFollowResponse resumeFollow(ResumeFollowRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResumeFollowRequest, ResumeFollowResponse, ErrorResponse> endpoint = (JsonEndpoint<ResumeFollowRequest, ResumeFollowResponse, ErrorResponse>) ResumeFollowRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Resume a follower. Resume a cross-cluster replication follower index that was
	 * paused. The follower index could have been paused with the pause follower
	 * API. Alternatively it could be paused due to replication that cannot be
	 * retried due to failures during following tasks. When this API returns, the
	 * follower index will resume fetching operations from the leader index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResumeFollowResponse resumeFollow(
			Function<ResumeFollowRequest.Builder, ObjectBuilder<ResumeFollowRequest>> fn)
			throws IOException, ElasticsearchException {
		return resumeFollow(fn.apply(new ResumeFollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.stats

	/**
	 * Get cross-cluster replication stats. This API returns stats about
	 * auto-following and the same shard-level stats as the get follower stats API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CcrStatsResponse stats(CcrStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CcrStatsRequest, CcrStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<CcrStatsRequest, CcrStatsResponse, ErrorResponse>) CcrStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cross-cluster replication stats. This API returns stats about
	 * auto-following and the same shard-level stats as the get follower stats API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CcrStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CcrStatsResponse stats(Function<CcrStatsRequest.Builder, ObjectBuilder<CcrStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stats(fn.apply(new CcrStatsRequest.Builder()).build());
	}

	/**
	 * Get cross-cluster replication stats. This API returns stats about
	 * auto-following and the same shard-level stats as the get follower stats API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CcrStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CcrStatsRequest.Builder().build(), CcrStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ccr.unfollow

	/**
	 * Unfollow an index. Convert a cross-cluster replication follower index to a
	 * regular index. The API stops the following task associated with a follower
	 * index and removes index metadata and settings associated with cross-cluster
	 * replication. The follower index must be paused and closed before you call the
	 * unfollow API.
	 * <p>
	 * NOTE: Currently cross-cluster replication does not support converting an
	 * existing regular index to a follower index. Converting a follower index to a
	 * regular index is an irreversible operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public UnfollowResponse unfollow(UnfollowRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UnfollowRequest, UnfollowResponse, ErrorResponse> endpoint = (JsonEndpoint<UnfollowRequest, UnfollowResponse, ErrorResponse>) UnfollowRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Unfollow an index. Convert a cross-cluster replication follower index to a
	 * regular index. The API stops the following task associated with a follower
	 * index and removes index metadata and settings associated with cross-cluster
	 * replication. The follower index must be paused and closed before you call the
	 * unfollow API.
	 * <p>
	 * NOTE: Currently cross-cluster replication does not support converting an
	 * existing regular index to a follower index. Converting a follower index to a
	 * regular index is an irreversible operation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UnfollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UnfollowResponse unfollow(Function<UnfollowRequest.Builder, ObjectBuilder<UnfollowRequest>> fn)
			throws IOException, ElasticsearchException {
		return unfollow(fn.apply(new UnfollowRequest.Builder()).build());
	}

}
