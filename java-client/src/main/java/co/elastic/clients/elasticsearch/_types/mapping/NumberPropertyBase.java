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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
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
	private final Double boost;

	@Nullable
	private final Boolean coerce;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Boolean index;

	@Nullable
	private final OnScriptError onScriptError;

	@Nullable
	private final Script script;

	@Nullable
	private final TimeSeriesMetricType timeSeriesMetric;

	@Nullable
	private final Boolean timeSeriesDimension;

	// ---------------------------------------------------------------------------------------------

	protected NumberPropertyBase(AbstractBuilder<?> builder) {
		super(builder);

		this.boost = builder.boost;
		this.coerce = builder.coerce;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.index = builder.index;
		this.onScriptError = builder.onScriptError;
		this.script = builder.script;
		this.timeSeriesMetric = builder.timeSeriesMetric;
		this.timeSeriesDimension = builder.timeSeriesDimension;

	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * For internal use by Elastic only. Marks the field as a time series dimension.
	 * Defaults to false.
	 * <p>
	 * API name: {@code time_series_metric}
	 */
	@Nullable
	public final TimeSeriesMetricType timeSeriesMetric() {
		return this.timeSeriesMetric;
	}

	/**
	 * For internal use by Elastic only. Marks the field as a time series dimension.
	 * Defaults to false.
	 * <p>
	 * API name: {@code time_series_dimension}
	 */
	@Nullable
	public final Boolean timeSeriesDimension() {
		return this.timeSeriesDimension;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.timeSeriesMetric != null) {
			generator.writeKey("time_series_metric");
			this.timeSeriesMetric.serialize(generator, mapper);
		}
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				DocValuesPropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Double boost;

		@Nullable
		private Boolean coerce;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Boolean index;

		@Nullable
		private OnScriptError onScriptError;

		@Nullable
		private Script script;

		@Nullable
		private TimeSeriesMetricType timeSeriesMetric;

		@Nullable
		private Boolean timeSeriesDimension;

		/**
		 * API name: {@code boost}
		 */
		public final BuilderT boost(@Nullable Double value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code coerce}
		 */
		public final BuilderT coerce(@Nullable Boolean value) {
			this.coerce = value;
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
		 * API name: {@code index}
		 */
		public final BuilderT index(@Nullable Boolean value) {
			this.index = value;
			return self();
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final BuilderT onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public final BuilderT script(@Nullable Script value) {
			this.script = value;
			return self();
		}

		/**
		 * API name: {@code script}
		 */
		public final BuilderT script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * For internal use by Elastic only. Marks the field as a time series dimension.
		 * Defaults to false.
		 * <p>
		 * API name: {@code time_series_metric}
		 */
		public final BuilderT timeSeriesMetric(@Nullable TimeSeriesMetricType value) {
			this.timeSeriesMetric = value;
			return self();
		}

		/**
		 * For internal use by Elastic only. Marks the field as a time series dimension.
		 * Defaults to false.
		 * <p>
		 * API name: {@code time_series_dimension}
		 */
		public final BuilderT timeSeriesDimension(@Nullable Boolean value) {
			this.timeSeriesDimension = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupNumberPropertyBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(AbstractBuilder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(AbstractBuilder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(AbstractBuilder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(AbstractBuilder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(AbstractBuilder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");
		op.add(AbstractBuilder::script, Script._DESERIALIZER, "script");
		op.add(AbstractBuilder::timeSeriesMetric, TimeSeriesMetricType._DESERIALIZER, "time_series_metric");
		op.add(AbstractBuilder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");

	}

}
