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
import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link PivotGroupBy} variants.
 */
public class PivotGroupByBuilders {
	private PivotGroupByBuilders() {
	}

	/**
	 * Creates a builder for the {@link DateHistogramAggregation date_histogram}
	 * {@code PivotGroupBy} variant.
	 */
	public static DateHistogramAggregation.Builder dateHistogram() {
		return new DateHistogramAggregation.Builder();
	}

	/**
	 * Creates a PivotGroupBy of the {@link DateHistogramAggregation date_histogram}
	 * {@code PivotGroupBy} variant.
	 */
	public static PivotGroupBy dateHistogram(
			Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
		PivotGroupBy.Builder builder = new PivotGroupBy.Builder();
		builder.dateHistogram(fn.apply(new DateHistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link GeoTileGridAggregation geotile_grid}
	 * {@code PivotGroupBy} variant.
	 */
	public static GeoTileGridAggregation.Builder geotileGrid() {
		return new GeoTileGridAggregation.Builder();
	}

	/**
	 * Creates a PivotGroupBy of the {@link GeoTileGridAggregation geotile_grid}
	 * {@code PivotGroupBy} variant.
	 */
	public static PivotGroupBy geotileGrid(
			Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
		PivotGroupBy.Builder builder = new PivotGroupBy.Builder();
		builder.geotileGrid(fn.apply(new GeoTileGridAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HistogramAggregation histogram}
	 * {@code PivotGroupBy} variant.
	 */
	public static HistogramAggregation.Builder histogram() {
		return new HistogramAggregation.Builder();
	}

	/**
	 * Creates a PivotGroupBy of the {@link HistogramAggregation histogram}
	 * {@code PivotGroupBy} variant.
	 */
	public static PivotGroupBy histogram(
			Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> fn) {
		PivotGroupBy.Builder builder = new PivotGroupBy.Builder();
		builder.histogram(fn.apply(new HistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsAggregation terms} {@code PivotGroupBy}
	 * variant.
	 */
	public static TermsAggregation.Builder terms() {
		return new TermsAggregation.Builder();
	}

	/**
	 * Creates a PivotGroupBy of the {@link TermsAggregation terms}
	 * {@code PivotGroupBy} variant.
	 */
	public static PivotGroupBy terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
		PivotGroupBy.Builder builder = new PivotGroupBy.Builder();
		builder.terms(fn.apply(new TermsAggregation.Builder()).build());
		return builder.build();
	}

}
