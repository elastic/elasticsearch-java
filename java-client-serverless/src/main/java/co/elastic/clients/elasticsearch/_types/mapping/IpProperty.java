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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.IpProperty

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.IpProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class IpProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean index;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final String nullValue;

	@Nullable
	private final OnScriptError onScriptError;

	@Nullable
	private final Script script;

	@Nullable
	private final Boolean timeSeriesDimension;

	// ---------------------------------------------------------------------------------------------

	private IpProperty(Builder builder) {
		super(builder);

		this.boost = builder.boost;
		this.index = builder.index;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.nullValue = builder.nullValue;
		this.onScriptError = builder.onScriptError;
		this.script = builder.script;
		this.timeSeriesDimension = builder.timeSeriesDimension;

	}

	public static IpProperty of(Function<Builder, ObjectBuilder<IpProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.Ip;
	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public final Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code null_value}
	 */
	@Nullable
	public final String nullValue() {
		return this.nullValue;
	}

	/**
	 * API name: {@code on_script_error}
	 */
	@Nullable
	public final OnScriptError onScriptError() {
		return this.onScriptError;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
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

		generator.write("type", "ip");
		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.ignoreMalformed != null) {
			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.nullValue != null) {
			generator.writeKey("null_value");
			generator.write(this.nullValue);

		}
		if (this.onScriptError != null) {
			generator.writeKey("on_script_error");
			this.onScriptError.serialize(generator, mapper);
		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.timeSeriesDimension != null) {
			generator.writeKey("time_series_dimension");
			generator.write(this.timeSeriesDimension);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IpProperty}.
	 */

	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IpProperty> {
		@Nullable
		private Double boost;

		@Nullable
		private Boolean index;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private String nullValue;

		@Nullable
		private OnScriptError onScriptError;

		@Nullable
		private Script script;

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
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable Boolean value) {
			this.index = value;
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
		 * API name: {@code null_value}
		 */
		public final Builder nullValue(@Nullable String value) {
			this.nullValue = value;
			return this;
		}

		/**
		 * API name: {@code on_script_error}
		 */
		public final Builder onScriptError(@Nullable OnScriptError value) {
			this.onScriptError = value;
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
		 * Builds a {@link IpProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IpProperty build() {
			_checkSingleUse();

			return new IpProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IpProperty}
	 */
	public static final JsonpDeserializer<IpProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IpProperty::setupIpPropertyDeserializer);

	protected static void setupIpPropertyDeserializer(ObjectDeserializer<IpProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(Builder::index, JsonpDeserializer.booleanDeserializer(), "index");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::nullValue, JsonpDeserializer.stringDeserializer(), "null_value");
		op.add(Builder::onScriptError, OnScriptError._DESERIALIZER, "on_script_error");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::timeSeriesDimension, JsonpDeserializer.booleanDeserializer(), "time_series_dimension");

		op.ignore("type");
	}

}
