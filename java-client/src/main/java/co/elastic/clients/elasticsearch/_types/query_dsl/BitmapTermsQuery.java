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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.query_dsl.BitmapTermsQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.BitmapTermsQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class BitmapTermsQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private BitmapTermsQuery(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static BitmapTermsQuery of(Function<Builder, ObjectBuilder<BitmapTermsQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.BitmapTerms;
	}

	/**
	 * Required - The name of the field to search against. It must be an
	 * <code>integer</code> or a <code>long</code> field with <code>index</code>
	 * enabled.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The values to match, as a base64-encoded serialized roaring bitmap
	 * in little-endian byte order. The type of the field determines the expected
	 * format: an <code>integer</code> field expects a 32-bit roaring bitmap, and a
	 * <code>long</code> field expects a 64-bit roaring bitmap in the portable
	 * format. The bitmap can only contain non-negative values: from <code>0</code>
	 * to <code>2^31 - 1</code> for an <code>integer</code> field and from
	 * <code>0</code> to <code>2^63 - 1</code> for a <code>long</code> field.
	 * <p>
	 * API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BitmapTermsQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<BitmapTermsQuery> {
		private String field;

		private String value;

		public Builder() {
		}
		private Builder(BitmapTermsQuery instance) {
			super(instance);
			this.field = instance.field;
			this.value = instance.value;

		}
		/**
		 * Required - The name of the field to search against. It must be an
		 * <code>integer</code> or a <code>long</code> field with <code>index</code>
		 * enabled.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - The values to match, as a base64-encoded serialized roaring bitmap
		 * in little-endian byte order. The type of the field determines the expected
		 * format: an <code>integer</code> field expects a 32-bit roaring bitmap, and a
		 * <code>long</code> field expects a 64-bit roaring bitmap in the portable
		 * format. The bitmap can only contain non-negative values: from <code>0</code>
		 * to <code>2^31 - 1</code> for an <code>integer</code> field and from
		 * <code>0</code> to <code>2^63 - 1</code> for a <code>long</code> field.
		 * <p>
		 * API name: {@code value}
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
		 * Builds a {@link BitmapTermsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BitmapTermsQuery build() {
			_checkSingleUse();

			return new BitmapTermsQuery(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BitmapTermsQuery}
	 */
	public static final JsonpDeserializer<BitmapTermsQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BitmapTermsQuery::setupBitmapTermsQueryDeserializer);

	protected static void setupBitmapTermsQueryDeserializer(ObjectDeserializer<BitmapTermsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
