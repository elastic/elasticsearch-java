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

package co.elastic.clients.elasticsearch.api.ccr;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ccr.CreateFollowIndexRequest;
import co.elastic.clients.elasticsearch.ccr.CreateFollowIndexResponse;
import co.elastic.clients.elasticsearch.ccr.DeleteAutoFollowPatternRequest;
import co.elastic.clients.elasticsearch.ccr.DeleteAutoFollowPatternResponse;
import co.elastic.clients.elasticsearch.ccr.FollowIndexStatsRequest;
import co.elastic.clients.elasticsearch.ccr.FollowIndexStatsResponse;
import co.elastic.clients.elasticsearch.ccr.FollowInfoRequest;
import co.elastic.clients.elasticsearch.ccr.FollowInfoResponse;
import co.elastic.clients.elasticsearch.ccr.ForgetFollowerIndexRequest;
import co.elastic.clients.elasticsearch.ccr.ForgetFollowerIndexResponse;
import co.elastic.clients.elasticsearch.ccr.GetAutoFollowPatternRequest;
import co.elastic.clients.elasticsearch.ccr.GetAutoFollowPatternResponse;
import co.elastic.clients.elasticsearch.ccr.PauseAutoFollowPatternRequest;
import co.elastic.clients.elasticsearch.ccr.PauseAutoFollowPatternResponse;
import co.elastic.clients.elasticsearch.ccr.PauseFollowIndexRequest;
import co.elastic.clients.elasticsearch.ccr.PauseFollowIndexResponse;
import co.elastic.clients.elasticsearch.ccr.PutAutoFollowPatternRequest;
import co.elastic.clients.elasticsearch.ccr.PutAutoFollowPatternResponse;
import co.elastic.clients.elasticsearch.ccr.ResumeAutoFollowPatternRequest;
import co.elastic.clients.elasticsearch.ccr.ResumeAutoFollowPatternResponse;
import co.elastic.clients.elasticsearch.ccr.ResumeFollowIndexRequest;
import co.elastic.clients.elasticsearch.ccr.ResumeFollowIndexResponse;
import co.elastic.clients.elasticsearch.ccr.StatsRequest;
import co.elastic.clients.elasticsearch.ccr.StatsResponse;
import co.elastic.clients.elasticsearch.ccr.UnfollowIndexRequest;
import co.elastic.clients.elasticsearch.ccr.UnfollowIndexResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the ccr namespace.
 */
public class CcrAsyncClient extends ApiClient<CcrAsyncClient> {

	public CcrAsyncClient(Transport transport) {
		super(transport, null);
	}

	public CcrAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
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
			DeleteAutoFollowPatternRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteAutoFollowPatternRequest.ENDPOINT,
				this.requestOptions);
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

	public final CompletableFuture<DeleteAutoFollowPatternResponse> deleteAutoFollowPattern(
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

	public CompletableFuture<CreateFollowIndexResponse> follow(CreateFollowIndexRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CreateFollowIndexRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<CreateFollowIndexResponse> follow(
			Function<CreateFollowIndexRequest.Builder, ObjectBuilder<CreateFollowIndexRequest>> fn) throws IOException {
		return follow(fn.apply(new CreateFollowIndexRequest.Builder()).build());
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

	public CompletableFuture<FollowInfoResponse> followInfo(FollowInfoRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FollowInfoRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<FollowInfoResponse> followInfo(
			Function<FollowInfoRequest.Builder, ObjectBuilder<FollowInfoRequest>> fn) throws IOException {
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

	public CompletableFuture<FollowIndexStatsResponse> followStats(FollowIndexStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FollowIndexStatsRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<FollowIndexStatsResponse> followStats(
			Function<FollowIndexStatsRequest.Builder, ObjectBuilder<FollowIndexStatsRequest>> fn) throws IOException {
		return followStats(fn.apply(new FollowIndexStatsRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.forget_follower

	/**
	 * Removes the follower retention leases from the leader.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-post-forget-follower.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ForgetFollowerIndexResponse> forgetFollower(ForgetFollowerIndexRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ForgetFollowerIndexRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<ForgetFollowerIndexResponse> forgetFollower(
			Function<ForgetFollowerIndexRequest.Builder, ObjectBuilder<ForgetFollowerIndexRequest>> fn)
			throws IOException {
		return forgetFollower(fn.apply(new ForgetFollowerIndexRequest.Builder()).build());
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
			throws IOException {
		return this.transport.performRequestAsync(request, GetAutoFollowPatternRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<GetAutoFollowPatternResponse> getAutoFollowPattern(
			Function<GetAutoFollowPatternRequest.Builder, ObjectBuilder<GetAutoFollowPatternRequest>> fn)
			throws IOException {
		return getAutoFollowPattern(fn.apply(new GetAutoFollowPatternRequest.Builder()).build());
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
			PauseAutoFollowPatternRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PauseAutoFollowPatternRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<PauseAutoFollowPatternResponse> pauseAutoFollowPattern(
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

	public CompletableFuture<PauseFollowIndexResponse> pauseFollow(PauseFollowIndexRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PauseFollowIndexRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<PauseFollowIndexResponse> pauseFollow(
			Function<PauseFollowIndexRequest.Builder, ObjectBuilder<PauseFollowIndexRequest>> fn) throws IOException {
		return pauseFollow(fn.apply(new PauseFollowIndexRequest.Builder()).build());
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
			throws IOException {
		return this.transport.performRequestAsync(request, PutAutoFollowPatternRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<PutAutoFollowPatternResponse> putAutoFollowPattern(
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

	public CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
			ResumeAutoFollowPatternRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ResumeAutoFollowPatternRequest.ENDPOINT,
				this.requestOptions);
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

	public final CompletableFuture<ResumeAutoFollowPatternResponse> resumeAutoFollowPattern(
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

	public CompletableFuture<ResumeFollowIndexResponse> resumeFollow(ResumeFollowIndexRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ResumeFollowIndexRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<ResumeFollowIndexResponse> resumeFollow(
			Function<ResumeFollowIndexRequest.Builder, ObjectBuilder<ResumeFollowIndexRequest>> fn) throws IOException {
		return resumeFollow(fn.apply(new ResumeFollowIndexRequest.Builder()).build());
	}

	// ----- Endpoint: ccr.stats

	/**
	 * Gets all stats related to cross-cluster replication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/ccr-get-stats.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<StatsResponse> stats() throws IOException {
		return this.transport.performRequestAsync(StatsRequest.INSTANCE, StatsRequest.ENDPOINT, this.requestOptions);
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

	public CompletableFuture<UnfollowIndexResponse> unfollow(UnfollowIndexRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UnfollowIndexRequest.ENDPOINT, this.requestOptions);
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

	public final CompletableFuture<UnfollowIndexResponse> unfollow(
			Function<UnfollowIndexRequest.Builder, ObjectBuilder<UnfollowIndexRequest>> fn) throws IOException {
		return unfollow(fn.apply(new UnfollowIndexRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #CcrAsyncClient} with specific request options.
	 */
	@Override
	public CcrAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new CcrAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #CcrAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public CcrAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
