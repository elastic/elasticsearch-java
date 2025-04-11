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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.lang.Float;
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

// typedef: _types.mapping.DenseVectorIndexOptionsRescoreVector

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorIndexOptionsRescoreVector">API
 *      specification</a>
 */
@JsonpDeserializable
public class DenseVectorIndexOptionsRescoreVector implements JsonpSerializable {
	private final float oversample;

	// ---------------------------------------------------------------------------------------------

	private DenseVectorIndexOptionsRescoreVector(Builder builder) {

		this.oversample = ApiTypeHelper.requireNonNull(builder.oversample, this, "oversample", 0);

	}

	public static DenseVectorIndexOptionsRescoreVector of(
			Function<Builder, ObjectBuilder<DenseVectorIndexOptionsRescoreVector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The oversampling factor to use when searching for the nearest
	 * neighbor. This is only applicable to the quantized formats:
	 * <code>bbq_*</code>, <code>int4_*</code>, and <code>int8_*</code>. When
	 * provided, <code>oversample * k</code> vectors will be gathered and then their
	 * scores will be re-computed with the original vectors.
	 * <p>
	 * valid values are between <code>1.0</code> and <code>10.0</code> (inclusive),
	 * or <code>0</code> exactly to disable oversampling.
	 * <p>
	 * API name: {@code oversample}
	 */
	public final float oversample() {
		return this.oversample;
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

		generator.writeKey("oversample");
		generator.write(this.oversample);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DenseVectorIndexOptionsRescoreVector}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DenseVectorIndexOptionsRescoreVector> {
		private Float oversample;

		/**
		 * Required - The oversampling factor to use when searching for the nearest
		 * neighbor. This is only applicable to the quantized formats:
		 * <code>bbq_*</code>, <code>int4_*</code>, and <code>int8_*</code>. When
		 * provided, <code>oversample * k</code> vectors will be gathered and then their
		 * scores will be re-computed with the original vectors.
		 * <p>
		 * valid values are between <code>1.0</code> and <code>10.0</code> (inclusive),
		 * or <code>0</code> exactly to disable oversampling.
		 * <p>
		 * API name: {@code oversample}
		 */
		public final Builder oversample(float value) {
			this.oversample = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DenseVectorIndexOptionsRescoreVector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DenseVectorIndexOptionsRescoreVector build() {
			_checkSingleUse();

			return new DenseVectorIndexOptionsRescoreVector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DenseVectorIndexOptionsRescoreVector}
	 */
	public static final JsonpDeserializer<DenseVectorIndexOptionsRescoreVector> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DenseVectorIndexOptionsRescoreVector::setupDenseVectorIndexOptionsRescoreVectorDeserializer);

	protected static void setupDenseVectorIndexOptionsRescoreVectorDeserializer(
			ObjectDeserializer<DenseVectorIndexOptionsRescoreVector.Builder> op) {

		op.add(Builder::oversample, JsonpDeserializer.floatDeserializer(), "oversample");

	}

}
