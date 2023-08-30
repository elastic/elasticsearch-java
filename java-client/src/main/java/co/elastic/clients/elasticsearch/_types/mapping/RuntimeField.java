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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.RuntimeField

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.mapping.RuntimeField">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuntimeField implements JsonpSerializable {
	private final List<RuntimeFieldFetchFields> fetchFields;

	@Nullable
	private final String format;

	@Nullable
	private final String inputField;

	@Nullable
	private final String targetField;

	@Nullable
	private final String targetIndex;

	@Nullable
	private final Script script;

	private final RuntimeFieldType type;

	// ---------------------------------------------------------------------------------------------

	private RuntimeField(Builder builder) {

		this.fetchFields = ApiTypeHelper.unmodifiable(builder.fetchFields);
		this.format = builder.format;
		this.inputField = builder.inputField;
		this.targetField = builder.targetField;
		this.targetIndex = builder.targetIndex;
		this.script = builder.script;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static RuntimeField of(Function<Builder, ObjectBuilder<RuntimeField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * For type <code>lookup</code>
	 * <p>
	 * API name: {@code fetch_fields}
	 */
	public final List<RuntimeFieldFetchFields> fetchFields() {
		return this.fetchFields;
	}

	/**
	 * A custom format for <code>date</code> type runtime fields.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * For type <code>lookup</code>
	 * <p>
	 * API name: {@code input_field}
	 */
	@Nullable
	public final String inputField() {
		return this.inputField;
	}

	/**
	 * For type <code>lookup</code>
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * For type <code>lookup</code>
	 * <p>
	 * API name: {@code target_index}
	 */
	@Nullable
	public final String targetIndex() {
		return this.targetIndex;
	}

	/**
	 * Painless script executed at query time.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * Required - Field type, which can be: <code>boolean</code>,
	 * <code>composite</code>, <code>date</code>, <code>double</code>,
	 * <code>geo_point</code>, <code>ip</code>,<code>keyword</code>,
	 * <code>long</code>, or <code>lookup</code>.
	 * <p>
	 * API name: {@code type}
	 */
	public final RuntimeFieldType type() {
		return this.type;
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

		if (ApiTypeHelper.isDefined(this.fetchFields)) {
			generator.writeKey("fetch_fields");
			generator.writeStartArray();
			for (RuntimeFieldFetchFields item0 : this.fetchFields) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.inputField != null) {
			generator.writeKey("input_field");
			generator.write(this.inputField);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (this.targetIndex != null) {
			generator.writeKey("target_index");
			generator.write(this.targetIndex);

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RuntimeField> {
		@Nullable
		private List<RuntimeFieldFetchFields> fetchFields;

		@Nullable
		private String format;

		@Nullable
		private String inputField;

		@Nullable
		private String targetField;

		@Nullable
		private String targetIndex;

		@Nullable
		private Script script;

		private RuntimeFieldType type;

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code fetch_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fetchFields</code>.
		 */
		public final Builder fetchFields(List<RuntimeFieldFetchFields> list) {
			this.fetchFields = _listAddAll(this.fetchFields, list);
			return this;
		}

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code fetch_fields}
		 * <p>
		 * Adds one or more values to <code>fetchFields</code>.
		 */
		public final Builder fetchFields(RuntimeFieldFetchFields value, RuntimeFieldFetchFields... values) {
			this.fetchFields = _listAdd(this.fetchFields, value, values);
			return this;
		}

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code fetch_fields}
		 * <p>
		 * Adds a value to <code>fetchFields</code> using a builder lambda.
		 */
		public final Builder fetchFields(
				Function<RuntimeFieldFetchFields.Builder, ObjectBuilder<RuntimeFieldFetchFields>> fn) {
			return fetchFields(fn.apply(new RuntimeFieldFetchFields.Builder()).build());
		}

		/**
		 * A custom format for <code>date</code> type runtime fields.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code input_field}
		 */
		public final Builder inputField(@Nullable String value) {
			this.inputField = value;
			return this;
		}

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * For type <code>lookup</code>
		 * <p>
		 * API name: {@code target_index}
		 */
		public final Builder targetIndex(@Nullable String value) {
			this.targetIndex = value;
			return this;
		}

		/**
		 * Painless script executed at query time.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Painless script executed at query time.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * Required - Field type, which can be: <code>boolean</code>,
		 * <code>composite</code>, <code>date</code>, <code>double</code>,
		 * <code>geo_point</code>, <code>ip</code>,<code>keyword</code>,
		 * <code>long</code>, or <code>lookup</code>.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(RuntimeFieldType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuntimeField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuntimeField build() {
			_checkSingleUse();

			return new RuntimeField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuntimeField}
	 */
	public static final JsonpDeserializer<RuntimeField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RuntimeField::setupRuntimeFieldDeserializer);

	protected static void setupRuntimeFieldDeserializer(ObjectDeserializer<RuntimeField.Builder> op) {

		op.add(Builder::fetchFields, JsonpDeserializer.arrayDeserializer(RuntimeFieldFetchFields._DESERIALIZER),
				"fetch_fields");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::inputField, JsonpDeserializer.stringDeserializer(), "input_field");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::targetIndex, JsonpDeserializer.stringDeserializer(), "target_index");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::type, RuntimeFieldType._DESERIALIZER, "type");

	}

}
