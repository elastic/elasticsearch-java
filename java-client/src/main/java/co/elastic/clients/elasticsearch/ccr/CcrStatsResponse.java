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

import co.elastic.clients.elasticsearch.ccr.stats.AutoFollowStats;
import co.elastic.clients.elasticsearch.ccr.stats.FollowStats;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ccr.stats.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CcrStatsResponse implements JsonpSerializable {
	private final AutoFollowStats autoFollowStats;

	private final FollowStats followStats;

	// ---------------------------------------------------------------------------------------------

	private CcrStatsResponse(Builder builder) {

		this.autoFollowStats = ApiTypeHelper.requireNonNull(builder.autoFollowStats, this, "autoFollowStats");
		this.followStats = ApiTypeHelper.requireNonNull(builder.followStats, this, "followStats");

	}

	public static CcrStatsResponse of(Function<Builder, ObjectBuilder<CcrStatsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code auto_follow_stats}
	 */
	public final AutoFollowStats autoFollowStats() {
		return this.autoFollowStats;
	}

	/**
	 * Required - API name: {@code follow_stats}
	 */
	public final FollowStats followStats() {
		return this.followStats;
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

		generator.writeKey("auto_follow_stats");
		this.autoFollowStats.serialize(generator, mapper);

		generator.writeKey("follow_stats");
		this.followStats.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CcrStatsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CcrStatsResponse> {
		private AutoFollowStats autoFollowStats;

		private FollowStats followStats;

		/**
		 * Required - API name: {@code auto_follow_stats}
		 */
		public final Builder autoFollowStats(AutoFollowStats value) {
			this.autoFollowStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code auto_follow_stats}
		 */
		public final Builder autoFollowStats(Function<AutoFollowStats.Builder, ObjectBuilder<AutoFollowStats>> fn) {
			return this.autoFollowStats(fn.apply(new AutoFollowStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code follow_stats}
		 */
		public final Builder followStats(FollowStats value) {
			this.followStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code follow_stats}
		 */
		public final Builder followStats(Function<FollowStats.Builder, ObjectBuilder<FollowStats>> fn) {
			return this.followStats(fn.apply(new FollowStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CcrStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CcrStatsResponse build() {
			_checkSingleUse();

			return new CcrStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CcrStatsResponse}
	 */
	public static final JsonpDeserializer<CcrStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CcrStatsResponse::setupCcrStatsResponseDeserializer);

	protected static void setupCcrStatsResponseDeserializer(ObjectDeserializer<CcrStatsResponse.Builder> op) {

		op.add(Builder::autoFollowStats, AutoFollowStats._DESERIALIZER, "auto_follow_stats");
		op.add(Builder::followStats, FollowStats._DESERIALIZER, "follow_stats");

	}

}
