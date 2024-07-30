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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.json.JsonData;
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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: connector._types.ConnectorConfigProperties

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.ConnectorConfigProperties">API
 *      specification</a>
 */
@JsonpDeserializable
public class ConnectorConfigProperties implements JsonpSerializable {
	@Nullable
	private final String category;

	private final FieldValue defaultValue;

	private final List<Dependency> dependsOn;

	private final DisplayType display;

	private final String label;

	private final List<SelectOption> options;

	@Nullable
	private final Integer order;

	@Nullable
	private final String placeholder;

	private final boolean required;

	private final boolean sensitive;

	@Nullable
	private final String tooltip;

	@Nullable
	private final ConnectorFieldType type;

	private final List<String> uiRestrictions;

	private final List<Validation> validations;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private ConnectorConfigProperties(Builder builder) {

		this.category = builder.category;
		this.defaultValue = ApiTypeHelper.requireNonNull(builder.defaultValue, this, "defaultValue");
		this.dependsOn = ApiTypeHelper.unmodifiableRequired(builder.dependsOn, this, "dependsOn");
		this.display = ApiTypeHelper.requireNonNull(builder.display, this, "display");
		this.label = ApiTypeHelper.requireNonNull(builder.label, this, "label");
		this.options = ApiTypeHelper.unmodifiableRequired(builder.options, this, "options");
		this.order = builder.order;
		this.placeholder = builder.placeholder;
		this.required = ApiTypeHelper.requireNonNull(builder.required, this, "required");
		this.sensitive = ApiTypeHelper.requireNonNull(builder.sensitive, this, "sensitive");
		this.tooltip = builder.tooltip;
		this.type = builder.type;
		this.uiRestrictions = ApiTypeHelper.unmodifiable(builder.uiRestrictions);
		this.validations = ApiTypeHelper.unmodifiable(builder.validations);
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static ConnectorConfigProperties of(Function<Builder, ObjectBuilder<ConnectorConfigProperties>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code category}
	 */
	@Nullable
	public final String category() {
		return this.category;
	}

	/**
	 * Required - API name: {@code default_value}
	 */
	public final FieldValue defaultValue() {
		return this.defaultValue;
	}

	/**
	 * Required - API name: {@code depends_on}
	 */
	public final List<Dependency> dependsOn() {
		return this.dependsOn;
	}

	/**
	 * Required - API name: {@code display}
	 */
	public final DisplayType display() {
		return this.display;
	}

	/**
	 * Required - API name: {@code label}
	 */
	public final String label() {
		return this.label;
	}

	/**
	 * Required - API name: {@code options}
	 */
	public final List<SelectOption> options() {
		return this.options;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public final Integer order() {
		return this.order;
	}

	/**
	 * API name: {@code placeholder}
	 */
	@Nullable
	public final String placeholder() {
		return this.placeholder;
	}

	/**
	 * Required - API name: {@code required}
	 */
	public final boolean required() {
		return this.required;
	}

	/**
	 * Required - API name: {@code sensitive}
	 */
	public final boolean sensitive() {
		return this.sensitive;
	}

	/**
	 * API name: {@code tooltip}
	 */
	@Nullable
	public final String tooltip() {
		return this.tooltip;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final ConnectorFieldType type() {
		return this.type;
	}

	/**
	 * API name: {@code ui_restrictions}
	 */
	public final List<String> uiRestrictions() {
		return this.uiRestrictions;
	}

	/**
	 * API name: {@code validations}
	 */
	public final List<Validation> validations() {
		return this.validations;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final JsonData value() {
		return this.value;
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

		if (this.category != null) {
			generator.writeKey("category");
			generator.write(this.category);

		}
		generator.writeKey("default_value");
		this.defaultValue.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.dependsOn)) {
			generator.writeKey("depends_on");
			generator.writeStartArray();
			for (Dependency item0 : this.dependsOn) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("display");
		this.display.serialize(generator, mapper);
		generator.writeKey("label");
		generator.write(this.label);

		if (ApiTypeHelper.isDefined(this.options)) {
			generator.writeKey("options");
			generator.writeStartArray();
			for (SelectOption item0 : this.options) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.order != null) {
			generator.writeKey("order");
			generator.write(this.order);

		}
		if (this.placeholder != null) {
			generator.writeKey("placeholder");
			generator.write(this.placeholder);

		}
		generator.writeKey("required");
		generator.write(this.required);

		generator.writeKey("sensitive");
		generator.write(this.sensitive);

		if (this.tooltip != null) {
			generator.writeKey("tooltip");
			generator.write(this.tooltip);

		}
		if (this.type != null) {
			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.uiRestrictions)) {
			generator.writeKey("ui_restrictions");
			generator.writeStartArray();
			for (String item0 : this.uiRestrictions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.validations)) {
			generator.writeKey("validations");
			generator.writeStartArray();
			for (Validation item0 : this.validations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConnectorConfigProperties}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ConnectorConfigProperties> {
		@Nullable
		private String category;

		private FieldValue defaultValue;

		private List<Dependency> dependsOn;

		private DisplayType display;

		private String label;

		private List<SelectOption> options;

		@Nullable
		private Integer order;

		@Nullable
		private String placeholder;

		private Boolean required;

		private Boolean sensitive;

		@Nullable
		private String tooltip;

		@Nullable
		private ConnectorFieldType type;

		@Nullable
		private List<String> uiRestrictions;

		@Nullable
		private List<Validation> validations;

		private JsonData value;

		/**
		 * API name: {@code category}
		 */
		public final Builder category(@Nullable String value) {
			this.category = value;
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(FieldValue value) {
			this.defaultValue = value;
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return this.defaultValue(fn.apply(new FieldValue.Builder()).build());
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(String value) {
			this.defaultValue = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(long value) {
			this.defaultValue = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(double value) {
			this.defaultValue = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code default_value}
		 */
		public final Builder defaultValue(boolean value) {
			this.defaultValue = FieldValue.of(value);
			return this;
		}

		/**
		 * Required - API name: {@code depends_on}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dependsOn</code>.
		 */
		public final Builder dependsOn(List<Dependency> list) {
			this.dependsOn = _listAddAll(this.dependsOn, list);
			return this;
		}

		/**
		 * Required - API name: {@code depends_on}
		 * <p>
		 * Adds one or more values to <code>dependsOn</code>.
		 */
		public final Builder dependsOn(Dependency value, Dependency... values) {
			this.dependsOn = _listAdd(this.dependsOn, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code depends_on}
		 * <p>
		 * Adds a value to <code>dependsOn</code> using a builder lambda.
		 */
		public final Builder dependsOn(Function<Dependency.Builder, ObjectBuilder<Dependency>> fn) {
			return dependsOn(fn.apply(new Dependency.Builder()).build());
		}

		/**
		 * Required - API name: {@code display}
		 */
		public final Builder display(DisplayType value) {
			this.display = value;
			return this;
		}

		/**
		 * Required - API name: {@code label}
		 */
		public final Builder label(String value) {
			this.label = value;
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>options</code>.
		 */
		public final Builder options(List<SelectOption> list) {
			this.options = _listAddAll(this.options, list);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds one or more values to <code>options</code>.
		 */
		public final Builder options(SelectOption value, SelectOption... values) {
			this.options = _listAdd(this.options, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code options}
		 * <p>
		 * Adds a value to <code>options</code> using a builder lambda.
		 */
		public final Builder options(Function<SelectOption.Builder, ObjectBuilder<SelectOption>> fn) {
			return options(fn.apply(new SelectOption.Builder()).build());
		}

		/**
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable Integer value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code placeholder}
		 */
		public final Builder placeholder(@Nullable String value) {
			this.placeholder = value;
			return this;
		}

		/**
		 * Required - API name: {@code required}
		 */
		public final Builder required(boolean value) {
			this.required = value;
			return this;
		}

		/**
		 * Required - API name: {@code sensitive}
		 */
		public final Builder sensitive(boolean value) {
			this.sensitive = value;
			return this;
		}

		/**
		 * API name: {@code tooltip}
		 */
		public final Builder tooltip(@Nullable String value) {
			this.tooltip = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable ConnectorFieldType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code ui_restrictions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>uiRestrictions</code>.
		 */
		public final Builder uiRestrictions(List<String> list) {
			this.uiRestrictions = _listAddAll(this.uiRestrictions, list);
			return this;
		}

		/**
		 * API name: {@code ui_restrictions}
		 * <p>
		 * Adds one or more values to <code>uiRestrictions</code>.
		 */
		public final Builder uiRestrictions(String value, String... values) {
			this.uiRestrictions = _listAdd(this.uiRestrictions, value, values);
			return this;
		}

		/**
		 * API name: {@code validations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>validations</code>.
		 */
		public final Builder validations(List<Validation> list) {
			this.validations = _listAddAll(this.validations, list);
			return this;
		}

		/**
		 * API name: {@code validations}
		 * <p>
		 * Adds one or more values to <code>validations</code>.
		 */
		public final Builder validations(Validation value, Validation... values) {
			this.validations = _listAdd(this.validations, value, values);
			return this;
		}

		/**
		 * API name: {@code validations}
		 * <p>
		 * Adds a value to <code>validations</code> using a builder lambda.
		 */
		public final Builder validations(Function<Validation.Builder, ObjectBuilder<Validation>> fn) {
			return validations(fn.apply(new Validation.Builder()).build());
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(JsonData value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConnectorConfigProperties}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConnectorConfigProperties build() {
			_checkSingleUse();

			return new ConnectorConfigProperties(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConnectorConfigProperties}
	 */
	public static final JsonpDeserializer<ConnectorConfigProperties> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConnectorConfigProperties::setupConnectorConfigPropertiesDeserializer);

	protected static void setupConnectorConfigPropertiesDeserializer(
			ObjectDeserializer<ConnectorConfigProperties.Builder> op) {

		op.add(Builder::category, JsonpDeserializer.stringDeserializer(), "category");
		op.add(Builder::defaultValue, FieldValue._DESERIALIZER, "default_value");
		op.add(Builder::dependsOn, JsonpDeserializer.arrayDeserializer(Dependency._DESERIALIZER), "depends_on");
		op.add(Builder::display, DisplayType._DESERIALIZER, "display");
		op.add(Builder::label, JsonpDeserializer.stringDeserializer(), "label");
		op.add(Builder::options, JsonpDeserializer.arrayDeserializer(SelectOption._DESERIALIZER), "options");
		op.add(Builder::order, JsonpDeserializer.integerDeserializer(), "order");
		op.add(Builder::placeholder, JsonpDeserializer.stringDeserializer(), "placeholder");
		op.add(Builder::required, JsonpDeserializer.booleanDeserializer(), "required");
		op.add(Builder::sensitive, JsonpDeserializer.booleanDeserializer(), "sensitive");
		op.add(Builder::tooltip, JsonpDeserializer.stringDeserializer(), "tooltip");
		op.add(Builder::type, ConnectorFieldType._DESERIALIZER, "type");
		op.add(Builder::uiRestrictions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"ui_restrictions");
		op.add(Builder::validations, JsonpDeserializer.arrayDeserializer(Validation._DESERIALIZER), "validations");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
