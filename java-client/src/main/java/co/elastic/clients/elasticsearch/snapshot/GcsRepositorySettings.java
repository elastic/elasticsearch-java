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
import co.elastic.clients.util.ApiTypeHelper;
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

// typedef: snapshot._types.GcsRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.GcsRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class GcsRepositorySettings extends RepositorySettingsBase {
	private final String bucket;

	@Nullable
	private final String client;

	@Nullable
	private final String basePath;

	@Nullable
	private final Boolean readonly;

	@Nullable
	private final String applicationName;

	// ---------------------------------------------------------------------------------------------

	private GcsRepositorySettings(Builder builder) {
		super(builder);

		this.bucket = ApiTypeHelper.requireNonNull(builder.bucket, this, "bucket");
		this.client = builder.client;
		this.basePath = builder.basePath;
		this.readonly = builder.readonly;
		this.applicationName = builder.applicationName;

	}

	public static GcsRepositorySettings of(Function<Builder, ObjectBuilder<GcsRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code bucket}
	 */
	public final String bucket() {
		return this.bucket;
	}

	/**
	 * API name: {@code client}
	 */
	@Nullable
	public final String client() {
		return this.client;
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
	 * API name: {@code application_name}
	 */
	@Nullable
	public final String applicationName() {
		return this.applicationName;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("bucket");
		generator.write(this.bucket);

		if (this.client != null) {
			generator.writeKey("client");
			generator.write(this.client);

		}
		if (this.basePath != null) {
			generator.writeKey("base_path");
			generator.write(this.basePath);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			generator.write(this.readonly);

		}
		if (this.applicationName != null) {
			generator.writeKey("application_name");
			generator.write(this.applicationName);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GcsRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GcsRepositorySettings> {
		private String bucket;

		@Nullable
		private String client;

		@Nullable
		private String basePath;

		@Nullable
		private Boolean readonly;

		@Nullable
		private String applicationName;

		/**
		 * Required - API name: {@code bucket}
		 */
		public final Builder bucket(String value) {
			this.bucket = value;
			return this;
		}

		/**
		 * API name: {@code client}
		 */
		public final Builder client(@Nullable String value) {
			this.client = value;
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
		 * API name: {@code application_name}
		 */
		public final Builder applicationName(@Nullable String value) {
			this.applicationName = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GcsRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GcsRepositorySettings build() {
			_checkSingleUse();

			return new GcsRepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GcsRepositorySettings}
	 */
	public static final JsonpDeserializer<GcsRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GcsRepositorySettings::setupGcsRepositorySettingsDeserializer);

	protected static void setupGcsRepositorySettingsDeserializer(ObjectDeserializer<GcsRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::bucket, JsonpDeserializer.stringDeserializer(), "bucket");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::basePath, JsonpDeserializer.stringDeserializer(), "base_path");
		op.add(Builder::readonly, JsonpDeserializer.booleanDeserializer(), "readonly");
		op.add(Builder::applicationName, JsonpDeserializer.stringDeserializer(), "application_name");

	}

}
