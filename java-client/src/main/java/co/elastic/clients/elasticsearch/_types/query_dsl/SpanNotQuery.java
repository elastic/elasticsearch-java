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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanNotQuery
public final class SpanNotQuery extends QueryBase implements SpanQuery, Query {
	@Nullable
	private final Number dist;

	private final SpanQuery exclude;

	private final SpanQuery include;

	@Nullable
	private final Number post;

	@Nullable
	private final Number pre;

	// ---------------------------------------------------------------------------------------------

	public SpanNotQuery(Builder builder) {
		super(builder);

		this.dist = builder.dist;
		this.exclude = Objects.requireNonNull(builder.exclude, "exclude");
		this.include = Objects.requireNonNull(builder.include, "include");
		this.post = builder.post;
		this.pre = builder.pre;

	}

	/**
	 * {@link SpanQuery}, {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "span_not";
	}

	/**
	 * API name: {@code dist}
	 */
	@Nullable
	public Number dist() {
		return this.dist;
	}

	/**
	 * API name: {@code exclude}
	 */
	public SpanQuery exclude() {
		return this.exclude;
	}

	/**
	 * API name: {@code include}
	 */
	public SpanQuery include() {
		return this.include;
	}

	/**
	 * API name: {@code post}
	 */
	@Nullable
	public Number post() {
		return this.post;
	}

	/**
	 * API name: {@code pre}
	 */
	@Nullable
	public Number pre() {
		return this.pre;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);
		if (this.dist != null) {

			generator.writeKey("dist");
			generator.write(this.dist.doubleValue());

		}

		generator.writeKey("exclude");
		this.exclude.serialize(generator, mapper);

		generator.writeKey("include");
		this.include.serialize(generator, mapper);

		if (this.post != null) {

			generator.writeKey("post");
			generator.write(this.post.doubleValue());

		}
		if (this.pre != null) {

			generator.writeKey("pre");
			generator.write(this.pre.doubleValue());

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanNotQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanNotQuery> {
		@Nullable
		private Number dist;

		private SpanQuery exclude;

		private SpanQuery include;

		@Nullable
		private Number post;

		@Nullable
		private Number pre;

		/**
		 * API name: {@code dist}
		 */
		public Builder dist(@Nullable Number value) {
			this.dist = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public Builder exclude(SpanQuery value) {
			this.exclude = value;
			return this;
		}

		/**
		 * API name: {@code exclude}
		 */
		public Builder exclude(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.exclude(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(SpanQuery value) {
			this.include = value;
			return this;
		}

		/**
		 * API name: {@code include}
		 */
		public Builder include(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.include(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * API name: {@code post}
		 */
		public Builder post(@Nullable Number value) {
			this.post = value;
			return this;
		}

		/**
		 * API name: {@code pre}
		 */
		public Builder pre(@Nullable Number value) {
			this.pre = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanNotQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanNotQuery build() {

			return new SpanNotQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<SpanNotQuery.Builder, SpanNotQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(SpanNotQuery::setupSpanNotQueryDeserializer);

	protected static void setupSpanNotQueryDeserializer(DelegatingDeserializer<SpanNotQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::dist, JsonpDeserializer.numberDeserializer(), "dist");
		op.add(Builder::exclude, SpanQuery.DESERIALIZER, "exclude");
		op.add(Builder::include, SpanQuery.DESERIALIZER, "include");
		op.add(Builder::post, JsonpDeserializer.numberDeserializer(), "post");
		op.add(Builder::pre, JsonpDeserializer.numberDeserializer(), "pre");

	}

}
