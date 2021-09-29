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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsFieldSelection
@JsonpDeserializable
public final class DataframeAnalyticsFieldSelection implements JsonpSerializable {
	private final boolean isIncluded;

	private final boolean isRequired;

	@Nullable
	private final String featureType;

	private final List<String> mappingTypes;

	private final String name;

	@Nullable
	private final String reason;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsFieldSelection(Builder builder) {

		this.isIncluded = Objects.requireNonNull(builder.isIncluded, "is_included");
		this.isRequired = Objects.requireNonNull(builder.isRequired, "is_required");
		this.featureType = builder.featureType;
		this.mappingTypes = ModelTypeHelper.unmodifiableNonNull(builder.mappingTypes, "mapping_types");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.reason = builder.reason;

	}

	public DataframeAnalyticsFieldSelection(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Whether the field is selected to be included in the analysis.
	 * <p>
	 * API name: {@code is_included}
	 */
	public boolean isIncluded() {
		return this.isIncluded;
	}

	/**
	 * Whether the field is required.
	 * <p>
	 * API name: {@code is_required}
	 */
	public boolean isRequired() {
		return this.isRequired;
	}

	/**
	 * The feature type of this field for the analysis. May be categorical or
	 * numerical.
	 * <p>
	 * API name: {@code feature_type}
	 */
	@Nullable
	public String featureType() {
		return this.featureType;
	}

	/**
	 * The mapping types of the field.
	 * <p>
	 * API name: {@code mapping_types}
	 */
	public List<String> mappingTypes() {
		return this.mappingTypes;
	}

	/**
	 * The field name.
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * The reason a field is not selected to be included in the analysis.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
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

		generator.writeKey("mapping_types");
		generator.writeStartArray();
		for (String item0 : this.mappingTypes) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("name");
		generator.write(this.name);

		if (this.reason != null) {

			generator.writeKey("reason");
			generator.write(this.reason);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsFieldSelection}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsFieldSelection> {
		private Boolean isIncluded;

		private Boolean isRequired;

		@Nullable
		private String featureType;

		private List<String> mappingTypes;

		private String name;

		@Nullable
		private String reason;

		/**
		 * Whether the field is selected to be included in the analysis.
		 * <p>
		 * API name: {@code is_included}
		 */
		public Builder isIncluded(boolean value) {
			this.isIncluded = value;
			return this;
		}

		/**
		 * Whether the field is required.
		 * <p>
		 * API name: {@code is_required}
		 */
		public Builder isRequired(boolean value) {
			this.isRequired = value;
			return this;
		}

		/**
		 * The feature type of this field for the analysis. May be categorical or
		 * numerical.
		 * <p>
		 * API name: {@code feature_type}
		 */
		public Builder featureType(@Nullable String value) {
			this.featureType = value;
			return this;
		}

		/**
		 * The mapping types of the field.
		 * <p>
		 * API name: {@code mapping_types}
		 */
		public Builder mappingTypes(List<String> value) {
			this.mappingTypes = value;
			return this;
		}

		/**
		 * The mapping types of the field.
		 * <p>
		 * API name: {@code mapping_types}
		 */
		public Builder mappingTypes(String... value) {
			this.mappingTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #mappingTypes(List)}, creating the list if needed. 4
		 */
		public Builder addMappingTypes(String value) {
			if (this.mappingTypes == null) {
				this.mappingTypes = new ArrayList<>();
			}
			this.mappingTypes.add(value);
			return this;
		}

		/**
		 * The field name.
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * The reason a field is not selected to be included in the analysis.
		 * <p>
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsFieldSelection}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsFieldSelection build() {

			return new DataframeAnalyticsFieldSelection(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsFieldSelection}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsFieldSelection> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsFieldSelection::setupDataframeAnalyticsFieldSelectionDeserializer,
					Builder::build);

	protected static void setupDataframeAnalyticsFieldSelectionDeserializer(
			DelegatingDeserializer<DataframeAnalyticsFieldSelection.Builder> op) {

		op.add(Builder::isIncluded, JsonpDeserializer.booleanDeserializer(), "is_included");
		op.add(Builder::isRequired, JsonpDeserializer.booleanDeserializer(), "is_required");
		op.add(Builder::featureType, JsonpDeserializer.stringDeserializer(), "feature_type");
		op.add(Builder::mappingTypes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"mapping_types");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");

	}

}
