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
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsMatch
public final class IntervalsMatch implements Intervals, JsonpSerializable {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Number maxGaps;

	@Nullable
	private final Boolean ordered;

	private final String query;

	@Nullable
	private final String useField;

	@Nullable
	private final IntervalsFilter filter;

	// ---------------------------------------------------------------------------------------------

	public IntervalsMatch(Builder builder) {

		this.analyzer = builder.analyzer;
		this.maxGaps = builder.maxGaps;
		this.ordered = builder.ordered;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.useField = builder.useField;
		this.filter = builder.filter;

	}

	/**
	 * {@link Intervals} variant type
	 */
	@Override
	public String _type() {
		return "match";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code max_gaps}
	 */
	@Nullable
	public Number maxGaps() {
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
	 * API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code use_field}
	 */
	@Nullable
	public String useField() {
		return this.useField;
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
		generator.writeStartObject(_type());

		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.maxGaps != null) {

			generator.writeKey("max_gaps");
			generator.write(this.maxGaps.doubleValue());

		}
		if (this.ordered != null) {

			generator.writeKey("ordered");
			generator.write(this.ordered);

		}

		generator.writeKey("query");
		generator.write(this.query);

		if (this.useField != null) {

			generator.writeKey("use_field");
			generator.write(this.useField);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsMatch}.
	 */
	public static class Builder implements ObjectBuilder<IntervalsMatch> {
		@Nullable
		private String analyzer;

		@Nullable
		private Number maxGaps;

		@Nullable
		private Boolean ordered;

		private String query;

		@Nullable
		private String useField;

		@Nullable
		private IntervalsFilter filter;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code max_gaps}
		 */
		public Builder maxGaps(@Nullable Number value) {
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
		 * API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code use_field}
		 */
		public Builder useField(@Nullable String value) {
			this.useField = value;
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
		 * Builds a {@link IntervalsMatch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsMatch build() {

			return new IntervalsMatch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<IntervalsMatch.Builder, IntervalsMatch.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(IntervalsMatch::setupIntervalsMatchDeserializer);

	protected static void setupIntervalsMatchDeserializer(DelegatingDeserializer<IntervalsMatch.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::maxGaps, JsonpDeserializer.numberDeserializer(), "max_gaps");
		op.add(Builder::ordered, JsonpDeserializer.booleanDeserializer(), "ordered");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");
		op.add(Builder::filter, IntervalsFilter.DESERIALIZER, "filter");

	}

}
