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

package co.elastic.clients.elasticsearch.ingest;

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

// typedef: ingest._types.DatabaseConfiguration

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.DatabaseConfiguration">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatabaseConfiguration implements JsonpSerializable {
	private final String name;

	private final Maxmind maxmind;

	// ---------------------------------------------------------------------------------------------

	private DatabaseConfiguration(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.maxmind = ApiTypeHelper.requireNonNull(builder.maxmind, this, "maxmind");

	}

	public static DatabaseConfiguration of(Function<Builder, ObjectBuilder<DatabaseConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The provider-assigned name of the IP geolocation database to
	 * download.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The configuration necessary to identify which IP geolocation
	 * provider to use to download the database, as well as any provider-specific
	 * configuration necessary for such downloading. At present, the only supported
	 * provider is maxmind, and the maxmind provider requires that an account_id
	 * (string) is configured.
	 * <p>
	 * API name: {@code maxmind}
	 */
	public final Maxmind maxmind() {
		return this.maxmind;
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

		generator.writeKey("maxmind");
		this.maxmind.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatabaseConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DatabaseConfiguration> {
		private String name;

		private Maxmind maxmind;

		/**
		 * Required - The provider-assigned name of the IP geolocation database to
		 * download.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The configuration necessary to identify which IP geolocation
		 * provider to use to download the database, as well as any provider-specific
		 * configuration necessary for such downloading. At present, the only supported
		 * provider is maxmind, and the maxmind provider requires that an account_id
		 * (string) is configured.
		 * <p>
		 * API name: {@code maxmind}
		 */
		public final Builder maxmind(Maxmind value) {
			this.maxmind = value;
			return this;
		}

		/**
		 * Required - The configuration necessary to identify which IP geolocation
		 * provider to use to download the database, as well as any provider-specific
		 * configuration necessary for such downloading. At present, the only supported
		 * provider is maxmind, and the maxmind provider requires that an account_id
		 * (string) is configured.
		 * <p>
		 * API name: {@code maxmind}
		 */
		public final Builder maxmind(Function<Maxmind.Builder, ObjectBuilder<Maxmind>> fn) {
			return this.maxmind(fn.apply(new Maxmind.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatabaseConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatabaseConfiguration build() {
			_checkSingleUse();

			return new DatabaseConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatabaseConfiguration}
	 */
	public static final JsonpDeserializer<DatabaseConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatabaseConfiguration::setupDatabaseConfigurationDeserializer);

	protected static void setupDatabaseConfigurationDeserializer(ObjectDeserializer<DatabaseConfiguration.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::maxmind, Maxmind._DESERIALIZER, "maxmind");

	}

}
