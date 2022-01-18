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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SerialDifferencingAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SerialDifferencingAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class SerialDifferencingAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final Integer lag;

	// ---------------------------------------------------------------------------------------------

	private SerialDifferencingAggregation(Builder builder) {
		super(builder);

		this.lag = builder.lag;

	}

	public static SerialDifferencingAggregation of(Function<Builder, ObjectBuilder<SerialDifferencingAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.SerialDiff;
	}

	/**
	 * API name: {@code lag}
	 */
	@Nullable
	public final Integer lag() {
		return this.lag;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.lag != null) {
			generator.writeKey("lag");
			generator.write(this.lag);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SerialDifferencingAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SerialDifferencingAggregation> {
		@Nullable
		private Integer lag;

		/**
		 * API name: {@code lag}
		 */
		public final Builder lag(@Nullable Integer value) {
			this.lag = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SerialDifferencingAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SerialDifferencingAggregation build() {
			_checkSingleUse();

			return new SerialDifferencingAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SerialDifferencingAggregation}
	 */
	public static final JsonpDeserializer<SerialDifferencingAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SerialDifferencingAggregation::setupSerialDifferencingAggregationDeserializer);

	protected static void setupSerialDifferencingAggregationDeserializer(
			ObjectDeserializer<SerialDifferencingAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::lag, JsonpDeserializer.integerDeserializer(), "lag");

	}

}
