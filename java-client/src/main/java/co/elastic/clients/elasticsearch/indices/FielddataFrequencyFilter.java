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
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: indices._types.FielddataFrequencyFilter

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.FielddataFrequencyFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class FielddataFrequencyFilter implements JsonpSerializable {
	private final double max;

	private final double min;

	private final int minSegmentSize;

	// ---------------------------------------------------------------------------------------------

	private FielddataFrequencyFilter(Builder builder) {

		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");
		this.min = ApiTypeHelper.requireNonNull(builder.min, this, "min");
		this.minSegmentSize = ApiTypeHelper.requireNonNull(builder.minSegmentSize, this, "minSegmentSize");

	}

	public static FielddataFrequencyFilter of(Function<Builder, ObjectBuilder<FielddataFrequencyFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final double max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final double min() {
		return this.min;
	}

	/**
	 * Required - API name: {@code min_segment_size}
	 */
	public final int minSegmentSize() {
		return this.minSegmentSize;
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

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("min");
		generator.write(this.min);

		generator.writeKey("min_segment_size");
		generator.write(this.minSegmentSize);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FielddataFrequencyFilter}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FielddataFrequencyFilter> {
		private Double max;

		private Double min;

		private Integer minSegmentSize;

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(double value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - API name: {@code min}
		 */
		public final Builder min(double value) {
			this.min = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_segment_size}
		 */
		public final Builder minSegmentSize(int value) {
			this.minSegmentSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FielddataFrequencyFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FielddataFrequencyFilter build() {
			_checkSingleUse();

			return new FielddataFrequencyFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FielddataFrequencyFilter}
	 */
	public static final JsonpDeserializer<FielddataFrequencyFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FielddataFrequencyFilter::setupFielddataFrequencyFilterDeserializer);

	protected static void setupFielddataFrequencyFilterDeserializer(
			ObjectDeserializer<FielddataFrequencyFilter.Builder> op) {

		op.add(Builder::max, JsonpDeserializer.doubleDeserializer(), "max");
		op.add(Builder::min, JsonpDeserializer.doubleDeserializer(), "min");
		op.add(Builder::minSegmentSize, JsonpDeserializer.integerDeserializer(), "min_segment_size");

	}

}
