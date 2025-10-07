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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

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

/**
 * Builders for {@link CompositeAggregationSource} variants.
 */
public class CompositeAggregationSourceBuilders {
	private CompositeAggregationSourceBuilders() {
	}

	/**
	 * Creates a builder for the {@link CompositeTermsAggregation terms}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static CompositeTermsAggregation.Builder terms() {
		return new CompositeTermsAggregation.Builder();
	}

	/**
	 * Creates a CompositeAggregationSource of the {@link CompositeTermsAggregation
	 * terms} {@code CompositeAggregationSource} variant.
	 */
	public static CompositeAggregationSource terms(
			Function<CompositeTermsAggregation.Builder, ObjectBuilder<CompositeTermsAggregation>> fn) {
		CompositeAggregationSource.Builder builder = new CompositeAggregationSource.Builder();
		builder.terms(fn.apply(new CompositeTermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeHistogramAggregation histogram}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static CompositeHistogramAggregation.Builder histogram() {
		return new CompositeHistogramAggregation.Builder();
	}

	/**
	 * Creates a CompositeAggregationSource of the
	 * {@link CompositeHistogramAggregation histogram}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static CompositeAggregationSource histogram(
			Function<CompositeHistogramAggregation.Builder, ObjectBuilder<CompositeHistogramAggregation>> fn) {
		CompositeAggregationSource.Builder builder = new CompositeAggregationSource.Builder();
		builder.histogram(fn.apply(new CompositeHistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeDateHistogramAggregation
	 * date_histogram} {@code CompositeAggregationSource} variant.
	 */
	public static CompositeDateHistogramAggregation.Builder dateHistogram() {
		return new CompositeDateHistogramAggregation.Builder();
	}

	/**
	 * Creates a CompositeAggregationSource of the
	 * {@link CompositeDateHistogramAggregation date_histogram}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static CompositeAggregationSource dateHistogram(
			Function<CompositeDateHistogramAggregation.Builder, ObjectBuilder<CompositeDateHistogramAggregation>> fn) {
		CompositeAggregationSource.Builder builder = new CompositeAggregationSource.Builder();
		builder.dateHistogram(fn.apply(new CompositeDateHistogramAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeGeoTileGridAggregation
	 * geotile_grid} {@code CompositeAggregationSource} variant.
	 */
	public static CompositeGeoTileGridAggregation.Builder geotileGrid() {
		return new CompositeGeoTileGridAggregation.Builder();
	}

	/**
	 * Creates a CompositeAggregationSource of the
	 * {@link CompositeGeoTileGridAggregation geotile_grid}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static CompositeAggregationSource geotileGrid(
			Function<CompositeGeoTileGridAggregation.Builder, ObjectBuilder<CompositeGeoTileGridAggregation>> fn) {
		CompositeAggregationSource.Builder builder = new CompositeAggregationSource.Builder();
		builder.geotileGrid(fn.apply(new CompositeGeoTileGridAggregation.Builder()).build());
		return builder.build();
	}

}
