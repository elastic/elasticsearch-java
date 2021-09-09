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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PrefixQuery
public final class PrefixQuery extends QueryBase {
	@Nullable
	private final String rewrite;

	private final String value;

	@Nullable
	private final Boolean caseInsensitive;

	// ---------------------------------------------------------------------------------------------

	protected PrefixQuery(Builder builder) {
		super(builder);
		this.rewrite = builder.rewrite;
		this.value = Objects.requireNonNull(builder.value, "value");
		this.caseInsensitive = builder.caseInsensitive;

	}

	/**
	 * API name: {@code rewrite}
	 */
	@Nullable
	public String rewrite() {
		return this.rewrite;
	}

	/**
	 * API name: {@code value}
	 */
	public String value() {
		return this.value;
	}

	/**
	 * API name: {@code case_insensitive}
	 */
	@Nullable
	public Boolean caseInsensitive() {
		return this.caseInsensitive;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.rewrite != null) {

			generator.writeKey("rewrite");
			generator.write(this.rewrite);

		}

		generator.writeKey("value");
		generator.write(this.value);

		if (this.caseInsensitive != null) {

			generator.writeKey("case_insensitive");
			generator.write(this.caseInsensitive);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PrefixQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<PrefixQuery> {
		@Nullable
		private String rewrite;

		private String value;

		@Nullable
		private Boolean caseInsensitive;

		/**
		 * API name: {@code rewrite}
		 */
		public Builder rewrite(@Nullable String value) {
			this.rewrite = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code case_insensitive}
		 */
		public Builder caseInsensitive(@Nullable Boolean value) {
			this.caseInsensitive = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PrefixQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PrefixQuery build() {

			return new PrefixQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PrefixQuery
	 */
	public static final JsonpDeserializer<PrefixQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PrefixQuery::setupPrefixQueryDeserializer);

	protected static void setupPrefixQueryDeserializer(DelegatingDeserializer<PrefixQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::rewrite, JsonpDeserializer.stringDeserializer(), "rewrite");
		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");
		op.add(Builder::caseInsensitive, JsonpDeserializer.booleanDeserializer(), "case_insensitive");

	}

}
