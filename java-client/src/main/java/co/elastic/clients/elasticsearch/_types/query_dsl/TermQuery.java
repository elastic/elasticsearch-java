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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.TermQuery
@JsonpDeserializable
public class TermQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	private final String value;

	@Nullable
	private final Boolean caseInsensitive;

	// ---------------------------------------------------------------------------------------------

	private TermQuery(Builder builder) {
		super(builder);
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");

		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");
		this.caseInsensitive = builder.caseInsensitive;

	}

	public static TermQuery of(Function<Builder, ObjectBuilder<TermQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "term";
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

	/**
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
		generator.write(this.value);

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

		private String value;

		@Nullable
		private Boolean caseInsensitive;

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
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
			TermQuery::setupTermQueryDeserializer, Builder::build);

	protected static void setupTermQueryDeserializer(DelegatingDeserializer<TermQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());
		op.shortcutProperty("value");

	}

}
