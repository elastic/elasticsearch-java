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

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
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

// typedef: _types.query_dsl.TermsSetQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.TermsSetQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class TermsSetQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String minimumShouldMatch;

	@Nullable
	private final String minimumShouldMatchField;

	@Nullable
	private final Script minimumShouldMatchScript;

	private final List<FieldValue> terms;

	// ---------------------------------------------------------------------------------------------

	private TermsSetQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.minimumShouldMatchField = builder.minimumShouldMatchField;
		this.minimumShouldMatchScript = builder.minimumShouldMatchScript;
		this.terms = ApiTypeHelper.unmodifiableRequired(builder.terms, this, "terms");

	}

	public static TermsSetQuery of(Function<Builder, ObjectBuilder<TermsSetQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.TermsSet;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Specification describing number of matching terms required to return a
	 * document.
	 * <p>
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public final String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * Numeric field containing the number of matching terms required to return a
	 * document.
	 * <p>
	 * API name: {@code minimum_should_match_field}
	 */
	@Nullable
	public final String minimumShouldMatchField() {
		return this.minimumShouldMatchField;
	}

	/**
	 * Custom script containing the number of matching terms required to return a
	 * document.
	 * <p>
	 * API name: {@code minimum_should_match_script}
	 */
	@Nullable
	public final Script minimumShouldMatchScript() {
		return this.minimumShouldMatchScript;
	}

	/**
	 * Required - Array of terms you wish to find in the provided field.
	 * <p>
	 * API name: {@code terms}
	 */
	public final List<FieldValue> terms() {
		return this.terms;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.minimumShouldMatch != null) {
			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.minimumShouldMatchField != null) {
			generator.writeKey("minimum_should_match_field");
			generator.write(this.minimumShouldMatchField);

		}
		if (this.minimumShouldMatchScript != null) {
			generator.writeKey("minimum_should_match_script");
			this.minimumShouldMatchScript.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.terms)) {
			generator.writeKey("terms");
			generator.writeStartArray();
			for (FieldValue item0 : this.terms) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsSetQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TermsSetQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private String minimumShouldMatch;

		@Nullable
		private String minimumShouldMatchField;

		@Nullable
		private Script minimumShouldMatchScript;

		private List<FieldValue> terms;

		/**
		 * Specification describing number of matching terms required to return a
		 * document.
		 * <p>
		 * API name: {@code minimum_should_match}
		 */
		public final Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * Numeric field containing the number of matching terms required to return a
		 * document.
		 * <p>
		 * API name: {@code minimum_should_match_field}
		 */
		public final Builder minimumShouldMatchField(@Nullable String value) {
			this.minimumShouldMatchField = value;
			return this;
		}

		/**
		 * Custom script containing the number of matching terms required to return a
		 * document.
		 * <p>
		 * API name: {@code minimum_should_match_script}
		 */
		public final Builder minimumShouldMatchScript(@Nullable Script value) {
			this.minimumShouldMatchScript = value;
			return this;
		}

		/**
		 * Custom script containing the number of matching terms required to return a
		 * document.
		 * <p>
		 * API name: {@code minimum_should_match_script}
		 */
		public final Builder minimumShouldMatchScript(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.minimumShouldMatchScript(fn.apply(new Script.Builder()).build());
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>terms</code>.
		 */
		public final Builder terms(List<FieldValue> list) {
			this.terms = _listAddAll(this.terms, list);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds one or more values to <code>terms</code>.
		 */
		public final Builder terms(FieldValue value, FieldValue... values) {
			this.terms = _listAdd(this.terms, value, values);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all passed values to <code>terms</code>.
		 */
		public final Builder terms(String value, String... values) {
			this.terms = _listAdd(this.terms, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (String v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.terms = _listAddAll(this.terms, fieldValues);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all passed values to <code>terms</code>.
		 */
		public final Builder terms(long value, long... values) {
			this.terms = _listAdd(this.terms, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (long v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.terms = _listAddAll(this.terms, fieldValues);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all passed values to <code>terms</code>.
		 */
		public final Builder terms(double value, double... values) {
			this.terms = _listAdd(this.terms, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (double v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.terms = _listAddAll(this.terms, fieldValues);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds all passed values to <code>terms</code>.
		 */
		public final Builder terms(boolean value, boolean... values) {
			this.terms = _listAdd(this.terms, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (boolean v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.terms = _listAddAll(this.terms, fieldValues);
			return this;
		}

		/**
		 * Required - Array of terms you wish to find in the provided field.
		 * <p>
		 * API name: {@code terms}
		 * <p>
		 * Adds a value to <code>terms</code> using a builder lambda.
		 */
		public final Builder terms(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return terms(fn.apply(new FieldValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TermsSetQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsSetQuery build() {
			_checkSingleUse();

			return new TermsSetQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsSetQuery}
	 */
	public static final JsonpDeserializer<TermsSetQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermsSetQuery::setupTermsSetQueryDeserializer);

	protected static void setupTermsSetQueryDeserializer(ObjectDeserializer<TermsSetQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::minimumShouldMatchField, JsonpDeserializer.stringDeserializer(), "minimum_should_match_field");
		op.add(Builder::minimumShouldMatchScript, Script._DESERIALIZER, "minimum_should_match_script");
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "terms");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
