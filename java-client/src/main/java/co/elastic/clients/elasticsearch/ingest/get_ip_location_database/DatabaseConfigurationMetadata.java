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

package co.elastic.clients.elasticsearch.ingest.get_ip_location_database;

import co.elastic.clients.elasticsearch.ingest.DatabaseConfigurationFull;
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
import java.lang.Long;
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

// typedef: ingest.get_ip_location_database.DatabaseConfigurationMetadata

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.get_ip_location_database.DatabaseConfigurationMetadata">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatabaseConfigurationMetadata implements JsonpSerializable {
	private final String id;

	private final long version;

	@Nullable
	private final Long modifiedDateMillis;

	@Nullable
	private final Long modifiedDate;

	private final DatabaseConfigurationFull database;

	// ---------------------------------------------------------------------------------------------

	private DatabaseConfigurationMetadata(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version", 0);
		this.modifiedDateMillis = builder.modifiedDateMillis;
		this.modifiedDate = builder.modifiedDate;
		this.database = ApiTypeHelper.requireNonNull(builder.database, this, "database");

	}

	public static DatabaseConfigurationMetadata of(Function<Builder, ObjectBuilder<DatabaseConfigurationMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code modified_date_millis}
	 */
	@Nullable
	public final Long modifiedDateMillis() {
		return this.modifiedDateMillis;
	}

	/**
	 * API name: {@code modified_date}
	 */
	@Nullable
	public final Long modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * Required - API name: {@code database}
	 */
	public final DatabaseConfigurationFull database() {
		return this.database;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.modifiedDateMillis != null) {
			generator.writeKey("modified_date_millis");
			generator.write(this.modifiedDateMillis);

		}
		if (this.modifiedDate != null) {
			generator.writeKey("modified_date");
			generator.write(this.modifiedDate);

		}
		generator.writeKey("database");
		this.database.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatabaseConfigurationMetadata}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DatabaseConfigurationMetadata> {
		private String id;

		private Long version;

		@Nullable
		private Long modifiedDateMillis;

		@Nullable
		private Long modifiedDate;

		private DatabaseConfigurationFull database;

		public Builder() {
		}
		private Builder(DatabaseConfigurationMetadata instance) {
			this.id = instance.id;
			this.version = instance.version;
			this.modifiedDateMillis = instance.modifiedDateMillis;
			this.modifiedDate = instance.modifiedDate;
			this.database = instance.database;

		}
		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code modified_date_millis}
		 */
		public final Builder modifiedDateMillis(@Nullable Long value) {
			this.modifiedDateMillis = value;
			return this;
		}

		/**
		 * API name: {@code modified_date}
		 */
		public final Builder modifiedDate(@Nullable Long value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * Required - API name: {@code database}
		 */
		public final Builder database(DatabaseConfigurationFull value) {
			this.database = value;
			return this;
		}

		/**
		 * Required - API name: {@code database}
		 */
		public final Builder database(
				Function<DatabaseConfigurationFull.Builder, ObjectBuilder<DatabaseConfigurationFull>> fn) {
			return this.database(fn.apply(new DatabaseConfigurationFull.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatabaseConfigurationMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatabaseConfigurationMetadata build() {
			_checkSingleUse();

			return new DatabaseConfigurationMetadata(this);
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
	 * Json deserializer for {@link DatabaseConfigurationMetadata}
	 */
	public static final JsonpDeserializer<DatabaseConfigurationMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatabaseConfigurationMetadata::setupDatabaseConfigurationMetadataDeserializer);

	protected static void setupDatabaseConfigurationMetadataDeserializer(
			ObjectDeserializer<DatabaseConfigurationMetadata.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::modifiedDateMillis, JsonpDeserializer.longDeserializer(), "modified_date_millis");
		op.add(Builder::modifiedDate, JsonpDeserializer.longDeserializer(), "modified_date");
		op.add(Builder::database, DatabaseConfigurationFull._DESERIALIZER, "database");

	}

}
