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

package co.elastic.clients.elasticsearch.core.msearch_template;

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.msearch_template.TemplateConfig

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.msearch_template.TemplateConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class TemplateConfig implements JsonpSerializable {
	@Nullable
	private final Boolean explain;

	@Nullable
	private final String id;

	private final Map<String, JsonData> params;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	private TemplateConfig(Builder builder) {

		this.explain = builder.explain;
		this.id = builder.id;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.profile = builder.profile;
		this.source = builder.source;

	}

	public static TemplateConfig of(Function<Builder, ObjectBuilder<TemplateConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
	}

	/**
	 * ID of the search template to use. If no source is specified, this parameter
	 * is required.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public final Boolean profile() {
		return this.profile;
	}

	/**
	 * An inline search template. Supports the same parameters as the search API's
	 * request body. Also supports Mustache variables. If no id is specified, this
	 * parameter is required.
	 * <p>
	 * API name: {@code source}
	 */
	@Nullable
	public final String source() {
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

		if (this.explain != null) {
			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.profile != null) {
			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (this.source != null) {
			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TemplateConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TemplateConfig> {
		@Nullable
		private Boolean explain;

		@Nullable
		private String id;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Boolean profile;

		@Nullable
		private String source;

		/**
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * ID of the search template to use. If no source is specified, this parameter
		 * is required.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * API name: {@code profile}
		 */
		public final Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * An inline search template. Supports the same parameters as the search API's
		 * request body. Also supports Mustache variables. If no id is specified, this
		 * parameter is required.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TemplateConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TemplateConfig build() {
			_checkSingleUse();

			return new TemplateConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TemplateConfig}
	 */
	public static final JsonpDeserializer<TemplateConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TemplateConfig::setupTemplateConfigDeserializer);

	protected static void setupTemplateConfigDeserializer(ObjectDeserializer<TemplateConfig.Builder> op) {

		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
