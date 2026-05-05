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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.aggregations.StatsAggregate

/**
 * Statistics aggregation result. <code>min</code>, <code>max</code> and
 * <code>avg</code> are missing if there were no values to process
 * (<code>count</code> is zero).
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.StatsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class StatsAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	@Nullable
	private final Double min;

	@Nullable
	private final Double max;

	@Nullable
	private final Double avg;

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

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.min = builder.min;
		this.max = builder.max;
		this.avg = builder.avg;
		this.sum = ApiTypeHelper.requireNonNull(builder.sum, this, "sum", 0);
		this.minAsString = builder.minAsString;
		this.maxAsString = builder.maxAsString;
		this.avgAsString = builder.avgAsString;
		this.sumAsString = builder.sumAsString;

	}

	public static StatsAggregate statsAggregateOf(Function<Builder, ObjectBuilder<StatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Stats;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code min}
	 */
	@Nullable
	public final Double min() {
		return this.min;
	}

	/**
	 * API name: {@code max}
	 */
	@Nullable
	public final Double max() {
		return this.max;
	}

	/**
	 * API name: {@code avg}
	 */
	@Nullable
	public final Double avg() {
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

		if (this.min != null) {
			generator.writeKey("min");
			generator.write(this.min);

		}
		if (this.max != null) {
			generator.writeKey("max");
			generator.write(this.max);

		}
		if (this.avg != null) {
			generator.writeKey("avg");
			generator.write(this.avg);

		}
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregateBase.AbstractBuilder<BuilderT> {
		private Long count;

		@Nullable
		private Double min;

		@Nullable
		private Double max;

		@Nullable
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
		 * API name: {@code min}
		 */
		public final BuilderT min(@Nullable Double value) {
			this.min = value;
			return self();
		}

		/**
		 * API name: {@code max}
		 */
		public final BuilderT max(@Nullable Double value) {
			this.max = value;
			return self();
		}

		/**
		 * API name: {@code avg}
		 */
		public final BuilderT avg(@Nullable Double value) {
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
			StatsAggregate::setupStatsAggregateDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupStatsAggregateDeserializer(
			ObjectDeserializer<BuilderT> op) {
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
