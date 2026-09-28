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
import java.lang.Boolean;
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

// typedef: _types.query_dsl.KqlQuery

/**
 * Returns documents matching a provided Kibana Query Language (KQL) expression.
 * The expression is parsed and rewritten into standard Query DSL.
 * 
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.KqlQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class KqlQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final Boolean caseInsensitive;

	@Nullable
	private final String defaultField;

	private final String query;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private KqlQuery(Builder builder) {
		super(builder);

		this.caseInsensitive = builder.caseInsensitive;
		this.defaultField = builder.defaultField;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.timeZone = builder.timeZone;

	}

	public static KqlQuery of(Function<Builder, ObjectBuilder<KqlQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Kql;
	}

	/**
	 * If <code>true</code>, performs case-insensitive matching for field names and
	 * keyword or text terms.
	 * <p>
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public final Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	/**
	 * Default field, or field pattern with wildcards, to target when a bare term
	 * does not specify a field. Defaults to the
	 * <code>index.query.default_field</code> index setting, which has a default
	 * value of <code>*</code>.
	 * <p>
	 * API name: {@code default_field}
	 */
	@Nullable
	public final String defaultField() {
		return this.defaultField;
	}

	/**
	 * Required - The KQL expression to parse.
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	/**
	 * Coordinated Universal Time (UTC) offset or IANA time zone used to interpret
	 * date literals in the expression.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.caseInsensitive != null) {
			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}
		if (this.defaultField != null) {
			generator.writeKey("default_field");
			generator.write(this.defaultField);

		}
		generator.writeKey("query");
		generator.write(this.query);

		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KqlQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<KqlQuery> {
		@Nullable
		private Boolean caseInsensitive;

		@Nullable
		private String defaultField;

		private String query;

		@Nullable
		private String timeZone;

		public Builder() {
		}
		private Builder(KqlQuery instance) {
			this.caseInsensitive = instance.caseInsensitive;
			this.defaultField = instance.defaultField;
			this.query = instance.query;
			this.timeZone = instance.timeZone;

		}
		/**
		 * If <code>true</code>, performs case-insensitive matching for field names and
		 * keyword or text terms.
		 * <p>
		 * API name: {@code case_insensitive}
		 */
		public final Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		/**
		 * Default field, or field pattern with wildcards, to target when a bare term
		 * does not specify a field. Defaults to the
		 * <code>index.query.default_field</code> index setting, which has a default
		 * value of <code>*</code>.
		 * <p>
		 * API name: {@code default_field}
		 */
		public final Builder defaultField(@Nullable String value) {
			this.defaultField = value;
			return this;
		}

		/**
		 * Required - The KQL expression to parse.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * Coordinated Universal Time (UTC) offset or IANA time zone used to interpret
		 * date literals in the expression.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KqlQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KqlQuery build() {
			_checkSingleUse();

			return new KqlQuery(this);
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
	 * Json deserializer for {@link KqlQuery}
	 */
	public static final JsonpDeserializer<KqlQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KqlQuery::setupKqlQueryDeserializer);

	protected static void setupKqlQueryDeserializer(ObjectDeserializer<KqlQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");
		op.add(Builder::defaultField, JsonpDeserializer.stringDeserializer(), "default_field");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
