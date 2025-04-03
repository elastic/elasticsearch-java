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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
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

// typedef: _types.query_dsl.DistanceFeatureQueryBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DistanceFeatureQueryBase">API
 *      specification</a>
 */

public abstract class DistanceFeatureQueryBase<TOrigin, TDistance> extends QueryBase {
	private final TOrigin origin;

	private final TDistance pivot;

	private final String field;

	@Nullable
	private final JsonpSerializer<TOrigin> tOriginSerializer;

	@Nullable
	private final JsonpSerializer<TDistance> tDistanceSerializer;

	// ---------------------------------------------------------------------------------------------

	protected DistanceFeatureQueryBase(AbstractBuilder<TOrigin, TDistance, ?> builder) {
		super(builder);

		this.origin = ApiTypeHelper.requireNonNull(builder.origin, this, "origin");
		this.pivot = ApiTypeHelper.requireNonNull(builder.pivot, this, "pivot");
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.tOriginSerializer = builder.tOriginSerializer;
		this.tDistanceSerializer = builder.tDistanceSerializer;

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
	public final TOrigin origin() {
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
	public final TDistance pivot() {
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
		JsonpUtils.serialize(this.origin, generator, tOriginSerializer, mapper);

		generator.writeKey("pivot");
		JsonpUtils.serialize(this.pivot, generator, tDistanceSerializer, mapper);

		generator.writeKey("field");
		generator.write(this.field);

	}

	public abstract static class AbstractBuilder<TOrigin, TDistance, BuilderT extends AbstractBuilder<TOrigin, TDistance, BuilderT>>
			extends
				QueryBase.AbstractBuilder<BuilderT> {
		private TOrigin origin;

		private TDistance pivot;

		private String field;

		@Nullable
		private JsonpSerializer<TOrigin> tOriginSerializer;

		@Nullable
		private JsonpSerializer<TDistance> tDistanceSerializer;

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
		public final BuilderT origin(TOrigin value) {
			this.origin = value;
			return self();
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
		public final BuilderT pivot(TDistance value) {
			this.pivot = value;
			return self();
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
		public final BuilderT field(String value) {
			this.field = value;
			return self();
		}

		/**
		 * Serializer for TOrigin. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tOriginSerializer(@Nullable JsonpSerializer<TOrigin> value) {
			this.tOriginSerializer = value;
			return self();
		}

		/**
		 * Serializer for TDistance. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final BuilderT tDistanceSerializer(@Nullable JsonpSerializer<TDistance> value) {
			this.tDistanceSerializer = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TOrigin, TDistance, BuilderT extends AbstractBuilder<TOrigin, TDistance, BuilderT>> void setupDistanceFeatureQueryBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TOrigin> tOriginDeserializer,
			JsonpDeserializer<TDistance> tDistanceDeserializer) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(AbstractBuilder::origin, tOriginDeserializer, "origin");
		op.add(AbstractBuilder::pivot, tDistanceDeserializer, "pivot");
		op.add(AbstractBuilder::field, JsonpDeserializer.stringDeserializer(), "field");

	}

}
