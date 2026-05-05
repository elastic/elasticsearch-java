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

package co.elastic.clients.elasticsearch.indices.get_data_stream_settings;

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

// typedef: indices.get_data_stream_settings.DataStreamSettings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_stream_settings.DataStreamSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamSettings implements JsonpSerializable {
	private final String name;

	private final IndexSettings settings;

	private final IndexSettings effectiveSettings;

	// ---------------------------------------------------------------------------------------------

	private DataStreamSettings(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");
		this.effectiveSettings = ApiTypeHelper.requireNonNull(builder.effectiveSettings, this, "effectiveSettings");

	}

	public static DataStreamSettings of(Function<Builder, ObjectBuilder<DataStreamSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The settings specific to this data stream
	 * <p>
	 * API name: {@code settings}
	 */
	public final IndexSettings settings() {
		return this.settings;
	}

	/**
	 * Required - The settings specific to this data stream merged with the settings
	 * from its template. These <code>effective_settings</code> are the settings
	 * that will be used when a new index is created for this data stream.
	 * <p>
	 * API name: {@code effective_settings}
	 */
	public final IndexSettings effectiveSettings() {
		return this.effectiveSettings;
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

		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

		generator.writeKey("effective_settings");
		this.effectiveSettings.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamSettings> {
		private String name;

		private IndexSettings settings;

		private IndexSettings effectiveSettings;

		public Builder() {
		}
		private Builder(DataStreamSettings instance) {
			this.name = instance.name;
			this.settings = instance.settings;
			this.effectiveSettings = instance.effectiveSettings;

		}
		/**
		 * Required - The name of the data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream
		 * <p>
		 * API name: {@code settings}
		 */
		public final Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * Required - The settings specific to this data stream merged with the settings
		 * from its template. These <code>effective_settings</code> are the settings
		 * that will be used when a new index is created for this data stream.
		 * <p>
		 * API name: {@code effective_settings}
		 */
		public final Builder effectiveSettings(IndexSettings value) {
			this.effectiveSettings = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream merged with the settings
		 * from its template. These <code>effective_settings</code> are the settings
		 * that will be used when a new index is created for this data stream.
		 * <p>
		 * API name: {@code effective_settings}
		 */
		public final Builder effectiveSettings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.effectiveSettings(fn.apply(new IndexSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamSettings build() {
			_checkSingleUse();

			return new DataStreamSettings(this);
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
	 * Json deserializer for {@link DataStreamSettings}
	 */
	public static final JsonpDeserializer<DataStreamSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamSettings::setupDataStreamSettingsDeserializer);

	protected static void setupDataStreamSettingsDeserializer(ObjectDeserializer<DataStreamSettings.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");
		op.add(Builder::effectiveSettings, IndexSettings._DESERIALIZER, "effective_settings");

	}

}
