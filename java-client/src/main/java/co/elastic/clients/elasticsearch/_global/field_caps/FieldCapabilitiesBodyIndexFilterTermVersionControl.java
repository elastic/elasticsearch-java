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

package co.elastic.clients.elasticsearch._global.field_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.field_caps.FieldCapabilitiesBodyIndexFilterTermVersionControl
public final class FieldCapabilitiesBodyIndexFilterTermVersionControl implements ToJsonp {
	private final String value;

	// ---------------------------------------------------------------------------------------------

	protected FieldCapabilitiesBodyIndexFilterTermVersionControl(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code value}
	 */
	public String value() {
		return this.value;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapabilitiesBodyIndexFilterTermVersionControl}.
	 */
	public static class Builder implements ObjectBuilder<FieldCapabilitiesBodyIndexFilterTermVersionControl> {
		private String value;

		/**
		 * API name: {@code value}
		 */
		public Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link FieldCapabilitiesBodyIndexFilterTermVersionControl}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapabilitiesBodyIndexFilterTermVersionControl build() {

			return new FieldCapabilitiesBodyIndexFilterTermVersionControl(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FieldCapabilitiesBodyIndexFilterTermVersionControl
	 */
	public static final JsonpDeserializer<FieldCapabilitiesBodyIndexFilterTermVersionControl> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					FieldCapabilitiesBodyIndexFilterTermVersionControl::setupFieldCapabilitiesBodyIndexFilterTermVersionControlDeserializer);

	protected static void setupFieldCapabilitiesBodyIndexFilterTermVersionControlDeserializer(
			DelegatingDeserializer<FieldCapabilitiesBodyIndexFilterTermVersionControl.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");

	}

}
