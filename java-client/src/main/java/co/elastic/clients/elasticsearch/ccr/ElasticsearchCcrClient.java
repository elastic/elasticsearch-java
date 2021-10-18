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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ccr namespace.
 */
public class ElasticsearchCcrClient extends ApiClient {

	public ElasticsearchCcrClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: ccr.delete_auto_follow_pattern

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAutoFollowPatternResponse deleteAutoFollowPattern(DeleteAutoFollowPatternRequest request)
			throws IOException {
		return this.transport.performRequest(request, DeleteAutoFollowPatternRequest.ENDPOINT);
	}

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAutoFollowPatternResponse deleteAutoFollowPattern(
			Function<DeleteAutoFollowPatternRequest.Builder, ObjectBuilder<DeleteAutoFollowPatternRequest>> fn)
			throws IOException {
		return deleteAutoFollowPattern(fn.apply(new DeleteAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow

	/**
	 * Creates a new follower index configured to follow the referenced leader
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowResponse follow(FollowRequest request) throws IOException {
		return this.transport.performRequest(request, FollowRequest.ENDPOINT);
	}

	/**
	 * Creates a new follower index configured to follow the referenced leader
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowResponse follow(Function<FollowRequest.Builder, ObjectBuilder<FollowRequest>> fn)
			throws IOException {
		return follow(fn.apply(new FollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow_info

	/**
	 * Retrieves information about all follower indices, including parameters and
	 * status for each follower index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowInfoResponse followInfo(FollowInfoRequest request) throws IOException {
		return this.transport.performRequest(request, FollowInfoRequest.ENDPOINT);
	}

	/**
	 * Retrieves information about all follower indices, including parameters and
	 * status for each follower index
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowInfoResponse followInfo(Function<FollowInfoRequest.Builder, ObjectBuilder<FollowInfoRequest>> fn)
			throws IOException {
		return followInfo(fn.apply(new FollowInfoRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.follow_stats

	/**
	 * Retrieves follower stats. return shard-level stats about the following tasks
	 * associated with each shard for the specified indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public FollowStatsResponse followStats(FollowStatsRequest request) throws IOException {
		return this.transport.performRequest(request, FollowStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieves follower stats. return shard-level stats about the following tasks
	 * associated with each shard for the specified indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FollowStatsResponse followStats(
			Function<FollowStatsRequest.Builder, ObjectBuilder<FollowStatsRequest>> fn) throws IOException {
		return followStats(fn.apply(new FollowStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.forget_follower

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForgetFollowerResponse forgetFollower(ForgetFollowerRequest request) throws IOException {
		return this.transport.performRequest(request, ForgetFollowerRequest.ENDPOINT);
	}

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ForgetFollowerResponse forgetFollower(
			Function<ForgetFollowerRequest.Builder, ObjectBuilder<ForgetFollowerRequest>> fn) throws IOException {
		return forgetFollower(fn.apply(new ForgetFollowerRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.get_auto_follow_pattern

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoFollowPatternResponse getAutoFollowPattern(GetAutoFollowPatternRequest request) throws IOException {
		return this.transport.performRequest(request, GetAutoFollowPatternRequest.ENDPOINT);
	}

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoFollowPatternResponse getAutoFollowPattern(
			Function<GetAutoFollowPatternRequest.Builder, ObjectBuilder<GetAutoFollowPatternRequest>> fn)
			throws IOException {
		return getAutoFollowPattern(fn.apply(new GetAutoFollowPatternRequest.Builder()).build());
	}

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoFollowPatternResponse getAutoFollowPattern() throws IOException {
		return this.transport.performRequest(new GetAutoFollowPatternRequest.Builder().build(),
				GetAutoFollowPatternRequest.ENDPOINT);
	}

	// ----- Endpoint: ccr.pause_auto_follow_pattern

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public PauseAutoFollowPatternResponse pauseAutoFollowPattern(PauseAutoFollowPatternRequest request)
			throws IOException {
		return this.transport.performRequest(request, PauseAutoFollowPatternRequest.ENDPOINT);
	}

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PauseAutoFollowPatternResponse pauseAutoFollowPattern(
			Function<PauseAutoFollowPatternRequest.Builder, ObjectBuilder<PauseAutoFollowPatternRequest>> fn)
			throws IOException {
		return pauseAutoFollowPattern(fn.apply(new PauseAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.pause_follow

	/**
	 * Pauses a follower index. The follower index will not fetch any additional
	 * operations from the leader index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public PauseFollowResponse pauseFollow(PauseFollowRequest request) throws IOException {
		return this.transport.performRequest(request, PauseFollowRequest.ENDPOINT);
	}

	/**
	 * Pauses a follower index. The follower index will not fetch any additional
	 * operations from the leader index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PauseFollowResponse pauseFollow(
			Function<PauseFollowRequest.Builder, ObjectBuilder<PauseFollowRequest>> fn) throws IOException {
		return pauseFollow(fn.apply(new PauseFollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.put_auto_follow_pattern

	/**
	 * Creates a new named collection of auto-follow patterns against a specified
	 * remote cluster. Newly created indices on the remote cluster matching any of
	 * the specified patterns will be automatically configured as follower indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAutoFollowPatternResponse putAutoFollowPattern(PutAutoFollowPatternRequest request) throws IOException {
		return this.transport.performRequest(request, PutAutoFollowPatternRequest.ENDPOINT);
	}

	/**
	 * Creates a new named collection of auto-follow patterns against a specified
	 * remote cluster. Newly created indices on the remote cluster matching any of
	 * the specified patterns will be automatically configured as follower indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAutoFollowPatternResponse putAutoFollowPattern(
			Function<PutAutoFollowPatternRequest.Builder, ObjectBuilder<PutAutoFollowPatternRequest>> fn)
			throws IOException {
		return putAutoFollowPattern(fn.apply(new PutAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.resume_auto_follow_pattern

	/**
	 * Resumes an auto-follow pattern that has been paused
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResumeAutoFollowPatternResponse resumeAutoFollowPattern(ResumeAutoFollowPatternRequest request)
			throws IOException {
		return this.transport.performRequest(request, ResumeAutoFollowPatternRequest.ENDPOINT);
	}

	/**
	 * Resumes an auto-follow pattern that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResumeAutoFollowPatternResponse resumeAutoFollowPattern(
			Function<ResumeAutoFollowPatternRequest.Builder, ObjectBuilder<ResumeAutoFollowPatternRequest>> fn)
			throws IOException {
		return resumeAutoFollowPattern(fn.apply(new ResumeAutoFollowPatternRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.resume_follow

	/**
	 * Resumes a follower index that has been paused
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResumeFollowResponse resumeFollow(ResumeFollowRequest request) throws IOException {
		return this.transport.performRequest(request, ResumeFollowRequest.ENDPOINT);
	}

	/**
	 * Resumes a follower index that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResumeFollowResponse resumeFollow(
			Function<ResumeFollowRequest.Builder, ObjectBuilder<ResumeFollowRequest>> fn) throws IOException {
		return resumeFollow(fn.apply(new ResumeFollowRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.stats

	/**
	 * Gets all stats related to cross-cluster replication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public CcrStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(CcrStatsRequest._INSTANCE, CcrStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ccr.unfollow

	/**
	 * Stops the following task associated with a follower index and removes index
	 * metadata and settings associated with cross-cluster replication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public UnfollowResponse unfollow(UnfollowRequest request) throws IOException {
		return this.transport.performRequest(request, UnfollowRequest.ENDPOINT);
	}

	/**
	 * Stops the following task associated with a follower index and removes index
	 * metadata and settings associated with cross-cluster replication.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UnfollowResponse unfollow(Function<UnfollowRequest.Builder, ObjectBuilder<UnfollowRequest>> fn)
			throws IOException {
		return unfollow(fn.apply(new UnfollowRequest.Builder()).build());
	}

}
