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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.elasticsearch.indices.NumericFielddata;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
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

// typedef: _types.mapping.BooleanProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.BooleanProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class BooleanProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final NumericFielddata fielddata;

	@Nullable
	private final Boolean index;

	@Nullable
	private final Boolean nullValue;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Script script;

	@Nullable
	private final OnScriptError onScriptError;

	@Nullable
	private final Boolean timeSeriesDimension;

	// ---------------------------------------------------------------------------------------------

	private BooleanProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.fielddata = builder.fielddata;
		this.index = builder.index;
		this.nullValue = builder.nullValue;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.script = builder.script;
		this.onScriptError = builder.onScriptError;
		this.timeSeriesDimension = builder.timeSeriesDimension;

	}

	public static BooleanProperty of(Function<Builder, ObjectBuilder<BooleanProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Boolean;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code fielddata}
	 */
	@Nullable
	public final NumericFielddata fielddata() {
		return this.fielddata;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final Boolean nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	/**
	 * For internal use by Elastic only. Marks the field as a time series dimension.
	 * Defaults to false.
	 * <p>
	 * API name: {@code time_series_dimension}
	 */
	@Nullable
	public final Boolean timeSeriesDimension() {
		return this.timeSeriesDimension;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "boolean");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.fielddata != null) {
			generator.writeKey("fielddata");
			this.fielddata.serialize(generator, mapper);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BooleanProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BooleanProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private NumericFielddata fielddata;

		@Nullable
		private Boolean index;

		@Nullable
		private Boolean nullValue;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Script script;

		@Nullable
		private OnScriptError onScriptError;

		@Nullable
		private Boolean timeSeriesDimension;

		/**
		 * API name: {@code boost}
		 */
		public final Builder boost(@Nullable Double value) {
			this.boost = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(@Nullable NumericFielddata value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(Function<NumericFielddata.Builder, ObjectBuilder<NumericFielddata>> fn) {
			return this.fielddata(fn.apply(new NumericFielddata.Builder()).build());
		}

		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable Boolean value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public final Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final Builder onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
			return this;
		}

		/**
		 * For internal use by Elastic only. Marks the field as a time series dimension.
		 * Defaults to false.
		 * <p>
		 * API name: {@code time_series_dimension}
		 */
		public final Builder timeSeriesDimension(@Nullable Boolean value) {
			this.timeSeriesDimension = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BooleanProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BooleanProperty build() {
			_checkSingleUse();

			return new BooleanProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BooleanProperty}
	 */
	public static final JsonpDeserializer<BooleanProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BooleanProperty::setupBooleanPropertyDeserializer);

	protected static void setupBooleanPropertyDeserializer(ObjectDeserializer<BooleanProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::fielddata, NumericFielddata._DESERIALIZER, "fielddata");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::nullValue, JsonpDeserializer.booleanDeserializer(), "null_value");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");
		op.add(Builder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");

		op.ignore("type");
	}

}
