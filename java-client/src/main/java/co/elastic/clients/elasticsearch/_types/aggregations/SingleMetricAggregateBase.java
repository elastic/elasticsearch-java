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
import javax.annotation.Nullable;

// typedef: _types.aggregations.SingleMetricAggregateBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SingleMetricAggregateBase">API
 *      specification</a>
 */

public abstract class SingleMetricAggregateBase extends AggregateBase {
	private final double value;

	@Nullable
	private final String valueAsString;

	// ---------------------------------------------------------------------------------------------

	protected SingleMetricAggregateBase(AbstractBuilder<?> builder) {
		super(builder);

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.valueAsString = builder.valueAsString;

	}

	/**
	 * Required - The metric value. A missing value generally means that there was
	 * no data to aggregate, unless specified otherwise.
	 * <p>
	 * API name: {@code value}
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

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("value");
		JsonpUtils.serializeDoubleOrNull(generator, this.value, 0);
		if (this.valueAsString != null) {
			generator.writeKey("value_as_string");
			generator.write(this.valueAsString);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregateBase.AbstractBuilder<BuilderT> {
		private Double value;

		@Nullable
		private String valueAsString;

		/**
		 * Required - The metric value. A missing value generally means that there was
		 * no data to aggregate, unless specified otherwise.
		 * <p>
		 * API name: {@code value}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final BuilderT value(double value) {
			this.value = value;
			return self();
		}

		/**
		 * API name: {@code value_as_string}
		 */
		public final BuilderT valueAsString(@Nullable String value) {
			this.valueAsString = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSingleMetricAggregateBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(AbstractBuilder::value, JsonpDeserializer.doubleOrNullDeserializer(0), "value");
		op.add(AbstractBuilder::valueAsString, JsonpDeserializer.stringDeserializer(), "value_as_string");

	}

}
