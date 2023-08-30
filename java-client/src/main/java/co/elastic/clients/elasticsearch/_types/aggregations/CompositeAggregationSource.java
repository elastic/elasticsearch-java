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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregationSource

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregationSource">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeAggregationSource implements JsonpSerializable {
	@Nullable
	private final CompositeTermsAggregation terms;

	@Nullable
	private final CompositeHistogramAggregation histogram;

	@Nullable
	private final CompositeDateHistogramAggregation dateHistogram;

	@Nullable
	private final CompositeGeoTileGridAggregation geotileGrid;

	// ---------------------------------------------------------------------------------------------

	private CompositeAggregationSource(Builder builder) {

		this.terms = builder.terms;
		this.histogram = builder.histogram;
		this.dateHistogram = builder.dateHistogram;
		this.geotileGrid = builder.geotileGrid;

	}

	public static CompositeAggregationSource of(Function<Builder, ObjectBuilder<CompositeAggregationSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A terms aggregation.
	 * <p>
	 * API name: {@code terms}
	 */
	@Nullable
	public final CompositeTermsAggregation terms() {
		return this.terms;
	}

	/**
	 * A histogram aggregation.
	 * <p>
	 * API name: {@code histogram}
	 */
	@Nullable
	public final CompositeHistogramAggregation histogram() {
		return this.histogram;
	}

	/**
	 * A date histogram aggregation.
	 * <p>
	 * API name: {@code date_histogram}
	 */
	@Nullable
	public final CompositeDateHistogramAggregation dateHistogram() {
		return this.dateHistogram;
	}

	/**
	 * A geotile grid aggregation.
	 * <p>
	 * API name: {@code geotile_grid}
	 */
	@Nullable
	public final CompositeGeoTileGridAggregation geotileGrid() {
		return this.geotileGrid;
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

		if (this.terms != null) {
			generator.writeKey("terms");
			this.terms.serialize(generator, mapper);

		}
		if (this.histogram != null) {
			generator.writeKey("histogram");
			this.histogram.serialize(generator, mapper);

		}
		if (this.dateHistogram != null) {
			generator.writeKey("date_histogram");
			this.dateHistogram.serialize(generator, mapper);

		}
		if (this.geotileGrid != null) {
			generator.writeKey("geotile_grid");
			this.geotileGrid.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CompositeAggregationSource}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CompositeAggregationSource> {
		@Nullable
		private CompositeTermsAggregation terms;

		@Nullable
		private CompositeHistogramAggregation histogram;

		@Nullable
		private CompositeDateHistogramAggregation dateHistogram;

		@Nullable
		private CompositeGeoTileGridAggregation geotileGrid;

		/**
		 * A terms aggregation.
		 * <p>
		 * API name: {@code terms}
		 */
		public final Builder terms(@Nullable CompositeTermsAggregation value) {
			this.terms = value;
			return this;
		}

		/**
		 * A terms aggregation.
		 * <p>
		 * API name: {@code terms}
		 */
		public final Builder terms(
				Function<CompositeTermsAggregation.Builder, ObjectBuilder<CompositeTermsAggregation>> fn) {
			return this.terms(fn.apply(new CompositeTermsAggregation.Builder()).build());
		}

		/**
		 * A histogram aggregation.
		 * <p>
		 * API name: {@code histogram}
		 */
		public final Builder histogram(@Nullable CompositeHistogramAggregation value) {
			this.histogram = value;
			return this;
		}

		/**
		 * A histogram aggregation.
		 * <p>
		 * API name: {@code histogram}
		 */
		public final Builder histogram(
				Function<CompositeHistogramAggregation.Builder, ObjectBuilder<CompositeHistogramAggregation>> fn) {
			return this.histogram(fn.apply(new CompositeHistogramAggregation.Builder()).build());
		}

		/**
		 * A date histogram aggregation.
		 * <p>
		 * API name: {@code date_histogram}
		 */
		public final Builder dateHistogram(@Nullable CompositeDateHistogramAggregation value) {
			this.dateHistogram = value;
			return this;
		}

		/**
		 * A date histogram aggregation.
		 * <p>
		 * API name: {@code date_histogram}
		 */
		public final Builder dateHistogram(
				Function<CompositeDateHistogramAggregation.Builder, ObjectBuilder<CompositeDateHistogramAggregation>> fn) {
			return this.dateHistogram(fn.apply(new CompositeDateHistogramAggregation.Builder()).build());
		}

		/**
		 * A geotile grid aggregation.
		 * <p>
		 * API name: {@code geotile_grid}
		 */
		public final Builder geotileGrid(@Nullable CompositeGeoTileGridAggregation value) {
			this.geotileGrid = value;
			return this;
		}

		/**
		 * A geotile grid aggregation.
		 * <p>
		 * API name: {@code geotile_grid}
		 */
		public final Builder geotileGrid(
				Function<CompositeGeoTileGridAggregation.Builder, ObjectBuilder<CompositeGeoTileGridAggregation>> fn) {
			return this.geotileGrid(fn.apply(new CompositeGeoTileGridAggregation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CompositeAggregationSource}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CompositeAggregationSource build() {
			_checkSingleUse();

			return new CompositeAggregationSource(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CompositeAggregationSource}
	 */
	public static final JsonpDeserializer<CompositeAggregationSource> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CompositeAggregationSource::setupCompositeAggregationSourceDeserializer);

	protected static void setupCompositeAggregationSourceDeserializer(
			ObjectDeserializer<CompositeAggregationSource.Builder> op) {

		op.add(Builder::terms, CompositeTermsAggregation._DESERIALIZER, "terms");
		op.add(Builder::histogram, CompositeHistogramAggregation._DESERIALIZER, "histogram");
		op.add(Builder::dateHistogram, CompositeDateHistogramAggregation._DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, CompositeGeoTileGridAggregation._DESERIALIZER, "geotile_grid");

	}

}
