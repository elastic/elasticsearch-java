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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingFunctionAggregation
public final class MovingFunctionAggregation extends PipelineAggregationBase {
	@Nullable
	private final String script;

	@Nullable
	private final Number shift;

	@Nullable
	private final Number window;

	// ---------------------------------------------------------------------------------------------

	protected MovingFunctionAggregation(Builder builder) {
		super(builder);
		this.script = builder.script;
		this.shift = builder.shift;
		this.window = builder.window;

	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public String script() {
		return this.script;
	}

	/**
	 * API name: {@code shift}
	 */
	@Nullable
	public Number shift() {
		return this.shift;
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
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.shift != null) {

			generator.writeKey("shift");
			generator.write(this.shift.doubleValue());

		}
		if (this.window != null) {

			generator.writeKey("window");
			generator.write(this.window.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingFunctionAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingFunctionAggregation> {
		@Nullable
		private String script;

		@Nullable
		private Number shift;

		@Nullable
		private Number window;

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable String value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shift}
		 */
		public Builder shift(@Nullable Number value) {
			this.shift = value;
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
		 * Builds a {@link MovingFunctionAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingFunctionAggregation build() {

			return new MovingFunctionAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MovingFunctionAggregation
	 */
	public static final JsonpDeserializer<MovingFunctionAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MovingFunctionAggregation::setupMovingFunctionAggregationDeserializer);

	protected static void setupMovingFunctionAggregationDeserializer(
			DelegatingDeserializer<MovingFunctionAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::script, JsonpDeserializer.stringDeserializer(), "script");
		op.add(Builder::shift, JsonpDeserializer.numberDeserializer(), "shift");
		op.add(Builder::window, JsonpDeserializer.numberDeserializer(), "window");

	}

}
