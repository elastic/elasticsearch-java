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
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: _types.aggregations.TopMetrics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TopMetrics">API
 *      specification</a>
 */
@JsonpDeserializable
public class TopMetrics implements JsonpSerializable {
	private final List<FieldValue> sort;

	private final Map<String, FieldValue> metrics;

	// ---------------------------------------------------------------------------------------------

	private TopMetrics(Builder builder) {

		this.sort = ApiTypeHelper.unmodifiableRequired(builder.sort, this, "sort");
		this.metrics = ApiTypeHelper.unmodifiableRequired(builder.metrics, this, "metrics");

	}

	public static TopMetrics of(Function<Builder, ObjectBuilder<TopMetrics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code sort}
	 */
	public final List<FieldValue> sort() {
		return this.sort;
	}

	/**
	 * Required - API name: {@code metrics}
	 */
	public final Map<String, FieldValue> metrics() {
		return this.metrics;
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

		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartArray();
			for (FieldValue item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartObject();
			for (Map.Entry<String, FieldValue> item0 : this.metrics.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TopMetrics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TopMetrics> {
		private List<FieldValue> sort;

		private Map<String, FieldValue> metrics;

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<FieldValue> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(FieldValue value, FieldValue... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(String value, String... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (String v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(long value, long... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (long v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(double value, double... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (double v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(boolean value, boolean... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (boolean v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Required - API name: {@code sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return sort(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metrics</code>.
		 */
		public final Builder metrics(Map<String, FieldValue> map) {
			this.metrics = _mapPutAll(this.metrics, map);
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code>.
		 */
		public final Builder metrics(String key, FieldValue value) {
			this.metrics = _mapPut(this.metrics, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code>.
		 */
		public final Builder metrics(String key, String value) {
			this.metrics = _mapPut(this.metrics, key, FieldValue.of(value));
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code>.
		 */
		public final Builder metrics(String key, long value) {
			this.metrics = _mapPut(this.metrics, key, FieldValue.of(value));
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code>.
		 */
		public final Builder metrics(String key, double value) {
			this.metrics = _mapPut(this.metrics, key, FieldValue.of(value));
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code>.
		 */
		public final Builder metrics(String key, boolean value) {
			this.metrics = _mapPut(this.metrics, key, FieldValue.of(value));
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 * <p>
		 * Adds an entry to <code>metrics</code> using a builder lambda.
		 */
		public final Builder metrics(String key, Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return metrics(key, fn.apply(new FieldValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TopMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TopMetrics build() {
			_checkSingleUse();

			return new TopMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TopMetrics}
	 */
	public static final JsonpDeserializer<TopMetrics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TopMetrics::setupTopMetricsDeserializer);

	protected static void setupTopMetricsDeserializer(ObjectDeserializer<TopMetrics.Builder> op) {

		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "sort");
		op.add(Builder::metrics, JsonpDeserializer.stringMapDeserializer(FieldValue._DESERIALIZER), "metrics");

	}

}
