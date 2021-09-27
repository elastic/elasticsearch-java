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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.LinearInterpolationSmoothingModel
@JsonpDeserializable
public final class LinearInterpolationSmoothingModel implements SmoothingModelVariant, JsonpSerializable {
	private final Double bigramLambda;

	private final Double trigramLambda;

	private final Double unigramLambda;

	// ---------------------------------------------------------------------------------------------

	public LinearInterpolationSmoothingModel(Builder builder) {

		this.bigramLambda = Objects.requireNonNull(builder.bigramLambda, "bigram_lambda");
		this.trigramLambda = Objects.requireNonNull(builder.trigramLambda, "trigram_lambda");
		this.unigramLambda = Objects.requireNonNull(builder.unigramLambda, "unigram_lambda");

	}

	/**
	 * {@link SmoothingModel} variant type
	 */
	@Override
	public String _variantType() {
		return "linear_interpolation";
	}

	/**
	 * API name: {@code bigram_lambda}
	 */
	public Double bigramLambda() {
		return this.bigramLambda;
	}

	/**
	 * API name: {@code trigram_lambda}
	 */
	public Double trigramLambda() {
		return this.trigramLambda;
	}

	/**
	 * API name: {@code unigram_lambda}
	 */
	public Double unigramLambda() {
		return this.unigramLambda;
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

		generator.writeKey("bigram_lambda");
		generator.write(this.bigramLambda);

		generator.writeKey("trigram_lambda");
		generator.write(this.trigramLambda);

		generator.writeKey("unigram_lambda");
		generator.write(this.unigramLambda);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LinearInterpolationSmoothingModel}.
	 */
	public static class Builder implements ObjectBuilder<LinearInterpolationSmoothingModel> {
		private Double bigramLambda;

		private Double trigramLambda;

		private Double unigramLambda;

		/**
		 * API name: {@code bigram_lambda}
		 */
		public Builder bigramLambda(Double value) {
			this.bigramLambda = value;
			return this;
		}

		/**
		 * API name: {@code trigram_lambda}
		 */
		public Builder trigramLambda(Double value) {
			this.trigramLambda = value;
			return this;
		}

		/**
		 * API name: {@code unigram_lambda}
		 */
		public Builder unigramLambda(Double value) {
			this.unigramLambda = value;
			return this;
		}

		/**
		 * Builds a {@link LinearInterpolationSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LinearInterpolationSmoothingModel build() {

			return new LinearInterpolationSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LinearInterpolationSmoothingModel}
	 */
	public static final JsonpDeserializer<LinearInterpolationSmoothingModel> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LinearInterpolationSmoothingModel::setupLinearInterpolationSmoothingModelDeserializer,
					Builder::build);

	protected static void setupLinearInterpolationSmoothingModelDeserializer(
			DelegatingDeserializer<LinearInterpolationSmoothingModel.Builder> op) {

		op.add(Builder::bigramLambda, JsonpDeserializer.doubleDeserializer(), "bigram_lambda");
		op.add(Builder::trigramLambda, JsonpDeserializer.doubleDeserializer(), "trigram_lambda");
		op.add(Builder::unigramLambda, JsonpDeserializer.doubleDeserializer(), "unigram_lambda");

	}

}
