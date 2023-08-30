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
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PipelineAggregationBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.PipelineAggregationBase">API
 *      specification</a>
 */

public abstract class PipelineAggregationBase extends BucketPathAggregation {
	@Nullable
	private final String format;

	@Nullable
	private final GapPolicy gapPolicy;

	// ---------------------------------------------------------------------------------------------

	protected PipelineAggregationBase(AbstractBuilder<?> builder) {
		super(builder);

		this.format = builder.format;
		this.gapPolicy = builder.gapPolicy;

	}

	/**
	 * DecimalFormat pattern for the output value. If specified, the formatted value
	 * is returned in the aggregation’s <code>value_as_string</code> property.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * Policy to apply when gaps are found in the data.
	 * <p>
	 * API name: {@code gap_policy}
	 */
	@Nullable
	public final GapPolicy gapPolicy() {
		return this.gapPolicy;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.gapPolicy != null) {
			generator.writeKey("gap_policy");
			this.gapPolicy.serialize(generator, mapper);
		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				BucketPathAggregation.AbstractBuilder<BuilderT> {
		@Nullable
		private String format;

		@Nullable
		private GapPolicy gapPolicy;

		/**
		 * DecimalFormat pattern for the output value. If specified, the formatted value
		 * is returned in the aggregation’s <code>value_as_string</code> property.
		 * <p>
		 * API name: {@code format}
		 */
		public final BuilderT format(@Nullable String value) {
			this.format = value;
			return self();
		}

		/**
		 * Policy to apply when gaps are found in the data.
		 * <p>
		 * API name: {@code gap_policy}
		 */
		public final BuilderT gapPolicy(@Nullable GapPolicy value) {
			this.gapPolicy = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPipelineAggregationBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		BucketPathAggregation.setupBucketPathAggregationDeserializer(op);
		op.add(AbstractBuilder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(AbstractBuilder::gapPolicy, GapPolicy._DESERIALIZER, "gap_policy");

	}

}
