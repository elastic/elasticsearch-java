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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.Hyperparameter
public final class Hyperparameter implements ToJsonp {
	@Nullable
	private final Number absoluteImportance;

	private final String name;

	@Nullable
	private final Number relativeImportance;

	private final Boolean supplied;

	private final Number value;

	// ---------------------------------------------------------------------------------------------

	protected Hyperparameter(Builder builder) {

		this.absoluteImportance = builder.absoluteImportance;
		this.name = Objects.requireNonNull(builder.name, "name");
		this.relativeImportance = builder.relativeImportance;
		this.supplied = Objects.requireNonNull(builder.supplied, "supplied");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * A positive number showing how much the parameter influences the variation of
	 * the loss function. For hyperparameters with values that are not specified by
	 * the user but tuned during hyperparameter optimization.
	 * <p>
	 * API name: {@code absolute_importance}
	 */
	@Nullable
	public Number absoluteImportance() {
		return this.absoluteImportance;
	}

	/**
	 * Name of the hyperparameter.
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * A number between 0 and 1 showing the proportion of influence on the variation
	 * of the loss function among all tuned hyperparameters. For hyperparameters
	 * with values that are not specified by the user but tuned during
	 * hyperparameter optimization.
	 * <p>
	 * API name: {@code relative_importance}
	 */
	@Nullable
	public Number relativeImportance() {
		return this.relativeImportance;
	}

	/**
	 * Indicates if the hyperparameter is specified by the user (true) or optimized
	 * (false).
	 * <p>
	 * API name: {@code supplied}
	 */
	public Boolean supplied() {
		return this.supplied;
	}

	/**
	 * The value of the hyperparameter, either optimized or specified by the user.
	 * <p>
	 * API name: {@code value}
	 */
	public Number value() {
		return this.value;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.absoluteImportance != null) {

			generator.writeKey("absolute_importance");
			generator.write(this.absoluteImportance.doubleValue());

		}

		generator.writeKey("name");
		generator.write(this.name);

		if (this.relativeImportance != null) {

			generator.writeKey("relative_importance");
			generator.write(this.relativeImportance.doubleValue());

		}

		generator.writeKey("supplied");
		generator.write(this.supplied);

		generator.writeKey("value");
		generator.write(this.value.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hyperparameter}.
	 */
	public static class Builder implements ObjectBuilder<Hyperparameter> {
		@Nullable
		private Number absoluteImportance;

		private String name;

		@Nullable
		private Number relativeImportance;

		private Boolean supplied;

		private Number value;

		/**
		 * A positive number showing how much the parameter influences the variation of
		 * the loss function. For hyperparameters with values that are not specified by
		 * the user but tuned during hyperparameter optimization.
		 * <p>
		 * API name: {@code absolute_importance}
		 */
		public Builder absoluteImportance(@Nullable Number value) {
			this.absoluteImportance = value;
			return this;
		}

		/**
		 * Name of the hyperparameter.
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * A number between 0 and 1 showing the proportion of influence on the variation
		 * of the loss function among all tuned hyperparameters. For hyperparameters
		 * with values that are not specified by the user but tuned during
		 * hyperparameter optimization.
		 * <p>
		 * API name: {@code relative_importance}
		 */
		public Builder relativeImportance(@Nullable Number value) {
			this.relativeImportance = value;
			return this;
		}

		/**
		 * Indicates if the hyperparameter is specified by the user (true) or optimized
		 * (false).
		 * <p>
		 * API name: {@code supplied}
		 */
		public Builder supplied(Boolean value) {
			this.supplied = value;
			return this;
		}

		/**
		 * The value of the hyperparameter, either optimized or specified by the user.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Number value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link Hyperparameter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hyperparameter build() {

			return new Hyperparameter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Hyperparameter
	 */
	public static final JsonpDeserializer<Hyperparameter> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Hyperparameter::setupHyperparameterDeserializer);

	protected static void setupHyperparameterDeserializer(DelegatingDeserializer<Hyperparameter.Builder> op) {

		op.add(Builder::absoluteImportance, JsonpDeserializer.numberDeserializer(), "absolute_importance");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::relativeImportance, JsonpDeserializer.numberDeserializer(), "relative_importance");
		op.add(Builder::supplied, JsonpDeserializer.booleanDeserializer(), "supplied");
		op.add(Builder::value, JsonpDeserializer.numberDeserializer(), "value");

	}

}
