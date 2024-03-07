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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: snapshot._types.ReadOnlyUrlRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.ReadOnlyUrlRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReadOnlyUrlRepositorySettings extends RepositorySettingsBase {
	@Nullable
	private final Integer httpMaxRetries;

	@Nullable
	private final Time httpSocketTimeout;

	@Nullable
	private final Integer maxNumberOfSnapshots;

	private final String url;

	// ---------------------------------------------------------------------------------------------

	private ReadOnlyUrlRepositorySettings(Builder builder) {
		super(builder);

		this.httpMaxRetries = builder.httpMaxRetries;
		this.httpSocketTimeout = builder.httpSocketTimeout;
		this.maxNumberOfSnapshots = builder.maxNumberOfSnapshots;
		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");

	}

	public static ReadOnlyUrlRepositorySettings of(Function<Builder, ObjectBuilder<ReadOnlyUrlRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code http_max_retries}
	 */
	@Nullable
	public final Integer httpMaxRetries() {
		return this.httpMaxRetries;
	}

	/**
	 * API name: {@code http_socket_timeout}
	 */
	@Nullable
	public final Time httpSocketTimeout() {
		return this.httpSocketTimeout;
	}

	/**
	 * API name: {@code max_number_of_snapshots}
	 */
	@Nullable
	public final Integer maxNumberOfSnapshots() {
		return this.maxNumberOfSnapshots;
	}

	/**
	 * Required - API name: {@code url}
	 */
	public final String url() {
		return this.url;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.httpMaxRetries != null) {
			generator.writeKey("http_max_retries");
			generator.write(this.httpMaxRetries);

		}
		if (this.httpSocketTimeout != null) {
			generator.writeKey("http_socket_timeout");
			this.httpSocketTimeout.serialize(generator, mapper);

		}
		if (this.maxNumberOfSnapshots != null) {
			generator.writeKey("max_number_of_snapshots");
			generator.write(this.maxNumberOfSnapshots);

		}
		generator.writeKey("url");
		generator.write(this.url);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReadOnlyUrlRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ReadOnlyUrlRepositorySettings> {
		@Nullable
		private Integer httpMaxRetries;

		@Nullable
		private Time httpSocketTimeout;

		@Nullable
		private Integer maxNumberOfSnapshots;

		private String url;

		/**
		 * API name: {@code http_max_retries}
		 */
		public final Builder httpMaxRetries(@Nullable Integer value) {
			this.httpMaxRetries = value;
			return this;
		}

		/**
		 * API name: {@code http_socket_timeout}
		 */
		public final Builder httpSocketTimeout(@Nullable Time value) {
			this.httpSocketTimeout = value;
			return this;
		}

		/**
		 * API name: {@code http_socket_timeout}
		 */
		public final Builder httpSocketTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.httpSocketTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code max_number_of_snapshots}
		 */
		public final Builder maxNumberOfSnapshots(@Nullable Integer value) {
			this.maxNumberOfSnapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReadOnlyUrlRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReadOnlyUrlRepositorySettings build() {
			_checkSingleUse();

			return new ReadOnlyUrlRepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReadOnlyUrlRepositorySettings}
	 */
	public static final JsonpDeserializer<ReadOnlyUrlRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ReadOnlyUrlRepositorySettings::setupReadOnlyUrlRepositorySettingsDeserializer);

	protected static void setupReadOnlyUrlRepositorySettingsDeserializer(
			ObjectDeserializer<ReadOnlyUrlRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::httpMaxRetries, JsonpDeserializer.integerDeserializer(), "http_max_retries");
		op.add(Builder::httpSocketTimeout, Time._DESERIALIZER, "http_socket_timeout");
		op.add(Builder::maxNumberOfSnapshots, JsonpDeserializer.integerDeserializer(), "max_number_of_snapshots");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
