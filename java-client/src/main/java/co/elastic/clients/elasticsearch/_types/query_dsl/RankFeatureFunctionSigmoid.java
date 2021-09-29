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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.query_dsl.RankFeatureFunctionSigmoid
@JsonpDeserializable
public final class RankFeatureFunctionSigmoid extends RankFeatureFunction implements JsonpSerializable {
	private final float pivot;

	private final float exponent;

	// ---------------------------------------------------------------------------------------------

	public RankFeatureFunctionSigmoid(Builder builder) {

		this.pivot = Objects.requireNonNull(builder.pivot, "pivot");
		this.exponent = Objects.requireNonNull(builder.exponent, "exponent");

	}

	public RankFeatureFunctionSigmoid(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code pivot}
	 */
	public float pivot() {
		return this.pivot;
	}

	/**
	 * API name: {@code exponent}
	 */
	public float exponent() {
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

		generator.writeKey("pivot");
		generator.write(this.pivot);

		generator.writeKey("exponent");
		generator.write(this.exponent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureFunctionSigmoid}.
	 */
	public static class Builder implements ObjectBuilder<RankFeatureFunctionSigmoid> {
		private Float pivot;

		private Float exponent;

		/**
		 * API name: {@code pivot}
		 */
		public Builder pivot(float value) {
			this.pivot = value;
			return this;
		}

		/**
		 * API name: {@code exponent}
		 */
		public Builder exponent(float value) {
			this.exponent = value;
			return this;
		}

		/**
		 * Builds a {@link RankFeatureFunctionSigmoid}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureFunctionSigmoid build() {

			return new RankFeatureFunctionSigmoid(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeatureFunctionSigmoid}
	 */
	public static final JsonpDeserializer<RankFeatureFunctionSigmoid> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, RankFeatureFunctionSigmoid::setupRankFeatureFunctionSigmoidDeserializer, Builder::build);

	protected static void setupRankFeatureFunctionSigmoidDeserializer(
			DelegatingDeserializer<RankFeatureFunctionSigmoid.Builder> op) {

		op.add(Builder::pivot, JsonpDeserializer.floatDeserializer(), "pivot");
		op.add(Builder::exponent, JsonpDeserializer.floatDeserializer(), "exponent");

	}

}
