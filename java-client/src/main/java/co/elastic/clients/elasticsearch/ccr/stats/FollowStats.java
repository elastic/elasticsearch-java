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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.elasticsearch.ccr.FollowIndexStats;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.FollowStats
public final class FollowStats implements ToJsonp {
	private final List<FollowIndexStats> indices;

	// ---------------------------------------------------------------------------------------------

	protected FollowStats(Builder builder) {

		this.indices = Objects.requireNonNull(builder.indices, "indices");

	}

	/**
	 * API name: {@code indices}
	 */
	public List<FollowIndexStats> indices() {
		return this.indices;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("indices");
		generator.writeStartArray();
		for (FollowIndexStats item0 : this.indices) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FollowStats}.
	 */
	public static class Builder implements ObjectBuilder<FollowStats> {
		private List<FollowIndexStats> indices;

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<FollowIndexStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(FollowIndexStats... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(FollowIndexStats value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * Set {@link #indices(List)} to a singleton list.
		 */
		public Builder indices(Function<FollowIndexStats.Builder, ObjectBuilder<FollowIndexStats>> fn) {
			return this.indices(fn.apply(new FollowIndexStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(Function<FollowIndexStats.Builder, ObjectBuilder<FollowIndexStats>> fn) {
			return this.addIndices(fn.apply(new FollowIndexStats.Builder()).build());
		}

		/**
		 * Builds a {@link FollowStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FollowStats build() {

			return new FollowStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for FollowStats
	 */
	public static final JsonpValueParser<FollowStats> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, FollowStats::setupFollowStatsParser);

	protected static void setupFollowStatsParser(DelegatingJsonpValueParser<FollowStats.Builder> op) {

		op.add(Builder::indices, JsonpValueParser.arrayParser(FollowIndexStats.JSONP_PARSER), "indices");

	}

}
