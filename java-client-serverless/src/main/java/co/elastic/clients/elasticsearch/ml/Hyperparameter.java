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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Hyperparameter

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Hyperparameter">API
 *      specification</a>
 */
@JsonpDeserializable
public class Hyperparameter implements JsonpSerializable {
	@Nullable
	private final Double absoluteImportance;

	private final String name;

	@Nullable
	private final Double relativeImportance;

	private final boolean supplied;

	private final double value;

	// ---------------------------------------------------------------------------------------------

	private Hyperparameter(Builder builder) {

		this.absoluteImportance = builder.absoluteImportance;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.relativeImportance = builder.relativeImportance;
		this.supplied = ApiTypeHelper.requireNonNull(builder.supplied, this, "supplied");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static Hyperparameter of(Function<Builder, ObjectBuilder<Hyperparameter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A positive number showing how much the parameter influences the variation of
	 * the loss function. For hyperparameters with values that are not specified by
	 * the user but tuned during hyperparameter optimization.
	 * <p>
	 * API name: {@code absolute_importance}
	 */
	@Nullable
	public final Double absoluteImportance() {
		return this.absoluteImportance;
	}

	/**
	 * Required - Name of the hyperparameter.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
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
	public final Double relativeImportance() {
		return this.relativeImportance;
	}

	/**
	 * Required - Indicates if the hyperparameter is specified by the user (true) or
	 * optimized (false).
	 * <p>
	 * API name: {@code supplied}
	 */
	public final boolean supplied() {
		return this.supplied;
	}

	/**
	 * Required - The value of the hyperparameter, either optimized or specified by
	 * the user.
	 * <p>
	 * API name: {@code value}
	 */
	public final double value() {
		return this.value;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.absoluteImportance != null) {
			generator.writeKey("absolute_importance");
			generator.write(this.absoluteImportance);

		}
		generator.writeKey("name");
		generator.write(this.name);

		if (this.relativeImportance != null) {
			generator.writeKey("relative_importance");
			generator.write(this.relativeImportance);

		}
		generator.writeKey("supplied");
		generator.write(this.supplied);

		generator.writeKey("value");
		generator.write(this.value);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Hyperparameter}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Hyperparameter> {
		@Nullable
		private Double absoluteImportance;

		private String name;

		@Nullable
		private Double relativeImportance;

		private Boolean supplied;

		private Double value;

		/**
		 * A positive number showing how much the parameter influences the variation of
		 * the loss function. For hyperparameters with values that are not specified by
		 * the user but tuned during hyperparameter optimization.
		 * <p>
		 * API name: {@code absolute_importance}
		 */
		public final Builder absoluteImportance(@Nullable Double value) {
			this.absoluteImportance = value;
			return this;
		}

		/**
		 * Required - Name of the hyperparameter.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
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
		public final Builder relativeImportance(@Nullable Double value) {
			this.relativeImportance = value;
			return this;
		}

		/**
		 * Required - Indicates if the hyperparameter is specified by the user (true) or
		 * optimized (false).
		 * <p>
		 * API name: {@code supplied}
		 */
		public final Builder supplied(boolean value) {
			this.supplied = value;
			return this;
		}

		/**
		 * Required - The value of the hyperparameter, either optimized or specified by
		 * the user.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(double value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Hyperparameter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Hyperparameter build() {
			_checkSingleUse();

			return new Hyperparameter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Hyperparameter}
	 */
	public static final JsonpDeserializer<Hyperparameter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Hyperparameter::setupHyperparameterDeserializer);

	protected static void setupHyperparameterDeserializer(ObjectDeserializer<Hyperparameter.Builder> op) {

		op.add(Builder::absoluteImportance, JsonpDeserializer.doubleDeserializer(), "absolute_importance");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::relativeImportance, JsonpDeserializer.doubleDeserializer(), "relative_importance");
		op.add(Builder::supplied, JsonpDeserializer.booleanDeserializer(), "supplied");
		op.add(Builder::value, JsonpDeserializer.doubleDeserializer(), "value");

	}

}
