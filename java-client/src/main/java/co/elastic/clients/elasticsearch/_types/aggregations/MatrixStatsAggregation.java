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

import co.elastic.clients.elasticsearch._types.SortMode;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MatrixStatsAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MatrixStatsAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class MatrixStatsAggregation extends MatrixAggregation implements AggregationVariant {
	@Nullable
	private final SortMode mode;

	// ---------------------------------------------------------------------------------------------

	private MatrixStatsAggregation(Builder builder) {
		super(builder);

		this.mode = builder.mode;

	}

	public static MatrixStatsAggregation of(Function<Builder, ObjectBuilder<MatrixStatsAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.MatrixStats;
	}

	/**
	 * API name: {@code mode}
	 */
	@Nullable
	public final SortMode mode() {
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
		private SortMode mode;

		/**
		 * API name: {@code mode}
		 */
		public final Builder mode(@Nullable SortMode value) {
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
			_checkSingleUse();

			return new MatrixStatsAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MatrixStatsAggregation}
	 */
	public static final JsonpDeserializer<MatrixStatsAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MatrixStatsAggregation::setupMatrixStatsAggregationDeserializer);

	protected static void setupMatrixStatsAggregationDeserializer(
			ObjectDeserializer<MatrixStatsAggregation.Builder> op) {
		MatrixAggregation.setupMatrixAggregationDeserializer(op);
		op.add(Builder::mode, SortMode._DESERIALIZER, "mode");

	}

}
