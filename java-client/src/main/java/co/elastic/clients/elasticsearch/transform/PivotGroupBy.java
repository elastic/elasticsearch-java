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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.PivotGroupByContainer
public interface PivotGroupBy extends JsonpSerializable {

	String DATE_HISTOGRAM = "date_histogram";
	String GEOTILE_GRID = "geotile_grid";
	String HISTOGRAM = "histogram";
	String TERMS = "terms";

	/**
	 * The type of this {@code PivotGroupByContainer}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code date_histogram}
		 */
		public ObjectBuilder<PivotGroupBy> dateHistogram(DateHistogramAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public ObjectBuilder<PivotGroupBy> dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
			return this.dateHistogram(fn.apply(new DateHistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public ObjectBuilder<PivotGroupBy> geotileGrid(GeoTileGridAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public ObjectBuilder<PivotGroupBy> geotileGrid(
				Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
			return this.geotileGrid(fn.apply(new GeoTileGridAggregation.Builder()).build());
		}

		/**
		 * API name: {@code histogram}
		 */
		public ObjectBuilder<PivotGroupBy> histogram(HistogramAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code histogram}
		 */
		public ObjectBuilder<PivotGroupBy> histogram(
				Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> fn) {
			return this.histogram(fn.apply(new HistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<PivotGroupBy> terms(TermsAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<PivotGroupBy> terms(
				Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
			return this.terms(fn.apply(new TermsAggregation.Builder()).build());
		}

	}

	class $Helper {
		private static PivotGroupBy deserialize(JsonParser parser, JsonpMapper mapper, JsonParser.Event event) {

			ObjectBuilder<? extends PivotGroupBy> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case DATE_HISTOGRAM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = DateHistogramAggregation.$BUILDER_DESERIALIZER
								.deserialize(new DateHistogramAggregation.Builder(), parser, mapper, parser.next());
						break;
					}
					case GEOTILE_GRID : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = GeoTileGridAggregation.$BUILDER_DESERIALIZER
								.deserialize(new GeoTileGridAggregation.Builder(), parser, mapper, parser.next());
						break;
					}
					case HISTOGRAM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = HistogramAggregation.$BUILDER_DESERIALIZER
								.deserialize(new HistogramAggregation.Builder(), parser, mapper, parser.next());
						break;
					}
					case TERMS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TermsAggregation.$BUILDER_DESERIALIZER.deserialize(new TermsAggregation.Builder(),
								parser, mapper, parser.next());
						break;
					}
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<PivotGroupBy> DESERIALIZER = JsonpDeserializer.of(EnumSet.of(JsonParser.Event.START_OBJECT),
			$Helper::deserialize);
}
