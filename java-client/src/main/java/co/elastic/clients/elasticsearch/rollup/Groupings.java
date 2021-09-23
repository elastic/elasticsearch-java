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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup._types.Groupings
public final class Groupings implements JsonpSerializable {
	@Nullable
	private final DateHistogramGrouping dateHistogram;

	@Nullable
	private final HistogramGrouping histogram;

	@Nullable
	private final TermsGrouping terms;

	// ---------------------------------------------------------------------------------------------

	public Groupings(Builder builder) {

		this.dateHistogram = builder.dateHistogram;
		this.histogram = builder.histogram;
		this.terms = builder.terms;

	}

	/**
	 * API name: {@code date_histogram}
	 */
	@Nullable
	public DateHistogramGrouping dateHistogram() {
		return this.dateHistogram;
	}

	/**
	 * API name: {@code histogram}
	 */
	@Nullable
	public HistogramGrouping histogram() {
		return this.histogram;
	}

	/**
	 * API name: {@code terms}
	 */
	@Nullable
	public TermsGrouping terms() {
		return this.terms;
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

		if (this.dateHistogram != null) {

			generator.writeKey("date_histogram");
			this.dateHistogram.serialize(generator, mapper);

		}
		if (this.histogram != null) {

			generator.writeKey("histogram");
			this.histogram.serialize(generator, mapper);

		}
		if (this.terms != null) {

			generator.writeKey("terms");
			this.terms.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Groupings}.
	 */
	public static class Builder implements ObjectBuilder<Groupings> {
		@Nullable
		private DateHistogramGrouping dateHistogram;

		@Nullable
		private HistogramGrouping histogram;

		@Nullable
		private TermsGrouping terms;

		/**
		 * API name: {@code date_histogram}
		 */
		public Builder dateHistogram(@Nullable DateHistogramGrouping value) {
			this.dateHistogram = value;
			return this;
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public Builder dateHistogram(Function<DateHistogramGrouping.Builder, ObjectBuilder<DateHistogramGrouping>> fn) {
			return this.dateHistogram(fn.apply(new DateHistogramGrouping.Builder()).build());
		}

		/**
		 * API name: {@code histogram}
		 */
		public Builder histogram(@Nullable HistogramGrouping value) {
			this.histogram = value;
			return this;
		}

		/**
		 * API name: {@code histogram}
		 */
		public Builder histogram(Function<HistogramGrouping.Builder, ObjectBuilder<HistogramGrouping>> fn) {
			return this.histogram(fn.apply(new HistogramGrouping.Builder()).build());
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(@Nullable TermsGrouping value) {
			this.terms = value;
			return this;
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(Function<TermsGrouping.Builder, ObjectBuilder<TermsGrouping>> fn) {
			return this.terms(fn.apply(new TermsGrouping.Builder()).build());
		}

		/**
		 * Builds a {@link Groupings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Groupings build() {

			return new Groupings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Groupings}
	 */
	public static final JsonpDeserializer<Groupings> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, Groupings::setupGroupingsDeserializer);

	protected static void setupGroupingsDeserializer(DelegatingDeserializer<Groupings.Builder> op) {

		op.add(Builder::dateHistogram, DateHistogramGrouping.DESERIALIZER, "date_histogram");
		op.add(Builder::histogram, HistogramGrouping.DESERIALIZER, "histogram");
		op.add(Builder::terms, TermsGrouping.DESERIALIZER, "terms");

	}

}
