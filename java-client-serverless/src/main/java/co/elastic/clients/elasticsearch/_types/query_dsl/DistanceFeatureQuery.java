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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.DistanceFeatureQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DistanceFeatureQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class DistanceFeatureQuery extends QueryBase implements QueryVariant {
	private final JsonData origin;

	private final JsonData pivot;

	private final String field;

	// ---------------------------------------------------------------------------------------------

	private DistanceFeatureQuery(Builder builder) {
		super(builder);

		this.origin = ApiTypeHelper.requireNonNull(builder.origin, this, "origin");
		this.pivot = ApiTypeHelper.requireNonNull(builder.pivot, this, "pivot");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

	}

	public static DistanceFeatureQuery of(Function<Builder, ObjectBuilder<DistanceFeatureQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.DistanceFeature;
	}

	/**
	 * Required - Date or point of origin used to calculate distances. If the
	 * <code>field</code> value is a <code>date</code> or <code>date_nanos</code>
	 * field, the <code>origin</code> value must be a date. Date Math, such as
	 * <code>now-1h</code>, is supported. If the field value is a
	 * <code>geo_point</code> field, the <code>origin</code> value must be a
	 * geopoint.
	 * <p>
	 * API name: {@code origin}
	 */
	public final JsonData origin() {
		return this.origin;
	}

	/**
	 * Required - Distance from the <code>origin</code> at which relevance scores
	 * receive half of the <code>boost</code> value. If the <code>field</code> value
	 * is a <code>date</code> or <code>date_nanos</code> field, the
	 * <code>pivot</code> value must be a time unit, such as <code>1h</code> or
	 * <code>10d</code>. If the <code>field</code> value is a <code>geo_point</code>
	 * field, the <code>pivot</code> value must be a distance unit, such as
	 * <code>1km</code> or <code>12m</code>.
	 * <p>
	 * API name: {@code pivot}
	 */
	public final JsonData pivot() {
		return this.pivot;
	}

	/**
	 * Required - Name of the field used to calculate distances. This field must
	 * meet the following criteria: be a <code>date</code>, <code>date_nanos</code>
	 * or <code>geo_point</code> field; have an <code>index</code> mapping parameter
	 * value of <code>true</code>, which is the default; have an
	 * <code>doc_values</code> mapping parameter value of <code>true</code>, which
	 * is the default.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("origin");
		this.origin.serialize(generator, mapper);

		generator.writeKey("pivot");
		this.pivot.serialize(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DistanceFeatureQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DistanceFeatureQuery> {
		private JsonData origin;

		private JsonData pivot;

		private String field;

		/**
		 * Required - Date or point of origin used to calculate distances. If the
		 * <code>field</code> value is a <code>date</code> or <code>date_nanos</code>
		 * field, the <code>origin</code> value must be a date. Date Math, such as
		 * <code>now-1h</code>, is supported. If the field value is a
		 * <code>geo_point</code> field, the <code>origin</code> value must be a
		 * geopoint.
		 * <p>
		 * API name: {@code origin}
		 */
		public final Builder origin(JsonData value) {
			this.origin = value;
			return this;
		}

		/**
		 * Required - Distance from the <code>origin</code> at which relevance scores
		 * receive half of the <code>boost</code> value. If the <code>field</code> value
		 * is a <code>date</code> or <code>date_nanos</code> field, the
		 * <code>pivot</code> value must be a time unit, such as <code>1h</code> or
		 * <code>10d</code>. If the <code>field</code> value is a <code>geo_point</code>
		 * field, the <code>pivot</code> value must be a distance unit, such as
		 * <code>1km</code> or <code>12m</code>.
		 * <p>
		 * API name: {@code pivot}
		 */
		public final Builder pivot(JsonData value) {
			this.pivot = value;
			return this;
		}

		/**
		 * Required - Name of the field used to calculate distances. This field must
		 * meet the following criteria: be a <code>date</code>, <code>date_nanos</code>
		 * or <code>geo_point</code> field; have an <code>index</code> mapping parameter
		 * value of <code>true</code>, which is the default; have an
		 * <code>doc_values</code> mapping parameter value of <code>true</code>, which
		 * is the default.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DistanceFeatureQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DistanceFeatureQuery build() {
			_checkSingleUse();

			return new DistanceFeatureQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DistanceFeatureQuery}
	 */
	public static final JsonpDeserializer<DistanceFeatureQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DistanceFeatureQuery::setupDistanceFeatureQueryDeserializer);

	protected static void setupDistanceFeatureQueryDeserializer(ObjectDeserializer<DistanceFeatureQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::origin, JsonData._DESERIALIZER, "origin");
		op.add(Builder::pivot, JsonData._DESERIALIZER, "pivot");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
