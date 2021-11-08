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
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StatsAggregate
@JsonpDeserializable
public class StatsAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	private final double min;

	private final double max;

	private final double avg;

	private final double sum;

	@Nullable
	private final String minAsString;

	@Nullable
	private final String maxAsString;

	@Nullable
	private final String avgAsString;

	@Nullable
	private final String sumAsString;

	// ---------------------------------------------------------------------------------------------

	protected StatsAggregate(AbstractBuilder<?> builder) {
		super(builder);

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.min = ModelTypeHelper.requireNonNull(builder.min, this, "min");
		this.max = ModelTypeHelper.requireNonNull(builder.max, this, "max");
		this.avg = ModelTypeHelper.requireNonNull(builder.avg, this, "avg");
		this.sum = ModelTypeHelper.requireNonNull(builder.sum, this, "sum");
		this.minAsString = builder.minAsString;
		this.maxAsString = builder.maxAsString;
		this.avgAsString = builder.avgAsString;
		this.sumAsString = builder.sumAsString;

	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "stats";
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final double min() {
		return this.min;
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final double max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code avg}
	 */
	public final double avg() {
		return this.avg;
	}

	/**
	 * Required - API name: {@code sum}
	 */
	public final double sum() {
		return this.sum;
	}

	/**
	 * API name: {@code min_as_string}
	 */
	@Nullable
	public final String minAsString() {
		return this.minAsString;
	}

	/**
	 * API name: {@code max_as_string}
	 */
	@Nullable
	public final String maxAsString() {
		return this.maxAsString;
	}

	/**
	 * API name: {@code avg_as_string}
	 */
	@Nullable
	public final String avgAsString() {
		return this.avgAsString;
	}

	/**
	 * API name: {@code sum_as_string}
	 */
	@Nullable
	public final String sumAsString() {
		return this.sumAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("min");
		generator.write(this.min);

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("avg");
		generator.write(this.avg);

		generator.writeKey("sum");
		generator.write(this.sum);

		if (this.minAsString != null) {
			generator.writeKey("min_as_string");
			generator.write(this.minAsString);

		}
		if (this.maxAsString != null) {
			generator.writeKey("max_as_string");
			generator.write(this.maxAsString);

		}
		if (this.avgAsString != null) {
			generator.writeKey("avg_as_string");
			generator.write(this.avgAsString);

		}
		if (this.sumAsString != null) {
			generator.writeKey("sum_as_string");
			generator.write(this.sumAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatsAggregate}.
	 */
	public static class Builder extends StatsAggregate.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StatsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StatsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatsAggregate build() {
			_checkSingleUse();

			return new StatsAggregate(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregateBase.AbstractBuilder<BuilderT> {
		private Long count;

		private Double min;

		private Double max;

		private Double avg;

		private Double sum;

		@Nullable
		private String minAsString;

		@Nullable
		private String maxAsString;

		@Nullable
		private String avgAsString;

		@Nullable
		private String sumAsString;

		/**
		 * Required - API name: {@code count}
		 */
		public final BuilderT count(long value) {
			this.count = value;
			return self();
		}

		/**
		 * Required - API name: {@code min}
		 */
		public final BuilderT min(double value) {
			this.min = value;
			return self();
		}

		/**
		 * Required - API name: {@code max}
		 */
		public final BuilderT max(double value) {
			this.max = value;
			return self();
		}

		/**
		 * Required - API name: {@code avg}
		 */
		public final BuilderT avg(double value) {
			this.avg = value;
			return self();
		}

		/**
		 * Required - API name: {@code sum}
		 */
		public final BuilderT sum(double value) {
			this.sum = value;
			return self();
		}

		/**
		 * API name: {@code min_as_string}
		 */
		public final BuilderT minAsString(@Nullable String value) {
			this.minAsString = value;
			return self();
		}

		/**
		 * API name: {@code max_as_string}
		 */
		public final BuilderT maxAsString(@Nullable String value) {
			this.maxAsString = value;
			return self();
		}

		/**
		 * API name: {@code avg_as_string}
		 */
		public final BuilderT avgAsString(@Nullable String value) {
			this.avgAsString = value;
			return self();
		}

		/**
		 * API name: {@code sum_as_string}
		 */
		public final BuilderT sumAsString(@Nullable String value) {
			this.sumAsString = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StatsAggregate}
	 */
	public static final JsonpDeserializer<StatsAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StatsAggregate::setupStatsAggregateDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupStatsAggregateDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(AbstractBuilder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(AbstractBuilder::min, JsonpDeserializer.doubleDeserializer(), "min");
		op.add(AbstractBuilder::max, JsonpDeserializer.doubleDeserializer(), "max");
		op.add(AbstractBuilder::avg, JsonpDeserializer.doubleDeserializer(), "avg");
		op.add(AbstractBuilder::sum, JsonpDeserializer.doubleDeserializer(), "sum");
		op.add(AbstractBuilder::minAsString, JsonpDeserializer.stringDeserializer(), "min_as_string");
		op.add(AbstractBuilder::maxAsString, JsonpDeserializer.stringDeserializer(), "max_as_string");
		op.add(AbstractBuilder::avgAsString, JsonpDeserializer.stringDeserializer(), "avg_as_string");
		op.add(AbstractBuilder::sumAsString, JsonpDeserializer.stringDeserializer(), "sum_as_string");

	}

}
