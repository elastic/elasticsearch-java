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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ArrayPercentilesItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ArrayPercentilesItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class ArrayPercentilesItem implements JsonpSerializable {
	private final String key;

	private final double value;

	@Nullable
	private final String valueAsString;

	// ---------------------------------------------------------------------------------------------

	private ArrayPercentilesItem(Builder builder) {

		this.key = ApiTypeHelper.requireNonNull(builder.key, this, "key");
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.valueAsString = builder.valueAsString;

	}

	public static ArrayPercentilesItem of(Function<Builder, ObjectBuilder<ArrayPercentilesItem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code key}
	 */
	public final String key() {
		return this.key;
	}

	/**
	 * Required - API name: {@code value}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	public final double value() {
		return this.value;
	}

	/**
	 * API name: {@code value_as_string}
	 */
	@Nullable
	public final String valueAsString() {
		return this.valueAsString;
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

		generator.writeKey("key");
		generator.write(this.key);

		generator.writeKey("value");
		JsonpUtils.serializeDoubleOrNull(generator, this.value, 0);
		if (this.valueAsString != null) {
			generator.writeKey("value_as_string");
			generator.write(this.valueAsString);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ArrayPercentilesItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ArrayPercentilesItem> {
		private String key;

		private Double value;

		@Nullable
		private String valueAsString;

		/**
		 * Required - API name: {@code key}
		 */
		public final Builder key(String value) {
			this.key = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder value(double value) {
			this.value = value;
			return this;
		}

		/**
		 * API name: {@code value_as_string}
		 */
		public final Builder valueAsString(@Nullable String value) {
			this.valueAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ArrayPercentilesItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ArrayPercentilesItem build() {
			_checkSingleUse();

			return new ArrayPercentilesItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ArrayPercentilesItem}
	 */
	public static final JsonpDeserializer<ArrayPercentilesItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ArrayPercentilesItem::setupArrayPercentilesItemDeserializer);

	protected static void setupArrayPercentilesItemDeserializer(ObjectDeserializer<ArrayPercentilesItem.Builder> op) {

		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::value, JsonpDeserializer.doubleOrNullDeserializer(0), "value");
		op.add(Builder::valueAsString, JsonpDeserializer.stringDeserializer(), "value_as_string");

	}

}
