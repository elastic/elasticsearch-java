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
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanFirstQuery
@JsonpDeserializable
public final class SpanFirstQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final int end;

	private final SpanQuery match;

	// ---------------------------------------------------------------------------------------------

	public SpanFirstQuery(Builder builder) {
		super(builder);

		this.end = Objects.requireNonNull(builder.end, "end");
		this.match = Objects.requireNonNull(builder.match, "match");

	}

	/**
	 * {@link SpanQuery}, {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "span_first";
	}

	/**
	 * API name: {@code end}
	 */
	public int end() {
		return this.end;
	}

	/**
	 * API name: {@code match}
	 */
	public SpanQuery match() {
		return this.match;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("end");
		generator.write(this.end);

		generator.writeKey("match");
		this.match.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanFirstQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanFirstQuery> {
		private Integer end;

		private SpanQuery match;

		/**
		 * API name: {@code end}
		 */
		public Builder end(int value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(SpanQuery value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.match(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanFirstQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanFirstQuery build() {

			return new SpanFirstQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanFirstQuery}
	 */
	public static final JsonpDeserializer<SpanFirstQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanFirstQuery::setupSpanFirstQueryDeserializer, Builder::build);

	protected static void setupSpanFirstQueryDeserializer(DelegatingDeserializer<SpanFirstQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::end, JsonpDeserializer.integerDeserializer(), "end");
		op.add(Builder::match, SpanQuery._DESERIALIZER, "match");

	}

}
