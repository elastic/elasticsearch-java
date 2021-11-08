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

import co.elastic.clients.elasticsearch._types.GeoLine;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoLineAggregate
@JsonpDeserializable
public class GeoLineAggregate extends AggregateBase implements AggregateVariant {
	private final JsonValue /* LiteralValue("Feature") */ type;

	private final GeoLine geometry;

	// ---------------------------------------------------------------------------------------------

	private GeoLineAggregate(Builder builder) {
		super(builder);

		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");
		this.geometry = ModelTypeHelper.requireNonNull(builder.geometry, this, "geometry");

	}

	public static GeoLineAggregate of(Function<Builder, ObjectBuilder<GeoLineAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_line";
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final JsonValue /* LiteralValue("Feature") */ type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code geometry}
	 */
	public final GeoLine geometry() {
		return this.geometry;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("geometry");
		this.geometry.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoLineAggregate}.
	 */
	public static class Builder extends AggregateBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoLineAggregate> {
		private JsonValue /* LiteralValue("Feature") */ type;

		private GeoLine geometry;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(JsonValue /* LiteralValue("Feature") */ value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code geometry}
		 */
		public final Builder geometry(GeoLine value) {
			this.geometry = value;
			return this;
		}

		/**
		 * Required - API name: {@code geometry}
		 */
		public final Builder geometry(Function<GeoLine.Builder, ObjectBuilder<GeoLine>> fn) {
			return this.geometry(fn.apply(new GeoLine.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoLineAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLineAggregate build() {
			_checkSingleUse();

			return new GeoLineAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLineAggregate}
	 */
	public static final JsonpDeserializer<GeoLineAggregate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoLineAggregate::setupGeoLineAggregateDeserializer, Builder::build);

	protected static void setupGeoLineAggregateDeserializer(DelegatingDeserializer<GeoLineAggregate.Builder> op) {
		AggregateBase.setupAggregateBaseDeserializer(op);
		op.add(Builder::type, JsonpDeserializer.jsonValueDeserializer(), "type");
		op.add(Builder::geometry, GeoLine._DESERIALIZER, "geometry");

	}

}
