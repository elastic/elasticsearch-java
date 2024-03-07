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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: snapshot._types.AzureRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.AzureRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AzureRepositorySettings extends RepositorySettingsBase {
	@Nullable
	private final String client;

	@Nullable
	private final String container;

	@Nullable
	private final String basePath;

	@Nullable
	private final Boolean readonly;

	@Nullable
	private final String locationMode;

	// ---------------------------------------------------------------------------------------------

	private AzureRepositorySettings(Builder builder) {
		super(builder);

		this.client = builder.client;
		this.container = builder.container;
		this.basePath = builder.basePath;
		this.readonly = builder.readonly;
		this.locationMode = builder.locationMode;

	}

	public static AzureRepositorySettings of(Function<Builder, ObjectBuilder<AzureRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code client}
	 */
	@Nullable
	public final String client() {
		return this.client;
	}

	/**
	 * API name: {@code container}
	 */
	@Nullable
	public final String container() {
		return this.container;
	}

	/**
	 * API name: {@code base_path}
	 */
	@Nullable
	public final String basePath() {
		return this.basePath;
	}

	/**
	 * API name: {@code readonly}
	 */
	@Nullable
	public final Boolean readonly() {
		return this.readonly;
	}

	/**
	 * API name: {@code location_mode}
	 */
	@Nullable
	public final String locationMode() {
		return this.locationMode;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.client != null) {
			generator.writeKey("client");
			generator.write(this.client);

		}
		if (this.container != null) {
			generator.writeKey("container");
			generator.write(this.container);

		}
		if (this.basePath != null) {
			generator.writeKey("base_path");
			generator.write(this.basePath);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			generator.write(this.readonly);

		}
		if (this.locationMode != null) {
			generator.writeKey("location_mode");
			generator.write(this.locationMode);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AzureRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AzureRepositorySettings> {
		@Nullable
		private String client;

		@Nullable
		private String container;

		@Nullable
		private String basePath;

		@Nullable
		private Boolean readonly;

		@Nullable
		private String locationMode;

		/**
		 * API name: {@code client}
		 */
		public final Builder client(@Nullable String value) {
			this.client = value;
			return this;
		}

		/**
		 * API name: {@code container}
		 */
		public final Builder container(@Nullable String value) {
			this.container = value;
			return this;
		}

		/**
		 * API name: {@code base_path}
		 */
		public final Builder basePath(@Nullable String value) {
			this.basePath = value;
			return this;
		}

		/**
		 * API name: {@code readonly}
		 */
		public final Builder readonly(@Nullable Boolean value) {
			this.readonly = value;
			return this;
		}

		/**
		 * API name: {@code location_mode}
		 */
		public final Builder locationMode(@Nullable String value) {
			this.locationMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AzureRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AzureRepositorySettings build() {
			_checkSingleUse();

			return new AzureRepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AzureRepositorySettings}
	 */
	public static final JsonpDeserializer<AzureRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AzureRepositorySettings::setupAzureRepositorySettingsDeserializer);

	protected static void setupAzureRepositorySettingsDeserializer(
			ObjectDeserializer<AzureRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::container, JsonpDeserializer.stringDeserializer(), "container");
		op.add(Builder::basePath, JsonpDeserializer.stringDeserializer(), "base_path");
		op.add(Builder::readonly, JsonpDeserializer.booleanDeserializer(), "readonly");
		op.add(Builder::locationMode, JsonpDeserializer.stringDeserializer(), "location_mode");

	}

}
