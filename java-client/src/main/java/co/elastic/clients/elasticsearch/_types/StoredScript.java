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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.StoredScript
public final class StoredScript implements JsonpSerializable {
	@Nullable
	private final JsonValue lang;

	private final String source;

	// ---------------------------------------------------------------------------------------------

	public StoredScript(Builder builder) {

		this.lang = builder.lang;
		this.source = Objects.requireNonNull(builder.source, "source");

	}

	/**
	 * API name: {@code lang}
	 */
	@Nullable
	public JsonValue lang() {
		return this.lang;
	}

	/**
	 * API name: {@code source}
	 */
	public String source() {
		return this.source;
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

		if (this.lang != null) {

			generator.writeKey("lang");
			generator.write(this.lang);

		}

		generator.writeKey("source");
		generator.write(this.source);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoredScript}.
	 */
	public static class Builder implements ObjectBuilder<StoredScript> {
		@Nullable
		private JsonValue lang;

		private String source;

		/**
		 * API name: {@code lang}
		 */
		public Builder lang(@Nullable JsonValue value) {
			this.lang = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link StoredScript}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoredScript build() {

			return new StoredScript(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StoredScript}
	 */
	public static final JsonpDeserializer<StoredScript> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, StoredScript::setupStoredScriptDeserializer);

	protected static void setupStoredScriptDeserializer(DelegatingDeserializer<StoredScript.Builder> op) {

		op.add(Builder::lang, JsonpDeserializer.jsonValueDeserializer(), "lang");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
