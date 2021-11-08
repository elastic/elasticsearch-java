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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AutoDateHistogramAggregate
@JsonpDeserializable
public class AutoDateHistogramAggregate extends MultiBucketAggregateBase<DateHistogramBucket>
		implements
			AggregateVariant {
	private final String interval;

	// ---------------------------------------------------------------------------------------------

	private AutoDateHistogramAggregate(Builder builder) {
		super(builder);

		this.interval = ModelTypeHelper.requireNonNull(builder.interval, this, "interval");

	}

	public static AutoDateHistogramAggregate of(Function<Builder, ObjectBuilder<AutoDateHistogramAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "auto_date_histogram";
	}

	/**
	 * Required - API name: {@code interval}
	 */
	public final String interval() {
		return this.interval;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("interval");
		generator.write(this.interval);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoDateHistogramAggregate}.
	 */
	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<DateHistogramBucket, Builder>
			implements
				ObjectBuilder<AutoDateHistogramAggregate> {
		private String interval;

		/**
		 * Required - API name: {@code interval}
		 */
		public final Builder interval(String value) {
			this.interval = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoDateHistogramAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoDateHistogramAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new AutoDateHistogramAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoDateHistogramAggregate}
	 */
	public static final JsonpDeserializer<AutoDateHistogramAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, AutoDateHistogramAggregate::setupAutoDateHistogramAggregateDeserializer, Builder::build);

	protected static void setupAutoDateHistogramAggregateDeserializer(
			DelegatingDeserializer<AutoDateHistogramAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, DateHistogramBucket._DESERIALIZER);
		op.add(Builder::interval, JsonpDeserializer.stringDeserializer(), "interval");

	}

}
