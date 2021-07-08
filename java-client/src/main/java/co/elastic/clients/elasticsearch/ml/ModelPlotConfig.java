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
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.ModelPlotConfig
public final class ModelPlotConfig implements ToJsonp {
	@Nullable
	private final String terms;

	private final Boolean enabled;

	@Nullable
	private final Boolean annotationsEnabled;

	// ---------------------------------------------------------------------------------------------

	protected ModelPlotConfig(Builder builder) {

		this.terms = builder.terms;
		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.annotationsEnabled = builder.annotationsEnabled;

	}

	/**
	 * API name: {@code terms}
	 */
	@Nullable
	public String terms() {
		return this.terms;
	}

	/**
	 * API name: {@code enabled}
	 */
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code annotations_enabled}
	 */
	@Nullable
	public Boolean annotationsEnabled() {
		return this.annotationsEnabled;
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

		if (this.terms != null) {

			generator.writeKey("terms");
			generator.write(this.terms);

		}

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (this.annotationsEnabled != null) {

			generator.writeKey("annotations_enabled");
			generator.write(this.annotationsEnabled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelPlotConfig}.
	 */
	public static class Builder implements ObjectBuilder<ModelPlotConfig> {
		@Nullable
		private String terms;

		private Boolean enabled;

		@Nullable
		private Boolean annotationsEnabled;

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(@Nullable String value) {
			this.terms = value;
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
		 * API name: {@code annotations_enabled}
		 */
		public Builder annotationsEnabled(@Nullable Boolean value) {
			this.annotationsEnabled = value;
			return this;
		}

		/**
		 * Builds a {@link ModelPlotConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelPlotConfig build() {

			return new ModelPlotConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ModelPlotConfig
	 */
	public static final JsonpDeserializer<ModelPlotConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ModelPlotConfig::setupModelPlotConfigDeserializer);

	protected static void setupModelPlotConfigDeserializer(DelegatingDeserializer<ModelPlotConfig.Builder> op) {

		op.add(Builder::terms, JsonpDeserializer.stringDeserializer(), "terms");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::annotationsEnabled, JsonpDeserializer.booleanDeserializer(), "annotations_enabled");

	}

}
