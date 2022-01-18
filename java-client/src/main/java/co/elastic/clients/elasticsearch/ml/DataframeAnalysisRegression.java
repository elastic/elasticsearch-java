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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisRegression

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisRegression">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisRegression extends DataframeAnalysisBase implements DataframeAnalysisVariant {
	@Nullable
	private final String lossFunction;

	@Nullable
	private final Double lossFunctionParameter;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisRegression(Builder builder) {
		super(builder);

		this.lossFunction = builder.lossFunction;
		this.lossFunctionParameter = builder.lossFunctionParameter;

	}

	public static DataframeAnalysisRegression of(Function<Builder, ObjectBuilder<DataframeAnalysisRegression>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalysis variant kind.
	 */
	@Override
	public DataframeAnalysis.Kind _dataframeAnalysisKind() {
		return DataframeAnalysis.Kind.Regression;
	}

	/**
	 * The loss function used during regression. Available options are
	 * <code>mse</code> (mean squared error), <code>msle</code> (mean squared
	 * logarithmic error), <code>huber</code> (Pseudo-Huber loss).
	 * <p>
	 * API name: {@code loss_function}
	 */
	@Nullable
	public final String lossFunction() {
		return this.lossFunction;
	}

	/**
	 * A positive number that is used as a parameter to the
	 * <code>loss_function</code>.
	 * <p>
	 * API name: {@code loss_function_parameter}
	 */
	@Nullable
	public final Double lossFunctionParameter() {
		return this.lossFunctionParameter;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.lossFunction != null) {
			generator.writeKey("loss_function");
			generator.write(this.lossFunction);

		}
		if (this.lossFunctionParameter != null) {
			generator.writeKey("loss_function_parameter");
			generator.write(this.lossFunctionParameter);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisRegression}.
	 */

	public static class Builder extends DataframeAnalysisBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeAnalysisRegression> {
		@Nullable
		private String lossFunction;

		@Nullable
		private Double lossFunctionParameter;

		/**
		 * The loss function used during regression. Available options are
		 * <code>mse</code> (mean squared error), <code>msle</code> (mean squared
		 * logarithmic error), <code>huber</code> (Pseudo-Huber loss).
		 * <p>
		 * API name: {@code loss_function}
		 */
		public final Builder lossFunction(@Nullable String value) {
			this.lossFunction = value;
			return this;
		}

		/**
		 * A positive number that is used as a parameter to the
		 * <code>loss_function</code>.
		 * <p>
		 * API name: {@code loss_function_parameter}
		 */
		public final Builder lossFunctionParameter(@Nullable Double value) {
			this.lossFunctionParameter = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisRegression}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisRegression build() {
			_checkSingleUse();

			return new DataframeAnalysisRegression(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisRegression}
	 */
	public static final JsonpDeserializer<DataframeAnalysisRegression> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysisRegression::setupDataframeAnalysisRegressionDeserializer);

	protected static void setupDataframeAnalysisRegressionDeserializer(
			ObjectDeserializer<DataframeAnalysisRegression.Builder> op) {
		DataframeAnalysisBase.setupDataframeAnalysisBaseDeserializer(op);
		op.add(Builder::lossFunction, JsonpDeserializer.stringDeserializer(), "loss_function");
		op.add(Builder::lossFunctionParameter, JsonpDeserializer.doubleDeserializer(), "loss_function_parameter");

	}

}
