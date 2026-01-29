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

package co.elastic.clients.elasticsearch.indices.put_data_stream_settings;

import co.elastic.clients.elasticsearch.indices.IndexSettings;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: indices.put_data_stream_settings.UpdatedDataStreamSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.put_data_stream_settings.UpdatedDataStreamSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdatedDataStreamSettings implements JsonpSerializable {
	private final String name;

	private final boolean appliedToDataStream;

	@Nullable
	private final String error;

	private final IndexSettings settings;

	private final IndexSettings effectiveSettings;

	private final IndexSettingResults indexSettingsResults;

	// ---------------------------------------------------------------------------------------------

	private UpdatedDataStreamSettings(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.appliedToDataStream = ApiTypeHelper.requireNonNull(builder.appliedToDataStream, this,
				"appliedToDataStream", false);
		this.error = builder.error;
		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.effectiveSettings = ApiTypeHelper.requireNonNull(builder.effectiveSettings, this, "effectiveSettings");
		this.indexSettingsResults = ApiTypeHelper.requireNonNull(builder.indexSettingsResults, this,
				"indexSettingsResults");

	}

	public static UpdatedDataStreamSettings of(Function<Builder, ObjectBuilder<UpdatedDataStreamSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The data stream name.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - If the settings were successfully applied to the data stream (or
	 * would have been, if running in <code>dry_run</code> mode), it is
	 * <code>true</code>. If an error occurred, it is <code>false</code>.
	 * <p>
	 * API name: {@code applied_to_data_stream}
	 */
	public final boolean appliedToDataStream() {
		return this.appliedToDataStream;
	}

	/**
	 * A message explaining why the settings could not be applied to the data
	 * stream.
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * Required - The settings that are specfic to this data stream that will
	 * override any settings from the matching index template.
	 * <p>
	 * API name: {@code settings}
	 */
	public final IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Required - The settings that are effective on this data stream, taking into
	 * account the settings from the matching index template and the settings
	 * specific to this data stream.
	 * <p>
	 * API name: {@code effective_settings}
	 */
	public final IndexSettings effectiveSettings() {
		return this.effectiveSettings;
	}

	/**
	 * Required - Information about whether and where each setting was applied.
	 * <p>
	 * API name: {@code index_settings_results}
	 */
	public final IndexSettingResults indexSettingsResults() {
		return this.indexSettingsResults;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("applied_to_data_stream");
		generator.write(this.appliedToDataStream);

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

		generator.writeKey("effective_settings");
		this.effectiveSettings.serialize(generator, mapper);

		generator.writeKey("index_settings_results");
		this.indexSettingsResults.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdatedDataStreamSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdatedDataStreamSettings> {
		private String name;

		private Boolean appliedToDataStream;

		@Nullable
		private String error;

		private IndexSettings settings;

		private IndexSettings effectiveSettings;

		private IndexSettingResults indexSettingsResults;

		public Builder() {
		}
		private Builder(UpdatedDataStreamSettings instance) {
			this.name = instance.name;
			this.appliedToDataStream = instance.appliedToDataStream;
			this.error = instance.error;
			this.settings = instance.settings;
			this.effectiveSettings = instance.effectiveSettings;
			this.indexSettingsResults = instance.indexSettingsResults;

		}
		/**
		 * Required - The data stream name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - If the settings were successfully applied to the data stream (or
		 * would have been, if running in <code>dry_run</code> mode), it is
		 * <code>true</code>. If an error occurred, it is <code>false</code>.
		 * <p>
		 * API name: {@code applied_to_data_stream}
		 */
		public final Builder appliedToDataStream(boolean value) {
			this.appliedToDataStream = value;
			return this;
		}

		/**
		 * A message explaining why the settings could not be applied to the data
		 * stream.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * Required - The settings that are specfic to this data stream that will
		 * override any settings from the matching index template.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - The settings that are specfic to this data stream that will
		 * override any settings from the matching index template.
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Required - The settings that are effective on this data stream, taking into
		 * account the settings from the matching index template and the settings
		 * specific to this data stream.
		 * <p>
		 * API name: {@code effective_settings}
		 */
		public final Builder effectiveSettings(IndexSettings value) {
			this.effectiveSettings = value;
			return this;
		}

		/**
		 * Required - The settings that are effective on this data stream, taking into
		 * account the settings from the matching index template and the settings
		 * specific to this data stream.
		 * <p>
		 * API name: {@code effective_settings}
		 */
		public final Builder effectiveSettings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.effectiveSettings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Required - Information about whether and where each setting was applied.
		 * <p>
		 * API name: {@code index_settings_results}
		 */
		public final Builder indexSettingsResults(IndexSettingResults value) {
			this.indexSettingsResults = value;
			return this;
		}

		/**
		 * Required - Information about whether and where each setting was applied.
		 * <p>
		 * API name: {@code index_settings_results}
		 */
		public final Builder indexSettingsResults(
				Function<IndexSettingResults.Builder, ObjectBuilder<IndexSettingResults>> fn) {
			return this.indexSettingsResults(fn.apply(new IndexSettingResults.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdatedDataStreamSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdatedDataStreamSettings build() {
			_checkSingleUse();

			return new UpdatedDataStreamSettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdatedDataStreamSettings}
	 */
	public static final JsonpDeserializer<UpdatedDataStreamSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdatedDataStreamSettings::setupUpdatedDataStreamSettingsDeserializer);

	protected static void setupUpdatedDataStreamSettingsDeserializer(
			ObjectDeserializer<UpdatedDataStreamSettings.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::appliedToDataStream, JsonpDeserializer.booleanDeserializer(), "applied_to_data_stream");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");
		op.add(Builder::effectiveSettings, IndexSettings._DESERIALIZER, "effective_settings");
		op.add(Builder::indexSettingsResults, IndexSettingResults._DESERIALIZER, "index_settings_results");

	}

}
