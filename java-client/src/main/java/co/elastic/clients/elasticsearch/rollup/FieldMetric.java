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

// typedef: rollup._types.FieldMetric

/**
 *
 * @see <a href="../doc-files/api-spec.html#rollup._types.FieldMetric">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldMetric implements JsonpSerializable {
	private final String field;

	private final List<Metric> metrics;

	// ---------------------------------------------------------------------------------------------

	private FieldMetric(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.metrics = ApiTypeHelper.unmodifiableRequired(builder.metrics, this, "metrics");

	}

	public static FieldMetric of(Function<Builder, ObjectBuilder<FieldMetric>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The field to collect metrics for. This must be a numeric of some
	 * kind.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - An array of metrics to collect for the field. At least one metric
	 * must be configured.
	 * <p>
	 * API name: {@code metrics}
	 */
	public final List<Metric> metrics() {
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

		generator.writeKey("field");
		generator.write(this.field);

		if (ApiTypeHelper.isDefined(this.metrics)) {
			generator.writeKey("metrics");
			generator.writeStartArray();
			for (Metric item0 : this.metrics) {
				item0.serialize(generator, mapper);
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
	 * Builder for {@link FieldMetric}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldMetric> {
		private String field;

		private List<Metric> metrics;

		/**
		 * Required - The field to collect metrics for. This must be a numeric of some
		 * kind.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - An array of metrics to collect for the field. At least one metric
		 * must be configured.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metrics</code>.
		 */
		public final Builder metrics(List<Metric> list) {
			this.metrics = _listAddAll(this.metrics, list);
			return this;
		}

		/**
		 * Required - An array of metrics to collect for the field. At least one metric
		 * must be configured.
		 * <p>
		 * API name: {@code metrics}
		 * <p>
		 * Adds one or more values to <code>metrics</code>.
		 */
		public final Builder metrics(Metric value, Metric... values) {
			this.metrics = _listAdd(this.metrics, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldMetric}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldMetric build() {
			_checkSingleUse();

			return new FieldMetric(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldMetric}
	 */
	public static final JsonpDeserializer<FieldMetric> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldMetric::setupFieldMetricDeserializer);

	protected static void setupFieldMetricDeserializer(ObjectDeserializer<FieldMetric.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(Metric._DESERIALIZER), "metrics");

	}

}
