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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.query_dsl.RankFeatureFunctionLogarithm

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RankFeatureFunctionLogarithm">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankFeatureFunctionLogarithm extends RankFeatureFunction implements JsonpSerializable {
	private final float scalingFactor;

	// ---------------------------------------------------------------------------------------------

	private RankFeatureFunctionLogarithm(Builder builder) {

		this.scalingFactor = ApiTypeHelper.requireNonNull(builder.scalingFactor, this, "scalingFactor");

	}

	public static RankFeatureFunctionLogarithm of(Function<Builder, ObjectBuilder<RankFeatureFunctionLogarithm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Configurable scaling factor.
	 * <p>
	 * API name: {@code scaling_factor}
	 */
	public final float scalingFactor() {
		return this.scalingFactor;
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

		generator.writeKey("scaling_factor");
		generator.write(this.scalingFactor);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureFunctionLogarithm}.
	 */

	public static class Builder extends RankFeatureFunction.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankFeatureFunctionLogarithm> {
		private Float scalingFactor;

		/**
		 * Required - Configurable scaling factor.
		 * <p>
		 * API name: {@code scaling_factor}
		 */
		public final Builder scalingFactor(float value) {
			this.scalingFactor = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeatureFunctionLogarithm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureFunctionLogarithm build() {
			_checkSingleUse();

			return new RankFeatureFunctionLogarithm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeatureFunctionLogarithm}
	 */
	public static final JsonpDeserializer<RankFeatureFunctionLogarithm> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankFeatureFunctionLogarithm::setupRankFeatureFunctionLogarithmDeserializer);

	protected static void setupRankFeatureFunctionLogarithmDeserializer(
			ObjectDeserializer<RankFeatureFunctionLogarithm.Builder> op) {

		op.add(Builder::scalingFactor, JsonpDeserializer.floatDeserializer(), "scaling_factor");

	}

}
