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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.NumericFielddata

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.NumericFielddata">API
 *      specification</a>
 */
@JsonpDeserializable
public class NumericFielddata implements JsonpSerializable {
	private final NumericFielddataFormat format;

	// ---------------------------------------------------------------------------------------------

	private NumericFielddata(Builder builder) {

		this.format = ApiTypeHelper.requireNonNull(builder.format, this, "format");

	}

	public static NumericFielddata of(Function<Builder, ObjectBuilder<NumericFielddata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code format}
	 */
	public final NumericFielddataFormat format() {
		return this.format;
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

		generator.writeKey("format");
		this.format.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NumericFielddata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NumericFielddata> {
		private NumericFielddataFormat format;

		/**
		 * Required - API name: {@code format}
		 */
		public final Builder format(NumericFielddataFormat value) {
			this.format = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NumericFielddata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NumericFielddata build() {
			_checkSingleUse();

			return new NumericFielddata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NumericFielddata}
	 */
	public static final JsonpDeserializer<NumericFielddata> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NumericFielddata::setupNumericFielddataDeserializer);

	protected static void setupNumericFielddataDeserializer(ObjectDeserializer<NumericFielddata.Builder> op) {

		op.add(Builder::format, NumericFielddataFormat._DESERIALIZER, "format");

	}

}
