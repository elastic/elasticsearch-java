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

/**
 * Builders for {@link CompositeAggregationSource} variants.
 */
public class CompositeAggregationSourceBuilders {
	private CompositeAggregationSourceBuilders() {
	}

	/**
	 * Creates a builder for the {@link TermsAggregation terms}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static TermsAggregation.Builder terms() {
		return new TermsAggregation.Builder();
	}

	/**
	 * Creates a builder for the {@link HistogramAggregation histogram}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static HistogramAggregation.Builder histogram() {
		return new HistogramAggregation.Builder();
	}

	/**
	 * Creates a builder for the {@link DateHistogramAggregation date_histogram}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static DateHistogramAggregation.Builder dateHistogram() {
		return new DateHistogramAggregation.Builder();
	}

	/**
	 * Creates a builder for the {@link GeoTileGridAggregation geotile_grid}
	 * {@code CompositeAggregationSource} variant.
	 */
	public static GeoTileGridAggregation.Builder geotileGrid() {
		return new GeoTileGridAggregation.Builder();
	}

}
