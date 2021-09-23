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

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonParser;
import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregationSource
public interface CompositeAggregationSource extends JsonpSerializable {

	String TERMS = "terms";
	String HISTOGRAM = "histogram";
	String DATE_HISTOGRAM = "date_histogram";
	String GEOTILE_GRID = "geotile_grid";

	/**
	 * The type of this {@code CompositeAggregationSource}.
	 */
	String _type();

	class Builder {
		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<CompositeAggregationSource> terms(TermsAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code terms}
		 */
		public ObjectBuilder<CompositeAggregationSource> terms(
				Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
			return this.terms(fn.apply(new TermsAggregation.Builder()).build());
		}

		/**
		 * API name: {@code histogram}
		 */
		public ObjectBuilder<CompositeAggregationSource> histogram(HistogramAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code histogram}
		 */
		public ObjectBuilder<CompositeAggregationSource> histogram(
				Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> fn) {
			return this.histogram(fn.apply(new HistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public ObjectBuilder<CompositeAggregationSource> dateHistogram(DateHistogramAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code date_histogram}
		 */
		public ObjectBuilder<CompositeAggregationSource> dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> fn) {
			return this.dateHistogram(fn.apply(new DateHistogramAggregation.Builder()).build());
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public ObjectBuilder<CompositeAggregationSource> geotileGrid(GeoTileGridAggregation value) {
			return ObjectBuilder.constant(value);
		}

		/**
		 * API name: {@code geotile_grid}
		 */
		public ObjectBuilder<CompositeAggregationSource> geotileGrid(
				Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> fn) {
			return this.geotileGrid(fn.apply(new GeoTileGridAggregation.Builder()).build());
		}

	}

	class $Helper {
		private static CompositeAggregationSource deserialize(JsonParser parser, JsonpMapper mapper,
				JsonParser.Event event) {

			ObjectBuilder<? extends CompositeAggregationSource> builder = null;
			String variant = null;

			while ((event = parser.next()) != JsonParser.Event.END_OBJECT) {
				String fieldName = JsonpUtils.expectKeyName(parser, event);
				switch (fieldName) {
					case TERMS : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = TermsAggregation.$BUILDER_DESERIALIZER.deserialize(new TermsAggregation.Builder(),
								parser, mapper, parser.next());
						break;
					}
					case HISTOGRAM : {
						variant = JsonpUtils.ensureSingleVariant(parser, variant, fieldName);
						builder = HistogramAggregation.$BUILDER_DESERIALIZER
								.deserialize(new HistogramAggregation.Builder(), parser, mapper, parser.next());
						break;
					}
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
					default : {
						JsonpUtils.unknownKey(parser, fieldName);
					}
				}
			}

			return JsonpUtils.buildVariant(parser, builder);
		}
	}

	JsonpDeserializer<CompositeAggregationSource> DESERIALIZER = JsonpDeserializer
			.of(EnumSet.of(JsonParser.Event.START_OBJECT), $Helper::deserialize);
}
