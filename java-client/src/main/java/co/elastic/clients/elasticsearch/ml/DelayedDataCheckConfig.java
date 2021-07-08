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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DelayedDataCheckConfig
public final class DelayedDataCheckConfig implements ToJsonp {
	@Nullable
	private final JsonValue checkWindow;

	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected DelayedDataCheckConfig(Builder builder) {

		this.checkWindow = builder.checkWindow;
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");

	}

	/**
	 * API name: {@code check_window}
	 */
	@Nullable
	public JsonValue checkWindow() {
		return this.checkWindow;
	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
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

		if (this.checkWindow != null) {

			generator.writeKey("check_window");
			generator.write(this.checkWindow);

		}

		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DelayedDataCheckConfig}.
	 */
	public static class Builder implements ObjectBuilder<DelayedDataCheckConfig> {
		@Nullable
		private JsonValue checkWindow;

		private Boolean enabled;

		/**
		 * API name: {@code check_window}
		 */
		public Builder checkWindow(@Nullable JsonValue value) {
			this.checkWindow = value;
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link DelayedDataCheckConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DelayedDataCheckConfig build() {

			return new DelayedDataCheckConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DelayedDataCheckConfig
	 */
	public static final JsonpDeserializer<DelayedDataCheckConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DelayedDataCheckConfig::setupDelayedDataCheckConfigDeserializer);

	protected static void setupDelayedDataCheckConfigDeserializer(
			DelegatingDeserializer<DelayedDataCheckConfig.Builder> op) {

		op.add(Builder::checkWindow, JsonpDeserializer.jsonValueDeserializer(), "check_window");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
