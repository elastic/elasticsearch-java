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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml.put_trained_model.Weights

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ml.put_trained_model.Weights">API
 *      specification</a>
 */
@JsonpDeserializable
public class Weights implements JsonpSerializable {
	private final double weights;

	// ---------------------------------------------------------------------------------------------

	private Weights(Builder builder) {

		this.weights = ApiTypeHelper.requireNonNull(builder.weights, this, "weights");

	}

	public static Weights of(Function<Builder, ObjectBuilder<Weights>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code weights}
	 */
	public final double weights() {
		return this.weights;
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

		generator.writeKey("weights");
		generator.write(this.weights);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Weights}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Weights> {
		private Double weights;

		/**
		 * Required - API name: {@code weights}
		 */
		public final Builder weights(double value) {
			this.weights = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Weights}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Weights build() {
			_checkSingleUse();

			return new Weights(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Weights}
	 */
	public static final JsonpDeserializer<Weights> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Weights::setupWeightsDeserializer);

	protected static void setupWeightsDeserializer(ObjectDeserializer<Weights.Builder> op) {

		op.add(Builder::weights, JsonpDeserializer.doubleDeserializer(), "weights");

	}

}
