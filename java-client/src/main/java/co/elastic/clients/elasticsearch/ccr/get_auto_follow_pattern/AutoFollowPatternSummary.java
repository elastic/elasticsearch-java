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

package co.elastic.clients.elasticsearch.ccr.get_auto_follow_pattern;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.get_auto_follow_pattern.AutoFollowPatternSummary
@JsonpDeserializable
public class AutoFollowPatternSummary implements JsonpSerializable {
	private final boolean active;

	private final String remoteCluster;

	@Nullable
	private final String followIndexPattern;

	private final List<String> leaderIndexPatterns;

	private final List<String> leaderIndexExclusionPatterns;

	private final int maxOutstandingReadRequests;

	// ---------------------------------------------------------------------------------------------

	private AutoFollowPatternSummary(Builder builder) {

		this.active = ModelTypeHelper.requireNonNull(builder.active, this, "active");
		this.remoteCluster = ModelTypeHelper.requireNonNull(builder.remoteCluster, this, "remoteCluster");
		this.followIndexPattern = builder.followIndexPattern;
		this.leaderIndexPatterns = ModelTypeHelper.unmodifiableRequired(builder.leaderIndexPatterns, this,
				"leaderIndexPatterns");
		this.leaderIndexExclusionPatterns = ModelTypeHelper.unmodifiableRequired(builder.leaderIndexExclusionPatterns,
				this, "leaderIndexExclusionPatterns");
		this.maxOutstandingReadRequests = ModelTypeHelper.requireNonNull(builder.maxOutstandingReadRequests, this,
				"maxOutstandingReadRequests");

	}

	public static AutoFollowPatternSummary of(Function<Builder, ObjectBuilder<AutoFollowPatternSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active}
	 */
	public final boolean active() {
		return this.active;
	}

	/**
	 * Required - The remote cluster containing the leader indices to match against.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public final String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * The name of follower index.
	 * <p>
	 * API name: {@code follow_index_pattern}
	 */
	@Nullable
	public final String followIndexPattern() {
		return this.followIndexPattern;
	}

	/**
	 * Required - An array of simple index patterns to match against indices in the
	 * remote cluster specified by the remote_cluster field.
	 * <p>
	 * API name: {@code leader_index_patterns}
	 */
	public final List<String> leaderIndexPatterns() {
		return this.leaderIndexPatterns;
	}

	/**
	 * Required - An array of simple index patterns that can be used to exclude
	 * indices from being auto-followed.
	 * <p>
	 * API name: {@code leader_index_exclusion_patterns}
	 */
	public final List<String> leaderIndexExclusionPatterns() {
		return this.leaderIndexExclusionPatterns;
	}

	/**
	 * Required - The maximum number of outstanding reads requests from the remote
	 * cluster.
	 * <p>
	 * API name: {@code max_outstanding_read_requests}
	 */
	public final int maxOutstandingReadRequests() {
		return this.maxOutstandingReadRequests;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("active");
		generator.write(this.active);

		generator.writeKey("remote_cluster");
		generator.write(this.remoteCluster);

		if (this.followIndexPattern != null) {
			generator.writeKey("follow_index_pattern");
			generator.write(this.followIndexPattern);

		}
		if (ModelTypeHelper.isDefined(this.leaderIndexPatterns)) {
			generator.writeKey("leader_index_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.leaderIndexExclusionPatterns)) {
			generator.writeKey("leader_index_exclusion_patterns");
			generator.writeStartArray();
			for (String item0 : this.leaderIndexExclusionPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("max_outstanding_read_requests");
		generator.write(this.maxOutstandingReadRequests);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowPatternSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<AutoFollowPatternSummary> {
		private Boolean active;

		private String remoteCluster;

		@Nullable
		private String followIndexPattern;

		private List<String> leaderIndexPatterns;

		private List<String> leaderIndexExclusionPatterns;

		private Integer maxOutstandingReadRequests;

		/**
		 * Required - API name: {@code active}
		 */
		public final Builder active(boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * Required - The remote cluster containing the leader indices to match against.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public final Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * The name of follower index.
		 * <p>
		 * API name: {@code follow_index_pattern}
		 */
		public final Builder followIndexPattern(@Nullable String value) {
			this.followIndexPattern = value;
			return this;
		}

		/**
		 * Required - An array of simple index patterns to match against indices in the
		 * remote cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public final Builder leaderIndexPatterns(List<String> value) {
			this.leaderIndexPatterns = value;
			return this;
		}

		/**
		 * Required - An array of simple index patterns to match against indices in the
		 * remote cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public final Builder leaderIndexPatterns(String... value) {
			this.leaderIndexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - An array of simple index patterns that can be used to exclude
		 * indices from being auto-followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public final Builder leaderIndexExclusionPatterns(List<String> value) {
			this.leaderIndexExclusionPatterns = value;
			return this;
		}

		/**
		 * Required - An array of simple index patterns that can be used to exclude
		 * indices from being auto-followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public final Builder leaderIndexExclusionPatterns(String... value) {
			this.leaderIndexExclusionPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The maximum number of outstanding reads requests from the remote
		 * cluster.
		 * <p>
		 * API name: {@code max_outstanding_read_requests}
		 */
		public final Builder maxOutstandingReadRequests(int value) {
			this.maxOutstandingReadRequests = value;
			return this;
		}

		/**
		 * Builds a {@link AutoFollowPatternSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowPatternSummary build() {
			_checkSingleUse();

			return new AutoFollowPatternSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowPatternSummary}
	 */
	public static final JsonpDeserializer<AutoFollowPatternSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoFollowPatternSummary::setupAutoFollowPatternSummaryDeserializer, Builder::build);

	protected static void setupAutoFollowPatternSummaryDeserializer(
			DelegatingDeserializer<AutoFollowPatternSummary.Builder> op) {

		op.add(Builder::active, JsonpDeserializer.booleanDeserializer(), "active");
		op.add(Builder::remoteCluster, JsonpDeserializer.stringDeserializer(), "remote_cluster");
		op.add(Builder::followIndexPattern, JsonpDeserializer.stringDeserializer(), "follow_index_pattern");
		op.add(Builder::leaderIndexPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "leader_index_patterns");
		op.add(Builder::leaderIndexExclusionPatterns,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"leader_index_exclusion_patterns");
		op.add(Builder::maxOutstandingReadRequests, JsonpDeserializer.integerDeserializer(),
				"max_outstanding_read_requests");

	}

}
