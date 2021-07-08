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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.aggregations.DateHistogramAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.GeoTileGridAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.HistogramAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregation;
import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class PivotGroupByContainer extends TaggedUnion<PivotGroupByContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		dateHistogram("date_histogram"),

		geotileGrid("geotile_grid"),

		histogram("histogram"),

		terms("terms"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private PivotGroupByContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link PivotGroupByContainer} of a {@code date_histogram} kind?
	 */
	public boolean isDateHistogram() {
		return is(Tag.dateHistogram);
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregation dateHistogram() {
		return get(Tag.dateHistogram);
	}

	/**
	 * Is this {@link PivotGroupByContainer} of a {@code geotile_grid} kind?
	 */
	public boolean isGeotileGrid() {
		return is(Tag.geotileGrid);
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregation geotileGrid() {
		return get(Tag.geotileGrid);
	}

	/**
	 * Is this {@link PivotGroupByContainer} of a {@code histogram} kind?
	 */
	public boolean isHistogram() {
		return is(Tag.histogram);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregation histogram() {
		return get(Tag.histogram);
	}

	/**
	 * Is this {@link PivotGroupByContainer} of a {@code terms} kind?
	 */
	public boolean isTerms() {
		return is(Tag.terms);
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return get(Tag.terms);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<PivotGroupByContainer> dateHistogram(DateHistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.dateHistogram;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<PivotGroupByContainer> dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> f) {
			return this.dateHistogram(f.apply(new DateHistogramAggregation.Builder()).build());
		}

		public ObjectBuilder<PivotGroupByContainer> geotileGrid(GeoTileGridAggregation v) {
			this.$variant = v;
			this.$tag = Tag.geotileGrid;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<PivotGroupByContainer> geotileGrid(
				Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> f) {
			return this.geotileGrid(f.apply(new GeoTileGridAggregation.Builder()).build());
		}

		public ObjectBuilder<PivotGroupByContainer> histogram(HistogramAggregation v) {
			this.$variant = v;
			this.$tag = Tag.histogram;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<PivotGroupByContainer> histogram(
				Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> f) {
			return this.histogram(f.apply(new HistogramAggregation.Builder()).build());
		}

		public ObjectBuilder<PivotGroupByContainer> terms(TermsAggregation v) {
			this.$variant = v;
			this.$tag = Tag.terms;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<PivotGroupByContainer> terms(
				Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> f) {
			return this.terms(f.apply(new TermsAggregation.Builder()).build());
		}

		protected PivotGroupByContainer build() {
			return new PivotGroupByContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<PivotGroupByContainer> DESERIALIZER = JsonpDeserializer
			.lazy(PivotGroupByContainer::buildDeserializer);

	private static JsonpDeserializer<PivotGroupByContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::dateHistogram, DateHistogramAggregation.DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, GeoTileGridAggregation.DESERIALIZER, "geotile_grid");
		op.add(Builder::histogram, HistogramAggregation.DESERIALIZER, "histogram");
		op.add(Builder::terms, TermsAggregation.DESERIALIZER, "terms");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
