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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ccr.get_auto_follow_pattern.AutoFollowPatternSummary
@JsonpDeserializable
public final class AutoFollowPatternSummary implements JsonpSerializable {
	private final Boolean active;

	private final String remoteCluster;

	@Nullable
	private final String followIndexPattern;

	private final List<String> leaderIndexPatterns;

	private final List<String> leaderIndexExclusionPatterns;

	private final Integer maxOutstandingReadRequests;

	// ---------------------------------------------------------------------------------------------

	public AutoFollowPatternSummary(Builder builder) {

		this.active = Objects.requireNonNull(builder.active, "active");
		this.remoteCluster = Objects.requireNonNull(builder.remoteCluster, "remote_cluster");
		this.followIndexPattern = builder.followIndexPattern;
		this.leaderIndexPatterns = Objects.requireNonNull(builder.leaderIndexPatterns, "leader_index_patterns");
		this.leaderIndexExclusionPatterns = Objects.requireNonNull(builder.leaderIndexExclusionPatterns,
				"leader_index_exclusion_patterns");
		this.maxOutstandingReadRequests = Objects.requireNonNull(builder.maxOutstandingReadRequests,
				"max_outstanding_read_requests");

	}

	/**
	 * API name: {@code active}
	 */
	public Boolean active() {
		return this.active;
	}

	/**
	 * The remote cluster containing the leader indices to match against.
	 * <p>
	 * API name: {@code remote_cluster}
	 */
	public String remoteCluster() {
		return this.remoteCluster;
	}

	/**
	 * The name of follower index.
	 * <p>
	 * API name: {@code follow_index_pattern}
	 */
	@Nullable
	public String followIndexPattern() {
		return this.followIndexPattern;
	}

	/**
	 * An array of simple index patterns to match against indices in the remote
	 * cluster specified by the remote_cluster field.
	 * <p>
	 * API name: {@code leader_index_patterns}
	 */
	public List<String> leaderIndexPatterns() {
		return this.leaderIndexPatterns;
	}

	/**
	 * An array of simple index patterns that can be used to exclude indices from
	 * being auto-followed.
	 * <p>
	 * API name: {@code leader_index_exclusion_patterns}
	 */
	public List<String> leaderIndexExclusionPatterns() {
		return this.leaderIndexExclusionPatterns;
	}

	/**
	 * The maximum number of outstanding reads requests from the remote cluster.
	 * <p>
	 * API name: {@code max_outstanding_read_requests}
	 */
	public Integer maxOutstandingReadRequests() {
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

		generator.writeKey("leader_index_patterns");
		generator.writeStartArray();
		for (String item0 : this.leaderIndexPatterns) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("leader_index_exclusion_patterns");
		generator.writeStartArray();
		for (String item0 : this.leaderIndexExclusionPatterns) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("max_outstanding_read_requests");
		generator.write(this.maxOutstandingReadRequests);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowPatternSummary}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowPatternSummary> {
		private Boolean active;

		private String remoteCluster;

		@Nullable
		private String followIndexPattern;

		private List<String> leaderIndexPatterns;

		private List<String> leaderIndexExclusionPatterns;

		private Integer maxOutstandingReadRequests;

		/**
		 * API name: {@code active}
		 */
		public Builder active(Boolean value) {
			this.active = value;
			return this;
		}

		/**
		 * The remote cluster containing the leader indices to match against.
		 * <p>
		 * API name: {@code remote_cluster}
		 */
		public Builder remoteCluster(String value) {
			this.remoteCluster = value;
			return this;
		}

		/**
		 * The name of follower index.
		 * <p>
		 * API name: {@code follow_index_pattern}
		 */
		public Builder followIndexPattern(@Nullable String value) {
			this.followIndexPattern = value;
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public Builder leaderIndexPatterns(List<String> value) {
			this.leaderIndexPatterns = value;
			return this;
		}

		/**
		 * An array of simple index patterns to match against indices in the remote
		 * cluster specified by the remote_cluster field.
		 * <p>
		 * API name: {@code leader_index_patterns}
		 */
		public Builder leaderIndexPatterns(String... value) {
			this.leaderIndexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #leaderIndexPatterns(List)}, creating the list if
		 * needed.
		 */
		public Builder addLeaderIndexPatterns(String value) {
			if (this.leaderIndexPatterns == null) {
				this.leaderIndexPatterns = new ArrayList<>();
			}
			this.leaderIndexPatterns.add(value);
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public Builder leaderIndexExclusionPatterns(List<String> value) {
			this.leaderIndexExclusionPatterns = value;
			return this;
		}

		/**
		 * An array of simple index patterns that can be used to exclude indices from
		 * being auto-followed.
		 * <p>
		 * API name: {@code leader_index_exclusion_patterns}
		 */
		public Builder leaderIndexExclusionPatterns(String... value) {
			this.leaderIndexExclusionPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #leaderIndexExclusionPatterns(List)}, creating the list
		 * if needed.
		 */
		public Builder addLeaderIndexExclusionPatterns(String value) {
			if (this.leaderIndexExclusionPatterns == null) {
				this.leaderIndexExclusionPatterns = new ArrayList<>();
			}
			this.leaderIndexExclusionPatterns.add(value);
			return this;
		}

		/**
		 * The maximum number of outstanding reads requests from the remote cluster.
		 * <p>
		 * API name: {@code max_outstanding_read_requests}
		 */
		public Builder maxOutstandingReadRequests(Integer value) {
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
