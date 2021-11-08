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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.RuntimeField
@JsonpDeserializable
public class RuntimeField implements JsonpSerializable {
	@Nullable
	private final String format;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	private final RuntimeFieldType type;

	// ---------------------------------------------------------------------------------------------

	private RuntimeField(Builder builder) {

		this.format = builder.format;
		this.script = builder.script;
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static RuntimeField of(Function<Builder, ObjectBuilder<RuntimeField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * Required - API name: {@code type}
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

		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.script != null) {
			generator.writeKey("script");
			generator.write(this.script);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuntimeField}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RuntimeField> {
		@Nullable
		private String format;

		@Nullable
		private JsonValue /* _types.Script */ script;

		private RuntimeFieldType type;

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(RuntimeFieldType value) {
			this.type = value;
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
			RuntimeField::setupRuntimeFieldDeserializer, Builder::build);

	protected static void setupRuntimeFieldDeserializer(DelegatingDeserializer<RuntimeField.Builder> op) {

		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::type, RuntimeFieldType._DESERIALIZER, "type");

	}

}
