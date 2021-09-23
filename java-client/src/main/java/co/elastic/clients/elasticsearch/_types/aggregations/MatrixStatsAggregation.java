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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MatrixStatsAggregation
public final class MatrixStatsAggregation extends MatrixAggregation {
	@Nullable
	private final MatrixStatsMode mode;

	// ---------------------------------------------------------------------------------------------

	public MatrixStatsAggregation(Builder builder) {
		super(builder);

		this.mode = builder.mode;

	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public MatrixStatsMode mode() {
		return this.mode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.mode != null) {

			generator.writeKey("mode");
			this.mode.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MatrixStatsAggregation}.
	 */
	public static class Builder extends MatrixAggregation.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MatrixStatsAggregation> {
		@Nullable
		private MatrixStatsMode mode;

		/**
		 * API name: {@code mode}
		 */
		public Builder mode(@Nullable MatrixStatsMode value) {
			this.mode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MatrixStatsAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MatrixStatsAggregation build() {

			return new MatrixStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatrixStatsAggregation}
	 */
	public static final JsonpDeserializer<MatrixStatsAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MatrixStatsAggregation::setupMatrixStatsAggregationDeserializer);

	protected static void setupMatrixStatsAggregationDeserializer(
			DelegatingDeserializer<MatrixStatsAggregation.Builder> op) {
		MatrixAggregation.setupMatrixAggregationDeserializer(op);
		op.add(Builder::mode, MatrixStatsMode.DESERIALIZER, "mode");

	}

}
