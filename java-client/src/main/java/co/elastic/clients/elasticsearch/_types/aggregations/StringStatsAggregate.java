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
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
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

	@Nullable
	private final Integer minLength;

	@Nullable
	private final Integer maxLength;

	@Nullable
	private final Double avgLength;

	@Nullable
	private final Double entropy;

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
		this.minLength = builder.minLength;
		this.maxLength = builder.maxLength;
		this.avgLength = builder.avgLength;
		this.entropy = builder.entropy;
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
	 * API name: {@code min_length}
	 */
	@Nullable
	public final Integer minLength() {
		return this.minLength;
	}

	/**
	 * API name: {@code max_length}
	 */
	@Nullable
	public final Integer maxLength() {
		return this.maxLength;
	}

	/**
	 * API name: {@code avg_length}
	 */
	@Nullable
	public final Double avgLength() {
		return this.avgLength;
	}

	/**
	 * API name: {@code entropy}
	 */
	@Nullable
	public final Double entropy() {
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

		if (this.minLength != null) {
			generator.writeKey("min_length");
			generator.write(this.minLength);

		}
		if (this.maxLength != null) {
			generator.writeKey("max_length");
			generator.write(this.maxLength);

		}
		if (this.avgLength != null) {
			generator.writeKey("avg_length");
			generator.write(this.avgLength);

		}
		if (this.entropy != null) {
			generator.writeKey("entropy");
			generator.write(this.entropy);

		}
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

		@Nullable
		private Integer minLength;

		@Nullable
		private Integer maxLength;

		@Nullable
		private Double avgLength;

		@Nullable
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
		 * API name: {@code min_length}
		 */
		public final Builder minLength(@Nullable Integer value) {
			this.minLength = value;
			return this;
		}

		/**
		 * API name: {@code max_length}
		 */
		public final Builder maxLength(@Nullable Integer value) {
			this.maxLength = value;
			return this;
		}

		/**
		 * API name: {@code avg_length}
		 */
		public final Builder avgLength(@Nullable Double value) {
			this.avgLength = value;
			return this;
		}

		/**
		 * API name: {@code entropy}
		 */
		public final Builder entropy(@Nullable Double value) {
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
		op.add(Builder::minLength, JsonpDeserializer.integerDeserializer(), "min_length");
		op.add(Builder::maxLength, JsonpDeserializer.integerDeserializer(), "max_length");
		op.add(Builder::avgLength, JsonpDeserializer.doubleDeserializer(), "avg_length");
		op.add(Builder::entropy, JsonpDeserializer.doubleDeserializer(), "entropy");
		op.add(Builder::distribution, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"distribution");
		op.add(Builder::minLengthAsString, JsonpDeserializer.stringDeserializer(), "min_length_as_string");
		op.add(Builder::maxLengthAsString, JsonpDeserializer.stringDeserializer(), "max_length_as_string");
		op.add(Builder::avgLengthAsString, JsonpDeserializer.stringDeserializer(), "avg_length_as_string");

	}

}
