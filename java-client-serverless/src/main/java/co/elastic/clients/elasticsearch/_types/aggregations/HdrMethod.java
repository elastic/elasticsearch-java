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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.aggregations.HdrMethod

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.HdrMethod">API
 *      specification</a>
 */
@JsonpDeserializable
public class HdrMethod implements JsonpSerializable {
	@Nullable
	private final Integer numberOfSignificantValueDigits;

	// ---------------------------------------------------------------------------------------------

	private HdrMethod(Builder builder) {

		this.numberOfSignificantValueDigits = builder.numberOfSignificantValueDigits;

	}

	public static HdrMethod of(Function<Builder, ObjectBuilder<HdrMethod>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the resolution of values for the histogram in number of significant
	 * digits.
	 * <p>
	 * API name: {@code number_of_significant_value_digits}
	 */
	@Nullable
	public final Integer numberOfSignificantValueDigits() {
		return this.numberOfSignificantValueDigits;
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

		if (this.numberOfSignificantValueDigits != null) {
			generator.writeKey("number_of_significant_value_digits");
			generator.write(this.numberOfSignificantValueDigits);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HdrMethod}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HdrMethod> {
		@Nullable
		private Integer numberOfSignificantValueDigits;

		/**
		 * Specifies the resolution of values for the histogram in number of significant
		 * digits.
		 * <p>
		 * API name: {@code number_of_significant_value_digits}
		 */
		public final Builder numberOfSignificantValueDigits(@Nullable Integer value) {
			this.numberOfSignificantValueDigits = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HdrMethod}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HdrMethod build() {
			_checkSingleUse();

			return new HdrMethod(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HdrMethod}
	 */
	public static final JsonpDeserializer<HdrMethod> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HdrMethod::setupHdrMethodDeserializer);

	protected static void setupHdrMethodDeserializer(ObjectDeserializer<HdrMethod.Builder> op) {

		op.add(Builder::numberOfSignificantValueDigits, JsonpDeserializer.integerDeserializer(),
				"number_of_significant_value_digits");

	}

}
