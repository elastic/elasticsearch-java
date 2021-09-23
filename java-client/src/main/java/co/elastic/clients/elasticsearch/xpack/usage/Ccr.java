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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Ccr
public final class Ccr extends Base {
	private final Number autoFollowPatternsCount;

	private final Number followerIndicesCount;

	// ---------------------------------------------------------------------------------------------

	public Ccr(Builder builder) {
		super(builder);

		this.autoFollowPatternsCount = Objects.requireNonNull(builder.autoFollowPatternsCount,
				"auto_follow_patterns_count");
		this.followerIndicesCount = Objects.requireNonNull(builder.followerIndicesCount, "follower_indices_count");

	}

	/**
	 * API name: {@code auto_follow_patterns_count}
	 */
	public Number autoFollowPatternsCount() {
		return this.autoFollowPatternsCount;
	}

	/**
	 * API name: {@code follower_indices_count}
	 */
	public Number followerIndicesCount() {
		return this.followerIndicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("auto_follow_patterns_count");
		generator.write(this.autoFollowPatternsCount.doubleValue());

		generator.writeKey("follower_indices_count");
		generator.write(this.followerIndicesCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ccr}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Ccr> {
		private Number autoFollowPatternsCount;

		private Number followerIndicesCount;

		/**
		 * API name: {@code auto_follow_patterns_count}
		 */
		public Builder autoFollowPatternsCount(Number value) {
			this.autoFollowPatternsCount = value;
			return this;
		}

		/**
		 * API name: {@code follower_indices_count}
		 */
		public Builder followerIndicesCount(Number value) {
			this.followerIndicesCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Ccr}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Ccr build() {

			return new Ccr(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Ccr}
	 */
	public static final JsonpDeserializer<Ccr> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Ccr::setupCcrDeserializer);

	protected static void setupCcrDeserializer(DelegatingDeserializer<Ccr.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::autoFollowPatternsCount, JsonpDeserializer.numberDeserializer(), "auto_follow_patterns_count");
		op.add(Builder::followerIndicesCount, JsonpDeserializer.numberDeserializer(), "follower_indices_count");

	}

}
