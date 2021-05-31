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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregation
public final class MovingAverageAggregation extends PipelineAggregationBase {
	@Nullable
	private final Boolean minimize;

	@Nullable
	private final JsonValue model;

	private final JsonValue settings;

	@Nullable
	private final Number predict;

	@Nullable
	private final Number window;

	// ---------------------------------------------------------------------------------------------

	protected MovingAverageAggregation(Builder builder) {
		super(builder);
		this.minimize = builder.minimize;
		this.model = builder.model;
		this.settings = Objects.requireNonNull(builder.settings, "settings");
		this.predict = builder.predict;
		this.window = builder.window;

	}

	/**
	 * API name: {@code minimize}
	 */
	@Nullable
	public Boolean minimize() {
		return this.minimize;
	}

	/**
	 * API name: {@code model}
	 */
	@Nullable
	public JsonValue model() {
		return this.model;
	}

	/**
	 * API name: {@code settings}
	 */
	public JsonValue settings() {
		return this.settings;
	}

	/**
	 * API name: {@code predict}
	 */
	@Nullable
	public Number predict() {
		return this.predict;
	}

	/**
	 * API name: {@code window}
	 */
	@Nullable
	public Number window() {
		return this.window;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.minimize != null) {

			generator.writeKey("minimize");
			generator.write(this.minimize);

		}
		if (this.model != null) {

			generator.writeKey("model");
			generator.write(this.model);

		}

		generator.writeKey("settings");
		generator.write(this.settings);

		if (this.predict != null) {

			generator.writeKey("predict");
			generator.write(this.predict.doubleValue());

		}
		if (this.window != null) {

			generator.writeKey("window");
			generator.write(this.window.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingAverageAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingAverageAggregation> {
		@Nullable
		private Boolean minimize;

		@Nullable
		private JsonValue model;

		private JsonValue settings;

		@Nullable
		private Number predict;

		@Nullable
		private Number window;

		/**
		 * API name: {@code minimize}
		 */
		public Builder minimize(@Nullable Boolean value) {
			this.minimize = value;
			return this;
		}

		/**
		 * API name: {@code model}
		 */
		public Builder model(@Nullable JsonValue value) {
			this.model = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(JsonValue value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code predict}
		 */
		public Builder predict(@Nullable Number value) {
			this.predict = value;
			return this;
		}

		/**
		 * API name: {@code window}
		 */
		public Builder window(@Nullable Number value) {
			this.window = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MovingAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingAverageAggregation build() {

			return new MovingAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for MovingAverageAggregation
	 */
	public static final JsonpValueParser<MovingAverageAggregation> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, MovingAverageAggregation::setupMovingAverageAggregationParser);

	protected static void setupMovingAverageAggregationParser(
			DelegatingJsonpValueParser<MovingAverageAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseParser(op);
		op.add(Builder::minimize, JsonpValueParser.booleanParser(), "minimize");
		op.add(Builder::model, JsonpValueParser.jsonValueParser(), "model");
		op.add(Builder::settings, JsonpValueParser.jsonValueParser(), "settings");
		op.add(Builder::predict, JsonpValueParser.numberParser(), "predict");
		op.add(Builder::window, JsonpValueParser.numberParser(), "window");

	}

}
