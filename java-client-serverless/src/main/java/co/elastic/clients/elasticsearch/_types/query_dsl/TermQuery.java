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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.TermQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.TermQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	private final FieldValue value;

	@Nullable
	private final Boolean caseInsensitive;

	// ---------------------------------------------------------------------------------------------

	private TermQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.caseInsensitive = builder.caseInsensitive;

	}

	public static TermQuery of(Function<Builder, ObjectBuilder<TermQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Term;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - Term you wish to find in the provided field.
	 * <p>
	 * API name: {@code value}
	 */
	public final FieldValue value() {
		return this.value;
	}

	/**
	 * Allows ASCII case insensitive matching of the value with the indexed field
	 * values when set to <code>true</code>. When <code>false</code>, the case
	 * sensitivity of matching depends on the underlying field’s mapping.
	 * <p>
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public final Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

		if (this.caseInsensitive != null) {
			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TermQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		private FieldValue value;

		@Nullable
		private Boolean caseInsensitive;

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(FieldValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.value(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(double value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - Term you wish to find in the provided field.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(boolean value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Allows ASCII case insensitive matching of the value with the indexed field
		 * values when set to <code>true</code>. When <code>false</code>, the case
		 * sensitivity of matching depends on the underlying field’s mapping.
		 * <p>
		 * API name: {@code case_insensitive}
		 */
		public final Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermQuery build() {
			_checkSingleUse();

			return new TermQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermQuery}
	 */
	public static final JsonpDeserializer<TermQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermQuery::setupTermQueryDeserializer);

	protected static void setupTermQueryDeserializer(ObjectDeserializer<TermQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::value, FieldValue._DESERIALIZER, "value");
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}
