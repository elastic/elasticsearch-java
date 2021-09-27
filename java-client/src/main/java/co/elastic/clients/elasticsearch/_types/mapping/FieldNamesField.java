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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;

// typedef: _types.mapping.FieldNamesField
@JsonpDeserializable
public final class FieldNamesField implements JsonpSerializable {
	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	public FieldNamesField(Builder builder) {

		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");

	}

	/**
	 * API name: {@code enabled}
	 */
	public boolean enabled() {
		return this.enabled;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldNamesField}.
	 */
	public static class Builder implements ObjectBuilder<FieldNamesField> {
		private Boolean enabled;

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link FieldNamesField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldNamesField build() {

			return new FieldNamesField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldNamesField}
	 */
	public static final JsonpDeserializer<FieldNamesField> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldNamesField::setupFieldNamesFieldDeserializer, Builder::build);

	protected static void setupFieldNamesFieldDeserializer(DelegatingDeserializer<FieldNamesField.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
