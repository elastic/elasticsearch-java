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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.IpRangeAggregation
public final class IpRangeAggregation extends BucketAggregationBase {
	@Nullable
	private final String field;

	@Nullable
	private final List<IpRangeAggregationRange> ranges;

	// ---------------------------------------------------------------------------------------------

	public IpRangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.ranges = builder.ranges;

	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ranges}
	 */
	@Nullable
	public List<IpRangeAggregationRange> ranges() {
		return this.ranges;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.ranges != null) {

			generator.writeKey("ranges");
			generator.writeStartArray();
			for (IpRangeAggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpRangeAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpRangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private List<IpRangeAggregationRange> ranges;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(@Nullable List<IpRangeAggregationRange> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(IpRangeAggregationRange... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(IpRangeAggregationRange value) {
			if (this.ranges == null) {
				this.ranges = new ArrayList<>();
			}
			this.ranges.add(value);
			return this;
		}

		/**
		 * Set {@link #ranges(List)} to a singleton list.
		 */
		public Builder ranges(Function<IpRangeAggregationRange.Builder, ObjectBuilder<IpRangeAggregationRange>> fn) {
			return this.ranges(fn.apply(new IpRangeAggregationRange.Builder()).build());
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed.
		 */
		public Builder addRanges(Function<IpRangeAggregationRange.Builder, ObjectBuilder<IpRangeAggregationRange>> fn) {
			return this.addRanges(fn.apply(new IpRangeAggregationRange.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IpRangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpRangeAggregation build() {

			return new IpRangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpRangeAggregation}
	 */
	public static final JsonpDeserializer<IpRangeAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IpRangeAggregation::setupIpRangeAggregationDeserializer);

	protected static void setupIpRangeAggregationDeserializer(DelegatingDeserializer<IpRangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(IpRangeAggregationRange.DESERIALIZER), "ranges");

	}

}
