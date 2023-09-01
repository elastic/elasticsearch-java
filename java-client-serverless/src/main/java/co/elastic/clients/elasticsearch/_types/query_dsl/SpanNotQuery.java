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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanNotQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SpanNotQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanNotQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	@Nullable
	private final Integer dist;

	private final SpanQuery exclude;

	private final SpanQuery include;

	@Nullable
	private final Integer post;

	@Nullable
	private final Integer pre;

	// ---------------------------------------------------------------------------------------------

	private SpanNotQuery(Builder builder) {
		super(builder);

		this.dist = builder.dist;
		this.exclude = ApiTypeHelper.requireNonNull(builder.exclude, this, "exclude");
		this.include = ApiTypeHelper.requireNonNull(builder.include, this, "include");
		this.post = builder.post;
		this.pre = builder.pre;

	}

	public static SpanNotQuery of(Function<Builder, ObjectBuilder<SpanNotQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanNot;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanNot;
	}

	/**
	 * The number of tokens from within the include span that can’t have overlap
	 * with the exclude span. Equivalent to setting both <code>pre</code> and
	 * <code>post</code>.
	 * <p>
	 * API name: {@code dist}
	 */
	@Nullable
	public final Integer dist() {
		return this.dist;
	}

	/**
	 * Required - Span query whose matches must not overlap those returned.
	 * <p>
	 * API name: {@code exclude}
	 */
	public final SpanQuery exclude() {
		return this.exclude;
	}

	/**
	 * Required - Span query whose matches are filtered.
	 * <p>
	 * API name: {@code include}
	 */
	public final SpanQuery include() {
		return this.include;
	}

	/**
	 * The number of tokens after the include span that can’t have overlap with the
	 * exclude span.
	 * <p>
	 * API name: {@code post}
	 */
	@Nullable
	public final Integer post() {
		return this.post;
	}

	/**
	 * The number of tokens before the include span that can’t have overlap with the
	 * exclude span.
	 * <p>
	 * API name: {@code pre}
	 */
	@Nullable
	public final Integer pre() {
		return this.pre;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.dist != null) {
			generator.writeKey("dist");
			generator.write(this.dist);

		}
		generator.writeKey("exclude");
		this.exclude.serialize(generator, mapper);

		generator.writeKey("include");
		this.include.serialize(generator, mapper);

		if (this.post != null) {
			generator.writeKey("post");
			generator.write(this.post);

		}
		if (this.pre != null) {
			generator.writeKey("pre");
			generator.write(this.pre);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanNotQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanNotQuery> {
		@Nullable
		private Integer dist;

		private SpanQuery exclude;

		private SpanQuery include;

		@Nullable
		private Integer post;

		@Nullable
		private Integer pre;

		/**
		 * The number of tokens from within the include span that can’t have overlap
		 * with the exclude span. Equivalent to setting both <code>pre</code> and
		 * <code>post</code>.
		 * <p>
		 * API name: {@code dist}
		 */
		public final Builder dist(@Nullable Integer value) {
			this.dist = value;
			return this;
		}

		/**
		 * Required - Span query whose matches must not overlap those returned.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(SpanQuery value) {
			this.exclude = value;
			return this;
		}

		/**
		 * Required - Span query whose matches must not overlap those returned.
		 * <p>
		 * API name: {@code exclude}
		 */
		public final Builder exclude(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.exclude(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * Required - Span query whose matches are filtered.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(SpanQuery value) {
			this.include = value;
			return this;
		}

		/**
		 * Required - Span query whose matches are filtered.
		 * <p>
		 * API name: {@code include}
		 */
		public final Builder include(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.include(fn.apply(new SpanQuery.Builder()).build());
		}

		/**
		 * The number of tokens after the include span that can’t have overlap with the
		 * exclude span.
		 * <p>
		 * API name: {@code post}
		 */
		public final Builder post(@Nullable Integer value) {
			this.post = value;
			return this;
		}

		/**
		 * The number of tokens before the include span that can’t have overlap with the
		 * exclude span.
		 * <p>
		 * API name: {@code pre}
		 */
		public final Builder pre(@Nullable Integer value) {
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
			_checkSingleUse();

			return new SpanNotQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanNotQuery}
	 */
	public static final JsonpDeserializer<SpanNotQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanNotQuery::setupSpanNotQueryDeserializer);

	protected static void setupSpanNotQueryDeserializer(ObjectDeserializer<SpanNotQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::dist, JsonpDeserializer.integerDeserializer(), "dist");
		op.add(Builder::exclude, SpanQuery._DESERIALIZER, "exclude");
		op.add(Builder::include, SpanQuery._DESERIALIZER, "include");
		op.add(Builder::post, JsonpDeserializer.integerDeserializer(), "post");
		op.add(Builder::pre, JsonpDeserializer.integerDeserializer(), "pre");

	}

}
