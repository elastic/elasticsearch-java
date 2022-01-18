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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.SpanTermQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SpanTermQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpanTermQuery extends QueryBase implements SpanQueryVariant, QueryVariant {
	// Single key dictionary
	private final String field;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private SpanTermQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static SpanTermQuery of(Function<Builder, ObjectBuilder<SpanTermQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SpanQuery variant kind.
	 */
	@Override
	public SpanQuery.Kind _spanQueryKind() {
		return SpanQuery.Kind.SpanTerm;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SpanTerm;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		generator.write(this.value);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanTermQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SpanTermQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		private String value;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpanTermQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpanTermQuery build() {
			_checkSingleUse();

			return new SpanTermQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpanTermQuery}
	 */
	public static final JsonpDeserializer<SpanTermQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SpanTermQuery::setupSpanTermQueryDeserializer);

	protected static void setupSpanTermQueryDeserializer(ObjectDeserializer<SpanTermQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}
