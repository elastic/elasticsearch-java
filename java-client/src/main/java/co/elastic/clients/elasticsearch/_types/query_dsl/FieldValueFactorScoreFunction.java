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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FieldValueFactorScoreFunction
public final class FieldValueFactorScoreFunction extends ScoreFunctionBase {
	private final String field;

	@Nullable
	private final Number factor;

	@Nullable
	private final Number missing;

	@Nullable
	private final JsonValue modifier;

	// ---------------------------------------------------------------------------------------------

	protected FieldValueFactorScoreFunction(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.factor = builder.factor;
		this.missing = builder.missing;
		this.modifier = builder.modifier;

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code factor}
	 */
	@Nullable
	public Number factor() {
		return this.factor;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public Number missing() {
		return this.missing;
	}

	/**
	 * API name: {@code modifier}
	 */
	@Nullable
	public JsonValue modifier() {
		return this.modifier;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.factor != null) {

			generator.writeKey("factor");
			generator.write(this.factor.doubleValue());

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.write(this.missing.doubleValue());

		}
		if (this.modifier != null) {

			generator.writeKey("modifier");
			generator.write(this.modifier);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldValueFactorScoreFunction}.
	 */
	public static class Builder extends ScoreFunctionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FieldValueFactorScoreFunction> {
		private String field;

		@Nullable
		private Number factor;

		@Nullable
		private Number missing;

		@Nullable
		private JsonValue modifier;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code factor}
		 */
		public Builder factor(@Nullable Number value) {
			this.factor = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable Number value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code modifier}
		 */
		public Builder modifier(@Nullable JsonValue value) {
			this.modifier = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldValueFactorScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldValueFactorScoreFunction build() {

			return new FieldValueFactorScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldValueFactorScoreFunction
	 */
	public static final JsonpDeserializer<FieldValueFactorScoreFunction> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldValueFactorScoreFunction::setupFieldValueFactorScoreFunctionDeserializer);

	protected static void setupFieldValueFactorScoreFunctionDeserializer(
			DelegatingDeserializer<FieldValueFactorScoreFunction.Builder> op) {
		ScoreFunctionBase.setupScoreFunctionBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::factor, JsonpDeserializer.numberDeserializer(), "factor");
		op.add(Builder::missing, JsonpDeserializer.numberDeserializer(), "missing");
		op.add(Builder::modifier, JsonpDeserializer.jsonValueDeserializer(), "modifier");

	}

}
