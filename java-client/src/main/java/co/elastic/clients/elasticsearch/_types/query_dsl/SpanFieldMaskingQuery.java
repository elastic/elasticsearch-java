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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanFieldMaskingQuery
@JsonpDeserializable
public class SpanFieldMaskingQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	private final String field;

	private final SpanQuery query;

	// ---------------------------------------------------------------------------------------------

	private SpanFieldMaskingQuery(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.query = ModelTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static SpanFieldMaskingQuery of(Function<Builder, ObjectBuilder<SpanFieldMaskingQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link SpanQuery}, {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "field_masking_span";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final SpanQuery query() {
		return this.query;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanFieldMaskingQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SpanFieldMaskingQuery> {
		private String field;

		private SpanQuery query;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(SpanQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<SpanQuery.Builder, ObjectBuilder<SpanQuery>> fn) {
			return this.query(fn.apply(new SpanQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanFieldMaskingQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanFieldMaskingQuery build() {
			_checkSingleUse();

			return new SpanFieldMaskingQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanFieldMaskingQuery}
	 */
	public static final JsonpDeserializer<SpanFieldMaskingQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SpanFieldMaskingQuery::setupSpanFieldMaskingQueryDeserializer, Builder::build);

	protected static void setupSpanFieldMaskingQueryDeserializer(
			DelegatingDeserializer<SpanFieldMaskingQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::query, SpanQuery._DESERIALIZER, "query");

	}

}
