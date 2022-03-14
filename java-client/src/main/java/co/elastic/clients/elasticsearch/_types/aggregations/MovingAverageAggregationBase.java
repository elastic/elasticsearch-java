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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingAverageAggregationBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MovingAverageAggregationBase">API
 *      specification</a>
 */

public abstract class MovingAverageAggregationBase extends PipelineAggregationBase {
	@Nullable
	private final Boolean minimize;

	@Nullable
	private final Integer predict;

	@Nullable
	private final Integer window;

	// ---------------------------------------------------------------------------------------------

	protected MovingAverageAggregationBase(AbstractBuilder<?> builder) {
		super(builder);

		this.minimize = builder.minimize;
		this.predict = builder.predict;
		this.window = builder.window;

	}

	/**
	 * API name: {@code minimize}
	 */
	@Nullable
	public final Boolean minimize() {
		return this.minimize;
	}

	/**
	 * API name: {@code predict}
	 */
	@Nullable
	public final Integer predict() {
		return this.predict;
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
		if (this.minimize != null) {
			generator.writeKey("minimize");
			generator.write(this.minimize);

		}
		if (this.predict != null) {
			generator.writeKey("predict");
			generator.write(this.predict);

		}
		if (this.window != null) {
			generator.writeKey("window");
			generator.write(this.window);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				PipelineAggregationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean minimize;

		@Nullable
		private Integer predict;

		@Nullable
		private Integer window;

		/**
		 * API name: {@code minimize}
		 */
		public final BuilderT minimize(@Nullable Boolean value) {
			this.minimize = value;
			return self();
		}

		/**
		 * API name: {@code predict}
		 */
		public final BuilderT predict(@Nullable Integer value) {
			this.predict = value;
			return self();
		}

		/**
		 * API name: {@code window}
		 */
		public final BuilderT window(@Nullable Integer value) {
			this.window = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMovingAverageAggregationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(AbstractBuilder::minimize, JsonpDeserializer.booleanDeserializer(), "minimize");
		op.add(AbstractBuilder::predict, JsonpDeserializer.integerDeserializer(), "predict");
		op.add(AbstractBuilder::window, JsonpDeserializer.integerDeserializer(), "window");

	}

}
