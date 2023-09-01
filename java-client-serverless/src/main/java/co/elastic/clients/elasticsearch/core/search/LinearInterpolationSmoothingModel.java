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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: _global.search._types.LinearInterpolationSmoothingModel

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.LinearInterpolationSmoothingModel">API
 *      specification</a>
 */
@JsonpDeserializable
public class LinearInterpolationSmoothingModel implements SmoothingModelVariant, JsonpSerializable {
	private final double bigramLambda;

	private final double trigramLambda;

	private final double unigramLambda;

	// ---------------------------------------------------------------------------------------------

	private LinearInterpolationSmoothingModel(Builder builder) {

		this.bigramLambda = ApiTypeHelper.requireNonNull(builder.bigramLambda, this, "bigramLambda");
		this.trigramLambda = ApiTypeHelper.requireNonNull(builder.trigramLambda, this, "trigramLambda");
		this.unigramLambda = ApiTypeHelper.requireNonNull(builder.unigramLambda, this, "unigramLambda");

	}

	public static LinearInterpolationSmoothingModel of(
			Function<Builder, ObjectBuilder<LinearInterpolationSmoothingModel>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SmoothingModel variant kind.
	 */
	@Override
	public SmoothingModel.Kind _smoothingModelKind() {
		return SmoothingModel.Kind.LinearInterpolation;
	}

	/**
	 * Required - API name: {@code bigram_lambda}
	 */
	public final double bigramLambda() {
		return this.bigramLambda;
	}

	/**
	 * Required - API name: {@code trigram_lambda}
	 */
	public final double trigramLambda() {
		return this.trigramLambda;
	}

	/**
	 * Required - API name: {@code unigram_lambda}
	 */
	public final double unigramLambda() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LinearInterpolationSmoothingModel}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LinearInterpolationSmoothingModel> {
		private Double bigramLambda;

		private Double trigramLambda;

		private Double unigramLambda;

		/**
		 * Required - API name: {@code bigram_lambda}
		 */
		public final Builder bigramLambda(double value) {
			this.bigramLambda = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigram_lambda}
		 */
		public final Builder trigramLambda(double value) {
			this.trigramLambda = value;
			return this;
		}

		/**
		 * Required - API name: {@code unigram_lambda}
		 */
		public final Builder unigramLambda(double value) {
			this.unigramLambda = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LinearInterpolationSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LinearInterpolationSmoothingModel build() {
			_checkSingleUse();

			return new LinearInterpolationSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LinearInterpolationSmoothingModel}
	 */
	public static final JsonpDeserializer<LinearInterpolationSmoothingModel> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LinearInterpolationSmoothingModel::setupLinearInterpolationSmoothingModelDeserializer);

	protected static void setupLinearInterpolationSmoothingModelDeserializer(
			ObjectDeserializer<LinearInterpolationSmoothingModel.Builder> op) {

		op.add(Builder::bigramLambda, JsonpDeserializer.doubleDeserializer(), "bigram_lambda");
		op.add(Builder::trigramLambda, JsonpDeserializer.doubleDeserializer(), "trigram_lambda");
		op.add(Builder::unigramLambda, JsonpDeserializer.doubleDeserializer(), "unigram_lambda");

	}

}
