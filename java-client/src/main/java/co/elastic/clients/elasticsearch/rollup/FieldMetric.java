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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup._types.FieldMetric
@JsonpDeserializable
public final class FieldMetric implements JsonpSerializable {
	private final String field;

	private final List<Metric> metrics;

	// ---------------------------------------------------------------------------------------------

	public FieldMetric(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.metrics = ModelTypeHelper.unmodifiableNonNull(builder.metrics, "metrics");

	}

	public FieldMetric(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code metrics}
	 */
	public List<Metric> metrics() {
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

		generator.writeKey("metrics");
		generator.writeStartArray();
		for (Metric item0 : this.metrics) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldMetric}.
	 */
	public static class Builder implements ObjectBuilder<FieldMetric> {
		private String field;

		private List<Metric> metrics;

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		public Builder metrics(List<Metric> value) {
			this.metrics = value;
			return this;
		}

		/**
		 * Required - API name: {@code metrics}
		 */
		public Builder metrics(Metric... value) {
			this.metrics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metrics(List)}, creating the list if needed.
		 */
		public Builder addMetrics(Metric value) {
			if (this.metrics == null) {
				this.metrics = new ArrayList<>();
			}
			this.metrics.add(value);
			return this;
		}

		/**
		 * Builds a {@link FieldMetric}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldMetric build() {

			return new FieldMetric(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldMetric}
	 */
	public static final JsonpDeserializer<FieldMetric> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldMetric::setupFieldMetricDeserializer, Builder::build);

	protected static void setupFieldMetricDeserializer(DelegatingDeserializer<FieldMetric.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::metrics, JsonpDeserializer.arrayDeserializer(Metric._DESERIALIZER), "metrics");

	}

}
