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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ScriptField
@JsonpDeserializable
public class ScriptField implements JsonpSerializable {
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final Boolean ignoreFailure;

	// ---------------------------------------------------------------------------------------------

	private ScriptField(Builder builder) {

		this.script = ModelTypeHelper.requireNonNull(builder.script, this, "script");
		this.ignoreFailure = builder.ignoreFailure;

	}

	public static ScriptField of(Function<Builder, ObjectBuilder<ScriptField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * API name: {@code ignore_failure}
	 */
	@Nullable
	public final Boolean ignoreFailure() {
		return this.ignoreFailure;
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

		generator.writeKey("script");
		generator.write(this.script);

		if (this.ignoreFailure != null) {
			generator.writeKey("ignore_failure");
			generator.write(this.ignoreFailure);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptField}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScriptField> {
		private JsonValue /* _types.Script */ script;

		@Nullable
		private Boolean ignoreFailure;

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code ignore_failure}
		 */
		public final Builder ignoreFailure(@Nullable Boolean value) {
			this.ignoreFailure = value;
			return this;
		}

		/**
		 * Builds a {@link ScriptField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptField build() {
			_checkSingleUse();

			return new ScriptField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ScriptField}
	 */
	public static final JsonpDeserializer<ScriptField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ScriptField::setupScriptFieldDeserializer, Builder::build);

	protected static void setupScriptFieldDeserializer(DelegatingDeserializer<ScriptField.Builder> op) {

		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::ignoreFailure, JsonpDeserializer.booleanDeserializer(), "ignore_failure");

	}

}
