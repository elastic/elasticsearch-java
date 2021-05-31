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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.ModelPlotConfigEnabled
public final class ModelPlotConfigEnabled implements ToJsonp {
	private final Boolean enabled;

	@Nullable
	private final Boolean annotationsEnabled;

	@Nullable
	private final String terms;

	// ---------------------------------------------------------------------------------------------

	protected ModelPlotConfigEnabled(Builder builder) {

		this.enabled = Objects.requireNonNull(builder.enabled, "enabled");
		this.annotationsEnabled = builder.annotationsEnabled;
		this.terms = builder.terms;

	}

	/**
	 * If true, enables calculation and storage of the model bounds for each entity
	 * that is being analyzed.
	 *
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
	 * stability: experimental
	 *
	 * API name: {@code terms}
	 */
	@Nullable
	public String terms() {
		return this.terms;
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

		generator.writeKey("enabled");
		generator.write(this.enabled);

		if (this.annotationsEnabled != null) {

			generator.writeKey("annotations_enabled");
			generator.write(this.annotationsEnabled);

		}
		if (this.terms != null) {

			generator.writeKey("terms");
			generator.write(this.terms);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelPlotConfigEnabled}.
	 */
	public static class Builder implements ObjectBuilder<ModelPlotConfigEnabled> {
		private Boolean enabled;

		@Nullable
		private Boolean annotationsEnabled;

		@Nullable
		private String terms;

		/**
		 * If true, enables calculation and storage of the model bounds for each entity
		 * that is being analyzed.
		 *
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
		 * stability: experimental
		 *
		 * API name: {@code terms}
		 */
		public Builder terms(@Nullable String value) {
			this.terms = value;
			return this;
		}

		/**
		 * Builds a {@link ModelPlotConfigEnabled}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelPlotConfigEnabled build() {

			return new ModelPlotConfigEnabled(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ModelPlotConfigEnabled
	 */
	public static final JsonpValueParser<ModelPlotConfigEnabled> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ModelPlotConfigEnabled::setupModelPlotConfigEnabledParser);

	protected static void setupModelPlotConfigEnabledParser(
			DelegatingJsonpValueParser<ModelPlotConfigEnabled.Builder> op) {

		op.add(Builder::enabled, JsonpValueParser.booleanParser(), "enabled");
		op.add(Builder::annotationsEnabled, JsonpValueParser.booleanParser(), "annotations_enabled");
		op.add(Builder::terms, JsonpValueParser.stringParser(), "terms");

	}

}
