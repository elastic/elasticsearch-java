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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Weights
public final class Weights implements ToJsonp {
	private final Number weights;

	// ---------------------------------------------------------------------------------------------

	protected Weights(Builder builder) {

		this.weights = Objects.requireNonNull(builder.weights, "weights");

	}

	/**
	 * API name: {@code weights}
	 */
	public Number weights() {
		return this.weights;
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

		generator.writeKey("weights");
		generator.write(this.weights.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Weights}.
	 */
	public static class Builder implements ObjectBuilder<Weights> {
		private Number weights;

		/**
		 * API name: {@code weights}
		 */
		public Builder weights(Number value) {
			this.weights = value;
			return this;
		}

		/**
		 * Builds a {@link Weights}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Weights build() {

			return new Weights(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Weights
	 */
	public static final JsonpDeserializer<Weights> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Weights::setupWeightsDeserializer);

	protected static void setupWeightsDeserializer(DelegatingDeserializer<Weights.Builder> op) {

		op.add(Builder::weights, JsonpDeserializer.numberDeserializer(), "weights");

	}

}
