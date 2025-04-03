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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: ingest._types.GeoGridProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.GeoGridProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoGridProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final GeoGridTileType tileType;

	@Nullable
	private final String targetField;

	@Nullable
	private final String parentField;

	@Nullable
	private final String childrenField;

	@Nullable
	private final String nonChildrenField;

	@Nullable
	private final String precisionField;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final GeoGridTargetFormat targetFormat;

	// ---------------------------------------------------------------------------------------------

	private GeoGridProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.tileType = ApiTypeHelper.requireNonNull(builder.tileType, this, "tileType");
		this.targetField = builder.targetField;
		this.parentField = builder.parentField;
		this.childrenField = builder.childrenField;
		this.nonChildrenField = builder.nonChildrenField;
		this.precisionField = builder.precisionField;
		this.ignoreMissing = builder.ignoreMissing;
		this.targetFormat = builder.targetFormat;

	}

	public static GeoGridProcessor of(Function<Builder, ObjectBuilder<GeoGridProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.GeoGrid;
	}

	/**
	 * Required - The field to interpret as a geo-tile.= The field format is
	 * determined by the <code>tile_type</code>.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - Three tile formats are understood: geohash, geotile and geohex.
	 * <p>
	 * API name: {@code tile_type}
	 */
	public final GeoGridTileType tileType() {
		return this.tileType;
	}

	/**
	 * The field to assign the polygon shape to, by default, the <code>field</code>
	 * is updated in-place.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * If specified and a parent tile exists, save that tile address to this field.
	 * <p>
	 * API name: {@code parent_field}
	 */
	@Nullable
	public final String parentField() {
		return this.parentField;
	}

	/**
	 * If specified and children tiles exist, save those tile addresses to this
	 * field as an array of strings.
	 * <p>
	 * API name: {@code children_field}
	 */
	@Nullable
	public final String childrenField() {
		return this.childrenField;
	}

	/**
	 * If specified and intersecting non-child tiles exist, save their addresses to
	 * this field as an array of strings.
	 * <p>
	 * API name: {@code non_children_field}
	 */
	@Nullable
	public final String nonChildrenField() {
		return this.nonChildrenField;
	}

	/**
	 * If specified, save the tile precision (zoom) as an integer to this field.
	 * <p>
	 * API name: {@code precision_field}
	 */
	@Nullable
	public final String precisionField() {
		return this.precisionField;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist, the processor
	 * quietly exits without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * Which format to save the generated polygon in.
	 * <p>
	 * API name: {@code target_format}
	 */
	@Nullable
	public final GeoGridTargetFormat targetFormat() {
		return this.targetFormat;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("tile_type");
		this.tileType.serialize(generator, mapper);
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.parentField != null) {
			generator.writeKey("parent_field");
			generator.write(this.parentField);

		}
		if (this.childrenField != null) {
			generator.writeKey("children_field");
			generator.write(this.childrenField);

		}
		if (this.nonChildrenField != null) {
			generator.writeKey("non_children_field");
			generator.write(this.nonChildrenField);

		}
		if (this.precisionField != null) {
			generator.writeKey("precision_field");
			generator.write(this.precisionField);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.targetFormat != null) {
			generator.writeKey("target_format");
			this.targetFormat.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoGridProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoGridProcessor> {
		private String field;

		private GeoGridTileType tileType;

		@Nullable
		private String targetField;

		@Nullable
		private String parentField;

		@Nullable
		private String childrenField;

		@Nullable
		private String nonChildrenField;

		@Nullable
		private String precisionField;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private GeoGridTargetFormat targetFormat;

		/**
		 * Required - The field to interpret as a geo-tile.= The field format is
		 * determined by the <code>tile_type</code>.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - Three tile formats are understood: geohash, geotile and geohex.
		 * <p>
		 * API name: {@code tile_type}
		 */
		public final Builder tileType(GeoGridTileType value) {
			this.tileType = value;
			return this;
		}

		/**
		 * The field to assign the polygon shape to, by default, the <code>field</code>
		 * is updated in-place.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * If specified and a parent tile exists, save that tile address to this field.
		 * <p>
		 * API name: {@code parent_field}
		 */
		public final Builder parentField(@Nullable String value) {
			this.parentField = value;
			return this;
		}

		/**
		 * If specified and children tiles exist, save those tile addresses to this
		 * field as an array of strings.
		 * <p>
		 * API name: {@code children_field}
		 */
		public final Builder childrenField(@Nullable String value) {
			this.childrenField = value;
			return this;
		}

		/**
		 * If specified and intersecting non-child tiles exist, save their addresses to
		 * this field as an array of strings.
		 * <p>
		 * API name: {@code non_children_field}
		 */
		public final Builder nonChildrenField(@Nullable String value) {
			this.nonChildrenField = value;
			return this;
		}

		/**
		 * If specified, save the tile precision (zoom) as an integer to this field.
		 * <p>
		 * API name: {@code precision_field}
		 */
		public final Builder precisionField(@Nullable String value) {
			this.precisionField = value;
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist, the processor
		 * quietly exits without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * Which format to save the generated polygon in.
		 * <p>
		 * API name: {@code target_format}
		 */
		public final Builder targetFormat(@Nullable GeoGridTargetFormat value) {
			this.targetFormat = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoGridProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoGridProcessor build() {
			_checkSingleUse();

			return new GeoGridProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoGridProcessor}
	 */
	public static final JsonpDeserializer<GeoGridProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoGridProcessor::setupGeoGridProcessorDeserializer);

	protected static void setupGeoGridProcessorDeserializer(ObjectDeserializer<GeoGridProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::tileType, GeoGridTileType._DESERIALIZER, "tile_type");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::parentField, JsonpDeserializer.stringDeserializer(), "parent_field");
		op.add(Builder::childrenField, JsonpDeserializer.stringDeserializer(), "children_field");
		op.add(Builder::nonChildrenField, JsonpDeserializer.stringDeserializer(), "non_children_field");
		op.add(Builder::precisionField, JsonpDeserializer.stringDeserializer(), "precision_field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::targetFormat, GeoGridTargetFormat._DESERIALIZER, "target_format");

	}

}
