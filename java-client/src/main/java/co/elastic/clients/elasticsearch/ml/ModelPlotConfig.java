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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ModelPlotConfig

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.ModelPlotConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class ModelPlotConfig implements JsonpSerializable {
	@Nullable
	private final Boolean annotationsEnabled;

	@Nullable
	private final Boolean enabled;

	@Nullable
	private final String terms;

	// ---------------------------------------------------------------------------------------------

	private ModelPlotConfig(Builder builder) {

		this.annotationsEnabled = builder.annotationsEnabled;
		this.enabled = builder.enabled;
		this.terms = builder.terms;

	}

	public static ModelPlotConfig of(Function<Builder, ObjectBuilder<ModelPlotConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, enables calculation and storage of the model change annotations for
	 * each entity that is being analyzed.
	 * <p>
	 * API name: {@code annotations_enabled}
	 */
	@Nullable
	public final Boolean annotationsEnabled() {
		return this.annotationsEnabled;
	}

	/**
	 * If true, enables calculation and storage of the model bounds for each entity
	 * that is being analyzed.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Limits data collection to this comma separated list of partition or by field
	 * values. If terms are not specified or it is an empty string, no filtering is
	 * applied. Wildcards are not supported. Only the specified terms can be viewed
	 * when using the Single Metric Viewer.
	 * <p>
	 * API name: {@code terms}
	 */
	@Nullable
	public final String terms() {
		return this.terms;
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

		if (this.annotationsEnabled != null) {
			generator.writeKey("annotations_enabled");
			generator.write(this.annotationsEnabled);

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.terms != null) {
			generator.writeKey("terms");
			generator.write(this.terms);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ModelPlotConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ModelPlotConfig> {
		@Nullable
		private Boolean annotationsEnabled;

		@Nullable
		private Boolean enabled;

		@Nullable
		private String terms;

		/**
		 * If true, enables calculation and storage of the model change annotations for
		 * each entity that is being analyzed.
		 * <p>
		 * API name: {@code annotations_enabled}
		 */
		public final Builder annotationsEnabled(@Nullable Boolean value) {
			this.annotationsEnabled = value;
			return this;
		}

		/**
		 * If true, enables calculation and storage of the model bounds for each entity
		 * that is being analyzed.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Limits data collection to this comma separated list of partition or by field
		 * values. If terms are not specified or it is an empty string, no filtering is
		 * applied. Wildcards are not supported. Only the specified terms can be viewed
		 * when using the Single Metric Viewer.
		 * <p>
		 * API name: {@code terms}
		 */
		public final Builder terms(@Nullable String value) {
			this.terms = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ModelPlotConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ModelPlotConfig build() {
			_checkSingleUse();

			return new ModelPlotConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ModelPlotConfig}
	 */
	public static final JsonpDeserializer<ModelPlotConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ModelPlotConfig::setupModelPlotConfigDeserializer);

	protected static void setupModelPlotConfigDeserializer(ObjectDeserializer<ModelPlotConfig.Builder> op) {

		op.add(Builder::annotationsEnabled, JsonpDeserializer.booleanDeserializer(), "annotations_enabled");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::terms, JsonpDeserializer.stringDeserializer(), "terms");

	}

}
