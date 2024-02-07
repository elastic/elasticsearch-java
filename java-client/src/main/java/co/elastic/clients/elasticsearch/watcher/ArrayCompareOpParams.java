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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.FieldValue;
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

// typedef: watcher._types.ArrayCompareOpParams

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ArrayCompareOpParams">API
 *      specification</a>
 */
@JsonpDeserializable
public class ArrayCompareOpParams implements JsonpSerializable {
	private final Quantifier quantifier;

	private final FieldValue value;

	// ---------------------------------------------------------------------------------------------

	private ArrayCompareOpParams(Builder builder) {

		this.quantifier = ApiTypeHelper.requireNonNull(builder.quantifier, this, "quantifier");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static ArrayCompareOpParams of(Function<Builder, ObjectBuilder<ArrayCompareOpParams>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code quantifier}
	 */
	public final Quantifier quantifier() {
		return this.quantifier;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final FieldValue value() {
		return this.value;
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

		generator.writeKey("quantifier");
		this.quantifier.serialize(generator, mapper);
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ArrayCompareOpParams}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ArrayCompareOpParams> {
		private Quantifier quantifier;

		private FieldValue value;

		/**
		 * Required - API name: {@code quantifier}
		 */
		public final Builder quantifier(Quantifier value) {
			this.quantifier = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(FieldValue value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.value(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(long value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(double value) {
			this.value = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(boolean value) {
			this.value = FieldValue.of(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ArrayCompareOpParams}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ArrayCompareOpParams build() {
			_checkSingleUse();

			return new ArrayCompareOpParams(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ArrayCompareOpParams}
	 */
	public static final JsonpDeserializer<ArrayCompareOpParams> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ArrayCompareOpParams::setupArrayCompareOpParamsDeserializer);

	protected static void setupArrayCompareOpParamsDeserializer(ObjectDeserializer<ArrayCompareOpParams.Builder> op) {

		op.add(Builder::quantifier, Quantifier._DESERIALIZER, "quantifier");
		op.add(Builder::value, FieldValue._DESERIALIZER, "value");

	}

}
