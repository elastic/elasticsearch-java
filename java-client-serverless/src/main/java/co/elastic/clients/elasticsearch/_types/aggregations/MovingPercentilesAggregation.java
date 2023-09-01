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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingPercentilesAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MovingPercentilesAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MovingPercentilesAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final Integer window;

	@Nullable
	private final Integer shift;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	private MovingPercentilesAggregation(Builder builder) {
		super(builder);

		this.window = builder.window;
		this.shift = builder.shift;
		this.keyed = builder.keyed;

	}

	public static MovingPercentilesAggregation of(Function<Builder, ObjectBuilder<MovingPercentilesAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MovingPercentiles;
	}

	/**
	 * The size of window to &quot;slide&quot; across the histogram.
	 * <p>
	 * API name: {@code window}
	 */
	@Nullable
	public final Integer window() {
		return this.window;
	}

	/**
	 * By default, the window consists of the last n values excluding the current
	 * bucket. Increasing <code>shift</code> by 1, moves the starting window
	 * position by 1 to the right.
	 * <p>
	 * API name: {@code shift}
	 */
	@Nullable
	public final Integer shift() {
		return this.shift;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public final Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.window != null) {
			generator.writeKey("window");
			generator.write(this.window);

		}
		if (this.shift != null) {
			generator.writeKey("shift");
			generator.write(this.shift);

		}
		if (this.keyed != null) {
			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingPercentilesAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingPercentilesAggregation> {
		@Nullable
		private Integer window;

		@Nullable
		private Integer shift;

		@Nullable
		private Boolean keyed;

		/**
		 * The size of window to &quot;slide&quot; across the histogram.
		 * <p>
		 * API name: {@code window}
		 */
		public final Builder window(@Nullable Integer value) {
			this.window = value;
			return this;
		}

		/**
		 * By default, the window consists of the last n values excluding the current
		 * bucket. Increasing <code>shift</code> by 1, moves the starting window
		 * position by 1 to the right.
		 * <p>
		 * API name: {@code shift}
		 */
		public final Builder shift(@Nullable Integer value) {
			this.shift = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public final Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MovingPercentilesAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingPercentilesAggregation build() {
			_checkSingleUse();

			return new MovingPercentilesAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MovingPercentilesAggregation}
	 */
	public static final JsonpDeserializer<MovingPercentilesAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingPercentilesAggregation::setupMovingPercentilesAggregationDeserializer);

	protected static void setupMovingPercentilesAggregationDeserializer(
			ObjectDeserializer<MovingPercentilesAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::window, JsonpDeserializer.integerDeserializer(), "window");
		op.add(Builder::shift, JsonpDeserializer.integerDeserializer(), "shift");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
