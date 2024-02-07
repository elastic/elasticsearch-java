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

package co.elastic.clients.elasticsearch.rollup;

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
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: rollup._types.HistogramGrouping

/**
 *
 * @see <a href="../doc-files/api-spec.html#rollup._types.HistogramGrouping">API
 *      specification</a>
 */
@JsonpDeserializable
public class HistogramGrouping implements JsonpSerializable {
	private final List<String> fields;

	private final long interval;

	// ---------------------------------------------------------------------------------------------

	private HistogramGrouping(Builder builder) {

		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.interval = ApiTypeHelper.requireNonNull(builder.interval, this, "interval");

	}

	public static HistogramGrouping of(Function<Builder, ObjectBuilder<HistogramGrouping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The set of fields that you wish to build histograms for. All
	 * fields specified must be some kind of numeric. Order does not matter.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Required - The interval of histogram buckets to be generated when rolling up.
	 * For example, a value of <code>5</code> creates buckets that are five units
	 * wide (<code>0-5</code>, <code>5-10</code>, etc). Note that only one interval
	 * can be specified in the histogram group, meaning that all fields being
	 * grouped via the histogram must share the same interval.
	 * <p>
	 * API name: {@code interval}
	 */
	public final long interval() {
		return this.interval;
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

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("interval");
		generator.write(this.interval);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramGrouping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<HistogramGrouping> {
		private List<String> fields;

		private Long interval;

		/**
		 * Required - The set of fields that you wish to build histograms for. All
		 * fields specified must be some kind of numeric. Order does not matter.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * Required - The set of fields that you wish to build histograms for. All
		 * fields specified must be some kind of numeric. Order does not matter.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Required - The interval of histogram buckets to be generated when rolling up.
		 * For example, a value of <code>5</code> creates buckets that are five units
		 * wide (<code>0-5</code>, <code>5-10</code>, etc). Note that only one interval
		 * can be specified in the histogram group, meaning that all fields being
		 * grouped via the histogram must share the same interval.
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(long value) {
			this.interval = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HistogramGrouping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HistogramGrouping build() {
			_checkSingleUse();

			return new HistogramGrouping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HistogramGrouping}
	 */
	public static final JsonpDeserializer<HistogramGrouping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HistogramGrouping::setupHistogramGroupingDeserializer);

	protected static void setupHistogramGroupingDeserializer(ObjectDeserializer<HistogramGrouping.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::interval, JsonpDeserializer.longDeserializer(), "interval");

	}

}
