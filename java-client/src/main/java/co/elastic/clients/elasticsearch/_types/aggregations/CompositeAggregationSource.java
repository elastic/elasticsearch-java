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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.CompositeAggregationSource
@JsonpDeserializable
public class CompositeAggregationSource implements TaggedUnion<Object>, JsonpSerializable {

	public static final String TERMS = "terms";
	public static final String HISTOGRAM = "histogram";
	public static final String DATE_HISTOGRAM = "date_histogram";
	public static final String GEOTILE_GRID = "geotile_grid";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public CompositeAggregationSource(CompositeAggregationSourceVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private CompositeAggregationSource(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	public CompositeAggregationSource(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsAggregation terms() {
		return TaggedUnionUtils.get(this, TERMS);
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public HistogramAggregation histogram() {
		return TaggedUnionUtils.get(this, HISTOGRAM);
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public DateHistogramAggregation dateHistogram() {
		return TaggedUnionUtils.get(this, DATE_HISTOGRAM);
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public GeoTileGridAggregation geotileGrid() {
		return TaggedUnionUtils.get(this, GEOTILE_GRID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();
	}

	public static class Builder implements ObjectBuilder<CompositeAggregationSource> {
		private String _type;
		private Object _value;

		public Builder terms(TermsAggregation v) {
			this._type = TERMS;
			this._value = v;
			return this;
		}

		public Builder terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> f) {
			return this.terms(f.apply(new TermsAggregation.Builder()).build());
		}

		public Builder histogram(HistogramAggregation v) {
			this._type = HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder histogram(Function<HistogramAggregation.Builder, ObjectBuilder<HistogramAggregation>> f) {
			return this.histogram(f.apply(new HistogramAggregation.Builder()).build());
		}

		public Builder dateHistogram(DateHistogramAggregation v) {
			this._type = DATE_HISTOGRAM;
			this._value = v;
			return this;
		}

		public Builder dateHistogram(
				Function<DateHistogramAggregation.Builder, ObjectBuilder<DateHistogramAggregation>> f) {
			return this.dateHistogram(f.apply(new DateHistogramAggregation.Builder()).build());
		}

		public Builder geotileGrid(GeoTileGridAggregation v) {
			this._type = GEOTILE_GRID;
			this._value = v;
			return this;
		}

		public Builder geotileGrid(Function<GeoTileGridAggregation.Builder, ObjectBuilder<GeoTileGridAggregation>> f) {
			return this.geotileGrid(f.apply(new GeoTileGridAggregation.Builder()).build());
		}

		public CompositeAggregationSource build() {
			return new CompositeAggregationSource(this);
		}

	}

	protected static void setupCompositeAggregationSourceDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::terms, TermsAggregation._DESERIALIZER, "terms");
		op.add(Builder::histogram, HistogramAggregation._DESERIALIZER, "histogram");
		op.add(Builder::dateHistogram, DateHistogramAggregation._DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, GeoTileGridAggregation._DESERIALIZER, "geotile_grid");

	}

	public static final JsonpDeserializer<CompositeAggregationSource> _DESERIALIZER = JsonpDeserializer.lazy(
			Builder::new, CompositeAggregationSource::setupCompositeAggregationSourceDeserializer, Builder::build);
}
