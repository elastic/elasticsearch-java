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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeRegressionSummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.DataframeRegressionSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeRegressionSummary implements JsonpSerializable {
	@Nullable
	private final DataframeEvaluationValue huber;

	@Nullable
	private final DataframeEvaluationValue mse;

	@Nullable
	private final DataframeEvaluationValue msle;

	@Nullable
	private final DataframeEvaluationValue rSquared;

	// ---------------------------------------------------------------------------------------------

	private DataframeRegressionSummary(Builder builder) {

		this.huber = builder.huber;
		this.mse = builder.mse;
		this.msle = builder.msle;
		this.rSquared = builder.rSquared;

	}

	public static DataframeRegressionSummary of(Function<Builder, ObjectBuilder<DataframeRegressionSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code huber}
	 */
	@Nullable
	public final DataframeEvaluationValue huber() {
		return this.huber;
	}

	/**
	 * API name: {@code mse}
	 */
	@Nullable
	public final DataframeEvaluationValue mse() {
		return this.mse;
	}

	/**
	 * API name: {@code msle}
	 */
	@Nullable
	public final DataframeEvaluationValue msle() {
		return this.msle;
	}

	/**
	 * API name: {@code r_squared}
	 */
	@Nullable
	public final DataframeEvaluationValue rSquared() {
		return this.rSquared;
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

		if (this.huber != null) {
			generator.writeKey("huber");
			this.huber.serialize(generator, mapper);

		}
		if (this.mse != null) {
			generator.writeKey("mse");
			this.mse.serialize(generator, mapper);

		}
		if (this.msle != null) {
			generator.writeKey("msle");
			this.msle.serialize(generator, mapper);

		}
		if (this.rSquared != null) {
			generator.writeKey("r_squared");
			this.rSquared.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeRegressionSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeRegressionSummary> {
		@Nullable
		private DataframeEvaluationValue huber;

		@Nullable
		private DataframeEvaluationValue mse;

		@Nullable
		private DataframeEvaluationValue msle;

		@Nullable
		private DataframeEvaluationValue rSquared;

		/**
		 * API name: {@code huber}
		 */
		public final Builder huber(@Nullable DataframeEvaluationValue value) {
			this.huber = value;
			return this;
		}

		/**
		 * API name: {@code huber}
		 */
		public final Builder huber(
				Function<DataframeEvaluationValue.Builder, ObjectBuilder<DataframeEvaluationValue>> fn) {
			return this.huber(fn.apply(new DataframeEvaluationValue.Builder()).build());
		}

		/**
		 * API name: {@code mse}
		 */
		public final Builder mse(@Nullable DataframeEvaluationValue value) {
			this.mse = value;
			return this;
		}

		/**
		 * API name: {@code mse}
		 */
		public final Builder mse(
				Function<DataframeEvaluationValue.Builder, ObjectBuilder<DataframeEvaluationValue>> fn) {
			return this.mse(fn.apply(new DataframeEvaluationValue.Builder()).build());
		}

		/**
		 * API name: {@code msle}
		 */
		public final Builder msle(@Nullable DataframeEvaluationValue value) {
			this.msle = value;
			return this;
		}

		/**
		 * API name: {@code msle}
		 */
		public final Builder msle(
				Function<DataframeEvaluationValue.Builder, ObjectBuilder<DataframeEvaluationValue>> fn) {
			return this.msle(fn.apply(new DataframeEvaluationValue.Builder()).build());
		}

		/**
		 * API name: {@code r_squared}
		 */
		public final Builder rSquared(@Nullable DataframeEvaluationValue value) {
			this.rSquared = value;
			return this;
		}

		/**
		 * API name: {@code r_squared}
		 */
		public final Builder rSquared(
				Function<DataframeEvaluationValue.Builder, ObjectBuilder<DataframeEvaluationValue>> fn) {
			return this.rSquared(fn.apply(new DataframeEvaluationValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeRegressionSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeRegressionSummary build() {
			_checkSingleUse();

			return new DataframeRegressionSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeRegressionSummary}
	 */
	public static final JsonpDeserializer<DataframeRegressionSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeRegressionSummary::setupDataframeRegressionSummaryDeserializer);

	protected static void setupDataframeRegressionSummaryDeserializer(
			ObjectDeserializer<DataframeRegressionSummary.Builder> op) {

		op.add(Builder::huber, DataframeEvaluationValue._DESERIALIZER, "huber");
		op.add(Builder::mse, DataframeEvaluationValue._DESERIALIZER, "mse");
		op.add(Builder::msle, DataframeEvaluationValue._DESERIALIZER, "msle");
		op.add(Builder::rSquared, DataframeEvaluationValue._DESERIALIZER, "r_squared");

	}

}
