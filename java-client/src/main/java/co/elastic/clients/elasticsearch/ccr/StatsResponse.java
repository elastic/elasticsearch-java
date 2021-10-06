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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.Response
@JsonpDeserializable
public final class StatsResponse implements JsonpSerializable {
	private final AutoFollowStats autoFollowStats;

	private final FollowStats followStats;

	// ---------------------------------------------------------------------------------------------

	public StatsResponse(Builder builder) {

		this.autoFollowStats = Objects.requireNonNull(builder.autoFollowStats, "auto_follow_stats");
		this.followStats = Objects.requireNonNull(builder.followStats, "follow_stats");

	}

	public StatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code auto_follow_stats}
	 */
	public AutoFollowStats autoFollowStats() {
		return this.autoFollowStats;
	}

	/**
	 * Required - API name: {@code follow_stats}
	 */
	public FollowStats followStats() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<StatsResponse> {
		private AutoFollowStats autoFollowStats;

		private FollowStats followStats;

		/**
		 * Required - API name: {@code auto_follow_stats}
		 */
		public Builder autoFollowStats(AutoFollowStats value) {
			this.autoFollowStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code auto_follow_stats}
		 */
		public Builder autoFollowStats(Function<AutoFollowStats.Builder, ObjectBuilder<AutoFollowStats>> fn) {
			return this.autoFollowStats(fn.apply(new AutoFollowStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code follow_stats}
		 */
		public Builder followStats(FollowStats value) {
			this.followStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code follow_stats}
		 */
		public Builder followStats(Function<FollowStats.Builder, ObjectBuilder<FollowStats>> fn) {
			return this.followStats(fn.apply(new FollowStats.Builder()).build());
		}

		/**
		 * Builds a {@link StatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsResponse build() {

			return new StatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StatsResponse}
	 */
	public static final JsonpDeserializer<StatsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StatsResponse::setupStatsResponseDeserializer, Builder::build);

	protected static void setupStatsResponseDeserializer(DelegatingDeserializer<StatsResponse.Builder> op) {

		op.add(Builder::autoFollowStats, AutoFollowStats._DESERIALIZER, "auto_follow_stats");
		op.add(Builder::followStats, FollowStats._DESERIALIZER, "follow_stats");

	}

}
