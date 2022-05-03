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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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

// typedef: ml.put_trained_model.AggregateOutput

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.put_trained_model.AggregateOutput">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregateOutput implements JsonpSerializable {
	@Nullable
	private final Weights logisticRegression;

	@Nullable
	private final Weights weightedSum;

	@Nullable
	private final Weights weightedMode;

	@Nullable
	private final Weights exponent;

	// ---------------------------------------------------------------------------------------------

	private AggregateOutput(Builder builder) {

		this.logisticRegression = builder.logisticRegression;
		this.weightedSum = builder.weightedSum;
		this.weightedMode = builder.weightedMode;
		this.exponent = builder.exponent;

	}

	public static AggregateOutput of(Function<Builder, ObjectBuilder<AggregateOutput>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code logistic_regression}
	 */
	@Nullable
	public final Weights logisticRegression() {
		return this.logisticRegression;
	}

	/**
	 * API name: {@code weighted_sum}
	 */
	@Nullable
	public final Weights weightedSum() {
		return this.weightedSum;
	}

	/**
	 * API name: {@code weighted_mode}
	 */
	@Nullable
	public final Weights weightedMode() {
		return this.weightedMode;
	}

	/**
	 * API name: {@code exponent}
	 */
	@Nullable
	public final Weights exponent() {
		return this.exponent;
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

		if (this.logisticRegression != null) {
			generator.writeKey("logistic_regression");
			this.logisticRegression.serialize(generator, mapper);

		}
		if (this.weightedSum != null) {
			generator.writeKey("weighted_sum");
			this.weightedSum.serialize(generator, mapper);

		}
		if (this.weightedMode != null) {
			generator.writeKey("weighted_mode");
			this.weightedMode.serialize(generator, mapper);

		}
		if (this.exponent != null) {
			generator.writeKey("exponent");
			this.exponent.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregateOutput}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AggregateOutput> {
		@Nullable
		private Weights logisticRegression;

		@Nullable
		private Weights weightedSum;

		@Nullable
		private Weights weightedMode;

		@Nullable
		private Weights exponent;

		/**
		 * API name: {@code logistic_regression}
		 */
		public final Builder logisticRegression(@Nullable Weights value) {
			this.logisticRegression = value;
			return this;
		}

		/**
		 * API name: {@code logistic_regression}
		 */
		public final Builder logisticRegression(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.logisticRegression(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code weighted_sum}
		 */
		public final Builder weightedSum(@Nullable Weights value) {
			this.weightedSum = value;
			return this;
		}

		/**
		 * API name: {@code weighted_sum}
		 */
		public final Builder weightedSum(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.weightedSum(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code weighted_mode}
		 */
		public final Builder weightedMode(@Nullable Weights value) {
			this.weightedMode = value;
			return this;
		}

		/**
		 * API name: {@code weighted_mode}
		 */
		public final Builder weightedMode(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.weightedMode(fn.apply(new Weights.Builder()).build());
		}

		/**
		 * API name: {@code exponent}
		 */
		public final Builder exponent(@Nullable Weights value) {
			this.exponent = value;
			return this;
		}

		/**
		 * API name: {@code exponent}
		 */
		public final Builder exponent(Function<Weights.Builder, ObjectBuilder<Weights>> fn) {
			return this.exponent(fn.apply(new Weights.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregateOutput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregateOutput build() {
			_checkSingleUse();

			return new AggregateOutput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregateOutput}
	 */
	public static final JsonpDeserializer<AggregateOutput> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AggregateOutput::setupAggregateOutputDeserializer);

	protected static void setupAggregateOutputDeserializer(ObjectDeserializer<AggregateOutput.Builder> op) {

		op.add(Builder::logisticRegression, Weights._DESERIALIZER, "logistic_regression");
		op.add(Builder::weightedSum, Weights._DESERIALIZER, "weighted_sum");
		op.add(Builder::weightedMode, Weights._DESERIALIZER, "weighted_mode");
		op.add(Builder::exponent, Weights._DESERIALIZER, "exponent");

	}

}
