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

// typedef: _global.search._types.StupidBackoffSmoothingModel

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.StupidBackoffSmoothingModel">API
 *      specification</a>
 */
@JsonpDeserializable
public class StupidBackoffSmoothingModel implements SmoothingModelVariant, JsonpSerializable {
	private final double discount;

	// ---------------------------------------------------------------------------------------------

	private StupidBackoffSmoothingModel(Builder builder) {

		this.discount = ApiTypeHelper.requireNonNull(builder.discount, this, "discount");

	}

	public static StupidBackoffSmoothingModel of(Function<Builder, ObjectBuilder<StupidBackoffSmoothingModel>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * SmoothingModel variant kind.
	 */
	@Override
	public SmoothingModel.Kind _smoothingModelKind() {
		return SmoothingModel.Kind.StupidBackoff;
	}

	/**
	 * Required - API name: {@code discount}
	 */
	public final double discount() {
		return this.discount;
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

		generator.writeKey("discount");
		generator.write(this.discount);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StupidBackoffSmoothingModel}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StupidBackoffSmoothingModel> {
		private Double discount;

		/**
		 * Required - API name: {@code discount}
		 */
		public final Builder discount(double value) {
			this.discount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StupidBackoffSmoothingModel}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StupidBackoffSmoothingModel build() {
			_checkSingleUse();

			return new StupidBackoffSmoothingModel(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StupidBackoffSmoothingModel}
	 */
	public static final JsonpDeserializer<StupidBackoffSmoothingModel> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StupidBackoffSmoothingModel::setupStupidBackoffSmoothingModelDeserializer);

	protected static void setupStupidBackoffSmoothingModelDeserializer(
			ObjectDeserializer<StupidBackoffSmoothingModel.Builder> op) {

		op.add(Builder::discount, JsonpDeserializer.doubleDeserializer(), "discount");

	}

}
