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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.MappingLimitSettings

/**
 * Mapping Limit Settings
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/mapping-settings-limit.html">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.MappingLimitSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class MappingLimitSettings implements JsonpSerializable {
	@Nullable
	private final Boolean coerce;

	@Nullable
	private final MappingLimitSettingsTotalFields totalFields;

	@Nullable
	private final MappingLimitSettingsDepth depth;

	@Nullable
	private final MappingLimitSettingsNestedFields nestedFields;

	@Nullable
	private final MappingLimitSettingsNestedObjects nestedObjects;

	@Nullable
	private final MappingLimitSettingsFieldNameLength fieldNameLength;

	@Nullable
	private final MappingLimitSettingsDimensionFields dimensionFields;

	@Nullable
	private final Boolean ignoreMalformed;

	// ---------------------------------------------------------------------------------------------

	private MappingLimitSettings(Builder builder) {

		this.coerce = builder.coerce;
		this.totalFields = builder.totalFields;
		this.depth = builder.depth;
		this.nestedFields = builder.nestedFields;
		this.nestedObjects = builder.nestedObjects;
		this.fieldNameLength = builder.fieldNameLength;
		this.dimensionFields = builder.dimensionFields;
		this.ignoreMalformed = builder.ignoreMalformed;

	}

	public static MappingLimitSettings of(Function<Builder, ObjectBuilder<MappingLimitSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code total_fields}
	 */
	@Nullable
	public final MappingLimitSettingsTotalFields totalFields() {
		return this.totalFields;
	}

	/**
	 * API name: {@code depth}
	 */
	@Nullable
	public final MappingLimitSettingsDepth depth() {
		return this.depth;
	}

	/**
	 * API name: {@code nested_fields}
	 */
	@Nullable
	public final MappingLimitSettingsNestedFields nestedFields() {
		return this.nestedFields;
	}

	/**
	 * API name: {@code nested_objects}
	 */
	@Nullable
	public final MappingLimitSettingsNestedObjects nestedObjects() {
		return this.nestedObjects;
	}

	/**
	 * API name: {@code field_name_length}
	 */
	@Nullable
	public final MappingLimitSettingsFieldNameLength fieldNameLength() {
		return this.fieldNameLength;
	}

	/**
	 * API name: {@code dimension_fields}
	 */
	@Nullable
	public final MappingLimitSettingsDimensionFields dimensionFields() {
		return this.dimensionFields;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
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

		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.totalFields != null) {
			generator.writeKey("total_fields");
			this.totalFields.serialize(generator, mapper);

		}
		if (this.depth != null) {
			generator.writeKey("depth");
			this.depth.serialize(generator, mapper);

		}
		if (this.nestedFields != null) {
			generator.writeKey("nested_fields");
			this.nestedFields.serialize(generator, mapper);

		}
		if (this.nestedObjects != null) {
			generator.writeKey("nested_objects");
			this.nestedObjects.serialize(generator, mapper);

		}
		if (this.fieldNameLength != null) {
			generator.writeKey("field_name_length");
			this.fieldNameLength.serialize(generator, mapper);

		}
		if (this.dimensionFields != null) {
			generator.writeKey("dimension_fields");
			this.dimensionFields.serialize(generator, mapper);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MappingLimitSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MappingLimitSettings> {
		@Nullable
		private Boolean coerce;

		@Nullable
		private MappingLimitSettingsTotalFields totalFields;

		@Nullable
		private MappingLimitSettingsDepth depth;

		@Nullable
		private MappingLimitSettingsNestedFields nestedFields;

		@Nullable
		private MappingLimitSettingsNestedObjects nestedObjects;

		@Nullable
		private MappingLimitSettingsFieldNameLength fieldNameLength;

		@Nullable
		private MappingLimitSettingsDimensionFields dimensionFields;

		@Nullable
		private Boolean ignoreMalformed;

		/**
		 * API name: {@code coerce}
		 */
		public final Builder coerce(@Nullable Boolean value) {
			this.coerce = value;
			return this;
		}

		/**
		 * API name: {@code total_fields}
		 */
		public final Builder totalFields(@Nullable MappingLimitSettingsTotalFields value) {
			this.totalFields = value;
			return this;
		}

		/**
		 * API name: {@code total_fields}
		 */
		public final Builder totalFields(
				Function<MappingLimitSettingsTotalFields.Builder, ObjectBuilder<MappingLimitSettingsTotalFields>> fn) {
			return this.totalFields(fn.apply(new MappingLimitSettingsTotalFields.Builder()).build());
		}

		/**
		 * API name: {@code depth}
		 */
		public final Builder depth(@Nullable MappingLimitSettingsDepth value) {
			this.depth = value;
			return this;
		}

		/**
		 * API name: {@code depth}
		 */
		public final Builder depth(
				Function<MappingLimitSettingsDepth.Builder, ObjectBuilder<MappingLimitSettingsDepth>> fn) {
			return this.depth(fn.apply(new MappingLimitSettingsDepth.Builder()).build());
		}

		/**
		 * API name: {@code nested_fields}
		 */
		public final Builder nestedFields(@Nullable MappingLimitSettingsNestedFields value) {
			this.nestedFields = value;
			return this;
		}

		/**
		 * API name: {@code nested_fields}
		 */
		public final Builder nestedFields(
				Function<MappingLimitSettingsNestedFields.Builder, ObjectBuilder<MappingLimitSettingsNestedFields>> fn) {
			return this.nestedFields(fn.apply(new MappingLimitSettingsNestedFields.Builder()).build());
		}

		/**
		 * API name: {@code nested_objects}
		 */
		public final Builder nestedObjects(@Nullable MappingLimitSettingsNestedObjects value) {
			this.nestedObjects = value;
			return this;
		}

		/**
		 * API name: {@code nested_objects}
		 */
		public final Builder nestedObjects(
				Function<MappingLimitSettingsNestedObjects.Builder, ObjectBuilder<MappingLimitSettingsNestedObjects>> fn) {
			return this.nestedObjects(fn.apply(new MappingLimitSettingsNestedObjects.Builder()).build());
		}

		/**
		 * API name: {@code field_name_length}
		 */
		public final Builder fieldNameLength(@Nullable MappingLimitSettingsFieldNameLength value) {
			this.fieldNameLength = value;
			return this;
		}

		/**
		 * API name: {@code field_name_length}
		 */
		public final Builder fieldNameLength(
				Function<MappingLimitSettingsFieldNameLength.Builder, ObjectBuilder<MappingLimitSettingsFieldNameLength>> fn) {
			return this.fieldNameLength(fn.apply(new MappingLimitSettingsFieldNameLength.Builder()).build());
		}

		/**
		 * API name: {@code dimension_fields}
		 */
		public final Builder dimensionFields(@Nullable MappingLimitSettingsDimensionFields value) {
			this.dimensionFields = value;
			return this;
		}

		/**
		 * API name: {@code dimension_fields}
		 */
		public final Builder dimensionFields(
				Function<MappingLimitSettingsDimensionFields.Builder, ObjectBuilder<MappingLimitSettingsDimensionFields>> fn) {
			return this.dimensionFields(fn.apply(new MappingLimitSettingsDimensionFields.Builder()).build());
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MappingLimitSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MappingLimitSettings build() {
			_checkSingleUse();

			return new MappingLimitSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MappingLimitSettings}
	 */
	public static final JsonpDeserializer<MappingLimitSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MappingLimitSettings::setupMappingLimitSettingsDeserializer);

	protected static void setupMappingLimitSettingsDeserializer(ObjectDeserializer<MappingLimitSettings.Builder> op) {

		op.add(Builder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(Builder::totalFields, MappingLimitSettingsTotalFields._DESERIALIZER, "total_fields");
		op.add(Builder::depth, MappingLimitSettingsDepth._DESERIALIZER, "depth");
		op.add(Builder::nestedFields, MappingLimitSettingsNestedFields._DESERIALIZER, "nested_fields");
		op.add(Builder::nestedObjects, MappingLimitSettingsNestedObjects._DESERIALIZER, "nested_objects");
		op.add(Builder::fieldNameLength, MappingLimitSettingsFieldNameLength._DESERIALIZER, "field_name_length");
		op.add(Builder::dimensionFields, MappingLimitSettingsDimensionFields._DESERIALIZER, "dimension_fields");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");

	}

}
