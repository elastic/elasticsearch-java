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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsFieldSelection

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsFieldSelection">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsFieldSelection implements JsonpSerializable {
	private final boolean isIncluded;

	private final boolean isRequired;

	@Nullable
	private final String featureType;

	private final List<String> mappingTypes;

	private final String name;

	@Nullable
	private final String reason;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsFieldSelection(Builder builder) {

		this.isIncluded = ApiTypeHelper.requireNonNull(builder.isIncluded, this, "isIncluded");
		this.isRequired = ApiTypeHelper.requireNonNull(builder.isRequired, this, "isRequired");
		this.featureType = builder.featureType;
		this.mappingTypes = ApiTypeHelper.unmodifiableRequired(builder.mappingTypes, this, "mappingTypes");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.reason = builder.reason;

	}

	public static DataframeAnalyticsFieldSelection of(
			Function<Builder, ObjectBuilder<DataframeAnalyticsFieldSelection>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Whether the field is selected to be included in the analysis.
	 * <p>
	 * API name: {@code is_included}
	 */
	public final boolean isIncluded() {
		return this.isIncluded;
	}

	/**
	 * Required - Whether the field is required.
	 * <p>
	 * API name: {@code is_required}
	 */
	public final boolean isRequired() {
		return this.isRequired;
	}

	/**
	 * The feature type of this field for the analysis. May be categorical or
	 * numerical.
	 * <p>
	 * API name: {@code feature_type}
	 */
	@Nullable
	public final String featureType() {
		return this.featureType;
	}

	/**
	 * Required - The mapping types of the field.
	 * <p>
	 * API name: {@code mapping_types}
	 */
	public final List<String> mappingTypes() {
		return this.mappingTypes;
	}

	/**
	 * Required - The field name.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * The reason a field is not selected to be included in the analysis.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
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

		generator.writeKey("is_included");
		generator.write(this.isIncluded);

		generator.writeKey("is_required");
		generator.write(this.isRequired);

		if (this.featureType != null) {
			generator.writeKey("feature_type");
			generator.write(this.featureType);

		}
		if (ApiTypeHelper.isDefined(this.mappingTypes)) {
			generator.writeKey("mapping_types");
			generator.writeStartArray();
			for (String item0 : this.mappingTypes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("name");
		generator.write(this.name);

		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsFieldSelection}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsFieldSelection> {
		private Boolean isIncluded;

		private Boolean isRequired;

		@Nullable
		private String featureType;

		private List<String> mappingTypes;

		private String name;

		@Nullable
		private String reason;

		/**
		 * Required - Whether the field is selected to be included in the analysis.
		 * <p>
		 * API name: {@code is_included}
		 */
		public final Builder isIncluded(boolean value) {
			this.isIncluded = value;
			return this;
		}

		/**
		 * Required - Whether the field is required.
		 * <p>
		 * API name: {@code is_required}
		 */
		public final Builder isRequired(boolean value) {
			this.isRequired = value;
			return this;
		}

		/**
		 * The feature type of this field for the analysis. May be categorical or
		 * numerical.
		 * <p>
		 * API name: {@code feature_type}
		 */
		public final Builder featureType(@Nullable String value) {
			this.featureType = value;
			return this;
		}

		/**
		 * Required - The mapping types of the field.
		 * <p>
		 * API name: {@code mapping_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>mappingTypes</code>.
		 */
		public final Builder mappingTypes(List<String> list) {
			this.mappingTypes = _listAddAll(this.mappingTypes, list);
			return this;
		}

		/**
		 * Required - The mapping types of the field.
		 * <p>
		 * API name: {@code mapping_types}
		 * <p>
		 * Adds one or more values to <code>mappingTypes</code>.
		 */
		public final Builder mappingTypes(String value, String... values) {
			this.mappingTypes = _listAdd(this.mappingTypes, value, values);
			return this;
		}

		/**
		 * Required - The field name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The reason a field is not selected to be included in the analysis.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsFieldSelection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsFieldSelection build() {
			_checkSingleUse();

			return new DataframeAnalyticsFieldSelection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsFieldSelection}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsFieldSelection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsFieldSelection::setupDataframeAnalyticsFieldSelectionDeserializer);

	protected static void setupDataframeAnalyticsFieldSelectionDeserializer(
			ObjectDeserializer<DataframeAnalyticsFieldSelection.Builder> op) {

		op.add(Builder::isIncluded, JsonpDeserializer.booleanDeserializer(), "is_included");
		op.add(Builder::isRequired, JsonpDeserializer.booleanDeserializer(), "is_required");
		op.add(Builder::featureType, JsonpDeserializer.stringDeserializer(), "feature_type");
		op.add(Builder::mappingTypes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"mapping_types");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
