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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.CustomSettings
@JsonpDeserializable
public class CustomSettings implements JsonpSerializable {
	private final List<JsonValue /* xpack.usage.UrlConfig */> customUrls;

	@Nullable
	private final String createdBy;

	private final Map<String, String> jobTags;

	// ---------------------------------------------------------------------------------------------

	private CustomSettings(Builder builder) {

		this.customUrls = ModelTypeHelper.unmodifiable(builder.customUrls);
		this.createdBy = builder.createdBy;
		this.jobTags = ModelTypeHelper.unmodifiable(builder.jobTags);

	}

	public static CustomSettings of(Function<Builder, ObjectBuilder<CustomSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code custom_urls}
	 */
	public final List<JsonValue /* xpack.usage.UrlConfig */> customUrls() {
		return this.customUrls;
	}

	/**
	 * API name: {@code created_by}
	 */
	@Nullable
	public final String createdBy() {
		return this.createdBy;
	}

	/**
	 * API name: {@code job_tags}
	 */
	public final Map<String, String> jobTags() {
		return this.jobTags;
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

		if (ModelTypeHelper.isDefined(this.customUrls)) {
			generator.writeKey("custom_urls");
			generator.writeStartArray();
			for (JsonValue /* xpack.usage.UrlConfig */ item0 : this.customUrls) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.createdBy != null) {
			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (ModelTypeHelper.isDefined(this.jobTags)) {
			generator.writeKey("job_tags");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.jobTags.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CustomSettings}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CustomSettings> {
		@Nullable
		private List<JsonValue /* xpack.usage.UrlConfig */> customUrls;

		@Nullable
		private String createdBy;

		@Nullable
		private Map<String, String> jobTags;

		/**
		 * API name: {@code custom_urls}
		 */
		public final Builder customUrls(@Nullable List<JsonValue /* xpack.usage.UrlConfig */> value) {
			this.customUrls = value;
			return this;
		}

		/**
		 * API name: {@code custom_urls}
		 */
		public final Builder customUrls(JsonValue /* xpack.usage.UrlConfig */... value) {
			this.customUrls = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code created_by}
		 */
		public final Builder createdBy(@Nullable String value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * API name: {@code job_tags}
		 */
		public final Builder jobTags(@Nullable Map<String, String> value) {
			this.jobTags = value;
			return this;
		}

		/**
		 * Builds a {@link CustomSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CustomSettings build() {
			_checkSingleUse();

			return new CustomSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CustomSettings}
	 */
	public static final JsonpDeserializer<CustomSettings> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CustomSettings::setupCustomSettingsDeserializer, Builder::build);

	protected static void setupCustomSettingsDeserializer(DelegatingDeserializer<CustomSettings.Builder> op) {

		op.add(Builder::customUrls, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"custom_urls");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(Builder::jobTags, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"job_tags");

	}

}
