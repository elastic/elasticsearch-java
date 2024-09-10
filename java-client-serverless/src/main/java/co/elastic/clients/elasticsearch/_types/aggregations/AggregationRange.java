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
import java.lang.Double;
import java.lang.String;
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

// typedef: _types.aggregations.AggregationRange

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AggregationRange">API
 *      specification</a>
 */
@JsonpDeserializable
public class AggregationRange implements JsonpSerializable {
	@Nullable
	private final Double from;

	@Nullable
	private final String key;

	@Nullable
	private final Double to;

	// ---------------------------------------------------------------------------------------------

	private AggregationRange(Builder builder) {

		this.from = builder.from;
		this.key = builder.key;
		this.to = builder.to;

	}

	public static AggregationRange of(Function<Builder, ObjectBuilder<AggregationRange>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Start of the range (inclusive).
	 * <p>
	 * API name: {@code from}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	@Nullable
	public final Double from() {
		return this.from;
	}

	/**
	 * Custom key to return the range with.
	 * <p>
	 * API name: {@code key}
	 */
	@Nullable
	public final String key() {
		return this.key;
	}

	/**
	 * End of the range (exclusive).
	 * <p>
	 * API name: {@code to}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	@Nullable
	public final Double to() {
		return this.to;
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

		if (this.from != null) {
			generator.writeKey("from");
			JsonpUtils.serializeDoubleOrNull(generator, this.from, 0);
		}
		if (this.key != null) {
			generator.writeKey("key");
			generator.write(this.key);

		}
		if (this.to != null) {
			generator.writeKey("to");
			JsonpUtils.serializeDoubleOrNull(generator, this.to, 0);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AggregationRange}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<AggregationRange> {
		@Nullable
		private Double from;

		@Nullable
		private String key;

		@Nullable
		private Double to;

		/**
		 * Start of the range (inclusive).
		 * <p>
		 * API name: {@code from}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder from(@Nullable Double value) {
			this.from = value;
			return this;
		}

		/**
		 * Custom key to return the range with.
		 * <p>
		 * API name: {@code key}
		 */
		public final Builder key(@Nullable String value) {
			this.key = value;
			return this;
		}

		/**
		 * End of the range (exclusive).
		 * <p>
		 * API name: {@code to}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder to(@Nullable Double value) {
			this.to = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AggregationRange}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AggregationRange build() {
			_checkSingleUse();

			return new AggregationRange(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AggregationRange}
	 */
	public static final JsonpDeserializer<AggregationRange> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AggregationRange::setupAggregationRangeDeserializer);

	protected static void setupAggregationRangeDeserializer(ObjectDeserializer<AggregationRange.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.doubleOrNullDeserializer(0), "from");
		op.add(Builder::key, JsonpDeserializer.stringDeserializer(), "key");
		op.add(Builder::to, JsonpDeserializer.doubleOrNullDeserializer(0), "to");

	}

}
