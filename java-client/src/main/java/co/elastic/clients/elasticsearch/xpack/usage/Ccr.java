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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.Ccr
@JsonpDeserializable
public final class Ccr extends Base {
	private final int autoFollowPatternsCount;

	private final int followerIndicesCount;

	// ---------------------------------------------------------------------------------------------

	public Ccr(Builder builder) {
		super(builder);

		this.autoFollowPatternsCount = Objects.requireNonNull(builder.autoFollowPatternsCount,
				"auto_follow_patterns_count");
		this.followerIndicesCount = Objects.requireNonNull(builder.followerIndicesCount, "follower_indices_count");

	}

	public Ccr(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code auto_follow_patterns_count}
	 */
	public int autoFollowPatternsCount() {
		return this.autoFollowPatternsCount;
	}

	/**
	 * Required - API name: {@code follower_indices_count}
	 */
	public int followerIndicesCount() {
		return this.followerIndicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("auto_follow_patterns_count");
		generator.write(this.autoFollowPatternsCount);

		generator.writeKey("follower_indices_count");
		generator.write(this.followerIndicesCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Ccr}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Ccr> {
		private Integer autoFollowPatternsCount;

		private Integer followerIndicesCount;

		/**
		 * Required - API name: {@code auto_follow_patterns_count}
		 */
		public Builder autoFollowPatternsCount(int value) {
			this.autoFollowPatternsCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code follower_indices_count}
		 */
		public Builder followerIndicesCount(int value) {
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
	public static final JsonpDeserializer<Ccr> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Ccr::setupCcrDeserializer, Builder::build);

	protected static void setupCcrDeserializer(DelegatingDeserializer<Ccr.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::autoFollowPatternsCount, JsonpDeserializer.integerDeserializer(), "auto_follow_patterns_count");
		op.add(Builder::followerIndicesCount, JsonpDeserializer.integerDeserializer(), "follower_indices_count");

	}

}
