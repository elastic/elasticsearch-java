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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.StringStatsAggregate
@JsonpDeserializable
public class StringStatsAggregate extends AggregateBase implements AggregateVariant {
	private final long count;

	private final int minLength;

	private final int maxLength;

	private final double avgLength;

	private final double entropy;

	@Nullable
	private final String distribution;

	@Nullable
	private final String minLengthAsString;

	@Nullable
	private final String maxLengthAsString;

	@Nullable
	private final String avgLengthAsString;

	// ---------------------------------------------------------------------------------------------

	private StringStatsAggregate(Builder builder) {
		super(builder);

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.minLength = ModelTypeHelper.requireNonNull(builder.minLength, this, "minLength");
		this.maxLength = ModelTypeHelper.requireNonNull(builder.maxLength, this, "maxLength");
		this.avgLength = ModelTypeHelper.requireNonNull(builder.avgLength, this, "avgLength");
		this.entropy = ModelTypeHelper.requireNonNull(builder.entropy, this, "entropy");
		this.distribution = builder.distribution;
		this.minLengthAsString = builder.minLengthAsString;
		this.maxLengthAsString = builder.maxLengthAsString;
		this.avgLengthAsString = builder.avgLengthAsString;

	}

	public static StringStatsAggregate of(Function<Builder, ObjectBuilder<StringStatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "string_stats";
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code min_length}
	 */
	public final int minLength() {
		return this.minLength;
	}

	/**
	 * Required - API name: {@code max_length}
	 */
	public final int maxLength() {
		return this.maxLength;
	}

	/**
	 * Required - API name: {@code avg_length}
	 */
	public final double avgLength() {
		return this.avgLength;
	}

	/**
	 * Required - API name: {@code entropy}
	 */
	public final double entropy() {
		return this.entropy;
	}

	/**
	 * API name: {@code distribution}
	 */
	@Nullable
	public final String distribution() {
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
		generator.write(this.minLength);

		generator.writeKey("max_length");
		generator.write(this.maxLength);

		generator.writeKey("avg_length");
		generator.write(this.avgLength);

		generator.writeKey("entropy");
		generator.write(this.entropy);

		if (this.distribution != null) {
			generator.writeKey("distribution");
			generator.write(this.distribution);

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
		private String distribution;

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
		 */
		public final Builder minLength(int value) {
			this.minLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_length}
		 */
		public final Builder maxLength(int value) {
			this.maxLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code avg_length}
		 */
		public final Builder avgLength(double value) {
			this.avgLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code entropy}
		 */
		public final Builder entropy(double value) {
			this.entropy = value;
			return this;
		}

		/**
		 * API name: {@code distribution}
		 */
		public final Builder distribution(@Nullable String value) {
			this.distribution = value;
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
			.lazy(Builder::new, StringStatsAggregate::setupStringStatsAggregateDeserializer, Builder::build);

	protected static void setupStringStatsAggregateDeserializer(
			DelegatingDeserializer<StringStatsAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::minLength, JsonpDeserializer.integerDeserializer(), "min_length");
		op.add(Builder::maxLength, JsonpDeserializer.integerDeserializer(), "max_length");
		op.add(Builder::avgLength, JsonpDeserializer.doubleDeserializer(), "avg_length");
		op.add(Builder::entropy, JsonpDeserializer.doubleDeserializer(), "entropy");
		op.add(Builder::distribution, JsonpDeserializer.stringDeserializer(), "distribution");
		op.add(Builder::minLengthAsString, JsonpDeserializer.stringDeserializer(), "min_length_as_string");
		op.add(Builder::maxLengthAsString, JsonpDeserializer.stringDeserializer(), "max_length_as_string");
		op.add(Builder::avgLengthAsString, JsonpDeserializer.stringDeserializer(), "avg_length_as_string");

	}

}
