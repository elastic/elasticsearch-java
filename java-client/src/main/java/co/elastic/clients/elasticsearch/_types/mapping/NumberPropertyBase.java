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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.NumberPropertyBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.NumberPropertyBase">API
 *      specification</a>
 */

public abstract class NumberPropertyBase extends DocValuesPropertyBase {
	@Nullable
	private final Boolean index;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	// ---------------------------------------------------------------------------------------------

	protected NumberPropertyBase(AbstractBuilder<?> builder) {
		super(builder);

		this.index = builder.index;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.timeSeriesMetric = builder.timeSeriesMetric;

	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				DocValuesPropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean index;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		/**
		 * API name: {@code index}
		 */
		public final BuilderT index(@Nullable Boolean value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final BuilderT ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return self();
		}

		/**
		 * API name: {@code time_series_metric}
		 */
		public final BuilderT timeSeriesMetric(@Nullable TimeSeriesMetricType value) {
			this.timeSeriesMetric = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupNumberPropertyBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(AbstractBuilder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(AbstractBuilder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(AbstractBuilder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");

	}

}
