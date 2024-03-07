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
import java.lang.Integer;
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

// typedef: snapshot._types.SharedFileSystemRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SharedFileSystemRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class SharedFileSystemRepositorySettings extends RepositorySettingsBase {
	private final String location;

	@Nullable
	private final Integer maxNumberOfSnapshots;

	@Nullable
	private final Boolean readonly;

	// ---------------------------------------------------------------------------------------------

	private SharedFileSystemRepositorySettings(Builder builder) {
		super(builder);

		this.location = ApiTypeHelper.requireNonNull(builder.location, this, "location");
		this.maxNumberOfSnapshots = builder.maxNumberOfSnapshots;
		this.readonly = builder.readonly;

	}

	public static SharedFileSystemRepositorySettings of(
			Function<Builder, ObjectBuilder<SharedFileSystemRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code location}
	 */
	public final String location() {
		return this.location;
	}

	/**
	 * API name: {@code max_number_of_snapshots}
	 */
	@Nullable
	public final Integer maxNumberOfSnapshots() {
		return this.maxNumberOfSnapshots;
	}

	/**
	 * API name: {@code readonly}
	 */
	@Nullable
	public final Boolean readonly() {
		return this.readonly;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("location");
		generator.write(this.location);

		if (this.maxNumberOfSnapshots != null) {
			generator.writeKey("max_number_of_snapshots");
			generator.write(this.maxNumberOfSnapshots);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			generator.write(this.readonly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SharedFileSystemRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SharedFileSystemRepositorySettings> {
		private String location;

		@Nullable
		private Integer maxNumberOfSnapshots;

		@Nullable
		private Boolean readonly;

		/**
		 * Required - API name: {@code location}
		 */
		public final Builder location(String value) {
			this.location = value;
			return this;
		}

		/**
		 * API name: {@code max_number_of_snapshots}
		 */
		public final Builder maxNumberOfSnapshots(@Nullable Integer value) {
			this.maxNumberOfSnapshots = value;
			return this;
		}

		/**
		 * API name: {@code readonly}
		 */
		public final Builder readonly(@Nullable Boolean value) {
			this.readonly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SharedFileSystemRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SharedFileSystemRepositorySettings build() {
			_checkSingleUse();

			return new SharedFileSystemRepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SharedFileSystemRepositorySettings}
	 */
	public static final JsonpDeserializer<SharedFileSystemRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					SharedFileSystemRepositorySettings::setupSharedFileSystemRepositorySettingsDeserializer);

	protected static void setupSharedFileSystemRepositorySettingsDeserializer(
			ObjectDeserializer<SharedFileSystemRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::location, JsonpDeserializer.stringDeserializer(), "location");
		op.add(Builder::maxNumberOfSnapshots, JsonpDeserializer.integerDeserializer(), "max_number_of_snapshots");
		op.add(Builder::readonly, JsonpDeserializer.booleanDeserializer(), "readonly");

	}

}
