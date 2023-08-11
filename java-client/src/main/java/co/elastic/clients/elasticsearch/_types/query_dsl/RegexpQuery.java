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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RegexpQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RegexpQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RegexpQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final Boolean caseInsensitive;

	@Nullable
	private final String flags;

	@Nullable
	private final Integer maxDeterminizedStates;

	@Nullable
	private final String rewrite;

	private final String value;

	// ---------------------------------------------------------------------------------------------

	private RegexpQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.caseInsensitive = builder.caseInsensitive;
		this.flags = builder.flags;
		this.maxDeterminizedStates = builder.maxDeterminizedStates;
		this.rewrite = builder.rewrite;
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static RegexpQuery of(Function<Builder, ObjectBuilder<RegexpQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Regexp;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Allows case insensitive matching of the regular expression value with the
	 * indexed field values when set to <code>true</code>. When <code>false</code>,
	 * case sensitivity of matching depends on the underlying field’s mapping.
	 * <p>
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public final Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	/**
	 * Enables optional operators for the regular expression.
	 * <p>
	 * API name: {@code flags}
	 */
	@Nullable
	public final String flags() {
		return this.flags;
	}

	/**
	 * Maximum number of automaton states required for the query.
	 * <p>
	 * API name: {@code max_determinized_states}
	 */
	@Nullable
	public final Integer maxDeterminizedStates() {
		return this.maxDeterminizedStates;
	}

	/**
	 * Method used to rewrite the query.
	 * <p>
	 * API name: {@code rewrite}
	 */
	@Nullable
	public final String rewrite() {
		return this.rewrite;
	}

	/**
	 * Required - Regular expression for terms you wish to find in the provided
	 * field.
	 * <p>
	 * API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.caseInsensitive != null) {
			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}
		if (this.flags != null) {
			generator.writeKey("flags");
			generator.write(this.flags);

		}
		if (this.maxDeterminizedStates != null) {
			generator.writeKey("max_determinized_states");
			generator.write(this.maxDeterminizedStates);

		}
		if (this.rewrite != null) {
			generator.writeKey("rewrite");
			generator.write(this.rewrite);

		}
		generator.writeKey("value");
		generator.write(this.value);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RegexpQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RegexpQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private Boolean caseInsensitive;

		@Nullable
		private String flags;

		@Nullable
		private Integer maxDeterminizedStates;

		@Nullable
		private String rewrite;

		private String value;

		/**
		 * Allows case insensitive matching of the regular expression value with the
		 * indexed field values when set to <code>true</code>. When <code>false</code>,
		 * case sensitivity of matching depends on the underlying field’s mapping.
		 * <p>
		 * API name: {@code case_insensitive}
		 */
		public final Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		/**
		 * Enables optional operators for the regular expression.
		 * <p>
		 * API name: {@code flags}
		 */
		public final Builder flags(@Nullable String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Maximum number of automaton states required for the query.
		 * <p>
		 * API name: {@code max_determinized_states}
		 */
		public final Builder maxDeterminizedStates(@Nullable Integer value) {
			this.maxDeterminizedStates = value;
			return this;
		}

		/**
		 * Method used to rewrite the query.
		 * <p>
		 * API name: {@code rewrite}
		 */
		public final Builder rewrite(@Nullable String value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * Required - Regular expression for terms you wish to find in the provided
		 * field.
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
		 * Builds a {@link RegexpQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RegexpQuery build() {
			_checkSingleUse();

			return new RegexpQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RegexpQuery}
	 */
	public static final JsonpDeserializer<RegexpQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RegexpQuery::setupRegexpQueryDeserializer);

	protected static void setupRegexpQueryDeserializer(ObjectDeserializer<RegexpQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::maxDeterminizedStates, JsonpDeserializer.integerDeserializer(), "max_determinized_states");
		op.add(Builder::rewrite, JsonpDeserializer.stringDeserializer(), "rewrite");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}
