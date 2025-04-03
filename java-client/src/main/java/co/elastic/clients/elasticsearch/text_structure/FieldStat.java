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

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: text_structure._types.FieldStat

/**
 *
 * @see <a href="../doc-files/api-spec.html#text_structure._types.FieldStat">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldStat implements JsonpSerializable {
	private final int count;

	private final int cardinality;

	private final List<TopHit> topHits;

	@Nullable
	private final Integer meanValue;

	@Nullable
	private final Integer medianValue;

	@Nullable
	private final Integer maxValue;

	@Nullable
	private final Integer minValue;

	@Nullable
	private final String earliest;

	@Nullable
	private final String latest;

	// ---------------------------------------------------------------------------------------------

	private FieldStat(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.cardinality = ApiTypeHelper.requireNonNull(builder.cardinality, this, "cardinality", 0);
		this.topHits = ApiTypeHelper.unmodifiableRequired(builder.topHits, this, "topHits");
		this.meanValue = builder.meanValue;
		this.medianValue = builder.medianValue;
		this.maxValue = builder.maxValue;
		this.minValue = builder.minValue;
		this.earliest = builder.earliest;
		this.latest = builder.latest;

	}

	public static FieldStat of(Function<Builder, ObjectBuilder<FieldStat>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code cardinality}
	 */
	public final int cardinality() {
		return this.cardinality;
	}

	/**
	 * Required - API name: {@code top_hits}
	 */
	public final List<TopHit> topHits() {
		return this.topHits;
	}

	/**
	 * API name: {@code mean_value}
	 */
	@Nullable
	public final Integer meanValue() {
		return this.meanValue;
	}

	/**
	 * API name: {@code median_value}
	 */
	@Nullable
	public final Integer medianValue() {
		return this.medianValue;
	}

	/**
	 * API name: {@code max_value}
	 */
	@Nullable
	public final Integer maxValue() {
		return this.maxValue;
	}

	/**
	 * API name: {@code min_value}
	 */
	@Nullable
	public final Integer minValue() {
		return this.minValue;
	}

	/**
	 * API name: {@code earliest}
	 */
	@Nullable
	public final String earliest() {
		return this.earliest;
	}

	/**
	 * API name: {@code latest}
	 */
	@Nullable
	public final String latest() {
		return this.latest;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("cardinality");
		generator.write(this.cardinality);

		if (ApiTypeHelper.isDefined(this.topHits)) {
			generator.writeKey("top_hits");
			generator.writeStartArray();
			for (TopHit item0 : this.topHits) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.meanValue != null) {
			generator.writeKey("mean_value");
			generator.write(this.meanValue);

		}
		if (this.medianValue != null) {
			generator.writeKey("median_value");
			generator.write(this.medianValue);

		}
		if (this.maxValue != null) {
			generator.writeKey("max_value");
			generator.write(this.maxValue);

		}
		if (this.minValue != null) {
			generator.writeKey("min_value");
			generator.write(this.minValue);

		}
		if (this.earliest != null) {
			generator.writeKey("earliest");
			generator.write(this.earliest);

		}
		if (this.latest != null) {
			generator.writeKey("latest");
			generator.write(this.latest);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldStat}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldStat> {
		private Integer count;

		private Integer cardinality;

		private List<TopHit> topHits;

		@Nullable
		private Integer meanValue;

		@Nullable
		private Integer medianValue;

		@Nullable
		private Integer maxValue;

		@Nullable
		private Integer minValue;

		@Nullable
		private String earliest;

		@Nullable
		private String latest;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code cardinality}
		 */
		public final Builder cardinality(int value) {
			this.cardinality = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_hits}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>topHits</code>.
		 */
		public final Builder topHits(List<TopHit> list) {
			this.topHits = _listAddAll(this.topHits, list);
			return this;
		}

		/**
		 * Required - API name: {@code top_hits}
		 * <p>
		 * Adds one or more values to <code>topHits</code>.
		 */
		public final Builder topHits(TopHit value, TopHit... values) {
			this.topHits = _listAdd(this.topHits, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code top_hits}
		 * <p>
		 * Adds a value to <code>topHits</code> using a builder lambda.
		 */
		public final Builder topHits(Function<TopHit.Builder, ObjectBuilder<TopHit>> fn) {
			return topHits(fn.apply(new TopHit.Builder()).build());
		}

		/**
		 * API name: {@code mean_value}
		 */
		public final Builder meanValue(@Nullable Integer value) {
			this.meanValue = value;
			return this;
		}

		/**
		 * API name: {@code median_value}
		 */
		public final Builder medianValue(@Nullable Integer value) {
			this.medianValue = value;
			return this;
		}

		/**
		 * API name: {@code max_value}
		 */
		public final Builder maxValue(@Nullable Integer value) {
			this.maxValue = value;
			return this;
		}

		/**
		 * API name: {@code min_value}
		 */
		public final Builder minValue(@Nullable Integer value) {
			this.minValue = value;
			return this;
		}

		/**
		 * API name: {@code earliest}
		 */
		public final Builder earliest(@Nullable String value) {
			this.earliest = value;
			return this;
		}

		/**
		 * API name: {@code latest}
		 */
		public final Builder latest(@Nullable String value) {
			this.latest = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldStat}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldStat build() {
			_checkSingleUse();

			return new FieldStat(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldStat}
	 */
	public static final JsonpDeserializer<FieldStat> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldStat::setupFieldStatDeserializer);

	protected static void setupFieldStatDeserializer(ObjectDeserializer<FieldStat.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::cardinality, JsonpDeserializer.integerDeserializer(), "cardinality");
		op.add(Builder::topHits, JsonpDeserializer.arrayDeserializer(TopHit._DESERIALIZER), "top_hits");
		op.add(Builder::meanValue, JsonpDeserializer.integerDeserializer(), "mean_value");
		op.add(Builder::medianValue, JsonpDeserializer.integerDeserializer(), "median_value");
		op.add(Builder::maxValue, JsonpDeserializer.integerDeserializer(), "max_value");
		op.add(Builder::minValue, JsonpDeserializer.integerDeserializer(), "min_value");
		op.add(Builder::earliest, JsonpDeserializer.stringDeserializer(), "earliest");
		op.add(Builder::latest, JsonpDeserializer.stringDeserializer(), "latest");

	}

}
