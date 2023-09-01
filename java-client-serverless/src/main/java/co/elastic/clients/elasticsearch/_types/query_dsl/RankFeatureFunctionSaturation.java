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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Float;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RankFeatureFunctionSaturation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RankFeatureFunctionSaturation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankFeatureFunctionSaturation extends RankFeatureFunction implements JsonpSerializable {
	@Nullable
	private final Float pivot;

	// ---------------------------------------------------------------------------------------------

	private RankFeatureFunctionSaturation(Builder builder) {

		this.pivot = builder.pivot;

	}

	public static RankFeatureFunctionSaturation of(Function<Builder, ObjectBuilder<RankFeatureFunctionSaturation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Configurable pivot value so that the result will be less than 0.5.
	 * <p>
	 * API name: {@code pivot}
	 */
	@Nullable
	public final Float pivot() {
		return this.pivot;
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

		if (this.pivot != null) {
			generator.writeKey("pivot");
			generator.write(this.pivot);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeatureFunctionSaturation}.
	 */

	public static class Builder extends RankFeatureFunction.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankFeatureFunctionSaturation> {
		@Nullable
		private Float pivot;

		/**
		 * Configurable pivot value so that the result will be less than 0.5.
		 * <p>
		 * API name: {@code pivot}
		 */
		public final Builder pivot(@Nullable Float value) {
			this.pivot = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeatureFunctionSaturation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeatureFunctionSaturation build() {
			_checkSingleUse();

			return new RankFeatureFunctionSaturation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeatureFunctionSaturation}
	 */
	public static final JsonpDeserializer<RankFeatureFunctionSaturation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankFeatureFunctionSaturation::setupRankFeatureFunctionSaturationDeserializer);

	protected static void setupRankFeatureFunctionSaturationDeserializer(
			ObjectDeserializer<RankFeatureFunctionSaturation.Builder> op) {

		op.add(Builder::pivot, JsonpDeserializer.floatDeserializer(), "pivot");

	}

}
