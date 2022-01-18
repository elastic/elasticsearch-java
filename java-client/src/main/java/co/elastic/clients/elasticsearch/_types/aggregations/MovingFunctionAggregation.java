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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingFunctionAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MovingFunctionAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MovingFunctionAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final String script;

	@Nullable
	private final Integer shift;

	@Nullable
	private final Integer window;

	// ---------------------------------------------------------------------------------------------

	private MovingFunctionAggregation(Builder builder) {
		super(builder);

		this.script = builder.script;
		this.shift = builder.shift;
		this.window = builder.window;

	}

	public static MovingFunctionAggregation of(Function<Builder, ObjectBuilder<MovingFunctionAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MovingFn;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final String script() {
		return this.script;
	}

	/**
	 * API name: {@code shift}
	 */
	@Nullable
	public final Integer shift() {
		return this.shift;
	}

	/**
	 * API name: {@code window}
	 */
	@Nullable
	public final Integer window() {
		return this.window;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.script != null) {
			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.shift != null) {
			generator.writeKey("shift");
			generator.write(this.shift);

		}
		if (this.window != null) {
			generator.writeKey("window");
			generator.write(this.window);

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
		private Integer shift;

		@Nullable
		private Integer window;

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable String value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shift}
		 */
		public final Builder shift(@Nullable Integer value) {
			this.shift = value;
			return this;
		}

		/**
		 * API name: {@code window}
		 */
		public final Builder window(@Nullable Integer value) {
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
			_checkSingleUse();

			return new MovingFunctionAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MovingFunctionAggregation}
	 */
	public static final JsonpDeserializer<MovingFunctionAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingFunctionAggregation::setupMovingFunctionAggregationDeserializer);

	protected static void setupMovingFunctionAggregationDeserializer(
			ObjectDeserializer<MovingFunctionAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::script, JsonpDeserializer.stringDeserializer(), "script");
		op.add(Builder::shift, JsonpDeserializer.integerDeserializer(), "shift");
		op.add(Builder::window, JsonpDeserializer.integerDeserializer(), "window");

	}

}
