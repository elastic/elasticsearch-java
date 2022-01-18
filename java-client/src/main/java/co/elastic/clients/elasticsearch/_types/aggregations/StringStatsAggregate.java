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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StringStatsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.StringStatsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class StringStatsAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	private final int minLength;

	private final int maxLength;

	private final double avgLength;

	private final double entropy;

	private final Map<String, Double> distribution;

	@Nullable
	private final String minLengthAsString;

	@Nullable
	private final String maxLengthAsString;

	@Nullable
	private final String avgLengthAsString;

	// ---------------------------------------------------------------------------------------------

	private StringStatsAggregate(Builder builder) {
		super(builder);

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.minLength = ApiTypeHelper.requireNonNull(builder.minLength, this, "minLength");
		this.maxLength = ApiTypeHelper.requireNonNull(builder.maxLength, this, "maxLength");
		this.avgLength = ApiTypeHelper.requireNonNull(builder.avgLength, this, "avgLength");
		this.entropy = ApiTypeHelper.requireNonNull(builder.entropy, this, "entropy");
		this.distribution = ApiTypeHelper.unmodifiable(builder.distribution);
		this.minLengthAsString = builder.minLengthAsString;
		this.maxLengthAsString = builder.maxLengthAsString;
		this.avgLengthAsString = builder.avgLengthAsString;

	}

	public static StringStatsAggregate of(Function<Builder, ObjectBuilder<StringStatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.StringStats;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code min_length}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	public final int minLength() {
		return this.minLength;
	}

	/**
	 * Required - API name: {@code max_length}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	public final int maxLength() {
		return this.maxLength;
	}

	/**
	 * Required - API name: {@code avg_length}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	public final double avgLength() {
		return this.avgLength;
	}

	/**
	 * Required - API name: {@code entropy}
	 * <p>
	 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
	 */
	public final double entropy() {
		return this.entropy;
	}

	/**
	 * API name: {@code distribution}
	 */
	public final Map<String, Double> distribution() {
		return this.distribution;
	}

	/**
	 * API name: {@code min_length_as_string}
	 */
	@Nullable
	public final String minLengthAsString() {
		return this.minLengthAsString;
	}

	/**
	 * API name: {@code max_length_as_string}
	 */
	@Nullable
	public final String maxLengthAsString() {
		return this.maxLengthAsString;
	}

	/**
	 * API name: {@code avg_length_as_string}
	 */
	@Nullable
	public final String avgLengthAsString() {
		return this.avgLengthAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("min_length");
		JsonpUtils.serializeIntOrNull(generator, this.minLength, 0);
		generator.writeKey("max_length");
		JsonpUtils.serializeIntOrNull(generator, this.maxLength, 0);
		generator.writeKey("avg_length");
		JsonpUtils.serializeDoubleOrNull(generator, this.avgLength, 0);
		generator.writeKey("entropy");
		JsonpUtils.serializeDoubleOrNull(generator, this.entropy, 0);
		if (ApiTypeHelper.isDefined(this.distribution)) {
			generator.writeKey("distribution");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.distribution.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.minLengthAsString != null) {
			generator.writeKey("min_length_as_string");
			generator.write(this.minLengthAsString);

		}
		if (this.maxLengthAsString != null) {
			generator.writeKey("max_length_as_string");
			generator.write(this.maxLengthAsString);

		}
		if (this.avgLengthAsString != null) {
			generator.writeKey("avg_length_as_string");
			generator.write(this.avgLengthAsString);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StringStatsAggregate}.
	 */

	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StringStatsAggregate> {
		private Long count;

		private Integer minLength;

		private Integer maxLength;

		private Double avgLength;

		private Double entropy;

		@Nullable
		private Map<String, Double> distribution;

		@Nullable
		private String minLengthAsString;

		@Nullable
		private String maxLengthAsString;

		@Nullable
		private String avgLengthAsString;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code min_length}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder minLength(int value) {
			this.minLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_length}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder maxLength(int value) {
			this.maxLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_length}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder avgLength(double value) {
			this.avgLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code entropy}
		 * <p>
		 * Defaults to {@code 0} if parsed from a JSON {@code null} value.
		 */
		public final Builder entropy(double value) {
			this.entropy = value;
			return this;
		}

		/**
		 * API name: {@code distribution}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>distribution</code>.
		 */
		public final Builder distribution(Map<String, Double> map) {
			this.distribution = _mapPutAll(this.distribution, map);
			return this;
		}

		/**
		 * API name: {@code distribution}
		 * <p>
		 * Adds an entry to <code>distribution</code>.
		 */
		public final Builder distribution(String key, Double value) {
			this.distribution = _mapPut(this.distribution, key, value);
			return this;
		}

		/**
		 * API name: {@code min_length_as_string}
		 */
		public final Builder minLengthAsString(@Nullable String value) {
			this.minLengthAsString = value;
			return this;
		}

		/**
		 * API name: {@code max_length_as_string}
		 */
		public final Builder maxLengthAsString(@Nullable String value) {
			this.maxLengthAsString = value;
			return this;
		}

		/**
		 * API name: {@code avg_length_as_string}
		 */
		public final Builder avgLengthAsString(@Nullable String value) {
			this.avgLengthAsString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StringStatsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StringStatsAggregate build() {
			_checkSingleUse();

			return new StringStatsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StringStatsAggregate}
	 */
	public static final JsonpDeserializer<StringStatsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StringStatsAggregate::setupStringStatsAggregateDeserializer);

	protected static void setupStringStatsAggregateDeserializer(ObjectDeserializer<StringStatsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::minLength, JsonpDeserializer.intOrNullDeserializer(0), "min_length");
		op.add(Builder::maxLength, JsonpDeserializer.intOrNullDeserializer(0), "max_length");
		op.add(Builder::avgLength, JsonpDeserializer.doubleOrNullDeserializer(0), "avg_length");
		op.add(Builder::entropy, JsonpDeserializer.doubleOrNullDeserializer(0), "entropy");
		op.add(Builder::distribution, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"distribution");
		op.add(Builder::minLengthAsString, JsonpDeserializer.stringDeserializer(), "min_length_as_string");
		op.add(Builder::maxLengthAsString, JsonpDeserializer.stringDeserializer(), "max_length_as_string");
		op.add(Builder::avgLengthAsString, JsonpDeserializer.stringDeserializer(), "avg_length_as_string");

	}

}
