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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ccr namespace.
 */
public class ElasticsearchCcrAsyncClient extends ApiClient<ElasticsearchCcrAsyncClient> {

	public ElasticsearchCcrAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchCcrAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCcrAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCcrAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ccr.delete_auto_follow_pattern

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteAutoFollowPatternResponse> deleteAutoFollowPattern(
			DeleteAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteAutoFollowPatternRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Deletes auto-follow patterns.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-delete-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteAutoFollowPatternResponse> deleteAutoFollowPattern(
			Function<DeleteAutoFollowPatternRequest.Builder, ObjectBuilder<DeleteAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<FollowResponse> follow(FollowRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FollowRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates a new follower index configured to follow the referenced leader
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowResponse> follow(
			Function<FollowRequest.Builder, ObjectBuilder<FollowRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<FollowInfoResponse> followInfo(FollowInfoRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FollowInfoRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves information about all follower indices, including parameters and
	 * status for each follower index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowInfoResponse> followInfo(
			Function<FollowInfoRequest.Builder, ObjectBuilder<FollowInfoRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<FollowStatsResponse> followStats(FollowStatsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FollowStatsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves follower stats. return shard-level stats about the following tasks
	 * associated with each shard for the specified indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FollowStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-follow-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FollowStatsResponse> followStats(
			Function<FollowStatsRequest.Builder, ObjectBuilder<FollowStatsRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<ForgetFollowerResponse> forgetFollower(ForgetFollowerRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ForgetFollowerRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ForgetFollowerRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ForgetFollowerResponse> forgetFollower(
			Function<ForgetFollowerRequest.Builder, ObjectBuilder<ForgetFollowerRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern(GetAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetAutoFollowPatternRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Gets configured auto-follow patterns. Returns the specified auto-follow
	 * pattern collection.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern(
			Function<GetAutoFollowPatternRequest.Builder, ObjectBuilder<GetAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetAutoFollowPatternRequest.Builder().build(),
				GetAutoFollowPatternRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ccr.pause_auto_follow_pattern

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PauseAutoFollowPatternResponse> pauseAutoFollowPattern(
			PauseAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PauseAutoFollowPatternRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Pauses an auto-follow pattern
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-pause-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PauseAutoFollowPatternResponse> pauseAutoFollowPattern(
			Function<PauseAutoFollowPatternRequest.Builder, ObjectBuilder<PauseAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<PauseFollowResponse> pauseFollow(PauseFollowRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PauseFollowRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Pauses a follower index. The follower index will not fetch any additional
	 * operations from the leader index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PauseFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-pause-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PauseFollowResponse> pauseFollow(
			Function<PauseFollowRequest.Builder, ObjectBuilder<PauseFollowRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<PutAutoFollowPatternResponse> putAutoFollowPattern(PutAutoFollowPatternRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutAutoFollowPatternRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates a new named collection of auto-follow patterns against a specified
	 * remote cluster. Newly created indices on the remote cluster matching any of
	 * the specified patterns will be automatically configured as follower indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-put-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutAutoFollowPatternResponse> putAutoFollowPattern(
			Function<PutAutoFollowPatternRequest.Builder, ObjectBuilder<PutAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
			ResumeAutoFollowPatternRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ResumeAutoFollowPatternRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Resumes an auto-follow pattern that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeAutoFollowPatternRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-resume-auto-follow-pattern.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
			Function<ResumeAutoFollowPatternRequest.Builder, ObjectBuilder<ResumeAutoFollowPatternRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<ResumeFollowResponse> resumeFollow(ResumeFollowRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ResumeFollowRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Resumes a follower index that has been paused
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResumeFollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-resume-follow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResumeFollowResponse> resumeFollow(
			Function<ResumeFollowRequest.Builder, ObjectBuilder<ResumeFollowRequest>> fn)
			throws IOException, ElasticsearchException {
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
	public CompletableFuture<CcrStatsResponse> stats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(CcrStatsRequest._INSTANCE, CcrStatsRequest.ENDPOINT,
				this.transportOptions);
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

	public CompletableFuture<UnfollowResponse> unfollow(UnfollowRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, UnfollowRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Stops the following task associated with a follower index and removes index
	 * metadata and settings associated with cross-cluster replication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UnfollowRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-unfollow.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UnfollowResponse> unfollow(
			Function<UnfollowRequest.Builder, ObjectBuilder<UnfollowRequest>> fn)
			throws IOException, ElasticsearchException {
		return unfollow(fn.apply(new UnfollowRequest.Builder()).build());
	}

}
