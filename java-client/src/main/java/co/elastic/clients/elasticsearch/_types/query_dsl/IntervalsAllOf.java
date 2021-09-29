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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsAllOf
@JsonpDeserializable
public final class IntervalsAllOf implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	private final List<Intervals> intervals;

	@Nullable
	private final Integer maxGaps;

	@Nullable
	private final Boolean ordered;

	@Nullable
	private final IntervalsFilter filter;

	// ---------------------------------------------------------------------------------------------

	public IntervalsAllOf(Builder builder) {

		this.intervals = ModelTypeHelper.unmodifiableNonNull(builder.intervals, "intervals");
		this.maxGaps = builder.maxGaps;
		this.ordered = builder.ordered;
		this.filter = builder.filter;

	}

	public IntervalsAllOf(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link IntervalsQuery}, {@link Intervals} variant type
	 */
	@Override
	public String _variantType() {
		return "all_of";
	}

	/**
	 * API name: {@code intervals}
	 */
	public List<Intervals> intervals() {
		return this.intervals;
	}

	/**
	 * API name: {@code max_gaps}
	 */
	@Nullable
	public Integer maxGaps() {
		return this.maxGaps;
	}

	/**
	 * API name: {@code ordered}
	 */
	@Nullable
	public Boolean ordered() {
		return this.ordered;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public IntervalsFilter filter() {
		return this.filter;
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

		generator.writeKey("intervals");
		generator.writeStartArray();
		for (Intervals item0 : this.intervals) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		if (this.maxGaps != null) {

			generator.writeKey("max_gaps");
			generator.write(this.maxGaps);

		}
		if (this.ordered != null) {

			generator.writeKey("ordered");
			generator.write(this.ordered);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsAllOf}.
	 */
	public static class Builder implements ObjectBuilder<IntervalsAllOf> {
		private List<Intervals> intervals;

		@Nullable
		private Integer maxGaps;

		@Nullable
		private Boolean ordered;

		@Nullable
		private IntervalsFilter filter;

		/**
		 * API name: {@code intervals}
		 */
		public Builder intervals(List<Intervals> value) {
			this.intervals = value;
			return this;
		}

		/**
		 * API name: {@code intervals}
		 */
		public Builder intervals(Intervals... value) {
			this.intervals = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #intervals(List)}, creating the list if needed. 4
		 */
		public Builder addIntervals(Intervals value) {
			if (this.intervals == null) {
				this.intervals = new ArrayList<>();
			}
			this.intervals.add(value);
			return this;
		}

		/**
		 * Set {@link #intervals(List)} to a singleton list.
		 */
		public Builder intervals(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
			return this.intervals(fn.apply(new Intervals.Builder()).build());
		}

		/**
		 * Add a value to {@link #intervals(List)}, creating the list if needed. 5
		 */
		public Builder addIntervals(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
			return this.addIntervals(fn.apply(new Intervals.Builder()).build());
		}

		/**
		 * API name: {@code max_gaps}
		 */
		public Builder maxGaps(@Nullable Integer value) {
			this.maxGaps = value;
			return this;
		}

		/**
		 * API name: {@code ordered}
		 */
		public Builder ordered(@Nullable Boolean value) {
			this.ordered = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable IntervalsFilter value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<IntervalsFilter.Builder, ObjectBuilder<IntervalsFilter>> fn) {
			return this.filter(fn.apply(new IntervalsFilter.Builder()).build());
		}

		/**
		 * Builds a {@link IntervalsAllOf}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsAllOf build() {

			return new IntervalsAllOf(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsAllOf}
	 */
	public static final JsonpDeserializer<IntervalsAllOf> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsAllOf::setupIntervalsAllOfDeserializer, Builder::build);

	protected static void setupIntervalsAllOfDeserializer(DelegatingDeserializer<IntervalsAllOf.Builder> op) {

		op.add(Builder::intervals, JsonpDeserializer.arrayDeserializer(Intervals._DESERIALIZER), "intervals");
		op.add(Builder::maxGaps, JsonpDeserializer.integerDeserializer(), "max_gaps");
		op.add(Builder::ordered, JsonpDeserializer.booleanDeserializer(), "ordered");
		op.add(Builder::filter, IntervalsFilter._DESERIALIZER, "filter");

	}

}
