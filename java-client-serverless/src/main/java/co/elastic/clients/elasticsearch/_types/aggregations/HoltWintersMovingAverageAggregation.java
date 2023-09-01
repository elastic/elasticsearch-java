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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.HoltWintersMovingAverageAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.HoltWintersMovingAverageAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class HoltWintersMovingAverageAggregation extends MovingAverageAggregationBase
		implements
			MovingAverageAggregationVariant {
	private final HoltWintersModelSettings settings;

	// ---------------------------------------------------------------------------------------------

	private HoltWintersMovingAverageAggregation(Builder builder) {
		super(builder);

		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

	}

	public static HoltWintersMovingAverageAggregation of(
			Function<Builder, ObjectBuilder<HoltWintersMovingAverageAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * MovingAverageAggregation variant kind.
	 */
	@Override
	public MovingAverageAggregation.Kind _movingAverageAggregationKind() {
		return MovingAverageAggregation.Kind.HoltWinters;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final HoltWintersModelSettings settings() {
		return this.settings;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("model", "holt_winters");
		super.serializeInternal(generator, mapper);
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HoltWintersMovingAverageAggregation}.
	 */

	public static class Builder extends MovingAverageAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HoltWintersMovingAverageAggregation> {
		private HoltWintersModelSettings settings;

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(HoltWintersModelSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(
				Function<HoltWintersModelSettings.Builder, ObjectBuilder<HoltWintersModelSettings>> fn) {
			return this.settings(fn.apply(new HoltWintersModelSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HoltWintersMovingAverageAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HoltWintersMovingAverageAggregation build() {
			_checkSingleUse();

			return new HoltWintersMovingAverageAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HoltWintersMovingAverageAggregation}
	 */
	public static final JsonpDeserializer<HoltWintersMovingAverageAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					HoltWintersMovingAverageAggregation::setupHoltWintersMovingAverageAggregationDeserializer);

	protected static void setupHoltWintersMovingAverageAggregationDeserializer(
			ObjectDeserializer<HoltWintersMovingAverageAggregation.Builder> op) {
		MovingAverageAggregationBase.setupMovingAverageAggregationBaseDeserializer(op);
		op.add(Builder::settings, HoltWintersModelSettings._DESERIALIZER, "settings");

		op.ignore("model");
	}

}
