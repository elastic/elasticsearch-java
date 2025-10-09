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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.aggregations.CompositeAggregationSource

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregationSource">API
 *      specification</a>
 */
@JsonpDeserializable
public class CompositeAggregationSource
		implements
			TaggedUnion<CompositeAggregationSource.Kind, Object>,
			JsonpSerializable {

	/**
	 * {@link CompositeAggregationSource} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.aggregations.CompositeAggregationSource">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Terms("terms"),

		Histogram("histogram"),

		DateHistogram("date_histogram"),

		GeotileGrid("geotile_grid"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public CompositeAggregationSource(CompositeAggregationSourceVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._compositeAggregationSourceKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private CompositeAggregationSource(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CompositeAggregationSource of(Function<Builder, ObjectBuilder<CompositeAggregationSource>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code terms}?
	 */
	public boolean isTerms() {
		return _kind == Kind.Terms;
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public CompositeTermsAggregation terms() {
		return TaggedUnionUtils.get(this, Kind.Terms);
	}

	/**
	 * Is this variant instance of kind {@code histogram}?
	 */
	public boolean isHistogram() {
		return _kind == Kind.Histogram;
	}

	/**
	 * Get the {@code histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code histogram} kind.
	 */
	public CompositeHistogramAggregation histogram() {
		return TaggedUnionUtils.get(this, Kind.Histogram);
	}

	/**
	 * Is this variant instance of kind {@code date_histogram}?
	 */
	public boolean isDateHistogram() {
		return _kind == Kind.DateHistogram;
	}

	/**
	 * Get the {@code date_histogram} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_histogram} kind.
	 */
	public CompositeDateHistogramAggregation dateHistogram() {
		return TaggedUnionUtils.get(this, Kind.DateHistogram);
	}

	/**
	 * Is this variant instance of kind {@code geotile_grid}?
	 */
	public boolean isGeotileGrid() {
		return _kind == Kind.GeotileGrid;
	}

	/**
	 * Get the {@code geotile_grid} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geotile_grid} kind.
	 */
	public CompositeGeoTileGridAggregation geotileGrid() {
		return TaggedUnionUtils.get(this, Kind.GeotileGrid);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<CompositeAggregationSource> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<CompositeAggregationSource> terms(CompositeTermsAggregation v) {
			this._kind = Kind.Terms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CompositeAggregationSource> terms(
				Function<CompositeTermsAggregation.Builder, ObjectBuilder<CompositeTermsAggregation>> fn) {
			return this.terms(fn.apply(new CompositeTermsAggregation.Builder()).build());
		}

		public ObjectBuilder<CompositeAggregationSource> histogram(CompositeHistogramAggregation v) {
			this._kind = Kind.Histogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CompositeAggregationSource> histogram(
				Function<CompositeHistogramAggregation.Builder, ObjectBuilder<CompositeHistogramAggregation>> fn) {
			return this.histogram(fn.apply(new CompositeHistogramAggregation.Builder()).build());
		}

		public ObjectBuilder<CompositeAggregationSource> dateHistogram(CompositeDateHistogramAggregation v) {
			this._kind = Kind.DateHistogram;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CompositeAggregationSource> dateHistogram(
				Function<CompositeDateHistogramAggregation.Builder, ObjectBuilder<CompositeDateHistogramAggregation>> fn) {
			return this.dateHistogram(fn.apply(new CompositeDateHistogramAggregation.Builder()).build());
		}

		public ObjectBuilder<CompositeAggregationSource> geotileGrid(CompositeGeoTileGridAggregation v) {
			this._kind = Kind.GeotileGrid;
			this._value = v;
			return this;
		}

		public ObjectBuilder<CompositeAggregationSource> geotileGrid(
				Function<CompositeGeoTileGridAggregation.Builder, ObjectBuilder<CompositeGeoTileGridAggregation>> fn) {
			return this.geotileGrid(fn.apply(new CompositeGeoTileGridAggregation.Builder()).build());
		}

		public CompositeAggregationSource build() {
			_checkSingleUse();
			return new CompositeAggregationSource(this);
		}

	}

	protected static void setupCompositeAggregationSourceDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::terms, CompositeTermsAggregation._DESERIALIZER, "terms");
		op.add(Builder::histogram, CompositeHistogramAggregation._DESERIALIZER, "histogram");
		op.add(Builder::dateHistogram, CompositeDateHistogramAggregation._DESERIALIZER, "date_histogram");
		op.add(Builder::geotileGrid, CompositeGeoTileGridAggregation._DESERIALIZER, "geotile_grid");

	}

	public static final JsonpDeserializer<CompositeAggregationSource> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, CompositeAggregationSource::setupCompositeAggregationSourceDeserializer, Builder::build);
}
